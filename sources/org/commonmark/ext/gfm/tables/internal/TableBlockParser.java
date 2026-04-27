package org.commonmark.ext.gfm.tables.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.node.Block;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

/* loaded from: classes3.dex */
public class TableBlockParser extends AbstractBlockParser {
    private final TableBlock block;
    private final List bodyLines;
    private final List columns;
    private final List headerCells;
    private boolean nextIsSeparatorLine;

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public boolean canHaveLazyContinuationLines() {
        return true;
    }

    private TableBlockParser(List list, List list2) {
        this.block = new TableBlock();
        this.bodyLines = new ArrayList();
        this.nextIsSeparatorLine = true;
        this.columns = list;
        this.headerCells = list2;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public Block getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public BlockContinue tryContinue(ParserState parserState) {
        if (parserState.getLine().toString().contains("|")) {
            return BlockContinue.atIndex(parserState.getIndex());
        }
        return BlockContinue.none();
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public void addLine(CharSequence charSequence) {
        if (this.nextIsSeparatorLine) {
            this.nextIsSeparatorLine = false;
        } else {
            this.bodyLines.add(charSequence);
        }
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public void parseInlines(InlineParser inlineParser) {
        int size = this.headerCells.size();
        TableHead tableHead = new TableHead();
        this.block.appendChild(tableHead);
        TableRow tableRow = new TableRow();
        tableHead.appendChild(tableRow);
        for (int i = 0; i < size; i++) {
            TableCell parseCell = parseCell((String) this.headerCells.get(i), i, inlineParser);
            parseCell.setHeader(true);
            tableRow.appendChild(parseCell);
        }
        Iterator it = this.bodyLines.iterator();
        TableBody tableBody = null;
        while (it.hasNext()) {
            List split = split((CharSequence) it.next());
            TableRow tableRow2 = new TableRow();
            int i2 = 0;
            while (i2 < size) {
                tableRow2.appendChild(parseCell(i2 < split.size() ? (String) split.get(i2) : "", i2, inlineParser));
                i2++;
            }
            if (tableBody == null) {
                tableBody = new TableBody();
                this.block.appendChild(tableBody);
            }
            tableBody.appendChild(tableRow2);
        }
    }

    private TableCell parseCell(String str, int i, InlineParser inlineParser) {
        TableCell tableCell = new TableCell();
        if (i < this.columns.size()) {
            tableCell.setAlignment((TableCell.Alignment) this.columns.get(i));
        }
        inlineParser.parse(str.trim(), tableCell);
        return tableCell;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List split(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.startsWith("|")) {
            trim = trim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < trim.length()) {
            char charAt = trim.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (i2 < trim.length() && trim.charAt(i2) == '|') {
                    sb.append('|');
                    i = i2;
                } else {
                    sb.append('\\');
                }
            } else if (charAt == '|') {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(charAt);
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List parseSeparator(CharSequence charSequence) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = 0;
            while (i < charSequence.length()) {
                char charAt = charSequence.charAt(i);
                if (charAt == '\t' || charAt == ' ') {
                    i++;
                } else {
                    boolean z3 = true;
                    if (charAt == '-' || charAt == ':') {
                        if (i2 == 0 && !arrayList.isEmpty()) {
                            return null;
                        }
                        if (charAt == ':') {
                            i++;
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z4 = false;
                        while (i < charSequence.length() && charSequence.charAt(i) == '-') {
                            i++;
                            z4 = true;
                        }
                        if (!z4) {
                            return null;
                        }
                        if (i >= charSequence.length() || charSequence.charAt(i) != ':') {
                            z3 = false;
                        } else {
                            i++;
                        }
                        arrayList.add(getAlignment(z, z3));
                    } else {
                        if (charAt != '|') {
                            return null;
                        }
                        i++;
                        i2++;
                        if (i2 > 1) {
                            return null;
                        }
                        z2 = true;
                    }
                }
            }
            if (z2) {
                return arrayList;
            }
            return null;
        }
    }

    private static TableCell.Alignment getAlignment(boolean z, boolean z2) {
        if (z && z2) {
            return TableCell.Alignment.CENTER;
        }
        if (z) {
            return TableCell.Alignment.LEFT;
        }
        if (z2) {
            return TableCell.Alignment.RIGHT;
        }
        return null;
    }

    public static class Factory extends AbstractBlockParserFactory {
        @Override // org.commonmark.parser.block.BlockParserFactory
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            List parseSeparator;
            CharSequence line = parserState.getLine();
            CharSequence paragraphContent = matchedBlockParser.getParagraphContent();
            if (paragraphContent != null && paragraphContent.toString().contains("|") && !paragraphContent.toString().contains("\n") && (parseSeparator = TableBlockParser.parseSeparator(line.subSequence(parserState.getIndex(), line.length()))) != null && !parseSeparator.isEmpty()) {
                List split = TableBlockParser.split(paragraphContent);
                if (parseSeparator.size() >= split.size()) {
                    return BlockStart.of(new TableBlockParser(parseSeparator, split)).atIndex(parserState.getIndex()).replaceActiveBlockParser();
                }
            }
            return BlockStart.none();
        }
    }
}
