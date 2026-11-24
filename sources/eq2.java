// default package

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class eq2 implements xp2, uab, lt8 {
    public static final cq2 n = new cq2((byte) 0);
    public static final byte[] r = {0, 7, 8, 15};
    public static final byte[] s = {0, 119, -120, -1};
    public static final byte[] w = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public eq2(Executor executor, ArrayList arrayList, ArrayList arrayList2, bq2 bq2Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        b44 b44Var = new b44(executor);
        this.e = b44Var;
        this.h = bq2Var;
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        Object[] objArr = 0;
        arrayList3.add(mp2.c(b44Var, b44.class, hab.class, tu8.class));
        arrayList3.add(mp2.c(this, eq2.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            mp2 mp2Var = (mp2) obj;
            if (mp2Var != null) {
                arrayList3.add(mp2Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((mt8) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((bq2) this.h).f(componentRegistrar));
                        it.remove();
                    }
                } catch (aq5 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((mp2) it2.next()).b.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj3 = array[i4];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj3.toString());
                        }
                        i4++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                hbe.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                hbe.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                mp2 mp2Var2 = (mp2) obj4;
                ((HashMap) this.a).put(mp2Var2, new e06(new dq2(this, mp2Var2, objArr == true ? 1 : 0)));
            }
            arrayList5.addAll(v(arrayList3));
            arrayList5.addAll(w());
            u();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            h((HashMap) this.a, bool.booleanValue());
        }
    }

    public static byte[] b(int i, int i2, qd1 qd1Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) qd1Var.f(i2);
        }
        return bArr;
    }

    public static int[] j() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m(kk7.d4, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = i & 1;
                int i3 = kk7.K1;
                int i4 = i2 != 0 ? 127 : 0;
                int i5 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i3 = 0;
                }
                iArr[i] = m(kk7.d4, i4, i5, i3);
            }
        }
        return iArr;
    }

    public static int[] k() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = kk7.d4;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = m(63, i4, i5, i3);
            } else {
                int i6 = i2 & kk7.R1;
                int i7 = kk7.z2;
                if (i6 == 0) {
                    int i8 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i9 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = m(kk7.d4, i8, i9, i + i7);
                } else if (i6 == 8) {
                    int i10 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i11 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = m(kk7.K1, i10, i11, i + i7);
                } else if (i6 == 128) {
                    iArr[i2] = m(kk7.d4, ((i2 & 1) != 0 ? 43 : 0) + kk7.K1 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + kk7.K1 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + kk7.K1 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i2] = m(kk7.d4, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int m(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static void q(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int i5;
        int f;
        int i6;
        byte[] bArr2;
        boolean z2;
        int i7;
        int f2;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        boolean z4;
        int f3;
        int i12;
        Paint paint2 = paint;
        qd1 qd1Var = new qd1(bArr.length, bArr);
        int i13 = i2;
        int i14 = i3;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (qd1Var.b() != 0) {
            int i15 = 8;
            int f4 = qd1Var.f(8);
            if (f4 != 240) {
                int i16 = 3;
                int i17 = 2;
                int i18 = 4;
                switch (f4) {
                    case 16:
                        byte[] bArr6 = i == 3 ? bArr3 == null ? s : bArr3 : i == 2 ? bArr5 == null ? r : bArr5 : null;
                        boolean z5 = false;
                        while (true) {
                            int f5 = qd1Var.f(2);
                            if (f5 != 0) {
                                z = z5;
                                i4 = f5;
                                i5 = 1;
                            } else {
                                if (qd1Var.e()) {
                                    f = qd1Var.f(3) + 3;
                                    z = z5;
                                    i4 = qd1Var.f(2);
                                } else {
                                    if (qd1Var.e()) {
                                        z = z5;
                                        i5 = 1;
                                    } else {
                                        int f6 = qd1Var.f(2);
                                        if (f6 == 0) {
                                            z = true;
                                        } else if (f6 == 1) {
                                            z = z5;
                                            i5 = 2;
                                        } else if (f6 == 2) {
                                            i5 = qd1Var.f(4) + 12;
                                            i4 = qd1Var.f(2);
                                            z = z5;
                                        } else if (f6 != 3) {
                                            z = z5;
                                        } else {
                                            f = qd1Var.f(8) + 29;
                                            i4 = qd1Var.f(2);
                                            z = z5;
                                        }
                                        i4 = 0;
                                        i5 = 0;
                                    }
                                    i4 = 0;
                                }
                                i5 = f;
                            }
                            if (i5 == 0 || paint2 == null) {
                                i6 = i13;
                            } else {
                                if (bArr6 != 0) {
                                    i4 = bArr6[i4];
                                }
                                paint2.setColor(iArr[i4]);
                                i6 = i13;
                                canvas.drawRect(i13, i14, i13 + i5, i14 + 1, paint2);
                            }
                            i13 = i6 + i5;
                            if (z) {
                                qd1Var.c();
                                break;
                            } else {
                                paint2 = paint;
                                z5 = z;
                            }
                        }
                    case 17:
                        if (i == 3) {
                            bArr2 = bArr4 == null ? w : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z6 = false;
                        while (true) {
                            int f7 = qd1Var.f(i18);
                            if (f7 != 0) {
                                z2 = z6;
                                i8 = f7;
                                i7 = 1;
                            } else if (qd1Var.e()) {
                                if (qd1Var.e()) {
                                    int f8 = qd1Var.f(i17);
                                    if (f8 == 0) {
                                        z2 = z6;
                                        i7 = 1;
                                    } else if (f8 != 1) {
                                        if (f8 == i17) {
                                            i7 = qd1Var.f(i18) + 9;
                                            f2 = qd1Var.f(i18);
                                        } else if (f8 != i16) {
                                            z2 = z6;
                                            i7 = 0;
                                        } else {
                                            i7 = qd1Var.f(i15) + 25;
                                            f2 = qd1Var.f(i18);
                                        }
                                        i8 = f2;
                                    } else {
                                        z2 = z6;
                                        i7 = i17;
                                    }
                                    i8 = 0;
                                } else {
                                    i7 = qd1Var.f(i17) + 4;
                                    i8 = qd1Var.f(i18);
                                }
                                z2 = z6;
                            } else {
                                int f9 = qd1Var.f(i16);
                                if (f9 != 0) {
                                    i7 = f9 + 2;
                                    z2 = z6;
                                    i8 = 0;
                                } else {
                                    z2 = true;
                                    i7 = 0;
                                    i8 = 0;
                                }
                            }
                            if (i7 == 0 || paint2 == null) {
                                i9 = i13;
                                i10 = i16;
                                i11 = i17;
                            } else {
                                if (bArr2 != 0) {
                                    i8 = bArr2[i8];
                                }
                                paint2.setColor(iArr[i8]);
                                i10 = i16;
                                i11 = 2;
                                i9 = i13;
                                canvas.drawRect(i13, i14, i13 + i7, i14 + 1, paint2);
                            }
                            i13 = i9 + i7;
                            if (z2) {
                                qd1Var.c();
                                break;
                            } else {
                                z6 = z2;
                                i16 = i10;
                                i17 = i11;
                                i18 = 4;
                                i15 = 8;
                            }
                        }
                    case 18:
                        while (true) {
                            int f10 = qd1Var.f(8);
                            if (f10 != 0) {
                                z4 = z3;
                                f3 = 1;
                            } else if (qd1Var.e()) {
                                z4 = z3;
                                f3 = qd1Var.f(7);
                                f10 = qd1Var.f(8);
                            } else {
                                int f11 = qd1Var.f(7);
                                if (f11 != 0) {
                                    z4 = z3;
                                    f3 = f11;
                                    f10 = 0;
                                } else {
                                    z4 = true;
                                    f10 = 0;
                                    f3 = 0;
                                }
                            }
                            if (f3 == 0 || paint2 == null) {
                                i12 = i13;
                            } else {
                                paint2.setColor(iArr[f10]);
                                i12 = i13;
                                canvas.drawRect(i13, i14, i13 + f3, i14 + 1, paint2);
                            }
                            i13 = i12 + f3;
                            z3 = z4 ? false : z4;
                        }
                        break;
                    default:
                        switch (f4) {
                            case 32:
                                bArr5 = b(4, 4, qd1Var);
                                break;
                            case 33:
                                bArr3 = b(4, 8, qd1Var);
                                break;
                            case 34:
                                bArr4 = b(16, 8, qd1Var);
                                break;
                        }
                }
            } else {
                i14 += 2;
                i13 = i2;
            }
            paint2 = paint;
        }
    }

    public static or3 r(qd1 qd1Var, int i) {
        int f;
        int i2;
        int f2;
        int i3;
        int i4;
        int i5 = 8;
        int f3 = qd1Var.f(8);
        qd1Var.n(8);
        int i6 = 2;
        int i7 = i - 2;
        int i8 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] j = j();
        int[] k = k();
        while (i7 > 0) {
            int f4 = qd1Var.f(i5);
            int f5 = qd1Var.f(i5);
            int[] iArr2 = (f5 & 128) != 0 ? iArr : (f5 & 64) != 0 ? j : k;
            if ((f5 & 1) != 0) {
                i3 = qd1Var.f(i5);
                i4 = qd1Var.f(i5);
                f = qd1Var.f(i5);
                f2 = qd1Var.f(i5);
                i2 = i7 - 6;
            } else {
                int f6 = qd1Var.f(6) << i6;
                int f7 = qd1Var.f(4) << 4;
                f = qd1Var.f(4) << 4;
                i2 = i7 - 4;
                f2 = qd1Var.f(i6) << 6;
                i3 = f6;
                i4 = f7;
            }
            if (i3 == 0) {
                i4 = i8;
                f = i4;
                f2 = 255;
            }
            double d = i3;
            double d2 = i4 - 128;
            double d3 = f - 128;
            iArr2[f4] = m((byte) (255 - (f2 & kk7.d4)), g8c.i((int) ((1.402d * d2) + d), 0, kk7.d4), g8c.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, kk7.d4), g8c.i((int) ((d3 * 1.772d) + d), 0, kk7.d4));
            i7 = i2;
            i8 = 0;
            f3 = f3;
            k = k;
            i5 = 8;
            i6 = 2;
        }
        return new or3(f3, iArr, j, k);
    }

    public static qr3 s(qd1 qd1Var) {
        byte[] bArr;
        int f = qd1Var.f(16);
        qd1Var.n(4);
        int f2 = qd1Var.f(2);
        boolean e = qd1Var.e();
        qd1Var.n(1);
        byte[] bArr2 = g8c.b;
        if (f2 == 1) {
            qd1Var.n(qd1Var.f(8) << 4);
        } else if (f2 == 0) {
            int f3 = qd1Var.f(16);
            int f4 = qd1Var.f(16);
            if (f3 > 0) {
                bArr2 = new byte[f3];
                qd1Var.i(f3, bArr2);
            }
            if (f4 > 0) {
                bArr = new byte[f4];
                qd1Var.i(f4, bArr);
                return new qr3(f, e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new qr3(f, e, bArr2, bArr);
    }

    public static void y(FrameLayout frameLayout) {
        cy4 cy4Var = cy4.e;
        Context context = frameLayout.getContext();
        int c = cy4Var.c(context, dy4.a);
        String b = p2d.b(context, c);
        String c2 = p2d.c(context, c);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        Intent a = cy4Var.a(c, context, null);
        if (a != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c2);
            linearLayout.addView(button);
            button.setOnClickListener(new fc3(context, a));
        }
    }

    public final void A(d2d d2dVar) {
        if (((vk9) this.a) != null) {
            d2dVar.b();
            return;
        }
        LinkedList linkedList = (LinkedList) this.b;
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.b = linkedList;
        }
        linkedList.add(d2dVar);
        ln8 ln8Var = (ln8) this.c;
        this.f = ln8Var;
        ArrayList arrayList = (ArrayList) this.h;
        Context context = (Context) this.e;
        if (ln8Var == null || ((vk9) this.a) != null) {
            return;
        }
        try {
            synchronized (pi6.class) {
                pi6.a(context);
            }
            kwe a0 = u0f.a(context).a0(new bo7(context));
            if (a0 != null) {
                ((ln8) this.f).F(new vk9((st) this.d, a0));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((vk9) this.a).r((vy4) obj);
                }
                arrayList.clear();
            }
        } catch (RemoteException e) {
            fvc.g(e);
        } catch (xy4 unused) {
        }
    }

    @Override // xp2
    public final Object a(Class cls) {
        return i(xw8.a(cls));
    }

    @Override // xp2
    public final Set c(xw8 xw8Var) {
        mt8 mt8Var;
        synchronized (this) {
            mt8Var = (g06) ((HashMap) this.c).get(xw8Var);
            if (mt8Var == null) {
                mt8Var = n;
            }
        }
        return (Set) mt8Var.get();
    }

    @Override // xp2
    public final mt8 d(Class cls) {
        return g(xw8.a(cls));
    }

    @Override // xp2
    public final vq7 e(xw8 xw8Var) {
        mt8 g = g(xw8Var);
        return g == null ? new vq7(vq7.c, vq7.d) : g instanceof vq7 ? (vq7) g : new vq7(null, g);
    }

    @Override // uab
    public final /* synthetic */ kab f(int i, int i2, byte[] bArr) {
        return de9.c(this, bArr, i2);
    }

    @Override // xp2
    public final synchronized mt8 g(xw8 xw8Var) {
        hre.a(xw8Var, "Null interface requested.");
        return (mt8) ((HashMap) this.b).get(xw8Var);
    }

    @Override // lt8
    public final Object get() {
        Context context = (Context) ((pj4) this.a).b;
        md7 md7Var = (md7) ((lt8) this.b).get();
        lo9 lo9Var = (lo9) ((lt8) this.c).get();
        xl3 xl3Var = (xl3) ((vk9) this.d).get();
        Executor executor = (Executor) ((lt8) this.e).get();
        lo9 lo9Var2 = (lo9) ((lt8) this.f).get();
        ie7 ie7Var = new ie7((byte) 29);
        i2f i2fVar = new i2f((byte) 28);
        lo9 lo9Var3 = (lo9) ((lt8) this.h).get();
        z90 z90Var = new z90();
        z90Var.a = context;
        z90Var.b = md7Var;
        z90Var.c = lo9Var;
        z90Var.d = xl3Var;
        z90Var.e = executor;
        z90Var.f = lo9Var2;
        z90Var.g = ie7Var;
        z90Var.h = i2fVar;
        z90Var.i = lo9Var3;
        return z90Var;
    }

    public final void h(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            mp2 mp2Var = (mp2) entry.getKey();
            mt8 mt8Var = (mt8) entry.getValue();
            byte b = mp2Var.d;
            if (b == 1 || (b == 2 && z)) {
                mt8Var.get();
            }
        }
        b44 b44Var = (b44) this.e;
        synchronized (b44Var) {
            arrayDeque = b44Var.b;
            if (arrayDeque != null) {
                b44Var.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw ls6.l(it);
            }
        }
    }

    @Override // xp2
    public final Object i(xw8 xw8Var) {
        mt8 g = g(xw8Var);
        if (g == null) {
            return null;
        }
        return g.get();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // uab
    public final void l(byte[] bArr, int i, int i2, tab tabVar, us2 us2Var) {
        x33 x33Var;
        SparseArray sparseArray;
        int i3;
        int i4;
        ArrayList arrayList;
        Paint paint;
        int i5;
        SparseArray sparseArray2;
        int i6;
        sr3 sr3Var;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int[] iArr2;
        SparseArray sparseArray3;
        int i10;
        Paint paint2;
        int i11;
        sr3 sr3Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        eq2 eq2Var = this;
        qd1 qd1Var = new qd1(i + i2, bArr);
        qd1Var.l(i);
        Paint paint3 = (Paint) eq2Var.b;
        Canvas canvas = (Canvas) eq2Var.c;
        ur3 ur3Var = (ur3) eq2Var.f;
        SparseArray sparseArray4 = ur3Var.f;
        SparseArray sparseArray5 = ur3Var.g;
        int i16 = ur3Var.b;
        SparseArray sparseArray6 = ur3Var.c;
        SparseArray sparseArray7 = ur3Var.d;
        SparseArray sparseArray8 = ur3Var.e;
        int i17 = ur3Var.a;
        while (qd1Var.b() >= 48 && qd1Var.f(8) == 15) {
            int f = qd1Var.f(8);
            int f2 = qd1Var.f(16);
            int f3 = qd1Var.f(16);
            int d = qd1Var.d() + f3;
            if ((f3 << 3) > qd1Var.b()) {
                lad.f("DvbParser", "Data field length exceeds limit");
                qd1Var.n(qd1Var.b());
                sparseArray3 = sparseArray5;
                i10 = i16;
                paint2 = paint3;
                i11 = i17;
            } else {
                switch (f) {
                    case 16:
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        if (f2 == i17) {
                            rj0 rj0Var = ur3Var.i;
                            int i18 = 8;
                            qd1Var.f(8);
                            int f4 = qd1Var.f(4);
                            int f5 = qd1Var.f(2);
                            qd1Var.n(2);
                            int i19 = f3 - 2;
                            SparseArray sparseArray9 = new SparseArray();
                            while (i19 > 0) {
                                int f6 = qd1Var.f(i18);
                                qd1Var.n(i18);
                                sparseArray9.put(f6, new rr3(qd1Var.f(16), qd1Var.f(16)));
                                i17 = i17;
                                i19 -= 6;
                                i18 = 8;
                            }
                            i11 = i17;
                            rj0 rj0Var2 = new rj0(f4, f5, sparseArray9);
                            if (f5 != 0) {
                                ur3Var.i = rj0Var2;
                                sparseArray6.clear();
                                sparseArray7.clear();
                                sparseArray8.clear();
                                break;
                            } else if (rj0Var != null && rj0Var.b != f4) {
                                ur3Var.i = rj0Var2;
                                break;
                            }
                        }
                        i11 = i17;
                        break;
                    case 17:
                        rj0 rj0Var3 = ur3Var.i;
                        if (f2 == i17 && rj0Var3 != null) {
                            int f7 = qd1Var.f(8);
                            qd1Var.n(4);
                            boolean e = qd1Var.e();
                            qd1Var.n(3);
                            int f8 = qd1Var.f(16);
                            int f9 = qd1Var.f(16);
                            qd1Var.f(3);
                            int f10 = qd1Var.f(3);
                            int i20 = 2;
                            qd1Var.n(2);
                            int f11 = qd1Var.f(8);
                            int f12 = qd1Var.f(8);
                            int f13 = qd1Var.f(4);
                            int f14 = qd1Var.f(2);
                            qd1Var.n(2);
                            int i21 = f3 - 10;
                            SparseArray sparseArray10 = new SparseArray();
                            while (i21 > 0) {
                                int i22 = i16;
                                int i23 = i21;
                                int f15 = qd1Var.f(16);
                                int f16 = qd1Var.f(i20);
                                qd1Var.f(i20);
                                Paint paint4 = paint3;
                                int f17 = qd1Var.f(12);
                                SparseArray sparseArray11 = sparseArray5;
                                qd1Var.n(4);
                                int f18 = qd1Var.f(12);
                                int i24 = i23 - 6;
                                if (f16 == 1 || f16 == 2) {
                                    qd1Var.f(8);
                                    qd1Var.f(8);
                                    i24 = i23 - 8;
                                }
                                sparseArray10.put(f15, new tr3(f17, f18));
                                i21 = i24;
                                i16 = i22;
                                paint3 = paint4;
                                sparseArray5 = sparseArray11;
                                i20 = 2;
                            }
                            sparseArray3 = sparseArray5;
                            i10 = i16;
                            paint2 = paint3;
                            sr3 sr3Var3 = new sr3(f7, e, f8, f9, f10, f11, f12, f13, f14, sparseArray10);
                            if (rj0Var3.c == 0 && (sr3Var2 = (sr3) sparseArray6.get(f7)) != null) {
                                SparseArray sparseArray12 = sr3Var2.j;
                                for (int i25 = 0; i25 < sparseArray12.size(); i25++) {
                                    sr3Var3.j.put(sparseArray12.keyAt(i25), (tr3) sparseArray12.valueAt(i25));
                                }
                            }
                            sparseArray6.put(sr3Var3.a, sr3Var3);
                            i11 = i17;
                            break;
                        }
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                    case 18:
                        if (f2 == i17) {
                            or3 r2 = r(qd1Var, f3);
                            sparseArray7.put(r2.a, r2);
                        } else if (f2 == i16) {
                            or3 r3 = r(qd1Var, f3);
                            sparseArray4.put(r3.a, r3);
                        }
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                    case 19:
                        if (f2 == i17) {
                            qr3 s2 = s(qd1Var);
                            sparseArray8.put(s2.a, s2);
                        } else if (f2 == i16) {
                            qr3 s3 = s(qd1Var);
                            sparseArray5.put(s3.a, s3);
                        }
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                    case 20:
                        if (f2 == i17) {
                            qd1Var.n(4);
                            boolean e2 = qd1Var.e();
                            qd1Var.n(3);
                            int f19 = qd1Var.f(16);
                            int f20 = qd1Var.f(16);
                            if (e2) {
                                int f21 = qd1Var.f(16);
                                int f22 = qd1Var.f(16);
                                int f23 = qd1Var.f(16);
                                i12 = f22;
                                i13 = qd1Var.f(16);
                                i15 = f23;
                                i14 = f21;
                            } else {
                                i12 = f19;
                                i13 = f20;
                                i14 = 0;
                                i15 = 0;
                            }
                            ur3Var.h = new pr3(f19, f20, i14, i12, i15, i13);
                        }
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                    default:
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                }
                qd1Var.o(d - qd1Var.d());
            }
            i17 = i11;
            i16 = i10;
            paint3 = paint2;
            sparseArray5 = sparseArray3;
        }
        SparseArray sparseArray13 = sparseArray5;
        Paint paint5 = paint3;
        rj0 rj0Var4 = ur3Var.i;
        if (rj0Var4 == null) {
            km5 km5Var = mm5.b;
            x33Var = new x33(-9223372036854775807L, -9223372036854775807L, w59.e);
        } else {
            pr3 pr3Var = ur3Var.h;
            if (pr3Var == null) {
                pr3Var = (pr3) eq2Var.d;
            }
            int i26 = pr3Var.b;
            int i27 = pr3Var.a;
            Bitmap bitmap = (Bitmap) eq2Var.h;
            if (bitmap == null || i27 + 1 != bitmap.getWidth() || i26 + 1 != ((Bitmap) eq2Var.h).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(i27 + 1, i26 + 1, Bitmap.Config.ARGB_8888);
                eq2Var.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray14 = (SparseArray) rj0Var4.d;
            int i28 = 0;
            while (i28 < sparseArray14.size()) {
                canvas.save();
                rr3 rr3Var = (rr3) sparseArray14.valueAt(i28);
                sr3 sr3Var4 = (sr3) sparseArray6.get(sparseArray14.keyAt(i28));
                int i29 = rr3Var.a + pr3Var.c;
                int i30 = rr3Var.b + pr3Var.e;
                int i31 = sr3Var4.c;
                int i32 = sr3Var4.f;
                SparseArray sparseArray15 = sparseArray14;
                int i33 = sr3Var4.d;
                int i34 = i26;
                int i35 = i29 + i31;
                int i36 = i27;
                SparseArray sparseArray16 = sparseArray6;
                int i37 = i30 + i33;
                int i38 = i28;
                canvas.clipRect(i29, i30, Math.min(i35, pr3Var.d), Math.min(i37, pr3Var.f));
                or3 or3Var = (or3) sparseArray7.get(i32);
                if (or3Var == null && (or3Var = (or3) sparseArray4.get(i32)) == null) {
                    or3Var = (or3) eq2Var.e;
                }
                int[] iArr3 = or3Var.b;
                int[] iArr4 = or3Var.c;
                int[] iArr5 = or3Var.d;
                pr3 pr3Var2 = pr3Var;
                SparseArray sparseArray17 = sr3Var4.j;
                SparseArray sparseArray18 = sparseArray4;
                int i39 = 0;
                while (i39 < sparseArray17.size()) {
                    int keyAt = sparseArray17.keyAt(i39);
                    SparseArray sparseArray19 = sparseArray17;
                    tr3 tr3Var = (tr3) sparseArray17.valueAt(i39);
                    qr3 qr3Var = (qr3) sparseArray8.get(keyAt);
                    int i40 = i39;
                    SparseArray sparseArray20 = sparseArray13;
                    if (qr3Var == null) {
                        qr3Var = (qr3) sparseArray20.get(keyAt);
                    }
                    qr3 qr3Var2 = qr3Var;
                    if (qr3Var2 != null) {
                        sparseArray13 = sparseArray20;
                        Paint paint6 = qr3Var2.b ? null : (Paint) eq2Var.a;
                        sr3 sr3Var5 = sr3Var4;
                        int i41 = sr3Var5.e;
                        int i42 = tr3Var.a + i29;
                        int i43 = tr3Var.b + i30;
                        if (i41 == 3) {
                            sparseArray2 = sparseArray8;
                            i9 = i30;
                            iArr2 = iArr5;
                        } else {
                            sparseArray2 = sparseArray8;
                            i9 = i30;
                            iArr2 = i41 == 2 ? iArr4 : iArr3;
                        }
                        i7 = i29;
                        i8 = i31;
                        sr3Var = sr3Var5;
                        iArr = iArr4;
                        i5 = i33;
                        i6 = i9;
                        q(qr3Var2.c, iArr2, i41, i42, i43, paint6, canvas);
                        q(qr3Var2.d, iArr2, i41, i42, i43 + 1, paint6, canvas);
                    } else {
                        i5 = i33;
                        sparseArray13 = sparseArray20;
                        sparseArray2 = sparseArray8;
                        i6 = i30;
                        sr3Var = sr3Var4;
                        i7 = i29;
                        i8 = i31;
                        iArr = iArr4;
                    }
                    eq2Var = this;
                    i29 = i7;
                    i30 = i6;
                    sr3Var4 = sr3Var;
                    i39 = i40 + 1;
                    i33 = i5;
                    sparseArray17 = sparseArray19;
                    iArr4 = iArr;
                    sparseArray8 = sparseArray2;
                    i31 = i8;
                }
                int i44 = i33;
                SparseArray sparseArray21 = sparseArray8;
                int i45 = i30;
                sr3 sr3Var6 = sr3Var4;
                int i46 = i29;
                int i47 = i31;
                int[] iArr6 = iArr4;
                if (sr3Var6.b) {
                    int i48 = sr3Var6.e;
                    int i49 = i48 == 3 ? iArr5[sr3Var6.g] : i48 == 2 ? iArr6[sr3Var6.h] : iArr3[sr3Var6.i];
                    paint = paint5;
                    paint.setColor(i49);
                    sparseArray = sparseArray7;
                    i3 = i34;
                    i4 = i36;
                    arrayList = arrayList2;
                    canvas.drawRect(i46, i45, i35, i37, paint);
                } else {
                    sparseArray = sparseArray7;
                    i3 = i34;
                    i4 = i36;
                    arrayList = arrayList2;
                    paint = paint5;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.h, i46, i45, i47, i44);
                float f24 = i4;
                float f25 = i46 / f24;
                float f26 = i45;
                float f27 = i3;
                arrayList.add(new u33(null, null, null, createBitmap2, f26 / f27, 0, 0, f25, 0, TLObject.FLAG_31, -3.4028235E38f, i47 / f24, i44 / f27, false, -16777216, TLObject.FLAG_31, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                eq2Var = this;
                paint5 = paint;
                sparseArray7 = sparseArray;
                i26 = i3;
                i27 = i4;
                arrayList2 = arrayList;
                sparseArray14 = sparseArray15;
                sparseArray6 = sparseArray16;
                sparseArray4 = sparseArray18;
                sparseArray8 = sparseArray21;
                i28 = i38 + 1;
                pr3Var = pr3Var2;
            }
            x33Var = new x33(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        us2Var.accept(x33Var);
    }

    public final void n() {
        x(null);
        cs5 cs5Var = (cs5) this.c;
        if (cs5Var != null) {
            cs5Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override // uab
    public final int o() {
        return 2;
    }

    public final void p(boolean z) {
        HashMap hashMap;
        AtomicReference atomicReference = (AtomicReference) this.f;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap((HashMap) this.a);
        }
        h(hashMap, z);
    }

    @Override // uab
    public final void reset() {
        ur3 ur3Var = (ur3) this.f;
        ur3Var.c.clear();
        ur3Var.d.clear();
        ur3Var.e.clear();
        ur3Var.f.clear();
        ur3Var.g.clear();
        ur3Var.h = null;
        ur3Var.i = null;
    }

    public final void t(wi9 wi9Var, ArrayList arrayList) {
        wjb wjbVar = (wjb) this.b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ub9 ub9Var = (ub9) obj;
                qx8 qx8Var = new qx8(wi9Var.getContext(), ub9Var, wjbVar);
                qx8Var.setPadding(gl.L(8.0f), 0, gl.L(12.0f), 0);
                qx8Var.setBackground(bkb.Y(bkb.v0(bkb.h6, wjbVar), 0, 0));
                qx8Var.setOnClickListener(new hu4(this, wi9Var, ub9Var, (byte) 17));
                ((LinearLayout) this.d).addView(qx8Var, nme.o(-1, 48));
            }
        }
    }

    public final void u() {
        HashMap hashMap = (HashMap) this.b;
        HashMap hashMap2 = (HashMap) this.c;
        for (mp2 mp2Var : ((HashMap) this.a).keySet()) {
            for (wd3 wd3Var : mp2Var.c) {
                boolean z = wd3Var.b == 2;
                xw8 xw8Var = wd3Var.a;
                if (z && !hashMap2.containsKey(xw8Var)) {
                    Set set = Collections.EMPTY_SET;
                    g06 g06Var = new g06();
                    g06Var.b = null;
                    g06Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    g06Var.a.addAll(set);
                    hashMap2.put(xw8Var, g06Var);
                } else if (hashMap.containsKey(xw8Var)) {
                    continue;
                } else {
                    byte b = wd3Var.b;
                    if (b == 1) {
                        throw new xd3("Unsatisfied dependency for component " + mp2Var + ": " + xw8Var);
                    }
                    if (b != 2) {
                        hashMap.put(xw8Var, new vq7(vq7.c, vq7.d));
                    }
                }
            }
        }
    }

    public final ArrayList v(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            mp2 mp2Var = (mp2) obj;
            if (!mp2Var.e) {
                mt8 mt8Var = (mt8) ((HashMap) this.a).get(mp2Var);
                for (xw8 xw8Var : mp2Var.b) {
                    if (hashMap.containsKey(xw8Var)) {
                        arrayList2.add(new n92((vq7) ((mt8) hashMap.get(xw8Var)), mt8Var, (byte) 24));
                    } else {
                        hashMap.put(xw8Var, mt8Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList w() {
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            mp2 mp2Var = (mp2) entry.getKey();
            if (mp2Var.e) {
                mt8 mt8Var = (mt8) entry.getValue();
                for (xw8 xw8Var : mp2Var.b) {
                    if (!hashMap2.containsKey(xw8Var)) {
                        hashMap2.put(xw8Var, new HashSet());
                    }
                    ((Set) hashMap2.get(xw8Var)).add(mt8Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                g06 g06Var = (g06) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new n92(g06Var, (mt8) it.next(), (byte) 25));
                }
            } else {
                xw8 xw8Var2 = (xw8) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                g06 g06Var2 = new g06();
                g06Var2.b = null;
                g06Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                g06Var2.a.addAll(set);
                hashMap.put(xw8Var2, g06Var2);
            }
        }
        return arrayList;
    }

    public final void x(wi9 wi9Var) {
        wi9 wi9Var2 = (wi9) this.h;
        if (wi9Var2 != wi9Var) {
            if (wi9Var2 != null) {
                wi9Var2.setShowCommandBackground(false);
            }
            this.h = wi9Var;
            if (wi9Var != null) {
                wi9Var.setShowCommandBackground(true);
            }
        }
    }

    public final void z(wi9 wi9Var, String str) {
        cs5 cs5Var;
        cs5 cs5Var2;
        if (str == null) {
            n();
            return;
        }
        ArrayList a = ub9.a(str);
        if (a.isEmpty()) {
            n();
            return;
        }
        x(wi9Var);
        if (((wi9) this.f) == wi9Var && a.equals((ArrayList) this.e) && (cs5Var2 = (cs5) this.c) != null && cs5Var2.E()) {
            return;
        }
        if (((wi9) this.f) == wi9Var && (cs5Var = (cs5) this.c) != null && cs5Var.E() && ((LinearLayout) this.d) != null) {
            this.e = a;
            t(wi9Var, a);
            ((cs5) this.c).P();
            return;
        }
        n();
        x(wi9Var);
        this.f = wi9Var;
        this.e = a;
        LinearLayout linearLayout = new LinearLayout(wi9Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        t(wi9Var, a);
        cs5 e = ((vb9) this.a).e(wi9Var.getEditText());
        e.T = true;
        e.s = (short) 0;
        e.t = false;
        e.q((LinearLayout) this.d, nme.o(kk7.w3, -2));
        e.a0 = gl.L(240.0f);
        e.i = (byte) 3;
        e.b0(-gl.L(12.0f), 0.0f);
        e.p = new sr8(this, (byte) 20);
        e.g0 = true;
        if (e.E()) {
            e.D();
        }
        e.a0();
        this.c = e;
    }

    public eq2(vb9 vb9Var, wjb wjbVar) {
        this.a = vb9Var;
        this.b = wjbVar;
    }
}
