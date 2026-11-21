package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c8.md;
import hi.j3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class a0 extends ViewGroup {
    public final z E;
    public float F;
    public long G;
    public long H;
    public int[] I;
    public final ik J;
    public final /* synthetic */ e0 K;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final TextView d;
    public final ImageView e;
    public final k f;
    public final int h;
    public float n;
    public float r;
    public ValueAnimator s;
    public boolean w;
    public long x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var, Context context) {
        super(context);
        this.K = e0Var;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.h = org.telegram.messenger.g0.L(2.0f);
        this.r = 1.0f;
        this.E = new z(this, 1);
        this.J = new ik(this, 21);
        setBackgroundColor(-16777216);
        setChildrenDrawingOrderEnabled(true);
        this.n = e0Var.c;
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(m6.L(org.telegram.messenger.g0.L(28.0f), 1711276032));
        addView(imageView);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1275068417);
        textView.setTextSize(1, 11.0f);
        textView.setSingleLine();
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, TLObject.FLAG_31);
        textView.setVisibility(8);
        addView(textView);
        k kVar = new k(context);
        this.f = kVar;
        addView(kVar);
    }

    public static void a(a0 a0Var) {
        int width = a0Var.getWidth();
        int height = a0Var.getHeight();
        if (!a0Var.w || a0Var.y || width <= 0 || height <= 0 || a0Var.a.isEmpty() || a0Var.F <= 0.0f || !a0Var.c() || Math.abs(Math.log((width / height) / a0Var.F)) <= 0.06d) {
            return;
        }
        a0Var.g(true);
    }

    public final void b() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d0 d0Var = (d0) obj;
            d0Var.b();
            removeView(d0Var);
        }
        arrayList.clear();
        this.I = null;
    }

    public final boolean c() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        return W != null && org.telegram.messenger.g0.H1(W) && SystemClock.elapsedRealtime() - this.x > 1000;
    }

    public final void d(d0 d0Var, int i7, int i10) {
        float[] fArr = d0Var.P;
        float f10 = this.r;
        for (int i11 = 0; i11 < 4; i11++) {
            float f11 = d0Var.N[i11];
            fArr[i11] = com.google.android.gms.internal.vision.e2.z(d0Var.O[i11], f11, f10, f11);
        }
        float f12 = this.h / 2.0f;
        float f13 = fArr[0];
        float f14 = i7;
        int round = Math.round((f13 * f14) + (f13 > 0.001f ? f12 : 0.0f));
        float f15 = fArr[1];
        float f16 = i10;
        int round2 = Math.round((f15 * f16) + (f15 > 0.001f ? f12 : 0.0f));
        float f17 = fArr[2];
        int round3 = Math.round((f14 * f17) - (f17 < 0.999f ? f12 : 0.0f));
        float f18 = fArr[3];
        float f19 = f16 * f18;
        if (f18 >= 0.999f) {
            f12 = 0.0f;
        }
        int round4 = Math.round(f19 - f12);
        int max = Math.max(1, round3 - round);
        int max2 = Math.max(1, round4 - round2);
        if (d0Var.getMeasuredWidth() != max || d0Var.getMeasuredHeight() != max2 || d0Var.isLayoutRequested()) {
            d0Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(max2, TLObject.FLAG_30));
        }
        d0Var.layout(round, round2, max + round, max2 + round2);
        float f20 = this.r;
        float f21 = d0Var.Q;
        float f22 = ((d0Var.R - f21) * f20) + f21;
        d0Var.setAlpha(f22);
        float f23 = (f22 * 0.2f) + 0.8f;
        d0Var.setScaleX(f23);
        d0Var.setScaleY(f23);
    }

    public final void e() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d((d0) obj, width, height);
        }
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            d((d0) obj2, width, height);
        }
        invalidate();
    }

    public final boolean f(int i7, int i10) {
        return Math.abs(Math.log((double) ((((float) i7) / ((float) i10)) / this.n))) < 0.06d;
    }

    public final void g(boolean z10) {
        boolean z11;
        int i7;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int[] iArr = new int[size];
        boolean z12 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d0 d0Var = (d0) arrayList.get(i10);
            float f10 = d0Var.K;
            fArr[i10] = f10;
            u3 u3Var = d0Var.b;
            fArr2[i10] = (u3Var == null || !u3Var.b) ? 1.0f : 2.0f;
            boolean z13 = d0Var.M;
            iArr[i10] = z13 ? i10 : -1;
            z12 |= z13 && d0Var.L <= 0.0f && f10 > 0.0f;
        }
        wi.j a10 = md.a(fArr, fArr2, 0.45f, 2.35f, iArr, z12 ? 0.0f : this.n);
        int width = getWidth();
        int height = getHeight();
        float f11 = 0.001f;
        if (Math.abs(a10.a - this.n) > 0.001f || width <= 0 || height <= 0 || f(width, height) || !c()) {
            z11 = false;
        } else {
            float f12 = width / height;
            a10 = md.a(fArr, fArr2, f12, f12, iArr, 0.0f);
            z11 = true;
        }
        this.F = a10.a;
        if (org.telegram.messenger.s2.a) {
            StringBuilder sb2 = new StringBuilder("group call pip: mosaic ");
            sb2.append(Arrays.toString(fArr));
            sb2.append(z11 ? " in the window" : "");
            sb2.append(" -> ");
            sb2.append(a10);
            a8.b(sb2.toString());
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (true) {
            i7 = 4;
            if (i11 >= size2) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            d0 d0Var2 = (d0) obj;
            float f13 = this.r;
            float f14 = f11;
            float[] fArr3 = d0Var2.N;
            for (int i12 = 0; i12 < 4; i12++) {
                float f15 = fArr3[i12];
                fArr3[i12] = com.google.android.gms.internal.vision.e2.z(d0Var2.O[i12], f15, f13, f15);
            }
            float f16 = d0Var2.Q;
            d0Var2.Q = com.google.android.gms.internal.vision.e2.z(d0Var2.R, f16, f13, f16);
            f11 = f14;
        }
        float f17 = f11;
        ArrayList arrayList2 = this.b;
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            d0 d0Var3 = (d0) obj2;
            float f18 = this.r;
            float[] fArr4 = d0Var3.N;
            float[] fArr5 = d0Var3.O;
            int i14 = 0;
            while (i14 < i7) {
                float f19 = fArr4[i14];
                fArr4[i14] = com.google.android.gms.internal.vision.e2.z(fArr5[i14], f19, f18, f19);
                i14++;
                i7 = 4;
            }
            float f20 = d0Var3.Q;
            d0Var3.Q = com.google.android.gms.internal.vision.e2.z(d0Var3.R, f20, f18, f20);
            System.arraycopy(d0Var3.N, 0, fArr5, 0, 4);
            d0Var3.R = 0.0f;
            i7 = 4;
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            d0 d0Var4 = (d0) arrayList.get(i15);
            System.arraycopy(a10.b, i15 * 4, d0Var4.O, 0, 4);
            d0Var4.R = 1.0f;
            d0Var4.L = fArr[i15];
            if (!d0Var4.M || !z10) {
                System.arraycopy(d0Var4.O, 0, d0Var4.N, 0, 4);
                d0Var4.Q = z10 ? 0.0f : 1.0f;
                d0Var4.M = true;
            }
        }
        for (int i16 : a10.c) {
            arrayList3.add((d0) arrayList.get(i16));
        }
        arrayList.clear();
        arrayList.addAll(arrayList3);
        this.I = null;
        boolean z14 = !z11 && Math.abs(a10.a - this.n) > f17;
        if (z14) {
            this.n = a10.a;
            wi.n nVar = this.K.a;
            if (nVar != null) {
                nVar.c();
            }
        }
        k();
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
            this.s = null;
        }
        this.y = false;
        z zVar = this.E;
        org.telegram.messenger.g0.r(zVar);
        if (z10) {
            this.r = 0.0f;
            if (!z14 || getWidth() <= 0 || getHeight() <= 0 || f(getWidth(), getHeight())) {
                h();
            } else {
                this.y = true;
                org.telegram.messenger.g0.h3(zVar, 500L);
            }
        } else {
            this.r = 1.0f;
            b();
        }
        e();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i10) {
        int[] iArr = this.I;
        if (iArr == null || iArr.length != i7) {
            int[] iArr2 = new int[i7];
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                int indexOfChild = indexOfChild((d0) obj);
                if (indexOfChild >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild;
                    i11++;
                }
            }
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                int indexOfChild2 = indexOfChild((d0) obj2);
                if (indexOfChild2 >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild2;
                    i11++;
                }
            }
            ArrayList arrayList3 = this.a;
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList3.get(i14);
                i14++;
                int indexOfChild3 = indexOfChild((d0) obj3);
                if (indexOfChild3 >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild3;
                    i11++;
                }
            }
            for (int i15 = 0; i15 < i7 && i11 < i7; i15++) {
                if (!(getChildAt(i15) instanceof d0)) {
                    iArr2[i11] = i15;
                    i11++;
                }
            }
            if (i11 != i7) {
                for (int i16 = 0; i16 < i7; i16++) {
                    iArr2[i16] = i16;
                }
            }
            this.I = iArr2;
        }
        return this.I[i10];
    }

    public final void h() {
        this.y = false;
        org.telegram.messenger.g0.r(this.E);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.setDuration(420L);
        this.s.setInterpolator(nr.h);
        this.s.addUpdateListener(new j3(this, 16));
        this.s.addListener(new y9(this, 12));
        this.s.start();
    }

    public final void i() {
        if (this.w) {
            int i7 = 0;
            this.w = false;
            org.telegram.messenger.g0.r(this.J);
            this.f.b();
            this.y = false;
            org.telegram.messenger.g0.r(this.E);
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.s.cancel();
                this.s = null;
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d0 d0Var = (d0) obj;
                d0Var.b();
                removeView(d0Var);
            }
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                d0 d0Var2 = (d0) obj2;
                d0Var2.b();
                removeView(d0Var2);
            }
            ArrayList arrayList3 = this.c;
            int size3 = arrayList3.size();
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                d0 d0Var3 = (d0) obj3;
                d0Var3.b();
                removeView(d0Var3);
            }
            arrayList.clear();
            arrayList2.clear();
            arrayList3.clear();
            this.r = 1.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030b A[EDGE_INSN: B:142:0x030b->B:143:0x030b BREAK  A[LOOP:7: B:126:0x02db->B:137:0x0306], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0216 A[EDGE_INSN: B:68:0x0216->B:69:0x0216 BREAK  A[LOOP:3: B:58:0x01db->B:65:0x0213], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z10) {
        VoIPService voIPService;
        d0 d0Var;
        d0 d0Var2;
        VoIPService voIPService2;
        int i7;
        long j3;
        int size;
        boolean z11;
        int i10;
        int i11;
        long j10;
        long j11;
        int i12;
        a0.h hVar;
        long j12;
        int i13;
        int size2;
        int i14;
        int i15;
        boolean z12;
        long B1;
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z13;
        String str;
        TLRPC.Chat chat;
        u3 u3Var;
        long j13;
        float f10;
        boolean z14;
        boolean z15;
        if (this.w) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            t3 t3Var = sharedInstance2 != null ? sharedInstance2.groupCall : null;
            if (sharedInstance == null || t3Var == null) {
                return;
            }
            long selfId = sharedInstance.getSelfId();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            TextView textView = this.d;
            this.e.setImageResource(sharedInstance.isMicMute() ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
            this.f.c();
            long c10 = g.c();
            if (c10 != this.H) {
                this.H = c10;
                wi.n nVar = this.K.a;
                if (nVar != null) {
                    nVar.c();
                }
            }
            int callState = sharedInstance.getCallState();
            if (callState == 5) {
                textView.setText(gd.N0(2131743010, null));
                textView.setVisibility(0);
            } else if (callState != 3) {
                textView.setText(gd.N0(2131743176, null));
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList a10 = e0.a(selfId, t3Var);
            int size3 = a10.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj = a10.get(i16);
                i16++;
                u3 u3Var2 = (u3) obj;
                linkedHashMap.put(e0.j(u3Var2), u3Var2);
            }
            boolean isEmpty = linkedHashMap.isEmpty();
            boolean z16 = true;
            int size4 = this.a.size() - 1;
            boolean z17 = false;
            while (size4 >= 0) {
                d0 d0Var3 = (d0) this.a.get(size4);
                if (!isEmpty ? !(d0Var3.c == null || linkedHashMap.containsKey(d0Var3.a)) : d0Var3.c != null) {
                    this.a.remove(size4);
                    d0Var3.getClass();
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    TLRPC.GroupCallParticipant groupCallParticipant2 = d0Var3.n;
                    if (groupCallParticipant2 == null || sharedInstance3 == null) {
                        z15 = z16;
                    } else {
                        z15 = z16;
                        sharedInstance3.removeExtraRemoteSink(groupCallParticipant2, d0Var3.r, d0Var3.U);
                    }
                    d0Var3.n = null;
                    this.b.add(d0Var3);
                    z17 = z15;
                } else {
                    z15 = z16;
                }
                size4--;
                z16 = z15;
            }
            boolean z18 = z16;
            for (int size5 = this.c.size() - 1; size5 >= 0; size5--) {
                d0 d0Var4 = (d0) this.c.get(size5);
                if (!linkedHashMap.containsKey(d0Var4.a)) {
                    this.c.remove(size5);
                    d0Var4.b();
                    removeView(d0Var4);
                    this.I = null;
                }
            }
            if (!isEmpty) {
                for (u3 u3Var3 : linkedHashMap.values()) {
                    String j14 = e0.j(u3Var3);
                    ArrayList arrayList = this.a;
                    int size6 = arrayList.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size6) {
                            voIPService = sharedInstance;
                            d0Var = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i17);
                        i17++;
                        d0Var = (d0) obj2;
                        voIPService = sharedInstance;
                        if (TextUtils.equals(d0Var.a, j14)) {
                            break;
                        } else {
                            sharedInstance = voIPService;
                        }
                    }
                    if (d0Var == null) {
                        ArrayList arrayList2 = this.c;
                        int size7 = arrayList2.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size7) {
                                d0Var2 = null;
                                break;
                            }
                            Object obj3 = arrayList2.get(i18);
                            i18++;
                            d0Var2 = (d0) obj3;
                            if (TextUtils.equals(d0Var2.a, j14)) {
                                break;
                            }
                        }
                        d0Var = d0Var2;
                    }
                    if (d0Var == null) {
                        d0 d0Var5 = new d0(this.K, getContext(), j14, u3Var3);
                        if (z10) {
                            this.a.add(d0Var5);
                            addView(d0Var5);
                            z17 = z18;
                        } else {
                            d0Var5.y = elapsedRealtime;
                            d0Var5.setAlpha(0.0f);
                            this.c.add(d0Var5);
                            addView(d0Var5);
                        }
                    } else {
                        d0Var.b = u3Var3;
                    }
                    sharedInstance = voIPService;
                }
            } else if (this.a.isEmpty()) {
                d0 d0Var6 = new d0(this.K, getContext(), "avatar", null);
                this.a.add(d0Var6);
                addView(d0Var6);
                voIPService2 = sharedInstance;
                z17 = z18;
                i7 = 0;
                while (true) {
                    j3 = 2000;
                    if (i7 < this.c.size()) {
                        break;
                    }
                    d0 d0Var7 = (d0) this.c.get(i7);
                    d0Var7.d(false);
                    if (d0Var7.K > 0.0f || elapsedRealtime - d0Var7.y >= 2000) {
                        this.c.remove(i7);
                        this.a.add(d0Var7);
                        this.I = null;
                        i7--;
                        z17 = z18;
                    }
                    i7++;
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = this.a;
                    int size8 = arrayList3.size();
                    boolean z19 = false;
                    int i19 = 0;
                    while (i19 < size8) {
                        Object obj4 = arrayList3.get(i19);
                        i19++;
                        z19 |= !(((d0) obj4).c == null ? z18 : false);
                    }
                    for (int size9 = this.a.size() - 1; size9 >= 0 && z19; size9--) {
                        d0 d0Var8 = (d0) this.a.get(size9);
                        if (d0Var8.c == null) {
                            this.a.remove(size9);
                            this.b.add(d0Var8);
                            z17 = z18;
                        }
                    }
                }
                ArrayList arrayList4 = this.a;
                size = arrayList4.size();
                z11 = false;
                boolean z20 = false;
                i10 = 0;
                while (i10 < size) {
                    Object obj5 = arrayList4.get(i10);
                    i10++;
                    d0 d0Var9 = (d0) obj5;
                    long j15 = j3;
                    d0Var9.d(z18);
                    boolean z21 = d0Var9.L > 0.0f;
                    ArrayList arrayList5 = arrayList4;
                    float f11 = d0Var9.K;
                    if (f11 > 0.0f) {
                        f10 = f11;
                        z14 = true;
                    } else {
                        f10 = f11;
                        z14 = false;
                    }
                    if (z21 != z14 || (z14 && Math.abs(Math.log(f10 / r10)) > 0.10000000149011612d)) {
                        z11 = true;
                    }
                    if (!z14 && d0Var9.c != null && elapsedRealtime - d0Var9.E < j15) {
                        z20 = true;
                    }
                    j3 = j15;
                    arrayList4 = arrayList5;
                    z18 = true;
                }
                if (z11 && !z20) {
                    z17 = true;
                }
                if (!z17 || z10) {
                    i11 = 1;
                    g(!z10);
                } else {
                    i11 = 1;
                }
                j10 = 0;
                j11 = 0;
                long j16 = 0;
                i12 = 0;
                while (true) {
                    hVar = t3Var.P;
                    if (i12 < hVar.m()) {
                        break;
                    }
                    TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) hVar.n(i12);
                    long j17 = hVar.j(i12);
                    if (groupCallParticipant3 == null || j17 == selfId) {
                        j13 = j10;
                    } else {
                        j13 = j10;
                        if (j11 == j10 || groupCallParticipant3.lastSpeakTime > j16) {
                            j16 = groupCallParticipant3.lastSpeakTime;
                            j11 = j17;
                        }
                    }
                    i12++;
                    j10 = j13;
                }
                j12 = j10;
                if (j11 == j12) {
                    this.G = j11;
                } else if (!isEmpty && !this.a.isEmpty()) {
                    i13 = 0;
                    if (((d0) this.a.get(0)).b != null) {
                        this.G = fj.B1(((d0) this.a.get(0)).b.a.peer);
                    }
                    if (j11 == j12) {
                        long j18 = this.G;
                        if (j18 != j12 && t3Var.d.f(j18) != null) {
                            j11 = this.G;
                        } else if (voIPService2.getChat() != null) {
                            j11 = -voIPService2.getChat().id;
                        } else {
                            int i20 = i13;
                            while (true) {
                                if (i20 >= t3Var.e.size()) {
                                    break;
                                }
                                long B12 = fj.B1(((TLRPC.GroupCallParticipant) t3Var.e.get(i20)).peer);
                                if (B12 != selfId) {
                                    selfId = B12;
                                    break;
                                }
                                i20++;
                            }
                            j11 = selfId;
                        }
                    }
                    ArrayList arrayList6 = this.a;
                    size2 = arrayList6.size();
                    i14 = i13;
                    while (i14 < size2) {
                        Object obj6 = arrayList6.get(i14);
                        i14++;
                        d0 d0Var10 = (d0) obj6;
                        if (d0Var10.n == null) {
                            d0Var10.c();
                        }
                        n2 n2Var = d0Var10.c;
                        int i21 = (n2Var == null || d0Var10.n == null || !n2Var.d.isFirstFrameRendered() || elapsedRealtime - d0Var10.s >= 1500) ? i13 : i11;
                        n2 n2Var2 = d0Var10.c;
                        if (n2Var2 != null && d0Var10.n != null && !n2Var2.d.isFirstFrameRendered() && (u3Var = d0Var10.b) != null) {
                            boolean z22 = u3Var.b;
                            TLRPC.GroupCallParticipant groupCallParticipant4 = u3Var.a;
                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = z22 ? groupCallParticipant4.presentation : groupCallParticipant4.video;
                            if (tL_groupCallParticipantVideo != null && !tL_groupCallParticipantVideo.paused && elapsedRealtime - d0Var10.E < 1200) {
                                i15 = i11;
                                z12 = (i21 == 0 || i15 != 0) ? i11 : i13;
                                if (d0Var10.F != z12) {
                                    d0Var10.F = z12;
                                    d0Var10.d.setVisibility(z12 != 0 ? 8 : i13);
                                    if (org.telegram.messenger.s2.a && d0Var10.c != null) {
                                        long elapsedRealtime2 = d0Var10.s == j12 ? -1L : SystemClock.elapsedRealtime() - d0Var10.s;
                                        StringBuilder sb2 = new StringBuilder("group call pip: ");
                                        sb2.append(d0Var10.a);
                                        sb2.append(z12 != 0 ? " video" : " avatar");
                                        sb2.append(", last frame ");
                                        sb2.append(elapsedRealtime2);
                                        sb2.append(" ms ago, subscribed ");
                                        sb2.append(d0Var10.n != null ? i11 : i13);
                                        sb2.append(", rendered ");
                                        sb2.append(d0Var10.c.d.isFirstFrameRendered());
                                        a8.b(sb2.toString());
                                    }
                                    d0Var10.invalidate();
                                }
                                u3 u3Var4 = d0Var10.b;
                                B1 = u3Var4 == null ? fj.B1(u3Var4.a.peer) : j11;
                                if (B1 != d0Var10.G) {
                                    d0Var10.G = B1;
                                    mp u12 = mp.u1(voIPService2.getAccount());
                                    if (n5.E(B1)) {
                                        TLRPC.User c22 = u12.c2(Long.valueOf(B1));
                                        str = o10.q(c22);
                                        chat = c22;
                                    } else {
                                        TLRPC.Chat O0 = u12.O0(Long.valueOf(-B1));
                                        if (O0 != null) {
                                            str = O0.title;
                                            chat = O0;
                                        } else {
                                            str = "";
                                            chat = O0;
                                        }
                                    }
                                    d0Var10.d.a(chat);
                                    d0Var10.e.setText(str);
                                }
                                groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(B1);
                                if (groupCallParticipant != null && t3Var.P.g(null, B1) != null) {
                                    z13 = i11;
                                    h hVar2 = d0Var10.d;
                                    float f12 = z13 == 0 ? groupCallParticipant.amplitude : 0.0f;
                                    hVar2.w = z13;
                                    hVar2.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                                    hVar2.invalidate();
                                    if (d0Var10.H == z13) {
                                        d0Var10.H = z13;
                                        d0Var10.invalidate();
                                    }
                                    i13 = 0;
                                }
                                z13 = i13;
                                h hVar22 = d0Var10.d;
                                if (z13 == 0) {
                                }
                                hVar22.w = z13;
                                hVar22.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                                hVar22.invalidate();
                                if (d0Var10.H == z13) {
                                }
                                i13 = 0;
                            }
                        }
                        i15 = i13;
                        if (i21 == 0) {
                        }
                        if (d0Var10.F != z12) {
                        }
                        u3 u3Var42 = d0Var10.b;
                        if (u3Var42 == null) {
                        }
                        if (B1 != d0Var10.G) {
                        }
                        groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(B1);
                        if (groupCallParticipant != null) {
                            z13 = i11;
                            h hVar222 = d0Var10.d;
                            if (z13 == 0) {
                            }
                            hVar222.w = z13;
                            hVar222.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                            hVar222.invalidate();
                            if (d0Var10.H == z13) {
                            }
                            i13 = 0;
                        }
                        z13 = i13;
                        h hVar2222 = d0Var10.d;
                        if (z13 == 0) {
                        }
                        hVar2222.w = z13;
                        hVar2222.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                        hVar2222.invalidate();
                        if (d0Var10.H == z13) {
                        }
                        i13 = 0;
                    }
                }
                i13 = 0;
                if (j11 == j12) {
                }
                ArrayList arrayList62 = this.a;
                size2 = arrayList62.size();
                i14 = i13;
                while (i14 < size2) {
                }
            }
            voIPService2 = sharedInstance;
            i7 = 0;
            while (true) {
                j3 = 2000;
                if (i7 < this.c.size()) {
                }
                i7++;
            }
            if (!isEmpty) {
            }
            ArrayList arrayList42 = this.a;
            size = arrayList42.size();
            z11 = false;
            boolean z202 = false;
            i10 = 0;
            while (i10 < size) {
            }
            if (z11) {
                z17 = true;
            }
            if (z17) {
            }
            i11 = 1;
            g(!z10);
            j10 = 0;
            j11 = 0;
            long j162 = 0;
            i12 = 0;
            while (true) {
                hVar = t3Var.P;
                if (i12 < hVar.m()) {
                }
                i12++;
                j10 = j13;
            }
            j12 = j10;
            if (j11 == j12) {
            }
            i13 = 0;
            if (j11 == j12) {
            }
            ArrayList arrayList622 = this.a;
            size2 = arrayList622.size();
            i14 = i13;
            while (i14 < size2) {
            }
        }
    }

    public final void k() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d0 d0Var = (d0) obj;
            float[] fArr = d0Var.O;
            int round = Math.round((fArr[2] - fArr[0]) * width);
            float[] fArr2 = d0Var.O;
            int round2 = Math.round((fArr2[3] - fArr2[1]) * height);
            int max = Math.max(1, round);
            int max2 = Math.max(1, round2);
            float f10 = d0Var.K;
            if (f10 > 0.0f) {
                float f11 = max;
                float f12 = max2;
                if (f11 / f12 > f10) {
                    max2 = Math.round(f11 / f10);
                } else {
                    max = Math.round(f12 * f10);
                }
            }
            if (max != d0Var.S || max2 != d0Var.T) {
                d0Var.S = max;
                d0Var.T = max2;
                d0Var.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        ImageView imageView = this.e;
        imageView.layout(L, L2, imageView.getMeasuredWidth() + L3, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(6.0f));
        int i13 = i11 - i7;
        TextView textView = this.d;
        int measuredWidth = (i13 - textView.getMeasuredWidth()) / 2;
        textView.layout(measuredWidth, org.telegram.messenger.g0.L(8.0f), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        this.f.layout(0, 0, i13, i12 - i10);
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), TLObject.FLAG_30));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(64.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k();
        if (this.y && i7 > 0 && i10 > 0 && f(i7, i10)) {
            post(this.E);
        } else {
            if (this.y) {
                return;
            }
            post(new z(this, 0));
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.I = null;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.I = null;
    }
}
