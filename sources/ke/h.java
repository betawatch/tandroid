package ke;

import java.util.regex.Pattern;
import p2.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h extends pe.a {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final ne.j a = new ne.j();
    public boolean c = false;
    public v d = new v(8, (byte) 0);

    public h(Pattern pattern) {
        this.b = pattern;
    }

    @Override // pe.a
    public final void a(CharSequence charSequence) {
        v vVar = this.d;
        StringBuilder sb = (StringBuilder) vVar.c;
        if (vVar.b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        vVar.b++;
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.c = true;
    }

    @Override // pe.a
    public final void d() {
        this.a.g = ((StringBuilder) this.d.c).toString();
        this.d = null;
    }

    @Override // pe.a
    public final ne.a e() {
        return this.a;
    }

    @Override // pe.a
    public final j4.h h(e eVar) {
        if (this.c) {
            return null;
        }
        if (eVar.h && this.b == null) {
            return null;
        }
        return j4.h.a(eVar.b);
    }
}
