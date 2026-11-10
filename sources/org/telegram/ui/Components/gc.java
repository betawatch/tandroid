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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gc {
    public final org.telegram.ui.ActionBar.f2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.h6 c;

    public gc(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var == null || f2Var.getLastStoryViewer() == null || !f2Var.getLastStoryViewer().y()) {
            this.a = f2Var;
            this.b = null;
            this.c = f2Var != null ? f2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            di.j4 currentPeerView = f2Var.getLastStoryViewer().n0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.L0 : null;
            this.c = f2Var.getLastStoryViewer().D;
        }
    }

    public static bc A(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        return z(f2Var, z9 ? 3 : 4, 0, h6Var);
    }

    public static bc B(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, ai.a1 a1Var, org.telegram.ui.ie ieVar, org.telegram.ui.ActionBar.h6 h6Var) {
        jb jbVar = new jb(f2Var.getParentActivity(), h6Var);
        jbVar.c(z9 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        jbVar.b.setText(org.telegram.messenger.id.M0(z9 ? 2131748544 : 2131748466, z9 ? "MessagePinnedHint" : "MessageUnpinnedHint"));
        if (!z9) {
            zb zbVar = new zb(f2Var.getParentActivity(), h6Var, true);
            zbVar.b = a1Var;
            zbVar.c = ieVar;
            jbVar.setButton(zbVar);
        }
        return bc.g(f2Var, jbVar, z9 ? 1500 : 5000);
    }

    public static bc C(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        jb jbVar = new jb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        jbVar.d(R.raw.ic_admin, "Shield");
        org.telegram.messenger.k5.r("UserSetAsAdminHint", null, 2131743680, new Object[]{str}, jbVar.b);
        return bc.g(f2Var, jbVar, 1500);
    }

    public static bc D(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str) {
        jb jbVar = new jb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        jbVar.d(R.raw.ic_ban, "Hand");
        org.telegram.messenger.k5.r("UserRemovedFromChatHint", null, 2131743731, new Object[]{user.deleted ? org.telegram.messenger.id.a0("HiddenName", null, 2131749328, new Object[0]) : user.first_name, str}, jbVar.b);
        return bc.g(f2Var, jbVar, 1500);
    }

    public static bc F(FrameLayout frameLayout, boolean z9) {
        return new gc(frameLayout, null).m(z9 ? fc.h : fc.e, 1, -115203550, -1, null);
    }

    public static bc S(int i7, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        String M0;
        jb jbVar = new jb(f2Var.getParentActivity(), h6Var);
        boolean z9 = true;
        if (i7 == 0) {
            M0 = org.telegram.messenger.id.M0(2131745274, null);
        } else {
            if (i7 != 1) {
                throw new IllegalArgumentException();
            }
            M0 = org.telegram.messenger.id.M0(2131745276, null);
            z9 = false;
        }
        if (z9) {
            jbVar.d(R.raw.sound_on, new String[0]);
        } else {
            jbVar.d(R.raw.sound_off, new String[0]);
        }
        jbVar.b.setText(M0);
        return bc.g(f2Var, jbVar, 1500);
    }

    public static gc X() {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return new gc(wa.a(org.telegram.messenger.t0.b), null);
        }
        Dialog dialog = T.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.w2 ? new gc(((org.telegram.ui.ActionBar.w2) dialog).c, T.getResourceProvider()) : a0(T);
    }

    public static gc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        return new gc(frameLayout, h6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.f2 f2Var) {
        return (f2Var == null || f2Var.getParentActivity() == null || f2Var.getLayoutContainer() == null) ? false : true;
    }

    public static gc a0(org.telegram.ui.ActionBar.f2 f2Var) {
        return f2Var == null ? X() : new gc(f2Var);
    }

    public static void b0(String str) {
        if (LaunchActivity.D1) {
            X().t(org.telegram.messenger.id.a0(null, null, 2131743878, str), null).j();
        }
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        if (LaunchActivity.D1) {
            if (frameLayout == null) {
                b0(str);
                return;
            }
            bc t6 = new gc(frameLayout, h6Var).t(org.telegram.messenger.id.a0(null, null, 2131743878, str), null);
            t6.r = false;
            t6.j();
        }
    }

    public static bc d(org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        String M0;
        jb jbVar = new jb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        if (z9) {
            jbVar.d(R.raw.ic_ban, "Hand");
            M0 = org.telegram.messenger.id.M0(2131743761, null);
        } else {
            jbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.id.M0(2131743675, null);
        }
        jbVar.b.setText(org.telegram.messenger.g0.X2(M0));
        return bc.g(f2Var, jbVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.D1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(org.telegram.messenger.id.a0(null, null, 2131743878, tL_error.text), null).j();
            }
        }
    }

    public static bc j(org.telegram.ui.ActionBar.f2 f2Var) {
        return a0(f2Var).k(false);
    }

    public static bc l(String str, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        String M0;
        jb jbVar = new jb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        if (str != null) {
            M0 = org.telegram.messenger.id.a0(null, null, z9 ? 2131751412 : 2131751410, str);
        } else {
            M0 = org.telegram.messenger.id.M0(z9 ? 2131751413 : 2131751411, null);
        }
        jbVar.b.setText(org.telegram.messenger.g0.X2(M0));
        jbVar.d((z9 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return bc.g(f2Var, jbVar, 5000);
    }

    public static bc v(Context context, org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z9, bi.d3 d3Var) {
        jb jbVar;
        int i14;
        SpannableStringBuilder X2;
        bc g10;
        int i15 = 1;
        if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || f2Var == null || i7 > 1 || j3 != org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n || z9) {
            jbVar = new jb(i11, i12, context, f2Var != null ? f2Var.getResourceProvider() : null);
        } else {
            jbVar = new mb(i10, f2Var);
        }
        jb jbVar2 = jbVar;
        boolean z10 = d3Var != null;
        org.telegram.ui.fq fqVar = d3Var != null ? new org.telegram.ui.fq(5, new boolean[]{false}, d3Var) : null;
        if (i7 > 1) {
            i14 = 2;
            X2 = i10 <= 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i7, "FwdMessageToManyChats", new Object[0])) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i7, "FwdMessagesToManyChats", new Object[0]));
            jbVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n) {
            int i16 = 21;
            if (i10 <= 1) {
                X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750498, null), -1, 2, z9 ? new org.telegram.messenger.rc(23) : new org.telegram.messenger.rc(i16), null);
            } else {
                X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750491, null), -1, 2, new org.telegram.messenger.rc(i16), null);
            }
            jbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            i14 = 2;
        } else {
            i14 = 2;
            bi.d3 d3Var2 = new bi.d3(fqVar, f2Var, j3, 19);
            if (org.telegram.messenger.m5.z(j3)) {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(-j3));
                X2 = i10 <= 1 ? f2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131750502, M0.title), -1, 2, d3Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750502, M0.title)) : f2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131750495, M0.title), -1, 2, d3Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750495, M0.title));
            } else {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).a2(Long.valueOf(j3));
                if (i10 <= 1) {
                    int i17 = z10 ? 2131750496 : 2131750497;
                    X2 = f2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, i17, org.telegram.messenger.t10.j(a22, true)), -1, 2, d3Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i17, org.telegram.messenger.t10.j(a22, true)));
                } else {
                    int i18 = z10 ? 2131750489 : 2131750490;
                    X2 = f2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, i18, org.telegram.messenger.t10.j(a22, true)), -1, 2, d3Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i18, org.telegram.messenger.t10.j(a22, true)));
                }
            }
            jbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        jbVar2.b.setText(X2);
        if (z10) {
            zb zbVar = new zb(jbVar2.getContext(), f2Var != null ? f2Var.getResourceProvider() : null, true, true);
            zbVar.b = null;
            zbVar.c = fqVar;
            jbVar2.setButton(zbVar);
        }
        jbVar2.postDelayed(new cc(jbVar2, i15), org.telegram.messenger.qs.X4);
        if (frameLayout != null) {
            g10 = bc.f(frameLayout, jbVar2, i13);
        } else {
            if (f2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = bc.g(f2Var, jbVar2, i13);
        }
        if (jbVar2 instanceof mb) {
            jbVar2.b.setSingleLine(false);
            jbVar2.b.setMaxLines(i14);
            ((mb) jbVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bc x(Activity activity, FrameLayout frameLayout, int i7, long j3, int i10, int i11) {
        SpannableStringBuilder X2;
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        jb jbVar = new jb(i10, i11, activity, null);
        int i13 = 0;
        if (i7 > 1) {
            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("InvLinkToChats", null, 2131749187, org.telegram.messenger.id.G(i7, "Chats", new Object[0])));
            jbVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n) {
                spannableStringBuilder = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749185, null));
                jbVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i12 = -1;
                jbVar.b.setText(spannableStringBuilder);
                if (i12 > 0) {
                    jbVar.postDelayed(new cc(jbVar, i13), i12);
                }
                return bc.f(frameLayout, jbVar, 1500);
            }
            X2 = org.telegram.messenger.m5.z(j3) ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("InvLinkToGroup", null, 2131749186, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(-j3)).title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("InvLinkToUser", null, 2131749184, org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).a2(Long.valueOf(j3)), true)));
            jbVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = X2;
        i12 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        jbVar.b.setText(spannableStringBuilder);
        if (i12 > 0) {
        }
        return bc.f(frameLayout, jbVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bc z(org.telegram.ui.ActionBar.f2 f2Var, int i7, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        String a02;
        boolean z9;
        jb jbVar = new jb(f2Var.getParentActivity(), h6Var);
        boolean z10 = true;
        if (i7 == 0) {
            a02 = org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.id.G(1, "Hours", new Object[0]));
        } else if (i7 == 1) {
            a02 = org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.id.G(8, "Hours", new Object[0]));
        } else if (i7 == 2) {
            a02 = org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.id.G(2, "Days", new Object[0]));
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    a02 = org.telegram.messenger.id.M0(2131747855, null);
                    z9 = false;
                    z10 = false;
                } else {
                    if (i7 != 5) {
                        throw new IllegalArgumentException();
                    }
                    a02 = org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.id.c0(i10));
                    z9 = true;
                }
                if (!z10) {
                    jbVar.d(R.raw.mute_for, new String[0]);
                } else if (z9) {
                    jbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    jbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                jbVar.b.setText(a02);
                return bc.g(f2Var, jbVar, 1500);
            }
            a02 = org.telegram.messenger.id.M0(2131747899, null);
        }
        z9 = true;
        z10 = false;
        if (!z10) {
        }
        jbVar.b.setText(a02);
        return bc.g(f2Var, jbVar, 1500);
    }

    public final bc E(org.telegram.ui.ActionBar.h6 h6Var) {
        jb jbVar = new jb(W(), h6Var);
        jbVar.d(R.raw.chats_infotip, new String[0]);
        jbVar.b.setText(org.telegram.messenger.id.M0(2131746222, null));
        return b(jbVar, 1500);
    }

    public final bc G(int i7, int i10, CharSequence charSequence) {
        jb jbVar = new jb(W(), this.c);
        jbVar.c(i7, 36, 36, new String[0]);
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
        jbVar.b.setSingleLine(false);
        jbVar.b.setMaxLines(i10);
        jbVar.b.setText(charSequence);
        return b(jbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final bc H(int i7, CharSequence charSequence) {
        return Q(i7, 36, charSequence);
    }

    public final bc I(int i7, CharSequence charSequence, CharSequence charSequence2) {
        yb ybVar = new yb(W(), this.c);
        ybVar.c(i7, 36, 36, new String[0]);
        ybVar.b.setText(charSequence);
        ybVar.c.setText(charSequence2);
        return b(ybVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final bc J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z9, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        jb jbVar = new jb(W, h6Var);
        if (i7 != 0) {
            jbVar.c(i7, 36, 36, new String[0]);
        } else {
            jbVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) jbVar.b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        jbVar.b.setTextSize(1, 14.0f);
        jbVar.b.setTextDirection(5);
        jbVar.b.setSingleLine(false);
        jbVar.b.setMaxLines(3);
        jbVar.b.setText(charSequence);
        zb zbVar = new zb(W(), h6Var, true, z9);
        zbVar.e(charSequence2);
        zbVar.b = runnable;
        jbVar.setButton(zbVar);
        return b(jbVar, i10);
    }

    public final bc K(int i7, CharSequence charSequence, String str, Runnable runnable) {
        return J(i7, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final bc L(int i7, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        yb ybVar = new yb(W, h6Var);
        ybVar.c(i7, 36, 36, new String[0]);
        ybVar.b.setText(str);
        ybVar.c.setText(charSequence);
        zb zbVar = new zb(W(), h6Var, true);
        zbVar.e(str2);
        zbVar.b = runnable;
        ybVar.setButton(zbVar);
        return b(ybVar, 5000);
    }

    public final bc M(Drawable drawable, CharSequence charSequence) {
        jb jbVar = new jb(W(), this.c);
        jbVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.fm0) {
            ((org.telegram.ui.fm0) drawable).e(jbVar.a);
        }
        jbVar.b.setText(charSequence);
        jbVar.b.setSingleLine(false);
        jbVar.b.setMaxLines(2);
        return b(jbVar, 2750);
    }

    public final bc N(String str, String str2) {
        yb ybVar = new yb(W(), this.c);
        ybVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) ybVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        ybVar.b.setText(str);
        ybVar.c.setText(str2);
        return b(ybVar, 5000);
    }

    public final bc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new ab();
        }
        xb xbVar = new xb(W(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.hc c11 = org.telegram.messenger.hc.c(w10, document);
        k9 k9Var = xbVar.a;
        k9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = xbVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = xbVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(xbVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final bc P(int i7, CharSequence charSequence) {
        jb jbVar = new jb(W(), this.c);
        jbVar.c(i7, 36, 36, new String[0]);
        jbVar.b.setText(charSequence);
        jbVar.b.setSingleLine(false);
        jbVar.b.setTextSize(1, 14.0f);
        jbVar.b.setMaxLines(4);
        return b(jbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final bc Q(int i7, int i10, CharSequence charSequence) {
        jb jbVar = new jb(W(), this.c);
        jbVar.c(i7, i10, i10, new String[0]);
        jbVar.b.setText(charSequence);
        jbVar.b.setSingleLine(false);
        jbVar.b.setMaxLines(2);
        return b(jbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final bc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new ab();
        }
        xb xbVar = new xb(W(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.hc c11 = org.telegram.messenger.hc.c(w10, document);
        k9 k9Var = xbVar.a;
        k9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = xbVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        xbVar.c.setVisibility(8);
        return b(xbVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final bc T(String str) {
        jb jbVar = new jb(W(), null);
        jbVar.d(R.raw.contact_check, new String[0]);
        jbVar.b.setText(str);
        jbVar.b.setSingleLine(false);
        jbVar.b.setMaxLines(2);
        return b(jbVar, 1500);
    }

    public final bc U(String str, boolean z9, Runnable runnable, Runnable runnable2) {
        ya yaVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        if (isEmpty) {
            jb jbVar = new jb(W(), h6Var);
            jbVar.b.setText(str);
            jbVar.b.setSingleLine(false);
            jbVar.b.setMaxLines(2);
            yaVar = jbVar;
        } else {
            yb ybVar = new yb(W(), h6Var);
            ybVar.b.setText(str);
            ybVar.c.setText((CharSequence) null);
            yaVar = ybVar;
        }
        yaVar.setTimer();
        zb zbVar = new zb(W(), h6Var, true, z9);
        zbVar.e(org.telegram.messenger.id.M0(2131743885, null));
        zbVar.b = runnable;
        zbVar.c = runnable2;
        yaVar.setButton(zbVar);
        return b(yaVar, 5000);
    }

    public final bc V(List list, CharSequence charSequence, CharSequence charSequence2, m4.d0 d0Var) {
        float f10;
        int i7;
        Context W = W();
        boolean z9 = charSequence2 != null;
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        ac acVar = new ac(W, h6Var, z9);
        y8 y8Var = acVar.a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    y8Var.setCount(i12);
                    y8Var.b(i7, org.telegram.messenger.p10.s0, tLObject);
                    i7 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                y8Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                y8Var.setScaleX(1.2f);
                y8Var.setScaleY(1.2f);
            } else {
                y8Var.setScaleX(1.0f);
                y8Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i7 = 0;
        }
        y8Var.a(false);
        w70 w70Var = acVar.b;
        if (charSequence2 != null) {
            w70Var.setSingleLine(true);
            w70Var.setMaxLines(1);
            w70Var.setText(charSequence);
            w70 w70Var2 = acVar.c;
            w70Var2.setText(charSequence2);
            w70Var2.setSingleLine(false);
            w70Var2.setMaxLines(3);
            LinearLayout linearLayout = acVar.d;
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
            zb zbVar = new zb(W(), h6Var, true);
            zbVar.e(org.telegram.messenger.id.M0(2131743885, null));
            zbVar.b = (Runnable) d0Var.a;
            zbVar.c = (Runnable) d0Var.b;
            acVar.setButton(zbVar);
        }
        return b(acVar, 5000);
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

    public final bc Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.D1 ? new ab() : tL_error == null ? t(org.telegram.messenger.id.a0(null, null, 2131743879, new Object[0]), null) : t(org.telegram.messenger.id.a0(null, null, 2131743878, tL_error.text), null);
    }

    public final bc b(ya yaVar, int i7) {
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        return f2Var != null ? bc.g(f2Var, yaVar, i7) : bc.f(this.b, yaVar, i7);
    }

    public final bc c(CharSequence charSequence) {
        if (W() == null) {
            return new ab();
        }
        jb jbVar = new jb(W(), this.c);
        jbVar.d(R.raw.ic_admin, "Shield");
        jbVar.b.setSingleLine(false);
        jbVar.b.setMaxLines(3);
        jbVar.b.setText(charSequence);
        return b(jbVar, 2750);
    }

    public final bc e(boolean z9) {
        String M0;
        jb jbVar = new jb(W(), this.c);
        if (z9) {
            jbVar.d(R.raw.ic_ban, "Hand");
            M0 = org.telegram.messenger.id.M0(2131743761, null);
        } else {
            jbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.id.M0(2131743675, null);
        }
        jbVar.b.setText(org.telegram.messenger.g0.X2(M0));
        return b(jbVar, 1500);
    }

    public final void e0(String str, boolean z9) {
        if (LaunchActivity.D1) {
            if (TextUtils.isEmpty(str)) {
                bc t6 = t(org.telegram.messenger.id.a0(null, null, 2131743879, new Object[0]), null);
                t6.r = false;
                t6.k(z9);
            } else {
                bc t10 = t(org.telegram.messenger.id.a0(null, null, 2131743878, str), null);
                t10.r = false;
                t10.k(z9);
            }
        }
    }

    public final bc f(int i7, Runnable runnable) {
        jb jbVar = new jb(W(), null);
        jbVar.d(R.raw.caption_limit, new String[0]);
        String G = org.telegram.messenger.id.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.X2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        jbVar.b.setText(valueOf);
        jbVar.b.setSingleLine(false);
        jbVar.b.setMaxLines(3);
        return b(jbVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z9) {
        if (LaunchActivity.D1) {
            if (tL_error == null) {
                bc t6 = t(org.telegram.messenger.id.a0(null, null, 2131743879, new Object[0]), null);
                t6.r = false;
                t6.k(z9);
            } else if (tL_error.code != 406) {
                bc t10 = t(org.telegram.messenger.id.a0(null, null, 2131743878, tL_error.text), null);
                t10.r = false;
                t10.k(z9);
            }
        }
    }

    public final bc g(String str, ArrayList arrayList) {
        ac acVar = new ac(W(), this.c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                acVar.a.setCount(i11);
                acVar.a.b(i7, org.telegram.messenger.p10.s0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            acVar.a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            acVar.a.setScaleX(1.2f);
            acVar.a.setScaleY(1.2f);
        } else {
            acVar.a.setScaleX(1.0f);
            acVar.a.setScaleY(1.0f);
        }
        acVar.a.a(false);
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(2);
        acVar.b.setText(str);
        if (acVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.id.a0) {
                ((ViewGroup.MarginLayoutParams) acVar.b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) acVar.b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.id.a0) {
            acVar.a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(acVar, 5000);
    }

    public final boolean g0(int i7, long j3) {
        org.telegram.ui.ActionBar.f2 f2Var;
        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() && (f2Var = this.a) != null) {
            mb mbVar = new mb(i7, f2Var);
            if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).n) {
                int i10 = 21;
                SpannableStringBuilder S2 = i7 <= 1 ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750498, null), -1, 2, new org.telegram.messenger.rc(i10), null) : org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750491, null), -1, 2, new org.telegram.messenger.rc(i10), null);
                mbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                mbVar.b.setText(S2);
                mbVar.b.setSingleLine(false);
                mbVar.b.setMaxLines(2);
                bc b10 = b(mbVar, 3500);
                mbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final bc h(TLRPC.Document document, int i7, final org.telegram.messenger.c20 c20Var) {
        b80 b80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        final TLRPC.InputStickerSet i12 = org.telegram.messenger.ij.i1(document);
        if (i12 == null) {
            return null;
        }
        final int i10 = 1;
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).m0(i12, true);
        final int i11 = 0;
        if (m0 != null && (stickerSet = m0.set) != null) {
            return r(document, i7 == 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("TopicContainsEmojiPackSingle", null, 2131744022, stickerSet.title)) : i7 == 2 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoryContainsEmojiPackSingle", null, 2131744699, stickerSet.title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("MessageContainsEmojiPackSingle", null, 2131748596, stickerSet.title)), org.telegram.messenger.id.M0(2131743563, null), new Runnable() { // from class: org.telegram.ui.Components.dc
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            c20Var.a(i12);
                            break;
                        default:
                            c20Var.a(i12);
                            break;
                    }
                }
            });
        }
        SpannableStringBuilder spannableStringBuilder = i7 == 1 ? new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("TopicContainsEmojiPackSingle", null, 2131744022, "<{LOADING}>"))) : i7 == 2 ? new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoryContainsEmojiPackSingle", null, 2131744699, "<{LOADING}>"))) : new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("MessageContainsEmojiPackSingle", null, 2131748596, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        if (indexOf >= 0) {
            b80Var = new b80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), h6Var);
            spannableStringBuilder.setSpan(b80Var, indexOf, indexOf + 11, 33);
            int i13 = org.telegram.ui.ActionBar.m6.vj;
            b80Var.a(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i13, h6Var), 32), i0.a.o(org.telegram.ui.ActionBar.m6.w0(i13, h6Var), 72));
        } else {
            b80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String M0 = org.telegram.messenger.id.M0(2131743563, null);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.dc
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        c20Var.a(i12);
                        break;
                    default:
                        c20Var.a(i12);
                        break;
                }
            }
        };
        Context W = W();
        hb hbVar = new hb(W, h6Var);
        w70 w70Var = new w70(W, null);
        hbVar.d = w70Var;
        w70Var.setDisablePaddingsOffset(true);
        w70Var.setSingleLine();
        w70Var.setTypeface(Typeface.SANS_SERIF);
        w70Var.setTextSize(1, 15.0f);
        w70Var.setEllipsize(TextUtils.TruncateAt.END);
        w70Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        hbVar.b.setVisibility(8);
        hbVar.addView(w70Var, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i14 = org.telegram.ui.ActionBar.m6.vj;
        hbVar.setTextColor(hbVar.getThemedColor(i14));
        if (org.telegram.messenger.ij.C4(document)) {
            inputStickerSet = i12;
            org.telegram.ui.ActionBar.t6.s(hbVar.a, i14, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i12;
        }
        hbVar.e(document, new String[0]);
        hbVar.b.setTextSize(1, 14.0f);
        hbVar.b.setSingleLine(false);
        hbVar.b.setMaxLines(3);
        w70Var.setText(spannableStringBuilder);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setSingleLine(false);
        w70Var.setMaxLines(3);
        zb zbVar = new zb(W(), h6Var, true);
        zbVar.e(M0);
        zbVar.b = runnable;
        hbVar.setButton(zbVar);
        bc b10 = b(hbVar, 2750);
        if (b80Var != null) {
            fb fbVar = b10.e;
            if (fbVar instanceof hb) {
                b80Var.b = ((hb) fbVar).d;
            }
        }
        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).l0(inputStickerSet, null, false, false, new bi.f4(i7, b10, currentTimeMillis));
        return b10;
    }

    public final bc i(String str) {
        if (!org.telegram.messenger.g0.I3()) {
            return new ab();
        }
        jb jbVar = new jb(W(), null);
        jbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        jbVar.b.setText(str);
        return b(jbVar, 1500);
    }

    public final bc k(boolean z9) {
        if (!org.telegram.messenger.g0.I3()) {
            return new ab();
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        if (!z9) {
            jb jbVar = new jb(W(), h6Var);
            jbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            jbVar.b.setText(org.telegram.messenger.id.M0(2131748921, null));
            return b(jbVar, 1500);
        }
        yb ybVar = new yb(W(), h6Var);
        ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        ybVar.b.setText(org.telegram.messenger.id.M0(2131748921, null));
        ybVar.c.setText(org.telegram.messenger.id.M0(2131748919, null));
        return b(ybVar, 2750);
    }

    public final bc m(fc fcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.h6 h6Var) {
        ec ecVar = fcVar.d;
        jb jbVar = (i10 == 0 || i11 == 0) ? new jb(W(), h6Var) : new jb(i10, i11, W(), h6Var);
        jbVar.d(ecVar.a, ecVar.b);
        TextView textView = jbVar.b;
        String str = fcVar.a;
        textView.setText(org.telegram.messenger.g0.U2(fcVar.c ? org.telegram.messenger.id.G(i7, str, new Object[0]) : org.telegram.messenger.id.M0(fcVar.b, str), new org.telegram.messenger.rc(22)));
        int i12 = ecVar.c;
        if (i12 != 0) {
            jbVar.setIconPaddingBottom(i12);
        }
        return b(jbVar, 1500);
    }

    public final bc n(fc fcVar, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return m(fcVar, i7, 0, 0, h6Var);
    }

    public final bc o(fc fcVar, org.telegram.ui.ActionBar.h6 h6Var) {
        return m(fcVar, 1, 0, 0, h6Var);
    }

    public final bc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        wb wbVar = new wb(W, h6Var);
        h5 h5Var = new h5(1, org.telegram.messenger.p10.s0, j3);
        k9 k9Var = wbVar.a;
        k9Var.setAnimatedEmojiDrawable(h5Var);
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var), PorterDuff.Mode.SRC_IN));
        wbVar.b.setText(str);
        wbVar.c.setText(str2);
        return b(wbVar, 2750);
    }

    public final bc q(TLRPC.Document document, CharSequence charSequence) {
        jb jbVar = new jb(W(), this.c);
        if (org.telegram.messenger.ij.C4(document)) {
            org.telegram.ui.ActionBar.t6.s(jbVar.a, org.telegram.ui.ActionBar.m6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        jbVar.e(document, new String[0]);
        jbVar.b.setText(charSequence);
        jbVar.b.setTextSize(1, 14.0f);
        jbVar.b.setSingleLine(false);
        jbVar.b.setMaxLines(3);
        return b(jbVar, 2750);
    }

    public final bc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        jb jbVar = new jb(W, h6Var);
        if (org.telegram.messenger.ij.C4(document)) {
            org.telegram.ui.ActionBar.t6.s(jbVar.a, org.telegram.ui.ActionBar.m6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        jbVar.e(document, new String[0]);
        if (jbVar.a.getImageReceiver() != null) {
            jbVar.a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        jbVar.b.setText(charSequence);
        jbVar.b.setTextSize(1, 14.0f);
        jbVar.b.setSingleLine(false);
        jbVar.b.setMaxLines(3);
        zb zbVar = new zb(W(), h6Var, true);
        zbVar.e(str);
        zbVar.b = runnable;
        jbVar.setButton(zbVar);
        return b(jbVar, 2750);
    }

    public final bc s(TLRPC.Document document, String str, CharSequence charSequence) {
        yb ybVar = new yb(W(), this.c);
        boolean C4 = org.telegram.messenger.ij.C4(document);
        ch0 ch0Var = ybVar.a;
        if (C4) {
            org.telegram.ui.ActionBar.t6.s(ch0Var, org.telegram.ui.ActionBar.m6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ch0Var.setAutoRepeat(true);
        ch0Var.g(36, 36, document);
        ybVar.b.setText(str);
        ybVar.c.setText(charSequence);
        return b(ybVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final bc t(CharSequence charSequence, org.telegram.ui.ActionBar.h6 h6Var) {
        jb jbVar = new jb(W(), h6Var);
        jbVar.d(R.raw.chats_infotip, new String[0]);
        jbVar.b.setText(charSequence);
        jbVar.b.setSingleLine(false);
        jbVar.b.setMaxLines(2);
        return b(jbVar, 1500);
    }

    public final bc u(String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        yb ybVar = new yb(W(), h6Var);
        ybVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        ybVar.b.setText(str);
        ybVar.c.setText(str2);
        return b(ybVar, 1500);
    }

    public final bc w(int i7, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        jb jbVar = new jb(W, h6Var);
        jbVar.setBackground(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tj, h6Var), 12);
        jbVar.a.setImageResource(i7);
        jbVar.b.setText(charSequence);
        jbVar.b.setSingleLine(false);
        jbVar.b.setLines(2);
        jbVar.b.setMaxLines(4);
        TextView textView = jbVar.b;
        textView.setMaxWidth(fi.m3.a(textView.getText(), jbVar.b.getPaint()));
        jbVar.b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) jbVar.b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        jbVar.setWrapWidth();
        return b(jbVar, 5000);
    }

    public final bc y(int i7, TLRPC.Document document, jg.r rVar) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        jb jbVar = new jb(W, h6Var);
        jbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        jbVar.removeView(jbVar.b);
        p5 p5Var = new p5(jbVar.getContext());
        jbVar.b = p5Var;
        p5Var.setTypeface(Typeface.SANS_SERIF);
        jbVar.b.setTextSize(1, 15.0f);
        jbVar.b.setEllipsize(TextUtils.TruncateAt.END);
        jbVar.b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new q5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        jbVar.b.setText(new SpannableStringBuilder(i7 > 1 ? org.telegram.messenger.id.G(i7, "SavedTagMessagesTagged", new Object[0]) : org.telegram.messenger.id.M0(2131745878, null)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (rVar != null) {
            zb zbVar = new zb(W(), h6Var, true);
            zbVar.e(org.telegram.messenger.id.M0(2131743563, null));
            zbVar.b = rVar;
            jbVar.setButton(zbVar);
        }
        jbVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.vj, h6Var));
        jbVar.addView(jbVar.b, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(jbVar, 2750);
    }

    public gc(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = h6Var;
    }
}
