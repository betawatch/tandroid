package e4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import d2.b;
import e2.h;
import e2.v;
import e9.i0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import w.f;
import z3.d;
import z3.l;
import z3.m;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a implements m {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final v c = new v();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x007a, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0096, code lost:
    
        if (r22.equals("{\\an9}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a6, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r22.equals("{\\an8}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        if (r22.equals("{\\an2}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005e, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0087, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0065, code lost:
    
        if (r22.equals("{\\an6}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0071, code lost:
    
        if (r22.equals("{\\an4}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0078, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0085, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
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
        int i10;
        int i11;
        float f7;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
        }
        switch (str.hashCode()) {
            case -685620710:
                break;
            case -685620679:
                str.equals("{\\an2}");
                i10 = 1;
                break;
            case -685620648:
                break;
            case -685620617:
                break;
            case -685620586:
                str.equals("{\\an5}");
                i10 = 1;
                break;
            case -685620555:
                break;
            case -685620524:
                break;
            case -685620493:
                str.equals("{\\an8}");
                i10 = 1;
                break;
            case -685620462:
                break;
            default:
                i10 = 1;
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
                i11 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i11 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i11 = 1;
                break;
            case -685620524:
                break;
            case -685620493:
                break;
            case -685620462:
                break;
            default:
                i11 = 1;
                break;
        }
        float f10 = 0.08f;
        if (i10 == 0) {
            f7 = 0.08f;
        } else if (i10 == 1) {
            f7 = 0.5f;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            f7 = 0.92f;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                f10 = 0.5f;
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                f10 = 0.92f;
            }
        }
        float f11 = f7;
        return new b(spanned, null, null, null, f10, 0, i11, f11, i10, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
    }

    public static long b(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    @Override // z3.m
    public final void A(byte[] bArr, int i10, int i11, l lVar, h hVar) {
        String k10;
        String str;
        a aVar = this;
        long j3 = lVar.a;
        v vVar = aVar.c;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        Charset F = vVar.F();
        if (F == null) {
            F = StandardCharsets.UTF_8;
        }
        long j10 = -9223372036854775807L;
        ArrayList arrayList = (j3 == -9223372036854775807L || !lVar.b) ? null : new ArrayList();
        while (true) {
            String k11 = vVar.k(F);
            if (k11 == null) {
                break;
            }
            if (!k11.isEmpty()) {
                try {
                    Integer.parseInt(k11);
                    k10 = vVar.k(F);
                } catch (NumberFormatException unused) {
                    e2.a.n("SubripParser", "Skipping invalid index: ".concat(k11));
                }
                if (k10 == null) {
                    e2.a.n("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(k10);
                if (matcher.matches()) {
                    long b10 = b(matcher, 1);
                    long b11 = b(matcher, 6);
                    StringBuilder sb2 = aVar.a;
                    sb2.setLength(0);
                    ArrayList arrayList2 = aVar.b;
                    arrayList2.clear();
                    String k12 = vVar.k(F);
                    while (!TextUtils.isEmpty(k12)) {
                        long j11 = j10;
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String trim = k12.trim();
                        StringBuilder sb3 = new StringBuilder(trim);
                        Matcher matcher2 = e.matcher(trim);
                        int i12 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i12;
                            int length = group.length();
                            sb3.replace(start, start + length, "");
                            i12 += length;
                            j3 = j3;
                        }
                        sb2.append(sb3.toString());
                        k12 = vVar.k(F);
                        j10 = j11;
                    }
                    long j12 = j3;
                    long j13 = j10;
                    Spanned fromHtml = Html.fromHtml(sb2.toString());
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i13);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (j12 == j13 || b11 >= j12) {
                        hVar.accept(new z3.a(b10, b11 - b10, i0.z(a(fromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new z3.a(b10, b11 - b10, i0.z(a(fromHtml, str))));
                    }
                    aVar = this;
                    j10 = j13;
                    j3 = j12;
                } else {
                    e2.a.n("SubripParser", "Skipping invalid timing: ".concat(k10));
                    aVar = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                hVar.accept((z3.a) obj);
            }
        }
    }

    @Override // z3.m
    public final /* synthetic */ d k(int i10, int i11, byte[] bArr) {
        return f.a(this, bArr, i11);
    }

    @Override // z3.m
    public final int n() {
        return 1;
    }

    @Override // z3.m
    public final /* synthetic */ void reset() {
    }
}
