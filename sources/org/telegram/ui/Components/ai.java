package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ai implements og.g, yd.a, androidx.activity.result.b, oa0, g71, g5.h0, OnSuccessListener, ra.m, r4.h, com.google.android.gms.common.api.internal.s, uf.j1, OnCompleteListener, wh.h0, wh.d1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ai(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r4.h
    public boolean A() {
        return true;
    }

    @Override // wh.h0
    public void B(CharSequence charSequence) {
        wh.m3 m3Var = ((wh.x0) this.b).P;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            m3Var.a.s4(charSequence.toString());
        }
    }

    @Override // r4.h
    public long C() {
        return 0L;
    }

    @Override // wh.d1
    public /* synthetic */ boolean D(wh.e1 e1Var) {
        return false;
    }

    @Override // wh.h0
    public org.telegram.ui.Cells.l9 E() {
        return (wh.x0) this.b;
    }

    @Override // r4.h
    public long F(long j10) {
        return 1L;
    }

    @Override // wh.h0
    public wh.a G() {
        return ((wh.x0) this.b).a;
    }

    @Override // r4.h
    public long I(long j10, long j11) {
        return 1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean J(MotionEvent motionEvent) {
        boolean z4;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        n20 n20Var;
        boolean z10;
        m20 m20Var = (m20) this.b;
        int i10 = m20.w;
        n20 n20Var2 = m20Var.f;
        androidx.mediarouter.app.d dVar = m20Var.e;
        int action = motionEvent.getAction();
        if (m20Var.v == null) {
            m20Var.v = VelocityTracker.obtain();
        }
        m20Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z11 = i11 == 6;
        int actionIndex = z11 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f10 = motionEvent.getX(i12) + f10;
                f11 = motionEvent.getY(i12) + f11;
            }
        }
        float f12 = z11 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        if (i11 == 0) {
            if (m20Var.g != null && n20Var2.a()) {
                boolean hasMessages = dVar.hasMessages(3);
                if (hasMessages) {
                    dVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = m20Var.m;
                if (motionEvent4 != null && (motionEvent3 = m20Var.n) != null && hasMessages && m20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y10 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y10 * y10) + (x10 * x10) < m20Var.b) {
                        m20Var.o = true;
                        z4 = m20Var.g.onDoubleTap(m20Var.m) | m20Var.g.onDoubleTapEvent(motionEvent);
                        m20Var.p = f13;
                        m20Var.r = f13;
                        m20Var.q = f14;
                        m20Var.s = f14;
                        motionEvent2 = m20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        m20Var.m = MotionEvent.obtain(motionEvent);
                        m20Var.k = true;
                        m20Var.l = true;
                        m20Var.h = true;
                        m20Var.j = false;
                        m20Var.i = false;
                        if (m20Var.t) {
                            dVar.removeMessages(2);
                            dVar.sendEmptyMessageAtTime(2, m20Var.m.getDownTime() + i10 + m20Var.u);
                        }
                        dVar.sendEmptyMessageAtTime(1, m20Var.m.getDownTime() + i10);
                        return n20Var2.onDown(motionEvent) | z4;
                    }
                }
                dVar.sendEmptyMessageDelayed(3, 220L);
            }
            z4 = false;
            m20Var.p = f13;
            m20Var.r = f13;
            m20Var.q = f14;
            m20Var.s = f14;
            motionEvent2 = m20Var.m;
            if (motionEvent2 != null) {
            }
            m20Var.m = MotionEvent.obtain(motionEvent);
            m20Var.k = true;
            m20Var.l = true;
            m20Var.h = true;
            m20Var.j = false;
            m20Var.i = false;
            if (m20Var.t) {
            }
            dVar.sendEmptyMessageAtTime(1, m20Var.m.getDownTime() + i10);
            return n20Var2.onDown(motionEvent) | z4;
        }
        if (i11 == 1) {
            m20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (m20Var.o) {
                onFling = m20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (m20Var.j) {
                    dVar.removeMessages(3);
                    m20Var.j = false;
                } else if (m20Var.k) {
                    boolean onSingleTapUp = n20Var2.onSingleTapUp(motionEvent);
                    if (m20Var.i && (n20Var = m20Var.g) != null) {
                        n20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = m20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, m20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > m20Var.c || Math.abs(xVelocity) > m20Var.c) {
                        onFling = n20Var2.onFling(m20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = m20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            m20Var.n = obtain;
            VelocityTracker velocityTracker2 = m20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                m20Var.v = null;
            }
            m20Var.o = false;
            m20Var.i = false;
            dVar.removeMessages(1);
            dVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                dVar.removeMessages(1);
                dVar.removeMessages(2);
                dVar.removeMessages(3);
                m20Var.v.recycle();
                m20Var.v = null;
                m20Var.o = false;
                m20Var.h = false;
                m20Var.k = false;
                m20Var.l = false;
                m20Var.i = false;
                if (m20Var.j) {
                    m20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                m20Var.p = f13;
                m20Var.r = f13;
                m20Var.q = f14;
                m20Var.s = f14;
                dVar.removeMessages(1);
                dVar.removeMessages(2);
                dVar.removeMessages(3);
                m20Var.o = false;
                m20Var.k = false;
                m20Var.l = false;
                m20Var.i = false;
                if (m20Var.j) {
                    m20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                m20Var.p = f13;
                m20Var.r = f13;
                m20Var.q = f14;
                m20Var.s = f14;
                m20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, m20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = m20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = m20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((m20Var.v.getYVelocity(pointerId3) * yVelocity2) + (m20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            m20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!m20Var.j) {
            float f15 = m20Var.p - f13;
            float f16 = m20Var.q - f14;
            if (m20Var.o) {
                return m20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (m20Var.k) {
                int i14 = (int) (f13 - m20Var.r);
                int i15 = (int) (f14 - m20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > m20Var.a) {
                    z10 = n20Var2.onScroll(m20Var.m, motionEvent, f15, f16);
                    m20Var.p = f13;
                    m20Var.q = f14;
                    m20Var.k = false;
                    dVar.removeMessages(3);
                    dVar.removeMessages(1);
                    dVar.removeMessages(2);
                } else {
                    z10 = false;
                }
                if (i16 > m20Var.a) {
                    m20Var.l = false;
                }
                return z10;
            }
            if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                boolean onScroll = n20Var2.onScroll(m20Var.m, motionEvent, f15, f16);
                m20Var.p = f13;
                m20Var.q = f14;
                return onScroll;
            }
        }
        return false;
    }

    @Override // uf.j1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // wh.h0
    public boolean L() {
        wh.x0 x0Var = (wh.x0) this.b;
        wh.m3 m3Var = x0Var.P;
        if (m3Var == null) {
            return false;
        }
        wh.a aVar = x0Var.a;
        return m3Var.a.R4();
    }

    @Override // wh.h0
    public void M(int i10, int i11) {
        wh.x0 x0Var = (wh.x0) this.b;
        wh.m3 m3Var = x0Var.P;
        if (m3Var != null) {
            wh.a aVar = x0Var.a;
            wh.d2 d2Var = m3Var.a.G3;
            if (d2Var != null) {
                d2Var.f(i10, i11);
            }
        }
    }

    @Override // wh.d1
    public void O(Editable editable) {
        ((wh.a5) this.b).h();
    }

    @Override // og.g
    public void P(g.x xVar) {
        switch (this.a) {
            case 0:
                xVar.a(((mi) this.b).getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                xVar.a(((lq0) this.b).getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // wh.h0
    public void Q() {
        wh.x0 x0Var = (wh.x0) this.b;
        wh.m3 m3Var = x0Var.P;
        if (m3Var != null) {
            wh.a aVar = x0Var.a;
            wh.r3 r3Var = m3Var.a;
            wh.d2 d2Var = r3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            r3Var.e3.onContentChanged();
        }
    }

    @Override // uf.j1
    public boolean R(int i10) {
        return i10 == ((wn0) this.b).a0;
    }

    public byte S() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // wh.d1
    public /* synthetic */ boolean T(boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Components.oa0
    public void U(int i10, int i11, CharSequence charSequence, boolean z4) {
        qh.f fVar = ((qh.k) this.b).f;
        if (fVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z4) {
                Emoji.replaceEmoji(spannableStringBuilder, fVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            fVar.setText(spannableStringBuilder);
            fVar.setSelection(i10 + charSequence.length());
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // uf.j1
    public void V(ArrayList arrayList) {
        wn0 wn0Var = (wn0) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            wn0Var.G.add(((uf.i1) arrayList.get(i10)).a);
        }
        org.telegram.ui.ay ayVar = wn0Var.R;
        if (ayVar != null) {
            ayVar.d(wn0Var.A0 > 0, false);
        }
        wn0Var.l();
    }

    @Override // wh.h0
    public void W() {
        wh.x0 x0Var = (wh.x0) this.b;
        wh.m3 m3Var = x0Var.P;
        if (m3Var != null) {
            wh.a aVar = x0Var.a;
            wh.r3.N1(m3Var.a);
        }
    }

    public int Y() {
        return ((S() & 255) << 24) | ((S() & 255) << 16) | ((S() & 255) << 8) | (S() & 255);
    }

    public int Z() {
        return ((S() & Byte.MAX_VALUE) << 21) | ((S() & Byte.MAX_VALUE) << 14) | ((S() & Byte.MAX_VALUE) << 7) | (S() & Byte.MAX_VALUE);
    }

    @Override // r4.h
    public long a(long j10) {
        return 0L;
    }

    public void a0(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        u5.r rVar = new u5.r(1, (TaskCompletionSource) obj2);
        u5.i iVar = (u5.i) ((u5.t) obj).u();
        String[] strArr = (String[]) this.b;
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.s.d(M0, rVar);
        M0.writeStringArray(strArr);
        iVar.R0(M0, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e3 A[Catch: a | c -> 0x0676, TryCatch #4 {a | c -> 0x0676, blocks: (B:292:0x05c9, B:293:0x05df, B:295:0x05e3, B:296:0x05e6, B:298:0x05ea, B:300:0x05f4, B:302:0x05fa, B:307:0x05ff), top: B:291:0x05c9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l7.w0 b(n7.qa qaVar) {
        ArrayList arrayList;
        ub.c cVar;
        ub.c cVar2;
        ub.c cVar3;
        float f10;
        float f11;
        ub.a aVar;
        float f12;
        float f13;
        float f14;
        int i10;
        int i11;
        ob.j[] jVarArr;
        ob.a aVar2;
        pb.b bVar;
        int i12;
        pb.d dVar;
        int i13;
        l7.w0 w0Var;
        List list;
        String str;
        int i14;
        boolean z4;
        double d;
        double abs;
        int i15;
        char c3;
        int i16;
        org.telegram.ui.Cells.f1 f1Var = (org.telegram.ui.Cells.f1) this.b;
        pb.b T0 = qaVar.T0();
        org.telegram.ui.Cells.f1 f1Var2 = new org.telegram.ui.Cells.f1(T0, 22);
        ub.e eVar = new ub.e(T0);
        int i17 = T0.b;
        int i18 = T0.a;
        int i19 = (i17 * 3) / 388;
        if (i19 < 3) {
            i19 = 3;
        }
        int[] iArr = new int[5];
        int i20 = i19 - 1;
        int i21 = 0;
        boolean z10 = false;
        while (true) {
            int i22 = 1;
            arrayList = eVar.b;
            if (i20 >= i17 || z10) {
                break;
            }
            Arrays.fill(iArr, i21);
            int i23 = 0;
            while (i23 < i18) {
                if (T0.b(i23, i20)) {
                    if ((i21 & 1) == i22) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + i22;
                    i15 = i17;
                } else {
                    if ((i21 & 1) != 0) {
                        i15 = i17;
                        iArr[i21] = iArr[i21] + 1;
                    } else if (i21 == 4) {
                        if (!ub.e.b(iArr)) {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        } else if (eVar.c(i20, i23, iArr)) {
                            if (eVar.c) {
                                z10 = eVar.d();
                                i15 = i17;
                            } else {
                                if (arrayList.size() > i22) {
                                    int size = arrayList.size();
                                    int i24 = 0;
                                    ub.c cVar4 = null;
                                    while (true) {
                                        if (i24 >= size) {
                                            i15 = i17;
                                            c3 = 2;
                                            i16 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i24);
                                        i24++;
                                        ub.c cVar5 = (ub.c) obj;
                                        i15 = i17;
                                        if (cVar5.d >= 2) {
                                            if (cVar4 != null) {
                                                eVar.c = true;
                                                c3 = 2;
                                                i16 = ((int) (Math.abs(cVar4.a - cVar5.a) - Math.abs(cVar4.b - cVar5.b))) / 2;
                                                break;
                                            }
                                            cVar4 = cVar5;
                                        }
                                        i17 = i15;
                                    }
                                } else {
                                    i15 = i17;
                                    i16 = 0;
                                    c3 = 2;
                                }
                                if (i16 > iArr[c3]) {
                                    i20 += (i16 - r5) - 2;
                                    i23 = i18 - 1;
                                }
                            }
                            Arrays.fill(iArr, 0);
                            i19 = 2;
                            i21 = 0;
                        } else {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        }
                        i21 = 3;
                    } else {
                        i15 = i17;
                        int i25 = i21 + 1;
                        iArr[i25] = iArr[i25] + 1;
                        i21 = i25;
                    }
                    i23++;
                    i17 = i15;
                    i22 = 1;
                }
                i23++;
                i17 = i15;
                i22 = 1;
            }
            int i26 = i17;
            if (ub.e.b(iArr) && eVar.c(i20, i18, iArr)) {
                int i27 = iArr[0];
                if (eVar.c) {
                    i19 = i27;
                    z10 = eVar.d();
                } else {
                    i19 = i27;
                }
            }
            i20 += i19;
            i17 = i26;
            i21 = 0;
        }
        if (arrayList.size() < 3) {
            throw ob.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ub.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, ub.e.e);
        ub.c[] cVarArr = new ub.c[3];
        int i28 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i29 = 2; i28 < arrayList.size() - i29; i29 = 2) {
            ub.c cVar6 = (ub.c) arrayList.get(i28);
            float f15 = cVar6.c;
            i28++;
            int i30 = i28;
            while (i30 < arrayList.size() - 1) {
                ub.c cVar7 = (ub.c) arrayList.get(i30);
                double e6 = ub.e.e(cVar6, cVar7);
                i30++;
                for (int i31 = i30; i31 < arrayList.size(); i31++) {
                    ub.c cVar8 = (ub.c) arrayList.get(i31);
                    if (cVar8.c <= 1.4f * f15) {
                        double e10 = ub.e.e(cVar7, cVar8);
                        double e11 = ub.e.e(cVar6, cVar8);
                        if (e6 < e10) {
                            if (e10 <= e11) {
                                e11 = e10;
                                e10 = e11;
                            } else if (e6 >= e11) {
                                d = e11;
                                e11 = e6;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d10 = abs;
                                }
                            }
                            d = e6;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e10 >= e11) {
                                d = e11;
                                e11 = e10;
                            } else if (e6 < e11) {
                                d = e10;
                                e10 = e11;
                                e11 = e6;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e10;
                            }
                            e10 = e6;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw ob.e.a();
        }
        float a2 = ob.j.a(cVarArr[0], cVarArr[1]);
        float a10 = ob.j.a(cVarArr[1], cVarArr[2]);
        float a11 = ob.j.a(cVarArr[0], cVarArr[2]);
        if (a10 >= a2 && a10 >= a11) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a11 < a10 || a11 < a2) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f16 = cVar.a;
        float f17 = cVar.b;
        if (org.telegram.ui.yh.c(cVar2.a, f16, cVar3.b - f17, (cVar2.b - f17) * (cVar3.a - f16)) < 0.0f) {
            ub.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float e12 = f1Var2.e(cVar, cVar3);
        float f18 = cVar.a;
        float f19 = cVar3.b;
        float f20 = cVar3.a;
        float e13 = f1Var2.e(cVar, cVar2);
        float f21 = cVar2.b;
        float f22 = cVar2.a;
        float f23 = (e13 + e12) / 2.0f;
        if (f23 < 1.0f) {
            throw ob.e.a();
        }
        float a12 = ob.j.a(cVar, cVar3) / f23;
        int i32 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = ob.j.a(cVar, cVar2) / f23;
        int i33 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i32) / 2;
        int i34 = i33 + 7;
        int i35 = i34 & 3;
        if (i35 == 0) {
            i34 = i33 + 8;
        } else if (i35 == 2) {
            i34 = i33 + 6;
        } else if (i35 == 3) {
            i34 = i33 + 5;
        }
        int i36 = i34;
        int[] iArr2 = tb.e.e;
        if (i36 % 4 != 1) {
            throw ob.c.a();
        }
        try {
            tb.e c10 = tb.e.c((i36 - 17) / 4);
            int i37 = (c10.a * 4) + 10;
            if (c10.b.length > 0) {
                float f24 = (f20 - f18) + f22;
                f11 = f20;
                float f25 = (f19 - f17) + f21;
                float f26 = 1.0f - (3.0f / i37);
                int w10 = (int) e2.c.w(f24, f18, f26, f18);
                int w11 = (int) e2.c.w(f25, f17, f26, f17);
                f10 = f18;
                for (int i38 = 4; i38 <= 16; i38 <<= 1) {
                    try {
                        aVar = f1Var2.m(f23, i38, w10, w11);
                        break;
                    } catch (ob.e unused) {
                    }
                }
            } else {
                f10 = f18;
                f11 = f20;
            }
            aVar = null;
            float f27 = i36 - 3.5f;
            if (aVar != null) {
                f12 = aVar.a;
                f13 = aVar.b;
                f14 = f27 - 3.0f;
            } else {
                f12 = (f11 - f10) + f22;
                f13 = (f19 - f17) + f21;
                f14 = f27;
            }
            float f28 = f13;
            float f29 = cVar.a;
            float f30 = cVar.b;
            float f31 = cVar3.a;
            float f32 = cVar3.b;
            float f33 = cVar2.a;
            float f34 = cVar2.b;
            pb.g a14 = pb.g.a(3.5f, 3.5f, f27, 3.5f, f14, f14, 3.5f, f27);
            ub.a aVar3 = aVar;
            float f35 = a14.e;
            float f36 = a14.i;
            float f37 = f35 * f36;
            float f38 = a14.f;
            float f39 = a14.h;
            float f40 = f37 - (f38 * f39);
            float f41 = a14.g;
            float f42 = f38 * f41;
            float f43 = a14.d;
            float f44 = f42 - (f43 * f36);
            float f45 = (f43 * f39) - (f35 * f41);
            float f46 = a14.c;
            float f47 = f46 * f39;
            float f48 = a14.b;
            float f49 = f47 - (f48 * f36);
            float f50 = a14.a;
            float f51 = (f36 * f50) - (f46 * f41);
            float f52 = (f41 * f48) - (f39 * f50);
            float f53 = (f48 * f38) - (f46 * f35);
            float f54 = (f46 * f43) - (f38 * f50);
            float f55 = (f50 * f35) - (f48 * f43);
            pb.g a15 = pb.g.a(f29, f30, f31, f32, f12, f28, f33, f34);
            float f56 = a15.a;
            float f57 = a15.d;
            float f58 = a15.g;
            float f59 = (f58 * f53) + (f57 * f49) + (f56 * f40);
            float f60 = (f58 * f54) + (f57 * f51) + (f56 * f44);
            float f61 = (f58 * f55) + (f57 * f52) + (f56 * f45);
            float f62 = a15.b;
            float f63 = a15.e;
            float f64 = a15.h;
            float f65 = (f64 * f53) + (f63 * f49) + (f62 * f40);
            float f66 = (f64 * f54) + (f63 * f51) + (f62 * f44);
            float f67 = (f64 * f55) + (f63 * f52) + (f62 * f45);
            float f68 = a15.c;
            float f69 = a15.f;
            float f70 = a15.i;
            float f71 = (f53 * f70) + (f49 * f69) + (f40 * f68);
            float f72 = (f54 * f70) + (f51 * f69) + (f44 * f68);
            float f73 = (f70 * f55) + (f69 * f52) + (f68 * f45);
            if (i36 <= 0 || i36 <= 0) {
                throw ob.e.a();
            }
            pb.b bVar2 = new pb.b(i36, i36);
            int i39 = i36 * 2;
            ub.c cVar10 = cVar;
            float[] fArr = new float[i39];
            int i40 = 0;
            while (i40 < i36) {
                int i41 = i36;
                float f74 = i40 + 0.5f;
                int i42 = 0;
                while (i42 < i39) {
                    int i43 = i42;
                    fArr[i43] = (i43 / 2) + 0.5f;
                    fArr[i43 + 1] = f74;
                    i42 = i43 + 2;
                }
                int i44 = i39 - 1;
                int i45 = i40;
                int i46 = 0;
                while (i46 < i44) {
                    float f75 = fArr[i46];
                    int i47 = i46 + 1;
                    int i48 = i46;
                    float f76 = fArr[i47];
                    ub.c cVar11 = cVar2;
                    float A = e2.c.A(f72, f76, f71 * f75, f73);
                    fArr[i48] = (((f60 * f76) + (f59 * f75)) + f61) / A;
                    fArr[i47] = (((f76 * f66) + (f75 * f65)) + f67) / A;
                    i46 = i48 + 2;
                    cVar2 = cVar11;
                }
                ub.c cVar12 = cVar2;
                int i49 = T0.b;
                float f77 = f72;
                int i50 = 0;
                boolean z11 = true;
                while (i50 < i44 && z11) {
                    int i51 = (int) fArr[i50];
                    int i52 = i50 + 1;
                    int i53 = i44;
                    int i54 = (int) fArr[i52];
                    int i55 = i50;
                    if (i51 < -1 || i51 > i18 || i54 < -1 || i54 > i49) {
                        throw ob.e.a();
                    }
                    if (i51 == -1) {
                        fArr[i55] = 0.0f;
                    } else if (i51 == i18) {
                        fArr[i55] = i18 - 1;
                    } else {
                        z4 = false;
                        if (i54 != -1) {
                            fArr[i52] = 0.0f;
                        } else if (i54 == i49) {
                            fArr[i52] = i49 - 1;
                        } else {
                            z11 = z4;
                            i50 = i55 + 2;
                            i44 = i53;
                        }
                        z11 = true;
                        i50 = i55 + 2;
                        i44 = i53;
                    }
                    z4 = true;
                    if (i54 != -1) {
                    }
                    z11 = true;
                    i50 = i55 + 2;
                    i44 = i53;
                }
                int i56 = i39 - 2;
                boolean z12 = true;
                while (i56 >= 0 && z12) {
                    int i57 = (int) fArr[i56];
                    int i58 = i56 + 1;
                    int i59 = i56;
                    int i60 = (int) fArr[i58];
                    if (i57 < -1 || i57 > i18 || i60 < -1 || i60 > i49) {
                        throw ob.e.a();
                    }
                    if (i57 == -1) {
                        fArr[i59] = 0.0f;
                    } else if (i57 == i18) {
                        fArr[i59] = i18 - 1;
                    } else {
                        z12 = false;
                        if (i60 != -1) {
                            fArr[i58] = 0.0f;
                        } else if (i60 == i49) {
                            fArr[i58] = i49 - 1;
                        } else {
                            i56 = i59 - 2;
                        }
                        z12 = true;
                        i56 = i59 - 2;
                    }
                    z12 = true;
                    if (i60 != -1) {
                    }
                    z12 = true;
                    i56 = i59 - 2;
                }
                for (int i61 = 0; i61 < i39; i61 += 2) {
                    try {
                        if (T0.b((int) fArr[i61], (int) fArr[i61 + 1])) {
                            int i62 = i61 / 2;
                            int i63 = (i62 / 32) + (bVar2.c * i45);
                            int[] iArr3 = bVar2.d;
                            iArr3[i63] = iArr3[i63] | (1 << (i62 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw ob.e.a();
                    }
                }
                i40 = i45 + 1;
                i36 = i41;
                f72 = f77;
                cVar2 = cVar12;
            }
            ub.c cVar13 = cVar2;
            if (aVar3 == null) {
                i11 = 3;
                i10 = 1;
                jVarArr = new ob.j[]{cVar13, cVar10, cVar3};
            } else {
                i10 = 1;
                i11 = 3;
                jVarArr = new ob.j[]{cVar13, cVar10, cVar3, aVar3};
            }
            ob.j[] jVarArr2 = jVarArr;
            f1Var.getClass();
            cb.m mVar = new cb.m();
            int i64 = bVar2.b;
            if (i64 < 21 || (i64 & i11) != i10) {
                throw ob.c.a();
            }
            mVar.b = bVar2;
            try {
                dVar = f1Var.j(mVar);
            } catch (ob.a e14) {
                aVar2 = e14;
                e = null;
                try {
                    mVar.s();
                    mVar.c = null;
                    mVar.d = null;
                    mVar.a = true;
                    mVar.r();
                    mVar.q();
                    bVar = (pb.b) mVar.b;
                    i12 = 0;
                    while (i12 < bVar.a) {
                        int i65 = i12 + 1;
                        for (int i66 = i65; i66 < bVar.b; i66++) {
                            if (bVar.b(i12, i66) != bVar.b(i66, i12)) {
                                bVar.a(i66, i12);
                                bVar.a(i12, i66);
                            }
                        }
                        i12 = i65;
                    }
                    pb.d j10 = f1Var.j(mVar);
                    j10.e = new z9.d(23);
                    dVar = j10;
                    i13 = dVar.f;
                    if (e2.c.s(dVar.e)) {
                        ob.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    w0Var = new l7.w0(dVar.a, jVarArr2);
                    list = dVar.b;
                    if (list != null) {
                    }
                    str = dVar.c;
                    if (str != null) {
                    }
                    if (i13 >= 0) {
                        w0Var.z(ob.i.d, Integer.valueOf(i14));
                        w0Var.z(ob.i.e, Integer.valueOf(i13));
                    }
                    w0Var.z(ob.i.c, dVar.d);
                    w0Var.z(ob.i.f, "]Q" + dVar.h);
                    return w0Var;
                } catch (ob.a | ob.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (ob.c e15) {
                e = e15;
                aVar2 = null;
                mVar.s();
                mVar.c = null;
                mVar.d = null;
                mVar.a = true;
                mVar.r();
                mVar.q();
                bVar = (pb.b) mVar.b;
                i12 = 0;
                while (i12 < bVar.a) {
                }
                pb.d j102 = f1Var.j(mVar);
                j102.e = new z9.d(23);
                dVar = j102;
                i13 = dVar.f;
                if (e2.c.s(dVar.e)) {
                }
                w0Var = new l7.w0(dVar.a, jVarArr2);
                list = dVar.b;
                if (list != null) {
                }
                str = dVar.c;
                if (str != null) {
                }
                if (i13 >= 0) {
                }
                w0Var.z(ob.i.c, dVar.d);
                w0Var.z(ob.i.f, "]Q" + dVar.h);
                return w0Var;
            }
            i13 = dVar.f;
            if (e2.c.s(dVar.e) && jVarArr2.length >= 3) {
                ob.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            w0Var = new l7.w0(dVar.a, jVarArr2);
            list = dVar.b;
            if (list != null) {
                w0Var.z(ob.i.a, list);
            }
            str = dVar.c;
            if (str != null) {
                w0Var.z(ob.i.b, str);
            }
            if (i13 >= 0 && (i14 = dVar.g) >= 0) {
                w0Var.z(ob.i.d, Integer.valueOf(i14));
                w0Var.z(ob.i.e, Integer.valueOf(i13));
            }
            w0Var.z(ob.i.c, dVar.d);
            w0Var.z(ob.i.f, "]Q" + dVar.h);
            return w0Var;
        } catch (IllegalArgumentException unused4) {
            throw ob.c.a();
        }
    }

    @Override // wh.h0
    public void c(wh.e1 e1Var) {
        switch (this.a) {
            case 20:
                wh.m3 m3Var = ((wh.x0) this.b).P;
                if (m3Var != null) {
                    wh.r3 r3Var = m3Var.a;
                    wh.r3.L1(r3Var, e1Var);
                    r3Var.e3.h(e1Var, true);
                    break;
                }
                break;
            default:
                wh.y4 y4Var = ((wh.a5) this.b).s;
                if (y4Var != null) {
                    wh.r3 r3Var2 = ((wh.x2) y4Var).a;
                    wh.r3.L1(r3Var2, e1Var);
                    r3Var2.e3.h(e1Var, true);
                    break;
                }
                break;
        }
    }

    public String d(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            w9.d dVar = (w9.d) this.b;
            w9.e eVar = new w9.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // wh.d1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // wh.h0
    public void f() {
        wh.x0 x0Var = (wh.x0) this.b;
        wh.m3 m3Var = x0Var.P;
        if (m3Var != null) {
            wh.r3.O1(m3Var.a, x0Var.a);
        }
    }

    @Override // yd.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // uf.j1
    public void g(int i10) {
        wn0 wn0Var = (wn0) this.b;
        wn0Var.A0--;
        wn0Var.b0 = i10;
        if (wn0Var.c0 != i10) {
            wn0Var.s.clear();
        }
        if (wn0Var.d0 != i10) {
            wn0Var.F.clear();
        }
        wn0Var.K = true;
        org.telegram.ui.ay ayVar = wn0Var.R;
        if (ayVar != null) {
            ayVar.d(wn0Var.A0 > 0, true);
        }
        wn0Var.l();
        org.telegram.ui.ay ayVar2 = wn0Var.R;
        if (ayVar2 != null) {
            ayVar2.c();
        }
    }

    @Override // yd.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // og.g
    public void i(Canvas canvas) {
        switch (this.a) {
            case 0:
                mi miVar = (mi) this.b;
                canvas.drawColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    miVar.z2.b(canvas, -2);
                    break;
                }
                break;
            default:
                lq0 lq0Var = (lq0) this.b;
                canvas.drawColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lq0Var.L0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // yd.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override // androidx.activity.result.b
    public void k(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.K;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // r4.h
    public long m(long j10, long j11) {
        return 0L;
    }

    @Override // r4.h
    public long n(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // yd.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // yd.a
    public boolean needClickAt(View view, float f10, float f11) {
        int dp = AndroidUtilities.dp(9.0f);
        k61 k61Var = (k61) this.b;
        float f12 = -dp;
        k61Var.g.inset(f12, f12);
        boolean contains = k61Var.g.contains(f10, f11);
        float f13 = dp;
        k61Var.g.inset(f13, f13);
        return contains;
    }

    @Override // yd.a
    public /* synthetic */ boolean needLongPress(float f10, float f11) {
        return false;
    }

    @Override // wh.d1
    public void o(wh.e1 e1Var) {
        wh.a aVar;
        wh.a5 a5Var = (wh.a5) this.b;
        wh.y4 y4Var = a5Var.s;
        if (y4Var == null || (aVar = a5Var.a) == null) {
            return;
        }
        wh.r3 r3Var = ((wh.x2) y4Var).a;
        ArrayList arrayList = r3Var.i3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((wh.a) arrayList.get(i11)).k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        wh.d2 d2Var = r3Var.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        wh.a aVar2 = new wh.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            android.support.v4.media.a.u(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        r3Var.r4();
        r3Var.V2.N(false);
        wh.d2 d2Var2 = r3Var.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        r3Var.post(new wh.k2(r3Var, aVar2, 26));
    }

    @Override // yd.a
    public void onClickAt(View view, float f10, float f11) {
        Runnable runnable = ((k61) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // yd.a
    public void onClickTouchDown(View view, float f10, float f11) {
        ((k61) this.b).h.c(true);
    }

    @Override // yd.a
    public void onClickTouchUp(View view, float f10, float f11) {
        ((k61) this.b).h.c(false);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ld.m mVar = (ld.m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(k7.q7.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // yd.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public void onStateChanged(boolean z4, int i10) {
        qh.i5 i5Var = (qh.i5) this.b;
        qh.g5 g5Var = i5Var.I;
        AndroidUtilities.cancelRunOnUIThread(g5Var);
        j71 j71Var = i5Var.y;
        if (j71Var == null || !j71Var.y()) {
            return;
        }
        AndroidUtilities.runOnUIThread(g5Var);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.google.android.gms.internal.cast.c2 c2Var;
        com.google.android.gms.internal.cast.c1 b10;
        r5.a aVar = (r5.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (com.google.android.gms.internal.cast.n0.j) {
            Context context = aVar.a;
            u5.s sVar = aVar.f;
            com.google.android.gms.internal.cast.n0 n0Var = new com.google.android.gms.internal.cast.n0(context, sVar, aVar.c, aVar.j, aVar.g);
            int i10 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z4 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (!z4) {
                    return;
                }
                i10 = 0;
                z4 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String e6 = w.c.e(packageName, ".client_cast_analytics_data");
            n0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            y2.q.b(context);
            n0Var.g = y2.q.a().c(w2.a.e).a("CAST_SENDER_SDK", new v2.c("proto"), com.google.android.gms.internal.cast.y.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                n0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(e6, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e10 = com.google.android.gms.common.api.internal.w.e();
                e10.c = new ai(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e10.d = new y5.c[]{q5.y.c};
                e10.b = false;
                e10.a = 8426;
                Task e11 = sVar.e(0, e10.e());
                h5.u uVar = new h5.u();
                uVar.b = n0Var;
                uVar.c = packageName;
                uVar.a = i10;
                uVar.d = sharedPreferences;
                e11.addOnSuccessListener(uVar);
            }
            if (z4) {
                b6.m.h(sharedPreferences);
                u5.b bVar = com.google.android.gms.internal.cast.c2.i;
                synchronized (com.google.android.gms.internal.cast.c2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.c2.k == null) {
                            com.google.android.gms.internal.cast.c2.k = new com.google.android.gms.internal.cast.c2(sharedPreferences, n0Var, packageName);
                        }
                        c2Var = com.google.android.gms.internal.cast.c2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = c2Var.c;
                SharedPreferences sharedPreferences2 = c2Var.b;
                HashSet hashSet = c2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = c2Var.g;
                hashSet2.clear();
                c2Var.h = 0L;
                String str2 = com.google.android.gms.internal.cast.c2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    c2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                com.google.android.gms.internal.cast.c1 b11 = com.google.android.gms.internal.cast.c2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = com.google.android.gms.internal.cast.c2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    c2Var.c(hashSet3);
                    b6.m.h(c2Var.e);
                    b6.m.h(c2Var.d);
                    c2Var.e.post(c2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    c2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                com.google.android.gms.internal.cast.c2.a(com.google.android.gms.internal.cast.c1.h);
            }
        }
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.g71
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((qh.i5) this.b).i();
    }

    @Override // r4.h
    public s4.j p(long j10) {
        return (s4.j) this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // g5.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c4.e q(g5.j0 j0Var, IOException iOException, int i10) {
        long j10;
        g5.p0 p0Var = (g5.p0) j0Var;
        r4.g gVar = (r4.g) this.b;
        long j11 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        int i11 = p0Var.c;
        gVar.n.getClass();
        if (!(iOException instanceof j3.r1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g5.b0) && !(iOException instanceof g5.l0)) {
            int i12 = g5.n.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g5.n) || ((g5.n) th2).a != 2008) {
                }
            }
            j10 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            c4.e eVar = j10 != -9223372036854775807L ? g5.m0.f : new c4.e(0, j10, false);
            gVar.r.s(jVar, i11, iOException, !eVar.a());
            return eVar;
        }
        j10 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
        }
        gVar.r.s(jVar, i11, iOException, !eVar.a());
        return eVar;
    }

    @Override // wh.d1
    public /* synthetic */ boolean r(wh.e1 e1Var) {
        return false;
    }

    @Override // wh.d1
    public void s(wh.e1 e1Var, int i10, int i11) {
        wh.y4 y4Var;
        org.telegram.ui.Cells.m9 textSelectionHelper;
        wh.a5 a5Var = (wh.a5) this.b;
        if (a5Var.w || i10 == i11 || (y4Var = a5Var.s) == null || (textSelectionHelper = ((wh.x2) y4Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        e1Var.post(new org.telegram.messenger.p6(this, e1Var, i11, textSelectionHelper, i10, 5));
    }

    @Override // r4.h
    public long t(long j10, long j11) {
        return 0L;
    }

    @Override // g5.h0
    public void u(g5.j0 j0Var, long j10, long j11, boolean z4) {
        g5.p0 p0Var = (g5.p0) j0Var;
        r4.g gVar = (r4.g) this.b;
        long j12 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        gVar.n.getClass();
        gVar.r.m(jVar, p0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // org.telegram.ui.Components.oa0
    public Paint.FontMetricsInt w() {
        return ((qh.k) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // g5.h0
    public void x(g5.j0 j0Var, long j10, long j11) {
        g5.p0 p0Var = (g5.p0) j0Var;
        r4.g gVar = (r4.g) this.b;
        long j12 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        gVar.n.getClass();
        gVar.r.p(jVar, p0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        s4.c cVar = (s4.c) p0Var.f;
        s4.c cVar2 = gVar.I;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i10 = 0;
        while (i10 < size && gVar.I.b(i10).b < j13) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.m.size()) {
                h5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = gVar.O;
                if (j14 == -9223372036854775807L || cVar.h * 1000 > j14) {
                    gVar.N = 0;
                } else {
                    h5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.O);
                }
            }
            int i11 = gVar.N;
            gVar.N = i11 + 1;
            if (i11 < gVar.n.n3(p0Var.c)) {
                gVar.E.postDelayed(gVar.w, Math.min((gVar.N - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                gVar.D = new b7.y0();
                return;
            }
        }
        gVar.I = cVar;
        gVar.J = cVar.d & gVar.J;
        gVar.K = j10 - j11;
        gVar.L = j10;
        synchronized (gVar.u) {
            try {
                if (p0Var.b.a == gVar.G) {
                    Uri uri2 = gVar.I.k;
                    if (uri2 == null) {
                        uri2 = p0Var.d.c;
                    }
                    gVar.G = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size != 0) {
            gVar.P += i10;
            gVar.u(true);
            return;
        }
        s4.c cVar3 = gVar.I;
        if (!cVar3.d) {
            gVar.u(true);
            return;
        }
        b6.h hVar = cVar3.i;
        if (hVar == null) {
            gVar.t();
            return;
        }
        String str = hVar.b;
        if (h5.d0.a(str, "urn:mpeg:dash:utc:direct:2014") || h5.d0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.M = h5.d0.J(hVar.c) - gVar.L;
                gVar.u(true);
                return;
            } catch (j3.r1 e6) {
                h5.a.p("DashMediaSource", "Failed to resolve time offset.", e6);
                gVar.u(true);
                return;
            }
        }
        if (h5.d0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || h5.d0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            g5.p0 p0Var2 = new g5.p0(gVar.A, Uri.parse(hVar.c), 5, new r4.f());
            gVar.B.f(p0Var2, new r4.d(gVar), 1);
            gVar.r.u(new o4.j(p0Var2.b), p0Var2.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (h5.d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || h5.d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            g5.p0 p0Var3 = new g5.p0(gVar.A, Uri.parse(hVar.c), 5, new z9.d(21));
            gVar.B.f(p0Var3, new r4.d(gVar), 1);
            gVar.r.u(new o4.j(p0Var3.b), p0Var3.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (h5.d0.a(str, "urn:mpeg:dash:utc:ntp:2014") || h5.d0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.t();
        } else {
            h5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            gVar.u(true);
        }
    }

    @Override // uf.j1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // ra.m
    public Object y2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e6) {
            k7.a8 a8Var = ua.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    @Override // wh.h0
    public org.telegram.ui.Cells.m9 z() {
        wh.m3 m3Var = ((wh.x0) this.b).P;
        if (m3Var == null) {
            return null;
        }
        return m3Var.a.getTextSelectionHelper();
    }

    public /* synthetic */ ai(u5.s sVar, String[] strArr) {
        this.a = 16;
        this.b = strArr;
    }

    @Override // org.telegram.ui.Components.g71
    public void onRenderedFirstFrame() {
    }

    public ai(l6.a aVar) {
        this.a = 23;
        b6.m.h(aVar);
        this.b = aVar;
    }

    public ai(int i10) {
        this.a = i10;
        switch (i10) {
            case 14:
                this.b = new org.telegram.ui.Cells.f1(20);
                break;
            case 15:
                this.b = new SparseArray();
                break;
            default:
                this.b = new h5.w(10);
                break;
        }
    }

    public ai(TextView textView) {
        this.a = 6;
        this.b = new q1.g(textView);
    }

    public ai(Context context, n20 n20Var) {
        this.a = 1;
        this.b = new m20(context, n20Var);
    }

    public ai(int i10, int i11) {
        this.a = 2;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(android.support.v4.media.a.k(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override // wh.d1
    public /* synthetic */ void H(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.oa0
    public /* synthetic */ void X(String str) {
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // wh.d1
    public /* synthetic */ void v() {
    }

    @Override // r4.h
    public long h(long j10, long j11) {
        return j11;
    }

    @Override // wh.d1
    public /* synthetic */ void j(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.g71
    public void onError(j71 j71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.oa0
    public /* synthetic */ void N(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.oa0
    public /* synthetic */ void l(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
    }

    @Override // yd.a
    public /* synthetic */ void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override // yd.a
    public /* synthetic */ void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override // yd.a
    public /* synthetic */ void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.g71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    @Override // yd.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
