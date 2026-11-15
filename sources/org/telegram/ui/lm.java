package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.UndoView;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lm implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ an a;

    public lm(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A0() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Components.t5 m10;
        an anVar = this.a;
        if (anVar.A3 || org.telegram.messenger.gz.A0 || anVar.A0 == null || anVar.getParentActivity() == null || anVar.fragmentView == null) {
            return;
        }
        hi.l3 l3Var = anVar.I2;
        if (l3Var == null || !l3Var.W) {
            if (l3Var == null) {
                int indexOfChild = anVar.m1.indexOfChild(anVar.U);
                if (indexOfChild == -1) {
                    return;
                }
                hi.l3 E6 = anVar.E6(250.0f, 3, indexOfChild + 1, false);
                anVar.I2 = E6;
                E6.d = 10000L;
                E6.m(anVar.getParentActivity().getResources().getDrawable(R.drawable.tooltip_sound).mutate());
                anVar.I2.u(org.telegram.messenger.hd.M0(2131753762, null));
            }
            int childCount = anVar.A0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = anVar.A0.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && org.telegram.messenger.gj.L4(messageObject.k) && (m10 = q1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !anVar.I2.W) {
                    ImageReceiver photoImage = q1Var.getPhotoImage();
                    float w92 = anVar.w9(q1Var, photoImage.M0);
                    float f10 = photoImage.O0;
                    View view = (View) q1Var.getParent();
                    float w93 = anVar.w9(q1Var, -q1Var.getTop());
                    if (w92 <= org.telegram.messenger.g0.L(80.0f)) {
                        continue;
                    } else if ((w92 + f10) - w93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                        anVar.Kb = q1Var;
                        hi.l3 l3Var2 = anVar.I2;
                        l3Var2.r0 = new ye(anVar, 22);
                        l3Var2.x(anVar.v9(q1Var, q1Var.getNoSoundIconCenterX()), w92, true);
                        org.telegram.messenger.gz.D(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B(org.telegram.ui.Cells.q1 q1Var) {
        an anVar = this.a;
        if (!anVar.getMessagesController().T4()) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, anVar.getParentActivity(), null);
            t1Var.r(200L);
            anVar.getMessagesController().R0(new x(this, t1Var, q1Var, 6));
        } else {
            if (q1Var.getMessageObject() != null) {
                q1Var.getMessageObject().t2 = Boolean.FALSE;
            }
            q1Var.I3();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        an anVar = this.a;
        if (anVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        o4Var = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
        if (o4Var != null) {
            o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
            if (((ActionBarLayout) o4Var2).y()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        boolean z11 = tLObject instanceof TLRPC.Chat;
        if (z11) {
            bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
        } else if (!(tLObject instanceof TLRPC.User)) {
            return;
        } else {
            bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
        }
        if (!z10 || !z11) {
            anVar.presentFragment(new an(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, anVar.getParentActivity(), anVar.getResourceProvider());
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, anVar.getResourceProvider());
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(anVar.getParentActivity(), false, false);
        z0Var.j(org.telegram.messenger.hd.M0(2131747811, null), R.drawable.msg_channel, null);
        z0Var.setMinimumWidth(org.telegram.messenger.ns.q2);
        z0Var.setOnClickListener(new a(this, 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(anVar.getParentActivity(), false, false);
        z0Var2.j(org.telegram.messenger.hd.M0(2131746662, null), R.drawable.msg_addbot, null);
        z0Var2.setMinimumWidth(org.telegram.messenger.ns.q2);
        z0Var2.setOnClickListener(new y(this, (TLRPC.Chat) tLObject, q1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
        an anVar2 = new an(bundle);
        anVar2.fa = true;
        anVar.presentFragmentAsPreviewWithMenu(anVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        anVar.s7();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        e(q1Var, z10, false, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        int i7 = messageObject.D;
        an anVar = this.a;
        if (i7 != 16) {
            anVar.Y7(q1Var, true, false, f10, f11, messageObject.I3(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        int i10 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = anVar.f;
            if (user != null) {
                boolean J4 = messageObject.J4();
                TLRPC.UserFull userFull = anVar.r8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.c2.m(user, J4, i10, anVar.getParentActivity(), anVar.getMessagesController().b2(anVar.f.id), anVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(anVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i10 < size) {
            TLRPC.Peer peer = arrayList.get(i10);
            i10++;
            hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, anVar.getParentActivity(), null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = anVar.getMessagesController().Q6;
        t1Var.setOnCancelListener(new di.z(this, anVar.getConnectionsManager().sendRequest(getgroupcall, new di.k7(this, t1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
        t1Var.r(600L);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C1(org.telegram.ui.Cells.q1 q1Var) {
        an.f5(this.a, q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject;
        if (q1Var == null || (messageObject = q1Var.getMessageObject()) == null || messageObject.k == null) {
            return;
        }
        int e12 = messageObject.e1();
        an anVar = this.a;
        if (anVar.Zb == e12 && anVar.ac == 7) {
            return;
        }
        TLRPC.InputPeer j12 = anVar.getMessagesController().j1(org.telegram.messenger.gj.B0(messageObject.k));
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = j12;
        getrichmessage.id = e12;
        vf.b bVar = anVar.dc;
        if (bVar != null) {
            bVar.a(true);
            anVar.dc = null;
        }
        int[] iArr = new int[1];
        hi hiVar = new hi(anVar, e12, q1Var, 2);
        hiVar.b = new u5(24, anVar, iArr);
        anVar.dc = hiVar;
        hiVar.d();
        iArr[0] = anVar.getConnectionsManager().sendRequestTyped(getrichmessage, new d3.b(1), new di.z2(anVar, hiVar, iArr, q1Var, messageObject, 3));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        e(q1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
        TLRPC.Message message;
        int i7;
        int i10;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.k) == null) {
            return;
        }
        int i11 = o2Var.a;
        an anVar = this.a;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    anVar.Y7(q1Var, true, false, q1Var.getLastTouchX(), q1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i11 == 4) {
                        anVar.g2.n(messageObject.Y1(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                boolean A = org.telegram.messenger.t3.A(i7, anVar.e, 24);
                if (A) {
                    i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    org.telegram.messenger.t3.A(i10, anVar.e, 5);
                }
                aa.c0 c0Var = new aa.c0(this, message, A, messageObject, 28);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                anVar.v7(c0Var, cg.a.l(suggestedPost != null ? suggestedPost.price : null), !A);
                return;
            }
            return;
        }
        long o4 = org.telegram.messenger.m5.o(message.from_id);
        li.v vVar = new li.v(25, this, message);
        Pattern pattern = org.telegram.ui.Components.t4.a;
        Activity parentActivity = anVar.getParentActivity();
        int i12 = 0;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(0, parentActivity, null);
        String M0 = org.telegram.messenger.hd.M0(2131744387, null);
        org.telegram.ui.ActionBar.t1 t1Var = v1Var.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744386, org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).B1(o4, false)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        org.telegram.ui.ActionBar.q6.U(editText, org.telegram.ui.ActionBar.j6.G6, null);
        editText.setHint(org.telegram.messenger.hd.M0(2131744385, null));
        org.telegram.ui.ActionBar.q6.D(editText, org.telegram.ui.ActionBar.j6.H6, null);
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.j6.U(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.k4(parentActivity)});
        editText.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        editText.setSelection(editText.getText().toString().length());
        v1Var.o(frameLayout);
        v1Var.k(org.telegram.messenger.hd.M0(2131751604, null), new org.telegram.ui.Components.f1(i12, vVar, editText));
        v1Var.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        t1Var.O = new org.telegram.ui.Components.g1(editText, i12);
        frameLayout.addView(editText, c8.ja.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.dg(editText, 3), 100L);
        anVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
        an anVar = this.a;
        anVar.Ta.k(q1Var, anVar, true);
        anVar.A0.I0(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        e(q1Var, z10, true, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.l1
    public final boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12;
        String str;
        boolean z11;
        w4 w4Var;
        uj ujVar;
        tj tjVar;
        if (!f()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.t3.K(chat, false));
        an anVar = this.a;
        int i13 = (isEmpty || anVar.e == null || ((ujVar = anVar.d1) != null && ujVar.getVisibility() == 0) || ((tjVar = anVar.T) != null && tjVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = anVar.e;
        int i14 = (chat2 == null || !(anVar.s4 == 0 || anVar.w4) || (org.telegram.messenger.t3.T(chat2) && !anVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = anVar.e;
        int i15 = (chat3 == null || chat3.id != chat.id || anVar.fa()) ? 1 : 0;
        c5[] c5VarArr = new c5[i15 + 1 + i13 + i14];
        c5VarArr[0] = c5.d;
        if (i15 != 0) {
            c5VarArr[1] = chat.broadcast ? c5.e : c5.f;
            i7 = 2;
        } else {
            i7 = 1;
        }
        if (i13 != 0) {
            c5VarArr[i7] = c5.n;
            i7++;
        }
        if (i14 != 0) {
            c5VarArr[i7] = c5.r;
        }
        TLRPC.ChatFull N0 = anVar.getMessagesController().N0(chat.id);
        if (N0 != null) {
            w4Var = w4.a(chat, N0, c5VarArr);
            i11 = i13;
            i12 = i14;
            z10 = true;
            str = null;
            z11 = i15;
        } else {
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.gc m10 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.t0, 0, chat);
            org.telegram.messenger.gc m11 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.t0, 1, chat);
            String str2 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z10 = true;
            i11 = i13;
            i12 = i14;
            str = null;
            z11 = i15;
            w4Var = new w4(m10, m11, null, str2, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, c5VarArr, new v4(i10, org.telegram.messenger.ns.T, chat));
        }
        if (ab.q.i(w4Var)) {
            ab.q.o().D((ViewGroup) anVar.fragmentView, anVar.Aa, w4Var, new a7(this, chat, q1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(anVar, q1Var);
        H.c(R.drawable.msg_openprofile, org.telegram.messenger.hd.M0(2131747786, str), new wl(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        H.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, org.telegram.messenger.hd.M0(z12 ? 2131747811 : 2131747799, str), new o1(this, q1Var, chat, 25), z11);
        H.l(R.drawable.msg_mention, org.telegram.messenger.hd.M0(2131748609, str), new wl(this, chat, z10 ? 1 : 0), i11);
        H.l(R.drawable.msg_search, org.telegram.messenger.hd.M0(2131753758, str), new wl(this, chat, 2), i12);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        messageObject.k.summarizedOpen = !r1.summarizedOpen;
        messageObject.g6(true);
        an anVar = this.a;
        anVar.getMessagesStorage().X1(org.telegram.messenger.gj.B0(messageObject.k), messageObject.k);
        anVar.getMessagesController().t7.h(messageObject, true, false);
        e(q1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        an anVar = this.a;
        if (anVar.X9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (anVar.getParentActivity() != null) {
            if (anVar.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        anVar.Ca(null, tL_inlineButtonTypeUrl.url, true, q1Var, q1Var.getMessageObject());
                        try {
                            q1Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, (Context) anVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) anVar.Aa, false);
                u2Var.O();
                u2Var.P = str;
                u2Var.Q = false;
                u2Var.R = true;
                CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131751767, null)};
                og.j jVar = new og.j(3, anVar, str);
                u2Var.M = charSequenceArr;
                u2Var.L = jVar;
                anVar.showDialog(u2Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void J(org.telegram.messenger.dj djVar) {
        StaticLayout staticLayout = djVar.e;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = djVar.e.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new qi.g(djVar.L, charSequence, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.i20.s(null, 2131752022, org.telegram.ui.Components.cc.a0(this.a));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean J1() {
        an anVar = this.a;
        return anVar.m1.getKeyboardHeight() + anVar.Ka >= org.telegram.messenger.g0.L(20.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
        if (q1Var == null || document == null) {
            return;
        }
        an anVar = this.a;
        if (anVar.getParentLayout() == null || !a0(q1Var)) {
            return;
        }
        boolean J3 = org.telegram.messenger.gj.J3(document);
        q1Var.setScrimBlockBounds(rectF);
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(anVar, q1Var);
        H.c(R.drawable.msg_download, org.telegram.messenger.hd.M0(J3 ? 2131745911 : 2131745931, null), new o1(this, q1Var, document, 26), false);
        H.p = new xl(q1Var, rectF, 0);
        H.Z();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        boolean z10 = q1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        an anVar = this.a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) q1Var.getMessageObject().k.media).channels.get(i7).longValue();
            if (anVar.k6 != j3) {
                anVar.presentFragment(an.ua(j3));
            } else {
                anVar.p1.e(false, false);
            }
        }
        if (q1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            anVar.presentFragment(ProfileActivity.C4(((TLRPC.TL_messageMediaGiveawayResults) q1Var.getMessageObject().k.media).winners.get(i7).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean L0(long j3) {
        TLRPC.ChatFull N0;
        an anVar = this.a;
        TLRPC.Chat chat = anVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.np messagesController = anVar.getMessagesController();
        long j10 = anVar.e.id;
        if (j10 == j3) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        if (messagesController.getUserConfig().e() == j3 && M0 != null && M0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.y1.f(j10);
        if (hVar == null && (N0 = messagesController.N0(j10)) != null && N0.participants != null) {
            for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i7);
                if (chatParticipant.user_id == j3) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j3)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        an anVar = this.a;
        anVar.u5 = messageObject;
        anVar.C9();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().g(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N0(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        bi.m1 m1Var;
        org.telegram.messenger.bj bjVar;
        int i10;
        an anVar = this.a;
        wh.i iVar = anVar.ta;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        wh.h hVar = (wh.h) hashMap.get(wh.i.b(q1Var));
        org.telegram.ui.Components.xb xbVar = null;
        org.telegram.messenger.gj gjVar = hVar != null ? hVar.F : null;
        wh.h hVar2 = (wh.h) anVar.ta.a.get(wh.i.b(q1Var));
        long j3 = (hVar2 == null || (i10 = hVar2.S) == -1) ? 0L : hVar2.x[i10].d;
        if (gjVar != null && j3 != 0) {
            Activity parentActivity = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            if (!org.telegram.ui.Components.t4.h(parentActivity, i7, j3, false)) {
                ArrayList arrayList = (gjVar.c1() == 0 || (bjVar = (org.telegram.messenger.bj) anVar.O6.f(gjVar.c1())) == null) ? null : bjVar.d;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.k5.j(gjVar);
                }
                boolean z10 = j3 == org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n;
                long j10 = j3;
                bi.m1 m1Var2 = new bi.m1(this, arrayList, j10, 18);
                if (z10) {
                    m1Var2.run();
                    m1Var = null;
                } else {
                    m1Var = m1Var2;
                }
                xbVar = org.telegram.ui.Components.cc.v(anVar.getParentActivity(), anVar, null, 1, j10, 1, anVar.getThemedColor(org.telegram.ui.ActionBar.j6.wj), anVar.getThemedColor(org.telegram.ui.ActionBar.j6.yj), 5000, false, m1Var);
                xbVar.k = true;
                xbVar.k(xbVar.e instanceof org.telegram.ui.Components.ib);
            }
        }
        wh.h hVar3 = (wh.h) hashMap.get(wh.i.b(q1Var));
        if (hVar3 != null) {
            if (xbVar == null) {
                hVar3.S = -1;
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.cb cbVar = xbVar.e;
            if (!(cbVar instanceof org.telegram.ui.Components.fb)) {
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.fb fbVar = (org.telegram.ui.Components.fb) cbVar;
            hVar3.X = fbVar;
            fbVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = hVar3.X.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new mw(2, hVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        an anVar = this.a;
        anVar.getSendMessagesHelper().n0(true, q1Var.getMessageObject(), keyboardInlineButton, null, null, anVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void O1(org.telegram.messenger.gj gjVar) {
        this.a.s.put(gjVar, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P(org.telegram.messenger.gj gjVar) {
        if (org.telegram.messenger.gj.L4(gjVar.k)) {
            this.a.Lb(gjVar, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, final TLRPC.TodoItem todoItem, final boolean z10) {
        int i7;
        int i10;
        boolean l32 = org.telegram.messenger.gj.l3(q1Var.getMessageObject().k);
        an anVar = this.a;
        if (l32) {
            TLRPC.Message message = q1Var.getMessageObject().k;
            long o4 = org.telegram.messenger.m5.o(message != null ? message.from_id : null);
            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar);
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            a02.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744087, org.telegram.messenger.m5.l(i10, o4)))).k(true);
            return false;
        }
        if (!q1Var.getMessageObject().q()) {
            TLRPC.Message message2 = q1Var.getMessageObject().k;
            long o10 = org.telegram.messenger.m5.o(message2 != null ? message2.from_id : null);
            org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(anVar);
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            a03.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744088, org.telegram.messenger.m5.l(i7, o10)))).k(true);
            return false;
        }
        if (!anVar.getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(anVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131744064, null), new tl(this, 9))).k(true);
            return false;
        }
        final long M = org.telegram.messenger.t3.M(anVar.e, anVar.q8, true);
        final org.telegram.messenger.ez sendMessagesHelper = anVar.getSendMessagesHelper();
        final org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        sendMessagesHelper.getClass();
        if (messageObject == null) {
            return true;
        }
        final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.gj.B0(messageObject.k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.id));
        sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z10));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
        tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().j1(org.telegram.messenger.gj.B0(messageObject.k));
        if (z10) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
        }
        sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() { // from class: org.telegram.messenger.oy
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ez ezVar = ez.this;
                final boolean z11 = z10;
                if (tL_error == null) {
                    final vr messagesStorage = ezVar.getMessagesStorage();
                    gj gjVar = messageObject;
                    final long B0 = gj.B0(gjVar.k);
                    final int e12 = gjVar.e1();
                    final int i11 = todoItem.id;
                    final long e10 = messagesStorage.getUserConfig().e();
                    final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                    p5 p5Var = messagesStorage.a;
                    final long j3 = M;
                    p5Var.c(new Runnable() { // from class: org.telegram.messenger.cr
                        /* JADX WARN: Removed duplicated region for block: B:106:0x00e3  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x00ea  */
                        /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
                        /* JADX WARN: Removed duplicated region for block: B:115:0x01cf  */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x01c4 A[ORIG_RETURN, RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x0199  */
                        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
                        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:70:0x01bb  */
                        /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            SQLitePreparedStatement sQLitePreparedStatement;
                            long j10;
                            String str;
                            SQLiteCursor sQLiteCursor;
                            SQLitePreparedStatement sQLitePreparedStatement2;
                            SQLiteCursor queryFinalized;
                            NativeByteBuffer byteBufferValue;
                            TLRPC.MessageMedia messageMedia;
                            NativeByteBuffer byteBufferValue2;
                            vr vrVar = vr.this;
                            long j11 = B0;
                            int i12 = e12;
                            long j12 = e10;
                            long j13 = j3;
                            int i13 = i11;
                            boolean z12 = z11;
                            int i14 = currentTime;
                            SQLiteCursor sQLiteCursor2 = null;
                            try {
                                try {
                                    try {
                                        sQLiteCursor = vrVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j11 + " AND mid = " + i12, new Object[0]);
                                    } catch (Exception e11) {
                                        e = e11;
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j10 = j12;
                                        sQLitePreparedStatement = null;
                                        sQLiteCursor = null;
                                        try {
                                            a8.g(e, true);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                                sQLiteCursor = null;
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                                sQLitePreparedStatement = null;
                                            }
                                            if (vrVar.u0(5, j11)) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteCursor2 = sQLiteCursor;
                                            if (sQLiteCursor2 != null) {
                                                sQLiteCursor2.dispose();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    j10 = j12;
                                    str = "SELECT data FROM messages_topics WHERE uid = ";
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = null;
                            }
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue2 = sQLiteCursor.byteBufferValue(0)) == null) {
                                    str = "SELECT data FROM messages_topics WHERE uid = ";
                                    j10 = j12;
                                } else {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                    TLdeserialize.readAttachPath(byteBufferValue2, j12);
                                    byteBufferValue2.reuse();
                                    sQLiteCursor.dispose();
                                    TLRPC.MessageMedia messageMedia2 = TLdeserialize.media;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j10 = j12;
                                        try {
                                            gj.Z5(vrVar.currentAccount, j13, (TLRPC.TL_messageMediaToDo) messageMedia2, i13, z12, i14);
                                            sQLitePreparedStatement = vrVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                        } catch (Exception e14) {
                                            e = e14;
                                            sQLitePreparedStatement = null;
                                            sQLiteCursor = null;
                                            a8.g(e, true);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (vrVar.u0(5, j11)) {
                                            }
                                        }
                                        try {
                                            sQLitePreparedStatement.requery();
                                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                            gj.q5(TLdeserialize);
                                            TLdeserialize.serializeToStream(nativeByteBuffer);
                                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                            sQLitePreparedStatement.bindInteger(2, i12);
                                            sQLitePreparedStatement.bindLong(3, j11);
                                            sQLitePreparedStatement.step();
                                            sQLitePreparedStatement.dispose();
                                            nativeByteBuffer.reuse();
                                        } catch (Exception e15) {
                                            e = e15;
                                            sQLiteCursor = null;
                                            a8.g(e, true);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (vrVar.u0(5, j11)) {
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (sQLiteCursor2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        str = "SELECT data FROM messages_topics WHERE uid = ";
                                        j10 = j12;
                                    }
                                    sQLiteCursor = null;
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    sQLiteCursor = null;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                str = "SELECT data FROM messages_topics WHERE uid = ";
                                j10 = j12;
                                sQLitePreparedStatement = null;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLitePreparedStatement = null;
                                sQLiteCursor2 = sQLiteCursor;
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                            sQLitePreparedStatement = null;
                            if (vrVar.u0(5, j11)) {
                                return;
                            }
                            try {
                                queryFinalized = vrVar.b.queryFinalized(str + j11 + " AND mid = " + i12, new Object[0]);
                                try {
                                } catch (Exception e17) {
                                    e = e17;
                                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                                } catch (Throwable th6) {
                                    th = th6;
                                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Throwable th7) {
                                th = th7;
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                sQLiteCursor2 = sQLiteCursor;
                            }
                            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                            } else {
                                TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                try {
                                    TLdeserialize2.readAttachPath(byteBufferValue, j10);
                                    byteBufferValue.reuse();
                                    messageMedia = TLdeserialize2.media;
                                } catch (Exception e19) {
                                    e = e19;
                                    sQLiteCursor2 = queryFinalized;
                                    a8.g(e, true);
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    if (sQLitePreparedStatement2 == null) {
                                        return;
                                    }
                                    sQLitePreparedStatement2.dispose();
                                } catch (Throwable th8) {
                                    th = th8;
                                    sQLiteCursor2 = queryFinalized;
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                    throw th;
                                }
                                if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                    gj.Z5(vrVar.currentAccount, j13, (TLRPC.TL_messageMediaToDo) messageMedia, i13, z12, i14);
                                    queryFinalized.dispose();
                                    try {
                                        try {
                                            SQLitePreparedStatement executeFast = vrVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                            try {
                                                executeFast.requery();
                                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                                TLdeserialize2.serializeToStream(nativeByteBuffer2);
                                                executeFast.bindByteBuffer(1, nativeByteBuffer2);
                                                executeFast.bindInteger(2, i12);
                                                executeFast.bindLong(3, j11);
                                                executeFast.step();
                                                executeFast.dispose();
                                                try {
                                                    nativeByteBuffer2.reuse();
                                                    sQLitePreparedStatement2 = null;
                                                    if (sQLiteCursor2 != null) {
                                                        sQLiteCursor2.dispose();
                                                    }
                                                    if (sQLitePreparedStatement2 == null) {
                                                        return;
                                                    }
                                                } catch (Exception e20) {
                                                    e = e20;
                                                    sQLitePreparedStatement2 = null;
                                                    a8.g(e, true);
                                                    if (sQLiteCursor2 != null) {
                                                    }
                                                    if (sQLitePreparedStatement2 == null) {
                                                    }
                                                    sQLitePreparedStatement2.dispose();
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    sQLitePreparedStatement2 = null;
                                                    if (sQLiteCursor2 != null) {
                                                    }
                                                    if (sQLitePreparedStatement2 != null) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e21) {
                                                e = e21;
                                                sQLitePreparedStatement2 = executeFast;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                sQLitePreparedStatement2 = executeFast;
                                            }
                                        } catch (Exception e22) {
                                            e = e22;
                                        }
                                        sQLitePreparedStatement2.dispose();
                                    } catch (Throwable th11) {
                                        th = th11;
                                    }
                                }
                            }
                            sQLiteCursor2 = queryFinalized;
                            if (sQLiteCursor2 != null) {
                            }
                            if (sQLitePreparedStatement2 == null) {
                            }
                            sQLitePreparedStatement2.dispose();
                        }
                    });
                    ezVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                }
                g0.h3(new di.u7(ezVar, hash, z11, 3));
            }
        });
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !vf.c.i(str, false, false)) ? z10 : true;
        an anVar = this.a;
        vf.b bVar = anVar.dc;
        if (bVar != null) {
            bVar.a(true);
        }
        anVar.dc = q1Var.getMessageObject() == null ? null : new hm(this, q1Var);
        if (z11 || vf.c.g(parse, false, null)) {
            vf.c.s(anVar.getParentActivity(), parse, true, true, false, anVar.dc, null, false, true, false, false);
        } else {
            org.telegram.ui.Components.t4.o0(anVar, str, true, true, true, !z11, anVar.dc, webPage, anVar.Aa);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean R() {
        an anVar = this.a;
        return anVar.n6[1].size() + anVar.n6[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        an anVar;
        int i7;
        if (q1Var.getMessageObject() == null || (i7 = (anVar = this.a).Zb) == 0 || i7 != q1Var.getMessageObject().e1() || anVar.ac != 1) {
            return null;
        }
        return anVar.bc;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        org.telegram.messenger.gj messageObject;
        TLRPC.Message message;
        if (q1Var == null) {
            return false;
        }
        an anVar = this.a;
        if (anVar.getParentActivity() == null) {
            return false;
        }
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        if (!org.telegram.messenger.np.s1(i7).s4() || (messageObject = q1Var.getMessageObject()) == null || (message = messageObject.k) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.L2 || message.translatedRichMessage == null) {
            return messageObject.u(anVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        try {
            an anVar = this.a;
            org.telegram.ui.Components.bu.N0(anVar, gjVar, anVar.cb, str2, str3, str4, str, i7, i10, -1, anVar.V9());
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean T() {
        an anVar = this.a;
        return org.telegram.messenger.q10.z(anVar.f) || org.telegram.messenger.q10.B(anVar.f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.l8(characterStyle, z10, q1Var.getMessageObject(), q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar) {
        long j3;
        ViewGroup viewGroup;
        int i7;
        nz0 nz0Var;
        if (gjVar.S4() || gjVar.g4()) {
            pz0 pz0Var = this.a.va;
            if (pz0Var == null || pz0Var.c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!gjVar.P3()) {
                            org.telegram.ui.Components.cc.a0(this.a).w(R.drawable.tooltip_sound, org.telegram.messenger.hd.M0(2131743513, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.va = new pz0(this.a.getParentActivity());
                pz0 pz0Var2 = this.a.va;
                fe Lb = !gjVar.P3() ? this.a.Lb(gjVar, true) : null;
                bi.m1 a52 = !gjVar.P3() ? an.a5(this.a, gjVar) : null;
                Context context = pz0Var2.a;
                ai.j0 j0Var = pz0Var2.c;
                pz0Var2.Y = Lb;
                pz0Var2.Z = a52;
                nz0 nz0Var2 = pz0Var2.O;
                if (nz0Var2 != null) {
                    j0Var.removeView(nz0Var2);
                    pz0Var2.O = null;
                }
                pz0Var2.P = q1Var;
                org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                pz0Var2.N = messageObject;
                pz0Var2.T = messageObject != null && messageObject.h4();
                org.telegram.ui.Cells.q1 q1Var2 = pz0Var2.P;
                pz0Var2.M = q1Var2 != null ? q1Var2.getResourcesProvider() : null;
                if (pz0Var2.P != null) {
                    pz0Var2.U = 0.0f;
                    pz0Var2.V = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        pz0Var2.U = view.getY() + pz0Var2.U;
                        pz0Var2.V = view.getY() + pz0Var2.V;
                    }
                    int width = pz0Var2.P.getWidth();
                    int height = pz0Var2.P.getHeight();
                    if (pz0Var2.T) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.q.y));
                    }
                    pz0Var2.L = height - pz0Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.p);
                    j3 = 0;
                    int i10 = height;
                    viewGroup = j0Var;
                    nz0 nz0Var3 = new nz0(pz0Var2, pz0Var2.getContext(), org.telegram.messenger.m10.t0, pz0Var2.P.getResourcesProvider(), width, i10);
                    pz0Var2.O = nz0Var3;
                    pz0Var2.P.u0(nz0Var3);
                    pz0Var2.O.t0(pz0Var2.P);
                    pz0Var2.O.setDelegate(new w7.s(19));
                    nz0 nz0Var4 = pz0Var2.O;
                    org.telegram.messenger.gj gjVar2 = pz0Var2.N;
                    org.telegram.messenger.bj currentMessagesGroup = pz0Var2.P.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = pz0Var2.P;
                    nz0Var4.x3(gjVar2, currentMessagesGroup, q1Var3.G, q1Var3.F, false, false);
                    if (!pz0Var2.T) {
                        org.telegram.ui.Components.z7 z7Var = new org.telegram.ui.Components.z7();
                        pz0Var2.W = z7Var;
                        nz0 nz0Var5 = pz0Var2.O;
                        z7Var.i = nz0Var5;
                        nz0Var5.wc = z7Var;
                        if (nz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.tm0 seekBarWaveform = pz0Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = pz0Var2.s;
                            org.telegram.ui.Cells.q1 q1Var4 = seekBarWaveform.n;
                            if (q1Var4 != null) {
                                q1Var4.invalidate();
                            }
                        }
                    }
                    pz0Var2.I = false;
                    viewGroup.addView(pz0Var2.O, new FrameLayout.LayoutParams(pz0Var2.P.getWidth(), i10, 17));
                    i7 = ceil;
                } else {
                    j3 = 0;
                    viewGroup = j0Var;
                    i7 = 360;
                }
                TextureView textureView = pz0Var2.Q;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    pz0Var2.Q = null;
                }
                if (pz0Var2.T) {
                    pz0Var2.R = false;
                    TextureView textureView2 = new TextureView(context);
                    pz0Var2.Q = textureView2;
                    viewGroup.addView(textureView2, 0, c8.ja.c(i7, i7));
                }
                org.telegram.ui.Components.u51 u51Var = MediaController.B().j0;
                if (u51Var != null) {
                    u51Var.g0();
                }
                org.telegram.ui.Components.u51 u51Var2 = pz0Var2.x;
                if (u51Var2 != null) {
                    u51Var2.g0();
                    pz0Var2.x.m0();
                    pz0Var2.x = null;
                }
                org.telegram.ui.Cells.q1 q1Var5 = pz0Var2.P;
                if (q1Var5 != null && q1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(pz0Var2.P.getMessageObject().K1);
                    File I = org.telegram.messenger.w7.I(pz0Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(pz0Var2.P.getMessageObject().K1);
                        I = org.telegram.messenger.w7.M(pz0Var2.P.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && pz0Var2.P.getMessageObject().k.attachPath != null) {
                        I = new File(pz0Var2.P.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.u51 u51Var3 = new org.telegram.ui.Components.u51();
                        pz0Var2.x = u51Var3;
                        u51Var3.K = new oz0(pz0Var2);
                        if (pz0Var2.W != null) {
                            u51Var3.L = new oz0(pz0Var2);
                        }
                        if (pz0Var2.T) {
                            u51Var3.A0(pz0Var2.Q);
                        }
                        pz0Var2.x.j0(Uri.fromFile(I), "other");
                        pz0Var2.x.h0();
                        org.telegram.ui.Components.ps psVar = pz0Var2.F;
                        if (psVar != null) {
                            psVar.s = pz0Var2.x;
                            psVar.a();
                        }
                    }
                    an anVar = this.a;
                    anVar.showDialog(anVar.va);
                    return false;
                }
                hi.l3 l3Var = pz0Var2.y;
                if (l3Var != null) {
                    viewGroup.removeView(l3Var);
                    pz0Var2.y = null;
                }
                org.telegram.messenger.gj gjVar3 = pz0Var2.N;
                boolean z10 = gjVar3 != null && gjVar3.P3();
                org.telegram.messenger.gj gjVar4 = pz0Var2.N;
                if (gjVar4 != null && org.telegram.messenger.gj.B0(gjVar4.k) != org.telegram.messenger.m10.i(pz0Var2.N.K1).e()) {
                    hi.l3 l3Var2 = new hi.l3(context, 3);
                    pz0Var2.y = l3Var2;
                    l3Var2.r(true);
                    if (z10) {
                        long B0 = org.telegram.messenger.gj.B0(pz0Var2.N.k);
                        String str = "";
                        if (B0 > j3) {
                            TLRPC.User a22 = org.telegram.messenger.np.s1(pz0Var2.N.K1).a2(Long.valueOf(B0));
                            if (a22 != null) {
                                str = org.telegram.messenger.q10.j(a22, true);
                            }
                        } else {
                            TLRPC.Chat M0 = org.telegram.messenger.np.s1(pz0Var2.N.K1).M0(Long.valueOf(-B0));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        pz0Var2.y.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, pz0Var2.T ? 2131743590 : 2131743514, str)));
                    } else {
                        pz0Var2.y.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(pz0Var2.T ? 2131743591 : 2131743515, null)));
                    }
                    pz0Var2.y.s(12.0f);
                    pz0Var2.y.setPadding(org.telegram.messenger.g0.L((z10 || pz0Var2.P.G) ? 0.0f : 6.0f), 0, 0, 0);
                    if (pz0Var2.T) {
                        pz0Var2.y.p(0.5f, 0.0f);
                        pz0Var2.y.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        pz0Var2.y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        pz0Var2.y.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    pz0Var2.y.v(14.0f);
                    hi.l3 l3Var3 = pz0Var2.y;
                    l3Var3.h = hi.l3.a(l3Var3.getText(), pz0Var2.y.getTextPaint());
                    if (pz0Var2.T) {
                        viewGroup.addView(pz0Var2.y, c8.ja.d((int) ((pz0Var2.P.getWidth() / org.telegram.messenger.g0.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((pz0Var2.P.getHeight() + pz0Var2.L) / org.telegram.messenger.g0.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(pz0Var2.y, c8.ja.d((int) ((pz0Var2.P.getWidth() / org.telegram.messenger.g0.p) * 0.6f), 150.0f, 17, ((((pz0Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + pz0Var2.P.getBoundsLeft()) / org.telegram.messenger.g0.p) + 1.0f, ((-75.0f) - ((pz0Var2.P.getHeight() / org.telegram.messenger.g0.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    pz0Var2.y.w();
                }
                TextView textView = pz0Var2.E;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    pz0Var2.E = null;
                }
                TextView textView2 = new TextView(context);
                pz0Var2.E = textView2;
                textView2.setTextColor(-1);
                pz0Var2.E.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    pz0Var2.E.setBackground(org.telegram.ui.ActionBar.j6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    pz0Var2.E.setBackground(org.telegram.ui.ActionBar.j6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                pz0Var2.E.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                c8.na.a(pz0Var2.E);
                pz0Var2.E.setText(org.telegram.messenger.hd.M0(z10 ? 2131743519 : 2131743516, null));
                pz0Var2.E.setOnClickListener(new lz0(pz0Var2, 1));
                viewGroup.addView(pz0Var2.E, c8.ja.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (nz0Var = pz0Var2.O) != null && nz0Var.getMessageObject() != null && pz0Var2.O.getMessageObject().k != null) {
                    pz0Var2.O.getMessageObject().k.media_unread = false;
                    pz0Var2.O.invalidate();
                }
                an anVar2 = this.a;
                anVar2.showDialog(anVar2.va);
                return false;
            }
        } else {
            if (org.telegram.messenger.gj.R4(gjVar.k) || gjVar.h4()) {
                boolean S = MediaController.B().S(gjVar);
                MediaController.B().r0(S ? this.a.i8(gjVar, false) : null, false);
                return S;
            }
            if (gjVar.I3()) {
                MediaController B = MediaController.B();
                ArrayList L = this.a.D0.L();
                an anVar3 = this.a;
                return B.o0(L, gjVar, anVar3.c7, true ^ anVar3.D0.O, null, anVar3.w4 ? anVar3.b() : 0L);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.gj messageObject;
        if (chat == null) {
            return;
        }
        an anVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar.x() || anVar.Y9()) {
            an.k2(anVar, q1Var, true, f10, f11);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = q1Var.getMessageObject()) == null || org.telegram.messenger.gj.B0(messageObject.k) == 1271266957) {
            i(q1Var, chat, i7, z10);
        } else {
            anVar.Qa(org.telegram.messenger.m5.o(messageObject.k.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U1() {
        org.telegram.ui.ActionBar.e6 e6Var;
        an anVar = this.a;
        if (anVar.m1 == null || anVar.getParentActivity() == null) {
            return;
        }
        Context context = anVar.m1.getContext();
        e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
        qy0.d1(context, anVar, false, e6Var, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
        e(q1Var, true, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        org.telegram.messenger.gj messageObject;
        org.telegram.messenger.bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (org.telegram.messenger.gj) arrayList.get(0);
                if (messageObject != null) {
                    an anVar = this.a;
                    boolean z11 = !anVar.Pc && messageObject.e1() == anVar.Oc;
                    if (!z10) {
                        return z11;
                    }
                    if (z11 && System.currentTimeMillis() - anVar.Qc > 1000) {
                        return true;
                    }
                }
                return false;
            }
        }
        messageObject = q1Var.getMessageObject();
        if (messageObject != null) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void W0(org.telegram.ui.Cells.q1 q1Var) {
        an anVar = this.a;
        anVar.getNotificationCenter().k(org.telegram.messenger.ns.n3, Long.valueOf(anVar.k6), q1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final int X() {
        return this.a.g4;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void X0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String N0 = org.telegram.messenger.hd.N0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
        if (TextUtils.isEmpty(N0)) {
            N0 = org.telegram.messenger.hd.M0(2131746594, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        org.telegram.messenger.gj.d(spannableStringBuilder, false);
        org.telegram.messenger.bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        an anVar = this.a;
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.e;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                if ((((org.telegram.messenger.yi) arrayList.get(i7)).l & 1) != 0) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) currentMessagesGroup.d.get(i7);
                    if (gjVar != messageObject) {
                        int childCount = anVar.A0.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = anVar.A0.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                if (gjVar.T(q1Var2.getMessageObject())) {
                                    q1Var = q1Var2;
                                }
                            }
                        }
                        messageObject = gjVar;
                    }
                } else {
                    i7++;
                }
            }
        }
        anVar.qc(messageObject, spannableStringBuilder, 1);
        q1Var.H3(1, false, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        hi hiVar;
        int i7;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        ai.v0 v0Var = null;
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            TLRPC.Message message = messageObject.k;
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                ArrayList arrayList = new ArrayList();
                int i10 = -1;
                for (int i11 = 0; i11 < tL_messageMediaPaidMedia.extended_media.size(); i11++) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i11);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                        if (tL_messageExtendedMedia == messageExtendedMedia) {
                            i10 = arrayList.size();
                        }
                        TLRPC.TL_message R7 = an.R7(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            R7.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            R7.attachPath = message.attachPath;
                        }
                        R7.media = tL_messageExtendedMedia.media;
                        R7.noforwards = true;
                        arrayList.add(new org.telegram.messenger.gj(messageObject.K1, R7, false, true));
                    }
                }
                if (i10 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer p12 = PhotoViewer.p1();
                an anVar = this.a;
                p12.I2(null, anVar, anVar.Aa);
                PhotoViewer.p1().a2(arrayList, i10, this.a.a(), 0L, 0L, this.a.db);
                return;
            }
            return;
        }
        an anVar2 = this.a;
        vf.b bVar = anVar2.dc;
        if (bVar != null) {
            bVar.a(true);
            anVar2.dc = null;
        }
        if (q1Var.getMessageObject() == null) {
            anVar2.dc = null;
            hiVar = null;
        } else {
            hiVar = new hi(anVar2, q1Var.getMessageObject().e1(), q1Var, 1);
            anVar2.dc = hiVar;
        }
        i7 = ((org.telegram.ui.ActionBar.e2) this.a).currentAccount;
        di.v8 y10 = di.v8.y(i7, false);
        Objects.requireNonNull(hiVar);
        bh bhVar = new bh(hiVar, 8);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        org.telegram.ui.ActionBar.e6 I = di.v8.I();
        if (messageObject != null && context != null) {
            long B0 = org.telegram.messenger.gj.B0(messageObject.k);
            int e12 = messageObject.e1();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = org.telegram.messenger.np.s1(y10.a).j1(B0);
            tL_inputInvoiceMessage.msg_id = e12;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.x2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            v0Var = new ai.v0(y10, ConnectionsManager.getInstance(y10.a).sendRequest(tL_payments_getPaymentForm, new bi.l1(y10, messageObject, tL_inputInvoiceMessage, bhVar, 3)), 3);
        }
        if (v0Var != null) {
            hiVar.b = v0Var;
            hiVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7;
        int i10;
        org.telegram.messenger.gc b10;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        an anVar = this.a;
        if (!isEmpty) {
            vf.c.t(anVar.getParentActivity(), "https://" + anVar.getMessagesController().V2 + "/nft/" + str);
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        ug.g1 g1Var = new ug.g1(anVar, i7, user, null, null, anVar.Aa);
        q1Var.getLocationOnScreen(new int[2]);
        g1Var.r2 = q1Var.getNameStatusX();
        g1Var.s2 = q1Var.getNameStatusY();
        g1Var.v2 = q1Var.getScaleX();
        g1Var.t2 = q1Var.getLeft();
        g1Var.u2 = q1Var.getTop();
        g1Var.w2 = q1Var;
        int e10 = org.telegram.messenger.q10.e(user);
        if (e10 < 7) {
            g1Var.q2 = Integer.valueOf(anVar.getThemedColor(org.telegram.ui.ActionBar.j6.r8[e10]));
        } else {
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(i10).r4;
            org.telegram.messenger.cp d = dpVar != null ? dpVar.d(e10) : null;
            g1Var.q2 = d != null ? Integer.valueOf(d.f()) : null;
        }
        org.telegram.ui.Components.e5 e5Var = q1Var.qa;
        if (e5Var != null && (e5Var.f[0] instanceof org.telegram.ui.Components.g5)) {
            g1Var.v2 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(anVar.getParentActivity());
                org.telegram.messenger.pz d2 = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.gc.b(document);
                    if (d2 != null) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    str2 = "160_160_g";
                } else {
                    if (d2 != null && org.telegram.messenger.gj.K2(document, false)) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    b10 = org.telegram.messenger.gc.b(document);
                    str2 = "160_160";
                }
                org.telegram.messenger.gc gcVar = b10;
                String str3 = str2;
                i9Var.setLayerNum(7);
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                i9Var.m(gcVar, str3, org.telegram.messenger.gc.c(w10, document), "140_140", d2, document);
                if (org.telegram.messenger.gj.C4(document)) {
                    Integer num = g1Var.q2;
                    i9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : anVar.getThemedColor(org.telegram.ui.ActionBar.j6.v6), PorterDuff.Mode.SRC_IN));
                    g1Var.y2 = org.telegram.messenger.gj.i1(document);
                } else {
                    g1Var.y2 = org.telegram.messenger.gj.i1(document);
                }
                g1Var.x2 = i9Var;
                g1Var.A2 = true;
            }
        }
        anVar.showDialog(g1Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public final jh.a Z() {
        return this.a.tc;
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0882 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x09d5 A[LOOP:3: B:253:0x09d3->B:254:0x09d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0975  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        xr0 xr0Var;
        TLRPC.PollAnswer pollAnswer2;
        xr0 xr0Var2;
        tr0 tr0Var;
        dh.c cVar;
        org.telegram.messenger.gj gjVar;
        TLRPC.ChatFull chatFull;
        boolean z10;
        boolean z11;
        boolean z12;
        xr0 xr0Var3;
        org.telegram.messenger.gj gjVar2;
        org.telegram.ui.Components.m60 m60Var;
        boolean z13;
        ke keVar;
        an anVar;
        int size;
        int i7;
        ViewGroup viewGroup;
        xr0 xr0Var4;
        boolean z14;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull N0;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z15;
        byte[] bArr;
        tr0 tr0Var2;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z16;
        xr0 xr0Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        String str;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        String str2;
        boolean z17;
        sh.n nVar;
        String str3;
        boolean z18;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        an anVar2 = this.a;
        if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
            hi.l3 l3Var = anVar2.M1;
            if (l3Var != null && l3Var.W) {
                l3Var.f(true);
            }
            zk zkVar = anVar2.Q1;
            if (zkVar != null && zkVar.W) {
                zkVar.f(true);
            }
            org.telegram.messenger.gj primaryMessageObject = q1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
                anVar2.u5 = primaryMessageObject;
                anVar2.v5 = null;
                xr0 xr0Var6 = new xr0(anVar2.getParentActivity(), anVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                xr0Var6.M = q1Var;
                xr0Var6.Q = bArr3;
                org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                xr0Var6.I = messageObject;
                xr0Var6.J = messageObject != null && messageObject.P3();
                org.telegram.ui.Cells.q1 q1Var2 = xr0Var6.M;
                tr0 tr0Var3 = xr0Var6.d;
                if (q1Var2 != null) {
                    xr0Var6.N = anVar2.O9 - org.telegram.messenger.g0.L(4.0f);
                    xr0Var6.O = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        xr0Var6.N = view.getY() + xr0Var6.N;
                        xr0Var6.O = view.getY() + xr0Var6.O;
                    }
                    int width = xr0Var6.M.getWidth();
                    int height = xr0Var6.M.getHeight();
                    xr0Var6.M.getHeight();
                    vr0 vr0Var = new vr0(xr0Var6, xr0Var6.getContext(), org.telegram.messenger.m10.t0, xr0Var6.M.getResourcesProvider(), bArr3, width, height);
                    xr0Var = xr0Var6;
                    xr0Var.K = vr0Var;
                    xr0Var.M.s0(vr0Var);
                    xr0Var.K.t0(xr0Var.M);
                    xr0Var.K.setDelegate(new qb.a(19));
                    vr0 vr0Var2 = xr0Var.K;
                    org.telegram.messenger.gj gjVar3 = xr0Var.I;
                    org.telegram.messenger.bj currentMessagesGroup = xr0Var.M.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = xr0Var.M;
                    vr0Var2.x3(gjVar3, currentMessagesGroup, q1Var3.G, q1Var3.F, q1Var3.H, false);
                    vr0 vr0Var3 = xr0Var.K;
                    vr0Var3.e6 = bArr3;
                    tr0Var3.addView(vr0Var3, new FrameLayout.LayoutParams(xr0Var.M.getWidth(), height, 51));
                    wr0 wr0Var = new wr0(xr0Var.getContext(), org.telegram.messenger.m10.t0, xr0Var.M.getResourcesProvider(), width, height, 0);
                    xr0Var.L = wr0Var;
                    xr0Var.M.u0(wr0Var);
                    xr0Var.M.s0(xr0Var.L);
                    xr0Var.L.t0(xr0Var.M);
                    xr0Var.L.setDelegate(new pb.b(19));
                    wr0 wr0Var2 = xr0Var.L;
                    org.telegram.messenger.gj gjVar4 = xr0Var.I;
                    org.telegram.messenger.bj currentMessagesGroup2 = xr0Var.M.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var4 = xr0Var.M;
                    wr0Var2.x3(gjVar4, currentMessagesGroup2, q1Var4.G, q1Var4.F, q1Var4.H, false);
                    tr0Var3.addView(xr0Var.L, new FrameLayout.LayoutParams(xr0Var.M.getWidth(), height, 51));
                } else {
                    xr0Var = xr0Var6;
                }
                hi.i1 i1Var = xr0Var.f;
                i1Var.bringToFront();
                tr0 tr0Var4 = xr0Var.e;
                tr0Var4.bringToFront();
                xr0Var.n.bringToFront();
                i1Var.t(false);
                Context context = xr0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.e6 e6Var = xr0Var.b;
                org.telegram.ui.Components.m60 G = org.telegram.ui.Components.m60.G(tr0Var3, e6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.gj.m1(xr0Var.I);
                xr0Var.W = org.telegram.messenger.gj.W4(tL_messageMediaPoll4);
                int i10 = 0;
                while (true) {
                    if (i10 >= tL_messageMediaPoll4.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll4.poll.answers.get(i10).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll4.poll.answers.get(i10);
                        break;
                    }
                    i10++;
                }
                dh.c cVar2 = xr0Var.H;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll4.poll;
                    boolean z19 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z20 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll4.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        z15 = z20;
                        bArr = bArr3;
                        tr0Var2 = tr0Var3;
                        pollAnswerVoters = null;
                        z16 = false;
                    } else {
                        int size2 = arrayList2.size();
                        z15 = z20;
                        int i11 = 0;
                        z16 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i11 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i11);
                            int i12 = i11 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            tr0 tr0Var5 = tr0Var3;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z16 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList4 = tL_messageMediaPoll4.poll.answers;
                                int size3 = arrayList4.size();
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll5 = tL_messageMediaPoll4;
                                int i13 = 0;
                                while (i13 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList4.get(i13);
                                    int i14 = i13 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList5 = arrayList4;
                                    int i15 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList3.add(pollAnswer5);
                                    }
                                    arrayList4 = arrayList5;
                                    i13 = i14;
                                    size3 = i15;
                                }
                                tr0Var3 = tr0Var5;
                                i11 = i12;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                tr0Var3 = tr0Var5;
                                i11 = i12;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        tr0Var2 = tr0Var3;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !org.telegram.messenger.gj.A(tL_messageMediaPoll)) {
                        xr0Var5 = xr0Var;
                        arrayList = arrayList3;
                        gjVar = primaryMessageObject;
                        tr0Var = tr0Var2;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        sh.n nVar2 = new sh.n(anVar2.getCurrentAccount(), context, e6Var);
                        org.telegram.ui.Components.m60 J = G.J();
                        J.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                        gh.a k10 = c8.g0.k(e6Var);
                        View view3 = J.B;
                        if (view3 != null) {
                            nVar = nVar2;
                            str3 = null;
                            z18 = false;
                            fh.g c10 = cVar2.c(view3, null, false);
                            c10.p(k10);
                            view3.setBackground(c10);
                        } else {
                            nVar = nVar2;
                            str3 = null;
                            z18 = false;
                        }
                        J.c(R.drawable.ic_ab_back, org.telegram.messenger.hd.M0(2131753756, str3), new fq0(G, 27), z18);
                        J.k();
                        long B0 = org.telegram.messenger.gj.B0(xr0Var.I.k);
                        int e12 = xr0Var.I.e1();
                        int i16 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.gh ghVar = new org.telegram.ui.Components.gh(24, xr0Var, anVar2);
                        xr0Var5 = xr0Var;
                        gjVar = primaryMessageObject;
                        arrayList = arrayList3;
                        tr0Var = tr0Var2;
                        sh.n nVar3 = nVar;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        View a10 = nVar3.a(anVar2, B0, e12, bArr5, i16, ghVar);
                        anVar2 = anVar2;
                        bArr2 = bArr5;
                        J.q(a10);
                        nVar3.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
                        nVar3.setText(org.telegram.messenger.hd.G(pollAnswerVoters.voters, "PollVotesCount", new Object[0]));
                        nVar3.a.d(pollAnswerVoters.recent_voters, false);
                        nVar3.setLayoutParams(c8.ja.o(-1, 48));
                        int i17 = org.telegram.ui.ActionBar.j6.I5;
                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.x0(null, i17, false), 12, 0);
                        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i17);
                        nVar3.setBackground(a02);
                        org.telegram.ui.ActionBar.q6.j(nVar3, a02, null, M, null);
                        nVar3.setOnClickListener(new a90(11, G, J));
                        G.q(nVar3);
                        G.k();
                    }
                    if (!z19) {
                        xr0Var2 = xr0Var5;
                        pollAnswer3 = pollAnswer2;
                        str = null;
                    } else if (z16) {
                        str = null;
                        CharSequence M0 = org.telegram.messenger.hd.M0(2131743824, null);
                        xr0Var2 = xr0Var5;
                        an anVar3 = anVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable qr0Var = new qr0(xr0Var2, z15, anVar3, arrayList, pollAnswer6);
                        anVar2 = anVar3;
                        pollAnswer3 = pollAnswer6;
                        G.c(R.drawable.msg_unvote, M0, qr0Var, false);
                    } else {
                        xr0Var2 = xr0Var5;
                        pollAnswer3 = pollAnswer2;
                        ArrayList arrayList6 = arrayList;
                        str = null;
                        if (sh.g.a(xr0Var2.I) == 0) {
                            G.c(R.drawable.msg_select, org.telegram.messenger.hd.M0(2131747156, null), new qr0(xr0Var2, z15, pollAnswer3, anVar2, arrayList6), false);
                        }
                    }
                    if (anVar2.T6()) {
                        G.c(R.drawable.menu_reply, org.telegram.messenger.hd.M0(2131747170, str), new lc0(xr0Var2, anVar2, pollAnswer3, 23), false);
                    }
                    if (org.telegram.messenger.gj.B0(xr0Var2.I.k) >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        str2 = null;
                        z17 = false;
                    } else {
                        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(xr0Var2.I.K1);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String r10 = org.telegram.messenger.m5.r(s12.e2(org.telegram.messenger.gj.B0(xr0Var2.I.k)));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(s12.V2);
                        sb2.append("/");
                        if (TextUtils.isEmpty(r10)) {
                            r10 = "c/" + (-org.telegram.messenger.gj.B0(xr0Var2.I.k));
                        }
                        sb2.append(r10);
                        sb2.append("/");
                        sb2.append(xr0Var2.I.e1());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        String sb3 = sb2.toString();
                        str2 = null;
                        z17 = false;
                        G.c(R.drawable.msg_link, org.telegram.messenger.hd.M0(2131751762, null), new mp0(3, xr0Var2, sb3), false);
                    }
                    G.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, str2), new mp0(4, xr0Var2, pollAnswer3), z17);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        long e10 = org.telegram.messenger.m10.i(xr0Var2.I.K1).e();
                        cVar = cVar2;
                        long currentTime = ConnectionsManager.getInstance(xr0Var2.I.K1).getCurrentTime();
                        an anVar4 = anVar2;
                        long z02 = org.telegram.messenger.np.s1(xr0Var2.I.K1).y7.K.z0(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!org.telegram.messenger.gj.l3(xr0Var2.I.k)) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (o4 == e10 && currentTime < z02))) {
                                G.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751598, null), new mp0(5, xr0Var2, bArr2), true);
                            }
                        }
                        G.k();
                        TLObject e22 = org.telegram.messenger.np.s1(xr0Var2.I.K1).e2(o4);
                        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131747181, org.telegram.messenger.m5.u(e22), org.telegram.messenger.hd.x(pollAnswer3.date, true)));
                        anVar2 = anVar4;
                        d80 d80Var = new d80(xr0Var2, o4, anVar2, 2);
                        Context context2 = G.e;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        int i18 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.ActionBar.e6 e6Var2 = G.d;
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i18, e6Var2), 0, 12);
                        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i18);
                        frameLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.q6.j(frameLayout, a03, null, M2, e6Var2);
                        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context2);
                        i9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
                        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                        t8Var.l(e22);
                        i9Var.f(e22, t8Var);
                        frameLayout.addView(i9Var, c8.ja.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context2);
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, e6Var2);
                        textView.setTextSize(1, 14.0f);
                        textView.setText(W2);
                        textView.setMaxWidth(org.telegram.messenger.g0.L(150.0f));
                        textView.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new org.telegram.ui.Components.n2(22, G, d80Var));
                        G.r(frameLayout, c8.ja.o(-1, -2));
                    } else {
                        cVar = cVar2;
                    }
                } else {
                    xr0Var2 = xr0Var;
                    tr0Var = tr0Var3;
                    cVar = cVar2;
                    gjVar = primaryMessageObject;
                }
                G.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                G.Q(cVar, c8.g0.k(e6Var), false);
                G.Y();
                ViewGroup viewGroup2 = G.A;
                xr0Var2.S = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                xr0Var2.S.setPivotY(0.0f);
                tr0Var4.addView(xr0Var2.S, c8.ja.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                anVar2.G8(gjVar, arrayList7, arrayList8, arrayList9);
                ke keVar2 = new ke(anVar2, 9);
                org.telegram.messenger.gj gjVar5 = xr0Var2.I;
                ArrayList arrayList10 = anVar2.getMediaDataController().n;
                boolean z21 = (anVar2.z() || anVar2.c() || anVar2.f != null || !gjVar5.w2() || (org.telegram.messenger.t3.T(anVar2.e) && !anVar2.e.megagroup) || org.telegram.messenger.t3.p0(anVar2.e) || arrayList10.isEmpty() || !gjVar5.k.reactions.can_see_list || gjVar5.l4()) ? false : true;
                boolean z22 = !gjVar5.k3() ? gjVar5.l4() || anVar2.g4 == 5 || anVar2.z() || anVar2.c() || !gjVar5.d4() || ((((chatFull = anVar2.q8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.t3.T(anVar2.e)) && anVar2.f == null && !org.telegram.messenger.t3.p0(anVar2.e))) || arrayList10.isEmpty()) : (N0 = anVar2.getMessagesController().N0(-gjVar5.Z0())) != null && (anVar2.z() || anVar2.g4 == 5 || anVar2.c() || !gjVar5.d4() || (((N0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !N0.paid_reactions_available) || arrayList10.isEmpty()));
                if (!z21 && !anVar2.c() && anVar2.e != null && gjVar5.P3() && gjVar5.q4() && !gjVar5.Y2() && !gjVar5.o4() && !gjVar5.n4() && !gjVar5.k.media_unread && !gjVar5.F4() && ConnectionsManager.getInstance(anVar2.getCurrentAccount()).getCurrentTime() - gjVar5.k.date < anVar2.getMessagesController().r3 && ((org.telegram.messenger.t3.n0(anVar2.e) || !org.telegram.messenger.t3.T(anVar2.e)) && (chatFull2 = anVar2.q8) != null && chatFull2.participants_count <= anVar2.getMessagesController().q3 && !(gjVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                    if (anVar2.g4 != 3 && gjVar5.z() && !org.telegram.messenger.t3.p0(anVar2.e)) {
                        z10 = true;
                        if (anVar2.e == null && !gjVar5.N3() && org.telegram.messenger.t3.p0(anVar2.e)) {
                            if (org.telegram.messenger.t3.A(anVar2.getCurrentAccount(), anVar2.e, 24)) {
                                int i19 = ((-anVar2.e.linked_monoforum_id) > gjVar5.Z0() ? 1 : ((-anVar2.e.linked_monoforum_id) == gjVar5.Z0() ? 0 : -1));
                            }
                        }
                        if (!z21 && anVar2.e == null && anVar2.h == null && (user = anVar2.f) != null && !org.telegram.messenger.q10.B(user) && !org.telegram.messenger.q10.z(anVar2.f) && !org.telegram.messenger.q10.s(anVar2.f)) {
                            user2 = anVar2.f;
                            if (!user2.bot && !org.telegram.messenger.q10.A(user2.id) && (((userFull = anVar2.r8) == null || !userFull.read_dates_private) && !anVar2.c() && gjVar5.P3() && gjVar5.q4() && !gjVar5.Y2() && !gjVar5.o4() && !gjVar5.n4() && !gjVar5.k.media_unread && !gjVar5.F4() && anVar2.getConnectionsManager().getCurrentTime() - gjVar5.k.date < anVar2.getMessagesController().s3 && !(gjVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z11 = true;
                                TLRPC.User user3 = anVar2.f;
                                boolean z23 = ((user3 == null && (org.telegram.messenger.q10.z(user3) || org.telegram.messenger.q10.s(anVar2.f))) || anVar2.c() || !gjVar5.X2() || (gjVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                z12 = z10;
                                org.telegram.ui.Components.m60 G2 = org.telegram.ui.Components.m60.G(tr0Var, anVar2.getResourceProvider(), null, !z21 || z10);
                                if (z12) {
                                    xr0Var3 = xr0Var2;
                                    gjVar2 = gjVar5;
                                    m60Var = G2;
                                    z13 = z22;
                                    keVar = keVar2;
                                    anVar = anVar2;
                                    if (z11) {
                                        m60Var.r(new org.telegram.ui.Components.oa0(xr0Var3.getContext(), 0, gjVar2, new or0(xr0Var3, 1), xr0Var3.b), c8.ja.o(-1, 36));
                                        m60Var.k();
                                    } else if (z23) {
                                        m60Var.r(new org.telegram.ui.Components.oa0(xr0Var3.getContext(), 1, gjVar2, new or0(xr0Var3, 2), xr0Var3.b), c8.ja.o(-1, 36));
                                        m60Var.k();
                                    }
                                } else {
                                    jf0 jf0Var = new jf0(xr0Var2.getContext(), anVar2.getCurrentAccount(), gjVar5, anVar2.e);
                                    FrameLayout frameLayout2 = new FrameLayout(xr0Var2.getContext());
                                    frameLayout2.addView(jf0Var, c8.ja.c(36.0f, -1));
                                    org.telegram.ui.Components.m60 J2 = G2.J();
                                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, xr0Var2.getContext(), xr0Var2.b, true, false);
                                    z0Var.setItemHeight(44);
                                    xr0 xr0Var7 = xr0Var2;
                                    z0Var.j(org.telegram.messenger.hd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                                    gjVar2 = gjVar5;
                                    z0Var.getTextView().setPadding(org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                                    FrameLayout frameLayout3 = new FrameLayout(xr0Var7.getContext());
                                    LinearLayout linearLayout = new LinearLayout(xr0Var7.getContext());
                                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, linearLayout, e6Var);
                                    linearLayout.setOrientation(1);
                                    an anVar5 = anVar2;
                                    org.telegram.ui.Components.uj0 a11 = jf0Var.a();
                                    frameLayout3.addView(z0Var);
                                    linearLayout.addView(frameLayout3);
                                    z13 = z22;
                                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(xr0Var7.getContext(), e6Var), c8.ja.o(-1, 8));
                                    frameLayout3.setOnClickListener(new rr0(G2, 0));
                                    keVar = keVar2;
                                    sr0 sr0Var = new sr0(xr0Var7, jf0Var, anVar5, a11, linearLayout, G2, J2);
                                    anVar = anVar5;
                                    xr0Var3 = xr0Var7;
                                    m60Var = G2;
                                    jf0Var.setOnClickListener(sr0Var);
                                    linearLayout.addView(a11, c8.ja.o(-1, -2));
                                    J2.q(linearLayout);
                                    m60Var.q(frameLayout2);
                                    m60Var.k();
                                }
                                size = arrayList7.size();
                                for (i7 = 0; i7 < size; i7++) {
                                    m60Var.c(((Integer) arrayList7.get(i7)).intValue(), (CharSequence) arrayList8.get(i7), new org.telegram.ui.Components.u11(xr0Var3, keVar, ((Integer) arrayList9.get(i7)).intValue(), 10), false);
                                }
                                m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                                m60Var.Q(cVar, c8.g0.k(e6Var), false);
                                m60Var.Y();
                                ViewGroup viewGroup3 = m60Var.A;
                                xr0Var3.U = viewGroup3;
                                viewGroup3.setPivotX(0.0f);
                                xr0Var3.U.setPivotY(0.0f);
                                tr0Var4.addView(xr0Var3.U, c8.ja.e(-2, -2, 51));
                                viewGroup = xr0Var3.U;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    int i20 = 5;
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ni0(xr0Var3, i20));
                                    xr0Var3.U.setOnTouchListener(new c0(xr0Var3, i20));
                                }
                                if (z13) {
                                    xr0Var4 = xr0Var3;
                                    z14 = true;
                                } else {
                                    xr0 xr0Var8 = xr0Var3;
                                    an anVar6 = anVar;
                                    org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0((anVar.getUserConfig().e() > anVar.a() ? 1 : (anVar.getUserConfig().e() == anVar.a() ? 0 : -1)) == 0 ? 3 : 0, anVar.getCurrentAccount(), xr0Var3.getContext(), anVar6, xr0Var3.b);
                                    mi0Var.a = true;
                                    float f10 = 22;
                                    mi0Var.setPadding(org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 0 : 24), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 24 : 0), org.telegram.messenger.g0.L(f10));
                                    xr0Var4 = xr0Var8;
                                    org.telegram.messenger.gj gjVar6 = gjVar2;
                                    mi0Var.setDelegate(new ab.c0(xr0Var4, anVar6, gjVar6, mi0Var, false, 10));
                                    xr0Var4.R = mi0Var;
                                    tr0Var4.addView(mi0Var, c8.ja.e(-2, (int) ((mi0Var.getTopOffset() / org.telegram.messenger.g0.p) + 52.0f + f10), 51));
                                    z14 = true;
                                    mi0Var.p(gjVar6, anVar6.q8, true);
                                    xr0Var4.R.setTransitionProgress(1.0f);
                                }
                                xr0Var4.e();
                                xr0Var4.f0 = new tl(this, 0);
                                xr0Var4.show();
                                return z14;
                            }
                        }
                        z11 = false;
                        TLRPC.User user32 = anVar2.f;
                        if (user32 == null) {
                        }
                        z12 = z10;
                        org.telegram.ui.Components.m60 G22 = org.telegram.ui.Components.m60.G(tr0Var, anVar2.getResourceProvider(), null, !z21 || z10);
                        if (z12) {
                        }
                        size = arrayList7.size();
                        while (i7 < size) {
                        }
                        m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                        m60Var.Q(cVar, c8.g0.k(e6Var), false);
                        m60Var.Y();
                        ViewGroup viewGroup32 = m60Var.A;
                        xr0Var3.U = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        xr0Var3.U.setPivotY(0.0f);
                        tr0Var4.addView(xr0Var3.U, c8.ja.e(-2, -2, 51));
                        viewGroup = xr0Var3.U;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z13) {
                        }
                        xr0Var4.e();
                        xr0Var4.f0 = new tl(this, 0);
                        xr0Var4.show();
                        return z14;
                    }
                }
                z10 = false;
                if (anVar2.e == null) {
                }
                if (!z21) {
                    user2 = anVar2.f;
                    if (!user2.bot) {
                        z11 = true;
                        TLRPC.User user322 = anVar2.f;
                        if (user322 == null) {
                        }
                        z12 = z10;
                        org.telegram.ui.Components.m60 G222 = org.telegram.ui.Components.m60.G(tr0Var, anVar2.getResourceProvider(), null, !z21 || z10);
                        if (z12) {
                        }
                        size = arrayList7.size();
                        while (i7 < size) {
                        }
                        m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                        m60Var.Q(cVar, c8.g0.k(e6Var), false);
                        m60Var.Y();
                        ViewGroup viewGroup322 = m60Var.A;
                        xr0Var3.U = viewGroup322;
                        viewGroup322.setPivotX(0.0f);
                        xr0Var3.U.setPivotY(0.0f);
                        tr0Var4.addView(xr0Var3.U, c8.ja.e(-2, -2, 51));
                        viewGroup = xr0Var3.U;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z13) {
                        }
                        xr0Var4.e();
                        xr0Var4.f0 = new tl(this, 0);
                        xr0Var4.show();
                        return z14;
                    }
                }
                z11 = false;
                TLRPC.User user3222 = anVar2.f;
                if (user3222 == null) {
                }
                z12 = z10;
                org.telegram.ui.Components.m60 G2222 = org.telegram.ui.Components.m60.G(tr0Var, anVar2.getResourceProvider(), null, !z21 || z10);
                if (z12) {
                }
                size = arrayList7.size();
                while (i7 < size) {
                }
                m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                m60Var.Q(cVar, c8.g0.k(e6Var), false);
                m60Var.Y();
                ViewGroup viewGroup3222 = m60Var.A;
                xr0Var3.U = viewGroup3222;
                viewGroup3222.setPivotX(0.0f);
                xr0Var3.U.setPivotY(0.0f);
                tr0Var4.addView(xr0Var3.U, c8.ja.e(-2, -2, 51));
                viewGroup = xr0Var3.U;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z13) {
                }
                xr0Var4.e();
                xr0Var4.f0 = new tl(this, 0);
                xr0Var4.show();
                return z14;
            }
        }
        return false;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        an anVar = this.a;
        qj qjVar = anVar.a0;
        if (qjVar != null) {
            CharSequence fieldText = qjVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String K = org.telegram.messenger.t3.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                anVar.a0.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.i3(new tl(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var == null ? null : q1Var.getMessageObject();
        if (messageObject == null || messageObject.k == null) {
            return false;
        }
        an anVar = this.a;
        return (anVar.g4 == 1 || anVar.W9() || messageObject.k.noforwards || messageObject.D == 29) ? false : true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.l10 l10Var) {
        TLRPC.Message message;
        if (q1Var == null) {
            l10Var.run();
            return;
        }
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject == null || ((messageObject.o4() && !messageObject.Y2()) || (message = messageObject.k) == null || message.rich_message == null)) {
            l10Var.run();
        } else {
            org.telegram.ui.ActionBar.e2 e2Var = this.a;
            e2Var.getSendMessagesHelper().v(messageObject, messageObject.k.rich_message, null, e2Var, true);
        }
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        an anVar = this.a;
        qj qjVar = anVar.a0;
        if (qjVar != null) {
            CharSequence fieldText = qjVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String n10 = org.telegram.messenger.q10.n(user);
            if (n10 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) n10).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(r.b.v(org.telegram.messenger.q10.j(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.i41("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            anVar.a0.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.i3(new tl(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        an anVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar2.x() || anVar.Y9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
        return !z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.l1
    public final boolean c0(org.telegram.ui.Cells.q1 q1Var, final TLRPC.User user) {
        char c10;
        int i7;
        w4 b10;
        int i10;
        uj ujVar;
        tj tjVar;
        final int i11 = 0;
        if (!f()) {
            return false;
        }
        an anVar = this.a;
        final int i12 = 1;
        ?? r22 = (anVar.e == null || ((ujVar = anVar.d1) != null && ujVar.getVisibility() == 0) || ((tjVar = anVar.T) != null && tjVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = anVar.e;
        ?? r42 = (chat == null || !(anVar.s4 == 0 || anVar.w4) || (org.telegram.messenger.t3.T(chat) && !anVar.e.megagroup)) ? 0 : 1;
        c5[] c5VarArr = new c5[r22 + 2 + r42];
        c5VarArr[0] = c5.d;
        c5VarArr[1] = c5.h;
        final int i13 = 2;
        if (r22 != 0) {
            c5VarArr[2] = c5.n;
            c10 = 3;
        } else {
            c10 = 2;
        }
        if (r42 != 0) {
            c5VarArr[c10] = c5.r;
        }
        TLRPC.UserFull b22 = anVar.getMessagesController().b2(user.id);
        if (b22 != null) {
            b10 = w4.c(user, b22, c5VarArr);
            if (!ab.q.i(b10)) {
                i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        } else {
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            b10 = w4.b(user, i7, c5VarArr);
        }
        if (ab.q.i(b10)) {
            ab.q.o().D((ViewGroup) anVar.fragmentView, anVar.Aa, b10, new a7(this, q1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(anVar, q1Var);
        H.c(R.drawable.msg_openprofile, org.telegram.messenger.hd.M0(2131747786, null), new Runnable(this) { // from class: org.telegram.ui.ul
            public final /* synthetic */ lm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.q(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.Pa(user);
                        break;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, org.telegram.messenger.hd.M0(2131745601, null), new o1(this, q1Var, user, 24), false);
        H.l(R.drawable.msg_mention, org.telegram.messenger.hd.M0(2131748609, null), new Runnable(this) { // from class: org.telegram.ui.ul
            public final /* synthetic */ lm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.q(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.Pa(user);
                        break;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, org.telegram.messenger.hd.M0(2131753758, null), new Runnable(this) { // from class: org.telegram.ui.ul
            public final /* synthetic */ lm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.q(user, false);
                        break;
                    case 1:
                        this.b.b(user);
                        break;
                    default:
                        this.b.a.Pa(user);
                        break;
                }
            }
        }, r42);
        H.t = false;
        H.i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final dr0 c2() {
        return this.a.Sa;
    }

    public final void d(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        an anVar = this.a;
        anVar.getUserConfig().f();
        if (!org.telegram.messenger.g0.E1(anVar.getParentActivity()) || (chat = anVar.e) == null || currentUser == null || org.telegram.messenger.t3.V(chat)) {
            return;
        }
        boolean z13 = true;
        boolean z14 = false;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                z10 = channelParticipant.promoted_by == anVar.getUserConfig().e();
            } else {
                z10 = false;
                z13 = false;
            }
            str = channelParticipant.rank;
        } else {
            if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    z11 = channelParticipant2.promoted_by == anVar.getUserConfig().e();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = anVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                long j3 = -anVar.e.id;
                e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                org.telegram.ui.Components.gy0.b(parentActivity, i7, j3, currentUser, str2, z15, z16, z12, e6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (org.telegram.messenger.t3.T(anVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    anVar.getMessagesController();
                    tL_channels_getParticipant.channel = org.telegram.messenger.np.i1(anVar.e);
                    tL_channels_getParticipant.participant = anVar.getMessagesController().j1(currentUser.id);
                    anVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new bi.e4(12, this, q1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == anVar.getUserConfig().e();
            } else {
                z10 = false;
                z13 = false;
            }
            str = ((TLRPC.ChatParticipant) tLObject).rank;
        }
        z12 = z10;
        str2 = str;
        boolean z152 = z13;
        boolean z162 = z14;
        Activity parentActivity2 = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        long j32 = -anVar.e.id;
        e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
        org.telegram.ui.Components.gy0.b(parentActivity2, i7, j32, currentUser, str2, z152, z162, z12, e6Var);
    }

    public final void e(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11, boolean z12) {
        org.telegram.messenger.gj primaryMessageObject;
        int i7;
        int i10;
        dj djVar;
        if (q1Var == null || (primaryMessageObject = q1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        an anVar = this.a;
        aj ajVar = anVar.A0;
        if (ajVar != null && (djVar = anVar.C0) != null && djVar.y < 0) {
            for (int childCount = ajVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = anVar.A0.getChildAt(childCount);
                anVar.A0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.q1)) {
                        if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = anVar.h9(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = anVar.h9(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        if (z10 && i7 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                dj djVar2 = anVar.C0;
                anVar.A0.getClass();
                djVar2.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) anVar.O9), false);
            } else {
                anVar.C0.h1(i7, i10);
            }
        }
        anVar.c1 = z11;
        anVar.Zc(primaryMessageObject, false);
        anVar.c1 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void e0(int i7) {
        int i10;
        SpannableStringBuilder X2;
        int i11;
        int i12 = 3;
        int i13 = 2;
        int i14 = 1;
        an anVar = this.a;
        try {
            if (i7 == 0) {
                anVar.w7();
                mk mkVar = anVar.O3;
                if (mkVar == null) {
                    return;
                }
                mkVar.l(0L, 84, null, new tl(this, i14));
                anVar.O3.performHapticFeedback(3, 2);
                return;
            }
            if (i7 == 1) {
                String x10 = org.telegram.messenger.hd.x(anVar.getMessagesController().v4, true);
                if (anVar.getMessagesController().v4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(org.telegram.ui.Components.x11.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(org.telegram.ui.Components.x11.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.cc.a0(anVar).G(R.raw.transcribe, 6, X2).k(true);
                anVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i7 == 2 || i7 == 3) {
                String x11 = org.telegram.messenger.hd.x(anVar.getMessagesController().v4, true);
                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(anVar.getMessagesController().t4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ").append(i7 == 2 ? org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131743968, null), new tl(this, i13)) : anVar.getMessagesController().v4 <= 0 ? "" : org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131743967, x11), new tl(this, i12)));
                a02.getClass();
                org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(a02.W(), a02.c);
                fbVar.c(R.raw.transcribe, 36, 36, new String[0]);
                if (append != null) {
                    String charSequence = append.toString();
                    int i15 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i15 >= 6) {
                            append.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i15++;
                    }
                }
                fbVar.b.setText(append);
                fbVar.b.setSingleLine(false);
                fbVar.b.setMaxLines(6);
                a02.b(fbVar, 7000).k(true);
                org.telegram.messenger.p2.E.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void e2(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new qi.g(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.i20.s(null, 2131752022, org.telegram.ui.Components.cc.a0(this.a));
    }

    public final boolean f() {
        an anVar = this.a;
        if (org.telegram.messenger.q10.B(anVar.f)) {
            return true;
        }
        TLRPC.Chat chat = anVar.e;
        if (chat != null) {
            return !org.telegram.messenger.t3.T(chat) || anVar.e.megagroup;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean f0() {
        return this.a.g4 == 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean f1(org.telegram.messenger.gj gjVar) {
        jl jlVar;
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        an anVar = this.a;
        return (B0 == 1271266957 || ((jlVar = anVar.D0) != null && jlVar.O)) && anVar.g4 != 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f2(long j3) {
        TLRPC.ChatFull N0;
        an anVar = this.a;
        TLRPC.Chat chat = anVar.e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.np messagesController = anVar.getMessagesController();
        long j10 = anVar.e.id;
        if (j10 == j3) {
            messagesController.getClass();
            return true;
        }
        a0.h hVar = (a0.h) messagesController.y1.f(j10);
        if (hVar == null && (N0 = messagesController.N0(j10)) != null && N0.participants != null) {
            for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i7);
                if (chatParticipant.user_id == j3) {
                    return (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                }
            }
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.f(j3);
        if ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean g() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0103, code lost:
    
        if (org.telegram.messenger.m5.o(r5) != r8.k6) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
        Integer num;
        String str;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str2;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        byte[] bArr2;
        TLRPC.Message message;
        String str3;
        long j3;
        boolean z11;
        TLRPC.Chat M0;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        TLRPC.Chat M02;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        org.telegram.messenger.gj gjVar;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.k kVar;
        boolean c10 = c();
        an anVar = this.a;
        if (!c10 && !z10) {
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            if ((kVar.x() || anVar.Y9()) && !anVar.t9.z(q1Var.getMessageObject())) {
                an.k2(anVar, q1Var, !q1Var.C2(f10), f10, f11);
                return;
            }
            return;
        }
        if (org.telegram.messenger.q10.z(anVar.f)) {
            r(q1Var);
            return;
        }
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        if (messageObject.f4() && (storyItem = (message3 = messageObject.k).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.k5.n(null, 2131744606, org.telegram.ui.Components.cc.a0(anVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = org.telegram.messenger.m5.o(message3.reply_to.peer);
            storyItem.messageId = messageObject.e1();
            storyItem.messageType = 3;
            fi.l7.b(storyItem, anVar.f);
            anVar.getOrCreateStoryViewer().L(anVar.getParentActivity(), storyItem, fi.b7.a(anVar.A0));
            return;
        }
        TLRPC.Message message4 = messageObject.k;
        if (message4 == null || (messageReplyHeader7 = message4.reply_to) == null || (messageReplyHeader7.flags & 2048) == 0) {
            if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr2 = messageReplyHeader2.poll_option) != null) {
                num = null;
                str2 = null;
                bArr = bArr2;
            } else if (message4 == null || (messageReplyHeader = message4.reply_to) == null || !messageReplyHeader.quote) {
                num = null;
                str = null;
            } else {
                String str4 = messageReplyHeader.quote_text;
                r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                num = null;
                str2 = str4;
                bArr = 0;
            }
            long j10 = anVar.k6;
            message = messageObject.k;
            if (message == null && (messageReplyHeader6 = message.reply_to) != null) {
                TLRPC.Peer peer = messageReplyHeader6.reply_to_peer_id;
                if (peer == null) {
                    str3 = str2;
                    TLRPC.MessageFwdHeader messageFwdHeader = messageReplyHeader6.reply_from;
                    if (messageFwdHeader != null) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 != null) {
                            if (!(peer2 instanceof TLRPC.TL_peerUser)) {
                                j10 = org.telegram.messenger.m5.o(peer2);
                            }
                            j3 = Long.MAX_VALUE;
                        } else {
                            TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                            if (peer3 != null) {
                                j10 = org.telegram.messenger.m5.o(peer3);
                            }
                            j3 = Long.MAX_VALUE;
                        }
                    }
                } else {
                    if (!(peer instanceof TLRPC.TL_peerUser)) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        z11 = true;
                        j3 = o4;
                        str3 = str2;
                        M0 = j3 >= 0 ? anVar.getMessagesController().M0(Long.valueOf(-j3)) : null;
                        if (j3 != Long.MAX_VALUE) {
                            boolean z12 = z11;
                            if (j3 == anVar.k6 || M0 == null || org.telegram.messenger.t3.t0(M0) || (!M0.left && !M0.kicked)) {
                                if (((j3 == anVar.k6 && (!org.telegram.messenger.t3.c0(anVar.e) || !z12)) || j3 == Long.MAX_VALUE) && (anVar.g4 != 3 || ((gjVar = messageObject.C) != null && gjVar.P1() == anVar.b()))) {
                                    int i10 = anVar.g4;
                                    if (i10 == 2 || i10 == 1) {
                                        anVar.m9.P0(i7);
                                        anVar.finishFragment();
                                        return;
                                    }
                                    if (bArr != 0) {
                                        anVar.i8 = bArr;
                                    } else if (num != null) {
                                        anVar.h8 = num;
                                    } else {
                                        TLRPC.Message message5 = messageObject.k;
                                        if (message5 != null && (messageReplyHeader5 = message5.reply_to) != null && messageReplyHeader5.quote) {
                                            anVar.e8 = true;
                                            anVar.g8 = messageReplyHeader5.quote_text;
                                            anVar.j8 = r9;
                                            anVar.d8 = true;
                                        }
                                    }
                                    ai.f1 f1Var = new ai.f1(this, i7, messageObject, num, bArr, 14);
                                    if (!anVar.D0.O) {
                                        f1Var.run();
                                        return;
                                    }
                                    anVar.G3 = false;
                                    anVar.Rb(false, true, false);
                                    anVar.nd(anVar.getMediaDataController().c0(), anVar.getMediaDataController().f1, anVar.getMediaDataController().j0());
                                    org.telegram.messenger.g0.i3(f1Var, 80L);
                                    return;
                                }
                                Integer num2 = num;
                                byte[] bArr3 = bArr;
                                if (LaunchActivity.H1 != null) {
                                    vf.b bVar = anVar.dc;
                                    if (bVar != null) {
                                        bVar.a(false);
                                        anVar.dc = null;
                                    }
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    final j0 j0Var = new j0(this, messageObject, q1Var);
                                    anVar.dc = j0Var;
                                    int e12 = messageObject.e1();
                                    ArrayList arrayList = launchActivity.e0;
                                    if (j3 < 0 && (M02 = org.telegram.messenger.np.s1(launchActivity.P).M0(Long.valueOf(-j3))) != null && org.telegram.messenger.t3.c0(M02)) {
                                        j0Var.d();
                                        final int i11 = 0;
                                        launchActivity.l0(j3, Integer.valueOf(i7), str3, num2, bArr3, new Runnable() { // from class: org.telegram.ui.a70
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i12 = i11;
                                                j0 j0Var2 = j0Var;
                                                switch (i12) {
                                                    case 0:
                                                        String str5 = LaunchActivity.C1;
                                                        j0Var2.c(false);
                                                        break;
                                                    default:
                                                        String str6 = LaunchActivity.C1;
                                                        j0Var2.c(false);
                                                        break;
                                                }
                                            }
                                        }, e12, r9);
                                        return;
                                    }
                                    String str5 = str3;
                                    int i12 = r9;
                                    j0Var.d();
                                    Bundle bundle = new Bundle();
                                    if (j3 >= 0) {
                                        bundle.putLong("user_id", j3);
                                    } else {
                                        long j11 = -j3;
                                        TLRPC.Chat M03 = org.telegram.messenger.np.s1(launchActivity.P).M0(Long.valueOf(j11));
                                        if (M03 != null && M03.forum) {
                                            final int i13 = 1;
                                            launchActivity.l0(j3, Integer.valueOf(i7), str5, num2, bArr3, new Runnable() { // from class: org.telegram.ui.a70
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i122 = i13;
                                                    j0 j0Var2 = j0Var;
                                                    switch (i122) {
                                                        case 0:
                                                            String str52 = LaunchActivity.C1;
                                                            j0Var2.c(false);
                                                            break;
                                                        default:
                                                            String str6 = LaunchActivity.C1;
                                                            j0Var2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, e12, i12);
                                            return;
                                        }
                                        bundle.putLong("chat_id", j11);
                                    }
                                    bundle.putInt("message_id", i7);
                                    org.telegram.ui.ActionBar.e2 e2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList) : null;
                                    if (e2Var == null || org.telegram.messenger.np.s1(launchActivity.P).E(bundle, e2Var, null, null)) {
                                        org.telegram.messenger.g0.h3(new z60(launchActivity, bundle, bArr3, i7, num2, str5, i12, j3, j0Var, e2Var));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        message2 = messageObject.k;
                        if (message2 != null || (messageReplyHeader4 = message2.reply_to) == null || TextUtils.isEmpty(messageReplyHeader4.quote_text) || !messageObject.c1 || messageObject.d1 || messageObject.P5()) {
                            TLRPC.Message message6 = messageObject.k;
                            org.telegram.ui.Components.cc.a0(anVar).Q(R.raw.error, 36, org.telegram.messenger.hd.M0((message6 == null && (messageReplyHeader3 = message6.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746432 : 2131746433 : 2131746431 : (M0 == null && M0.megagroup) ? 2131746256 : !org.telegram.messenger.t3.T(M0) ? 2131746257 : 2131746258, null)).k(true);
                        } else {
                            messageObject.d1 = true;
                            anVar.Yc(messageObject, true);
                            return;
                        }
                    }
                    str3 = str2;
                }
                z11 = false;
                if (j3 >= 0) {
                }
                if (j3 != Long.MAX_VALUE) {
                }
                message2 = messageObject.k;
                if (message2 != null) {
                }
                TLRPC.Message message62 = messageObject.k;
                org.telegram.ui.Components.cc.a0(anVar).Q(R.raw.error, 36, org.telegram.messenger.hd.M0((message62 == null && (messageReplyHeader3 = message62.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746432 : 2131746433 : 2131746431 : (M0 == null && M0.megagroup) ? 2131746256 : !org.telegram.messenger.t3.T(M0) ? 2131746257 : 2131746258, null)).k(true);
            }
            str3 = str2;
            j3 = j10;
            z11 = false;
            if (j3 >= 0) {
            }
            if (j3 != Long.MAX_VALUE) {
            }
            message2 = messageObject.k;
            if (message2 != null) {
            }
            TLRPC.Message message622 = messageObject.k;
            org.telegram.ui.Components.cc.a0(anVar).Q(R.raw.error, 36, org.telegram.messenger.hd.M0((message622 == null && (messageReplyHeader3 = message622.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746432 : 2131746433 : 2131746431 : (M0 == null && M0.megagroup) ? 2131746256 : !org.telegram.messenger.t3.T(M0) ? 2131746257 : 2131746258, null)).k(true);
        }
        num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        str = null;
        str2 = str;
        bArr = str;
        long j102 = anVar.k6;
        message = messageObject.k;
        if (message == null) {
        }
        str3 = str2;
        j3 = j102;
        z11 = false;
        if (j3 >= 0) {
        }
        if (j3 != Long.MAX_VALUE) {
        }
        message2 = messageObject.k;
        if (message2 != null) {
        }
        TLRPC.Message message6222 = messageObject.k;
        org.telegram.ui.Components.cc.a0(anVar).Q(R.raw.error, 36, org.telegram.messenger.hd.M0((message6222 == null && (messageReplyHeader3 = message6222.reply_to) != null && messageReplyHeader3.quote) ? (M0 == null || !M0.megagroup) ? org.telegram.messenger.t3.T(M0) ? 2131746432 : 2131746433 : 2131746431 : (M0 == null && M0.megagroup) ? 2131746256 : !org.telegram.messenger.t3.T(M0) ? 2131746257 : 2131746258, null)).k(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        an anVar;
        int i7;
        if (q1Var.getMessageObject() == null || (i7 = (anVar = this.a).Zb) == 0 || i7 != q1Var.getMessageObject().e1() || anVar.ac != 3) {
            return null;
        }
        return anVar.cc;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        this.a.Y7(q1Var, true, false, f10, f11, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0832 A[LOOP:2: B:231:0x0830->B:232:0x0832, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0492  */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        b81 b81Var;
        TLRPC.TodoItem todoItem2;
        final int i7;
        TLRPC.TodoCompletion todoCompletion;
        b81 b81Var2;
        org.telegram.messenger.gj gjVar;
        String str;
        boolean z10;
        b81 b81Var3;
        int i10;
        org.telegram.messenger.gj gjVar2;
        boolean z11;
        TLRPC.ChatFull chatFull;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        org.telegram.messenger.gj gjVar3;
        ArrayList arrayList;
        an anVar;
        ArrayList arrayList2;
        org.telegram.ui.Components.m60 m60Var;
        ke keVar;
        boolean z17;
        b81 b81Var4;
        dh.c cVar;
        int i11;
        e81 e81Var;
        int size;
        int i12;
        ViewGroup viewGroup;
        e81 e81Var2;
        boolean z18;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull N0;
        String str2;
        boolean z19;
        final int i13;
        String str3;
        int i14;
        int i15;
        Calendar calendar;
        int i16;
        int i17;
        int i18;
        final an anVar2 = this.a;
        if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
            hi.l3 l3Var = anVar2.M1;
            if (l3Var != null && l3Var.W) {
                l3Var.f(true);
            }
            zk zkVar = anVar2.Q1;
            if (zkVar != null && zkVar.W) {
                zkVar.f(true);
            }
            org.telegram.messenger.gj primaryMessageObject = q1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m12 instanceof TLRPC.TL_messageMediaToDo)) {
                anVar2.u5 = primaryMessageObject;
                anVar2.v5 = null;
                final e81 e81Var3 = new e81(anVar2.getParentActivity(), anVar2.getResourceProvider());
                final int i19 = todoItem.id;
                e81Var3.L = q1Var;
                e81Var3.P = i19;
                org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                e81Var3.H = messageObject;
                e81Var3.I = messageObject != null && messageObject.P3();
                org.telegram.ui.Cells.q1 q1Var2 = e81Var3.L;
                b81 b81Var5 = e81Var3.c;
                if (q1Var2 != null) {
                    e81Var3.M = anVar2.O9 - org.telegram.messenger.g0.L(4.0f);
                    e81Var3.N = q1Var.n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        e81Var3.M = view.getY() + e81Var3.M;
                        e81Var3.N = view.getY() + e81Var3.N;
                    }
                    int width = e81Var3.L.getWidth();
                    int height = e81Var3.L.getHeight();
                    e81Var3.L.getHeight();
                    b81Var = b81Var5;
                    c81 c81Var = new c81(e81Var3, e81Var3.getContext(), org.telegram.messenger.m10.t0, e81Var3.L.getResourcesProvider(), i19, width, height);
                    e81Var3.J = c81Var;
                    e81Var3.L.s0(c81Var);
                    e81Var3.J.t0(e81Var3.L);
                    e81Var3.J.setDelegate(new d81(e81Var3));
                    c81 c81Var2 = e81Var3.J;
                    org.telegram.messenger.gj gjVar4 = e81Var3.H;
                    org.telegram.messenger.bj currentMessagesGroup = e81Var3.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = e81Var3.L;
                    c81Var2.x3(gjVar4, currentMessagesGroup, q1Var3.G, q1Var3.F, q1Var3.H, false);
                    b81Var.addView(e81Var3.J, new FrameLayout.LayoutParams(e81Var3.L.getWidth(), height, 51));
                    wr0 wr0Var = new wr0(e81Var3.getContext(), org.telegram.messenger.m10.t0, e81Var3.L.getResourcesProvider(), width, height, 1);
                    e81Var3.K = wr0Var;
                    e81Var3.L.u0(wr0Var);
                    e81Var3.L.s0(e81Var3.K);
                    e81Var3.K.t0(e81Var3.L);
                    e81Var3.K.setDelegate(new qb.a(20));
                    wr0 wr0Var2 = e81Var3.K;
                    org.telegram.messenger.gj gjVar5 = e81Var3.H;
                    org.telegram.messenger.bj currentMessagesGroup2 = e81Var3.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var4 = e81Var3.L;
                    wr0Var2.x3(gjVar5, currentMessagesGroup2, q1Var4.G, q1Var4.F, q1Var4.H, false);
                    b81Var.addView(e81Var3.K, new FrameLayout.LayoutParams(e81Var3.L.getWidth(), height, 51));
                } else {
                    b81Var = b81Var5;
                }
                hi.i1 i1Var = e81Var3.e;
                i1Var.bringToFront();
                b81 b81Var6 = e81Var3.d;
                b81Var6.bringToFront();
                e81Var3.h.bringToFront();
                i1Var.t(false);
                org.telegram.ui.ActionBar.e6 e6Var = e81Var3.a;
                org.telegram.ui.Components.m60 F = org.telegram.ui.Components.m60.F(b81Var, e6Var, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) org.telegram.messenger.gj.m1(e81Var3.H);
                int i20 = 0;
                while (true) {
                    if (i20 >= tL_messageMediaToDo.todo.list.size()) {
                        todoItem2 = null;
                        i7 = -1;
                        break;
                    }
                    if (tL_messageMediaToDo.todo.list.get(i20).id == i19) {
                        todoItem2 = tL_messageMediaToDo.todo.list.get(i20);
                        i7 = i20;
                        break;
                    }
                    i20++;
                }
                int i21 = 0;
                while (true) {
                    if (i21 >= tL_messageMediaToDo.completions.size()) {
                        todoCompletion = null;
                        break;
                    }
                    if (tL_messageMediaToDo.completions.get(i21).id == i19) {
                        todoCompletion = tL_messageMediaToDo.completions.get(i21);
                        break;
                    }
                    i21++;
                }
                if (!e81Var3.H.q()) {
                    b81Var2 = b81Var;
                    gjVar = primaryMessageObject;
                    str = null;
                    z10 = false;
                } else if (todoCompletion != null) {
                    long j3 = todoCompletion.date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        b81Var2 = b81Var;
                    } catch (Exception e10) {
                        e = e10;
                        b81Var2 = b81Var;
                    }
                    try {
                        i16 = calendar.get(6);
                        i17 = calendar.get(1);
                        calendar.setTimeInMillis(j3);
                        i18 = calendar.get(6);
                        gjVar = primaryMessageObject;
                    } catch (Exception e11) {
                        e = e11;
                        gjVar = primaryMessageObject;
                        i13 = 1;
                        org.telegram.messenger.a8.g(e, true);
                        str3 = "LOC_ERR";
                        i14 = 14;
                        i15 = -1;
                        F.p(i14, i15, str3);
                        F.k();
                        str = null;
                        z10 = false;
                        F.c(R.drawable.msg_cancel, org.telegram.messenger.hd.M0(2131744052, null), new Runnable() { // from class: org.telegram.ui.y71
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i22 = i13;
                                int i23 = i19;
                                an anVar3 = anVar2;
                                e81 e81Var4 = e81Var3;
                                switch (i22) {
                                    case 0:
                                        nr0 nr0Var = new nr0(anVar3);
                                        nr0Var.u0(org.telegram.messenger.gj.m1(e81Var4.H), false, i23);
                                        nr0Var.f0 = new xi0(23, e81Var4, anVar3);
                                        anVar3.presentFragment(nr0Var);
                                        e81Var4.c(false);
                                        break;
                                    case 1:
                                        if (anVar3.c()) {
                                            Toast.makeText(e81Var4.getContext(), org.telegram.messenger.hd.M0(2131748493, null), 1).show();
                                        } else {
                                            c81 c81Var3 = e81Var4.J;
                                            c81Var3.N3(c81Var3.c2(i23), false);
                                        }
                                        e81Var4.c(true);
                                        break;
                                    default:
                                        if (anVar3.c()) {
                                            Toast.makeText(e81Var4.getContext(), org.telegram.messenger.hd.M0(2131748493, null), 1).show();
                                        } else {
                                            c81 c81Var4 = e81Var4.J;
                                            c81Var4.N3(c81Var4.c2(i23), false);
                                        }
                                        e81Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        int i22 = 5;
                        final ?? r92 = z10;
                        if (todoItem2 != null) {
                        }
                        if (e81Var3.H.u(anVar2.e)) {
                        }
                        b81Var3 = b81Var2;
                        i10 = 51;
                        F.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                        gh.e k10 = c8.g0.k(e6Var);
                        dh.c cVar2 = e81Var3.G;
                        F.Q(cVar2, k10, r92);
                        F.Y();
                        ViewGroup viewGroup2 = F.A;
                        e81Var3.R = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        e81Var3.R.setPivotY(0.0f);
                        b81Var6.addView(e81Var3.R, c8.ja.e(-2, -2, i10));
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        anVar2.G8(gjVar, arrayList3, arrayList4, arrayList5);
                        ke keVar2 = new ke(anVar2, 10);
                        gjVar2 = e81Var3.H;
                        ArrayList arrayList6 = anVar2.getMediaDataController().n;
                        if (anVar2.z()) {
                        }
                        if (gjVar2.k3()) {
                        }
                        if (!z11) {
                        }
                        if (anVar2.e == null) {
                        }
                        z12 = z11;
                        z13 = r14;
                        if (!z12) {
                        }
                        z14 = false;
                        TLRPC.User user3 = anVar2.f;
                        if (user3 == null) {
                        }
                        org.telegram.ui.ActionBar.e6 resourceProvider = anVar2.getResourceProvider();
                        if (z12) {
                        }
                        z15 = z14;
                        z16 = true;
                        org.telegram.ui.Components.m60 G = org.telegram.ui.Components.m60.G(b81Var3, resourceProvider, null, z16);
                        if (z13) {
                        }
                        size = arrayList3.size();
                        while (i12 < size) {
                        }
                        m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                        m60Var.Q(cVar, c8.g0.k(e6Var), false);
                        m60Var.Y();
                        ViewGroup viewGroup3 = m60Var.A;
                        e81Var.T = viewGroup3;
                        viewGroup3.setPivotX(0.0f);
                        e81Var.T.setPivotY(0.0f);
                        ViewGroup viewGroup4 = b81Var4;
                        viewGroup4.addView(e81Var.T, c8.ja.e(i11, i11, 51));
                        viewGroup = e81Var.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z17) {
                        }
                        e81Var2.e();
                        e81Var2.d0 = new tl(this, 5);
                        e81Var2.show();
                        return z18;
                    }
                    try {
                        int i23 = calendar.get(1);
                        str3 = (i18 == i16 && i17 == i23) ? org.telegram.messenger.hd.a0(null, null, 2131744081, org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : (i18 + 1 == i16 && i17 == i23) ? org.telegram.messenger.hd.a0(null, null, 2131744080, org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : Math.abs(System.currentTimeMillis() - j3) < 31536000000L ? org.telegram.messenger.hd.a0(null, null, 2131744082, org.telegram.messenger.hd.E0().q0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : org.telegram.messenger.hd.a0(null, null, 2131744082, org.telegram.messenger.hd.E0().C0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3)));
                        i14 = 14;
                        i15 = -1;
                        i13 = 1;
                    } catch (Exception e12) {
                        e = e12;
                        i13 = 1;
                        org.telegram.messenger.a8.g(e, true);
                        str3 = "LOC_ERR";
                        i14 = 14;
                        i15 = -1;
                        F.p(i14, i15, str3);
                        F.k();
                        str = null;
                        z10 = false;
                        F.c(R.drawable.msg_cancel, org.telegram.messenger.hd.M0(2131744052, null), new Runnable() { // from class: org.telegram.ui.y71
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i222 = i13;
                                int i232 = i19;
                                an anVar3 = anVar2;
                                e81 e81Var4 = e81Var3;
                                switch (i222) {
                                    case 0:
                                        nr0 nr0Var = new nr0(anVar3);
                                        nr0Var.u0(org.telegram.messenger.gj.m1(e81Var4.H), false, i232);
                                        nr0Var.f0 = new xi0(23, e81Var4, anVar3);
                                        anVar3.presentFragment(nr0Var);
                                        e81Var4.c(false);
                                        break;
                                    case 1:
                                        if (anVar3.c()) {
                                            Toast.makeText(e81Var4.getContext(), org.telegram.messenger.hd.M0(2131748493, null), 1).show();
                                        } else {
                                            c81 c81Var3 = e81Var4.J;
                                            c81Var3.N3(c81Var3.c2(i232), false);
                                        }
                                        e81Var4.c(true);
                                        break;
                                    default:
                                        if (anVar3.c()) {
                                            Toast.makeText(e81Var4.getContext(), org.telegram.messenger.hd.M0(2131748493, null), 1).show();
                                        } else {
                                            c81 c81Var4 = e81Var4.J;
                                            c81Var4.N3(c81Var4.c2(i232), false);
                                        }
                                        e81Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        int i222 = 5;
                        final ?? r922 = z10;
                        if (todoItem2 != null) {
                        }
                        if (e81Var3.H.u(anVar2.e)) {
                        }
                        b81Var3 = b81Var2;
                        i10 = 51;
                        F.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                        gh.e k102 = c8.g0.k(e6Var);
                        dh.c cVar22 = e81Var3.G;
                        F.Q(cVar22, k102, r922);
                        F.Y();
                        ViewGroup viewGroup22 = F.A;
                        e81Var3.R = viewGroup22;
                        viewGroup22.setPivotX(0.0f);
                        e81Var3.R.setPivotY(0.0f);
                        b81Var6.addView(e81Var3.R, c8.ja.e(-2, -2, i10));
                        ArrayList arrayList32 = new ArrayList();
                        ArrayList arrayList42 = new ArrayList();
                        ArrayList arrayList52 = new ArrayList();
                        anVar2.G8(gjVar, arrayList32, arrayList42, arrayList52);
                        ke keVar22 = new ke(anVar2, 10);
                        gjVar2 = e81Var3.H;
                        ArrayList arrayList62 = anVar2.getMediaDataController().n;
                        if (anVar2.z()) {
                        }
                        if (gjVar2.k3()) {
                        }
                        if (!z11) {
                        }
                        if (anVar2.e == null) {
                        }
                        z12 = z11;
                        z13 = r14;
                        if (!z12) {
                        }
                        z14 = false;
                        TLRPC.User user32 = anVar2.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.ActionBar.e6 resourceProvider2 = anVar2.getResourceProvider();
                        if (z12) {
                        }
                        z15 = z14;
                        z16 = true;
                        org.telegram.ui.Components.m60 G2 = org.telegram.ui.Components.m60.G(b81Var3, resourceProvider2, null, z16);
                        if (z13) {
                        }
                        size = arrayList32.size();
                        while (i12 < size) {
                        }
                        m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                        m60Var.Q(cVar, c8.g0.k(e6Var), false);
                        m60Var.Y();
                        ViewGroup viewGroup32 = m60Var.A;
                        e81Var.T = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        e81Var.T.setPivotY(0.0f);
                        ViewGroup viewGroup42 = b81Var4;
                        viewGroup42.addView(e81Var.T, c8.ja.e(i11, i11, 51));
                        viewGroup = e81Var.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z17) {
                        }
                        e81Var2.e();
                        e81Var2.d0 = new tl(this, 5);
                        e81Var2.show();
                        return z18;
                    }
                    F.p(i14, i15, str3);
                    F.k();
                    str = null;
                    z10 = false;
                    F.c(R.drawable.msg_cancel, org.telegram.messenger.hd.M0(2131744052, null), new Runnable() { // from class: org.telegram.ui.y71
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2222 = i13;
                            int i232 = i19;
                            an anVar3 = anVar2;
                            e81 e81Var4 = e81Var3;
                            switch (i2222) {
                                case 0:
                                    nr0 nr0Var = new nr0(anVar3);
                                    nr0Var.u0(org.telegram.messenger.gj.m1(e81Var4.H), false, i232);
                                    nr0Var.f0 = new xi0(23, e81Var4, anVar3);
                                    anVar3.presentFragment(nr0Var);
                                    e81Var4.c(false);
                                    break;
                                case 1:
                                    if (anVar3.c()) {
                                        Toast.makeText(e81Var4.getContext(), org.telegram.messenger.hd.M0(2131748493, null), 1).show();
                                    } else {
                                        c81 c81Var3 = e81Var4.J;
                                        c81Var3.N3(c81Var3.c2(i232), false);
                                    }
                                    e81Var4.c(true);
                                    break;
                                default:
                                    if (anVar3.c()) {
                                        Toast.makeText(e81Var4.getContext(), org.telegram.messenger.hd.M0(2131748493, null), 1).show();
                                    } else {
                                        c81 c81Var4 = e81Var4.J;
                                        c81Var4.N3(c81Var4.c2(i232), false);
                                    }
                                    e81Var4.c(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    b81Var2 = b81Var;
                    gjVar = primaryMessageObject;
                    str = null;
                    z10 = false;
                    final int i24 = 2;
                    F.c(R.drawable.msg_select, org.telegram.messenger.hd.M0(2131744089, null), new Runnable() { // from class: org.telegram.ui.y71
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2222 = i24;
                            int i232 = i19;
                            an anVar3 = anVar2;
                            e81 e81Var4 = e81Var3;
                            switch (i2222) {
                                case 0:
                                    nr0 nr0Var = new nr0(anVar3);
                                    nr0Var.u0(org.telegram.messenger.gj.m1(e81Var4.H), false, i232);
                                    nr0Var.f0 = new xi0(23, e81Var4, anVar3);
                                    anVar3.presentFragment(nr0Var);
                                    e81Var4.c(false);
                                    break;
                                case 1:
                                    if (anVar3.c()) {
                                        Toast.makeText(e81Var4.getContext(), org.telegram.messenger.hd.M0(2131748493, null), 1).show();
                                    } else {
                                        c81 c81Var3 = e81Var4.J;
                                        c81Var3.N3(c81Var3.c2(i232), false);
                                    }
                                    e81Var4.c(true);
                                    break;
                                default:
                                    if (anVar3.c()) {
                                        Toast.makeText(e81Var4.getContext(), org.telegram.messenger.hd.M0(2131748493, null), 1).show();
                                    } else {
                                        c81 c81Var4 = e81Var4.J;
                                        c81Var4.N3(c81Var4.c2(i232), false);
                                    }
                                    e81Var4.c(true);
                                    break;
                            }
                        }
                    }, false);
                }
                int i2222 = 5;
                final ?? r9222 = z10;
                if (todoItem2 != null) {
                    F.c(R.drawable.menu_reply, org.telegram.messenger.hd.M0(2131744073, str), new q21(e81Var3, anVar2, todoItem2, i2222), z10);
                    if (org.telegram.messenger.gj.B0(e81Var3.H.k) < 0) {
                        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(e81Var3.H.K1);
                        String r10 = org.telegram.messenger.m5.r(s12.e2(org.telegram.messenger.gj.B0(e81Var3.H.k)));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(s12.V2);
                        sb2.append("/");
                        if (TextUtils.isEmpty(r10)) {
                            r10 = "c/" + (-org.telegram.messenger.gj.B0(e81Var3.H.k));
                        }
                        sb2.append(r10);
                        sb2.append("/");
                        sb2.append(e81Var3.H.e1());
                        sb2.append("?task=");
                        sb2.append(todoItem2.id);
                        String sb3 = sb2.toString();
                        str2 = null;
                        z19 = false;
                        F.c(R.drawable.msg_link, org.telegram.messenger.hd.M0(2131751762, null), new fy0(14, e81Var3, sb3), false);
                    } else {
                        str2 = null;
                        z19 = false;
                    }
                    F.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, str2), new fy0(15, e81Var3, todoItem2), z19);
                    r9222 = z19;
                }
                if (e81Var3.H.u(anVar2.e)) {
                    F.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131744076, null), new Runnable() { // from class: org.telegram.ui.y71
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22222 = r9222;
                            int i232 = i7;
                            an anVar3 = anVar2;
                            e81 e81Var4 = e81Var3;
                            switch (i22222) {
                                case 0:
                                    nr0 nr0Var = new nr0(anVar3);
                                    nr0Var.u0(org.telegram.messenger.gj.m1(e81Var4.H), false, i232);
                                    nr0Var.f0 = new xi0(23, e81Var4, anVar3);
                                    anVar3.presentFragment(nr0Var);
                                    e81Var4.c(false);
                                    break;
                                case 1:
                                    if (anVar3.c()) {
                                        Toast.makeText(e81Var4.getContext(), org.telegram.messenger.hd.M0(2131748493, null), 1).show();
                                    } else {
                                        c81 c81Var3 = e81Var4.J;
                                        c81Var3.N3(c81Var3.c2(i232), false);
                                    }
                                    e81Var4.c(true);
                                    break;
                                default:
                                    if (anVar3.c()) {
                                        Toast.makeText(e81Var4.getContext(), org.telegram.messenger.hd.M0(2131748493, null), 1).show();
                                    } else {
                                        c81 c81Var4 = e81Var4.J;
                                        c81Var4.N3(c81Var4.c2(i232), false);
                                    }
                                    e81Var4.c(true);
                                    break;
                            }
                        }
                    }, r9222);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        b81Var3 = b81Var2;
                        i10 = 51;
                        F.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131744077, null), new org.telegram.ui.Components.sp0(e81Var3, tL_messageMediaToDo, i19, anVar2, 16), r9222);
                        F.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                        gh.e k1022 = c8.g0.k(e6Var);
                        dh.c cVar222 = e81Var3.G;
                        F.Q(cVar222, k1022, r9222);
                        F.Y();
                        ViewGroup viewGroup222 = F.A;
                        e81Var3.R = viewGroup222;
                        viewGroup222.setPivotX(0.0f);
                        e81Var3.R.setPivotY(0.0f);
                        b81Var6.addView(e81Var3.R, c8.ja.e(-2, -2, i10));
                        ArrayList arrayList322 = new ArrayList();
                        ArrayList arrayList422 = new ArrayList();
                        ArrayList arrayList522 = new ArrayList();
                        anVar2.G8(gjVar, arrayList322, arrayList422, arrayList522);
                        ke keVar222 = new ke(anVar2, 10);
                        gjVar2 = e81Var3.H;
                        ArrayList arrayList622 = anVar2.getMediaDataController().n;
                        z11 = anVar2.z() && !anVar2.c() && anVar2.f == null && gjVar2.w2() && !((org.telegram.messenger.t3.T(anVar2.e) && !anVar2.e.megagroup) || org.telegram.messenger.t3.p0(anVar2.e) || arrayList622.isEmpty() || !gjVar2.k.reactions.can_see_list || gjVar2.l4());
                        boolean z20 = gjVar2.k3() ? !(gjVar2.l4() || anVar2.g4 == 5 || anVar2.z() || anVar2.c() || !gjVar2.d4() || ((((chatFull = anVar2.q8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.t3.T(anVar2.e)) && anVar2.f == null && !org.telegram.messenger.t3.p0(anVar2.e))) || arrayList622.isEmpty())) : !((N0 = anVar2.getMessagesController().N0(-gjVar2.Z0())) != null && (anVar2.z() || anVar2.g4 == 5 || anVar2.c() || !gjVar2.d4() || (((N0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !N0.paid_reactions_available) || arrayList622.isEmpty())));
                        boolean z21 = (!z11 || anVar2.c() || anVar2.e == null || !gjVar2.P3() || !gjVar2.q4() || gjVar2.Y2() || gjVar2.o4() || gjVar2.n4() || gjVar2.k.media_unread || gjVar2.F4() || ConnectionsManager.getInstance(anVar2.getCurrentAccount()).getCurrentTime() - gjVar2.k.date >= anVar2.getMessagesController().r3 || (!org.telegram.messenger.t3.n0(anVar2.e) && org.telegram.messenger.t3.T(anVar2.e)) || (chatFull2 = anVar2.q8) == null || chatFull2.participants_count > anVar2.getMessagesController().q3 || (gjVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || anVar2.g4 == 3 || !gjVar2.z() || org.telegram.messenger.t3.p0(anVar2.e)) ? false : true;
                        if (anVar2.e == null && !gjVar2.N3() && org.telegram.messenger.t3.p0(anVar2.e)) {
                            z12 = z11;
                            if (org.telegram.messenger.t3.A(anVar2.getCurrentAccount(), anVar2.e, 24)) {
                                z13 = z21;
                                int i25 = ((-anVar2.e.linked_monoforum_id) > gjVar2.Z0() ? 1 : ((-anVar2.e.linked_monoforum_id) == gjVar2.Z0() ? 0 : -1));
                                if (!z12 && anVar2.e == null && anVar2.h == null && (user = anVar2.f) != null && !org.telegram.messenger.q10.B(user) && !org.telegram.messenger.q10.z(anVar2.f) && !org.telegram.messenger.q10.s(anVar2.f)) {
                                    user2 = anVar2.f;
                                    if (!user2.bot && !org.telegram.messenger.q10.A(user2.id) && (((userFull = anVar2.r8) == null || !userFull.read_dates_private) && !anVar2.c() && gjVar2.P3() && gjVar2.q4() && !gjVar2.Y2() && !gjVar2.o4() && !gjVar2.n4() && !gjVar2.k.media_unread && !gjVar2.F4() && anVar2.getConnectionsManager().getCurrentTime() - gjVar2.k.date < anVar2.getMessagesController().s3 && !(gjVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                        z14 = true;
                                        TLRPC.User user322 = anVar2.f;
                                        boolean z22 = ((user322 == null && (org.telegram.messenger.q10.z(user322) || org.telegram.messenger.q10.s(anVar2.f))) || anVar2.c() || !gjVar2.X2() || (gjVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                        org.telegram.ui.ActionBar.e6 resourceProvider22 = anVar2.getResourceProvider();
                                        if (!z12 || z13) {
                                            z15 = z14;
                                            z16 = true;
                                        } else {
                                            z15 = z14;
                                            z16 = false;
                                        }
                                        org.telegram.ui.Components.m60 G22 = org.telegram.ui.Components.m60.G(b81Var3, resourceProvider22, null, z16);
                                        if (z13) {
                                            jf0 jf0Var = new jf0(e81Var3.getContext(), anVar2.getCurrentAccount(), gjVar2, anVar2.e);
                                            FrameLayout frameLayout = new FrameLayout(e81Var3.getContext());
                                            frameLayout.addView(jf0Var, c8.ja.c(36.0f, -1));
                                            org.telegram.ui.Components.m60 J = G22.J();
                                            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, e81Var3.getContext(), e81Var3.a, true, false);
                                            z0Var.setItemHeight(44);
                                            z0Var.j(org.telegram.messenger.hd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                                            z0Var.getTextView().setPadding(org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                                            FrameLayout frameLayout2 = new FrameLayout(e81Var3.getContext());
                                            LinearLayout linearLayout = new LinearLayout(e81Var3.getContext());
                                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, linearLayout, e6Var);
                                            linearLayout.setOrientation(1);
                                            anVar = anVar2;
                                            org.telegram.ui.Components.uj0 a10 = jf0Var.a();
                                            frameLayout2.addView(z0Var);
                                            linearLayout.addView(frameLayout2);
                                            z17 = z20;
                                            linearLayout.addView(new org.telegram.ui.ActionBar.d1(e81Var3.getContext(), e6Var), c8.ja.o(-1, 8));
                                            frameLayout2.setOnClickListener(new rr0(G22, 1));
                                            arrayList2 = arrayList522;
                                            arrayList = arrayList422;
                                            gjVar3 = gjVar2;
                                            keVar = keVar222;
                                            cVar = cVar222;
                                            b81Var4 = b81Var6;
                                            i11 = -2;
                                            a81 a81Var = new a81(e81Var3, jf0Var, anVar, a10, linearLayout, G22, J);
                                            m60Var = G22;
                                            e81Var = e81Var3;
                                            jf0Var.setOnClickListener(a81Var);
                                            linearLayout.addView(a10, c8.ja.o(-1, -2));
                                            J.q(linearLayout);
                                            m60Var.q(frameLayout);
                                            m60Var.k();
                                        } else {
                                            gjVar3 = gjVar2;
                                            arrayList = arrayList422;
                                            anVar = anVar2;
                                            arrayList2 = arrayList522;
                                            m60Var = G22;
                                            keVar = keVar222;
                                            z17 = z20;
                                            b81Var4 = b81Var6;
                                            cVar = cVar222;
                                            i11 = -2;
                                            e81Var = e81Var3;
                                            if (z15) {
                                                m60Var.r(new org.telegram.ui.Components.oa0(e81Var.getContext(), 0, gjVar3, new x71(e81Var, 0), e81Var.a), c8.ja.o(-1, 36));
                                                m60Var.k();
                                            } else if (z22) {
                                                m60Var.r(new org.telegram.ui.Components.oa0(e81Var.getContext(), 1, gjVar3, new x71(e81Var, 2), e81Var.a), c8.ja.o(-1, 36));
                                                m60Var.k();
                                            }
                                        }
                                        size = arrayList322.size();
                                        for (i12 = 0; i12 < size; i12++) {
                                            m60Var.c(((Integer) arrayList322.get(i12)).intValue(), (CharSequence) arrayList.get(i12), new org.telegram.ui.Components.u11(e81Var, keVar, ((Integer) arrayList2.get(i12)).intValue(), 15), false);
                                        }
                                        m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                                        m60Var.Q(cVar, c8.g0.k(e6Var), false);
                                        m60Var.Y();
                                        ViewGroup viewGroup322 = m60Var.A;
                                        e81Var.T = viewGroup322;
                                        viewGroup322.setPivotX(0.0f);
                                        e81Var.T.setPivotY(0.0f);
                                        ViewGroup viewGroup422 = b81Var4;
                                        viewGroup422.addView(e81Var.T, c8.ja.e(i11, i11, 51));
                                        viewGroup = e81Var.T;
                                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new ni0(e81Var, 20));
                                            e81Var.T.setOnTouchListener(new c0(e81Var, 7));
                                        }
                                        if (z17) {
                                            an anVar3 = anVar;
                                            org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0((anVar.getUserConfig().e() > anVar.a() ? 1 : (anVar.getUserConfig().e() == anVar.a() ? 0 : -1)) == 0 ? 3 : 0, anVar3.getCurrentAccount(), e81Var.getContext(), anVar3, e81Var.a);
                                            mi0Var.a = true;
                                            float f10 = 22;
                                            mi0Var.setPadding(org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 0 : 24), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 24 : 0), org.telegram.messenger.g0.L(f10));
                                            e81Var2 = e81Var;
                                            org.telegram.messenger.gj gjVar6 = gjVar3;
                                            mi0Var.setDelegate(new ab.c0(e81Var2, anVar3, gjVar6, mi0Var, false, 12));
                                            e81Var2.Q = mi0Var;
                                            viewGroup422.addView(mi0Var, c8.ja.e(i11, (int) ((mi0Var.getTopOffset() / org.telegram.messenger.g0.p) + 52.0f + f10), 51));
                                            z18 = true;
                                            mi0Var.p(gjVar6, anVar3.q8, true);
                                            e81Var2.Q.setTransitionProgress(1.0f);
                                        } else {
                                            e81Var2 = e81Var;
                                            z18 = true;
                                        }
                                        e81Var2.e();
                                        e81Var2.d0 = new tl(this, 5);
                                        e81Var2.show();
                                        return z18;
                                    }
                                }
                                z14 = false;
                                TLRPC.User user3222 = anVar2.f;
                                if (user3222 == null) {
                                }
                                org.telegram.ui.ActionBar.e6 resourceProvider222 = anVar2.getResourceProvider();
                                if (z12) {
                                }
                                z15 = z14;
                                z16 = true;
                                org.telegram.ui.Components.m60 G222 = org.telegram.ui.Components.m60.G(b81Var3, resourceProvider222, null, z16);
                                if (z13) {
                                }
                                size = arrayList322.size();
                                while (i12 < size) {
                                }
                                m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                                m60Var.Q(cVar, c8.g0.k(e6Var), false);
                                m60Var.Y();
                                ViewGroup viewGroup3222 = m60Var.A;
                                e81Var.T = viewGroup3222;
                                viewGroup3222.setPivotX(0.0f);
                                e81Var.T.setPivotY(0.0f);
                                ViewGroup viewGroup4222 = b81Var4;
                                viewGroup4222.addView(e81Var.T, c8.ja.e(i11, i11, 51));
                                viewGroup = e81Var.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z17) {
                                }
                                e81Var2.e();
                                e81Var2.d0 = new tl(this, 5);
                                e81Var2.show();
                                return z18;
                            }
                        } else {
                            z12 = z11;
                        }
                        z13 = z21;
                        if (!z12) {
                            user2 = anVar2.f;
                            if (!user2.bot) {
                                z14 = true;
                                TLRPC.User user32222 = anVar2.f;
                                if (user32222 == null) {
                                }
                                org.telegram.ui.ActionBar.e6 resourceProvider2222 = anVar2.getResourceProvider();
                                if (z12) {
                                }
                                z15 = z14;
                                z16 = true;
                                org.telegram.ui.Components.m60 G2222 = org.telegram.ui.Components.m60.G(b81Var3, resourceProvider2222, null, z16);
                                if (z13) {
                                }
                                size = arrayList322.size();
                                while (i12 < size) {
                                }
                                m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                                m60Var.Q(cVar, c8.g0.k(e6Var), false);
                                m60Var.Y();
                                ViewGroup viewGroup32222 = m60Var.A;
                                e81Var.T = viewGroup32222;
                                viewGroup32222.setPivotX(0.0f);
                                e81Var.T.setPivotY(0.0f);
                                ViewGroup viewGroup42222 = b81Var4;
                                viewGroup42222.addView(e81Var.T, c8.ja.e(i11, i11, 51));
                                viewGroup = e81Var.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z17) {
                                }
                                e81Var2.e();
                                e81Var2.d0 = new tl(this, 5);
                                e81Var2.show();
                                return z18;
                            }
                        }
                        z14 = false;
                        TLRPC.User user322222 = anVar2.f;
                        if (user322222 == null) {
                        }
                        org.telegram.ui.ActionBar.e6 resourceProvider22222 = anVar2.getResourceProvider();
                        if (z12) {
                        }
                        z15 = z14;
                        z16 = true;
                        org.telegram.ui.Components.m60 G22222 = org.telegram.ui.Components.m60.G(b81Var3, resourceProvider22222, null, z16);
                        if (z13) {
                        }
                        size = arrayList322.size();
                        while (i12 < size) {
                        }
                        m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                        m60Var.Q(cVar, c8.g0.k(e6Var), false);
                        m60Var.Y();
                        ViewGroup viewGroup322222 = m60Var.A;
                        e81Var.T = viewGroup322222;
                        viewGroup322222.setPivotX(0.0f);
                        e81Var.T.setPivotY(0.0f);
                        ViewGroup viewGroup422222 = b81Var4;
                        viewGroup422222.addView(e81Var.T, c8.ja.e(i11, i11, 51));
                        viewGroup = e81Var.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z17) {
                        }
                        e81Var2.e();
                        e81Var2.d0 = new tl(this, 5);
                        e81Var2.show();
                        return z18;
                    }
                }
                b81Var3 = b81Var2;
                i10 = 51;
                F.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                gh.e k10222 = c8.g0.k(e6Var);
                dh.c cVar2222 = e81Var3.G;
                F.Q(cVar2222, k10222, r9222);
                F.Y();
                ViewGroup viewGroup2222 = F.A;
                e81Var3.R = viewGroup2222;
                viewGroup2222.setPivotX(0.0f);
                e81Var3.R.setPivotY(0.0f);
                b81Var6.addView(e81Var3.R, c8.ja.e(-2, -2, i10));
                ArrayList arrayList3222 = new ArrayList();
                ArrayList arrayList4222 = new ArrayList();
                ArrayList arrayList5222 = new ArrayList();
                anVar2.G8(gjVar, arrayList3222, arrayList4222, arrayList5222);
                ke keVar2222 = new ke(anVar2, 10);
                gjVar2 = e81Var3.H;
                ArrayList arrayList6222 = anVar2.getMediaDataController().n;
                if (anVar2.z()) {
                }
                if (gjVar2.k3()) {
                }
                if (!z11) {
                }
                if (anVar2.e == null) {
                }
                z12 = z11;
                z13 = z21;
                if (!z12) {
                }
                z14 = false;
                TLRPC.User user3222222 = anVar2.f;
                if (user3222222 == null) {
                }
                org.telegram.ui.ActionBar.e6 resourceProvider222222 = anVar2.getResourceProvider();
                if (z12) {
                }
                z15 = z14;
                z16 = true;
                org.telegram.ui.Components.m60 G222222 = org.telegram.ui.Components.m60.G(b81Var3, resourceProvider222222, null, z16);
                if (z13) {
                }
                size = arrayList3222.size();
                while (i12 < size) {
                }
                m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var)));
                m60Var.Q(cVar, c8.g0.k(e6Var), false);
                m60Var.Y();
                ViewGroup viewGroup3222222 = m60Var.A;
                e81Var.T = viewGroup3222222;
                viewGroup3222222.setPivotX(0.0f);
                e81Var.T.setPivotY(0.0f);
                ViewGroup viewGroup4222222 = b81Var4;
                viewGroup4222222.addView(e81Var.T, c8.ja.e(i11, i11, 51));
                viewGroup = e81Var.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z17) {
                }
                e81Var2.e();
                e81Var2.d0 = new tl(this, 5);
                e81Var2.show();
                return z18;
            }
        }
        return false;
    }

    public final void i(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, boolean z10) {
        an anVar = this.a;
        TLRPC.Chat chat2 = anVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            ui uiVar = anVar.p1;
            if (uiVar != null && i7 == 0) {
                uiVar.e(false, false);
                return;
            } else {
                if (q1Var.getMessageObject() != null) {
                    anVar.l(i7, q1Var.getMessageObject().e1(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || anVar.fa()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            hi hiVar = null;
            if (z10) {
                vf.b bVar = anVar.dc;
                if (bVar != null) {
                    bVar.a(true);
                    anVar.dc = null;
                }
                if (q1Var == null || q1Var.getMessageObject() == null) {
                    anVar.dc = null;
                } else {
                    hi hiVar2 = new hi(anVar, q1Var.getMessageObject().e1(), q1Var, 0);
                    anVar.dc = hiVar2;
                    hiVar = hiVar2;
                }
            }
            if (anVar.getMessagesController().E(bundle, anVar, q1Var.getMessageObject(), hiVar)) {
                hi hiVar3 = hiVar;
                an anVar2 = new an(bundle);
                if (hiVar3 == null || i7 == 0) {
                    anVar.presentFragment(anVar2);
                } else {
                    org.telegram.messenger.g0.i3(new ai.f1(this, hiVar3, chat, i7, anVar2, 13), 5000L);
                    hiVar3.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final int i0(org.telegram.ui.Cells.q1 q1Var) {
        sh.b bVar;
        an anVar = this.a;
        if (!anVar.dd.f || (bVar = anVar.jd) == null || bVar.n != q1Var || bVar.a.getWidth() <= 0) {
            return 0;
        }
        return anVar.jd.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i1() {
        an anVar = this.a;
        anVar.h8();
        UndoView undoView = anVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, anVar.k6, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a10 = sh.g.a(messageObject);
        boolean a11 = c8.zc.a(a10, 7);
        an anVar = this.a;
        if (a11) {
            org.telegram.ui.Components.cc.a0(anVar).Q(R.raw.e_hand_2, 36, sh.g.b(a10, messageObject)).j();
            return;
        }
        if (i7 < 0 && !arrayList.isEmpty()) {
            anVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
            q1Var.c0(true);
            return;
        }
        if (anVar.getParentActivity() == null) {
            return;
        }
        if (anVar.C2 == null) {
            int indexOfChild = anVar.m1.indexOfChild(anVar.U);
            if (indexOfChild == -1) {
                return;
            }
            hi.l3 E6 = anVar.E6(250.0f, 3, indexOfChild + 1, false);
            anVar.C2 = E6;
            E6.v0 = 0.0f;
        }
        if (arrayList.isEmpty() && i7 < 0) {
            ArrayList<org.telegram.ui.Cells.p1> pollButtons = q1Var.getPollButtons();
            int size = pollButtons.size();
            int i12 = 0;
            float f10 = 0.0f;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                org.telegram.ui.Cells.p1 p1Var = pollButtons.get(i12);
                float y10 = ((q1Var.getY() + p1Var.b) - org.telegram.messenger.g0.L(4.0f)) - anVar.O9;
                anVar.F2 = org.telegram.messenger.g0.L(13.3f) + p1Var.a;
                int D = org.telegram.messenger.i20.D(6.0f, p1Var.b, i11);
                anVar.G2 = D;
                if (y10 > 0.0f) {
                    i10 = anVar.F2;
                    i11 = D;
                    f10 = 0.0f;
                    break;
                }
                i12++;
                f10 = y10;
            }
            if (f10 != 0.0f) {
                anVar.A0.w0(0, (int) f10, null);
                anVar.E2 = q1Var;
                return;
            }
        }
        an.q2(anVar, q1Var, i7, i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j0(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        an anVar = this.a;
        if (anVar.getParentActivity() == null) {
            return;
        }
        if (anVar.ta == null) {
            wh.i iVar = new wh.i(anVar.getParentActivity());
            anVar.ta = iVar;
            anVar.m1.addView(iVar, c8.ja.e(-1, -1, 48));
        }
        wh.i iVar2 = anVar.ta;
        HashMap hashMap = iVar2.a;
        ArrayList arrayList = iVar2.c;
        arrayList.clear();
        int i7 = iVar2.d;
        org.telegram.messenger.m10 i10 = org.telegram.messenger.m10.i(i7);
        long j3 = i10.n;
        arrayList.add(Long.valueOf(j3));
        if (i10.W) {
            ArrayList arrayList2 = org.telegram.messenger.si.b0(i7).j1;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                long j10 = tL_topPeer.peer.user_id;
                if (j10 != 0) {
                    int i12 = size;
                    if (org.telegram.messenger.np.s1(i7).a2(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j10));
                    }
                    size = i12;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = org.telegram.messenger.np.s1(i7).y;
        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j11 = dialog.id;
                if (j11 != j3 && !org.telegram.messenger.m5.C(j11)) {
                    if (org.telegram.messenger.m5.E(dialog.id)) {
                        TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(dialog.id));
                        if (a22 != null && !org.telegram.messenger.q10.t(a22) && !org.telegram.messenger.q10.x(a22) && !org.telegram.messenger.q10.A(a22.id)) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-dialog.id));
                        if (M0 != null && !M0.forum && !org.telegram.messenger.t3.r0(M0) && ((!M0.gigagroup || org.telegram.messenger.t3.N(M0)) && (!org.telegram.messenger.t3.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList3);
        String b10 = wh.i.b(q1Var);
        if (b10 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            Long l10 = (Long) obj2;
            if (hashSet.add(l10) && org.telegram.messenger.m5.E(l10.longValue())) {
                arrayList5.add(l10);
            }
        }
        wh.h hVar = new wh.h(iVar2, q1Var, arrayList5, new ug.t1(12, iVar2, b10));
        hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
        hVar.setCallback(iVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.tgnet.TLRPC$ChatParticipant] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.lm] */
    @Override // org.telegram.ui.Cells.l1
    public final void j2(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull N0;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        an anVar = this.a;
        if (!org.telegram.messenger.g0.E1(anVar.getParentActivity()) || (chat = anVar.e) == null || currentUser == null || org.telegram.messenger.t3.V(chat)) {
            return;
        }
        org.telegram.messenger.np messagesController = anVar.getMessagesController();
        long j3 = anVar.e.id;
        long j10 = currentUser.id;
        a0.h hVar = (a0.h) messagesController.y1.f(j3);
        if (hVar == null && (N0 = messagesController.N0(j3)) != null && N0.participants != null) {
            for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                chatParticipant = N0.participants.participants.get(i7);
                if (chatParticipant.user_id == j10) {
                    break;
                }
            }
        }
        chatParticipant = (TLObject) hVar.f(j10);
        d(q1Var, chatParticipant);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.a.getParentActivity(), org.telegram.messenger.r2.g);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        an anVar = this.a;
        if (anVar.X9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (anVar.getParentActivity() != null) {
            if (anVar.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                qj qjVar = anVar.a0;
                org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                org.telegram.messenger.gj messageObject2 = q1Var.getMessageObject();
                gi giVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                vf.b bVar = anVar.dc;
                if (bVar != null) {
                    bVar.a(true);
                    anVar.dc = null;
                }
                if (str == null || q1Var.getMessageObject() == null) {
                    anVar.dc = null;
                } else {
                    gi giVar2 = new gi(anVar, q1Var.getMessageObject().e1(), str, q1Var, 1);
                    anVar.dc = giVar2;
                    giVar = giVar2;
                }
                qjVar.i0(keyboardButtonProto, messageObject, messageObject2, giVar);
            }
        }
    }

    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.e2 e2Var = this.a;
            if (e2Var.getMessagesController().E(bundle, e2Var, q1Var.getMessageObject(), null)) {
                e2Var.presentFragment(new an(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l0() {
        boolean z10;
        an anVar = this.a;
        if (anVar.Y9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
        Bundle j10 = a8.p0.j(j3, "user_id");
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        if (e2Var.getMessagesController().E(j10, e2Var, q1Var.getMessageObject(), null)) {
            e2Var.presentFragment(new an(j10));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10;
        TLRPC.Document document;
        int i11;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i12;
        TLRPC.Document document3;
        int i13;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(messageObject);
        if (messageMedia == null || messageObject == null || !(m12 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            Q1(q1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        an anVar = this.a;
        if (geoPoint != null) {
            if (org.telegram.messenger.g0.J1(anVar)) {
                im imVar = new im(3);
                e6Var2 = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                imVar.setResourceProvider(e6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = anVar.getMessagesController().z1(anVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                imVar.Q0 = false;
                imVar.G0(new org.telegram.messenger.gj(org.telegram.messenger.m10.t0, tL_message, false, false));
                anVar.presentFragment(imVar);
                return;
            }
            return;
        }
        if (org.telegram.messenger.gj.N2(messageMedia.document)) {
            ns.p().v(anVar.getParentActivity());
            ns.p().u(new jm(this, tL_messageMediaPoll, pollAnswer, q1Var));
            ns p10 = ns.p();
            TLRPC.Document document4 = messageMedia.document;
            int i17 = org.telegram.messenger.gj.H2(document4) ? 2 : 0;
            org.telegram.messenger.gj messageObject2 = q1Var.getMessageObject();
            e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
            p10.s(document4, null, "", null, null, i17, false, messageObject2, e6Var, org.telegram.messenger.ns.e3);
            return;
        }
        if (org.telegram.messenger.gj.J3(messageMedia.document)) {
            org.telegram.messenger.gj gjVar = MediaController.B().v0;
            if (MediaController.B().I(messageObject) && gjVar != null) {
                if (gjVar.m0 == (i7 == -3)) {
                    if (MediaController.B().H()) {
                        MediaController.B().S(gjVar);
                        return;
                    } else {
                        MediaController.B().R(gjVar, true);
                        return;
                    }
                }
            }
            TLRPC.Message message = messageObject.k;
            TLRPC.TL_message R7 = an.R7(message);
            R7.media = messageMedia;
            R7.attachPath = sh.d.c(i7, message);
            ArrayList arrayList = new ArrayList();
            i16 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i16, R7, false, true);
            gjVar2.m0 = i7 == -3;
            arrayList.add(gjVar2);
            if (MediaController.B().I(messageObject)) {
                MediaController.B().q(false, true, false, false);
            }
            MediaController.B().o0(arrayList, gjVar2, 0L, true, null, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !org.telegram.messenger.gj.K4(document5)) {
            i14 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            sh.a aVar = new sh.a(i14, messageObject, document6, sh.d.c(i7, messageObject.k));
            if (aVar.g) {
                org.telegram.messenger.w7.G(i14).f(document6);
                aVar.a();
                q1Var.b0();
                return;
            }
            if (!aVar.f) {
                org.telegram.messenger.w7.G(i14).W(document6, messageObject, 2, 0);
                aVar.a();
                q1Var.b0();
                return;
            }
            TLRPC.Message message2 = messageObject.k;
            TLRPC.TL_message R72 = an.R7(message2);
            R72.media = messageMedia;
            R72.attachPath = sh.d.c(i7, message2);
            i15 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            km kmVar = new km(i15, R72, false, true);
            if (org.telegram.messenger.gj.y(messageMedia.document)) {
                PhotoViewer.p1().I2(null, anVar, anVar.Aa);
                PhotoViewer p12 = PhotoViewer.p1();
                int i18 = kmVar.D;
                p12.e2(kmVar, anVar, i18 != 0 ? anVar.k6 : 0L, i18 != 0 ? anVar.c7 : 0L, i18 != 0 ? anVar.b() : 0L, anVar.cb);
                return;
            }
            try {
                org.telegram.messenger.g0.u2(kmVar, anVar.getParentActivity(), anVar.Aa, false);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                anVar.M6(kmVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.gj.K4(document3))) {
            i10 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message R73 = an.R7(message3);
            R73.media = messageMedia3;
            R73.attachPath = sh.d.c(-2, message3);
            i13 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            arrayList3.add(new bm(i13, R73, false, true));
            arrayList2.add(-2);
        } else {
            i10 = -1;
        }
        if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.gj.K4(document2))) {
            if (messageMedia2 == messageMedia) {
                i10 = arrayList3.size();
            }
            TLRPC.TL_message R74 = an.R7(message3);
            R74.media = messageMedia2;
            R74.attachPath = sh.d.c(-3, message3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            R74.message = pollResults2.solution;
            R74.entities = pollResults2.solution_entities;
            i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            arrayList3.add(new cm(i12, R74, false, true));
            arrayList2.add(-3);
        }
        cg.d.b(tL_messageMediaPoll.poll, anVar.getUserConfig().e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        for (int i19 = 0; i19 < arrayList4.size(); i19++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.gj.K4(document))) {
                if (pollAnswer2.unshuffled_index == i7) {
                    i10 = arrayList3.size();
                }
                TLRPC.TL_message R75 = an.R7(message3);
                R75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                R75.message = tL_textWithEntities2.text;
                R75.entities = tL_textWithEntities2.entities;
                R75.attachPath = sh.d.c(pollAnswer2.unshuffled_index, message3);
                i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                arrayList3.add(new dm(i11, R75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i10 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.s0 = arrayList2;
        PhotoViewer.p1().I2(null, anVar, anVar.Aa);
        PhotoViewer.p1().a2(arrayList3, i10, anVar.a(), 0L, 0L, anVar.db);
    }

    public final void n(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n0(String str) {
        an anVar = this.a;
        uj ujVar = anVar.d1;
        if (ujVar == null || ujVar.getVisibility() != 0) {
            tj tjVar = anVar.T;
            if ((tjVar == null || tjVar.getVisibility() != 0) && anVar.a0 != null && str != null && str.length() > 0) {
                anVar.a0.setFieldText("@" + str + " ");
                anVar.a0.W0();
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o(org.telegram.ui.Cells.q1 q1Var) {
        float L;
        if (q1Var.getMessageObject().y3()) {
            i1();
            return;
        }
        an anVar = this.a;
        if (anVar.A3 || anVar.A0 == null || anVar.getParentActivity() == null || anVar.fragmentView == null) {
            return;
        }
        if (anVar.J2 == null) {
            int indexOfChild = anVar.m1.indexOfChild(anVar.U);
            if (indexOfChild == -1) {
                return;
            }
            hi.l3 E6 = anVar.E6(250.0f, 3, indexOfChild + 1, false);
            anVar.J2 = E6;
            E6.u(org.telegram.messenger.hd.M0(2131749329, null));
        }
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        TLRPC.User currentUser = q1Var.getCurrentUser();
        if (currentUser == null || currentUser.id != 0) {
            float L2 = org.telegram.messenger.g0.L(22.0f);
            L = (messageObject.P3() || !q1Var.k9 || q1Var.V8 == null) ? L2 : org.telegram.messenger.g0.L(20.0f) + L2;
        } else {
            L = (q1Var.getMeasuredHeight() - Math.max(0, q1Var.getBottom() - ((View) q1Var.getParent()).getMeasuredHeight())) - org.telegram.messenger.g0.L(50.0f);
        }
        if (anVar.w9(q1Var, L) <= org.telegram.messenger.g0.L(80.0f)) {
            return;
        }
        anVar.J2.x(anVar.v9(q1Var, q1Var.getForwardNameCenterX()), anVar.w9(q1Var, L) - org.telegram.messenger.g0.L(4.0f), true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean o0(org.telegram.ui.Components.p5 p5Var) {
        TLRPC.InputStickerSet i12;
        int i7;
        an anVar = this.a;
        if (!anVar.getMessagesController().D3() && p5Var != null && !p5Var.standard) {
            long documentId = p5Var.getDocumentId();
            TLRPC.Document document = p5Var.document;
            if (document == null) {
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                document = org.telegram.ui.Components.g5.e(i7, documentId);
            }
            if (document != null && (i12 = org.telegram.messenger.gj.i1(document)) != null) {
                org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).m0(i12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i12);
                org.telegram.ui.Components.wu wuVar = new org.telegram.ui.Components.wu(anVar, anVar.getParentActivity(), anVar.Aa, arrayList);
                org.telegram.ui.Components.ou ouVar = wuVar.q1;
                ouVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(ouVar);
                ouVar.w = imageReceiver;
                if (ouVar.d) {
                    imageReceiver.P();
                }
                ouVar.x = true;
                ouVar.y.e(true, 1.0f);
                ouVar.w.r0(org.telegram.messenger.gc.b(document), "140_140", org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, true), 0L, null, null, 0);
                ouVar.w.E0(7);
                ImageReceiver imageReceiver2 = ouVar.w;
                imageReceiver2.v0 = true;
                imageReceiver2.u0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = ouVar.w;
                imageReceiver3.x0 = true;
                imageReceiver3.H0(ouVar);
                boolean V9 = anVar.V9();
                wuVar.i0 = V9;
                wuVar.n = V9;
                anVar.showDialog(wuVar);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p() {
        this.a.m1.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String b10;
        int i12;
        TLRPC.User user2;
        int i13;
        TLRPC.WebPage webPage;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        File file = null;
        an anVar = this.a;
        if (i7 == 19) {
            vf.b bVar = anVar.dc;
            if (bVar != null) {
                bVar.a(true);
            }
            final em emVar = q1Var.getMessageObject() != null ? new em(this, q1Var, 2) : null;
            anVar.dc = emVar;
            final Activity parentActivity = anVar.getParentActivity();
            final org.telegram.ui.ActionBar.e6 resourceProvider = anVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            emVar.d();
            emVar.b = new wg.c(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b11 = wg.h.b(messageObject);
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).M0(Long.valueOf(-messageObject.Z0()));
            final boolean z10 = M0 != null && org.telegram.messenger.t3.V(M0);
            final long j3 = messageObject.k.date * 1000;
            wg.q.d(messageObject, new org.telegram.messenger.z10(atomicBoolean, emVar, z10, b11, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: wg.d
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ vf.b b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ e6 g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override // org.telegram.messenger.z10
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (this.a.get()) {
                        return;
                    }
                    this.b.b();
                    boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                    boolean z12 = this.c;
                    String str = this.d;
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                    Context context = this.f;
                    e6 e6Var = this.g;
                    if (z11) {
                        h.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        h.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                    }
                }
            }, new wg.e(atomicBoolean, emVar, 0));
            return;
        }
        if (i7 == 21) {
            org.telegram.messenger.t0.u();
            boolean z11 = org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.r();
            vf.c.t(anVar.getParentActivity(), org.telegram.messenger.r2.g);
            return;
        }
        if (i7 == 84) {
            anVar.Wa(q1Var);
            return;
        }
        if (i7 == 80) {
            org.telegram.ui.Cells.n8 n8Var = org.telegram.ui.Components.te0.M1;
            if (anVar.getParentActivity() == null) {
                return;
            }
            anVar.showDialog(new org.telegram.ui.Components.te0(anVar.getContext(), anVar.getCurrentAccount(), messageObject, anVar.getResourceProvider()));
            return;
        }
        if (i7 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(messageObject) == null) {
                anVar.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i14 = 5;
        if (i7 == 5) {
            long j10 = messageObject.k.media.user_id;
            if (j10 != 0) {
                i13 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                user2 = org.telegram.messenger.np.s1(i13).a2(Long.valueOf(j10));
            } else {
                user2 = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                anVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File g12 = org.telegram.messenger.g0.g1();
                    g12.mkdirs();
                    file = new File(g12, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                anVar.showDialog(new org.telegram.ui.Components.bd0(anVar, null, user2, null, file, pf.b.d(str, false), str3, str4, anVar.Aa));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i7 == 30) {
            anVar.presentFragment(new an(a8.p0.j(messageObject.k.media.user_id, "user_id")));
            return;
        }
        if (i7 == 31) {
            long j11 = messageObject.k.media.user_id;
            if (j11 != 0) {
                i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                user = org.telegram.messenger.np.s1(i12).a2(Long.valueOf(j11));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    b10 = messageObject.Z1.toString();
                } else if (TextUtils.isEmpty(user.phone)) {
                    String str5 = org.telegram.messenger.gj.n1(messageObject.k).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? pf.b.c().b(str5) : org.telegram.messenger.hd.M0(2131747832, null);
                } else {
                    b10 = org.telegram.messenger.k5.h(new StringBuilder("+"), user.phone, pf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                anVar.presentFragment(new pr(bundle2));
                return;
            }
            return;
        }
        if (i7 == 23 || i7 == 24) {
            boolean z12 = i7 == 24;
            TLRPC.Message message2 = messageObject.k;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            vf.b bVar2 = anVar.dc;
            if (bVar2 != null) {
                bVar2.a(true);
            }
            int i15 = 3;
            anVar.dc = q1Var.getMessageObject() != null ? new em(this, q1Var, i15) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                if (org.telegram.messenger.si.b0(i10).p0(group) == null) {
                    anVar.dc.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    anVar.dc.b = new ai.v0(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new hi.b3(i15, this, z12)), 29);
                    return;
                }
            }
            vf.c.s(anVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, anVar.dc, null, false, true, false, false);
            return;
        }
        if (messageObject.r4()) {
            anVar.ma(messageObject, false, false);
            if (messageObject.T0 != null) {
                vf.b bVar3 = anVar.dc;
                if (bVar3 != null) {
                    bVar3.a(true);
                }
                anVar.dc = q1Var.getMessageObject() != null ? new em(this, q1Var, 4) : null;
                vf.c.s(anVar.getParentActivity(), Uri.parse(messageObject.T0), true, false, false, anVar.dc, null, false, anVar.getMessagesController().e6, false, false);
                return;
            }
            return;
        }
        TLRPC.WebPage W1 = messageObject.W1();
        if (W1 == null && (message = messageObject.k) != null && (messageMedia2 = message.media) != null) {
            W1 = messageMedia2.webpage;
        }
        if (W1 == null) {
            return;
        }
        if (W1.attributes != null) {
            for (int i16 = 0; i16 < W1.attributes.size(); i16++) {
                if ((W1.attributes.get(i16) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) W1.attributes.get(i16)).storyItem) != null) {
                    storyItem.dialogId = org.telegram.messenger.m5.o(tL_webPageAttributeStory.peer);
                    tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                    tL_webPageAttributeStory.storyItem.messageType = 1;
                    anVar.getOrCreateStoryViewer().L(anVar.getParentActivity(), tL_webPageAttributeStory.storyItem, fi.b7.a(anVar.A0));
                    return;
                }
            }
        }
        if (anVar.Ha(W1.url, q1Var, null, messageObject.e1(), 2)) {
            return;
        }
        vf.b bVar4 = anVar.dc;
        if (bVar4 != null) {
            bVar4.a(true);
        }
        anVar.dc = q1Var.getMessageObject() != null ? new em(this, q1Var, i14) : null;
        vf.c.s(anVar.getParentActivity(), Uri.parse(W1.url), true, true, false, anVar.dc, null, false, true, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.gj messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (q1Var != null && pageBlock != null) {
            an anVar = this.a;
            if (anVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.y2.g;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    org.telegram.messenger.cu cuVar = (org.telegram.messenger.cu) arrayList2.get(i7);
                    if (cuVar instanceof org.telegram.messenger.qu) {
                        arrayList.add(((org.telegram.messenger.qu) cuVar).r0);
                    } else if (cuVar instanceof org.telegram.messenger.cv) {
                        arrayList.add(((org.telegram.messenger.cv) cuVar).r0);
                    } else if (cuVar instanceof org.telegram.messenger.hu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.hu) cuVar).Y;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            arrayList.add(((org.telegram.messenger.vt) obj).b);
                        }
                    } else if (cuVar instanceof org.telegram.messenger.uu) {
                        ArrayList arrayList4 = ((org.telegram.messenger.uu) cuVar).Y;
                        int size2 = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.vt) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.I2(null, anVar, null);
                    return p12.d2(null, null, null, null, null, null, null, indexOf, new rl(anVar, arrayList), null, 0L, 0L, 0L, true, new ql(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    public final void q(TLRPC.User user, boolean z10) {
        int i7;
        if (user == null || user.id == 489000) {
            return;
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        int i10 = 0;
        if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("expandPhoto", z10);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        an anVar = this.a;
        TLRPC.User user2 = anVar.f;
        if (user2 != null && user2.id == user.id) {
            i10 = 1;
        }
        profileActivity.i5(i10);
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
        org.telegram.messenger.g0.l3(parentActivity, i7);
        anVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        an anVar = this.a;
        anVar.Y7(q1Var, false, false, f10, f11, true, false, false);
        anVar.A0.getClass();
        an.l2(anVar, RecyclerView.R(q1Var));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q2(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Zc(primaryMessageObject, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0116, code lost:
    
        if (r1.noforwards == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0122, code lost:
    
        if (org.telegram.messenger.t3.t0(r1) != false) goto L90;
     */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i7;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i10;
        TLRPC.Message message2;
        int i11;
        TLRPC.Peer peer;
        org.telegram.messenger.bj bjVar;
        int i12;
        an anVar = this.a;
        if (anVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.p11 p11Var = anVar.g2;
        boolean z10 = true;
        if (p11Var != null && anVar.s4 == 0 && (q1Var.l6 || q1Var.m6)) {
            p11Var.n(q1Var.getMessageObject().Y1(), true);
            return;
        }
        if (anVar.getMessagesController().v2()) {
            i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            b.b(i12);
            return;
        }
        qj qjVar = anVar.a0;
        if (qjVar != null) {
            qjVar.S();
        }
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        int i13 = anVar.g4;
        if (i13 == 2) {
            anVar.m9.P0(messageObject.e1());
            anVar.finishFragment();
            return;
        }
        if (i13 == 3 || ((i13 == 7 && anVar.d4 == 2) || !((!org.telegram.messenger.q10.z(anVar.f) && !org.telegram.messenger.q10.B(anVar.f)) || (messageFwdHeader = messageObject.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (org.telegram.messenger.q10.z(anVar.f) && (messageReplyHeader = (message = messageObject.k).reply_to) != null && (i7 = messageReplyHeader.reply_to_top_id) != 0) {
                anVar.Da(messageReplyHeader.reply_to_peer_id.channel_id, null, i7, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (anVar.g4 == 7 && anVar.d4 == 2) {
                anVar.Ia(messageObject);
                return;
            } else {
                anVar.Ja(messageObject);
                return;
            }
        }
        ArrayList arrayList = (messageObject.c1() == 0 || (bjVar = (org.telegram.messenger.bj) anVar.O6.f(messageObject.c1())) == null) ? null : bjVar.d;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.k5.j(messageObject);
        }
        if (anVar.getMessagesController().X4()) {
            int i14 = messageObject.K1;
            if (!messageObject.r4() && (((message2 = messageObject.k) == null || !message2.noforwards) && (i11 = messageObject.D) != 17 && i11 != 12)) {
                long B0 = org.telegram.messenger.gj.B0(message2);
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i14).M0(Long.valueOf(-B0));
                if (M0 == null || !M0.noforwards) {
                    if (B0 >= 0 || !org.telegram.messenger.t3.V(M0)) {
                        TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.k.fwd_from;
                        if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                            long o4 = org.telegram.messenger.m5.o(peer);
                            TLRPC.Chat M02 = org.telegram.messenger.np.s1(i14).M0(Long.valueOf(-o4));
                            if (o4 < 0) {
                                if (M02 != null) {
                                }
                                if (org.telegram.messenger.t3.V(M02)) {
                                }
                            }
                        }
                    }
                    boolean z11 = z10;
                    anVar.showDialog(new fm(this, anVar.getParentActivity(), anVar, arrayList, org.telegram.messenger.t3.T(anVar.e), z11, anVar.Aa, z11, messageObject));
                    Activity parentActivity = anVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
                    org.telegram.messenger.g0.l3(parentActivity, i10);
                    anVar.fragmentView.requestLayout();
                }
            }
        }
        z10 = false;
        boolean z112 = z10;
        anVar.showDialog(new fm(this, anVar.getParentActivity(), anVar, arrayList, org.telegram.messenger.t3.T(anVar.e), z112, anVar.Aa, z112, messageObject));
        Activity parentActivity2 = anVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
        org.telegram.messenger.g0.l3(parentActivity2, i10);
        anVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s2() {
        this.a.O9();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t() {
        this.a.Fc();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        wh.h hVar;
        wh.i iVar = this.a.ta;
        if (iVar == null || (hVar = (wh.h) iVar.a.get(wh.i.b(q1Var))) == null) {
            return;
        }
        wh.d[] dVarArr = hVar.x;
        RectF rectF = hVar.r;
        if (hVar.N) {
            float f12 = (f10 - rectF.left) + hVar.V;
            float f13 = (f11 - rectF.top) + hVar.W;
            int i7 = wh.g.a;
            int b10 = (((float) (-org.telegram.messenger.g0.L((float) 37))) >= f13 || f13 >= rectF.height()) ? -1 : c8.i9.b((int) Math.floor((f12 - (org.telegram.messenger.g0.L(9) - (org.telegram.messenger.g0.L(11) / 2.0f))) / org.telegram.messenger.g0.L(wh.g.a + 11)), 0, dVarArr.length - 1);
            if (hVar.S == b10) {
                return;
            }
            hVar.a.performHapticFeedback(3, 1);
            hVar.S = b10;
            int i10 = 0;
            while (i10 < dVarArr.length) {
                wh.d dVar = dVarArr[i10];
                boolean z10 = b10 == i10;
                if (dVar.p != z10) {
                    ValueAnimator valueAnimator = dVar.n;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    dVar.p = z10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(dVar.o, z10 ? 1.0f : 0.0f);
                    dVar.n = ofFloat;
                    ofFloat.setDuration(180L);
                    dVar.n.addUpdateListener(dVar);
                    dVar.n.setInterpolator(wh.f.a);
                    dVar.n.start();
                }
                wh.d dVar2 = dVarArr[i10];
                boolean z11 = b10 == i10 || b10 == -1;
                if (dVar2.m != z11) {
                    ValueAnimator valueAnimator2 = dVar2.k;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    dVar2.m = z11;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dVar2.l, z11 ? 1.0f : 0.0f);
                    dVar2.k = ofFloat2;
                    ofFloat2.setDuration(180L);
                    dVar2.k.addUpdateListener(dVar2);
                    dVar2.k.setInterpolator(wh.f.a);
                    dVar2.k.start();
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.a.n8(q1Var, reactionCount, z10, f10, f11);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        int i10;
        dj djVar;
        org.telegram.messenger.gj primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.c3 = !primaryMessageObject.c3;
        primaryMessageObject.M1 = true;
        an anVar = this.a;
        aj ajVar = anVar.A0;
        if (ajVar != null && (djVar = anVar.C0) != null && djVar.y < 0) {
            for (int childCount = ajVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = anVar.A0.getChildAt(childCount);
                anVar.A0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.q1)) {
                        if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = anVar.h9(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = anVar.h9(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        anVar.Zc(primaryMessageObject, false);
        hi.l3 l3Var = anVar.P1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (i7 < 0 || q1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        anVar.C0.h1(i7, i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        boolean z10 = true;
        if (kVar.x() || anVar.Y9()) {
            an.k2(anVar, q1Var, true, f10, f11);
            return;
        }
        if (q1Var != null && q1Var.getMessageObject() != null && q1Var.getMessageObject().r4()) {
            p1(q1Var, 10);
            return;
        }
        if (!org.telegram.messenger.t3.c0(anVar.e) && !anVar.fa()) {
            z10 = false;
        }
        q(user, z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean v2(int i7) {
        boolean z10;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        if (i7 != 16 && i7 != R.id.acc_action_small_button && i7 != R.id.acc_action_msg_options) {
            return false;
        }
        an anVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
        if (!z10 || !anVar.fa) {
            return !c();
        }
        o4Var = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
        if (o4Var != null) {
            o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
            ((ActionBarLayout) o4Var2).r();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject;
        TLRPC.MessageReplies messageReplies;
        int i7;
        long j3;
        org.telegram.messenger.bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (org.telegram.messenger.gj) arrayList.get(0);
                org.telegram.messenger.gj gjVar = messageObject;
                messageReplies = gjVar.k.replies;
                if (messageReplies == null) {
                    i7 = messageReplies.read_max_id;
                    j3 = messageReplies.channel_id;
                } else {
                    i7 = -1;
                    j3 = 0;
                }
                int i10 = i7;
                long j10 = j3;
                an anVar = this.a;
                anVar.Da(anVar.e.id, gjVar, gjVar.e1(), j10, i10, 0, null);
            }
        }
        messageObject = q1Var.getMessageObject();
        org.telegram.messenger.gj gjVar2 = messageObject;
        messageReplies = gjVar2.k.replies;
        if (messageReplies == null) {
        }
        int i102 = i7;
        long j102 = j3;
        an anVar2 = this.a;
        anVar2.Da(anVar2.e.id, gjVar2, gjVar2.e1(), j102, i102, 0, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x061c, code lost:
    
        if (r0.exists() != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x06e1, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L225;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0730 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
        int i7;
        an anVar;
        boolean z11;
        an anVar2;
        File file;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i10;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        int i11 = messageObject.D;
        int i12 = 2;
        an anVar3 = this.a;
        if (i11 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = org.telegram.messenger.m5.o(messageMedia2.peer);
            storyItem.messageId = messageObject.e1();
            storyItem.messageType = 2;
            fi.l7.b(storyItem, anVar3.f);
            anVar3.getOrCreateStoryViewer().L(anVar3.getParentActivity(), messageObject.k.media.storyItem, fi.b7.a(anVar3.A0));
            return;
        }
        int i13 = 1;
        if (org.telegram.messenger.gj.L4(messageObject.k)) {
            i10 = ((org.telegram.ui.ActionBar.e2) anVar3).currentAccount;
            if (org.telegram.messenger.z5.q(i10).b(messageObject.k) == 1) {
                messageObject.P = true;
            }
        } else {
            messageObject.P = true;
        }
        if (messageObject.n4()) {
            anVar3.Y7(q1Var, false, false, f10, f11, true, false, false);
            return;
        }
        if (messageObject.o4()) {
            return;
        }
        int i14 = 0;
        if (z10 && (message = messageObject.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject.k.media.webpage.url;
            org.telegram.messenger.g0.K0(str, false);
            if (anVar3.Ha(str, q1Var, null, messageObject.e1(), 2)) {
                return;
            }
            vf.b bVar = anVar3.dc;
            if (bVar != null) {
                bVar.a(true);
            }
            anVar3.dc = q1Var.getMessageObject() != null ? new em(this, q1Var, i14) : null;
            vf.c.s(anVar3.getParentActivity(), Uri.parse(str), true, false, false, anVar3.dc, null, false, true, false, false);
            return;
        }
        if (messageObject.T2()) {
            vl vlVar = new vl(this, messageObject, i14);
            TLRPC.MessageMedia n1 = org.telegram.messenger.gj.n1(messageObject.k);
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) (TLRPC.TL_messageMediaDice.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaDice.class.cast(n1) : null);
            if (tL_messageMediaDice == null || !TextUtils.equals("🎲", tL_messageMediaDice.emoticon)) {
                vlVar.run();
                return;
            }
            org.telegram.messenger.np messagesController = anVar3.getMessagesController();
            int i15 = 5;
            x xVar = new x(this, messageObject, vlVar, i15);
            TLRPC.EmojiGameInfo emojiGameInfo = messagesController.x8;
            if (emojiGameInfo != null) {
                xVar.a(Boolean.valueOf(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo));
                return;
            }
            ArrayList arrayList = messagesController.w8;
            if (arrayList != null) {
                arrayList.add(xVar);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            messagesController.w8 = arrayList2;
            arrayList2.add(xVar);
            messagesController.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new d3.b(i13), new org.telegram.messenger.cl(messagesController, i15));
            return;
        }
        if ((messageObject.G2() && (!messageObject.F2() || (anVar3.Ta.e.containsKey(jx.p(org.telegram.messenger.gj.U(messageObject.F0()))) && anVar3.f != null))) || messageObject.W3()) {
            anVar3.qb(q1Var);
            anVar3.Ta.k(q1Var, anVar3, true);
            anVar3.A0.I0(false);
            return;
        }
        int i16 = 6;
        if (messageObject.m5()) {
            fe Lb = anVar3.Lb(messageObject, false);
            bi.m1 a52 = an.a5(anVar3, messageObject);
            q1Var.invalidate();
            final SecretMediaViewer f12 = SecretMediaViewer.f();
            final Activity parentActivity = anVar3.getParentActivity();
            int i17 = org.telegram.messenger.m10.t0;
            f12.a = i17;
            ImageReceiver imageReceiver = f12.h;
            imageReceiver.d = i17;
            if (f12.b != parentActivity) {
                f12.b = parentActivity;
                f12.f1 = new org.telegram.ui.Components.bl0(parentActivity, null);
                k0 k0Var = new k0(22, parentActivity, f12);
                f12.d = k0Var;
                k0Var.setBackgroundDrawable(f12.k0);
                f12.d.setFocusable(true);
                f12.d.setFocusableInTouchMode(true);
                f12.d.setClipChildren(false);
                f12.d.setClipToPadding(false);
                f12.e = new ai.j0(f12, parentActivity);
                View view = new View(parentActivity);
                f12.f = view;
                view.setBackgroundColor(2130706432);
                f12.e.addView(f12.f, c8.ja.e(-1, -2, 80));
                f12.e.setFocusable(false);
                f12.d.addView(f12.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f12.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f12.e.setLayoutParams(layoutParams);
                f12.e.setFitsSystemWindows(true);
                f12.e.setOnApplyWindowInsetsListener(new cz0(f12, 0));
                f12.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f12.e.getContext(), f12);
                f12.K0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f12);
                org.telegram.ui.Components.o7 o7Var = new org.telegram.ui.Components.o7(i16, parentActivity, f12);
                f12.G = o7Var;
                o7Var.setTitleColor(-1);
                f12.G.setSubtitleColor(-1);
                f12.G.setBackgroundColor(2130706432);
                f12.G.setOccupyStatusBar(true);
                f12.G.F(1090519039, false);
                f12.G.H(-1, false);
                f12.G.setBackButtonImage(R.drawable.ic_ab_back);
                f12.G.setTitleRightMargin(org.telegram.messenger.g0.L(70.0f));
                f12.e.addView(f12.G, c8.ja.c(-2.0f, -1));
                f12.G.setActionBarMenuOnItemClick(new ct0(f12, 10));
                hi.l3 l3Var = new hi.l3(parentActivity, 1);
                f12.r = l3Var;
                l3Var.o(1.0f, -26.0f);
                f12.r.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                f12.e.addView(f12.r, c8.ja.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                iz0 iz0Var = new iz0(f12, parentActivity);
                f12.n = iz0Var;
                f12.e.addView(iz0Var, c8.ja.d(org.telegram.messenger.ns.E1, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                ur0 ur0Var = new ur0(f12, i13);
                f12.T = new jz0(f12, parentActivity);
                View view2 = new View(parentActivity);
                f12.S = view2;
                view2.setBackgroundColor(2130706432);
                f12.T.addView(f12.S, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(f12.e.getContext());
                f12.R = j5Var;
                j5Var.setTextColor(-1);
                f12.R.setGravity(53);
                f12.R.setTextSize(14);
                f12.R.setImportantForAccessibility(2);
                f12.T.addView(f12.R, c8.ja.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                rv rvVar = new rv(9, parentActivity, f12);
                f12.Q = rvVar;
                org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(rvVar);
                f12.P = w51Var;
                w51Var.z = org.telegram.messenger.g0.L(2.0f);
                org.telegram.ui.Components.w51 w51Var2 = f12.P;
                w51Var2.k = 872415231;
                w51Var2.l = 872415231;
                w51Var2.m = -1;
                w51Var2.n = -1;
                w51Var2.A = 1509949439;
                w51Var2.j = ur0Var;
                f12.T.addView(f12.Q);
                f12.e.addView(f12.T, c8.ja.e(-1, 48, 80));
                so0 so0Var = new so0(null, new fi.b());
                f12.X = so0Var;
                so0Var.j0 = true;
                so0Var.h0 = false;
                kq0 kq0Var = new kq0(f12.e.getContext());
                f12.Y = kq0Var;
                kq0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.dz0
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new jq0(parentActivity, secretMediaViewer.Z, secretMediaViewer.X, new a5(secretMediaViewer, 23), new td0(secretMediaViewer, 2));
                    }
                });
                f12.Y.setVisibility(4);
                if (!f12.v1) {
                    f12.v1 = true;
                    f12.Y.setLayerType(2, null);
                    f12.Y.getCurrentView().setLayerType(2, null);
                    f12.Y.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                f12.U = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(64.0f), 1711276032));
                org.telegram.ui.Components.ke0 ke0Var = new org.telegram.ui.Components.ke0(28);
                f12.V = ke0Var;
                ke0Var.setCallback(f12.U);
                f12.U.setImageDrawable(f12.V);
                f12.U.setScaleType(ImageView.ScaleType.CENTER);
                f12.U.setScaleX(0.6f);
                f12.U.setScaleY(0.6f);
                f12.U.setAlpha(0.0f);
                f12.U.setPivotX(org.telegram.messenger.g0.L(32.0f));
                f12.U.setPivotY(org.telegram.messenger.g0.L(32.0f));
                f12.e.addView(f12.U, c8.ja.e(64, 64, 17));
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                f12.c = layoutParams2;
                layoutParams2.height = -1;
                layoutParams2.format = -3;
                layoutParams2.width = -1;
                layoutParams2.gravity = 48;
                layoutParams2.type = 99;
                layoutParams2.flags = -2147409656;
                org.telegram.messenger.g0.h2();
                imageReceiver.H0(f12.e);
                imageReceiver.V0 = true;
                org.telegram.ui.Cells.t9 n10 = f12.X.n(f12.d.getContext());
                if (n10 != null) {
                    org.telegram.messenger.g0.E2(n10);
                    f12.e.addView(n10);
                }
                f12.X.S(f12.e);
                f12.X.i0 = true;
            }
            SecretMediaViewer.f().h(messageObject, anVar3.cb, Lb, a52);
            return;
        }
        if (org.telegram.messenger.gj.H2(messageObject.F0()) && org.telegram.messenger.gj.i1(messageObject.F0()) != null) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(org.telegram.messenger.gj.i1(messageObject.F0()));
            org.telegram.ui.Components.wu wuVar = new org.telegram.ui.Components.wu(anVar3, anVar3.getParentActivity(), anVar3.Aa, arrayList3);
            boolean V9 = anVar3.V9();
            wuVar.i0 = V9;
            wuVar.n = V9;
            anVar3.showDialog(wuVar);
            return;
        }
        if (org.telegram.messenger.gj.j1(messageObject.k) != null) {
            org.telegram.ui.Components.bw0 bw0Var = new org.telegram.ui.Components.bw0(anVar3.getParentActivity(), anVar3, org.telegram.messenger.gj.j1(messageObject.k), null, (anVar3.d1.getVisibility() == 0 || !((chat = anVar3.e) == null || org.telegram.messenger.t3.t(chat))) ? null : anVar3.a0, anVar3.Aa);
            boolean V92 = anVar3.V9();
            bw0Var.i0 = V92;
            bw0Var.n = V92;
            anVar3.showDialog(bw0Var);
            return;
        }
        if (org.telegram.messenger.gj.L4(messageObject.k) || (i7 = messageObject.D) == 1 || ((i7 == 0 && !messageObject.a5()) || org.telegram.messenger.gj.t3(messageObject.k))) {
            if (messageObject.r4()) {
                if (org.telegram.messenger.gj.t3(messageObject.k) || org.telegram.messenger.gj.S3(messageObject.k)) {
                    anVar3.ma(messageObject, true, false);
                    if (messageObject.T0 != null) {
                        vf.b bVar2 = anVar3.dc;
                        if (bVar2 != null) {
                            bVar2.a(true);
                        }
                        anVar3.dc = q1Var.getMessageObject() == null ? null : new em(this, q1Var, i13);
                        vf.c.s(anVar3.getParentActivity(), Uri.parse(messageObject.T0), true, false, false, anVar3.dc, null, false, anVar3.getMessagesController().e6, false, false);
                        return;
                    }
                    return;
                }
                if (org.telegram.messenger.gj.L4(messageObject.k)) {
                    anVar3.ma(messageObject, true, false);
                }
            }
            if (messageObject.L0() > 0.0d && messageObject.g2() > 0 && !messageObject.j3) {
                messageObject.c0 = (float) (messageObject.g2() / messageObject.L0());
            }
            anVar3.Ka(q1Var, messageObject);
            return;
        }
        int i18 = messageObject.D;
        if (i18 == 3) {
            anVar3.Lb(messageObject, true);
            try {
                String str2 = messageObject.k.attachPath;
                File file2 = (str2 == null || str2.length() == 0) ? null : new File(messageObject.k.attachPath);
                if (file2 == null || !file2.exists()) {
                    org.telegram.messenger.w7 fileLoader = anVar3.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader.getClass();
                    file2 = org.telegram.messenger.w7.M(message2, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity2 = anVar3.getParentActivity();
                    org.telegram.messenger.t0.d();
                    intent.setDataAndType(FileProvider.d(parentActivity2, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                anVar3.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                anVar3.M6(messageObject);
                return;
            }
        }
        if (i18 == 4) {
            if (org.telegram.messenger.g0.J1(anVar3)) {
                if (!messageObject.C3()) {
                    pa0 pa0Var = new pa0(anVar3.h != null ? 0 : 3);
                    pa0Var.H0 = anVar3;
                    pa0Var.G0(messageObject);
                    anVar3.presentFragment(pa0Var);
                    return;
                }
                TLRPC.Chat chat2 = anVar3.e;
                if (chat2 != null && !org.telegram.messenger.t3.n(chat2) && !anVar3.e.megagroup) {
                    i12 = 6;
                }
                pa0 pa0Var2 = new pa0(i12);
                pa0Var2.H0 = anVar3;
                pa0Var2.G0(messageObject);
                anVar3.presentFragment(pa0Var2);
                return;
            }
            return;
        }
        if (i18 != 9 && i18 != 0) {
            return;
        }
        if (messageObject.I0().toLowerCase().endsWith("attheme")) {
            String str3 = messageObject.k.attachPath;
            if (str3 != null && str3.length() != 0) {
                file = new File(messageObject.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.w7 fileLoader2 = anVar3.getFileLoader();
                TLRPC.Message message3 = messageObject.k;
                fileLoader2.getClass();
                File M = org.telegram.messenger.w7.M(message3, false, true);
                if (M.exists()) {
                    file = M;
                }
            }
            org.telegram.ui.ActionBar.i6 v = org.telegram.ui.ActionBar.j6.v(file, messageObject.I0(), null, true);
            if (v != null) {
                anVar3.presentFragment(new t71(v));
                return;
            }
            anVar3.M4 = -1;
        }
        if (messageObject.x()) {
            PhotoViewer.p1().I2(null, anVar3, anVar3.Aa);
            PhotoViewer p12 = PhotoViewer.p1();
            int i19 = messageObject.D;
            p12.e2(messageObject, anVar3, i19 != 0 ? anVar3.k6 : 0L, i19 != 0 ? anVar3.c7 : 0L, i19 != 0 ? anVar3.b() : 0L, anVar3.cb);
            anVar = anVar3;
            z11 = true;
        } else {
            anVar = anVar3;
            z11 = false;
        }
        Pattern pattern = org.telegram.ui.Components.q80.a;
        String Q0 = messageObject.Q0();
        if (!"md".equalsIgnoreCase(Q0) && !"mkd".equalsIgnoreCase(Q0) && !"mdwn".equalsIgnoreCase(Q0) && !"mkdn".equalsIgnoreCase(Q0) && !"mdown".equalsIgnoreCase(Q0) && !"markdown".equalsIgnoreCase(Q0)) {
            String t12 = messageObject.t1();
            if (t12 != null) {
                String lowerCase = t12.toLowerCase();
                if (!lowerCase.startsWith("text/markdown")) {
                    if (!lowerCase.startsWith("text/x-markdown")) {
                    }
                }
            }
            if (!org.telegram.ui.Components.q80.j(messageObject)) {
                anVar2 = anVar;
                if (z11) {
                    try {
                        org.telegram.messenger.g0.u2(messageObject, anVar2.getParentActivity(), anVar2.Aa, false);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        anVar2.M6(messageObject);
                        return;
                    }
                }
                return;
            }
        }
        if (anVar.getParentActivity() == null) {
            anVar2 = anVar;
        } else {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, anVar.getParentActivity(), anVar.Aa);
            t1Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            t1Var.setOnCancelListener(new fg(0, zArr));
            t1Var.r(150L);
            an anVar4 = anVar;
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(anVar4, messageObject, t1Var, zArr, 8);
            anVar2 = anVar4;
            messageObject = messageObject;
            new Thread(m5Var).start();
        }
        z11 = true;
        if (z11) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final String x(long j3) {
        TLRPC.Peer peer;
        String C0;
        an anVar = this.a;
        if (org.telegram.messenger.q10.u(anVar.f)) {
            return null;
        }
        TLRPC.Chat chat = anVar.e;
        if (chat != null && !org.telegram.messenger.t3.V(chat) && (C0 = anVar.getMessagesController().C0(anVar.e.id, j3)) != null) {
            return C0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = anVar.r4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j3 || peer.channel_id == j3 || peer.chat_id == j3)) {
            return null;
        }
        return org.telegram.messenger.hd.M0(2131744020, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean x1() {
        an anVar = this.a;
        return anVar.m1.getMeasuredWidth() > anVar.m1.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.l1
    public final void x2() {
        an anVar = this.a;
        if (!anVar.getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(anVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.hd.H(',', "UnlockSimilarChannelsPremium", anVar.getMessagesController().y4), new tl(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", anVar.k6);
        bundle.putInt("start_from", 10);
        anVar.presentFragment(new org.telegram.ui.Components.x80(bundle, anVar.p1.getSharedMediaPreloader()));
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean y0(org.telegram.messenger.gj gjVar) {
        return !this.a.s.containsKey(gjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
        org.telegram.messenger.gj messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        an anVar = this.a;
        hi.l3 l3Var = anVar.P1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (anVar.getParentActivity() == null || (messageObject = q1Var.getMessageObject()) == null || (R0 = messageObject.R0()) == null || R0.country == null) {
            return;
        }
        try {
            str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.hd.E0().y);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str = R0.country;
        }
        hi.l3 l3Var2 = new hi.l3(anVar.getParentActivity(), 3);
        l3Var2.r(true);
        l3Var2.L = Layout.Alignment.ALIGN_NORMAL;
        l3Var2.d = -1L;
        l3Var2.U = true;
        l3Var2.e = true;
        l3Var2.s(12.0f);
        anVar.P1 = l3Var2;
        l3Var2.r0 = new zg(6, this, l3Var2);
        l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750848, str)));
        anVar.P1.l(anVar.L);
        anVar.m1.addView(anVar.P1, c8.ja.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        anVar.m1.post(new l2.x(this, q1Var, i10, i7, 12));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject == null || messageObject.D != 27) {
            return;
        }
        messageObject.Y5();
        messageObject.M1 = true;
        q1Var.H1();
        q1Var.requestLayout();
        this.a.D0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z0(org.telegram.ui.Cells.q1 q1Var) {
        sh.b bVar = this.a.jd;
        if (bVar == null || bVar.n != q1Var) {
            return;
        }
        bVar.x.getClass();
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        an anVar = this.a;
        return anVar.Zb != 0 && q1Var.getMessageObject() != null && anVar.Zb == q1Var.getMessageObject().e1() && anVar.ac == i7;
    }

    @Override // org.telegram.ui.Cells.l1
    public final org.telegram.ui.Cells.i9 z2() {
        return this.a.t9;
    }
}
