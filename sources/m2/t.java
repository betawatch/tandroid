package m2;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cb;
import org.telegram.messenger.cd;
import org.telegram.messenger.ea;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.h0;
import org.telegram.messenger.i0;
import org.telegram.messenger.i5;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.ra;
import org.telegram.messenger.xa;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.g0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.r10;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Wallet.ba;
import org.telegram.ui.o10;
import rh.h8;
import s4.i1;
import s4.n0;
import s4.o0;
import w7.b6;
import zf.l1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t implements l2.i, xa, ra, l61, q4, wk0, l1, com.google.android.gms.common.api.internal.s, r4.c, hu0, i1, v90 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // l2.i
    public long A(long j10, long j11) {
        return 1L;
    }

    public ClipDescription B() {
        return ((t0.h) this.b).getDescription();
    }

    @Override // s4.i1
    public View C(int i10) {
        return ((n0) this.b).q(i10);
    }

    public t D(cb cbVar) {
        ig.i1 i1Var = (ig.i1) this.b;
        LatLng latLng = new LatLng(cbVar.a, cbVar.b);
        i1Var.getClass();
        double d = i1Var.b;
        double d10 = latLng.a;
        i1Var.b = Math.min(d, d10);
        i1Var.c = Math.max(i1Var.c, d10);
        boolean isNaN = Double.isNaN(i1Var.d);
        double d11 = latLng.b;
        if (isNaN) {
            i1Var.d = d11;
            i1Var.e = d11;
            return this;
        }
        double d12 = i1Var.d;
        double d13 = i1Var.e;
        if (d12 > d13 ? !(d12 <= d11 || d11 <= d13) : !(d12 <= d11 && d11 <= d13)) {
            if (((d12 - d11) + 360.0d) % 360.0d < ((d11 - d13) + 360.0d) % 360.0d) {
                i1Var.d = d11;
                return this;
            }
            i1Var.e = d11;
        }
        return this;
    }

    @Override // s4.i1
    public int E(View view) {
        return n0.v(view) + ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).bottomMargin;
    }

    @Override // org.telegram.ui.Components.hu0
    public void F(boolean z10) {
        h8 h8Var = (h8) this.b;
        fe.b bVar = h8Var.Y;
        if (bVar != null) {
            bVar.a(z10, true);
        }
        o10 o10Var = h8Var.s;
        if (o10Var != null) {
            o10Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean I(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        r10 r10Var;
        boolean z11;
        q10 q10Var = (q10) this.b;
        int i10 = q10.w;
        r10 r10Var2 = q10Var.f;
        android.support.v4.media.session.q qVar = q10Var.e;
        int action = motionEvent.getAction();
        if (q10Var.v == null) {
            q10Var.v = VelocityTracker.obtain();
        }
        q10Var.v.addMovement(motionEvent);
        int i11 = action & zs.e4;
        boolean z12 = i11 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f7 = motionEvent.getX(i12) + f7;
                f10 = motionEvent.getY(i12) + f10;
            }
        }
        float f11 = z12 ? pointerCount - 1 : pointerCount;
        float f12 = f7 / f11;
        float f13 = f10 / f11;
        if (i11 == 0) {
            if (q10Var.g != null && r10Var2.a()) {
                boolean hasMessages = qVar.hasMessages(3);
                if (hasMessages) {
                    qVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = q10Var.m;
                if (motionEvent4 != null && (motionEvent3 = q10Var.n) != null && hasMessages && q10Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x10 * x10) < q10Var.b) {
                        q10Var.o = true;
                        z10 = q10Var.g.onDoubleTap(q10Var.m) | q10Var.g.onDoubleTapEvent(motionEvent);
                        q10Var.p = f12;
                        q10Var.r = f12;
                        q10Var.q = f13;
                        q10Var.s = f13;
                        motionEvent2 = q10Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        q10Var.m = MotionEvent.obtain(motionEvent);
                        q10Var.k = true;
                        q10Var.l = true;
                        q10Var.h = true;
                        q10Var.j = false;
                        q10Var.i = false;
                        if (q10Var.t) {
                            qVar.removeMessages(2);
                            qVar.sendEmptyMessageAtTime(2, q10Var.m.getDownTime() + i10 + q10Var.u);
                        }
                        qVar.sendEmptyMessageAtTime(1, q10Var.m.getDownTime() + i10);
                        return r10Var2.onDown(motionEvent) | z10;
                    }
                }
                qVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            q10Var.p = f12;
            q10Var.r = f12;
            q10Var.q = f13;
            q10Var.s = f13;
            motionEvent2 = q10Var.m;
            if (motionEvent2 != null) {
            }
            q10Var.m = MotionEvent.obtain(motionEvent);
            q10Var.k = true;
            q10Var.l = true;
            q10Var.h = true;
            q10Var.j = false;
            q10Var.i = false;
            if (q10Var.t) {
            }
            qVar.sendEmptyMessageAtTime(1, q10Var.m.getDownTime() + i10);
            return r10Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            q10Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (q10Var.o) {
                onFling = q10Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (q10Var.j) {
                    qVar.removeMessages(3);
                    q10Var.j = false;
                } else if (q10Var.k) {
                    boolean onSingleTapUp = r10Var2.onSingleTapUp(motionEvent);
                    if (q10Var.i && (r10Var = q10Var.g) != null) {
                        r10Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = q10Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, q10Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > q10Var.c || Math.abs(xVelocity) > q10Var.c) {
                        onFling = r10Var2.onFling(q10Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = q10Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            q10Var.n = obtain;
            VelocityTracker velocityTracker2 = q10Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                q10Var.v = null;
            }
            q10Var.o = false;
            q10Var.i = false;
            qVar.removeMessages(1);
            qVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                qVar.removeMessages(1);
                qVar.removeMessages(2);
                qVar.removeMessages(3);
                q10Var.v.recycle();
                q10Var.v = null;
                q10Var.o = false;
                q10Var.h = false;
                q10Var.k = false;
                q10Var.l = false;
                q10Var.i = false;
                if (q10Var.j) {
                    q10Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                q10Var.p = f12;
                q10Var.r = f12;
                q10Var.q = f13;
                q10Var.s = f13;
                qVar.removeMessages(1);
                qVar.removeMessages(2);
                qVar.removeMessages(3);
                q10Var.o = false;
                q10Var.k = false;
                q10Var.l = false;
                q10Var.i = false;
                if (q10Var.j) {
                    q10Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                q10Var.p = f12;
                q10Var.r = f12;
                q10Var.q = f13;
                q10Var.s = f13;
                q10Var.v.computeCurrentVelocity(1000, q10Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = q10Var.v.getXVelocity(pointerId2);
                float yVelocity2 = q10Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((q10Var.v.getYVelocity(pointerId3) * yVelocity2) + (q10Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            q10Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!q10Var.j) {
            float f14 = q10Var.p - f12;
            float f15 = q10Var.q - f13;
            if (q10Var.o) {
                return q10Var.g.onDoubleTapEvent(motionEvent);
            }
            if (q10Var.k) {
                int i14 = (int) (f12 - q10Var.r);
                int i15 = (int) (f13 - q10Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > q10Var.a) {
                    z11 = r10Var2.onScroll(q10Var.m, motionEvent, f14, f15);
                    q10Var.p = f12;
                    q10Var.q = f13;
                    q10Var.k = false;
                    qVar.removeMessages(3);
                    qVar.removeMessages(1);
                    qVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > q10Var.a) {
                    q10Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                boolean onScroll = r10Var2.onScroll(q10Var.m, motionEvent, f14, f15);
                q10Var.p = f12;
                q10Var.q = f13;
                return onScroll;
            }
        }
        return false;
    }

    public void J(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        g0 g0Var = (g0) this.b;
        g0Var.q1(i10, i11, z10);
        g0Var.dismiss();
    }

    @Override // zf.l1
    public /* synthetic */ a0.h M() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.v90
    public void N(int i10, int i11, CharSequence charSequence, boolean z10) {
        vh.f fVar = ((vh.k) this.b).f;
        if (fVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                k6.l(spannableStringBuilder, fVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            fVar.setText(spannableStringBuilder);
            fVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public Object O() {
        if (n7.a.b == null) {
            n7.a.b = new j6.l();
        }
        synchronized (n7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // zf.l1
    public boolean Y(int i10) {
        switch (this.a) {
            case 13:
                return i10 == ((lp0) this.b).r;
            default:
                return true;
        }
    }

    @Override // l2.i
    public long a(long j10) {
        return 0L;
    }

    @Override // org.telegram.ui.Components.hu0
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(((h8) this.b).b0), 0);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 17:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).v();
                n6.o oVar = (n6.o) this.b;
                Parcel J0 = aVar.J0();
                k7.a.c(J0, oVar);
                try {
                    aVar.b.transact(1, J0, null, 1);
                    J0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    J0.recycle();
                    throw th2;
                }
            default:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).v();
                s6.a aVar2 = (s6.a) this.b;
                Parcel J02 = eVar.J0();
                k7.a.d(J02, fVar);
                k7.a.c(J02, aVar2);
                J02.writeStrongBinder(null);
                eVar.K0(J02, 2);
                return;
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public void b(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override // zf.l1
    public /* synthetic */ void c0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.wk0
    public boolean d(int i10) {
        return ((ChatAttachAlertPhotoLayout) this.b).G.d(i10) == 0;
    }

    @Override // l2.i
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override // l2.i
    public long f(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // l2.i
    public j g(long j10) {
        return (j) this.b;
    }

    @Override // org.telegram.ui.Components.hu0
    public int g1() {
        return ((h8) this.b).c0;
    }

    @Override // org.telegram.ui.Components.wk0
    public void h(View view, boolean z10) {
        if (z10 == ((ChatAttachAlertPhotoLayout) this.b).K && (view instanceof v5)) {
            v5 v5Var = (v5) view;
            v5Var.x.d(v5Var);
        }
    }

    @Override // zf.l1
    public void i(int i10) {
        switch (this.a) {
            case 13:
                lp0 lp0Var = (lp0) this.b;
                op0 op0Var = lp0Var.K;
                lp0Var.s = i10;
                if (lp0Var.w != i10) {
                    lp0Var.d.clear();
                }
                int i11 = lp0Var.J;
                if (lp0Var.b() != 0 || lp0Var.e.e() || lp0Var.I) {
                    op0Var.p2.b(i11);
                } else {
                    op0Var.I1.e(false, true);
                }
                lp0Var.f();
                int i12 = op0.Q2;
                op0Var.K0(true);
                break;
            default:
                ba baVar = (ba) this.b;
                if (!baVar.r && i10 == baVar.J) {
                    baVar.i0(baVar.N.getText().toString().trim());
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l61
    public void invalidate() {
        ((q1) ((j1) this.b).b).invalidate();
    }

    @Override // org.telegram.ui.Components.wk0
    public boolean j(int i10) {
        ef M = ((ChatAttachAlertPhotoLayout) this.b).G.M(i10);
        return M != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(M.C));
    }

    @Override // s4.i1
    public int k(View view) {
        return n0.z(view) - ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).topMargin;
    }

    public ea l() {
        ig.i1 i1Var = (ig.i1) this.b;
        n6.l.i("no included points", !Double.isNaN(i1Var.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(i1Var.b, i1Var.d), new LatLng(i1Var.c, i1Var.e));
        ea eaVar = new ea();
        eaVar.a = latLngBounds;
        return eaVar;
    }

    public void n(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            i0.r(runnable2);
        }
    }

    @Override // l2.i
    public long o(long j10, long j11) {
        return 0L;
    }

    @Override // r4.c
    public void p() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void q() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            i0.r((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    @Override // r4.c
    public void r(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i10);
    }

    @Override // s4.i1
    public int s() {
        return ((n0) this.b).G();
    }

    @Override // l2.i
    public boolean t() {
        return true;
    }

    @Override // l2.i
    public long u() {
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0360, code lost:
    
        if (r10.equals("HOME") == false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewGroup v(Context context, int i10) {
        boolean z10;
        String str;
        td0 td0Var;
        h0 h0Var;
        int i11;
        String L0;
        String str2;
        vd0 vd0Var = (vd0) this.b;
        ArrayList arrayList = vd0Var.C1;
        ArrayList arrayList2 = vd0Var.D1;
        boolean z11 = i10 != 0;
        if (z11) {
            td0 td0Var2 = new td0(context);
            TextView textView = new TextView(context);
            td0Var2.a = textView;
            int i12 = t6.G6;
            int i13 = vd0.F1;
            p6 p6Var = vd0Var.I0;
            boolean z12 = vd0Var.A1;
            a7.V(textView, i12, p6Var);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((cd.X ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = cd.X;
            td0Var2.addView(textView, b6.d(-1, -1.0f, (z13 ? 5 : 3) | 48, z13 ? z12 ? 17 : 64 : 72.0f, 10.0f, z13 ? 72.0f : z12 ? 17 : 64, 0.0f));
            TextView textView2 = new TextView(context);
            td0Var2.b = textView2;
            a7.V(textView2, t6.z6, vd0Var.I0);
            z20.o(textView2, 1, 13.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity(cd.X ? 5 : 3);
            boolean z14 = cd.X;
            td0Var2.addView(textView2, b6.d(-2, -2.0f, z14 ? 5 : 3, z14 ? z12 ? 17 : 64 : 72.0f, 35.0f, z14 ? 72.0f : z12 ? 17 : 64, 0.0f));
            ImageView imageView = new ImageView(context);
            td0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            a7.t(imageView, t6.m6, vd0Var.I0, PorterDuff.Mode.MULTIPLY);
            boolean z15 = cd.X;
            td0Var2.addView(imageView, b6.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            td0Var = td0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                td0Var2.d = r92;
                int i14 = t6.M6;
                int i15 = t6.N6;
                int i16 = t6.d6;
                r92.d(i14, i15, i16, i16);
                td0Var2.addView(r92, b6.d(37, 40.0f, (cd.X ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                td0Var = td0Var2;
            }
        } else {
            ?? ud0Var = new ud0(context);
            ud0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = vd0Var.E1;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((h0) arrayList2.get(0)).c(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z10 = true;
                    str = null;
                } else {
                    str = cd.d0(vd0Var.a, tL_userContact_old2, null, null);
                    z10 = true;
                }
            }
            r8 r8Var = new r8((p6) null);
            r8Var.u(i0.L(30.0f));
            r8Var.r(tL_userContact_old2);
            g9 g9Var = new g9(context);
            g9Var.setRoundRadius(i0.L(40.0f));
            g9Var.e(tL_userContact_old2, r8Var);
            ud0Var.addView(g9Var, b6.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            z20.n(textView3, 1, 17.0f);
            a7.V(textView3, t6.j5, vd0Var.I0);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(i5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            ud0Var.addView(textView3, b6.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            td0Var = ud0Var;
            if (str != null) {
                TextView g10 = m5.g(context, 1, 14.0f);
                a7.V(g10, t6.r5, vd0Var.I0);
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                ud0Var.addView(g10, b6.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                td0Var = ud0Var;
            }
        }
        if (z11) {
            td0 td0Var3 = td0Var;
            int i17 = vd0Var.w1;
            char c10 = 2;
            if (i10 < i17 || i10 >= vd0Var.x1) {
                h0Var = (h0) arrayList.get(i10 - vd0Var.y1);
                int i18 = h0Var.c;
                if (i18 == 1) {
                    i11 = R.drawable.msg_mention;
                } else if (i18 == 2) {
                    i11 = R.drawable.msg_location;
                } else if (i18 == 3) {
                    i11 = R.drawable.msg_link;
                } else {
                    if (i18 != 4) {
                        if (i18 == 5) {
                            i11 = R.drawable.msg_calendar2;
                        } else if (i18 == 6) {
                            i11 = "ORG".equalsIgnoreCase(h0Var.a(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle;
                        }
                    }
                    i11 = R.drawable.msg_info;
                }
            } else {
                h0Var = (h0) arrayList2.get(i10 - i17);
                i11 = R.drawable.msg_calls;
            }
            boolean z16 = i10 != vd0Var.v1 - 1;
            ImageView imageView2 = td0Var3.c;
            td0Var3.a.setText(h0Var.c(true));
            TextView textView4 = td0Var3.b;
            int i19 = h0Var.c;
            if (i19 == 4) {
                str2 = cd.L0(2131751787, null);
            } else if (i19 == 3) {
                str2 = cd.L0(2131751781, null);
            } else if (i19 == 5) {
                str2 = cd.L0(2131751803, null);
            } else if (i19 == 6) {
                str2 = "ORG".equalsIgnoreCase(h0Var.a(true)) ? cd.L0(2131751792, null) : cd.L0(2131751791, null);
            } else {
                int indexOf = h0Var.b.indexOf(58);
                if (indexOf < 0) {
                    str2 = "";
                } else {
                    String substring = h0Var.b.substring(0, indexOf);
                    if (h0Var.c != 20) {
                        String[] split = substring.split(";");
                        for (int i20 = 0; i20 < split.length; i20++) {
                            if (split[i20].indexOf(61) < 0) {
                                substring = split[i20];
                            }
                        }
                        String substring2 = substring.startsWith("X-") ? substring.substring(2) : substring;
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case -2015525726:
                                if (substring2.equals("MOBILE")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2064738:
                                if (substring2.equals("CELL")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2223327:
                                break;
                            case 2464291:
                                if (substring2.equals("PREF")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2670353:
                                if (substring2.equals("WORK")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 75532016:
                                if (substring2.equals("OTHER")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                L0 = cd.L0(2131747307, null);
                                break;
                            case 2:
                                L0 = cd.L0(2131747309, null);
                                break;
                            case 3:
                                L0 = cd.L0(2131747308, null);
                                break;
                            case 4:
                                L0 = cd.L0(2131747297, null);
                                break;
                            case 5:
                                L0 = cd.L0(2131747298, null);
                                break;
                            default:
                                L0 = substring2;
                                break;
                        }
                    } else {
                        L0 = substring.substring(2).split(";")[0];
                    }
                    str2 = L0.substring(0, 1).toUpperCase() + L0.substring(1).toLowerCase();
                }
            }
            textView4.setText(str2);
            Switch r82 = td0Var3.d;
            if (r82 != null) {
                r82.c(h0Var.d, false);
            }
            imageView2.setImageResource(i11);
            td0Var3.e = z16;
            td0Var3.setWillNotDraw(!z16);
        }
        return td0Var;
    }

    @Override // org.telegram.ui.Components.v90
    public Paint.FontMetricsInt w() {
        return ((vh.k) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // zf.l1
    public /* synthetic */ a0.h x() {
        switch (this.a) {
        }
        return null;
    }

    @Override // s4.i1
    public int y() {
        n0 n0Var = (n0) this.b;
        return n0Var.n - n0Var.C();
    }

    @Override // l2.i
    public long z(long j10) {
        return 1L;
    }

    public /* synthetic */ t(s6.g gVar, s6.a aVar) {
        this.a = 25;
        this.b = aVar;
    }

    public t(int i10) {
        this.a = i10;
        switch (i10) {
            case 5:
                break;
            case 12:
                this.b = new HashMap();
                break;
            case 26:
                this.b = new m4.c[sf.b.values().length];
                break;
            default:
                this.b = new SparseArray();
                break;
        }
    }

    public t(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 18;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public t(ArrayList arrayList) {
        this.a = 22;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public t(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = 27;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new t0.g(uri, clipDescription, uri2);
        } else {
            this.b = new q5.d(uri, clipDescription, uri2, 6);
        }
    }

    public t(Context context, r10 r10Var) {
        this.a = 10;
        this.b = new q10(context, r10Var);
    }

    private final /* synthetic */ void G(ArrayList arrayList) {
    }

    private final /* synthetic */ void H(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.v90
    public /* synthetic */ void X(String str) {
    }

    @Override // l2.i
    public long c(long j10, long j11) {
        return j11;
    }

    @Override // org.telegram.ui.Components.v90
    public /* synthetic */ void L(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.v90
    public /* synthetic */ void m(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }
}
