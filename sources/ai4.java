// default package

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ai4 implements fq7, mn4, r9, vj5, y70, g94, zv7, u40, d99, u78, kt9, ldc, wec, rd9 {
    public final /* synthetic */ byte a;
    public Object b;

    public ai4(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
            case 24:
                this.b = new k6d((byte) 25);
                break;
            default:
                this.b = mo5.p();
                break;
        }
    }

    public static boolean G(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String Z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // wec
    public final int A(View view) {
        return f69.y(view) - ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).topMargin;
    }

    @Override // d99
    public final void B() {
        z8b z8bVar = (z8b) this.b;
        if (z8bVar.S0) {
            z8bVar.S0 = false;
        } else {
            z8bVar.a1.b(1);
            z8bVar.s((u11) u11.a.get(0));
        }
    }

    @Override // u40
    public final void C() {
        l74 l74Var = ((im6) this.b).Y;
        if (l74Var != null) {
            l74Var.a.j0 = true;
        }
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        ((x66) this.b).h(f);
    }

    @Override // wec
    public final int E() {
        return ((f69) this.b).F();
    }

    @Override // rd9
    public final void E1() {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null) {
            ch9 ch9Var = wg9Var.a;
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.g();
            }
            ch9Var.p3.onContentChanged();
        }
    }

    @Override // d99
    public final boolean F() {
        z8b z8bVar = (z8b) this.b;
        boolean z = z8bVar.z0 == null;
        if (!z) {
            z8bVar.D0(null, true);
        }
        return z;
    }

    public final void H(Exception exc) {
        p pVar = (p) this.b;
        if (pVar.R0) {
            return;
        }
        pVar.N0(true, false);
        pVar.J0(false);
        if ((exc instanceof e1) || (exc instanceof f1)) {
            ik.t0(jb6.M0(2131747137, null), pVar);
        } else {
            ik.t0(exc.getMessage(), pVar);
        }
    }

    @Override // rd9
    public final gkb H0() {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null) {
            return wg9Var.a.getTextSelectionHelper();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        qu4 qu4Var;
        boolean z2;
        pu4 pu4Var = (pu4) this.b;
        int i = pu4.w;
        qu4 qu4Var2 = pu4Var.f;
        c1 c1Var = pu4Var.e;
        int action = motionEvent.getAction();
        VelocityTracker velocityTracker = pu4Var.v;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            pu4Var.v = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int i2 = action & nm7.d4;
        boolean z3 = i2 == 6;
        int actionIndex = z3 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (actionIndex != i3) {
                f = motionEvent.getX(i3) + f;
                f2 = motionEvent.getY(i3) + f2;
            }
        }
        float f3 = z3 ? pointerCount - 1 : pointerCount;
        float f4 = f / f3;
        float f5 = f2 / f3;
        if (i2 == 0) {
            if (pu4Var.g != null && qu4Var2.a()) {
                boolean hasMessages = c1Var.hasMessages(3);
                if (hasMessages) {
                    c1Var.removeMessages(3);
                }
                MotionEvent motionEvent4 = pu4Var.m;
                if (motionEvent4 != null && (motionEvent3 = pu4Var.n) != null && hasMessages && pu4Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y * y) + (x * x) < pu4Var.b) {
                        pu4Var.o = true;
                        z = pu4Var.g.onDoubleTap(pu4Var.m) | pu4Var.g.onDoubleTapEvent(motionEvent);
                        pu4Var.p = f4;
                        pu4Var.r = f4;
                        pu4Var.q = f5;
                        pu4Var.s = f5;
                        motionEvent2 = pu4Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        pu4Var.m = MotionEvent.obtain(motionEvent);
                        pu4Var.k = true;
                        pu4Var.l = true;
                        pu4Var.h = true;
                        pu4Var.j = false;
                        pu4Var.i = false;
                        if (pu4Var.t) {
                            c1Var.removeMessages(2);
                            c1Var.sendEmptyMessageAtTime(2, pu4Var.m.getDownTime() + i + pu4Var.u);
                        }
                        c1Var.sendEmptyMessageAtTime(1, pu4Var.m.getDownTime() + i);
                        return z | qu4Var2.onDown(motionEvent);
                    }
                }
                c1Var.sendEmptyMessageDelayed(3, 220L);
            }
            z = false;
            pu4Var.p = f4;
            pu4Var.r = f4;
            pu4Var.q = f5;
            pu4Var.s = f5;
            motionEvent2 = pu4Var.m;
            if (motionEvent2 != null) {
            }
            pu4Var.m = MotionEvent.obtain(motionEvent);
            pu4Var.k = true;
            pu4Var.l = true;
            pu4Var.h = true;
            pu4Var.j = false;
            pu4Var.i = false;
            if (pu4Var.t) {
            }
            c1Var.sendEmptyMessageAtTime(1, pu4Var.m.getDownTime() + i);
            return z | qu4Var2.onDown(motionEvent);
        }
        if (i2 == 1) {
            pu4Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (pu4Var.o) {
                onFling = pu4Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (pu4Var.j) {
                    c1Var.removeMessages(3);
                    pu4Var.j = false;
                } else if (pu4Var.k) {
                    boolean onSingleTapUp = qu4Var2.onSingleTapUp(motionEvent);
                    if (pu4Var.i && (qu4Var = pu4Var.g) != null) {
                        qu4Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker2 = pu4Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker2.computeCurrentVelocity(1000, pu4Var.d);
                    float yVelocity = velocityTracker2.getYVelocity(pointerId);
                    float xVelocity = velocityTracker2.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > pu4Var.c || Math.abs(xVelocity) > pu4Var.c) {
                        onFling = qu4Var2.onFling(pu4Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = pu4Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            pu4Var.n = obtain;
            VelocityTracker velocityTracker3 = pu4Var.v;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                pu4Var.v = null;
            }
            pu4Var.o = false;
            pu4Var.i = false;
            c1Var.removeMessages(1);
            c1Var.removeMessages(2);
            return onFling;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                c1Var.removeMessages(1);
                c1Var.removeMessages(2);
                c1Var.removeMessages(3);
                pu4Var.v.recycle();
                pu4Var.v = null;
                pu4Var.o = false;
                pu4Var.h = false;
                pu4Var.k = false;
                pu4Var.l = false;
                pu4Var.i = false;
                if (pu4Var.j) {
                    pu4Var.j = false;
                    return false;
                }
            } else if (i2 == 5) {
                pu4Var.p = f4;
                pu4Var.r = f4;
                pu4Var.q = f5;
                pu4Var.s = f5;
                c1Var.removeMessages(1);
                c1Var.removeMessages(2);
                c1Var.removeMessages(3);
                pu4Var.o = false;
                pu4Var.k = false;
                pu4Var.l = false;
                pu4Var.i = false;
                if (pu4Var.j) {
                    pu4Var.j = false;
                    return false;
                }
            } else if (i2 == 6) {
                pu4Var.p = f4;
                pu4Var.r = f4;
                pu4Var.q = f5;
                pu4Var.s = f5;
                pu4Var.v.computeCurrentVelocity(1000, pu4Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = pu4Var.v.getXVelocity(pointerId2);
                float yVelocity2 = pu4Var.v.getYVelocity(pointerId2);
                for (int i4 = 0; i4 < pointerCount; i4++) {
                    if (i4 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i4);
                        if ((pu4Var.v.getYVelocity(pointerId3) * yVelocity2) + (pu4Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            pu4Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!pu4Var.j) {
            float f6 = pu4Var.p - f4;
            float f7 = pu4Var.q - f5;
            if (pu4Var.o) {
                return pu4Var.g.onDoubleTapEvent(motionEvent);
            }
            if (pu4Var.k) {
                int i5 = (int) (f4 - pu4Var.r);
                int i6 = (int) (f5 - pu4Var.s);
                int i7 = (i6 * i6) + (i5 * i5);
                if (i7 > pu4Var.a) {
                    z2 = qu4Var2.onScroll(pu4Var.m, motionEvent, f6, f7);
                    pu4Var.p = f4;
                    pu4Var.q = f5;
                    pu4Var.k = false;
                    c1Var.removeMessages(3);
                    c1Var.removeMessages(1);
                    c1Var.removeMessages(2);
                } else {
                    z2 = false;
                }
                if (i7 > pu4Var.a) {
                    pu4Var.l = false;
                }
                return z2;
            }
            if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                boolean onScroll = qu4Var2.onScroll(pu4Var.m, motionEvent, f6, f7);
                pu4Var.p = f4;
                pu4Var.q = f5;
                return onScroll;
            }
        }
        return false;
    }

    public final Bundle J() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final byte K() {
        int read = ((h61) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // u40
    public final void L(nf5 nf5Var) {
        lx6 lx6Var = ((im6) this.b).b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new m40(lx6Var, nf5Var, (byte) 1));
        }
    }

    @Override // mn4
    public final Cursor M(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // wec
    public final int N() {
        f69 f69Var = (f69) this.b;
        return f69Var.n - f69Var.B();
    }

    @Override // zv7
    public final void O(float f) {
        gl6 gl6Var = (gl6) this.b;
        m58.e(gl6Var.a).k("-1", f);
        gl6Var.e.setBrushSize(f);
    }

    @Override // rd9
    public final void O0(CharSequence charSequence) {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        wg9Var.a.u4(charSequence.toString());
    }

    public final int P() {
        return ((K() & 255) << 24) | ((K() & 255) << 16) | ((K() & 255) << 8) | (K() & 255);
    }

    @Override // d99
    public final void Q() {
        z8b z8bVar = (z8b) this.b;
        z8bVar.t0.a.h();
        z8bVar.T0.setViewHidden(false);
    }

    public final int R() {
        return ((K() & Byte.MAX_VALUE) << 21) | ((K() & Byte.MAX_VALUE) << 14) | ((K() & Byte.MAX_VALUE) << 7) | (K() & Byte.MAX_VALUE);
    }

    public final void S(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // d99
    public final void T() {
        z8b z8bVar = (z8b) this.b;
        if (z8bVar.z0 != null) {
            z8bVar.D0(null, true);
        }
        z8bVar.T0.setViewHidden(true);
    }

    @Override // g94
    public final void V(float f, int i) {
        ((x66) this.b).h(f);
    }

    public final void W(long j) {
        long j2 = 0;
        while (j2 < j) {
            long skip = ((h61) this.b).skip(j - j2);
            if (skip <= 0) {
                throw new EOFException();
            }
            j2 += skip;
        }
    }

    @Override // u40
    public final void X() {
        ((im6) this.b).u();
    }

    @Override // wec
    public final View Y(int i) {
        return ((f69) this.b).q(i);
    }

    @Override // rd9
    public final fkb Y0() {
        return (id9) this.b;
    }

    @Override // kt9
    public final void a(int i, boolean z) {
        d88 d88Var = (d88) this.b;
        c88[] c88VarArr = d88Var.n;
        if (c88VarArr[0].b == i) {
            return;
        }
        d88Var.e = i == d88Var.h.getFirstTabId();
        c88 c88Var = c88VarArr[1];
        c88Var.b = i;
        c88Var.setVisibility(0);
        d88Var.o0(true);
        d88Var.w = z;
        r7 r7Var = d88Var.c;
        if (i == 0) {
            r7Var.setSearchFieldHint(jb6.M0(2131745495, null));
        } else {
            r7Var.setSearchFieldHint(jb6.M0(2131745498, null));
        }
    }

    @Override // wec
    public final int a0(View view) {
        return f69.v(view) + ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).bottomMargin;
    }

    @Override // u40
    public final void b(int i) {
        bi6 bi6Var;
        im6 im6Var = (im6) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (bi6Var = im6Var.d1) != null) {
            bi6Var.d(i);
        }
        lx6 lx6Var = im6Var.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new eh((Object) lx6Var, i, (byte) 4));
        }
    }

    @Override // u78
    public final boolean c() {
        return true;
    }

    @Override // mn4
    public final void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // rd9
    public final void d(ne9 ne9Var) {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null) {
            ch9 ch9Var = wg9Var.a;
            ch9Var.i4(ne9Var);
            ch9Var.p3.j(ne9Var, true);
        }
    }

    @Override // rd9
    public final ll0 d1() {
        return ((id9) this.b).a;
    }

    @Override // y70
    public final void dismiss() {
        switch (this.a) {
            case 6:
                ((uc5) this.b).x.d(true);
                break;
            default:
                ((ProfileActivity) this.b).T0.U(null, null);
                break;
        }
    }

    @Override // u78
    public final void e() {
        j68 j68Var = (j68) this.b;
        int size = j68Var.b.size();
        sb sbVar = j68Var.R;
        if (size != 0) {
            sbVar.invalidate();
            j68Var.b0(true);
        } else {
            sbVar.setPivotX(0.0f);
            j68Var.R.setPivotY(0.0f);
            j68Var.b0(false);
        }
    }

    @Override // u40
    public final void f(boolean z) {
        lx6 lx6Var = ((im6) this.b).b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new y8c((byte) 3, lx6Var, z));
        }
    }

    @Override // u40
    public final void f0(Exception exc) {
        ncd.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        lx6 lx6Var = ((im6) this.b).b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new j40(lx6Var, exc, (byte) 1));
        }
    }

    @Override // kt9
    public final void g(float f) {
        d88 d88Var = (d88) this.b;
        c88[] c88VarArr = d88Var.n;
        if (f != 1.0f || c88VarArr[1].getVisibility() == 0) {
            if (d88Var.w) {
                c88VarArr[0].setTranslationX((-f) * r6.getMeasuredWidth());
                c88VarArr[1].setTranslationX(c88VarArr[0].getMeasuredWidth() - (f * c88VarArr[0].getMeasuredWidth()));
            } else {
                c88VarArr[0].setTranslationX(r6.getMeasuredWidth() * f);
                c88VarArr[1].setTranslationX((f * c88VarArr[0].getMeasuredWidth()) - c88VarArr[0].getMeasuredWidth());
            }
            if (f == 1.0f) {
                c88 c88Var = c88VarArr[0];
                c88VarArr[0] = c88VarArr[1];
                c88VarArr[1] = c88Var;
                c88Var.setVisibility(8);
            }
        }
    }

    @Override // rd9
    public final boolean g1() {
        wg9 wg9Var = ((id9) this.b).P;
        return wg9Var != null && wg9Var.a.V4();
    }

    @Override // zv7
    public final float get() {
        gl6 gl6Var = (gl6) this.b;
        u11 currentBrush = gl6Var.e.getCurrentBrush();
        int i = gl6Var.a;
        return currentBrush == null ? m58.e(i).i : m58.e(i).f("-1", currentBrush.c());
    }

    @Override // u40
    public final void h(long j) {
        im6 im6Var = (im6) this.b;
        im6Var.o1 = true;
        lx6 lx6Var = im6Var.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new fu((Object) lx6Var, j, (byte) 2));
        }
    }

    @Override // u78
    public final void i(Editable editable) {
        j68 j68Var = (j68) this.b;
        cv3 cv3Var = j68Var.N;
        j68Var.a = editable;
        cv3Var.setText(editable);
    }

    @Override // u40
    public final void i0() {
        ((im6) this.b).l1 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (r2 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r2 == 3) goto L18;
     */
    @Override // fq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1(Object obj) {
        Integer num = (Integer) obj;
        di4 di4Var = (di4) this.b;
        Handler handler = di4Var.B0;
        o04 o04Var = di4Var.C0;
        handler.removeCallbacks(o04Var);
        int intValue = num.intValue();
        if (di4Var.G0 != null) {
            int i = di4Var.D0.w;
            Context n = di4Var.n();
            Drawable drawable = null;
            if (n == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i2 = R.drawable.fingerprint_dialog_fp_icon;
                if (i != 0 || intValue != 1) {
                    if (i == 1 && intValue == 2) {
                        i2 = R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i == 2) {
                        }
                        if (i == 1) {
                        }
                    }
                }
                drawable = n.getDrawable(i2);
            }
            if (drawable != null) {
                di4Var.G0.setImageDrawable(drawable);
                if ((i != 0 || intValue != 1) && ((i == 1 && intValue == 2) || (i == 2 && intValue == 1))) {
                    bi4.a(drawable);
                }
                di4Var.D0.w = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = di4Var.H0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? di4Var.E0 : di4Var.F0);
        }
        handler.postDelayed(o04Var, 2000L);
    }

    @Override // rd9
    public final void j2() {
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var != null) {
            wg9Var.a.W3();
        }
    }

    @Override // u78
    public final void k(int i, boolean z, boolean z2) {
        j68 j68Var = (j68) this.b;
        j68Var.removeSelfFromStack();
        if (z) {
            return;
        }
        j68Var.a0(j68Var.b, j68Var.c, z2, i);
    }

    @Override // y70
    public final void l(int i, int i2) {
        switch (this.a) {
            case 6:
                uc5 uc5Var = (uc5) this.b;
                uc5Var.X = i;
                gm.V3(uc5Var.b);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                RectF rectF = ProfileActivity.e7;
                long a = profileActivity.a();
                profileActivity.getMessagesController().P4(i, a);
                if (profileActivity.w2 != null || profileActivity.v2 != null) {
                    UndoView undoView = profileActivity.M;
                    TLRPC.User W1 = profileActivity.getMessagesController().W1(Long.valueOf(a));
                    TLRPC.UserFull userFull = profileActivity.w2;
                    undoView.k(a, i2, W1, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.v2.ttl_period), null, null);
                    break;
                }
                break;
        }
    }

    @Override // r9
    public final void m(Object obj) {
        q9 q9Var = (q9) obj;
        hq4 hq4Var = (hq4) this.b;
        dq4 dq4Var = (dq4) hq4Var.F.pollLast();
        if (dq4Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = dq4Var.a;
        int i = dq4Var.b;
        dp4 o = hq4Var.c.o(str);
        if (o != null) {
            o.x(i, q9Var.a, q9Var.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // y70
    public final void n() {
        switch (this.a) {
            case 6:
                break;
            default:
                ((ProfileActivity) this.b).presentFragment(new v70());
                dismiss();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05c2 A[Catch: ho4 | rh2 -> 0x0653, TryCatch #1 {ho4 | rh2 -> 0x0653, blocks: (B:287:0x05a8, B:288:0x05be, B:290:0x05c2, B:291:0x05c5, B:293:0x05c9, B:295:0x05d3, B:297:0x05d9, B:302:0x05de), top: B:286:0x05a8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final in3 o(lx6 lx6Var) {
        wh4 wh4Var;
        wh4 wh4Var2;
        wh4 wh4Var3;
        float f;
        float f2;
        kk kkVar;
        float f3;
        float f4;
        float f5;
        byte b;
        wc9[] wc9VarArr;
        rh2 rh2Var;
        ho4 e;
        qk0 qk0Var;
        int i;
        oa3 oa3Var;
        int i2;
        k1f k1fVar;
        in3 in3Var;
        ArrayList arrayList;
        String str;
        int i3;
        boolean z;
        double d;
        double abs;
        int i4;
        int i5;
        int i6;
        k6d k6dVar = (k6d) this.b;
        qk0 qk0Var2 = (qk0) lx6Var.c;
        if (qk0Var2 == null) {
            qk0Var2 = ((mx6) lx6Var.b).J();
            lx6Var.c = qk0Var2;
        }
        sz4 sz4Var = new sz4(qk0Var2);
        int i7 = 0;
        yh4 yh4Var = new yh4(qk0Var2, (byte) 0);
        ArrayList arrayList2 = (ArrayList) yh4Var.c;
        int i8 = qk0Var2.b;
        int i9 = qk0Var2.a;
        int i10 = (i8 * 3) / 388;
        int i11 = 3;
        if (i10 < 3) {
            i10 = 3;
        }
        char c = 5;
        int[] iArr = new int[5];
        int i12 = i10 - 1;
        boolean z2 = false;
        while (true) {
            int i13 = 4;
            char c2 = c;
            int i14 = 1;
            if (i12 >= i8 || z2) {
                break;
            }
            Arrays.fill(iArr, i7);
            int i15 = i11;
            int i16 = i7;
            while (i16 < i9) {
                int i17 = i7 & 1;
                if (qk0Var2.b(i16, i12)) {
                    if (i17 == i14) {
                        i7++;
                    }
                    iArr[i7] = iArr[i7] + i14;
                    i4 = i13;
                } else if (i17 != 0) {
                    i4 = i13;
                    iArr[i7] = iArr[i7] + 1;
                } else if (i7 == i13) {
                    if (!yh4.s(iArr)) {
                        i4 = i13;
                        int i18 = i14;
                        iArr[0] = iArr[2];
                        iArr[i18] = iArr[i15];
                        iArr[2] = iArr[i4];
                        iArr[i15] = i18;
                        iArr[i4] = 0;
                    } else if (yh4Var.w(i12, i16, iArr)) {
                        if (yh4Var.a) {
                            z2 = yh4Var.x();
                            i4 = i13;
                            i5 = 2;
                        } else {
                            if (arrayList2.size() > i14) {
                                int size = arrayList2.size();
                                int i19 = 0;
                                wh4 wh4Var4 = null;
                                while (true) {
                                    if (i19 >= size) {
                                        i4 = i13;
                                        i5 = 2;
                                        i6 = 0;
                                        break;
                                    }
                                    Object obj = arrayList2.get(i19);
                                    i19++;
                                    i4 = i13;
                                    wh4 wh4Var5 = (wh4) obj;
                                    int i20 = size;
                                    if (wh4Var5.d >= 2) {
                                        if (wh4Var4 != null) {
                                            yh4Var.a = true;
                                            i5 = 2;
                                            i6 = ((int) (Math.abs(wh4Var4.a - wh4Var5.a) - Math.abs(wh4Var4.b - wh4Var5.b))) / 2;
                                            break;
                                        }
                                        wh4Var4 = wh4Var5;
                                    }
                                    i13 = i4;
                                    size = i20;
                                }
                            } else {
                                i4 = i13;
                                i6 = 0;
                                i5 = 2;
                            }
                            if (i6 > iArr[i5]) {
                                i12 += (i6 - r8) - 2;
                                i16 = i9 - 1;
                            }
                        }
                        i7 = 0;
                        Arrays.fill(iArr, 0);
                        i10 = i5;
                    } else {
                        i4 = i13;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i15];
                        iArr[2] = iArr[i4];
                        iArr[i15] = 1;
                        iArr[i4] = 0;
                    }
                    i7 = i15;
                } else {
                    i4 = i13;
                    i7++;
                    iArr[i7] = iArr[i7] + 1;
                }
                i16++;
                i13 = i4;
                i14 = 1;
            }
            if (yh4.s(iArr) && yh4Var.w(i12, i9, iArr)) {
                int i21 = iArr[0];
                if (yh4Var.a) {
                    z2 = yh4Var.x();
                }
                i10 = i21;
            }
            i12 += i10;
            c = c2;
            i11 = i15;
            i7 = 0;
        }
        if (arrayList2.size() < i11) {
            throw xl7.a();
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((wh4) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList2, yh4.e);
        wh4[] wh4VarArr = new wh4[3];
        int i22 = 0;
        double d2 = Double.MAX_VALUE;
        for (int i23 = 2; i22 < arrayList2.size() - i23; i23 = 2) {
            wh4 wh4Var6 = (wh4) arrayList2.get(i22);
            float f6 = wh4Var6.c;
            i22++;
            int i24 = i22;
            while (i24 < arrayList2.size() - 1) {
                wh4 wh4Var7 = (wh4) arrayList2.get(i24);
                double K = yh4.K(wh4Var6, wh4Var7);
                i24++;
                for (int i25 = i24; i25 < arrayList2.size(); i25++) {
                    wh4 wh4Var8 = (wh4) arrayList2.get(i25);
                    if (wh4Var8.c <= 1.4f * f6) {
                        double K2 = yh4.K(wh4Var7, wh4Var8);
                        double K3 = yh4.K(wh4Var6, wh4Var8);
                        if (K < K2) {
                            if (K2 <= K3) {
                                K3 = K2;
                                K2 = K3;
                            } else if (K >= K3) {
                                d = K3;
                                K3 = K;
                                abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                                if (abs >= d2) {
                                    wh4VarArr[0] = wh4Var6;
                                    wh4VarArr[1] = wh4Var7;
                                    wh4VarArr[2] = wh4Var8;
                                    d2 = abs;
                                }
                            }
                            d = K;
                            abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                            if (abs >= d2) {
                            }
                        } else {
                            if (K2 < K3) {
                                d = K2;
                                if (K < K3) {
                                    K2 = K3;
                                    K3 = K;
                                    abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                                    if (abs >= d2) {
                                    }
                                }
                            } else {
                                d = K3;
                                K3 = K2;
                            }
                            K2 = K;
                            abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                            if (abs >= d2) {
                            }
                        }
                    }
                }
            }
        }
        if (d2 == Double.MAX_VALUE) {
            throw xl7.a();
        }
        float a = wc9.a(wh4VarArr[0], wh4VarArr[1]);
        float a2 = wc9.a(wh4VarArr[1], wh4VarArr[2]);
        float a3 = wc9.a(wh4VarArr[0], wh4VarArr[2]);
        if (a2 >= a && a2 >= a3) {
            wh4Var = wh4VarArr[0];
            wh4Var2 = wh4VarArr[1];
            wh4Var3 = wh4VarArr[2];
        } else if (a3 < a2 || a3 < a) {
            wh4Var = wh4VarArr[2];
            wh4Var2 = wh4VarArr[0];
            wh4Var3 = wh4VarArr[1];
        } else {
            wh4Var = wh4VarArr[1];
            wh4Var2 = wh4VarArr[0];
            wh4Var3 = wh4VarArr[2];
        }
        float f7 = wh4Var.a;
        float f8 = wh4Var.b;
        if (kt6.B(wh4Var2.a, f7, wh4Var3.b - f8, (wh4Var2.b - f8) * (wh4Var3.a - f7)) < 0.0f) {
            wh4 wh4Var9 = wh4Var3;
            wh4Var3 = wh4Var2;
            wh4Var2 = wh4Var9;
        }
        wh4VarArr[0] = wh4Var2;
        wh4VarArr[1] = wh4Var;
        wh4VarArr[2] = wh4Var3;
        float z3 = sz4Var.z(wh4Var, wh4Var3);
        float f9 = wh4Var.a;
        float f10 = wh4Var3.b;
        float f11 = wh4Var3.a;
        float z4 = sz4Var.z(wh4Var, wh4Var2);
        float f12 = wh4Var2.b;
        float f13 = wh4Var2.a;
        float f14 = (z4 + z3) / 2.0f;
        if (f14 < 1.0f) {
            throw xl7.a();
        }
        float a4 = wc9.a(wh4Var, wh4Var3) / f14;
        int i26 = (int) (a4 + (a4 < 0.0f ? -0.5f : 0.5f));
        float a5 = wc9.a(wh4Var, wh4Var2) / f14;
        int i27 = (((int) (a5 + (a5 >= 0.0f ? 0.5f : -0.5f))) + i26) / 2;
        int i28 = i27 + 7;
        int i29 = i28 & 3;
        if (i29 == 0) {
            i28 = i27 + 8;
        } else if (i29 == 2) {
            i28 = i27 + 6;
        } else if (i29 == 3) {
            i28 = i27 + 5;
        }
        int i30 = i28;
        int[] iArr2 = ybc.e;
        if (i30 % 4 != 1) {
            throw ho4.a();
        }
        try {
            ybc c3 = ybc.c((i30 - 17) / 4);
            int i31 = (c3.a << 2) + 10;
            if (c3.b.length > 0) {
                float f15 = (f11 - f9) + f13;
                f2 = f11;
                float f16 = (f10 - f8) + f12;
                float f17 = 1.0f - (3.0f / i31);
                int A = (int) td4.A(f15, f9, f17, f9);
                int A2 = (int) td4.A(f16, f8, f17, f8);
                f = f9;
                for (int i32 = 4; i32 <= 16; i32 <<= 1) {
                    try {
                        kkVar = sz4Var.C(f14, i32, A, A2);
                        break;
                    } catch (xl7 unused) {
                    }
                }
            } else {
                f = f9;
                f2 = f11;
            }
            kkVar = null;
            float f18 = i30 - 3.5f;
            if (kkVar != null) {
                f3 = kkVar.a;
                f4 = kkVar.b;
                f5 = f18 - 3.0f;
            } else {
                f3 = (f2 - f) + f13;
                f4 = (f10 - f8) + f12;
                f5 = f18;
            }
            float f19 = f4;
            float f20 = wh4Var.a;
            float f21 = wh4Var.b;
            float f22 = wh4Var3.a;
            float f23 = wh4Var3.b;
            float f24 = wh4Var2.a;
            float f25 = wh4Var2.b;
            o58 a6 = o58.a(3.5f, 3.5f, f18, 3.5f, f5, f5, 3.5f, f18);
            kk kkVar2 = kkVar;
            float f26 = a6.e;
            float f27 = a6.i;
            float f28 = f26 * f27;
            float f29 = a6.f;
            float f30 = a6.h;
            float f31 = f28 - (f29 * f30);
            float f32 = a6.g;
            float f33 = f29 * f32;
            float f34 = a6.d;
            float f35 = f33 - (f34 * f27);
            float f36 = (f34 * f30) - (f26 * f32);
            float f37 = a6.c;
            float f38 = f37 * f30;
            float f39 = a6.b;
            float f40 = f38 - (f39 * f27);
            float f41 = a6.a;
            float f42 = (f27 * f41) - (f37 * f32);
            float f43 = (f32 * f39) - (f30 * f41);
            float f44 = (f39 * f29) - (f37 * f26);
            float f45 = (f37 * f34) - (f29 * f41);
            float f46 = (f41 * f26) - (f39 * f34);
            o58 a7 = o58.a(f20, f21, f22, f23, f3, f19, f24, f25);
            float f47 = a7.a;
            float f48 = a7.d;
            float f49 = a7.g;
            float f50 = (f49 * f44) + (f48 * f40) + (f47 * f31);
            float f51 = (f49 * f45) + (f48 * f42) + (f47 * f35);
            float f52 = (f49 * f46) + (f48 * f43) + (f47 * f36);
            float f53 = a7.b;
            float f54 = a7.e;
            float f55 = a7.h;
            float f56 = (f55 * f44) + (f54 * f40) + (f53 * f31);
            float f57 = (f55 * f45) + (f54 * f42) + (f53 * f35);
            float f58 = (f55 * f46) + (f54 * f43) + (f53 * f36);
            float f59 = a7.c;
            float f60 = a7.f;
            float f61 = a7.i;
            float f62 = (f44 * f61) + (f40 * f60) + (f31 * f59);
            float f63 = (f45 * f61) + (f42 * f60) + (f35 * f59);
            float f64 = (f61 * f46) + (f60 * f43) + (f59 * f36);
            if (i30 <= 0 || i30 <= 0) {
                throw xl7.a();
            }
            qk0 qk0Var3 = new qk0(i30, i30);
            int i33 = i30 << 1;
            wh4 wh4Var10 = wh4Var;
            float[] fArr = new float[i33];
            int i34 = 0;
            while (i34 < i30) {
                int i35 = i30;
                float f65 = i34 + 0.5f;
                int i36 = 0;
                while (i36 < i33) {
                    int i37 = i36;
                    fArr[i37] = (i37 / 2) + 0.5f;
                    fArr[i37 + 1] = f65;
                    i36 = i37 + 2;
                }
                int i38 = i33 - 1;
                wh4 wh4Var11 = wh4Var2;
                int i39 = 0;
                while (i39 < i38) {
                    float f66 = fArr[i39];
                    int i40 = i39 + 1;
                    int i41 = i39;
                    float f67 = fArr[i40];
                    wh4 wh4Var12 = wh4Var3;
                    float i42 = ts2.i(f63, f67, f62 * f66, f64);
                    fArr[i41] = (((f51 * f67) + (f50 * f66)) + f52) / i42;
                    fArr[i40] = (((f67 * f57) + (f66 * f56)) + f58) / i42;
                    i39 = i41 + 2;
                    wh4Var3 = wh4Var12;
                }
                wh4 wh4Var13 = wh4Var3;
                int i43 = qk0Var2.b;
                float f68 = f63;
                int i44 = 0;
                boolean z5 = true;
                while (i44 < i38 && z5) {
                    int i45 = (int) fArr[i44];
                    int i46 = i44 + 1;
                    int i47 = i38;
                    int i48 = (int) fArr[i46];
                    int i49 = i44;
                    if (i45 < -1 || i45 > i9 || i48 < -1 || i48 > i43) {
                        throw xl7.a();
                    }
                    if (i45 == -1) {
                        fArr[i49] = 0.0f;
                    } else if (i45 == i9) {
                        fArr[i49] = i9 - 1;
                    } else {
                        z = false;
                        if (i48 != -1) {
                            fArr[i46] = 0.0f;
                        } else if (i48 == i43) {
                            fArr[i46] = i43 - 1;
                        } else {
                            z5 = z;
                            i44 = i49 + 2;
                            i38 = i47;
                        }
                        z5 = true;
                        i44 = i49 + 2;
                        i38 = i47;
                    }
                    z = true;
                    if (i48 != -1) {
                    }
                    z5 = true;
                    i44 = i49 + 2;
                    i38 = i47;
                }
                int i50 = i33 - 2;
                boolean z6 = true;
                while (i50 >= 0 && z6) {
                    int i51 = (int) fArr[i50];
                    int i52 = i50 + 1;
                    int i53 = i50;
                    int i54 = (int) fArr[i52];
                    if (i51 < -1 || i51 > i9 || i54 < -1 || i54 > i43) {
                        throw xl7.a();
                    }
                    if (i51 == -1) {
                        fArr[i53] = 0.0f;
                    } else if (i51 == i9) {
                        fArr[i53] = i9 - 1;
                    } else {
                        z6 = false;
                        if (i54 != -1) {
                            fArr[i52] = 0.0f;
                        } else if (i54 == i43) {
                            fArr[i52] = i43 - 1;
                        } else {
                            i50 = i53 - 2;
                        }
                        z6 = true;
                        i50 = i53 - 2;
                    }
                    z6 = true;
                    if (i54 != -1) {
                    }
                    z6 = true;
                    i50 = i53 - 2;
                }
                for (int i55 = 0; i55 < i33; i55 += 2) {
                    try {
                        if (qk0Var2.b((int) fArr[i55], (int) fArr[i55 + 1])) {
                            qk0Var3.c(i55 / 2, i34);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw xl7.a();
                    }
                }
                i34++;
                i30 = i35;
                wh4Var2 = wh4Var11;
                f63 = f68;
                wh4Var3 = wh4Var13;
            }
            wh4 wh4Var14 = wh4Var2;
            wh4 wh4Var15 = wh4Var3;
            if (kkVar2 == null) {
                b = 3;
                wc9VarArr = new wc9[]{wh4Var14, wh4Var10, wh4Var15};
            } else {
                b = 3;
                wc9VarArr = new wc9[]{wh4Var14, wh4Var10, wh4Var15, kkVar2};
            }
            wc9[] wc9VarArr2 = wc9VarArr;
            yh4 yh4Var2 = new yh4(qk0Var3, b);
            try {
                oa3Var = k6dVar.x(yh4Var2);
            } catch (ho4 e2) {
                e = e2;
                rh2Var = null;
                try {
                    yh4Var2.E();
                    yh4Var2.c = null;
                    yh4Var2.d = null;
                    yh4Var2.a = true;
                    yh4Var2.D();
                    yh4Var2.C();
                    qk0Var = (qk0) yh4Var2.b;
                    i = 0;
                    while (i < qk0Var.a) {
                        int i56 = i + 1;
                        for (int i57 = i56; i57 < qk0Var.b; i57++) {
                            if (qk0Var.b(i, i57) != qk0Var.b(i57, i)) {
                                qk0Var.a(i57, i);
                                qk0Var.a(i, i57);
                            }
                        }
                        i = i56;
                    }
                    oa3 x = k6dVar.x(yh4Var2);
                    x.e = new k1f((byte) 24);
                    oa3Var = x;
                    i2 = oa3Var.f;
                    k1fVar = oa3Var.e;
                    if (k1fVar != null) {
                    }
                    in3Var = new in3(oa3Var.a, wc9VarArr2);
                    arrayList = oa3Var.b;
                    if (arrayList != null) {
                    }
                    str = oa3Var.c;
                    if (str != null) {
                    }
                    if (i2 >= 0) {
                        in3Var.D(vc9.d, Integer.valueOf(i3));
                        in3Var.D(vc9.e, Integer.valueOf(i2));
                    }
                    in3Var.D(vc9.c, oa3Var.d);
                    in3Var.D(vc9.f, "]Q" + ((int) oa3Var.h));
                    return in3Var;
                } catch (ho4 | rh2 unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw rh2Var;
                }
            } catch (rh2 e3) {
                rh2Var = e3;
                e = null;
                yh4Var2.E();
                yh4Var2.c = null;
                yh4Var2.d = null;
                yh4Var2.a = true;
                yh4Var2.D();
                yh4Var2.C();
                qk0Var = (qk0) yh4Var2.b;
                i = 0;
                while (i < qk0Var.a) {
                }
                oa3 x2 = k6dVar.x(yh4Var2);
                x2.e = new k1f((byte) 24);
                oa3Var = x2;
                i2 = oa3Var.f;
                k1fVar = oa3Var.e;
                if (k1fVar != null) {
                }
                in3Var = new in3(oa3Var.a, wc9VarArr2);
                arrayList = oa3Var.b;
                if (arrayList != null) {
                }
                str = oa3Var.c;
                if (str != null) {
                }
                if (i2 >= 0) {
                }
                in3Var.D(vc9.c, oa3Var.d);
                in3Var.D(vc9.f, "]Q" + ((int) oa3Var.h));
                return in3Var;
            }
            i2 = oa3Var.f;
            k1fVar = oa3Var.e;
            if (k1fVar != null) {
                k1fVar.getClass();
                if (wc9VarArr2.length >= 3) {
                    wc9 wc9Var = wc9VarArr2[0];
                    wc9VarArr2[0] = wc9VarArr2[2];
                    wc9VarArr2[2] = wc9Var;
                }
            }
            in3Var = new in3(oa3Var.a, wc9VarArr2);
            arrayList = oa3Var.b;
            if (arrayList != null) {
                in3Var.D(vc9.a, arrayList);
            }
            str = oa3Var.c;
            if (str != null) {
                in3Var.D(vc9.b, str);
            }
            if (i2 >= 0 && (i3 = oa3Var.g) >= 0) {
                in3Var.D(vc9.d, Integer.valueOf(i3));
                in3Var.D(vc9.e, Integer.valueOf(i2));
            }
            in3Var.D(vc9.c, oa3Var.d);
            in3Var.D(vc9.f, "]Q" + ((int) oa3Var.h));
            return in3Var;
        } catch (IllegalArgumentException unused4) {
            throw ho4.a();
        }
    }

    @Override // ldc
    public final void onStateChanged(boolean z, int i) {
        cl8 cl8Var = (cl8) this.b;
        bl8 bl8Var = cl8Var.M;
        gm.r(bl8Var);
        ndc ndcVar = cl8Var.E;
        if (ndcVar == null || !ndcVar.c0()) {
            return;
        }
        gm.c3(bl8Var);
    }

    @Override // ldc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ldc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((cl8) this.b).h();
    }

    @Override // rd9
    public final void p() {
        id9 id9Var = (id9) this.b;
        wg9 wg9Var = id9Var.P;
        if (wg9Var != null) {
            wg9Var.a.T3(id9Var.a);
        }
    }

    public final boolean q(String str) {
        String y = y(str);
        return "1".equals(y) || Boolean.parseBoolean(y);
    }

    public final Integer r(String str) {
        String y = y(str);
        if (TextUtils.isEmpty(y)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(y));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + Z(str) + "(" + y + ") into an int");
            return null;
        }
    }

    @Override // rd9
    public final void r1(int i, int i2) {
        of9 of9Var;
        wg9 wg9Var = ((id9) this.b).P;
        if (wg9Var == null || (of9Var = wg9Var.a.R3) == null) {
            return;
        }
        of9Var.f(i, i2);
    }

    @Override // u40
    public final void s0() {
        l74 l74Var = ((im6) this.b).Y;
        if (l74Var != null) {
            l74Var.a();
        }
    }

    public final JSONArray t(String str) {
        String y = y(str);
        if (TextUtils.isEmpty(y)) {
            return null;
        }
        try {
            return new JSONArray(y);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + Z(str) + ": " + y + ", falling back to default");
            return null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 8:
                cbb cbbVar = cbb.e;
                StringBuffer stringBuffer = new StringBuffer("execution(");
                stringBuffer.append(((ha) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // u40
    public final void u(nf5 nf5Var) {
        lx6 lx6Var = ((im6) this.b).b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new m40(lx6Var, nf5Var, (byte) 0));
        }
    }

    @Override // u40
    public final void v() {
        ((im6) this.b).n1 = true;
    }

    public final String x(Resources resources, String str, String str2) {
        String[] strArr;
        String y = y(str2);
        if (!TextUtils.isEmpty(y)) {
            return y;
        }
        String y2 = y(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(y2)) {
            return null;
        }
        int identifier = resources.getIdentifier(y2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", Z(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray t = t(str2.concat("_loc_args"));
        if (t == null) {
            strArr = null;
        } else {
            int length = t.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = t.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + Z(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override // u40
    public final void x0(long j, int i, long j2) {
        lx6 lx6Var = ((im6) this.b).b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new l40((Object) lx6Var, i, j, j2, (byte) 0));
        }
    }

    public final String y(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override // kt9
    public final boolean y0(int i, View view) {
        return false;
    }

    @Override // d99
    public final void z() {
        sb sbVar = ((z8b) this.b).F0;
        if (sbVar != null) {
            sbVar.invalidate();
        }
    }

    @Override // ldc
    public final void onRenderedFirstFrame() {
    }

    private final void U() {
    }

    @Override // u78
    public final void j() {
    }

    @Override // kt9
    public final void s() {
    }

    @Override // d99
    public final void w() {
    }

    @Override // ldc
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    @Override // ldc
    public final void onSeekFinished(tk tkVar) {
    }

    @Override // ldc
    public final void onSeekStarted(tk tkVar) {
    }

    @Override // ldc
    public final void onError(ndc ndcVar, Exception exc) {
    }

    public /* synthetic */ ai4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ ai4(byte b, boolean z) {
        this.a = b;
    }

    public ai4(Bundle bundle) {
        this.a = (byte) 17;
        this.b = new Bundle(bundle);
    }

    public ai4(Context context, Uri uri) {
        this.a = (byte) 1;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public ai4(Context context, qu4 qu4Var) {
        this.a = (byte) 3;
        this.b = new pu4(context, qu4Var);
    }

    @Override // ldc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
