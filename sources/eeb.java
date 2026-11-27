// default package

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class eeb implements reb {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final ey7 c = new ey7();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (r22.equals("{\\an9}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r22.equals("{\\an8}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        if (r22.equals("{\\an2}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0053, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005a, code lost:
    
        if (r22.equals("{\\an6}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r22.equals("{\\an4}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006c, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0078, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (r22.equals("{\\an9}") != false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m43 a(Spanned spanned, String str) {
        int i;
        int i2;
        float f;
        if (str == null) {
            return new m43(spanned, null, null, null, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
        }
        switch (str.hashCode()) {
            case -685620710:
                break;
            case -685620679:
                str.equals("{\\an2}");
                i = 1;
                break;
            case -685620648:
                break;
            case -685620617:
                break;
            case -685620586:
                str.equals("{\\an5}");
                i = 1;
                break;
            case -685620555:
                break;
            case -685620524:
                break;
            case -685620493:
                str.equals("{\\an8}");
                i = 1;
                break;
            case -685620462:
                break;
            default:
                i = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                break;
            case -685620679:
                break;
            case -685620648:
                break;
            case -685620617:
                str.equals("{\\an4}");
                i2 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i2 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i2 = 1;
                break;
            case -685620524:
                break;
            case -685620493:
                break;
            case -685620462:
                break;
            default:
                i2 = 1;
                break;
        }
        float f2 = 0.92f;
        if (i == 0) {
            f = 0.08f;
        } else if (i == 1) {
            f = 0.5f;
        } else {
            if (i != 2) {
                iy8.d();
                return null;
            }
            f = 0.92f;
        }
        if (i2 == 0) {
            f2 = 0.08f;
        } else if (i2 == 1) {
            f2 = 0.5f;
        } else if (i2 != 2) {
            iy8.d();
            return null;
        }
        return new m43(spanned, null, null, null, f2, 0, i2, f, i, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
    }

    public static long b(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    @Override // reb
    public final /* synthetic */ heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    @Override // reb
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        String n;
        String str;
        eeb eebVar = this;
        long j = qebVar.a;
        ey7 ey7Var = eebVar.c;
        ey7Var.L(i + i2, bArr);
        ey7Var.N(i);
        Charset J = ey7Var.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !qebVar.b) ? null : new ArrayList();
        while (true) {
            String n2 = ey7Var.n(J);
            if (n2 == null) {
                break;
            }
            if (!n2.isEmpty()) {
                try {
                    Integer.parseInt(n2);
                    n = ey7Var.n(J);
                } catch (NumberFormatException unused) {
                    efd.f("SubripParser", "Skipping invalid index: ".concat(n2));
                }
                if (n == null) {
                    efd.f("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(n);
                if (matcher.matches()) {
                    long b = b(matcher, 1);
                    long b2 = b(matcher, 6);
                    StringBuilder sb = eebVar.a;
                    sb.setLength(0);
                    long j3 = j2;
                    ArrayList arrayList2 = eebVar.b;
                    arrayList2.clear();
                    for (String n3 = ey7Var.n(J); !TextUtils.isEmpty(n3); n3 = ey7Var.n(J)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = n3.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = e.matcher(trim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i3;
                            int length = group.length();
                            sb2.replace(start, start + length, "");
                            i3 += length;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned fromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j4 == j3 || b2 >= j4) {
                        ot2Var.accept(new p43(b, b2 - b, po5.u(a(fromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new p43(b, b2 - b, po5.u(a(fromHtml, str))));
                    }
                    eebVar = this;
                    j2 = j3;
                    j = j4;
                } else {
                    efd.f("SubripParser", "Skipping invalid timing: ".concat(n));
                    eebVar = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                ot2Var.accept((p43) obj);
            }
        }
    }

    @Override // reb
    public final int s() {
        return 1;
    }

    @Override // reb
    public final void reset() {
    }
}
