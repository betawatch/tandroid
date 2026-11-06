package h4;

import a8.p0;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c4.d;
import c4.l;
import c4.m;
import g2.b;
import h2.j;
import h2.x;
import h9.i0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a implements m {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final x c = new x();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        if (r22.equals("{\\an9}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r22.equals("{\\an8}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        if (r22.equals("{\\an2}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0054, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007d, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        if (r22.equals("{\\an6}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0067, code lost:
    
        if (r22.equals("{\\an4}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006e, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007b, code lost:
    
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
    public static b a(Spanned spanned, String str) {
        int i7;
        int i10;
        float f10;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
        }
        switch (str.hashCode()) {
            case -685620710:
                break;
            case -685620679:
                str.equals("{\\an2}");
                i7 = 1;
                break;
            case -685620648:
                break;
            case -685620617:
                break;
            case -685620586:
                str.equals("{\\an5}");
                i7 = 1;
                break;
            case -685620555:
                break;
            case -685620524:
                break;
            case -685620493:
                str.equals("{\\an8}");
                i7 = 1;
                break;
            case -685620462:
                break;
            default:
                i7 = 1;
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
                i10 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i10 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i10 = 1;
                break;
            case -685620524:
                break;
            case -685620493:
                break;
            case -685620462:
                break;
            default:
                i10 = 1;
                break;
        }
        float f11 = 0.08f;
        if (i7 == 0) {
            f10 = 0.08f;
        } else if (i7 == 1) {
            f10 = 0.5f;
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException();
            }
            f10 = 0.92f;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                f11 = 0.5f;
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                f11 = 0.92f;
            }
        }
        return new b(spanned, null, null, null, f11, 0, i10, f10, i7, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
    }

    public static long b(Matcher matcher, int i7) {
        String group = matcher.group(i7 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i7 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i7 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i7 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    @Override // c4.m
    public final int P() {
        return 1;
    }

    @Override // c4.m
    public final /* synthetic */ d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override // c4.m
    public final void z(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        String n10;
        String str;
        a aVar = this;
        long j3 = lVar.a;
        x xVar = aVar.c;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        Charset J = xVar.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        long j10 = -9223372036854775807L;
        ArrayList arrayList = (j3 == -9223372036854775807L || !lVar.b) ? null : new ArrayList();
        while (true) {
            String n11 = xVar.n(J);
            if (n11 == null) {
                break;
            }
            if (!n11.isEmpty()) {
                try {
                    Integer.parseInt(n11);
                    n10 = xVar.n(J);
                } catch (NumberFormatException unused) {
                    h2.a.l("SubripParser", "Skipping invalid index: ".concat(n11));
                }
                if (n10 == null) {
                    h2.a.l("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(n10);
                if (matcher.matches()) {
                    long b10 = b(matcher, 1);
                    long b11 = b(matcher, 6);
                    StringBuilder sb2 = aVar.a;
                    sb2.setLength(0);
                    long j11 = j10;
                    ArrayList arrayList2 = aVar.b;
                    arrayList2.clear();
                    for (String n12 = xVar.n(J); !TextUtils.isEmpty(n12); n12 = xVar.n(J)) {
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String trim = n12.trim();
                        StringBuilder sb3 = new StringBuilder(trim);
                        Matcher matcher2 = e.matcher(trim);
                        int i11 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i11;
                            int length = group.length();
                            sb3.replace(start, start + length, "");
                            i11 += length;
                            j3 = j3;
                        }
                        sb2.append(sb3.toString());
                    }
                    long j12 = j3;
                    Spanned fromHtml = Html.fromHtml(sb2.toString());
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i12);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (j12 == j11 || b11 >= j12) {
                        jVar.accept(new c4.a(b10, b11 - b10, i0.u(a(fromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new c4.a(b10, b11 - b10, i0.u(a(fromHtml, str))));
                    }
                    aVar = this;
                    j10 = j11;
                    j3 = j12;
                } else {
                    h2.a.l("SubripParser", "Skipping invalid timing: ".concat(n10));
                    aVar = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                jVar.accept((c4.a) obj);
            }
        }
    }

    @Override // c4.m
    public final /* synthetic */ void reset() {
    }
}
