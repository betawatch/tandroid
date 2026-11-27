// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ma8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ma8(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x020b, code lost:
    
        if (r6.startsWith("https://" + uc7.s1(r0.U).N2) == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0436  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ed8 ed8Var;
        float f;
        float f2;
        int i;
        TLRPC.Message message;
        byte b = this.a;
        float f3 = 0.0f;
        byte b2 = 2;
        final byte b3 = 0;
        final PhotoViewer photoViewer = this.b;
        int i2 = 1;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                float f4 = -photoViewer.D1.b.getStateOrientation();
                if (Math.abs(f4) > 180.0f) {
                    f4 = f4 < 0.0f ? f4 + 360.0f : -(360.0f - f4);
                }
                photoViewer.K(f4, photoViewer.D1.b.getStateMirror(), new y98(photoViewer, (byte) 27));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (!photoViewer.f2 && !photoViewer.K0()) {
                    photoViewer.V1();
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                if (!photoViewer.K0() && (ed8Var = photoViewer.d) != null && ed8Var.d() != null && !photoViewer.d.d().isEmpty()) {
                    photoViewer.A2(!photoViewer.L, true);
                    break;
                }
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer.Y0(true);
                photoViewer.v(0, true);
                break;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.d9;
                r47 r47Var = photoViewer.S4;
                if (r47Var == null || !r47Var.q4()) {
                    if (photoViewer.G.v0.a()) {
                        photoViewer.p0.U(null, null);
                        break;
                    }
                } else {
                    r47 r47Var2 = photoViewer.S4;
                    if (r47Var2 != null && r47Var2.q4() && photoViewer.p0.getAlpha() > 0.5f) {
                        final int i3 = photoViewer.S4.K1;
                        final x53 x53Var = new x53();
                        fu5 H = fu5.H(photoViewer.f0, x53Var, photoViewer.p0, true);
                        H.b0(0.0f, -hl.L(46.0f));
                        H.W(5);
                        r47 r47Var3 = photoViewer.S4;
                        if (r47Var3.W0 == null && r47Var3.X0 == null) {
                            String str = r47Var3.T0;
                            if (str != null) {
                                break;
                            }
                            if (!yac.h(i3).p() && !uc7.s1(photoViewer.U).M3() && !photoViewer.S4.b1) {
                                H.b(R.drawable.msg_block2, ob6.M0(2131749077, null), new Runnable() { // from class: da8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b3;
                                        x53 x53Var2 = x53Var;
                                        int i4 = i3;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (b4) {
                                            case 0:
                                                Drawable[] drawableArr6 = PhotoViewer.d9;
                                                if (!yac.h(i4).p()) {
                                                    new xk8(photoViewer2.l4, 3, true).show();
                                                    break;
                                                } else {
                                                    new d31(photoViewer2.f0, x53Var2).c(ob6.M0(2131754481, null)).j();
                                                    uc7.s1(i4).n0(true);
                                                    e eVar = photoViewer2.l4;
                                                    if (eVar instanceof zu1) {
                                                        zu1 zu1Var = (zu1) eVar;
                                                        zu1Var.ab(photoViewer2.S4);
                                                        zu1Var.cb(photoViewer2.S4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr7 = PhotoViewer.d9;
                                                if (!yac.h(i4).p()) {
                                                    new xk8(photoViewer2.l4, 3, true).show();
                                                    break;
                                                } else {
                                                    new d31(photoViewer2.f0, x53Var2).c(ob6.M0(2131754481, null)).j();
                                                    uc7.s1(i4).n0(true);
                                                    e eVar2 = photoViewer2.l4;
                                                    if (eVar2 instanceof zu1) {
                                                        zu1 zu1Var2 = (zu1) eVar2;
                                                        zu1Var2.ab(photoViewer2.S4);
                                                        zu1Var2.cb(photoViewer2.S4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.S4.b1) {
                                H.b(R.drawable.msg_info, ob6.M0(2131754939, null), new a58(photoViewer, x53Var, (byte) 3), false);
                                if ((photoViewer.l4 instanceof zu1) && !uc7.s1(i3).M3()) {
                                    H.j();
                                    final byte b4 = 1;
                                    H.b(R.drawable.msg_cancel, ob6.M0(2131746047, null), new Runnable() { // from class: da8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b42 = b4;
                                            x53 x53Var2 = x53Var;
                                            int i4 = i3;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b42) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.d9;
                                                    if (!yac.h(i4).p()) {
                                                        new xk8(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new d31(photoViewer2.f0, x53Var2).c(ob6.M0(2131754481, null)).j();
                                                        uc7.s1(i4).n0(true);
                                                        e eVar = photoViewer2.l4;
                                                        if (eVar instanceof zu1) {
                                                            zu1 zu1Var = (zu1) eVar;
                                                            zu1Var.ab(photoViewer2.S4);
                                                            zu1Var.cb(photoViewer2.S4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.d9;
                                                    if (!yac.h(i4).p()) {
                                                        new xk8(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new d31(photoViewer2.f0, x53Var2).c(ob6.M0(2131754481, null)).j();
                                                        uc7.s1(i4).n0(true);
                                                        e eVar2 = photoViewer2.l4;
                                                        if (eVar2 instanceof zu1) {
                                                            zu1 zu1Var2 = (zu1) eVar2;
                                                            zu1Var2.ab(photoViewer2.S4);
                                                            zu1Var2.cb(photoViewer2.S4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            if (H.y() > 0) {
                                H.a0();
                                break;
                            }
                        }
                        fu5 K = H.K();
                        b8 b8Var = new b8(0, x53Var, photoViewer.F, true, false);
                        b8Var.setItemHeight(44);
                        b8Var.j(ob6.M0(2131753749, null), R.drawable.msg_arrow_back, null);
                        b8Var.getTextView().setPadding(ob6.a0 ? 0 : hl.L(40.0f), 0, ob6.a0 ? hl.L(40.0f) : 0, 0);
                        b8Var.setOnClickListener(new qn1(H, b2));
                        K.q(b8Var, tre.o(-1, -2));
                        K.q(new k8(photoViewer.F, x53Var), tre.o(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str2 = photoViewer.S4.T0;
                        byte b5 = 6;
                        if (str2 != null) {
                            f = 300.0f;
                            if (!TextUtils.equals(hl.J0(str2, false), uc7.s1(photoViewer.U).N2)) {
                                TextView textView = new TextView(photoViewer.F);
                                yob.X(textView, aob.Xc, x53Var);
                                textView.setTextSize(1, 14.0f);
                                f2 = 10.0f;
                                textView.setPadding(hl.L(18.0f), hl.L(10.0f), hl.L(18.0f), hl.L(10.0f));
                                textView.setMaxWidth(hl.L(300.0f));
                                Uri parse = Uri.parse(photoViewer.S4.T0);
                                textView.setText(m01.x(parse, null, null, m01.a(parse.getHost()), null));
                                int i4 = aob.I5;
                                hf0 Y = aob.Y(photoViewer.y0(i4), 0, photoViewer.S4.X0 == null ? 6 : 0);
                                uob M = yob.M(i4);
                                textView.setBackground(Y);
                                yob.j(textView, Y, null, M, x53Var);
                                textView.setOnClickListener(new uv5(photoViewer, H, (byte) 20));
                                textView.setOnLongClickListener(new v0(photoViewer, x53Var, (byte) 4));
                                arrayList.add(textView);
                                if (photoViewer.S4.W0 != null) {
                                    TextView textView2 = new TextView(photoViewer.F);
                                    yob.X(textView2, aob.E8, x53Var);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setPadding(hl.L(18.0f), hl.L(f2), hl.L(18.0f), hl.L(f2));
                                    textView2.setMaxWidth(hl.L(f));
                                    textView2.setText(photoViewer.S4.W0);
                                    int i5 = aob.I5;
                                    hf0 Y2 = aob.Y(photoViewer.y0(i5), 0, photoViewer.S4.X0 == null ? 6 : 0);
                                    uob M2 = yob.M(i5);
                                    textView2.setBackground(Y2);
                                    yob.j(textView2, Y2, null, M2, x53Var);
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: ca8
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            byte b6 = b3;
                                            x53 x53Var2 = x53Var;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b6) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.d9;
                                                    if (hl.g(photoViewer2.S4.W0)) {
                                                        new d31(o11.a(photoViewer2.F), x53Var2).i(ob6.M0(2131743847, null)).j();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.d9;
                                                    if (hl.g(photoViewer2.S4.X0)) {
                                                        new d31(o11.a(photoViewer2.F), x53Var2).i(ob6.M0(2131743847, null)).j();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView2);
                                }
                                if (photoViewer.S4.X0 != null) {
                                    TextView textView3 = new TextView(photoViewer.F);
                                    yob.X(textView3, aob.E8, x53Var);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setPadding(hl.L(18.0f), hl.L(f2), hl.L(18.0f), hl.L(f2));
                                    textView3.setMaxWidth(hl.L(f));
                                    textView3.setText(photoViewer.S4.X0);
                                    int i6 = aob.I5;
                                    hf0 Y3 = aob.Y(photoViewer.y0(i6), 0, 6);
                                    uob M3 = yob.M(i6);
                                    textView3.setBackground(Y3);
                                    yob.j(textView3, Y3, null, M3, x53Var);
                                    final byte b6 = 1;
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: ca8
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            byte b62 = b6;
                                            x53 x53Var2 = x53Var;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b62) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.d9;
                                                    if (hl.g(photoViewer2.S4.W0)) {
                                                        new d31(o11.a(photoViewer2.F), x53Var2).i(ob6.M0(2131743847, null)).j();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.d9;
                                                    if (hl.g(photoViewer2.S4.X0)) {
                                                        new d31(o11.a(photoViewer2.F), x53Var2).i(ob6.M0(2131743847, null)).j();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView3);
                                }
                                for (i = 0; i < arrayList.size(); i++) {
                                    View view2 = (View) arrayList.get(i);
                                    if (i > 0) {
                                        FrameLayout frameLayout = new FrameLayout(photoViewer.F);
                                        yob.h(aob.d7, x53Var, frameLayout);
                                        LinearLayout.LayoutParams o = tre.o(-1, 1);
                                        o.height = 1;
                                        K.q(frameLayout, o);
                                    }
                                    K.q(view2, tre.o(-1, -2));
                                }
                                H.b(R.drawable.msg_channel, ob6.M0(2131744905, null), new c10(H, K, b5), false);
                                if (!yac.h(i3).p()) {
                                    H.b(R.drawable.msg_block2, ob6.M0(2131749077, null), new Runnable() { // from class: da8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b42 = b3;
                                            x53 x53Var2 = x53Var;
                                            int i42 = i3;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b42) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.d9;
                                                    if (!yac.h(i42).p()) {
                                                        new xk8(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new d31(photoViewer2.f0, x53Var2).c(ob6.M0(2131754481, null)).j();
                                                        uc7.s1(i42).n0(true);
                                                        e eVar = photoViewer2.l4;
                                                        if (eVar instanceof zu1) {
                                                            zu1 zu1Var = (zu1) eVar;
                                                            zu1Var.ab(photoViewer2.S4);
                                                            zu1Var.cb(photoViewer2.S4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.d9;
                                                    if (!yac.h(i42).p()) {
                                                        new xk8(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new d31(photoViewer2.f0, x53Var2).c(ob6.M0(2131754481, null)).j();
                                                        uc7.s1(i42).n0(true);
                                                        e eVar2 = photoViewer2.l4;
                                                        if (eVar2 instanceof zu1) {
                                                            zu1 zu1Var2 = (zu1) eVar2;
                                                            zu1Var2.ab(photoViewer2.S4);
                                                            zu1Var2.cb(photoViewer2.S4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                                if (photoViewer.S4.b1) {
                                }
                                if (H.y() > 0) {
                                }
                            }
                        } else {
                            f = 300.0f;
                        }
                        f2 = 10.0f;
                        if (photoViewer.S4.W0 != null) {
                        }
                        if (photoViewer.S4.X0 != null) {
                        }
                        while (i < arrayList.size()) {
                        }
                        H.b(R.drawable.msg_channel, ob6.M0(2131744905, null), new c10(H, K, b5), false);
                        if (!yac.h(i3).p()) {
                        }
                        if (photoViewer.S4.b1) {
                        }
                        if (H.y() > 0) {
                        }
                    }
                }
                break;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.d9;
                r47 r47Var4 = photoViewer.S4;
                if (r47Var4 != null && r47Var4.D2(true)) {
                    dh2 dh2Var = photoViewer.K0;
                    r47 r47Var5 = photoViewer.S4;
                    LinearLayout linearLayout = dh2Var.b;
                    if (r47Var5 != null && (message = r47Var5.k) != null && message.media != null && r47Var5.D2(true)) {
                        int i7 = r47Var5.K1;
                        TLRPC.MessageMedia messageMedia = r47Var5.k.media;
                        ArrayList X = kfc.X(i7, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i8 = 0;
                        while (i8 < X.size()) {
                            hfc hfcVar = (hfc) X.get(i8);
                            jfc a = hfcVar.a();
                            Object[] objArr = new Object[i2];
                            objArr[0] = Integer.valueOf(hfcVar.b());
                            String concat = ob6.a0(null, null, 2131746178, objArr).concat(hfcVar.a ? " (" + ob6.M0(2131746177, null) + ")" : "");
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a.b()) {
                                spannableStringBuilder.append(hl.i0(a.g.size, false, false));
                                spannableStringBuilder.append(ob6.M0(2131746181, null));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                wm2 wm2Var = new wm2(R.drawable.msg_mini_arrow_mediabold, 0);
                                wm2Var.w = 90.0f;
                                float L = hl.L(1.0f);
                                wm2Var.r = f3;
                                wm2Var.s = L;
                                wm2Var.H = 0.85f;
                                spannableString.setSpan(wm2Var, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(hl.i0(a.g.size, false, false));
                            }
                            b8 c = s7.c(false, false, linearLayout, 0, concat, false, null);
                            c.setSubtext(spannableStringBuilder);
                            c.d(-328966, -328966);
                            c.b.setPadding(0, 0, 0, 0);
                            c.setOnClickListener(new c0(dh2Var, r47Var5, hfcVar, (byte) 24));
                            c.setSelectorColor(268435455);
                            i8++;
                            f3 = 0.0f;
                            i2 = 1;
                        }
                        photoViewer.u0.b();
                        break;
                    }
                }
                y10 y10Var = photoViewer.G;
                if (y10Var != null && y10Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.G.getActionBarMenuOnItemClick().b(2);
                    photoViewer.p0.U(null, null);
                    break;
                }
                break;
            case 6:
                Drawable[] drawableArr7 = PhotoViewer.d9;
                Activity activity = photoViewer.E;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = (byte) 2;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
                    }
                    photoViewer.E.setRequestedOrientation(1);
                    break;
                }
                break;
            case 7:
                Drawable[] drawableArr8 = PhotoViewer.d9;
                photoViewer.p0.p();
                photoViewer.A(false, false);
                Activity activity2 = photoViewer.E;
                if (activity2 instanceof LaunchActivity) {
                    ((LaunchActivity) activity2).u0(new woa(), false, true);
                    break;
                }
                break;
            default:
                Drawable[] drawableArr9 = PhotoViewer.d9;
                Activity activity3 = photoViewer.E;
                if (activity3 != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = (byte) 1;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity3.getRequestedOrientation();
                    }
                    int rotation = ((WindowManager) photoViewer.E.getSystemService("window")).getDefaultDisplay().getRotation();
                    Activity activity4 = photoViewer.E;
                    if (rotation == 3) {
                        activity4.setRequestedOrientation(8);
                    } else {
                        activity4.setRequestedOrientation(0);
                    }
                    photoViewer.t2(false, false);
                    break;
                }
                break;
        }
    }
}
