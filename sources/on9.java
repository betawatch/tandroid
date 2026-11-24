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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class on9 extends Dialog implements gk7, VoIPService.StateListener {
    public static on9 Q0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final View E;
    public int E0;
    public final pha F;
    public long F0;
    public final LinearLayout G;
    public boolean G0;
    public final zf2 H;
    public boolean H0;
    public final zf2 I;
    public boolean I0;
    public final UndoView J;
    public boolean J0;
    public final zha K;
    public jn9 K0;
    public final ix2 L;
    public final vm9 L0;
    public final xha M;
    public final vm9 M0;
    public final a8 N;
    public final vm9 N0;
    public final a8 O;
    public final vm9 O0;
    public final a8 P;
    public final dn9 P0;
    public final a8 Q;
    public io5 R;
    public boolean S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public boolean W;
    public float X;
    public ValueAnimator Y;
    public final vm9 Z;
    public final LaunchActivity a;
    public boolean a0;
    public final j5 b;
    public float b0;
    public final fc2 c;
    public float c0;
    public TLRPC.Chat d;
    public int d0;
    public final f53 e;
    public int e0;
    public final nn9 f;
    public int f0;
    public int g0;
    public final FrameLayout h;
    public int h0;
    public float i0;
    public float j0;
    public ValueAnimator k0;
    public yla l0;
    public boolean m0;
    public final TextureView n;
    public boolean n0;
    public float o0;
    public ValueAnimator p0;
    public final vm9 q0;
    public final qw4 r;
    public Surface r0;
    public final ln9 s;
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
    public on9(LaunchActivity launchActivity, j5 j5Var, fc2 fc2Var, TLRPC.Chat chat) {
        super(launchActivity, R.style.TransparentDialog);
        f53 f53Var = new f53();
        this.e = f53Var;
        qw4 qw4Var = new qw4();
        this.r = qw4Var;
        this.L = new ix2(this);
        this.R = io5.e;
        this.Z = new vm9(this, (byte) 6);
        this.h0 = gl.L(5.0f);
        boolean z = true;
        this.n0 = true;
        this.o0 = 1.0f;
        this.q0 = new vm9(this, (byte) 7);
        this.F0 = -1L;
        this.L0 = new vm9(this, true ? 1 : 0);
        this.M0 = new vm9(this, (byte) 2);
        this.N0 = new vm9(this, (byte) 3);
        this.O0 = new vm9(this, (byte) 4);
        this.P0 = new dn9(this);
        this.a = launchActivity;
        this.b = j5Var;
        this.c = fc2Var;
        this.d = chat;
        ArrayList arrayList = fc2Var.f;
        final byte b = 0;
        if (!arrayList.isEmpty() && ((gc2) arrayList.get(0)).c > 0.0f) {
            this.t0 = ((gc2) arrayList.get(0)).c;
        }
        nn9 nn9Var = new nn9(this, launchActivity);
        this.f = nn9Var;
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.h = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setOutlineProvider(new en9(this));
        frameLayout.setClipToOutline(true);
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: wm9
            public final /* synthetic */ on9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                on9 on9Var = this.b;
                switch (b2) {
                    case 0:
                        vm9 vm9Var = on9Var.Z;
                        if (!on9Var.g()) {
                            if (!on9Var.T) {
                                on9Var.m(true, true);
                                break;
                            } else {
                                on9Var.k(!on9Var.n0, true);
                                break;
                            }
                        } else if (!on9Var.a0) {
                            on9Var.a0 = true;
                            gl.d3(vm9Var, ViewConfiguration.getDoubleTapTimeout());
                            break;
                        } else {
                            on9Var.a0 = false;
                            gl.r(vm9Var);
                            on9Var.l(!on9Var.W, true);
                            break;
                        }
                    case 1:
                        on9Var.j();
                        on9Var.f();
                        break;
                    case 2:
                        LaunchActivity launchActivity2 = on9Var.a;
                        on9Var.j();
                        if (on9Var.v0) {
                            if (!on9Var.g()) {
                                if (!gl.O1()) {
                                    if (on9Var.S == on9Var.h()) {
                                        on9Var.m(true, true);
                                    }
                                    launchActivity2.setRequestedOrientation(on9Var.h() ? 6 : 1);
                                    break;
                                } else {
                                    on9Var.m(true, true);
                                    break;
                                }
                            } else {
                                on9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                break;
                            }
                        }
                        break;
                    default:
                        on9Var.j();
                        h75.l1(on9Var.getContext(), new vm9(on9Var, (byte) 5), false, false);
                        break;
                }
            }
        });
        TextureView textureView = new TextureView(launchActivity);
        this.n = textureView;
        textureView.setSurfaceTextureListener(new fn9(this));
        frameLayout.addView(textureView, nme.e(-1, -1, 17));
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity, null);
        this.w = radialProgressView;
        radialProgressView.setSize(gl.L(36.0f));
        radialProgressView.setProgressColor(-1);
        frameLayout.addView(radialProgressView, nme.e(48, 48, 17));
        TextView textView = new TextView(launchActivity);
        this.x = textView;
        textView.setTextColor(bm2.o(-1, kk7.h3));
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        frameLayout.addView(textView, nme.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        nn9Var.addView(frameLayout);
        View view = new View(launchActivity);
        this.y = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bm2.o(-16777216, kk7.h3), bm2.o(-16777216, kk7.m1), 0}));
        nn9Var.addView(view);
        View view2 = new View(launchActivity);
        this.E = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{bm2.o(-16777216, kk7.h3), bm2.o(-16777216, kk7.m1), 0}));
        nn9Var.addView(view2);
        pha phaVar = new pha(launchActivity, f53Var);
        this.F = phaVar;
        phaVar.setOccupyStatusBar(false);
        phaVar.setForceSkipTouches(true);
        phaVar.setTitleColor(-1);
        phaVar.setSubtitleColor(bm2.o(-1, kk7.I2));
        phaVar.m0 = true;
        phaVar.g0 = -1;
        phaVar.updateColors();
        int o = bm2.o(-1, 42);
        phaVar.n0 = true;
        phaVar.i0 = o;
        phaVar.updateColors();
        phaVar.setBackButtonImage(R.drawable.ic_ab_back);
        ix4 ix4Var = new ix4();
        ix4Var.a(-14933463);
        ix4 ix4Var2 = ix4Var;
        if (Build.VERSION.SDK_INT >= 31) {
            ln9 ln9Var = new ln9(new wh9(nn9Var, (byte) 4));
            this.s = ln9Var;
            ix4Var2 = ln9Var;
        }
        gn9 gn9Var = new gn9(ix4Var2, ix4Var2, ix4Var2);
        qw4Var.i(nn9Var);
        gn9Var.j = qw4Var;
        gn9Var.k = true;
        er erVar = new er(this, (byte) 6);
        nl0 nl0Var = new nl0(f53Var);
        byte b2 = 5;
        nl0Var.e = new wh9(erVar, b2);
        nl0Var.f(0, 0);
        nl0Var.e(0, 0);
        nl0Var.d(0, 0);
        phaVar.M = gn9Var;
        phaVar.N = nl0Var;
        phaVar.r();
        zha zhaVar = new zha(launchActivity);
        this.K = zhaVar;
        zhaVar.setOnShownChanged(new bm0((byte) 25));
        phaVar.setMenuOverlayProvider(new wf0(this, b2));
        wha t = phaVar.t();
        t.a(1, R.drawable.msg_voice_pip).setContentDescription(k96.M0(2131754807, null));
        boolean W = hc2.W(chat);
        xha a = t.a(2, R.drawable.ic_ab_other);
        this.M = a;
        a.setContentDescription(k96.M0(2131754838, null));
        this.N = a.e(9, R.drawable.msg_link, k96.M0(2131743095, null));
        this.O = a.e(10, R.drawable.msg_edit, k96.M0(W ? 2131743243 : 2131743142, null));
        this.P = a.e(11, R.drawable.msg_voice_unmuted, k96.M0(2131743106, null));
        a8 e = a.e(12, R.drawable.msg_cancel, k96.M0(W ? 2131743239 : 2131743138, null));
        this.Q = e;
        int v0 = bkb.v0(bkb.p7, f53Var);
        e.d(v0, v0);
        phaVar.setActionBarMenuOnItemClick(new hn9(this));
        nn9Var.addView(phaVar);
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        this.G = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        er erVar2 = new er(this, (byte) 6);
        nl0 nl0Var2 = new nl0(f53Var);
        nl0Var2.e = new wh9(erVar2, b2);
        nl0Var2.f(0, 0);
        nl0Var2.e(0, 0);
        nl0Var2.d(0, 0);
        zf2 zf2Var = new zf2(launchActivity, R.drawable.msg_voiceshare, gn9Var, nl0Var2, k96.M0(2131743195, null));
        this.H = zf2Var;
        final boolean z2 = z ? 1 : 0;
        zf2Var.setOnClickListener(new View.OnClickListener(this) { // from class: wm9
            public final /* synthetic */ on9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = z2;
                on9 on9Var = this.b;
                switch (b22) {
                    case 0:
                        vm9 vm9Var = on9Var.Z;
                        if (!on9Var.g()) {
                            if (!on9Var.T) {
                                on9Var.m(true, true);
                                break;
                            } else {
                                on9Var.k(!on9Var.n0, true);
                                break;
                            }
                        } else if (!on9Var.a0) {
                            on9Var.a0 = true;
                            gl.d3(vm9Var, ViewConfiguration.getDoubleTapTimeout());
                            break;
                        } else {
                            on9Var.a0 = false;
                            gl.r(vm9Var);
                            on9Var.l(!on9Var.W, true);
                            break;
                        }
                    case 1:
                        on9Var.j();
                        on9Var.f();
                        break;
                    case 2:
                        LaunchActivity launchActivity2 = on9Var.a;
                        on9Var.j();
                        if (on9Var.v0) {
                            if (!on9Var.g()) {
                                if (!gl.O1()) {
                                    if (on9Var.S == on9Var.h()) {
                                        on9Var.m(true, true);
                                    }
                                    launchActivity2.setRequestedOrientation(on9Var.h() ? 6 : 1);
                                    break;
                                } else {
                                    on9Var.m(true, true);
                                    break;
                                }
                            } else {
                                on9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                break;
                            }
                        }
                        break;
                    default:
                        on9Var.j();
                        h75.l1(on9Var.getContext(), new vm9(on9Var, (byte) 5), false, false);
                        break;
                }
            }
        });
        er erVar3 = new er(this, (byte) 6);
        nl0 nl0Var3 = new nl0(f53Var);
        nl0Var3.e = new wh9(erVar3, b2);
        nl0Var3.f(0, 0);
        nl0Var3.e(0, 0);
        nl0Var3.d(0, 0);
        zf2 zf2Var2 = new zf2(launchActivity, R.drawable.voice_expand, gn9Var, nl0Var3, k96.M0(2131743136, null));
        this.I = zf2Var2;
        final byte b3 = 2;
        zf2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: wm9
            public final /* synthetic */ on9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b3;
                on9 on9Var = this.b;
                switch (b22) {
                    case 0:
                        vm9 vm9Var = on9Var.Z;
                        if (!on9Var.g()) {
                            if (!on9Var.T) {
                                on9Var.m(true, true);
                                break;
                            } else {
                                on9Var.k(!on9Var.n0, true);
                                break;
                            }
                        } else if (!on9Var.a0) {
                            on9Var.a0 = true;
                            gl.d3(vm9Var, ViewConfiguration.getDoubleTapTimeout());
                            break;
                        } else {
                            on9Var.a0 = false;
                            gl.r(vm9Var);
                            on9Var.l(!on9Var.W, true);
                            break;
                        }
                    case 1:
                        on9Var.j();
                        on9Var.f();
                        break;
                    case 2:
                        LaunchActivity launchActivity2 = on9Var.a;
                        on9Var.j();
                        if (on9Var.v0) {
                            if (!on9Var.g()) {
                                if (!gl.O1()) {
                                    if (on9Var.S == on9Var.h()) {
                                        on9Var.m(true, true);
                                    }
                                    launchActivity2.setRequestedOrientation(on9Var.h() ? 6 : 1);
                                    break;
                                } else {
                                    on9Var.m(true, true);
                                    break;
                                }
                            } else {
                                on9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                break;
                            }
                        }
                        break;
                    default:
                        on9Var.j();
                        h75.l1(on9Var.getContext(), new vm9(on9Var, (byte) 5), false, false);
                        break;
                }
            }
        });
        ym9 ym9Var = new ym9(bm2.o(bm2.k(bkb.w0(null, bkb.th, false), -14933463), kk7.U2));
        nl0 nl0Var4 = new nl0(f53Var);
        nl0Var4.e = new wh9(ym9Var, b2);
        nl0Var4.f(0, 0);
        nl0Var4.e(0, 0);
        nl0Var4.d(0, 0);
        zf2 zf2Var3 = new zf2(launchActivity, R.drawable.msg_voiceclose, gn9Var, nl0Var4, k96.M0(2131743122, null));
        final byte b4 = 3;
        zf2Var3.setOnClickListener(new View.OnClickListener(this) { // from class: wm9
            public final /* synthetic */ on9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b4;
                on9 on9Var = this.b;
                switch (b22) {
                    case 0:
                        vm9 vm9Var = on9Var.Z;
                        if (!on9Var.g()) {
                            if (!on9Var.T) {
                                on9Var.m(true, true);
                                break;
                            } else {
                                on9Var.k(!on9Var.n0, true);
                                break;
                            }
                        } else if (!on9Var.a0) {
                            on9Var.a0 = true;
                            gl.d3(vm9Var, ViewConfiguration.getDoubleTapTimeout());
                            break;
                        } else {
                            on9Var.a0 = false;
                            gl.r(vm9Var);
                            on9Var.l(!on9Var.W, true);
                            break;
                        }
                    case 1:
                        on9Var.j();
                        on9Var.f();
                        break;
                    case 2:
                        LaunchActivity launchActivity2 = on9Var.a;
                        on9Var.j();
                        if (on9Var.v0) {
                            if (!on9Var.g()) {
                                if (!gl.O1()) {
                                    if (on9Var.S == on9Var.h()) {
                                        on9Var.m(true, true);
                                    }
                                    launchActivity2.setRequestedOrientation(on9Var.h() ? 6 : 1);
                                    break;
                                } else {
                                    on9Var.m(true, true);
                                    break;
                                }
                            } else {
                                on9Var.m(false, true);
                                launchActivity2.setRequestedOrientation(-1);
                                break;
                            }
                        }
                        break;
                    default:
                        on9Var.j();
                        h75.l1(on9Var.getContext(), new vm9(on9Var, (byte) 5), false, false);
                        break;
                }
            }
        });
        linearLayout.addView(zf2Var, nme.o(kk7.o1, 92));
        linearLayout.addView(zf2Var2, nme.o(kk7.o1, 92));
        linearLayout.addView(zf2Var3, nme.o(kk7.o1, 92));
        nn9Var.addView(linearLayout);
        UndoView undoView = new UndoView(launchActivity);
        this.J = undoView;
        nn9Var.addView(undoView, new FrameLayout.LayoutParams(-1, -2));
        nn9Var.addView(zhaVar, new FrameLayout.LayoutParams(-1, -1));
        an9 an9Var = new an9(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(nn9Var, an9Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z3 = sharedInstance != null && sharedInstance.getCallState() == 3;
        this.v0 = z3;
        this.x0 = z3 ? 1.0f : 0.0f;
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

    public static void o(hd hdVar) {
        hdVar.j(bkb.w0(null, bkb.kh, false));
        hdVar.show();
        hdVar.o(bkb.w0(null, bkb.dh, false));
    }

    public final void a(float f) {
        this.o0 = f;
        int i = f <= 0.0f ? 4 : 0;
        pha phaVar = this.F;
        phaVar.setAlpha(f);
        phaVar.setVisibility(i);
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
        alertDialog$Builder.a.J = bkb.fh;
        return alertDialog$Builder;
    }

    public final EditTextBoldCursor d(AlertDialog$Builder alertDialog$Builder, CharSequence charSequence) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(bkb.T(getContext()));
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i = bkb.dh;
        editTextBoldCursor.setTextColor(bkb.w0(null, i, false));
        editTextBoldCursor.setHintTextColor(bkb.w0(null, bkb.eh, false));
        editTextBoldCursor.setCursorColor(bkb.w0(null, i, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setHint(charSequence);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, gl.L(4.0f), 0, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, nme.t(-1, 36, 51, 24, 6, 24, 12));
        alertDialog$Builder.n(linearLayout);
        return editTextBoldCursor;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String M0;
        int i3 = kk7.v2;
        byte b = 1;
        fc2 fc2Var = this.c;
        if (i == i3) {
            if (fc2Var.b.id == ((Long) objArr[1]).longValue()) {
                if (fc2Var.b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                } else {
                    s();
                    return;
                }
            }
            return;
        }
        if (i == kk7.S) {
            if (((TLRPC.ChatFull) objArr[0]).id == fc2Var.c) {
                s();
                return;
            }
            return;
        }
        if (i != kk7.L0) {
            if (i == kk7.C2 && VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() == 6) {
            String str = (String) objArr[1];
            boolean W = hc2.W(this.d);
            if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                M0 = k96.M0(W ? 2131743210 : 2131743077, null);
            } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                M0 = k96.M0(W ? 2131743236 : 2131743128, null);
            } else {
                M0 = b00.j(new StringBuilder(k96.M0(2131751093, null)), "\n", str);
            }
            AlertDialog$Builder c = c();
            hd hdVar = c.a;
            hdVar.S = k96.M0(2131743064, null);
            hdVar.U = M0;
            c.j(k96.M0(2131747638, null), null);
            c.i(new bn9(this, b));
            try {
                o(hdVar);
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
        gl.r(this.q0);
        byte b = 0;
        this.a0 = false;
        gl.r(this.Z);
        gl.r(this.M0);
        gl.r(this.N0);
        gl.r(this.O0);
        jn9 jn9Var = this.K0;
        if (jn9Var != null) {
            jn9Var.dismiss();
        }
        vm9 vm9Var = new vm9(this, b);
        nn9 nn9Var = this.f;
        on9 on9Var = nn9Var.P;
        on9Var.H0 = true;
        on9Var.u();
        if (on9Var.T || nn9Var.getHeight() == 0) {
            nn9Var.animate().alpha(0.0f).setDuration(150L).withEndAction(vm9Var).start();
        } else {
            nn9Var.a(nn9Var.getHeight() - on9Var.e0, 250L, vm9Var);
        }
    }

    public final void e() {
        this.K.a(false);
        this.r.i(null);
        this.J0 = true;
        gl.r(this.q0);
        this.a0 = false;
        gl.r(this.Z);
        gl.r(this.M0);
        gl.r(this.N0);
        gl.r(this.O0);
        if (Q0 == this) {
            Q0 = null;
        }
        v();
        j5 j5Var = this.b;
        int i = j5Var.a;
        int i2 = j5Var.a;
        kk7.f(i).n(this, kk7.v2);
        kk7.f(i2).n(this, kk7.L0);
        kk7.f(i2).n(this, kk7.S);
        kk7.e().n(this, kk7.C2);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        vm9 vm9Var = this.L0;
        LaunchActivity launchActivity = this.a;
        launchActivity.a1.remove(vm9Var);
        launchActivity.setRequestedOrientation(-1);
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        h75.t5 = false;
        kk7.e().k(kk7.E2, new Object[0]);
        o85.k(launchActivity);
    }

    public final void f() {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        if (this.d == null) {
            return;
        }
        j5 j5Var = this.b;
        int i = j5Var.a;
        int i2 = j5Var.a;
        na7 q1 = na7.q1(i);
        String K = hc2.K(this.d, false);
        if (hc2.t0(this.d)) {
            String o = TextUtils.isEmpty(K) ? null : ls6.o(q1.N2, "/", K, new StringBuilder());
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            fc2 fc2Var = this.c;
            exportgroupcallinvite.call = fc2Var.h(fc2Var.a);
            ConnectionsManager.getInstance(i2).sendRequest(exportgroupcallinvite, new hj7(this, o, (byte) 17));
            return;
        }
        if (!TextUtils.isEmpty(K)) {
            i(ls6.o(q1.N2, "/", K, new StringBuilder()), true);
            return;
        }
        TLRPC.ChatFull L0 = q1.L0(this.d.id);
        if (L0 != null && (tL_chatInviteExported = L0.exported_invite) != null && !TextUtils.isEmpty(tL_chatInviteExported.link)) {
            i(L0.exported_invite.link, true);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = na7.j1(this.d);
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_exportChatInvite, new hj7(this, L0, (byte) 18));
    }

    public final boolean g() {
        if (this.T) {
            return gl.O1() || this.S == h();
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
            str2 = k96.a0(null, null, hc2.W(this.d) ? 2131743238 : 2131743130, str);
        } else {
            str2 = str;
        }
        jn9 jn9Var = new jn9(this, getContext(), str2, str);
        this.K0 = jn9Var;
        jn9Var.n2 = new u39(this, (byte) 7);
        jn9Var.setOnDismissListener(new bn9(this, b));
        this.K0.show();
    }

    public final void j() {
        vm9 vm9Var = this.q0;
        gl.r(vm9Var);
        if (this.T && this.n0 && !this.J0) {
            gl.d3(vm9Var, 3000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(boolean z, boolean z2) {
        gl.r(this.q0);
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
                this.p0.setInterpolator(s33.f);
                this.p0.addUpdateListener(new xm9(this, b));
                this.p0.addListener(new in9(this, (byte) 2));
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
                this.Y.setInterpolator(s33.f);
                this.Y.addUpdateListener(new xm9(this, (byte) 3));
                this.Y.addListener(new in9(this, (byte) 0));
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
        gl.r(this.Z);
        if (!z) {
            l(false, z2);
        }
        nn9 nn9Var = this.f;
        nn9Var.i();
        this.K.a(false);
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V = null;
        }
        float f = z ? 1.0f : 0.0f;
        if (!z2 || nn9Var.getWidth() <= 0) {
            n(f);
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, f);
            this.V = ofFloat;
            ofFloat.setDuration(250L);
            this.V.setInterpolator(s33.f);
            this.V.addUpdateListener(new xm9(this, b));
            this.V.addListener(new in9(this, (byte) 1));
            this.V.start();
        }
        k(true, false);
        r();
        t();
    }

    public final void n(float f) {
        this.U = f;
        pha phaVar = this.F;
        il0 il0Var = phaVar.I;
        if (il0Var != null) {
            il0Var.updateColors();
            phaVar.J.updateColors();
            phaVar.K.updateColors();
        }
        phaVar.invalidate();
        zha zhaVar = phaVar.R;
        if (zhaVar != null) {
            zhaVar.invalidate();
        }
        il0 il0Var2 = (il0) this.H.c;
        il0Var2.updateColors();
        il0Var2.invalidateSelf();
        il0 il0Var3 = (il0) this.I.c;
        il0Var3.updateColors();
        il0Var3.invalidateSelf();
        u();
        a(this.o0);
        nn9 nn9Var = this.f;
        nn9Var.requestLayout();
        nn9Var.invalidate();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        zha zhaVar = this.K;
        if (zhaVar.I) {
            zhaVar.a(true);
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
        nn9 nn9Var = this.f;
        setContentView(nn9Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.flags = (-2147286656) | i;
        attributes.softInputMode = 48;
        boolean z = w01.a;
        attributes.flags = i | (-2147278464);
        gl.f2();
        gl.m(attributes);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            attributes.setFitInsetsTypes(0);
        }
        window.setAttributes(attributes);
        nn9Var.setSystemUiVisibility(1792);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (i2 >= 29) {
            window.setNavigationBarContrastEnforced(false);
            window.setStatusBarContrastEnforced(false);
        }
        gye.a(window);
        this.m0 = (this.a.getWindow().getDecorView().getSystemUiVisibility() & TLObject.FLAG_13) != 0;
        u39 u39Var = new u39(window.getDecorView());
        int i3 = Build.VERSION.SDK_INT;
        kye aycVar = i3 >= 35 ? new ayc(window, u39Var) : i3 >= 30 ? new yxc(window, u39Var) : i3 >= 26 ? new xxc(window, u39Var) : new wxc(window, u39Var);
        aycVar.b();
        aycVar.d();
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
            this.y0.addUpdateListener(new xm9(this, (byte) 2));
            this.y0.start();
        }
        r();
    }

    public final void q() {
        if (this.J0) {
            return;
        }
        fc2 fc2Var = this.c;
        boolean z = fc2Var.w;
        a8 a8Var = this.P;
        if (!z) {
            a8Var.setSubtext(null);
        } else {
            a8Var.setSubtext(gl.g0(ConnectionsManager.getInstance(this.b.a).getCurrentTime() - fc2Var.b.record_start_date, false, false));
            gl.d3(this.O0, 1000L);
        }
    }

    public final void r() {
        boolean g = g();
        int i = g ? R.drawable.voice_minimize : R.drawable.voice_expand;
        String M0 = k96.M0(!this.v0 ? 2131743150 : g ? 2131743118 : 2131743136, null);
        zf2 zf2Var = this.I;
        ((ImageView) zf2Var.b).setImageResource(i);
        ((TextView) zf2Var.d).setText(M0);
        zf2Var.setContentDescription(M0);
        boolean z = this.v0;
        ((ImageView) zf2Var.b).setEnabled(z);
        zf2Var.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void s() {
        String str;
        na7 q1 = na7.q1(this.b.a);
        fc2 fc2Var = this.c;
        TLRPC.Chat K0 = q1.K0(Long.valueOf(fc2Var.c));
        if (K0 != null) {
            this.d = K0;
        }
        if (TextUtils.isEmpty(fc2Var.b.title)) {
            TLRPC.Chat chat = this.d;
            str = chat != null ? chat.title : "";
        } else {
            str = fc2Var.b.title;
        }
        pha phaVar = this.F;
        if (!TextUtils.equals(phaVar.getTitle(), str)) {
            phaVar.setTitle(str);
        }
        if (phaVar.getTitleTextView() != null && (phaVar.getTitleTextView().getRightDrawable() == null || this.w0 != fc2Var.w)) {
            this.w0 = fc2Var.w;
            phaVar.getTitleTextView().i(null);
            phaVar.getTitleTextView().i(this.L);
        }
        boolean z = false;
        phaVar.setSubtitle(k96.G(fc2Var.b.participants_count, "ViewersWatching", new Object[0]));
        boolean w = hc2.w(14, this.d);
        boolean z2 = hc2.t0(this.d) || hc2.y(3, this.d);
        this.N.setVisibility(z2 ? 0 : 8);
        this.O.setVisibility(w ? 0 : 8);
        int i = w ? 0 : 8;
        a8 a8Var = this.P;
        a8Var.setVisibility(i);
        this.Q.setVisibility(w ? 0 : 8);
        this.M.setVisibility((w || z2) ? 0 : 8);
        a8Var.setText(k96.M0(fc2Var.w ? 2131743081 : 2131743106, null));
        if (hc2.t0(this.d) || (hc2.N(this.d) && hc2.w(3, this.d))) {
            z = true;
        }
        zf2 zf2Var = this.H;
        ((ImageView) zf2Var.b).setEnabled(z);
        zf2Var.setAlpha(z ? 1.0f : 0.5f);
        gl.r(this.O0);
        q();
        p();
    }

    @Override // android.app.Dialog
    public final void show() {
        xa8 xa8Var;
        super.show();
        j5 j5Var = this.b;
        kk7.f(j5Var.a).a(this, kk7.v2);
        kk7.f(j5Var.a).a(this, kk7.L0);
        kk7.f(j5Var.a).a(this, kk7.S);
        kk7.e().a(this, kk7.C2);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        this.a.a1.add(this.L0);
        sn9 sn9Var = sn9.w;
        if (sn9Var != null && (xa8Var = sn9Var.a) != null && xa8Var.f()) {
            sn9 sn9Var2 = sn9.w;
            if (sn9Var2.a != null) {
                ta8 ta8Var = sn9Var2.e;
                sn9Var2.e = null;
                sn9Var2.b.a = null;
                sn9Var2.a.a(new x15(sn9Var2, ta8Var, (byte) 28));
                gl.c3(new am6((byte) 19));
            }
        }
        h75.t5 = true;
        kk7.e().k(kk7.E2, new Object[0]);
        o85.k(this.a);
        this.f.O = true;
        v();
        s();
        gl.d3(this.M0, 15000L);
        gl.d3(this.N0, 2000L);
    }

    public final void t() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        u39 u39Var = new u39(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        kye aycVar = i >= 35 ? new ayc(window, u39Var) : i >= 30 ? new yxc(window, u39Var) : i >= 26 ? new xxc(window, u39Var) : new wxc(window, u39Var);
        aycVar.c(!this.T && this.m0 && this.f.g() > this.R.b / 2);
        if (!g() || this.n0) {
            aycVar.e();
        } else {
            aycVar.a();
        }
    }

    public final void u() {
        boolean z;
        View findViewById;
        if (!this.J0 && !this.H0) {
            nn9 nn9Var = this.f;
            if (nn9Var.isShown() && nn9Var.getAlpha() >= 1.0f && nn9Var.getTranslationY() == 0.0f && (this.U >= 1.0f || nn9Var.g() <= 0)) {
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
