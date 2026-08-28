package ff;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m implements Html.TagHandler, ContentHandler {
    public final d7.u a;
    public ContentHandler b;
    public Editable c;
    public final ArrayDeque d = new ArrayDeque();

    public m(d7.u uVar) {
        this.a = uVar;
    }

    public static String a(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(attributes.getLocalName(i9))) {
                return attributes.getValue(i9);
            }
        }
        return null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i9, int i10) {
        this.b.characters(cArr, i9, i10);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() {
        this.b.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.b.endElement(str, str2, str3);
        }
        Editable editable = this.c;
        this.a.getClass();
        d7.u.j2(false, str2, editable, null);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) {
        this.b.endPrefixMapping(str);
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.b == null) {
            this.c = editable;
            this.b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i9, int i10) {
        this.b.ignorableWhitespace(cArr, i9, i10);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        this.b.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.b.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) {
        this.b.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() {
        this.b.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.c;
        this.a.getClass();
        boolean j22 = d7.u.j2(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(j22));
        if (j22) {
            return;
        }
        this.b.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) {
        this.b.startPrefixMapping(str, str2);
    }
}
