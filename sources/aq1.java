// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class aq1 {
    public static int A(int i, int i2, Drawable drawable) {
        return i2 - (drawable.getIntrinsicWidth() / i);
    }

    public static boolean a(k47 k47Var) {
        return k47Var != null && k47.B0(k47Var.k) == 1271266957;
    }

    public static ls2 b() {
        return new ls2();
    }

    public static os2 c() {
        os2 os2Var = new os2();
        os2Var.e = -1.7976931348623157E308d;
        os2Var.f = Double.MAX_VALUE;
        return os2Var;
    }

    public static rs2 d() {
        return new rs2();
    }

    public static float e(float f, float f2, float f3) {
        return (gm.N(f) * f2) + f3;
    }

    public static float f(float f, float f2, float f3, float f4) {
        return Math.max(f4, (f - f2) / f3);
    }

    public static float g(float f, float f2, float f3, float f4, float f5) {
        return (((f * f2) + f3) * f4) + f5;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) + i4;
    }

    public static int i(int i, int i2, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i) + i2;
    }

    public static aoa j(float f, float f2, float f3) {
        aoa aoaVar = new aoa(f);
        aoaVar.b(f2);
        aoaVar.a(f3);
        return aoaVar;
    }

    public static SharedPreferences k(StringBuilder sb, int i, Context context, int i2) {
        sb.append(i);
        return context.getSharedPreferences(sb.toString(), i2);
    }

    public static Integer l(int i, ArrayList arrayList, int i2, ArrayList arrayList2, int i3) {
        arrayList.add(jb6.M0(i, null));
        arrayList2.add(Integer.valueOf(i2));
        return Integer.valueOf(i3);
    }

    public static Object m(int i, List list) {
        return list.get(list.size() - i);
    }

    public static String n(int i, String str) {
        return i + str;
    }

    public static void o(int i, String str, ArrayList arrayList) {
        arrayList.add(c6c.u(jb6.M0(i, str)));
    }

    public static void p(int i, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(jb6.M0(i, null));
        arrayList2.add(num);
    }

    public static void q(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void r(xvc xvcVar) {
        pa9.a().getClass();
        pa9.b(xvcVar);
    }

    public static void s(String str, String str2, String str3) {
        ncd.f(str3, str + str2);
    }

    public static boolean t(String str) {
        return new File(str).exists();
    }

    public static /* synthetic */ boolean u(TLRPC.TL_game tL_game) {
        return tL_game != null;
    }

    public static float v(float f, float f2, float f3, float f4) {
        return f4 - ((f * f2) * f3);
    }

    public static int w(int i, int i2, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i) + i2;
    }

    public static float x(float f, float f2, float f3, float f4) {
        return Math.max(f4, f3 - (f / f2));
    }

    public static int y(int i, int i2, Drawable drawable) {
        return i2 - (drawable.getIntrinsicHeight() / i);
    }

    public static float z(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }
}
