package a3;

import a8.r7;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.ad;
import bi.da;
import bi.k7;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e2.m1;
import h9.g0;
import h9.t1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.b20;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.hy0;
import org.telegram.ui.ya1;
import x2.q1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements g9.k, Continuation, l5.e, h2.j, Vector.TLDeserializer, b20, r1, o6, p6, ft0, u9.d {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0134  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v33, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // g9.k, l5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmap;
        boolean containsKey;
        float f10;
        int i7;
        String str;
        float f11;
        int i10;
        String str2;
        int i11;
        boolean z9;
        String str3;
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) obj;
                q1Var.getClass();
                Bundle bundle = new Bundle();
                String str4 = q1.e;
                t1 t1Var = q1Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(t1Var.d);
                g0 listIterator = t1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((m1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str4, arrayList);
                return bundle;
            case 10:
                bb.e eVar = (bb.e) obj;
                eVar.getClass();
                hy0 hy0Var = ab.w.a;
                hy0Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    hy0Var.q(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 27:
                Bundle bundle2 = (Bundle) obj;
                ?? charSequence2 = bundle2.getCharSequence(g2.b.s);
                int i12 = 1;
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList(g2.b.t);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        int size = parcelableArrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = parcelableArrayList.get(i13);
                            i13++;
                            Bundle bundle3 = (Bundle) obj2;
                            int i14 = bundle3.getInt(g2.e.a);
                            int i15 = bundle3.getInt(g2.e.b);
                            int i16 = bundle3.getInt(g2.e.c);
                            int i17 = bundle3.getInt(g2.e.d, -1);
                            Bundle bundle4 = bundle3.getBundle(g2.e.e);
                            if (i17 == i12) {
                                bundle4.getClass();
                                String string = bundle4.getString(g2.g.c);
                                string.getClass();
                                charSequence2.setSpan(new g2.g(string, bundle4.getInt(g2.g.d)), i14, i15, i16);
                            } else if (i17 == 2) {
                                bundle4.getClass();
                                charSequence2.setSpan(new g2.h(bundle4.getInt(g2.h.d), bundle4.getInt(g2.h.e), bundle4.getInt(g2.h.f)), i14, i15, i16);
                            } else if (i17 == 3) {
                                charSequence2.setSpan(new g2.f(), i14, i15, i16);
                            } else if (i17 == 4) {
                                bundle4.getClass();
                                String string2 = bundle4.getString(g2.i.b);
                                string2.getClass();
                                charSequence2.setSpan(new g2.i(string2), i14, i15, i16);
                            }
                            i12 = 1;
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle2.getSerializable(g2.b.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle2.getSerializable(g2.b.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle2.getParcelable(g2.b.w);
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else {
                    byte[] byteArray = bundle2.getByteArray(g2.b.x);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        String str5 = g2.b.y;
                        containsKey = bundle2.containsKey(str5);
                        int i18 = TLObject.FLAG_31;
                        if (containsKey) {
                            String str6 = g2.b.z;
                            if (bundle2.containsKey(str6)) {
                                f10 = bundle2.getFloat(str5);
                                i7 = bundle2.getInt(str6);
                                String str7 = g2.b.A;
                                int i19 = bundle2.containsKey(str7) ? bundle2.getInt(str7) : Integer.MIN_VALUE;
                                String str8 = g2.b.B;
                                float f12 = bundle2.containsKey(str8) ? bundle2.getFloat(str8) : -3.4028235E38f;
                                String str9 = g2.b.C;
                                int i20 = bundle2.containsKey(str9) ? bundle2.getInt(str9) : Integer.MIN_VALUE;
                                str = g2.b.E;
                                if (bundle2.containsKey(str)) {
                                    String str10 = g2.b.D;
                                    if (bundle2.containsKey(str10)) {
                                        f11 = bundle2.getFloat(str);
                                        i10 = bundle2.getInt(str10);
                                        String str11 = g2.b.F;
                                        float f13 = !bundle2.containsKey(str11) ? bundle2.getFloat(str11) : -3.4028235E38f;
                                        String str12 = g2.b.G;
                                        float f14 = bundle2.containsKey(str12) ? bundle2.getFloat(str12) : -3.4028235E38f;
                                        str2 = g2.b.H;
                                        if (bundle2.containsKey(str2)) {
                                            i11 = -16777216;
                                            z9 = false;
                                        } else {
                                            i11 = bundle2.getInt(str2);
                                            z9 = true;
                                        }
                                        int i21 = i11;
                                        boolean z10 = bundle2.getBoolean(g2.b.I, false) ? false : z9;
                                        str3 = g2.b.J;
                                        if (bundle2.containsKey(str3)) {
                                            i18 = bundle2.getInt(str3);
                                        }
                                        int i22 = i18;
                                        String str13 = g2.b.K;
                                        float f15 = !bundle2.containsKey(str13) ? bundle2.getFloat(str13) : 0.0f;
                                        String str14 = g2.b.L;
                                        return new g2.b(charSequence, alignment2, alignment4, bitmap, f10, i7, i19, f12, i20, i10, f11, f13, f14, z10, i21, i22, f15, bundle2.containsKey(str14) ? bundle2.getInt(str14) : 0);
                                    }
                                }
                                f11 = -3.4028235E38f;
                                i10 = Integer.MIN_VALUE;
                                String str112 = g2.b.F;
                                if (!bundle2.containsKey(str112)) {
                                }
                                String str122 = g2.b.G;
                                float f142 = bundle2.containsKey(str122) ? bundle2.getFloat(str122) : -3.4028235E38f;
                                str2 = g2.b.H;
                                if (bundle2.containsKey(str2)) {
                                }
                                int i212 = i11;
                                if (bundle2.getBoolean(g2.b.I, false)) {
                                }
                                str3 = g2.b.J;
                                if (bundle2.containsKey(str3)) {
                                }
                                int i222 = i18;
                                String str132 = g2.b.K;
                                float f152 = !bundle2.containsKey(str132) ? bundle2.getFloat(str132) : 0.0f;
                                String str142 = g2.b.L;
                                return new g2.b(charSequence, alignment2, alignment4, bitmap, f10, i7, i19, f12, i20, i10, f11, f13, f142, z10, i212, i222, f152, bundle2.containsKey(str142) ? bundle2.getInt(str142) : 0);
                            }
                        }
                        f10 = -3.4028235E38f;
                        i7 = Integer.MIN_VALUE;
                        String str72 = g2.b.A;
                        if (bundle2.containsKey(str72)) {
                        }
                        String str82 = g2.b.B;
                        if (bundle2.containsKey(str82)) {
                        }
                        String str92 = g2.b.C;
                        if (bundle2.containsKey(str92)) {
                        }
                        str = g2.b.E;
                        if (bundle2.containsKey(str)) {
                        }
                        f11 = -3.4028235E38f;
                        i10 = Integer.MIN_VALUE;
                        String str1122 = g2.b.F;
                        if (!bundle2.containsKey(str1122)) {
                        }
                        String str1222 = g2.b.G;
                        float f1422 = bundle2.containsKey(str1222) ? bundle2.getFloat(str1222) : -3.4028235E38f;
                        str2 = g2.b.H;
                        if (bundle2.containsKey(str2)) {
                        }
                        int i2122 = i11;
                        if (bundle2.getBoolean(g2.b.I, false)) {
                        }
                        str3 = g2.b.J;
                        if (bundle2.containsKey(str3)) {
                        }
                        int i2222 = i18;
                        String str1322 = g2.b.K;
                        float f1522 = !bundle2.containsKey(str1322) ? bundle2.getFloat(str1322) : 0.0f;
                        String str1422 = g2.b.L;
                        return new g2.b(charSequence, alignment2, alignment4, bitmap, f10, i7, i19, f12, i20, i10, f11, f13, f1422, z10, i2122, i2222, f1522, bundle2.containsKey(str1422) ? bundle2.getInt(str1422) : 0);
                    }
                    bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                charSequence = null;
                String str52 = g2.b.y;
                containsKey = bundle2.containsKey(str52);
                int i182 = TLObject.FLAG_31;
                if (containsKey) {
                }
                f10 = -3.4028235E38f;
                i7 = Integer.MIN_VALUE;
                String str722 = g2.b.A;
                if (bundle2.containsKey(str722)) {
                }
                String str822 = g2.b.B;
                if (bundle2.containsKey(str822)) {
                }
                String str922 = g2.b.C;
                if (bundle2.containsKey(str922)) {
                }
                str = g2.b.E;
                if (bundle2.containsKey(str)) {
                }
                f11 = -3.4028235E38f;
                i10 = Integer.MIN_VALUE;
                String str11222 = g2.b.F;
                if (!bundle2.containsKey(str11222)) {
                }
                String str12222 = g2.b.G;
                float f14222 = bundle2.containsKey(str12222) ? bundle2.getFloat(str12222) : -3.4028235E38f;
                str2 = g2.b.H;
                if (bundle2.containsKey(str2)) {
                }
                int i21222 = i11;
                if (bundle2.getBoolean(g2.b.I, false)) {
                }
                str3 = g2.b.J;
                if (bundle2.containsKey(str3)) {
                }
                int i22222 = i182;
                String str13222 = g2.b.K;
                float f15222 = !bundle2.containsKey(str13222) ? bundle2.getFloat(str13222) : 0.0f;
                String str14222 = g2.b.L;
                return new g2.b(charSequence, alignment2, alignment4, bitmap, f10, i7, i19, f12, i20, i10, f11, f13, f14222, z10, i21222, i22222, f15222, bundle2.containsKey(str14222) ? bundle2.getInt(str14222) : 0);
            default:
                long j3 = ((c4.a) obj).b;
                if (j3 == -9223372036854775807L) {
                    j3 = 0;
                }
                return Long.valueOf(j3);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void c(int i7, View view) {
        ((da) view).setColor(i7);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i7, z9);
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        Set H = r7Var.H(cb.a.class);
        cb.c cVar = cb.c.c;
        if (cVar == null) {
            synchronized (cb.c.class) {
                try {
                    cVar = cb.c.c;
                    if (cVar == null) {
                        cVar = new cb.c(0);
                        cb.c.c = cVar;
                    }
                } finally {
                }
            }
        }
        return new cb.b(H, cVar);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 22:
                int i10 = k7.s3;
                break;
            default:
                k7.c2(new ya1(6, null));
                break;
        }
    }

    @Override // org.telegram.ui.Components.ft0
    public /* synthetic */ float h(RecyclerView recyclerView) {
        return f1.c(recyclerView);
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int i(View view) {
        return ((da) view).y;
    }

    @Override // org.telegram.ui.Components.ft0
    public RecyclerView l(View view) {
        return ((ad) view).a;
    }

    @Override // org.telegram.ui.Components.ft0
    public /* synthetic */ void s(RecyclerView recyclerView) {
        f1.b(recyclerView);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z9;
        int i7;
        switch (this.a) {
            case 5:
                if (task.isSuccessful()) {
                    aa.b bVar = (aa.b) task.getResult();
                    String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
                    x9.b bVar2 = x9.b.a;
                    bVar2.b(str);
                    File file = bVar.c;
                    z9 = true;
                    if (file.delete()) {
                        bVar2.b("Deleted report file: " + file.getPath());
                    } else {
                        bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 6:
            default:
                i7 = -1;
                break;
            case 7:
                i7 = 403;
                break;
        }
        return Integer.valueOf(i7);
    }

    public /* synthetic */ l(Object obj, int i7) {
        this.a = i7;
    }
}
