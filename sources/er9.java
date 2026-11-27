// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class er9 extends Dialog implements fn7, VoIPService.StateListener {
    public static er9 Q0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final View E;
    public int E0;
    public final jla F;
    public long F0;
    public final LinearLayout G;
    public boolean G0;
    public final rg2 H;
    public boolean H0;
    public final rg2 I;
    public boolean I0;
    public final UndoView J;
    public boolean J0;
    public final ula K;
    public zq9 K0;
    public final cy2 L;
    public final lq9 L0;
    public final sla M;
    public final lq9 M0;
    public final b8 N;
    public final lq9 N0;
    public final b8 O;
    public final lq9 O0;
    public final b8 P;
    public final tq9 P0;
    public final b8 Q;
    public mq5 R;
    public boolean S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public boolean W;
    public float X;
    public ValueAnimator Y;
    public final lq9 Z;
    public final LaunchActivity a;
    public boolean a0;
    public final k5 b;
    public float b0;
    public final vc2 c;
    public float c0;
    public TLRPC.Chat d;
    public int d0;
    public final x53 e;
    public int e0;
    public final dr9 f;
    public int f0;
    public int g0;
    public final FrameLayout h;
    public int h0;
    public float i0;
    public float j0;
    public ValueAnimator k0;
    public vpa l0;
    public boolean m0;
    public final TextureView n;
    public boolean n0;
    public float o0;
    public ValueAnimator p0;
    public final lq9 q0;
    public final vy4 r;
    public Surface r0;
    public final br9 s;
    public boolean s0;
    public float t0;
    public boolean u0;
    public boolean v0;
    public final RadialProgressView w;
    public boolean w0;
    public final TextView x;
    public float x0;
    public final View y;
    public ValueAnimator y0;
    public int z0;

    /* JADX WARN: Multi-variable type inference failed */
    public er9(LaunchActivity launchActivity, k5 k5Var, vc2 vc2Var, TLRPC.Chat chat) {
        super(launchActivity, R.style.TransparentDialog);
        x53 x53Var = new x53();
        this.e = x53Var;
        vy4 vy4Var = new vy4();
        this.r = vy4Var;
        this.L = new cy2(this);
        this.R = mq5.e;
        this.Z = new lq9(this, (byte) 6);
        this.h0 = hl.L(5.0f);
        this.n0 = true;
        this.o0 = 1.0f;
        this.q0 = new lq9(this, (byte) 7);
        this.F0 = -1L;
        this.L0 = new lq9(this, (byte) 1);
        this.M0 = new lq9(this, (byte) 2);
        this.N0 = new lq9(this, (byte) 3);
        this.O0 = new lq9(this, (byte) 4);
        this.P0 = new tq9(this);
        this.a = launchActivity;
        this.b = k5Var;
        this.c = vc2Var;
        this.d = chat;
        ArrayList arrayList = vc2Var.f;
        final byte b = 0;
        if (!arrayList.isEmpty() && ((wc2) arrayList.get(0)).c > 0.0f) {
            this.t0 = ((wc2) arrayList.get(0)).c;
        }
        dr9 dr9Var = new dr9(this, launchActivity);
        this.f = dr9Var;
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.h = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setOutlineProvider(new uq9(this));
        frameLayout.setClipToOutline(true);
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: mq9
            public final /* synthetic */ er9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                er9 er9Var = this.b;
                switch (b2) {
                    case 0:
                        lq9 lq9Var = er9Var.Z;
                        if (!er9Var.g()) {
                            if (!er9Var.T) {
                                er9Var.m(true, true);
                                break;
                            } else {
                                er9Var.k(!er9Var.n0, true);
                                break;
                            }
                        } else if (!er9Var.a0) {
                            er9Var.a0 = true;
                            hl.d3(lq9Var, ViewConfiguration.getDoubleTapTimeout());
                            break;
                        } else {
                            er9Var.a0 = false;
                            hl.r(lq9Var);
                            er9Var.l(!er9Var.W, true);
                            break;
                        }
                    case 1:
                        er9Var.j();
                        er9Var.f();
                        break;
                    case 2:
                        LaunchActivity launchActivity2 = er9Var.a;
                        er9Var.j();
                        if (er9Var.v0) {
                            if (!er9Var.g()) {
                                if (!hl.O1()) {
                                    if (er9Var.S == er9Var.h()) {
                                        er9Var.m(true, true);
                                    }
                                    launchActivity2.setRequestedOrientation(er9Var.h() ? 6 : 1);
                                    break;
                                } else {
                                    er9Var.m(true, true);
                                    break;
                                }
                            } else {
                                er9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                break;
                            }
                        }
                        break;
                    default:
                        er9Var.j();
                        j95.m1(er9Var.getContext(), new lq9(er9Var, (byte) 5), false, false);
                        break;
                }
            }
        });
        TextureView textureView = new TextureView(launchActivity);
        this.n = textureView;
        textureView.setSurfaceTextureListener(new vq9(this));
        frameLayout.addView(textureView, tre.e(-1, -1, 17));
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity, null);
        this.w = radialProgressView;
        radialProgressView.setSize(hl.L(36.0f));
        radialProgressView.setProgressColor(-1);
        frameLayout.addView(radialProgressView, tre.e(48, 48, 17));
        TextView textView = new TextView(launchActivity);
        this.x = textView;
        textView.setTextColor(vm2.o(-1, jn7.h3));
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        frameLayout.addView(textView, tre.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        dr9Var.addView(frameLayout);
        View view = new View(launchActivity);
        this.y = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{vm2.o(-16777216, jn7.h3), vm2.o(-16777216, jn7.m1), 0}));
        dr9Var.addView(view);
        View view2 = new View(launchActivity);
        this.E = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{vm2.o(-16777216, jn7.h3), vm2.o(-16777216, jn7.m1), 0}));
        dr9Var.addView(view2);
        jla jlaVar = new jla(launchActivity, x53Var);
        this.F = jlaVar;
        jlaVar.setOccupyStatusBar(false);
        jlaVar.setForceSkipTouches(true);
        jlaVar.setTitleColor(-1);
        jlaVar.setSubtitleColor(vm2.o(-1, jn7.I2));
        jlaVar.s0 = true;
        jlaVar.m0 = -1;
        jlaVar.updateColors();
        int o = vm2.o(-1, 42);
        jlaVar.t0 = true;
        jlaVar.o0 = o;
        jlaVar.updateColors();
        jlaVar.setBackButtonImage(R.drawable.ic_ab_back);
        oz4 oz4Var = new oz4();
        oz4Var.a(-14933463);
        byte b2 = 11;
        oz4 oz4Var2 = oz4Var;
        if (Build.VERSION.SDK_INT >= 31) {
            br9 br9Var = new br9(new ye9(dr9Var, b2));
            this.s = br9Var;
            oz4Var2 = br9Var;
        }
        wq9 wq9Var = new wq9(oz4Var2, oz4Var2, oz4Var2);
        vy4Var.i(dr9Var);
        wq9Var.j = vy4Var;
        wq9Var.k = true;
        fr frVar = new fr(this, (byte) 6);
        ol0 ol0Var = new ol0(x53Var);
        byte b3 = 12;
        ol0Var.e = new ye9(frVar, b3);
        ol0Var.f(0, 0);
        ol0Var.e(0, 0);
        ol0Var.d(0, 0);
        jlaVar.S = wq9Var;
        jlaVar.T = ol0Var;
        jlaVar.s();
        ula ulaVar = new ula(launchActivity);
        this.K = ulaVar;
        ulaVar.setOnShownChanged(new bm0((byte) 25));
        jlaVar.setMenuOverlayProvider(new yf0(this, (byte) 5));
        rla v = jlaVar.v();
        v.a(1, R.drawable.msg_voice_pip).setContentDescription(ob6.M0(2131754803, null));
        boolean W = xc2.W(chat);
        sla a = v.a(2, R.drawable.ic_ab_other);
        this.M = a;
        a.setContentDescription(ob6.M0(2131754834, null));
        this.N = a.e(9, R.drawable.msg_link, ob6.M0(2131742989, null));
        this.O = a.e(10, R.drawable.msg_edit, ob6.M0(W ? 2131743137 : 2131743036, null));
        this.P = a.e(11, R.drawable.msg_voice_unmuted, ob6.M0(2131743000, null));
        b8 e = a.e(12, R.drawable.msg_cancel, ob6.M0(W ? 2131743133 : 2131743032, null));
        this.Q = e;
        int v0 = aob.v0(aob.q7, x53Var);
        e.d(v0, v0);
        jlaVar.setActionBarMenuOnItemClick(new xq9(this));
        dr9Var.addView(jlaVar);
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        this.G = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        fr frVar2 = new fr(this, (byte) 6);
        ol0 ol0Var2 = new ol0(x53Var);
        ol0Var2.e = new ye9(frVar2, b3);
        ol0Var2.f(0, 0);
        ol0Var2.e(0, 0);
        ol0Var2.d(0, 0);
        rg2 rg2Var = new rg2(launchActivity, R.drawable.msg_voiceshare, wq9Var, ol0Var2, ob6.M0(2131743089, null));
        this.H = rg2Var;
        final byte b4 = 1;
        rg2Var.setOnClickListener(new View.OnClickListener(this) { // from class: mq9
            public final /* synthetic */ er9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b4;
                er9 er9Var = this.b;
                switch (b22) {
                    case 0:
                        lq9 lq9Var = er9Var.Z;
                        if (!er9Var.g()) {
                            if (!er9Var.T) {
                                er9Var.m(true, true);
                                break;
                            } else {
                                er9Var.k(!er9Var.n0, true);
                                break;
                            }
                        } else if (!er9Var.a0) {
                            er9Var.a0 = true;
                            hl.d3(lq9Var, ViewConfiguration.getDoubleTapTimeout());
                            break;
                        } else {
                            er9Var.a0 = false;
                            hl.r(lq9Var);
                            er9Var.l(!er9Var.W, true);
                            break;
                        }
                    case 1:
                        er9Var.j();
                        er9Var.f();
                        break;
                    case 2:
                        LaunchActivity launchActivity2 = er9Var.a;
                        er9Var.j();
                        if (er9Var.v0) {
                            if (!er9Var.g()) {
                                if (!hl.O1()) {
                                    if (er9Var.S == er9Var.h()) {
                                        er9Var.m(true, true);
                                    }
                                    launchActivity2.setRequestedOrientation(er9Var.h() ? 6 : 1);
                                    break;
                                } else {
                                    er9Var.m(true, true);
                                    break;
                                }
                            } else {
                                er9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                break;
                            }
                        }
                        break;
                    default:
                        er9Var.j();
                        j95.m1(er9Var.getContext(), new lq9(er9Var, (byte) 5), false, false);
                        break;
                }
            }
        });
        fr frVar3 = new fr(this, (byte) 6);
        ol0 ol0Var3 = new ol0(x53Var);
        ol0Var3.e = new ye9(frVar3, b3);
        ol0Var3.f(0, 0);
        ol0Var3.e(0, 0);
        ol0Var3.d(0, 0);
        rg2 rg2Var2 = new rg2(launchActivity, R.drawable.voice_expand, wq9Var, ol0Var3, ob6.M0(2131743030, null));
        this.I = rg2Var2;
        final byte b5 = 2;
        rg2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: mq9
            public final /* synthetic */ er9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b5;
                er9 er9Var = this.b;
                switch (b22) {
                    case 0:
                        lq9 lq9Var = er9Var.Z;
                        if (!er9Var.g()) {
                            if (!er9Var.T) {
                                er9Var.m(true, true);
                                break;
                            } else {
                                er9Var.k(!er9Var.n0, true);
                                break;
                            }
                        } else if (!er9Var.a0) {
                            er9Var.a0 = true;
                            hl.d3(lq9Var, ViewConfiguration.getDoubleTapTimeout());
                            break;
                        } else {
                            er9Var.a0 = false;
                            hl.r(lq9Var);
                            er9Var.l(!er9Var.W, true);
                            break;
                        }
                    case 1:
                        er9Var.j();
                        er9Var.f();
                        break;
                    case 2:
                        LaunchActivity launchActivity2 = er9Var.a;
                        er9Var.j();
                        if (er9Var.v0) {
                            if (!er9Var.g()) {
                                if (!hl.O1()) {
                                    if (er9Var.S == er9Var.h()) {
                                        er9Var.m(true, true);
                                    }
                                    launchActivity2.setRequestedOrientation(er9Var.h() ? 6 : 1);
                                    break;
                                } else {
                                    er9Var.m(true, true);
                                    break;
                                }
                            } else {
                                er9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                break;
                            }
                        }
                        break;
                    default:
                        er9Var.j();
                        j95.m1(er9Var.getContext(), new lq9(er9Var, (byte) 5), false, false);
                        break;
                }
            }
        });
        oq9 oq9Var = new oq9(vm2.o(vm2.k(aob.w0(null, aob.uh, false), -14933463), jn7.U2));
        ol0 ol0Var4 = new ol0(x53Var);
        ol0Var4.e = new ye9(oq9Var, b3);
        ol0Var4.f(0, 0);
        ol0Var4.e(0, 0);
        ol0Var4.d(0, 0);
        rg2 rg2Var3 = new rg2(launchActivity, R.drawable.msg_voiceclose, wq9Var, ol0Var4, ob6.M0(2131743016, null));
        final byte b6 = 3;
        rg2Var3.setOnClickListener(new View.OnClickListener(this) { // from class: mq9
            public final /* synthetic */ er9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b6;
                er9 er9Var = this.b;
                switch (b22) {
                    case 0:
                        lq9 lq9Var = er9Var.Z;
                        if (!er9Var.g()) {
                            if (!er9Var.T) {
                                er9Var.m(true, true);
                                break;
                            } else {
                                er9Var.k(!er9Var.n0, true);
                                break;
                            }
                        } else if (!er9Var.a0) {
                            er9Var.a0 = true;
                            hl.d3(lq9Var, ViewConfiguration.getDoubleTapTimeout());
                            break;
                        } else {
                            er9Var.a0 = false;
                            hl.r(lq9Var);
                            er9Var.l(!er9Var.W, true);
                            break;
                        }
                    case 1:
                        er9Var.j();
                        er9Var.f();
                        break;
                    case 2:
                        LaunchActivity launchActivity2 = er9Var.a;
                        er9Var.j();
                        if (er9Var.v0) {
                            if (!er9Var.g()) {
                                if (!hl.O1()) {
                                    if (er9Var.S == er9Var.h()) {
                                        er9Var.m(true, true);
                                    }
                                    launchActivity2.setRequestedOrientation(er9Var.h() ? 6 : 1);
                                    break;
                                } else {
                                    er9Var.m(true, true);
                                    break;
                                }
                            } else {
                                er9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                break;
                            }
                        }
                        break;
                    default:
                        er9Var.j();
                        j95.m1(er9Var.getContext(), new lq9(er9Var, (byte) 5), false, false);
                        break;
                }
            }
        });
        linearLayout.addView(rg2Var, tre.o(jn7.o1, 92));
        linearLayout.addView(rg2Var2, tre.o(jn7.o1, 92));
        linearLayout.addView(rg2Var3, tre.o(jn7.o1, 92));
        dr9Var.addView(linearLayout);
        UndoView undoView = new UndoView(launchActivity);
        this.J = undoView;
        dr9Var.addView(undoView, new FrameLayout.LayoutParams(-1, -2));
        dr9Var.addView(ulaVar, new FrameLayout.LayoutParams(-1, -1));
        rq9 rq9Var = new rq9(this);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(dr9Var, rq9Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = sharedInstance != null && sharedInstance.getCallState() == 3;
        this.v0 = z;
        this.x0 = z ? 1.0f : 0.0f;
        s();
    }

    public static int b(int i, Bitmap bitmap) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < i + 2; i5++) {
            for (int i6 = 0; i6 < 4; i6++) {
                int pixel = bitmap.getPixel(i6, i5);
                i2 += Color.red(pixel);
                i3 += Color.green(pixel);
                i4 += Color.blue(pixel);
            }
        }
        return Color.rgb(i2 / 8, i3 / 8, i4 / 8);
    }

    public static void o(id idVar) {
        idVar.j(aob.w0(null, aob.lh, false));
        idVar.show();
        idVar.o(aob.w0(null, aob.eh, false));
    }

    public final void a(float f) {
        this.o0 = f;
        int i = f <= 0.0f ? 4 : 0;
        jla jlaVar = this.F;
        jlaVar.setAlpha(f);
        jlaVar.setVisibility(i);
        LinearLayout linearLayout = this.G;
        linearLayout.setAlpha(f);
        linearLayout.setVisibility(i);
        float f2 = f * this.U;
        View view = this.y;
        view.setAlpha(f2);
        View view2 = this.E;
        view2.setAlpha(f2);
        view.setVisibility(f2 <= 0.0f ? 4 : 0);
        view2.setVisibility(f2 <= 0.0f ? 4 : 0);
    }

    public final AlertDialog$Builder c() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.e, getContext());
        alertDialog$Builder.a.J = aob.gh;
        return alertDialog$Builder;
    }

    public final EditTextBoldCursor d(AlertDialog$Builder alertDialog$Builder, CharSequence charSequence) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(aob.T(getContext()));
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i = aob.eh;
        editTextBoldCursor.setTextColor(aob.w0(null, i, false));
        editTextBoldCursor.setHintTextColor(aob.w0(null, aob.fh, false));
        editTextBoldCursor.setCursorColor(aob.w0(null, i, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setHint(charSequence);
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, hl.L(4.0f), 0, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, tre.t(-1, 36, 51, 24, 6, 24, 12));
        alertDialog$Builder.n(linearLayout);
        return editTextBoldCursor;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String M0;
        int i3 = jn7.w2;
        byte b = 1;
        vc2 vc2Var = this.c;
        if (i == i3) {
            if (vc2Var.b.id == ((Long) objArr[1]).longValue()) {
                if (vc2Var.b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                } else {
                    s();
                    return;
                }
            }
            return;
        }
        if (i == jn7.T) {
            if (((TLRPC.ChatFull) objArr[0]).id == vc2Var.c) {
                s();
                return;
            }
            return;
        }
        if (i != jn7.M0) {
            if (i == jn7.D2 && VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() == 6) {
            String str = (String) objArr[1];
            boolean W = xc2.W(this.d);
            if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                M0 = ob6.M0(W ? 2131743104 : 2131742971, null);
            } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                M0 = ob6.M0(W ? 2131743130 : 2131743022, null);
            } else {
                M0 = c00.k(new StringBuilder(ob6.M0(2131751070, null)), "\n", str);
            }
            AlertDialog$Builder c = c();
            id idVar = c.a;
            idVar.S = ob6.M0(2131742958, null);
            idVar.U = M0;
            c.j(ob6.M0(2131747558, null), null);
            c.i(new pq9(this, b));
            try {
                o(idVar);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        hl.r(this.q0);
        byte b = 0;
        this.a0 = false;
        hl.r(this.Z);
        hl.r(this.M0);
        hl.r(this.N0);
        hl.r(this.O0);
        zq9 zq9Var = this.K0;
        if (zq9Var != null) {
            zq9Var.dismiss();
        }
        lq9 lq9Var = new lq9(this, b);
        dr9 dr9Var = this.f;
        er9 er9Var = dr9Var.P;
        er9Var.H0 = true;
        er9Var.u();
        if (er9Var.T || dr9Var.getHeight() == 0) {
            dr9Var.animate().alpha(0.0f).setDuration(150L).withEndAction(lq9Var).start();
        } else {
            dr9Var.a(dr9Var.getHeight() - er9Var.e0, 250L, lq9Var);
        }
    }

    public final void e() {
        this.K.a(false);
        this.r.i(null);
        this.J0 = true;
        hl.r(this.q0);
        this.a0 = false;
        hl.r(this.Z);
        hl.r(this.M0);
        hl.r(this.N0);
        hl.r(this.O0);
        if (Q0 == this) {
            Q0 = null;
        }
        v();
        k5 k5Var = this.b;
        int i = k5Var.a;
        int i2 = k5Var.a;
        jn7.f(i).n(this, jn7.w2);
        jn7.f(i2).n(this, jn7.M0);
        jn7.f(i2).n(this, jn7.T);
        jn7.e().n(this, jn7.D2);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        lq9 lq9Var = this.L0;
        LaunchActivity launchActivity = this.a;
        launchActivity.a1.remove(lq9Var);
        launchActivity.setRequestedOrientation(-1);
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        j95.t5 = false;
        jn7.e().k(jn7.F2, new Object[0]);
        ra5.k(launchActivity);
    }

    public final void f() {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        if (this.d == null) {
            return;
        }
        k5 k5Var = this.b;
        int i = k5Var.a;
        int i2 = k5Var.a;
        uc7 s1 = uc7.s1(i);
        String K = xc2.K(this.d, false);
        if (xc2.t0(this.d)) {
            String o = TextUtils.isEmpty(K) ? null : qu6.o(s1.N2, "/", K, new StringBuilder());
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            vc2 vc2Var = this.c;
            exportgroupcallinvite.call = vc2Var.h(vc2Var.a);
            ConnectionsManager.getInstance(i2).sendRequest(exportgroupcallinvite, new pl7(this, o, (byte) 18));
            return;
        }
        if (!TextUtils.isEmpty(K)) {
            i(qu6.o(s1.N2, "/", K, new StringBuilder()), true);
            return;
        }
        TLRPC.ChatFull N0 = s1.N0(this.d.id);
        if (N0 != null && (tL_chatInviteExported = N0.exported_invite) != null && !TextUtils.isEmpty(tL_chatInviteExported.link)) {
            i(N0.exported_invite.link, true);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = uc7.l1(this.d);
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_exportChatInvite, new pl7(this, N0, (byte) 19));
    }

    public final boolean g() {
        if (this.T) {
            return hl.O1() || this.S == h();
        }
        return false;
    }

    public final boolean h() {
        float f = this.t0;
        if (f <= 0.0f) {
            f = 1.7777778f;
        }
        return f >= 1.0f;
    }

    public final void i(String str, boolean z) {
        String str2;
        if (this.J0 || TextUtils.isEmpty(str) || this.K0 != null) {
            return;
        }
        byte b = 0;
        if (z) {
            str2 = ob6.a0(null, null, xc2.W(this.d) ? 2131743132 : 2131743024, str);
        } else {
            str2 = str;
        }
        zq9 zq9Var = new zq9(this, getContext(), str2, str);
        this.K0 = zq9Var;
        zq9Var.n2 = new ve9((Object) this, (byte) 4);
        zq9Var.setOnDismissListener(new pq9(this, b));
        this.K0.show();
    }

    public final void j() {
        lq9 lq9Var = this.q0;
        hl.r(lq9Var);
        if (this.T && this.n0 && !this.J0) {
            hl.d3(lq9Var, 3000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(boolean z, boolean z2) {
        hl.r(this.q0);
        byte b = 1;
        if (!this.T) {
            z = true;
        }
        if (this.n0 != z) {
            this.n0 = z;
            if (!z) {
                this.K.a(false);
            }
            t();
        }
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.p0 = null;
        }
        float f = z ? 1.0f : 0.0f;
        if (z2) {
            float f2 = this.o0;
            if (f2 != f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.p0 = ofFloat;
                ofFloat.setDuration(200L);
                this.p0.setInterpolator(k43.f);
                this.p0.addUpdateListener(new nq9(this, b));
                this.p0.addListener(new yq9(this, (byte) 2));
                this.p0.start();
                if (z) {
                    return;
                }
                j();
                return;
            }
        }
        a(f);
        if (z) {
        }
    }

    public final void l(boolean z, boolean z2) {
        this.W = z;
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        float f = z ? 1.0f : 0.0f;
        if (z2) {
            float f2 = this.X;
            if (f2 != f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.Y = ofFloat;
                ofFloat.setDuration(250L);
                this.Y.setInterpolator(k43.f);
                this.Y.addUpdateListener(new nq9(this, (byte) 2));
                this.Y.addListener(new yq9(this, (byte) 0));
                this.Y.start();
                return;
            }
        }
        if (this.X != f) {
            this.X = f;
            this.f.requestLayout();
        }
    }

    public final void m(boolean z, boolean z2) {
        if (this.T == z) {
            return;
        }
        this.T = z;
        byte b = 0;
        this.a0 = false;
        hl.r(this.Z);
        if (!z) {
            l(false, z2);
        }
        dr9 dr9Var = this.f;
        dr9Var.i();
        this.K.a(false);
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V = null;
        }
        float f = z ? 1.0f : 0.0f;
        if (!z2 || dr9Var.getWidth() <= 0) {
            n(f);
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, f);
            this.V = ofFloat;
            ofFloat.setDuration(250L);
            this.V.setInterpolator(k43.f);
            this.V.addUpdateListener(new nq9(this, b));
            this.V.addListener(new yq9(this, (byte) 1));
            this.V.start();
        }
        k(true, false);
        r();
        t();
    }

    public final void n(float f) {
        this.U = f;
        this.F.M();
        jl0 jl0Var = (jl0) this.H.c;
        jl0Var.updateColors();
        jl0Var.invalidateSelf();
        jl0 jl0Var2 = (jl0) this.I.c;
        jl0Var2.updateColors();
        jl0Var2.invalidateSelf();
        u();
        a(this.o0);
        dr9 dr9Var = this.f;
        dr9Var.requestLayout();
        dr9Var.invalidate();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ula ulaVar = this.K;
        if (ulaVar.I) {
            ulaVar.a(true);
        } else if (!this.T) {
            dismiss();
        } else {
            m(false, true);
            this.a.setRequestedOrientation(-1);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        dr9 dr9Var = this.f;
        setContentView(dr9Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.flags = (-2147286656) | i;
        attributes.softInputMode = 48;
        boolean z = f11.a;
        attributes.flags = i | (-2147278464);
        hl.f2();
        hl.m(attributes);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            attributes.setFitInsetsTypes(0);
        }
        window.setAttributes(attributes);
        dr9Var.setSystemUiVisibility(1792);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (i2 >= 29) {
            window.setNavigationBarContrastEnforced(false);
            window.setStatusBarContrastEnforced(false);
        }
        y2f.a(window);
        this.m0 = (this.a.getWindow().getDecorView().getSystemUiVisibility() & TLObject.FLAG_13) != 0;
        ve9 ve9Var = new ve9(window.getDecorView());
        int i3 = Build.VERSION.SDK_INT;
        c3f q2dVar = i3 >= 35 ? new q2d(window, ve9Var) : i3 >= 30 ? new o2d(window, ve9Var) : i3 >= 26 ? new n2d(window, ve9Var) : new m2d(window, ve9Var);
        q2dVar.b();
        q2dVar.d();
        t();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i) {
        if (i == 11) {
            dismiss();
        } else {
            p();
        }
    }

    public final void p() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        byte b = 3;
        boolean z = this.u0 || (sharedInstance != null && sharedInstance.getCallState() == 3);
        if (this.v0 != z) {
            this.v0 = z;
            ValueAnimator valueAnimator = this.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x0, z ? 1.0f : 0.0f);
            this.y0 = ofFloat;
            ofFloat.setDuration(300L);
            this.y0.addUpdateListener(new nq9(this, b));
            this.y0.start();
        }
        r();
    }

    public final void q() {
        if (this.J0) {
            return;
        }
        vc2 vc2Var = this.c;
        boolean z = vc2Var.w;
        b8 b8Var = this.P;
        if (!z) {
            b8Var.setSubtext(null);
        } else {
            b8Var.setSubtext(hl.g0(ConnectionsManager.getInstance(this.b.a).getCurrentTime() - vc2Var.b.record_start_date, false, false));
            hl.d3(this.O0, 1000L);
        }
    }

    public final void r() {
        boolean g = g();
        int i = g ? R.drawable.voice_minimize : R.drawable.voice_expand;
        String M0 = ob6.M0(!this.v0 ? 2131743044 : g ? 2131743012 : 2131743030, null);
        rg2 rg2Var = this.I;
        ((ImageView) rg2Var.b).setImageResource(i);
        ((TextView) rg2Var.d).setText(M0);
        rg2Var.setContentDescription(M0);
        boolean z = this.v0;
        ((ImageView) rg2Var.b).setEnabled(z);
        rg2Var.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void s() {
        String str;
        uc7 s1 = uc7.s1(this.b.a);
        vc2 vc2Var = this.c;
        TLRPC.Chat M0 = s1.M0(Long.valueOf(vc2Var.c));
        if (M0 != null) {
            this.d = M0;
        }
        if (TextUtils.isEmpty(vc2Var.b.title)) {
            TLRPC.Chat chat = this.d;
            str = chat != null ? chat.title : "";
        } else {
            str = vc2Var.b.title;
        }
        jla jlaVar = this.F;
        if (!TextUtils.equals(jlaVar.getTitle(), str)) {
            jlaVar.setTitle(str);
        }
        if (jlaVar.getTitleTextView() != null && (jlaVar.getTitleTextView().getRightDrawable() == null || this.w0 != vc2Var.w)) {
            this.w0 = vc2Var.w;
            jlaVar.getTitleTextView().i(null);
            jlaVar.getTitleTextView().i(this.L);
        }
        boolean z = false;
        jlaVar.setSubtitle(ob6.G(vc2Var.b.participants_count, "ViewersWatching", new Object[0]));
        boolean w = xc2.w(14, this.d);
        boolean z2 = xc2.t0(this.d) || xc2.y(3, this.d);
        this.N.setVisibility(z2 ? 0 : 8);
        this.O.setVisibility(w ? 0 : 8);
        int i = w ? 0 : 8;
        b8 b8Var = this.P;
        b8Var.setVisibility(i);
        this.Q.setVisibility(w ? 0 : 8);
        this.M.setVisibility((w || z2) ? 0 : 8);
        b8Var.setText(ob6.M0(vc2Var.w ? 2131742975 : 2131743000, null));
        if (xc2.t0(this.d) || (xc2.N(this.d) && xc2.w(3, this.d))) {
            z = true;
        }
        rg2 rg2Var = this.H;
        ((ImageView) rg2Var.b).setEnabled(z);
        rg2Var.setAlpha(z ? 1.0f : 0.5f);
        hl.r(this.O0);
        q();
        p();
    }

    @Override // android.app.Dialog
    public final void show() {
        me8 me8Var;
        super.show();
        k5 k5Var = this.b;
        jn7.f(k5Var.a).a(this, jn7.w2);
        jn7.f(k5Var.a).a(this, jn7.M0);
        jn7.f(k5Var.a).a(this, jn7.T);
        jn7.e().a(this, jn7.D2);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        this.a.a1.add(this.L0);
        ir9 ir9Var = ir9.w;
        if (ir9Var != null && (me8Var = ir9Var.a) != null && me8Var.g()) {
            ir9 ir9Var2 = ir9.w;
            if (ir9Var2.a != null) {
                ke8 ke8Var = ir9Var2.e;
                ir9Var2.e = null;
                ir9Var2.b.a = null;
                ir9Var2.a.a(new v35(ir9Var2, ke8Var, (byte) 29));
                hl.c3(new pg6((byte) 22));
            }
        }
        j95.t5 = true;
        jn7.e().k(jn7.F2, new Object[0]);
        ra5.k(this.a);
        this.f.O = true;
        v();
        s();
        hl.d3(this.M0, 15000L);
        hl.d3(this.N0, 2000L);
    }

    public final void t() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        ve9 ve9Var = new ve9(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        c3f q2dVar = i >= 35 ? new q2d(window, ve9Var) : i >= 30 ? new o2d(window, ve9Var) : i >= 26 ? new n2d(window, ve9Var) : new m2d(window, ve9Var);
        q2dVar.c(!this.T && this.m0 && this.f.g() > this.R.b / 2);
        if (!g() || this.n0) {
            q2dVar.e();
        } else {
            q2dVar.a();
        }
    }

    public final void u() {
        boolean z;
        View findViewById;
        if (!this.J0 && !this.H0) {
            dr9 dr9Var = this.f;
            if (dr9Var.isShown() && dr9Var.getAlpha() >= 1.0f && dr9Var.getTranslationY() == 0.0f && (this.U >= 1.0f || dr9Var.g() <= 0)) {
                z = true;
                if (z != this.G0 || (findViewById = this.a.findViewById(android.R.id.content)) == null) {
                }
                this.G0 = z;
                findViewById.setVisibility(z ? 4 : 0);
                return;
            }
        }
        z = false;
        if (z != this.G0) {
        }
    }

    public final void v() {
        u();
        boolean z = (this.r0 == null || this.I0 || this.J0 || !this.f.isShown()) ? false : true;
        if (z != this.s0) {
            if (z) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    this.s0 = true;
                    sharedInstance.setRtmpStreamVideoOutput(this.P0, null);
                    return;
                }
                return;
            }
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (!this.s0 || sharedInstance2 == null) {
                this.s0 = false;
            } else {
                this.s0 = false;
                sharedInstance2.setRtmpStreamVideoOutput(null, null);
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
