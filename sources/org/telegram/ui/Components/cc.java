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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cc {
    public final org.telegram.ui.ActionBar.k2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.p6 c;

    public cc(org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var == null || k2Var.getLastStoryViewer() == null || !k2Var.getLastStoryViewer().z()) {
            this.a = k2Var;
            this.b = null;
            this.c = k2Var != null ? k2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            th.z2 currentPeerView = k2Var.getLastStoryViewer().n0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.L0 : null;
            this.c = k2Var.getLastStoryViewer().D;
        }
    }

    public static wb A(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        return z(k2Var, z10 ? 3 : 4, 0, p6Var);
    }

    public static wb B(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, ag.g3 g3Var, org.telegram.ui.ue ueVar, org.telegram.ui.ActionBar.p6 p6Var) {
        eb ebVar = new eb(k2Var.getParentActivity(), p6Var);
        ebVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        ebVar.b.setText(org.telegram.messenger.cd.L0(z10 ? 2131748559 : 2131748481, z10 ? "MessagePinnedHint" : "MessageUnpinnedHint"));
        if (!z10) {
            ub ubVar = new ub(k2Var.getParentActivity(), p6Var, true);
            ubVar.b = g3Var;
            ubVar.c = ueVar;
            ebVar.setButton(ubVar);
        }
        return wb.g(k2Var, ebVar, z10 ? 1500 : 5000);
    }

    public static wb C(String str, org.telegram.ui.ActionBar.k2 k2Var) {
        eb ebVar = new eb(k2Var.getParentActivity(), k2Var.getResourceProvider());
        ebVar.d(R.raw.ic_admin, "Shield");
        org.telegram.messenger.m5.q("UserSetAsAdminHint", null, 2131743706, new Object[]{str}, ebVar.b);
        return wb.g(k2Var, ebVar, 1500);
    }

    public static wb D(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.User user, String str) {
        eb ebVar = new eb(k2Var.getParentActivity(), k2Var.getResourceProvider());
        ebVar.d(R.raw.ic_ban, "Hand");
        org.telegram.messenger.m5.q("UserRemovedFromChatHint", null, 2131743757, new Object[]{user.deleted ? org.telegram.messenger.cd.a0("HiddenName", null, 2131749337, new Object[0]) : user.first_name, str}, ebVar.b);
        return wb.g(k2Var, ebVar, 1500);
    }

    public static wb F(FrameLayout frameLayout, boolean z10) {
        return new cc(frameLayout, null).m(z10 ? bc.h : bc.e, 1, -115203550, -1, null);
    }

    public static wb S(int i10, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        String L0;
        eb ebVar = new eb(k2Var.getParentActivity(), p6Var);
        boolean z10 = true;
        if (i10 == 0) {
            L0 = org.telegram.messenger.cd.L0(2131745292, null);
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException();
            }
            L0 = org.telegram.messenger.cd.L0(2131745294, null);
            z10 = false;
        }
        if (z10) {
            ebVar.d(R.raw.sound_on, new String[0]);
        } else {
            ebVar.d(R.raw.sound_off, new String[0]);
        }
        ebVar.b.setText(L0);
        return wb.g(k2Var, ebVar, 1500);
    }

    public static cc X() {
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return new cc(ra.a(org.telegram.messenger.w0.b), null);
        }
        Dialog dialog = T.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.z2 ? new cc(((org.telegram.ui.ActionBar.z2) dialog).c, T.getResourceProvider()) : a0(T);
    }

    public static cc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var) {
        return new cc(frameLayout, p6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.k2 k2Var) {
        return (k2Var == null || k2Var.getParentActivity() == null || k2Var.getLayoutContainer() == null) ? false : true;
    }

    public static cc a0(org.telegram.ui.ActionBar.k2 k2Var) {
        return k2Var == null ? X() : new cc(k2Var);
    }

    public static void b0(String str) {
        if (LaunchActivity.E1) {
            X().t(org.telegram.messenger.cd.a0(null, null, 2131743903, str), null).j();
        }
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var) {
        if (LaunchActivity.E1) {
            if (frameLayout == null) {
                b0(str);
                return;
            }
            wb t10 = new cc(frameLayout, p6Var).t(org.telegram.messenger.cd.a0(null, null, 2131743903, str), null);
            t10.r = false;
            t10.j();
        }
    }

    public static wb d(org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        String L0;
        eb ebVar = new eb(k2Var.getParentActivity(), k2Var.getResourceProvider());
        if (z10) {
            ebVar.d(R.raw.ic_ban, "Hand");
            L0 = org.telegram.messenger.cd.L0(2131743787, null);
        } else {
            ebVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            L0 = org.telegram.messenger.cd.L0(2131743701, null);
        }
        ebVar.b.setText(org.telegram.messenger.i0.W2(L0));
        return wb.g(k2Var, ebVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(org.telegram.messenger.cd.a0(null, null, 2131743903, tL_error.text), null).j();
            }
        }
    }

    public static wb j(org.telegram.ui.ActionBar.k2 k2Var) {
        return a0(k2Var).k(false);
    }

    public static wb l(String str, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        String L0;
        eb ebVar = new eb(k2Var.getParentActivity(), k2Var.getResourceProvider());
        if (str != null) {
            L0 = org.telegram.messenger.cd.a0(null, null, z10 ? 2131751413 : 2131751411, str);
        } else {
            L0 = org.telegram.messenger.cd.L0(z10 ? 2131751414 : 2131751412, null);
        }
        ebVar.b.setText(org.telegram.messenger.i0.W2(L0));
        ebVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return wb.g(k2Var, ebVar, 5000);
    }

    public static wb v(Context context, org.telegram.ui.ActionBar.k2 k2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, a3.i0 i0Var) {
        eb ebVar;
        int i15;
        SpannableStringBuilder W2;
        wb g10;
        if (!org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q() || k2Var == null || i10 > 1 || j10 != org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n || z10) {
            ebVar = new eb(i12, i13, context, k2Var != null ? k2Var.getResourceProvider() : null);
        } else {
            ebVar = new hb(i11, k2Var);
        }
        eb ebVar2 = ebVar;
        boolean z11 = i0Var != null;
        org.telegram.ui.zg zgVar = i0Var != null ? new org.telegram.ui.zg(28, new boolean[]{false}, i0Var) : null;
        if (i10 > 1) {
            i15 = 2;
            W2 = i11 <= 1 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(i10, "FwdMessageToManyChats", new Object[0])) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(i10, "FwdMessagesToManyChats", new Object[0]));
            ebVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j10 == org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n) {
            int i16 = 10;
            if (i11 <= 1) {
                W2 = org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131750507, null), -1, 2, z10 ? new org.telegram.messenger.rz(12) : new org.telegram.messenger.rz(i16), null);
            } else {
                W2 = org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131750500, null), -1, 2, new org.telegram.messenger.rz(i16), null);
            }
            ebVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            i15 = 2;
        } else {
            i15 = 2;
            a3.i0 i0Var2 = new a3.i0(zgVar, k2Var, j10, 10);
            if (org.telegram.messenger.o5.z(j10)) {
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).L0(Long.valueOf(-j10));
                W2 = i11 <= 1 ? k2Var != null ? org.telegram.messenger.i0.R2(org.telegram.messenger.cd.a0(null, null, 2131750511, L0.title), -1, 2, i0Var2, null) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750511, L0.title)) : k2Var != null ? org.telegram.messenger.i0.R2(org.telegram.messenger.cd.a0(null, null, 2131750504, L0.title), -1, 2, i0Var2, null) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750504, L0.title));
            } else {
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).Z1(Long.valueOf(j10));
                if (i11 <= 1) {
                    int i17 = z11 ? 2131750505 : 2131750506;
                    W2 = k2Var != null ? org.telegram.messenger.i0.R2(org.telegram.messenger.cd.a0(null, null, i17, org.telegram.messenger.h20.j(Z1, true)), -1, 2, i0Var2, null) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, i17, org.telegram.messenger.h20.j(Z1, true)));
                } else {
                    int i18 = z11 ? 2131750498 : 2131750499;
                    W2 = k2Var != null ? org.telegram.messenger.i0.R2(org.telegram.messenger.cd.a0(null, null, i18, org.telegram.messenger.h20.j(Z1, true)), -1, 2, i0Var2, null) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, i18, org.telegram.messenger.h20.j(Z1, true)));
                }
            }
            ebVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        ebVar2.b.setText(W2);
        if (z11) {
            ub ubVar = new ub(ebVar2.getContext(), k2Var != null ? k2Var.getResourceProvider() : null, true, true);
            ubVar.b = null;
            ubVar.c = zgVar;
            ebVar2.setButton(ubVar);
        }
        ebVar2.postDelayed(new xb(ebVar2, 1), org.telegram.messenger.zs.X4);
        if (frameLayout != null) {
            g10 = wb.f(frameLayout, ebVar2, i14);
        } else {
            if (k2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = wb.g(k2Var, ebVar2, i14);
        }
        if (ebVar2 instanceof hb) {
            ebVar2.b.setSingleLine(false);
            ebVar2.b.setMaxLines(i15);
            ((hb) ebVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wb x(Activity activity, FrameLayout frameLayout, int i10, long j10, int i11, int i12) {
        SpannableStringBuilder W2;
        int i13;
        SpannableStringBuilder spannableStringBuilder;
        eb ebVar = new eb(i11, i12, activity, null);
        if (i10 > 1) {
            W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("InvLinkToChats", null, 2131749197, org.telegram.messenger.cd.G(i10, "Chats", new Object[0])));
            ebVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j10 == org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n) {
                spannableStringBuilder = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131749195, null));
                ebVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
                ebVar.b.setText(spannableStringBuilder);
                if (i13 > 0) {
                    ebVar.postDelayed(new xb(ebVar, 0), i13);
                }
                return wb.f(frameLayout, ebVar, 1500);
            }
            W2 = org.telegram.messenger.o5.z(j10) ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("InvLinkToGroup", null, 2131749196, org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).L0(Long.valueOf(-j10)).title)) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("InvLinkToUser", null, 2131749194, org.telegram.messenger.h20.j(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).Z1(Long.valueOf(j10)), true)));
            ebVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = W2;
        i13 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        ebVar.b.setText(spannableStringBuilder);
        if (i13 > 0) {
        }
        return wb.f(frameLayout, ebVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wb z(org.telegram.ui.ActionBar.k2 k2Var, int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        String a02;
        boolean z10;
        eb ebVar = new eb(k2Var.getParentActivity(), p6Var);
        boolean z11 = true;
        if (i10 == 0) {
            a02 = org.telegram.messenger.cd.a0("NotificationsMutedForHint", null, 2131747916, org.telegram.messenger.cd.G(1, "Hours", new Object[0]));
        } else if (i10 == 1) {
            a02 = org.telegram.messenger.cd.a0("NotificationsMutedForHint", null, 2131747916, org.telegram.messenger.cd.G(8, "Hours", new Object[0]));
        } else if (i10 == 2) {
            a02 = org.telegram.messenger.cd.a0("NotificationsMutedForHint", null, 2131747916, org.telegram.messenger.cd.G(2, "Days", new Object[0]));
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    a02 = org.telegram.messenger.cd.L0(2131747871, null);
                    z10 = false;
                    z11 = false;
                } else {
                    if (i10 != 5) {
                        throw new IllegalArgumentException();
                    }
                    a02 = org.telegram.messenger.cd.a0("NotificationsMutedForHint", null, 2131747916, org.telegram.messenger.cd.c0(i11));
                    z10 = true;
                }
                if (!z11) {
                    ebVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    ebVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ebVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                ebVar.b.setText(a02);
                return wb.g(k2Var, ebVar, 1500);
            }
            a02 = org.telegram.messenger.cd.L0(2131747915, null);
        }
        z10 = true;
        z11 = false;
        if (!z11) {
        }
        ebVar.b.setText(a02);
        return wb.g(k2Var, ebVar, 1500);
    }

    public final wb E(org.telegram.ui.ActionBar.p6 p6Var) {
        eb ebVar = new eb(W(), p6Var);
        ebVar.d(R.raw.chats_infotip, new String[0]);
        ebVar.b.setText(org.telegram.messenger.cd.L0(2131746239, null));
        return b(ebVar, 1500);
    }

    public final wb G(int i10, int i11, CharSequence charSequence) {
        eb ebVar = new eb(W(), this.c);
        ebVar.c(i10, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            int i12 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i12 >= i11) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i12++;
            }
            charSequence = spannableStringBuilder;
        }
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(i11);
        ebVar.b.setText(charSequence);
        return b(ebVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final wb H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final wb I(int i10, CharSequence charSequence, CharSequence charSequence2) {
        tb tbVar = new tb(W(), this.c);
        tbVar.c(i10, 36, 36, new String[0]);
        tbVar.b.setText(charSequence);
        tbVar.c.setText(charSequence2);
        return b(tbVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final wb J(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        eb ebVar = new eb(W, p6Var);
        if (i10 != 0) {
            ebVar.c(i10, 36, 36, new String[0]);
        } else {
            ebVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) ebVar.b.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(16.0f);
        }
        ebVar.b.setTextSize(1, 14.0f);
        ebVar.b.setTextDirection(5);
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(3);
        ebVar.b.setText(charSequence);
        ub ubVar = new ub(W(), p6Var, true, z10);
        ubVar.e(charSequence2);
        ubVar.b = runnable;
        ebVar.setButton(ubVar);
        return b(ebVar, i11);
    }

    public final wb K(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return J(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final wb L(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        tb tbVar = new tb(W, p6Var);
        tbVar.c(i10, 36, 36, new String[0]);
        tbVar.b.setText(str);
        tbVar.c.setText(charSequence);
        ub ubVar = new ub(W(), p6Var, true);
        ubVar.e(str2);
        ubVar.b = runnable;
        tbVar.setButton(ubVar);
        return b(tbVar, 5000);
    }

    public final wb M(Drawable drawable, CharSequence charSequence) {
        eb ebVar = new eb(W(), this.c);
        ebVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.on0) {
            ((org.telegram.ui.on0) drawable).e(ebVar.a);
        }
        ebVar.b.setText(charSequence);
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(2);
        return b(ebVar, 2750);
    }

    public final wb N(String str, String str2) {
        tb tbVar = new tb(W(), this.c);
        tbVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) tbVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.i0.L(10.0f));
        tbVar.b.setText(str);
        tbVar.c.setText(str2);
        return b(tbVar, 5000);
    }

    public final wb O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new va();
        }
        sb sbVar = new sb(W(), this.c);
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(28.0f), true, null, false);
        org.telegram.messenger.ic c10 = org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(28.0f), true, w9, true), document);
        org.telegram.messenger.ic c11 = org.telegram.messenger.ic.c(w9, document);
        g9 g9Var = sbVar.a;
        g9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(5.0f));
        TextView textView = sbVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        TextView textView2 = sbVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(sbVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final wb P(int i10, CharSequence charSequence) {
        eb ebVar = new eb(W(), this.c);
        ebVar.c(i10, 36, 36, new String[0]);
        ebVar.b.setText(charSequence);
        ebVar.b.setSingleLine(false);
        ebVar.b.setTextSize(1, 14.0f);
        ebVar.b.setMaxLines(4);
        return b(ebVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final wb Q(int i10, int i11, CharSequence charSequence) {
        eb ebVar = new eb(W(), this.c);
        ebVar.c(i10, i11, i11, new String[0]);
        ebVar.b.setText(charSequence);
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(2);
        return b(ebVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final wb R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new va();
        }
        sb sbVar = new sb(W(), this.c);
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(28.0f), true, null, false);
        org.telegram.messenger.ic c10 = org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(28.0f), true, w9, true), document);
        org.telegram.messenger.ic c11 = org.telegram.messenger.ic.c(w9, document);
        g9 g9Var = sbVar.a;
        g9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(5.0f));
        TextView textView = sbVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        sbVar.c.setVisibility(8);
        return b(sbVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final wb T(String str) {
        eb ebVar = new eb(W(), null);
        ebVar.d(R.raw.contact_check, new String[0]);
        ebVar.b.setText(str);
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(2);
        return b(ebVar, 1500);
    }

    public final wb U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        ta taVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        if (isEmpty) {
            eb ebVar = new eb(W(), p6Var);
            ebVar.b.setText(str);
            ebVar.b.setSingleLine(false);
            ebVar.b.setMaxLines(2);
            taVar = ebVar;
        } else {
            tb tbVar = new tb(W(), p6Var);
            tbVar.b.setText(str);
            tbVar.c.setText((CharSequence) null);
            taVar = tbVar;
        }
        taVar.setTimer();
        ub ubVar = new ub(W(), p6Var, true, z10);
        ubVar.e(org.telegram.messenger.cd.L0(2131743910, null));
        ubVar.b = runnable;
        ubVar.c = runnable2;
        taVar.setButton(ubVar);
        return b(taVar, 5000);
    }

    public final wb V(List list, CharSequence charSequence, CharSequence charSequence2, m4.c cVar) {
        float f7;
        int i10;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        vb vbVar = new vb(W, p6Var, z10);
        u8 u8Var = vbVar.a;
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    u8Var.setCount(i13);
                    u8Var.b(i10, org.telegram.messenger.d20.s0, tLObject);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                u8Var.setTranslationX(org.telegram.messenger.i0.L(4.0f));
                u8Var.setScaleX(1.2f);
                u8Var.setScaleY(1.2f);
            } else {
                u8Var.setScaleX(1.0f);
                u8Var.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        u8Var.a(false);
        p80 p80Var = vbVar.b;
        if (charSequence2 != null) {
            p80Var.setSingleLine(true);
            p80Var.setMaxLines(1);
            p80Var.setText(charSequence);
            p80 p80Var2 = vbVar.c;
            p80Var2.setText(charSequence2);
            p80Var2.setSingleLine(false);
            p80Var2.setMaxLines(3);
            LinearLayout linearLayout = vbVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.i0.L(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    L += org.telegram.messenger.i0.L(f7);
                }
                if (org.telegram.messenger.cd.X) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            p80Var.setSingleLine(false);
            p80Var.setMaxLines(4);
            p80Var.setText(charSequence);
            if (p80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.i0.L(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    p80Var.setTranslationY(-org.telegram.messenger.i0.L(1.0f));
                    L2 += org.telegram.messenger.i0.L(f7);
                }
                if (org.telegram.messenger.cd.X) {
                    ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (cVar != null) {
            ub ubVar = new ub(W(), p6Var, true);
            ubVar.e(org.telegram.messenger.cd.L0(2131743910, null));
            ubVar.b = (Runnable) cVar.b;
            ubVar.c = (Runnable) cVar.c;
            vbVar.setButton(ubVar);
        }
        return b(vbVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.k2 k2Var = this.a;
        if (k2Var != null) {
            context = k2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? org.telegram.messenger.w0.b : context;
    }

    public final wb Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.E1 ? new va() : tL_error == null ? t(org.telegram.messenger.cd.a0(null, null, 2131743904, new Object[0]), null) : t(org.telegram.messenger.cd.a0(null, null, 2131743903, tL_error.text), null);
    }

    public final wb b(ta taVar, int i10) {
        org.telegram.ui.ActionBar.k2 k2Var = this.a;
        return k2Var != null ? wb.g(k2Var, taVar, i10) : wb.f(this.b, taVar, i10);
    }

    public final wb c(CharSequence charSequence) {
        if (W() == null) {
            return new va();
        }
        eb ebVar = new eb(W(), this.c);
        ebVar.d(R.raw.ic_admin, "Shield");
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(3);
        ebVar.b.setText(charSequence);
        return b(ebVar, 2750);
    }

    public final wb e(boolean z10) {
        String L0;
        eb ebVar = new eb(W(), this.c);
        if (z10) {
            ebVar.d(R.raw.ic_ban, "Hand");
            L0 = org.telegram.messenger.cd.L0(2131743787, null);
        } else {
            ebVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            L0 = org.telegram.messenger.cd.L0(2131743701, null);
        }
        ebVar.b.setText(org.telegram.messenger.i0.W2(L0));
        return b(ebVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (LaunchActivity.E1) {
            if (TextUtils.isEmpty(str)) {
                wb t10 = t(org.telegram.messenger.cd.a0(null, null, 2131743904, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else {
                wb t11 = t(org.telegram.messenger.cd.a0(null, null, 2131743903, str), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final wb f(int i10, Runnable runnable) {
        eb ebVar = new eb(W(), null);
        ebVar.d(R.raw.caption_limit, new String[0]);
        String G = org.telegram.messenger.cd.G(i10, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.i0.W2(G));
        int indexOf = G.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i11, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.y(2, runnable), indexOf, indexOf2 - 1, 33);
        ebVar.b.setText(valueOf);
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(3);
        return b(ebVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                wb t10 = t(org.telegram.messenger.cd.a0(null, null, 2131743904, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                wb t11 = t(org.telegram.messenger.cd.a0(null, null, 2131743903, tL_error.text), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final wb g(String str, ArrayList arrayList) {
        vb vbVar = new vb(W(), this.c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                vbVar.a.setCount(i12);
                vbVar.a.b(i10, org.telegram.messenger.d20.s0, tLObject);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            vbVar.a.setTranslationX(org.telegram.messenger.i0.L(4.0f));
            vbVar.a.setScaleX(1.2f);
            vbVar.a.setScaleY(1.2f);
        } else {
            vbVar.a.setScaleX(1.0f);
            vbVar.a.setScaleY(1.0f);
        }
        vbVar.a.a(false);
        vbVar.b.setSingleLine(false);
        vbVar.b.setMaxLines(2);
        vbVar.b.setText(str);
        if (vbVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.i0.L(74 - ((3 - i10) * 12));
            if (org.telegram.messenger.cd.X) {
                ((ViewGroup.MarginLayoutParams) vbVar.b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) vbVar.b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.cd.X) {
            vbVar.a.setTranslationX(org.telegram.messenger.i0.L(32 - ((i10 - 1) * 12)));
        }
        return b(vbVar, 5000);
    }

    public final boolean g0(int i10, long j10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        if (org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q() && (k2Var = this.a) != null) {
            hb hbVar = new hb(i10, k2Var);
            if (j10 == org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).n) {
                int i11 = 10;
                SpannableStringBuilder R2 = i10 <= 1 ? org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131750507, null), -1, 2, new org.telegram.messenger.rz(i11), null) : org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131750500, null), -1, 2, new org.telegram.messenger.rz(i11), null);
                hbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                hbVar.b.setText(R2);
                hbVar.b.setSingleLine(false);
                hbVar.b.setMaxLines(2);
                wb b10 = b(hbVar, 3500);
                hbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final wb h(TLRPC.Document document, int i10, final org.telegram.messenger.q20 q20Var) {
        u80 u80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        final TLRPC.InputStickerSet j12 = org.telegram.messenger.jj.j1(document);
        if (j12 == null) {
            return null;
        }
        final int i11 = 1;
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).m0(j12, true);
        final int i12 = 0;
        if (m0 != null && (stickerSet = m0.set) != null) {
            return r(document, i10 == 1 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("TopicContainsEmojiPackSingle", null, 2131744047, stickerSet.title)) : i10 == 2 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StoryContainsEmojiPackSingle", null, 2131744717, stickerSet.title)) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("MessageContainsEmojiPackSingle", null, 2131748611, stickerSet.title)), org.telegram.messenger.cd.L0(2131743589, null), new Runnable() { // from class: org.telegram.ui.Components.yb
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            q20Var.a(j12);
                            break;
                        default:
                            q20Var.a(j12);
                            break;
                    }
                }
            });
        }
        SpannableStringBuilder spannableStringBuilder = i10 == 1 ? new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("TopicContainsEmojiPackSingle", null, 2131744047, "<{LOADING}>"))) : i10 == 2 ? new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StoryContainsEmojiPackSingle", null, 2131744717, "<{LOADING}>"))) : new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("MessageContainsEmojiPackSingle", null, 2131748611, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        if (indexOf >= 0) {
            u80Var = new u80(null, org.telegram.messenger.i0.L(100.0f), org.telegram.messenger.i0.L(2.0f), p6Var);
            spannableStringBuilder.setSpan(u80Var, indexOf, indexOf + 11, 33);
            int i13 = org.telegram.ui.ActionBar.t6.vj;
            u80Var.a(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 32), i0.b.o(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 72));
        } else {
            u80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String L0 = org.telegram.messenger.cd.L0(2131743589, null);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.yb
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        q20Var.a(j12);
                        break;
                    default:
                        q20Var.a(j12);
                        break;
                }
            }
        };
        Context W = W();
        db dbVar = new db(W, p6Var);
        p80 p80Var = new p80(W, null);
        dbVar.d = p80Var;
        p80Var.setDisablePaddingsOffset(true);
        p80Var.setSingleLine();
        p80Var.setTypeface(Typeface.SANS_SERIF);
        p80Var.setTextSize(1, 15.0f);
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        p80Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        dbVar.b.setVisibility(8);
        dbVar.addView(p80Var, w7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i14 = org.telegram.ui.ActionBar.t6.vj;
        dbVar.setTextColor(dbVar.getThemedColor(i14));
        if (org.telegram.messenger.jj.C4(document)) {
            inputStickerSet = j12;
            org.telegram.ui.ActionBar.a7.t(dbVar.a, i14, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = j12;
        }
        dbVar.e(document, new String[0]);
        dbVar.b.setTextSize(1, 14.0f);
        dbVar.b.setSingleLine(false);
        dbVar.b.setMaxLines(3);
        p80Var.setText(spannableStringBuilder);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setSingleLine(false);
        p80Var.setMaxLines(3);
        ub ubVar = new ub(W(), p6Var, true);
        ubVar.e(L0);
        ubVar.b = runnable;
        dbVar.setButton(ubVar);
        wb b10 = b(dbVar, 2750);
        if (u80Var != null) {
            bb bbVar = b10.e;
            if (bbVar instanceof db) {
                u80Var.b = ((db) bbVar).d;
            }
        }
        org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).l0(inputStickerSet, null, false, false, new zb(i10, b10, currentTimeMillis));
        return b10;
    }

    public final wb i(String str) {
        if (!org.telegram.messenger.i0.H3()) {
            return new va();
        }
        eb ebVar = new eb(W(), null);
        ebVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        ebVar.b.setText(str);
        return b(ebVar, 1500);
    }

    public final wb k(boolean z10) {
        if (!org.telegram.messenger.i0.H3()) {
            return new va();
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        if (!z10) {
            eb ebVar = new eb(W(), p6Var);
            ebVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ebVar.b.setText(org.telegram.messenger.cd.L0(2131748931, null));
            return b(ebVar, 1500);
        }
        tb tbVar = new tb(W(), p6Var);
        tbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        tbVar.b.setText(org.telegram.messenger.cd.L0(2131748931, null));
        tbVar.c.setText(org.telegram.messenger.cd.L0(2131748929, null));
        return b(tbVar, 2750);
    }

    public final wb m(bc bcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.p6 p6Var) {
        ac acVar = bcVar.d;
        eb ebVar = (i11 == 0 || i12 == 0) ? new eb(W(), p6Var) : new eb(i11, i12, W(), p6Var);
        ebVar.d(acVar.a, acVar.b);
        TextView textView = ebVar.b;
        String str = bcVar.a;
        textView.setText(org.telegram.messenger.i0.T2(bcVar.c ? org.telegram.messenger.cd.G(i10, str, new Object[0]) : org.telegram.messenger.cd.L0(bcVar.b, str), new org.telegram.messenger.rz(11)));
        int i13 = acVar.c;
        if (i13 != 0) {
            ebVar.setIconPaddingBottom(i13);
        }
        return b(ebVar, 1500);
    }

    public final wb n(bc bcVar, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return m(bcVar, i10, 0, 0, p6Var);
    }

    public final wb o(bc bcVar, org.telegram.ui.ActionBar.p6 p6Var) {
        return m(bcVar, 1, 0, 0, p6Var);
    }

    public final wb p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        rb rbVar = new rb(W, p6Var);
        f5 f5Var = new f5(1, org.telegram.messenger.d20.s0, j10);
        g9 g9Var = rbVar.a;
        g9Var.setAnimatedEmojiDrawable(f5Var);
        g9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var), PorterDuff.Mode.SRC_IN));
        rbVar.b.setText(str);
        rbVar.c.setText(str2);
        return b(rbVar, 2750);
    }

    public final wb q(TLRPC.Document document, CharSequence charSequence) {
        eb ebVar = new eb(W(), this.c);
        if (org.telegram.messenger.jj.C4(document)) {
            org.telegram.ui.ActionBar.a7.t(ebVar.a, org.telegram.ui.ActionBar.t6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ebVar.e(document, new String[0]);
        ebVar.b.setText(charSequence);
        ebVar.b.setTextSize(1, 14.0f);
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(3);
        return b(ebVar, 2750);
    }

    public final wb r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        eb ebVar = new eb(W, p6Var);
        if (org.telegram.messenger.jj.C4(document)) {
            org.telegram.ui.ActionBar.a7.t(ebVar.a, org.telegram.ui.ActionBar.t6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ebVar.e(document, new String[0]);
        if (ebVar.a.getImageReceiver() != null) {
            ebVar.a.getImageReceiver().J0(org.telegram.messenger.i0.L(4.0f));
        }
        ebVar.b.setText(charSequence);
        ebVar.b.setTextSize(1, 14.0f);
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(3);
        ub ubVar = new ub(W(), p6Var, true);
        ubVar.e(str);
        ubVar.b = runnable;
        ebVar.setButton(ubVar);
        return b(ebVar, 2750);
    }

    public final wb s(TLRPC.Document document, String str, CharSequence charSequence) {
        tb tbVar = new tb(W(), this.c);
        boolean C4 = org.telegram.messenger.jj.C4(document);
        ei0 ei0Var = tbVar.a;
        if (C4) {
            org.telegram.ui.ActionBar.a7.t(ei0Var, org.telegram.ui.ActionBar.t6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ei0Var.setAutoRepeat(true);
        ei0Var.g(36, 36, document);
        tbVar.b.setText(str);
        tbVar.c.setText(charSequence);
        return b(tbVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final wb t(CharSequence charSequence, org.telegram.ui.ActionBar.p6 p6Var) {
        eb ebVar = new eb(W(), p6Var);
        ebVar.d(R.raw.chats_infotip, new String[0]);
        ebVar.b.setText(charSequence);
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(2);
        return b(ebVar, 1500);
    }

    public final wb u(String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        tb tbVar = new tb(W(), p6Var);
        tbVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        tbVar.b.setText(str);
        tbVar.c.setText(str2);
        return b(tbVar, 1500);
    }

    public final wb w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        eb ebVar = new eb(W, p6Var);
        ebVar.setBackground(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, p6Var), 12);
        ebVar.a.setImageResource(i10);
        ebVar.b.setText(charSequence);
        ebVar.b.setSingleLine(false);
        ebVar.b.setLines(2);
        ebVar.b.setMaxLines(4);
        TextView textView = ebVar.b;
        textView.setMaxWidth(vh.p2.a(textView.getText(), ebVar.b.getPaint()));
        ebVar.b.setLineSpacing(org.telegram.messenger.i0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) ebVar.b.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(12.0f);
        ebVar.setWrapWidth();
        return b(ebVar, 5000);
    }

    public final wb y(int i10, TLRPC.Document document, i2.u uVar) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        eb ebVar = new eb(W, p6Var);
        ebVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        ebVar.removeView(ebVar.b);
        n5 n5Var = new n5(ebVar.getContext());
        ebVar.b = n5Var;
        n5Var.setTypeface(Typeface.SANS_SERIF);
        ebVar.b.setTextSize(1, 15.0f);
        ebVar.b.setEllipsize(TextUtils.TruncateAt.END);
        ebVar.b.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.i0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new o5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        ebVar.b.setText(new SpannableStringBuilder(i10 > 1 ? org.telegram.messenger.cd.G(i10, "SavedTagMessagesTagged", new Object[0]) : org.telegram.messenger.cd.L0(2131745895, null)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (uVar != null) {
            ub ubVar = new ub(W(), p6Var, true);
            ubVar.e(org.telegram.messenger.cd.L0(2131743589, null));
            ubVar.b = uVar;
            ebVar.setButton(ubVar);
        }
        ebVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, p6Var));
        ebVar.addView(ebVar.b, w7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(ebVar, 2750);
    }

    public cc(FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = p6Var;
    }
}
