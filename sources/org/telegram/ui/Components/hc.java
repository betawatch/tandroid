package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class hc {
    public final org.telegram.ui.ActionBar.f2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.f6 c;

    public hc(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var == null || f2Var.getLastStoryViewer() == null || !f2Var.getLastStoryViewer().y()) {
            this.a = f2Var;
            this.b = null;
            this.c = f2Var != null ? f2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            di.i4 currentPeerView = f2Var.getLastStoryViewer().n0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.L0 : null;
            this.c = f2Var.getLastStoryViewer().D;
        }
    }

    public static cc A(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        return z(f2Var, z9 ? 3 : 4, 0, f6Var);
    }

    public static cc B(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, ai.a1 a1Var, org.telegram.ui.ie ieVar, org.telegram.ui.ActionBar.f6 f6Var) {
        kb kbVar = new kb(f2Var.getParentActivity(), f6Var);
        kbVar.c(z9 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        kbVar.b.setText(org.telegram.messenger.id.M0(z9 ? 2131748545 : 2131748467, z9 ? "MessagePinnedHint" : "MessageUnpinnedHint"));
        if (!z9) {
            ac acVar = new ac(f2Var.getParentActivity(), f6Var, true);
            acVar.b = a1Var;
            acVar.c = ieVar;
            kbVar.setButton(acVar);
        }
        return cc.g(f2Var, kbVar, z9 ? 1500 : 5000);
    }

    public static cc C(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        kb kbVar = new kb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        kbVar.d(R.raw.ic_admin, "Shield");
        org.telegram.messenger.k5.r("UserSetAsAdminHint", null, 2131743683, new Object[]{str}, kbVar.b);
        return cc.g(f2Var, kbVar, 1500);
    }

    public static cc D(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str) {
        kb kbVar = new kb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        kbVar.d(R.raw.ic_ban, "Hand");
        org.telegram.messenger.k5.r("UserRemovedFromChatHint", null, 2131743734, new Object[]{user.deleted ? org.telegram.messenger.id.a0("HiddenName", null, 2131749329, new Object[0]) : user.first_name, str}, kbVar.b);
        return cc.g(f2Var, kbVar, 1500);
    }

    public static cc F(FrameLayout frameLayout, boolean z9) {
        return new hc(frameLayout, null).m(z9 ? gc.h : gc.e, 1, -115203550, -1, null);
    }

    public static cc S(int i7, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String M0;
        kb kbVar = new kb(f2Var.getParentActivity(), f6Var);
        boolean z9 = true;
        if (i7 == 0) {
            M0 = org.telegram.messenger.id.M0(2131745277, null);
        } else {
            if (i7 != 1) {
                throw new IllegalArgumentException();
            }
            M0 = org.telegram.messenger.id.M0(2131745279, null);
            z9 = false;
        }
        if (z9) {
            kbVar.d(R.raw.sound_on, new String[0]);
        } else {
            kbVar.d(R.raw.sound_off, new String[0]);
        }
        kbVar.b.setText(M0);
        return cc.g(f2Var, kbVar, 1500);
    }

    public static hc X() {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return new hc(xa.a(org.telegram.messenger.t0.b), null);
        }
        Dialog dialog = T.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.v2 ? new hc(((org.telegram.ui.ActionBar.v2) dialog).c, T.getResourceProvider()) : a0(T);
    }

    public static hc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        return new hc(frameLayout, f6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.f2 f2Var) {
        return (f2Var == null || f2Var.getParentActivity() == null || f2Var.getLayoutContainer() == null) ? false : true;
    }

    public static hc a0(org.telegram.ui.ActionBar.f2 f2Var) {
        return f2Var == null ? X() : new hc(f2Var);
    }

    public static void b0(String str) {
        if (LaunchActivity.D1) {
            X().t(org.telegram.messenger.id.a0(null, null, 2131743881, str), null).j();
        }
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        if (LaunchActivity.D1) {
            if (frameLayout == null) {
                b0(str);
                return;
            }
            cc t6 = new hc(frameLayout, f6Var).t(org.telegram.messenger.id.a0(null, null, 2131743881, str), null);
            t6.r = false;
            t6.j();
        }
    }

    public static cc d(org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        String M0;
        kb kbVar = new kb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        if (z9) {
            kbVar.d(R.raw.ic_ban, "Hand");
            M0 = org.telegram.messenger.id.M0(2131743764, null);
        } else {
            kbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.id.M0(2131743678, null);
        }
        kbVar.b.setText(org.telegram.messenger.g0.X2(M0));
        return cc.g(f2Var, kbVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.D1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(org.telegram.messenger.id.a0(null, null, 2131743881, tL_error.text), null).j();
            }
        }
    }

    public static cc j(org.telegram.ui.ActionBar.f2 f2Var) {
        return a0(f2Var).k(false);
    }

    public static cc l(String str, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        String M0;
        kb kbVar = new kb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        if (str != null) {
            M0 = org.telegram.messenger.id.a0(null, null, z9 ? 2131751413 : 2131751411, str);
        } else {
            M0 = org.telegram.messenger.id.M0(z9 ? 2131751414 : 2131751412, null);
        }
        kbVar.b.setText(org.telegram.messenger.g0.X2(M0));
        kbVar.d((z9 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return cc.g(f2Var, kbVar, 5000);
    }

    public static cc v(Context context, org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z9, bi.d3 d3Var) {
        kb kbVar;
        int i14;
        SpannableStringBuilder X2;
        cc g10;
        int i15 = 1;
        if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || f2Var == null || i7 > 1 || j3 != org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n || z9) {
            kbVar = new kb(i11, i12, context, f2Var != null ? f2Var.getResourceProvider() : null);
        } else {
            kbVar = new nb(i10, f2Var);
        }
        kb kbVar2 = kbVar;
        boolean z10 = d3Var != null;
        f fVar = d3Var != null ? new f(4, new boolean[]{false}, d3Var) : null;
        if (i7 > 1) {
            i14 = 2;
            X2 = i10 <= 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i7, "FwdMessageToManyChats", new Object[0])) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i7, "FwdMessagesToManyChats", new Object[0]));
            kbVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n) {
            int i16 = 21;
            if (i10 <= 1) {
                X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750499, null), -1, 2, z9 ? new org.telegram.messenger.rc(23) : new org.telegram.messenger.rc(i16), null);
            } else {
                X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750492, null), -1, 2, new org.telegram.messenger.rc(i16), null);
            }
            kbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            i14 = 2;
        } else {
            i14 = 2;
            bi.d3 d3Var2 = new bi.d3(fVar, f2Var, j3, 19);
            if (org.telegram.messenger.m5.z(j3)) {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(-j3));
                X2 = i10 <= 1 ? f2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131750503, M0.title), -1, 2, d3Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750503, M0.title)) : f2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131750496, M0.title), -1, 2, d3Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750496, M0.title));
            } else {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).a2(Long.valueOf(j3));
                if (i10 <= 1) {
                    int i17 = z10 ? 2131750497 : 2131750498;
                    X2 = f2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, i17, org.telegram.messenger.t10.j(a22, true)), -1, 2, d3Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i17, org.telegram.messenger.t10.j(a22, true)));
                } else {
                    int i18 = z10 ? 2131750490 : 2131750491;
                    X2 = f2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, i18, org.telegram.messenger.t10.j(a22, true)), -1, 2, d3Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i18, org.telegram.messenger.t10.j(a22, true)));
                }
            }
            kbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        kbVar2.b.setText(X2);
        if (z10) {
            ac acVar = new ac(kbVar2.getContext(), f2Var != null ? f2Var.getResourceProvider() : null, true, true);
            acVar.b = null;
            acVar.c = fVar;
            kbVar2.setButton(acVar);
        }
        kbVar2.postDelayed(new dc(kbVar2, i15), org.telegram.messenger.qs.X4);
        if (frameLayout != null) {
            g10 = cc.f(frameLayout, kbVar2, i13);
        } else {
            if (f2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = cc.g(f2Var, kbVar2, i13);
        }
        if (kbVar2 instanceof nb) {
            kbVar2.b.setSingleLine(false);
            kbVar2.b.setMaxLines(i14);
            ((nb) kbVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cc x(Activity activity, FrameLayout frameLayout, int i7, long j3, int i10, int i11) {
        SpannableStringBuilder X2;
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        kb kbVar = new kb(i10, i11, activity, null);
        int i13 = 0;
        if (i7 > 1) {
            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("InvLinkToChats", null, 2131749188, org.telegram.messenger.id.G(i7, "Chats", new Object[0])));
            kbVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n) {
                spannableStringBuilder = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749186, null));
                kbVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i12 = -1;
                kbVar.b.setText(spannableStringBuilder);
                if (i12 > 0) {
                    kbVar.postDelayed(new dc(kbVar, i13), i12);
                }
                return cc.f(frameLayout, kbVar, 1500);
            }
            X2 = org.telegram.messenger.m5.z(j3) ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("InvLinkToGroup", null, 2131749187, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(-j3)).title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("InvLinkToUser", null, 2131749185, org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).a2(Long.valueOf(j3)), true)));
            kbVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = X2;
        i12 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        kbVar.b.setText(spannableStringBuilder);
        if (i12 > 0) {
        }
        return cc.f(frameLayout, kbVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cc z(org.telegram.ui.ActionBar.f2 f2Var, int i7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        String a02;
        boolean z9;
        kb kbVar = new kb(f2Var.getParentActivity(), f6Var);
        boolean z10 = true;
        if (i7 == 0) {
            a02 = org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747901, org.telegram.messenger.id.G(1, "Hours", new Object[0]));
        } else if (i7 == 1) {
            a02 = org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747901, org.telegram.messenger.id.G(8, "Hours", new Object[0]));
        } else if (i7 == 2) {
            a02 = org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747901, org.telegram.messenger.id.G(2, "Days", new Object[0]));
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    a02 = org.telegram.messenger.id.M0(2131747856, null);
                    z9 = false;
                    z10 = false;
                } else {
                    if (i7 != 5) {
                        throw new IllegalArgumentException();
                    }
                    a02 = org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747901, org.telegram.messenger.id.c0(i10));
                    z9 = true;
                }
                if (!z10) {
                    kbVar.d(R.raw.mute_for, new String[0]);
                } else if (z9) {
                    kbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    kbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                kbVar.b.setText(a02);
                return cc.g(f2Var, kbVar, 1500);
            }
            a02 = org.telegram.messenger.id.M0(2131747900, null);
        }
        z9 = true;
        z10 = false;
        if (!z10) {
        }
        kbVar.b.setText(a02);
        return cc.g(f2Var, kbVar, 1500);
    }

    public final cc E(org.telegram.ui.ActionBar.f6 f6Var) {
        kb kbVar = new kb(W(), f6Var);
        kbVar.d(R.raw.chats_infotip, new String[0]);
        kbVar.b.setText(org.telegram.messenger.id.M0(2131746225, null));
        return b(kbVar, 1500);
    }

    public final cc G(int i7, int i10, CharSequence charSequence) {
        kb kbVar = new kb(W(), this.c);
        kbVar.c(i7, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            int i11 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i11 >= i10) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i11++;
            }
            charSequence = spannableStringBuilder;
        }
        kbVar.b.setSingleLine(false);
        kbVar.b.setMaxLines(i10);
        kbVar.b.setText(charSequence);
        return b(kbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final cc H(int i7, CharSequence charSequence) {
        return Q(i7, 36, charSequence);
    }

    public final cc I(int i7, CharSequence charSequence, CharSequence charSequence2) {
        zb zbVar = new zb(W(), this.c);
        zbVar.c(i7, 36, 36, new String[0]);
        zbVar.b.setText(charSequence);
        zbVar.c.setText(charSequence2);
        return b(zbVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final cc J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z9, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        kb kbVar = new kb(W, f6Var);
        if (i7 != 0) {
            kbVar.c(i7, 36, 36, new String[0]);
        } else {
            kbVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) kbVar.b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        kbVar.b.setTextSize(1, 14.0f);
        kbVar.b.setTextDirection(5);
        kbVar.b.setSingleLine(false);
        kbVar.b.setMaxLines(3);
        kbVar.b.setText(charSequence);
        ac acVar = new ac(W(), f6Var, true, z9);
        acVar.e(charSequence2);
        acVar.b = runnable;
        kbVar.setButton(acVar);
        return b(kbVar, i10);
    }

    public final cc K(int i7, CharSequence charSequence, String str, Runnable runnable) {
        return J(i7, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final cc L(int i7, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        zb zbVar = new zb(W, f6Var);
        zbVar.c(i7, 36, 36, new String[0]);
        zbVar.b.setText(str);
        zbVar.c.setText(charSequence);
        ac acVar = new ac(W(), f6Var, true);
        acVar.e(str2);
        acVar.b = runnable;
        zbVar.setButton(acVar);
        return b(zbVar, 5000);
    }

    public final cc M(Drawable drawable, CharSequence charSequence) {
        kb kbVar = new kb(W(), this.c);
        kbVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.cm0) {
            ((org.telegram.ui.cm0) drawable).e(kbVar.a);
        }
        kbVar.b.setText(charSequence);
        kbVar.b.setSingleLine(false);
        kbVar.b.setMaxLines(2);
        return b(kbVar, 2750);
    }

    public final cc N(String str, String str2) {
        zb zbVar = new zb(W(), this.c);
        zbVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) zbVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        zbVar.b.setText(str);
        zbVar.c.setText(str2);
        return b(zbVar, 5000);
    }

    public final cc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new bb();
        }
        yb ybVar = new yb(W(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.hc c11 = org.telegram.messenger.hc.c(w10, document);
        l9 l9Var = ybVar.a;
        l9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = ybVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = ybVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(ybVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final cc P(int i7, CharSequence charSequence) {
        kb kbVar = new kb(W(), this.c);
        kbVar.c(i7, 36, 36, new String[0]);
        kbVar.b.setText(charSequence);
        kbVar.b.setSingleLine(false);
        kbVar.b.setTextSize(1, 14.0f);
        kbVar.b.setMaxLines(4);
        return b(kbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final cc Q(int i7, int i10, CharSequence charSequence) {
        kb kbVar = new kb(W(), this.c);
        kbVar.c(i7, i10, i10, new String[0]);
        kbVar.b.setText(charSequence);
        kbVar.b.setSingleLine(false);
        kbVar.b.setMaxLines(2);
        return b(kbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final cc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new bb();
        }
        yb ybVar = new yb(W(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.hc c11 = org.telegram.messenger.hc.c(w10, document);
        l9 l9Var = ybVar.a;
        l9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = ybVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ybVar.c.setVisibility(8);
        return b(ybVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final cc T(String str) {
        kb kbVar = new kb(W(), null);
        kbVar.d(R.raw.contact_check, new String[0]);
        kbVar.b.setText(str);
        kbVar.b.setSingleLine(false);
        kbVar.b.setMaxLines(2);
        return b(kbVar, 1500);
    }

    public final cc U(String str, boolean z9, Runnable runnable, Runnable runnable2) {
        za zaVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        if (isEmpty) {
            kb kbVar = new kb(W(), f6Var);
            kbVar.b.setText(str);
            kbVar.b.setSingleLine(false);
            kbVar.b.setMaxLines(2);
            zaVar = kbVar;
        } else {
            zb zbVar = new zb(W(), f6Var);
            zbVar.b.setText(str);
            zbVar.c.setText((CharSequence) null);
            zaVar = zbVar;
        }
        zaVar.setTimer();
        ac acVar = new ac(W(), f6Var, true, z9);
        acVar.e(org.telegram.messenger.id.M0(2131743888, null));
        acVar.b = runnable;
        acVar.c = runnable2;
        zaVar.setButton(acVar);
        return b(zaVar, 5000);
    }

    public final cc V(List list, CharSequence charSequence, CharSequence charSequence2, m4.d0 d0Var) {
        float f10;
        int i7;
        Context W = W();
        boolean z9 = charSequence2 != null;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        bc bcVar = new bc(W, f6Var, z9);
        z8 z8Var = bcVar.a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    z8Var.setCount(i12);
                    z8Var.b(i7, org.telegram.messenger.p10.s0, tLObject);
                    i7 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                z8Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                z8Var.setScaleX(1.2f);
                z8Var.setScaleY(1.2f);
            } else {
                z8Var.setScaleX(1.0f);
                z8Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i7 = 0;
        }
        z8Var.a(false);
        w70 w70Var = bcVar.b;
        if (charSequence2 != null) {
            w70Var.setSingleLine(true);
            w70Var.setMaxLines(1);
            w70Var.setText(charSequence);
            w70 w70Var2 = bcVar.c;
            w70Var2.setText(charSequence2);
            w70Var2.setSingleLine(false);
            w70Var2.setMaxLines(3);
            LinearLayout linearLayout = bcVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.id.a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            w70Var.setSingleLine(false);
            w70Var.setMaxLines(4);
            w70Var.setText(charSequence);
            if (w70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    w70Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.id.a0) {
                    ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (d0Var != null) {
            ac acVar = new ac(W(), f6Var, true);
            acVar.e(org.telegram.messenger.id.M0(2131743888, null));
            acVar.b = (Runnable) d0Var.a;
            acVar.c = (Runnable) d0Var.b;
            bcVar.setButton(acVar);
        }
        return b(bcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        if (f2Var != null) {
            context = f2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? org.telegram.messenger.t0.b : context;
    }

    public final cc Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.D1 ? new bb() : tL_error == null ? t(org.telegram.messenger.id.a0(null, null, 2131743882, new Object[0]), null) : t(org.telegram.messenger.id.a0(null, null, 2131743881, tL_error.text), null);
    }

    public final cc b(za zaVar, int i7) {
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        return f2Var != null ? cc.g(f2Var, zaVar, i7) : cc.f(this.b, zaVar, i7);
    }

    public final cc c(CharSequence charSequence) {
        if (W() == null) {
            return new bb();
        }
        kb kbVar = new kb(W(), this.c);
        kbVar.d(R.raw.ic_admin, "Shield");
        kbVar.b.setSingleLine(false);
        kbVar.b.setMaxLines(3);
        kbVar.b.setText(charSequence);
        return b(kbVar, 2750);
    }

    public final cc e(boolean z9) {
        String M0;
        kb kbVar = new kb(W(), this.c);
        if (z9) {
            kbVar.d(R.raw.ic_ban, "Hand");
            M0 = org.telegram.messenger.id.M0(2131743764, null);
        } else {
            kbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.id.M0(2131743678, null);
        }
        kbVar.b.setText(org.telegram.messenger.g0.X2(M0));
        return b(kbVar, 1500);
    }

    public final void e0(String str, boolean z9) {
        if (LaunchActivity.D1) {
            if (TextUtils.isEmpty(str)) {
                cc t6 = t(org.telegram.messenger.id.a0(null, null, 2131743882, new Object[0]), null);
                t6.r = false;
                t6.k(z9);
            } else {
                cc t10 = t(org.telegram.messenger.id.a0(null, null, 2131743881, str), null);
                t10.r = false;
                t10.k(z9);
            }
        }
    }

    public final cc f(int i7, Runnable runnable) {
        kb kbVar = new kb(W(), null);
        kbVar.d(R.raw.caption_limit, new String[0]);
        String G = org.telegram.messenger.id.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.X2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        kbVar.b.setText(valueOf);
        kbVar.b.setSingleLine(false);
        kbVar.b.setMaxLines(3);
        return b(kbVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z9) {
        if (LaunchActivity.D1) {
            if (tL_error == null) {
                cc t6 = t(org.telegram.messenger.id.a0(null, null, 2131743882, new Object[0]), null);
                t6.r = false;
                t6.k(z9);
            } else if (tL_error.code != 406) {
                cc t10 = t(org.telegram.messenger.id.a0(null, null, 2131743881, tL_error.text), null);
                t10.r = false;
                t10.k(z9);
            }
        }
    }

    public final cc g(String str, ArrayList arrayList) {
        bc bcVar = new bc(W(), this.c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                bcVar.a.setCount(i11);
                bcVar.a.b(i7, org.telegram.messenger.p10.s0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            bcVar.a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            bcVar.a.setScaleX(1.2f);
            bcVar.a.setScaleY(1.2f);
        } else {
            bcVar.a.setScaleX(1.0f);
            bcVar.a.setScaleY(1.0f);
        }
        bcVar.a.a(false);
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(2);
        bcVar.b.setText(str);
        if (bcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.id.a0) {
                ((ViewGroup.MarginLayoutParams) bcVar.b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) bcVar.b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.id.a0) {
            bcVar.a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(bcVar, 5000);
    }

    public final boolean g0(int i7, long j3) {
        org.telegram.ui.ActionBar.f2 f2Var;
        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() && (f2Var = this.a) != null) {
            nb nbVar = new nb(i7, f2Var);
            if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n) {
                int i10 = 21;
                SpannableStringBuilder S2 = i7 <= 1 ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750499, null), -1, 2, new org.telegram.messenger.rc(i10), null) : org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750492, null), -1, 2, new org.telegram.messenger.rc(i10), null);
                nbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                nbVar.b.setText(S2);
                nbVar.b.setSingleLine(false);
                nbVar.b.setMaxLines(2);
                cc b10 = b(nbVar, 3500);
                nbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final cc h(TLRPC.Document document, int i7, final org.telegram.messenger.c20 c20Var) {
        b80 b80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        final TLRPC.InputStickerSet j12 = org.telegram.messenger.ij.j1(document);
        if (j12 == null) {
            return null;
        }
        final int i10 = 1;
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).m0(j12, true);
        final int i11 = 0;
        if (m0 != null && (stickerSet = m0.set) != null) {
            return r(document, i7 == 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("TopicContainsEmojiPackSingle", null, 2131744025, stickerSet.title)) : i7 == 2 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoryContainsEmojiPackSingle", null, 2131744702, stickerSet.title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("MessageContainsEmojiPackSingle", null, 2131748597, stickerSet.title)), org.telegram.messenger.id.M0(2131743566, null), new Runnable() { // from class: org.telegram.ui.Components.ec
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            c20Var.a(j12);
                            break;
                        default:
                            c20Var.a(j12);
                            break;
                    }
                }
            });
        }
        SpannableStringBuilder spannableStringBuilder = i7 == 1 ? new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("TopicContainsEmojiPackSingle", null, 2131744025, "<{LOADING}>"))) : i7 == 2 ? new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoryContainsEmojiPackSingle", null, 2131744702, "<{LOADING}>"))) : new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("MessageContainsEmojiPackSingle", null, 2131748597, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        if (indexOf >= 0) {
            b80Var = new b80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), f6Var);
            spannableStringBuilder.setSpan(b80Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.k6.vj;
            b80Var.a(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), 32), i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), 72));
        } else {
            b80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String M0 = org.telegram.messenger.id.M0(2131743566, null);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.ec
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        c20Var.a(j12);
                        break;
                    default:
                        c20Var.a(j12);
                        break;
                }
            }
        };
        Context W = W();
        ib ibVar = new ib(W, f6Var);
        w70 w70Var = new w70(W, null);
        ibVar.d = w70Var;
        w70Var.setDisablePaddingsOffset(true);
        w70Var.setSingleLine();
        w70Var.setTypeface(Typeface.SANS_SERIF);
        w70Var.setTextSize(1, 15.0f);
        w70Var.setEllipsize(TextUtils.TruncateAt.END);
        w70Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ibVar.b.setVisibility(8);
        ibVar.addView(w70Var, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.k6.vj;
        ibVar.setTextColor(ibVar.getThemedColor(i13));
        if (org.telegram.messenger.ij.D4(document)) {
            inputStickerSet = j12;
            org.telegram.ui.ActionBar.r6.t(ibVar.a, i13, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = j12;
        }
        ibVar.e(document, new String[0]);
        ibVar.b.setTextSize(1, 14.0f);
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(3);
        w70Var.setText(spannableStringBuilder);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setSingleLine(false);
        w70Var.setMaxLines(3);
        ac acVar = new ac(W(), f6Var, true);
        acVar.e(M0);
        acVar.b = runnable;
        ibVar.setButton(acVar);
        cc b10 = b(ibVar, 2750);
        if (b80Var != null) {
            gb gbVar = b10.e;
            if (gbVar instanceof ib) {
                b80Var.b = ((ib) gbVar).d;
            }
        }
        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).l0(inputStickerSet, null, false, false, new bi.f4(i7, b10, currentTimeMillis));
        return b10;
    }

    public final cc i(String str) {
        if (!org.telegram.messenger.g0.I3()) {
            return new bb();
        }
        kb kbVar = new kb(W(), null);
        kbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        kbVar.b.setText(str);
        return b(kbVar, 1500);
    }

    public final cc k(boolean z9) {
        if (!org.telegram.messenger.g0.I3()) {
            return new bb();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        if (!z9) {
            kb kbVar = new kb(W(), f6Var);
            kbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            kbVar.b.setText(org.telegram.messenger.id.M0(2131748922, null));
            return b(kbVar, 1500);
        }
        zb zbVar = new zb(W(), f6Var);
        zbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        zbVar.b.setText(org.telegram.messenger.id.M0(2131748922, null));
        zbVar.c.setText(org.telegram.messenger.id.M0(2131748920, null));
        return b(zbVar, 2750);
    }

    public final cc m(gc gcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        fc fcVar = gcVar.d;
        kb kbVar = (i10 == 0 || i11 == 0) ? new kb(W(), f6Var) : new kb(i10, i11, W(), f6Var);
        kbVar.d(fcVar.a, fcVar.b);
        TextView textView = kbVar.b;
        String str = gcVar.a;
        textView.setText(org.telegram.messenger.g0.U2(gcVar.c ? org.telegram.messenger.id.G(i7, str, new Object[0]) : org.telegram.messenger.id.M0(gcVar.b, str), new org.telegram.messenger.rc(22)));
        int i12 = fcVar.c;
        if (i12 != 0) {
            kbVar.setIconPaddingBottom(i12);
        }
        return b(kbVar, 1500);
    }

    public final cc n(gc gcVar, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(gcVar, i7, 0, 0, f6Var);
    }

    public final cc o(gc gcVar, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(gcVar, 1, 0, 0, f6Var);
    }

    public final cc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        xb xbVar = new xb(W, f6Var);
        i5 i5Var = new i5(1, org.telegram.messenger.p10.s0, j3);
        l9 l9Var = xbVar.a;
        l9Var.setAnimatedEmojiDrawable(i5Var);
        l9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var), PorterDuff.Mode.SRC_IN));
        xbVar.b.setText(str);
        xbVar.c.setText(str2);
        return b(xbVar, 2750);
    }

    public final cc q(TLRPC.Document document, CharSequence charSequence) {
        kb kbVar = new kb(W(), this.c);
        if (org.telegram.messenger.ij.D4(document)) {
            org.telegram.ui.ActionBar.r6.t(kbVar.a, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        kbVar.e(document, new String[0]);
        kbVar.b.setText(charSequence);
        kbVar.b.setTextSize(1, 14.0f);
        kbVar.b.setSingleLine(false);
        kbVar.b.setMaxLines(3);
        return b(kbVar, 2750);
    }

    public final cc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        kb kbVar = new kb(W, f6Var);
        if (org.telegram.messenger.ij.D4(document)) {
            org.telegram.ui.ActionBar.r6.t(kbVar.a, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        kbVar.e(document, new String[0]);
        if (kbVar.a.getImageReceiver() != null) {
            kbVar.a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        kbVar.b.setText(charSequence);
        kbVar.b.setTextSize(1, 14.0f);
        kbVar.b.setSingleLine(false);
        kbVar.b.setMaxLines(3);
        ac acVar = new ac(W(), f6Var, true);
        acVar.e(str);
        acVar.b = runnable;
        kbVar.setButton(acVar);
        return b(kbVar, 2750);
    }

    public final cc s(TLRPC.Document document, String str, CharSequence charSequence) {
        zb zbVar = new zb(W(), this.c);
        boolean D4 = org.telegram.messenger.ij.D4(document);
        ch0 ch0Var = zbVar.a;
        if (D4) {
            org.telegram.ui.ActionBar.r6.t(ch0Var, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ch0Var.setAutoRepeat(true);
        ch0Var.g(36, 36, document);
        zbVar.b.setText(str);
        zbVar.c.setText(charSequence);
        return b(zbVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final cc t(CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        kb kbVar = new kb(W(), f6Var);
        kbVar.d(R.raw.chats_infotip, new String[0]);
        kbVar.b.setText(charSequence);
        kbVar.b.setSingleLine(false);
        kbVar.b.setMaxLines(2);
        return b(kbVar, 1500);
    }

    public final cc u(String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        zb zbVar = new zb(W(), f6Var);
        zbVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        zbVar.b.setText(str);
        zbVar.c.setText(str2);
        return b(zbVar, 1500);
    }

    public final cc w(int i7, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        kb kbVar = new kb(W, f6Var);
        kbVar.setBackground(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, f6Var), 12);
        kbVar.a.setImageResource(i7);
        kbVar.b.setText(charSequence);
        kbVar.b.setSingleLine(false);
        kbVar.b.setLines(2);
        kbVar.b.setMaxLines(4);
        TextView textView = kbVar.b;
        textView.setMaxWidth(fi.m3.a(textView.getText(), kbVar.b.getPaint()));
        kbVar.b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) kbVar.b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        kbVar.setWrapWidth();
        return b(kbVar, 5000);
    }

    public final cc y(int i7, TLRPC.Document document, jg.r rVar) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        kb kbVar = new kb(W, f6Var);
        kbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        kbVar.removeView(kbVar.b);
        q5 q5Var = new q5(kbVar.getContext());
        kbVar.b = q5Var;
        q5Var.setTypeface(Typeface.SANS_SERIF);
        kbVar.b.setTextSize(1, 15.0f);
        kbVar.b.setEllipsize(TextUtils.TruncateAt.END);
        kbVar.b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new r5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        kbVar.b.setText(new SpannableStringBuilder(i7 > 1 ? org.telegram.messenger.id.G(i7, "SavedTagMessagesTagged", new Object[0]) : org.telegram.messenger.id.M0(2131745881, null)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (rVar != null) {
            ac acVar = new ac(W(), f6Var, true);
            acVar.e(org.telegram.messenger.id.M0(2131743566, null));
            acVar.b = rVar;
            kbVar.setButton(acVar);
        }
        kbVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, f6Var));
        kbVar.addView(kbVar.b, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(kbVar, 2750);
    }

    public hc(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = f6Var;
    }
}
