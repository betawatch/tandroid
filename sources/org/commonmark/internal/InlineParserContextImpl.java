package org.commonmark.internal;

import java.util.List;
import java.util.Map;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.parser.InlineParserContext;

/* loaded from: classes3.dex */
public class InlineParserContextImpl implements InlineParserContext {
    private final List delimiterProcessors;
    private final Map linkReferenceDefinitions;

    public InlineParserContextImpl(List list, Map map) {
        this.delimiterProcessors = list;
        this.linkReferenceDefinitions = map;
    }

    @Override // org.commonmark.parser.InlineParserContext
    public List getCustomDelimiterProcessors() {
        return this.delimiterProcessors;
    }

    @Override // org.commonmark.parser.InlineParserContext
    public LinkReferenceDefinition getLinkReferenceDefinition(String str) {
        return (LinkReferenceDefinition) this.linkReferenceDefinitions.get(str);
    }
}
