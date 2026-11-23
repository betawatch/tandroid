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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.UndoView;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class mm implements org.telegram.ui.Cells.m1 {
    public final /* synthetic */ bn a;

    public mm(bn bnVar) {
        this.a = bnVar;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void A0() {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Components.c6 m10;
        bn bnVar = this.a;
        if (bnVar.A3 || org.telegram.messenger.cz.A0 || bnVar.A0 == null || bnVar.getParentActivity() == null || bnVar.fragmentView == null) {
            return;
        }
        hi.l3 l3Var = bnVar.I2;
        if (l3Var == null || !l3Var.W) {
            if (l3Var == null) {
                int indexOfChild = bnVar.m1.indexOfChild(bnVar.U);
                if (indexOfChild == -1) {
                    return;
                }
                hi.l3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
                bnVar.I2 = E6;
                E6.d = 10000L;
                E6.m(bnVar.getParentActivity().getResources().getDrawable(R.drawable.tooltip_sound).mutate());
                bnVar.I2.v(org.telegram.messenger.hd.N0(2131753759, null));
            }
            int childCount = bnVar.A0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = bnVar.A0.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.r1) && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && org.telegram.messenger.gj.L4(messageObject.k) && (m10 = r1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !bnVar.I2.W) {
                    ImageReceiver photoImage = r1Var.getPhotoImage();
                    float w92 = bnVar.w9(r1Var, photoImage.M0);
                    float f10 = photoImage.O0;
                    View view = (View) r1Var.getParent();
                    float w93 = bnVar.w9(r1Var, -r1Var.getTop());
                    if (w92 <= org.telegram.messenger.g0.L(80.0f)) {
                        continue;
                    } else if ((w92 + f10) - w93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                        bnVar.Lb = r1Var;
                        hi.l3 l3Var2 = bnVar.I2;
                        l3Var2.r0 = new af(bnVar, 22);
                        l3Var2.y(bnVar.v9(r1Var, r1Var.getNoSoundIconCenterX()), w92, true);
                        org.telegram.messenger.cz.D(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void B(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject == null || messageObject.D != 27) {
            return;
        }
        messageObject.Y5();
        messageObject.M1 = true;
        r1Var.H1();
        r1Var.requestLayout();
        this.a.D0.R(messageObject, false, false);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void B0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        bn bnVar = this.a;
        if (bnVar.getParentActivity() == null || tLObject == null) {
            return;
        }
        r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
            if (((ActionBarLayout) r4Var2).y()) {
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
            bnVar.presentFragment(new bn(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, bnVar.getParentActivity(), bnVar.getResourceProvider());
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, bnVar.getResourceProvider());
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(bnVar.getParentActivity(), false, false);
        y0Var.j(org.telegram.messenger.hd.N0(2131747617, null), R.drawable.msg_channel, null);
        y0Var.setMinimumWidth(org.telegram.messenger.ls.q2);
        y0Var.setOnClickListener(new a(this, 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(bnVar.getParentActivity(), false, false);
        y0Var2.j(org.telegram.messenger.hd.N0(2131746466, null), R.drawable.msg_addbot, null);
        y0Var2.setMinimumWidth(org.telegram.messenger.ls.q2);
        y0Var2.setOnClickListener(new y(this, (TLRPC.Chat) tLObject, r1Var, 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
        bn bnVar2 = new bn(bundle);
        bnVar2.ga = true;
        bnVar.presentFragmentAsPreviewWithMenu(bnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        bnVar.s7();
    }

    @Override // org.telegram.ui.Cells.m1
    public final void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
        f(r1Var, z10, false, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.m1
    public final void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        int i7 = messageObject.D;
        bn bnVar = this.a;
        if (i7 != 16) {
            bnVar.Y7(r1Var, true, false, f10, f11, messageObject.I3(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        int i10 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = bnVar.f;
            if (user != null) {
                boolean J4 = messageObject.J4();
                TLRPC.UserFull userFull = bnVar.s8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.b2.m(user, J4, i10, bnVar.getParentActivity(), bnVar.getMessagesController().d2(bnVar.f.id), bnVar.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(bnVar.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i10 < size) {
            TLRPC.Peer peer = arrayList.get(i10);
            i10++;
            hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bnVar.getParentActivity(), null);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = bnVar.getMessagesController().S6;
        t1Var.setOnCancelListener(new di.z(this, bnVar.getConnectionsManager().sendRequest(getgroupcall, new di.m7(this, t1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
        t1Var.r(600L);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void C1(org.telegram.ui.Cells.r1 r1Var) {
        bn.f5(this.a, r1Var);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void E(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar = this.a;
        if (!bnVar.getMessagesController().e5()) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bnVar.getParentActivity(), null);
            t1Var.r(200L);
            bnVar.getMessagesController().T0(new x(this, t1Var, r1Var, 6));
        } else {
            if (r1Var.getMessageObject() != null) {
                r1Var.getMessageObject().t2 = Boolean.FALSE;
            }
            r1Var.J3();
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void F0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject;
        if (r1Var == null || (messageObject = r1Var.getMessageObject()) == null || messageObject.k == null) {
            return;
        }
        int e12 = messageObject.e1();
        bn bnVar = this.a;
        if (bnVar.ac == e12 && bnVar.bc == 7) {
            return;
        }
        TLRPC.InputPeer l1 = bnVar.getMessagesController().l1(org.telegram.messenger.gj.B0(messageObject.k));
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = l1;
        getrichmessage.id = e12;
        vf.b bVar = bnVar.ec;
        if (bVar != null) {
            bVar.a(true);
            bnVar.ec = null;
        }
        int[] iArr = new int[1];
        hi hiVar = new hi(bnVar, e12, r1Var, 2);
        hiVar.b = new u8(22, bnVar, iArr);
        bnVar.ec = hiVar;
        hiVar.d();
        iArr[0] = bnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new d3.b(1), new ne(bnVar, hiVar, iArr, r1Var, messageObject, 2));
    }

    @Override // org.telegram.ui.Cells.m1
    public final void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        f(r1Var, z10, false, false);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void H0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
        f(r1Var, z10, true, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.m1
    public final boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12;
        String str;
        boolean z11;
        w4 w4Var;
        vj vjVar;
        uj ujVar;
        if (!g()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.v3.K(chat, false));
        bn bnVar = this.a;
        int i13 = (isEmpty || bnVar.e == null || ((vjVar = bnVar.d1) != null && vjVar.getVisibility() == 0) || ((ujVar = bnVar.T) != null && ujVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = bnVar.e;
        int i14 = (chat2 == null || !(bnVar.s4 == 0 || bnVar.x4) || (org.telegram.messenger.v3.T(chat2) && !bnVar.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = bnVar.e;
        int i15 = (chat3 == null || chat3.id != chat.id || bnVar.fa()) ? 1 : 0;
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
        TLRPC.ChatFull P0 = bnVar.getMessagesController().P0(chat.id);
        if (P0 != null) {
            w4Var = w4.a(chat, P0, c5VarArr);
            i11 = i13;
            i12 = i14;
            z10 = true;
            str = null;
            z11 = i15;
        } else {
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            org.telegram.messenger.gc m10 = org.telegram.messenger.gc.m(org.telegram.messenger.k10.t0, 0, chat);
            org.telegram.messenger.gc m11 = org.telegram.messenger.gc.m(org.telegram.messenger.k10.t0, 1, chat);
            String str2 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z10 = true;
            i11 = i13;
            i12 = i14;
            str = null;
            z11 = i15;
            w4Var = new w4(m10, m11, null, str2, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, c5VarArr, new v4(i10, org.telegram.messenger.ls.T, chat));
        }
        if (ab.q.h(w4Var)) {
            ab.q.o().D((ViewGroup) bnVar.fragmentView, bnVar.Ba, w4Var, new z6(this, chat, r1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(bnVar, r1Var);
        I.c(R.drawable.msg_openprofile, org.telegram.messenger.hd.N0(2131747592, str), new xl(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        I.l(z12 ? R.drawable.msg_channel : R.drawable.msg_discussion, org.telegram.messenger.hd.N0(z12 ? 2131747617 : 2131747605, str), new o1(this, r1Var, chat, 25), z11);
        I.l(R.drawable.msg_mention, org.telegram.messenger.hd.N0(2131748416, str), new xl(this, chat, z10 ? 1 : 0), i11);
        I.l(R.drawable.msg_search, org.telegram.messenger.hd.N0(2131753755, str), new xl(this, chat, 2), i12);
        I.t = false;
        I.i = 3;
        I.Z = true;
        I.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.a0();
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void I(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
        TLRPC.Message message;
        int i7;
        int i10;
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject == null || (message = messageObject.k) == null) {
            return;
        }
        int i11 = p2Var.a;
        int i12 = 24;
        bn bnVar = this.a;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    bnVar.Y7(r1Var, true, false, r1Var.getLastTouchX(), r1Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (i11 == 4) {
                        bnVar.g2.n(messageObject.Y1(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                boolean A = org.telegram.messenger.v3.A(i7, bnVar.e, 24);
                if (A) {
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    org.telegram.messenger.v3.A(i10, bnVar.e, 5);
                }
                aa.c0 c0Var = new aa.c0(this, message, A, messageObject, 28);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                bnVar.v7(c0Var, cg.a.m(suggestedPost != null ? suggestedPost.price : null), !A);
                return;
            }
            return;
        }
        long o4 = org.telegram.messenger.n5.o(message.from_id);
        li.d dVar = new li.d(i12, this, message);
        Pattern pattern = org.telegram.ui.Components.c5.a;
        Activity parentActivity = bnVar.getParentActivity();
        int i13 = 0;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(0, parentActivity, null);
        String N0 = org.telegram.messenger.hd.N0(2131744144, null);
        org.telegram.ui.ActionBar.t1 t1Var = v1Var.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744143, org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).D1(o4, false)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        org.telegram.ui.ActionBar.t6.U(editText, org.telegram.ui.ActionBar.m6.G6, null);
        editText.setHint(org.telegram.messenger.hd.N0(2131744142, null));
        org.telegram.ui.ActionBar.t6.D(editText, org.telegram.ui.ActionBar.m6.H6, null);
        editText.setTextSize(1, 16.0f);
        editText.setBackground(org.telegram.ui.ActionBar.m6.U(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.t4(parentActivity)});
        editText.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        editText.setSelection(editText.getText().toString().length());
        v1Var.o(frameLayout);
        v1Var.k(org.telegram.messenger.hd.N0(2131751592, null), new oi.f0(28, dVar, editText));
        v1Var.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        t1Var.O = new org.telegram.ui.Components.r1(editText, i13);
        frameLayout.addView(editText, c8.ma.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.og(editText, 3), 100L);
        bnVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void I0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        messageObject.k.summarizedOpen = !r1.summarizedOpen;
        messageObject.g6(true);
        bn bnVar = this.a;
        bnVar.getMessagesStorage().X1(org.telegram.messenger.gj.B0(messageObject.k), messageObject.k);
        bnVar.getMessagesController().v7.h(messageObject, true, false);
        f(r1Var, true, false, true);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        bn bnVar = this.a;
        if (bnVar.X9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (bnVar.getParentActivity() != null) {
            if (bnVar.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        bnVar.Ca(null, tL_inlineButtonTypeUrl.url, true, r1Var, r1Var.getMessageObject());
                        try {
                            r1Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) bnVar.getParentActivity(), (org.telegram.ui.ActionBar.h6) bnVar.Ba, false);
                w2Var.O();
                w2Var.P = str;
                w2Var.Q = false;
                w2Var.R = true;
                CharSequence[] charSequenceArr = {org.telegram.messenger.hd.N0(2131751755, null)};
                og.j jVar = new og.j(3, bnVar, str);
                w2Var.M = charSequenceArr;
                w2Var.L = jVar;
                bnVar.showDialog(w2Var);
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean J1() {
        bn bnVar = this.a;
        return bnVar.m1.getKeyboardHeight() + bnVar.La >= org.telegram.messenger.g0.L(20.0f);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void K(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar = this.a;
        bnVar.Ua.k(r1Var, bnVar, true);
        bnVar.A0.I0(false);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        boolean z10 = r1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        bn bnVar = this.a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) r1Var.getMessageObject().k.media).channels.get(i7).longValue();
            if (bnVar.l6 != j3) {
                bnVar.presentFragment(bn.ua(j3));
            } else {
                bnVar.p1.e(false, false);
            }
        }
        if (r1Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            bnVar.presentFragment(ProfileActivity.D4(((TLRPC.TL_messageMediaGiveawayResults) r1Var.getMessageObject().k.media).winners.get(i7).longValue()));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void L(org.telegram.messenger.dj djVar) {
        StaticLayout staticLayout = djVar.e;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = djVar.e.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new qi.g(djVar.L, charSequence, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.o10.t(null, 2131752010, org.telegram.ui.Components.lc.b0(this.a));
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean L0(long j3) {
        TLRPC.ChatFull P0;
        bn bnVar = this.a;
        TLRPC.Chat chat = bnVar.e;
        if (chat == null || org.telegram.messenger.v3.V(chat)) {
            return false;
        }
        org.telegram.messenger.np messagesController = bnVar.getMessagesController();
        long j10 = bnVar.e.id;
        if (j10 == j3) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j10));
        if (messagesController.getUserConfig().e() == j3 && O0 != null && O0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.A1.f(j10);
        if (hVar == null && (P0 = messagesController.P0(j10)) != null && P0.participants != null) {
            for (int i7 = 0; i7 < P0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = P0.participants.participants.get(i7);
                if (chatParticipant.user_id == j3) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j3)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void L1(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        bn bnVar = this.a;
        bnVar.v5 = messageObject;
        bnVar.C9();
    }

    @Override // org.telegram.ui.Cells.m1
    public final void N(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
        if (r1Var == null || document == null) {
            return;
        }
        bn bnVar = this.a;
        if (bnVar.getParentLayout() == null || !d0(r1Var)) {
            return;
        }
        boolean J3 = org.telegram.messenger.gj.J3(document);
        r1Var.setScrimBlockBounds(rectF);
        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(bnVar, r1Var);
        I.c(R.drawable.msg_download, org.telegram.messenger.hd.N0(J3 ? 2131745715 : 2131745735, null), new o1(this, r1Var, document, 26), false);
        I.p = new yl(r1Var, rectF, 0);
        I.a0();
    }

    @Override // org.telegram.ui.Cells.m1
    public final void N0(org.telegram.ui.Cells.r1 r1Var) {
        int i7;
        bi.q2 q2Var;
        org.telegram.messenger.bj bjVar;
        int i10;
        bn bnVar = this.a;
        wh.i iVar = bnVar.ua;
        if (iVar == null) {
            return;
        }
        HashMap hashMap = iVar.a;
        wh.h hVar = (wh.h) hashMap.get(wh.i.b(r1Var));
        org.telegram.ui.Components.gc gcVar = null;
        org.telegram.messenger.gj gjVar = hVar != null ? hVar.F : null;
        wh.h hVar2 = (wh.h) bnVar.ua.a.get(wh.i.b(r1Var));
        long j3 = (hVar2 == null || (i10 = hVar2.S) == -1) ? 0L : hVar2.x[i10].d;
        if (gjVar != null && j3 != 0) {
            Activity parentActivity = bnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            if (!org.telegram.ui.Components.c5.h(parentActivity, i7, j3, false)) {
                ArrayList arrayList = (gjVar.c1() == 0 || (bjVar = (org.telegram.messenger.bj) bnVar.P6.f(gjVar.c1())) == null) ? null : bjVar.d;
                if (arrayList == null) {
                    arrayList = org.telegram.messenger.f3.i(gjVar);
                }
                boolean z10 = j3 == org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).n;
                long j10 = j3;
                bi.q2 q2Var2 = new bi.q2(this, arrayList, j10, 18);
                if (z10) {
                    q2Var2.run();
                    q2Var = null;
                } else {
                    q2Var = q2Var2;
                }
                gcVar = org.telegram.ui.Components.lc.v(bnVar.getParentActivity(), bnVar, null, 1, j10, 1, bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.wj), bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.yj), 5000, false, q2Var);
                gcVar.k = true;
                gcVar.k(gcVar.e instanceof org.telegram.ui.Components.rb);
            }
        }
        wh.h hVar3 = (wh.h) hashMap.get(wh.i.b(r1Var));
        if (hVar3 != null) {
            if (gcVar == null) {
                hVar3.S = -1;
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.lb lbVar = gcVar.e;
            if (!(lbVar instanceof org.telegram.ui.Components.ob)) {
                hVar3.c();
                return;
            }
            org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) lbVar;
            hVar3.X = obVar;
            obVar.a.setVisibility(4);
            ViewTreeObserver viewTreeObserver = hVar3.X.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new pw(2, hVar3, viewTreeObserver));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void O0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        bn bnVar = this.a;
        bnVar.getSendMessagesHelper().n0(true, r1Var.getMessageObject(), keyboardInlineButton, null, null, bnVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void O1(org.telegram.messenger.gj gjVar) {
        this.a.s.put(gjVar, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void P(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().g(messageObject);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z11 = (z10 || !vf.c.i(str, false, false)) ? z10 : true;
        bn bnVar = this.a;
        vf.b bVar = bnVar.ec;
        if (bVar != null) {
            bVar.a(true);
        }
        bnVar.ec = r1Var.getMessageObject() == null ? null : new im(this, r1Var);
        if (z11 || vf.c.g(parse, false, null)) {
            vf.c.s(bnVar.getParentActivity(), parse, true, true, false, bnVar.ec, null, false, true, false, false);
        } else {
            org.telegram.ui.Components.c5.o0(bnVar, str, true, true, true, !z11, bnVar.ec, webPage, bnVar.Ba);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void R(org.telegram.messenger.gj gjVar) {
        if (org.telegram.messenger.gj.L4(gjVar.k)) {
            this.a.Lb(gjVar, true);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar;
        int i7;
        if (r1Var.getMessageObject() == null || (i7 = (bnVar = this.a).ac) == 0 || i7 != r1Var.getMessageObject().e1() || bnVar.bc != 1) {
            return null;
        }
        return bnVar.cc;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean S(org.telegram.ui.Cells.r1 r1Var, final TLRPC.TodoItem todoItem, final boolean z10) {
        int i7;
        int i10;
        boolean l32 = org.telegram.messenger.gj.l3(r1Var.getMessageObject().k);
        bn bnVar = this.a;
        if (l32) {
            TLRPC.Message message = r1Var.getMessageObject().k;
            long o4 = org.telegram.messenger.n5.o(message != null ? message.from_id : null);
            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar);
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            b02.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743844, org.telegram.messenger.n5.l(i10, o4)))).k(true);
            return false;
        }
        if (!r1Var.getMessageObject().q()) {
            TLRPC.Message message2 = r1Var.getMessageObject().k;
            long o10 = org.telegram.messenger.n5.o(message2 != null ? message2.from_id : null);
            org.telegram.ui.Components.lc b03 = org.telegram.ui.Components.lc.b0(bnVar);
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            b03.Q(R.raw.passcode_lock_close, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743845, org.telegram.messenger.n5.l(i7, o10)))).k(true);
            return false;
        }
        if (!bnVar.getUserConfig().q()) {
            org.telegram.ui.Components.lc.b0(bnVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(2131743821, null), new ul(this, 9))).k(true);
            return false;
        }
        final long M = org.telegram.messenger.v3.M(bnVar.e, bnVar.r8, true);
        final org.telegram.messenger.az sendMessagesHelper = bnVar.getSendMessagesHelper();
        final org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        sendMessagesHelper.getClass();
        if (messageObject == null) {
            return true;
        }
        final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.gj.B0(messageObject.k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.id));
        sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z10));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
        tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().l1(org.telegram.messenger.gj.B0(messageObject.k));
        if (z10) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
        }
        sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() { // from class: org.telegram.messenger.ky
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                az azVar = az.this;
                final boolean z11 = z10;
                if (tL_error == null) {
                    final ur messagesStorage = azVar.getMessagesStorage();
                    gj gjVar = messageObject;
                    final long B0 = gj.B0(gjVar.k);
                    final int e12 = gjVar.e1();
                    final int i11 = todoItem.id;
                    final long e10 = messagesStorage.getUserConfig().e();
                    final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                    q5 q5Var = messagesStorage.a;
                    final long j3 = M;
                    q5Var.c(new Runnable() { // from class: org.telegram.messenger.br
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
                            ur urVar = ur.this;
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
                                        sQLiteCursor = urVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j11 + " AND mid = " + i12, new Object[0]);
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
                                            if (urVar.u0(5, j11)) {
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
                                            gj.Z5(urVar.currentAccount, j13, (TLRPC.TL_messageMediaToDo) messageMedia2, i13, z12, i14);
                                            sQLitePreparedStatement = urVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                        } catch (Exception e14) {
                                            e = e14;
                                            sQLitePreparedStatement = null;
                                            sQLiteCursor = null;
                                            a8.g(e, true);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (urVar.u0(5, j11)) {
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
                                            if (urVar.u0(5, j11)) {
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
                            if (urVar.u0(5, j11)) {
                                return;
                            }
                            try {
                                queryFinalized = urVar.b.queryFinalized(str + j11 + " AND mid = " + i12, new Object[0]);
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
                                    gj.Z5(urVar.currentAccount, j13, (TLRPC.TL_messageMediaToDo) messageMedia, i13, z12, i14);
                                    queryFinalized.dispose();
                                    try {
                                        try {
                                            SQLitePreparedStatement executeFast = urVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
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
                    azVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                }
                g0.g3(new di.x7(azVar, hash, z11, 3));
            }
        });
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        try {
            bn bnVar = this.a;
            org.telegram.ui.Components.iu.O0(bnVar, gjVar, bnVar.db, str2, str3, str4, str, i7, i10, -1, bnVar.V9());
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean T() {
        bn bnVar = this.a;
        return bnVar.o6[1].size() + bnVar.o6[0].size() > 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void T0(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        this.a.l8(characterStyle, z10, r1Var.getMessageObject(), r1Var);
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.gj gjVar) {
        long j3;
        ViewGroup viewGroup;
        int i7;
        sz0 sz0Var;
        if (gjVar.S4() || gjVar.g4()) {
            uz0 uz0Var = this.a.wa;
            if (uz0Var == null || uz0Var.c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!gjVar.P3()) {
                            org.telegram.ui.Components.lc.b0(this.a).w(R.drawable.tooltip_sound, org.telegram.messenger.hd.N0(2131743268, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.wa = new uz0(this.a.getParentActivity());
                uz0 uz0Var2 = this.a.wa;
                he Lb = !gjVar.P3() ? this.a.Lb(gjVar, true) : null;
                bi.q2 a52 = !gjVar.P3() ? bn.a5(this.a, gjVar) : null;
                Context context = uz0Var2.a;
                ai.l0 l0Var = uz0Var2.c;
                uz0Var2.Y = Lb;
                uz0Var2.Z = a52;
                sz0 sz0Var2 = uz0Var2.O;
                if (sz0Var2 != null) {
                    l0Var.removeView(sz0Var2);
                    uz0Var2.O = null;
                }
                uz0Var2.P = r1Var;
                org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
                uz0Var2.N = messageObject;
                uz0Var2.T = messageObject != null && messageObject.h4();
                org.telegram.ui.Cells.r1 r1Var2 = uz0Var2.P;
                uz0Var2.M = r1Var2 != null ? r1Var2.getResourcesProvider() : null;
                if (uz0Var2.P != null) {
                    uz0Var2.U = 0.0f;
                    uz0Var2.V = r1Var.n;
                    if (r1Var.getParent() instanceof View) {
                        View view = (View) r1Var.getParent();
                        uz0Var2.U = view.getY() + uz0Var2.U;
                        uz0Var2.V = view.getY() + uz0Var2.V;
                    }
                    int width = uz0Var2.P.getWidth();
                    int height = uz0Var2.P.getHeight();
                    if (uz0Var2.T) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.q.y));
                    }
                    uz0Var2.L = height - uz0Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.p);
                    j3 = 0;
                    int i10 = height;
                    viewGroup = l0Var;
                    sz0 sz0Var3 = new sz0(uz0Var2, uz0Var2.getContext(), org.telegram.messenger.k10.t0, uz0Var2.P.getResourcesProvider(), width, i10);
                    uz0Var2.O = sz0Var3;
                    uz0Var2.P.t0(sz0Var3);
                    uz0Var2.O.s0(uz0Var2.P);
                    uz0Var2.O.setDelegate(new w7.s(19));
                    sz0 sz0Var4 = uz0Var2.O;
                    org.telegram.messenger.gj gjVar2 = uz0Var2.N;
                    org.telegram.messenger.bj currentMessagesGroup = uz0Var2.P.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.r1 r1Var3 = uz0Var2.P;
                    sz0Var4.y3(gjVar2, currentMessagesGroup, r1Var3.G, r1Var3.F, false, false);
                    if (!uz0Var2.T) {
                        org.telegram.ui.Components.g8 g8Var = new org.telegram.ui.Components.g8();
                        uz0Var2.W = g8Var;
                        sz0 sz0Var5 = uz0Var2.O;
                        g8Var.i = sz0Var5;
                        sz0Var5.wc = g8Var;
                        if (sz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.en0 seekBarWaveform = uz0Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = uz0Var2.s;
                            org.telegram.ui.Cells.r1 r1Var4 = seekBarWaveform.n;
                            if (r1Var4 != null) {
                                r1Var4.invalidate();
                            }
                        }
                    }
                    uz0Var2.I = false;
                    viewGroup.addView(uz0Var2.O, new FrameLayout.LayoutParams(uz0Var2.P.getWidth(), i10, 17));
                    i7 = ceil;
                } else {
                    j3 = 0;
                    viewGroup = l0Var;
                    i7 = 360;
                }
                TextureView textureView = uz0Var2.Q;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    uz0Var2.Q = null;
                }
                if (uz0Var2.T) {
                    uz0Var2.R = false;
                    TextureView textureView2 = new TextureView(context);
                    uz0Var2.Q = textureView2;
                    viewGroup.addView(textureView2, 0, c8.ma.c(i7, i7));
                }
                org.telegram.ui.Components.i61 i61Var = MediaController.B().j0;
                if (i61Var != null) {
                    i61Var.g0();
                }
                org.telegram.ui.Components.i61 i61Var2 = uz0Var2.x;
                if (i61Var2 != null) {
                    i61Var2.g0();
                    uz0Var2.x.m0();
                    uz0Var2.x = null;
                }
                org.telegram.ui.Cells.r1 r1Var5 = uz0Var2.P;
                if (r1Var5 != null && r1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(uz0Var2.P.getMessageObject().K1);
                    File I = org.telegram.messenger.w7.I(uz0Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(uz0Var2.P.getMessageObject().K1);
                        I = org.telegram.messenger.w7.M(uz0Var2.P.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && uz0Var2.P.getMessageObject().k.attachPath != null) {
                        I = new File(uz0Var2.P.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.i61 i61Var3 = new org.telegram.ui.Components.i61();
                        uz0Var2.x = i61Var3;
                        i61Var3.K = new tz0(uz0Var2);
                        if (uz0Var2.W != null) {
                            i61Var3.L = new tz0(uz0Var2);
                        }
                        if (uz0Var2.T) {
                            i61Var3.A0(uz0Var2.Q);
                        }
                        uz0Var2.x.j0(Uri.fromFile(I), "other");
                        uz0Var2.x.h0();
                        org.telegram.ui.Components.ys ysVar = uz0Var2.F;
                        if (ysVar != null) {
                            ysVar.s = uz0Var2.x;
                            ysVar.a();
                        }
                    }
                    bn bnVar = this.a;
                    bnVar.showDialog(bnVar.wa);
                    return false;
                }
                hi.l3 l3Var = uz0Var2.y;
                if (l3Var != null) {
                    viewGroup.removeView(l3Var);
                    uz0Var2.y = null;
                }
                org.telegram.messenger.gj gjVar3 = uz0Var2.N;
                boolean z10 = gjVar3 != null && gjVar3.P3();
                org.telegram.messenger.gj gjVar4 = uz0Var2.N;
                if (gjVar4 != null && org.telegram.messenger.gj.B0(gjVar4.k) != org.telegram.messenger.k10.i(uz0Var2.N.K1).e()) {
                    hi.l3 l3Var2 = new hi.l3(context, 3);
                    uz0Var2.y = l3Var2;
                    l3Var2.r(true);
                    if (z10) {
                        long B0 = org.telegram.messenger.gj.B0(uz0Var2.N.k);
                        String str = "";
                        if (B0 > j3) {
                            TLRPC.User c22 = org.telegram.messenger.np.u1(uz0Var2.N.K1).c2(Long.valueOf(B0));
                            if (c22 != null) {
                                str = org.telegram.messenger.p10.k(c22, true);
                            }
                        } else {
                            TLRPC.Chat O0 = org.telegram.messenger.np.u1(uz0Var2.N.K1).O0(Long.valueOf(-B0));
                            if (O0 != null) {
                                str = O0.title;
                            }
                        }
                        uz0Var2.y.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, uz0Var2.T ? 2131743345 : 2131743269, str)));
                    } else {
                        uz0Var2.y.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(uz0Var2.T ? 2131743346 : 2131743270, null)));
                    }
                    uz0Var2.y.s(12.0f);
                    uz0Var2.y.setPadding(org.telegram.messenger.g0.L((z10 || uz0Var2.P.G) ? 0.0f : 6.0f), 0, 0, 0);
                    if (uz0Var2.T) {
                        uz0Var2.y.p(0.5f, 0.0f);
                        uz0Var2.y.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        uz0Var2.y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        uz0Var2.y.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    uz0Var2.y.w(14.0f);
                    hi.l3 l3Var3 = uz0Var2.y;
                    l3Var3.h = hi.l3.a(l3Var3.getText(), uz0Var2.y.getTextPaint());
                    if (uz0Var2.T) {
                        viewGroup.addView(uz0Var2.y, c8.ma.d((int) ((uz0Var2.P.getWidth() / org.telegram.messenger.g0.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((uz0Var2.P.getHeight() + uz0Var2.L) / org.telegram.messenger.g0.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(uz0Var2.y, c8.ma.d((int) ((uz0Var2.P.getWidth() / org.telegram.messenger.g0.p) * 0.6f), 150.0f, 17, ((((uz0Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + uz0Var2.P.getBoundsLeft()) / org.telegram.messenger.g0.p) + 1.0f, ((-75.0f) - ((uz0Var2.P.getHeight() / org.telegram.messenger.g0.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    uz0Var2.y.x();
                }
                TextView textView = uz0Var2.E;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    uz0Var2.E = null;
                }
                TextView textView2 = new TextView(context);
                uz0Var2.E = textView2;
                textView2.setTextColor(-1);
                uz0Var2.E.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    uz0Var2.E.setBackground(org.telegram.ui.ActionBar.m6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    uz0Var2.E.setBackground(org.telegram.ui.ActionBar.m6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                uz0Var2.E.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                c8.ra.a(uz0Var2.E);
                uz0Var2.E.setText(org.telegram.messenger.hd.N0(z10 ? 2131743274 : 2131743271, null));
                uz0Var2.E.setOnClickListener(new qz0(uz0Var2, 1));
                viewGroup.addView(uz0Var2.E, c8.ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z10 && (sz0Var = uz0Var2.O) != null && sz0Var.getMessageObject() != null && uz0Var2.O.getMessageObject().k != null) {
                    uz0Var2.O.getMessageObject().k.media_unread = false;
                    uz0Var2.O.invalidate();
                }
                bn bnVar2 = this.a;
                bnVar2.showDialog(bnVar2.wa);
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
                bn bnVar3 = this.a;
                return B.o0(L, gjVar, bnVar3.d7, true ^ bnVar3.D0.O, null, bnVar3.x4 ? bnVar3.d() : 0L);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean U(org.telegram.ui.Cells.r1 r1Var) {
        int i7;
        org.telegram.messenger.gj messageObject;
        TLRPC.Message message;
        if (r1Var == null) {
            return false;
        }
        bn bnVar = this.a;
        if (bnVar.getParentActivity() == null) {
            return false;
        }
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        if (!org.telegram.messenger.np.u1(i7).B4() || (messageObject = r1Var.getMessageObject()) == null || (message = messageObject.k) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.L2 || message.translatedRichMessage == null) {
            return messageObject.u(bnVar.e);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void U1() {
        org.telegram.ui.ActionBar.h6 h6Var;
        bn bnVar = this.a;
        if (bnVar.m1 == null || bnVar.getParentActivity() == null) {
            return;
        }
        Context context = bnVar.m1.getContext();
        h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
        uy0.e1(context, bnVar, false, h6Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // org.telegram.ui.Cells.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V0(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        org.telegram.messenger.gj messageObject;
        org.telegram.messenger.bj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (org.telegram.messenger.gj) arrayList.get(0);
                if (messageObject != null) {
                    bn bnVar = this.a;
                    boolean z11 = !bnVar.Qc && messageObject.e1() == bnVar.Pc;
                    if (!z10) {
                        return z11;
                    }
                    if (z11 && System.currentTimeMillis() - bnVar.Rc > 1000) {
                        return true;
                    }
                }
                return false;
            }
        }
        messageObject = r1Var.getMessageObject();
        if (messageObject != null) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean W() {
        bn bnVar = this.a;
        return org.telegram.messenger.p10.A(bnVar.f) || org.telegram.messenger.p10.C(bnVar.f);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void W0(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar = this.a;
        bnVar.getNotificationCenter().k(org.telegram.messenger.ls.p3, Long.valueOf(bnVar.l6), r1Var);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void X(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.gj messageObject;
        if (chat == null) {
            return;
        }
        bn bnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (kVar.x() || bnVar.Y9()) {
            bn.k2(bnVar, r1Var, true, f10, f11);
            return;
        }
        if (z10 || !chat.signature_profiles || (messageObject = r1Var.getMessageObject()) == null || org.telegram.messenger.gj.B0(messageObject.k) == 1271266957) {
            j(r1Var, chat, i7, z10);
        } else {
            bnVar.Qa(org.telegram.messenger.n5.o(messageObject.k.from_id));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void X0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String O0 = org.telegram.messenger.hd.O0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
        if (TextUtils.isEmpty(O0)) {
            O0 = org.telegram.messenger.hd.N0(2131746398, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(O0);
        org.telegram.messenger.gj.d(spannableStringBuilder, false);
        org.telegram.messenger.bj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
        bn bnVar = this.a;
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
                        int childCount = bnVar.A0.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = bnVar.A0.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.r1) {
                                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                                if (gjVar.T(r1Var2.getMessageObject())) {
                                    r1Var = r1Var2;
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
        bnVar.qc(messageObject, spannableStringBuilder, 1);
        r1Var.I3(1, false, true);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void X1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        hi hiVar;
        int i7;
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        ai.c1 c1Var = null;
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
                        TLRPC.TL_message R7 = bn.R7(message);
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
                bn bnVar = this.a;
                p12.I2(null, bnVar, bnVar.Ba);
                PhotoViewer.p1().a2(arrayList, i10, this.a.a(), 0L, 0L, this.a.eb);
                return;
            }
            return;
        }
        bn bnVar2 = this.a;
        vf.b bVar = bnVar2.ec;
        if (bVar != null) {
            bVar.a(true);
            bnVar2.ec = null;
        }
        if (r1Var.getMessageObject() == null) {
            bnVar2.ec = null;
            hiVar = null;
        } else {
            hiVar = new hi(bnVar2, r1Var.getMessageObject().e1(), r1Var, 1);
            bnVar2.ec = hiVar;
        }
        i7 = ((org.telegram.ui.ActionBar.g2) this.a).currentAccount;
        di.y8 y10 = di.y8.y(i7, false);
        Objects.requireNonNull(hiVar);
        bh bhVar = new bh(hiVar, 8);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        org.telegram.ui.ActionBar.h6 I = di.y8.I();
        if (messageObject != null && context != null) {
            long B0 = org.telegram.messenger.gj.B0(messageObject.k);
            int e12 = messageObject.e1();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = org.telegram.messenger.np.u1(y10.a).l1(B0);
            tL_inputInvoiceMessage.msg_id = e12;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.s2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            c1Var = new ai.c1(y10, ConnectionsManager.getInstance(y10.a).sendRequest(tL_payments_getPaymentForm, new bi.k2(y10, messageObject, tL_inputInvoiceMessage, bhVar, 3)), 6);
        }
        if (c1Var != null) {
            hiVar.b = c1Var;
            hiVar.d();
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void Y(org.telegram.ui.Cells.r1 r1Var) {
        f(r1Var, true, true, false);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7;
        int i10;
        org.telegram.messenger.gc b10;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        bn bnVar = this.a;
        if (!isEmpty) {
            vf.c.t(bnVar.getParentActivity(), "https://" + bnVar.getMessagesController().X2 + "/nft/" + str);
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        ug.h1 h1Var = new ug.h1(bnVar, i7, user, null, null, bnVar.Ba);
        r1Var.getLocationOnScreen(new int[2]);
        h1Var.r2 = r1Var.getNameStatusX();
        h1Var.s2 = r1Var.getNameStatusY();
        h1Var.v2 = r1Var.getScaleX();
        h1Var.t2 = r1Var.getLeft();
        h1Var.u2 = r1Var.getTop();
        h1Var.w2 = r1Var;
        int f10 = org.telegram.messenger.p10.f(user);
        if (f10 < 7) {
            h1Var.q2 = Integer.valueOf(bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.r8[f10]));
        } else {
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(i10).t4;
            org.telegram.messenger.cp d = dpVar != null ? dpVar.d(f10) : null;
            h1Var.q2 = d != null ? Integer.valueOf(d.f()) : null;
        }
        org.telegram.ui.Components.n5 n5Var = r1Var.qa;
        if (n5Var != null && (n5Var.f[0] instanceof org.telegram.ui.Components.p5)) {
            h1Var.v2 *= 0.95f;
            if (document != null) {
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(bnVar.getParentActivity());
                org.telegram.messenger.mz d2 = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.m6.m6, 0.2f, false);
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
                q9Var.setLayerNum(7);
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                q9Var.m(gcVar, str3, org.telegram.messenger.gc.c(w10, document), "140_140", d2, document);
                if (org.telegram.messenger.gj.C4(document)) {
                    Integer num = h1Var.q2;
                    q9Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.v6), PorterDuff.Mode.SRC_IN));
                    h1Var.y2 = org.telegram.messenger.gj.i1(document);
                } else {
                    h1Var.y2 = org.telegram.messenger.gj.i1(document);
                }
                h1Var.x2 = q9Var;
                h1Var.A2 = true;
            }
        }
        bnVar.showDialog(h1Var);
    }

    @Override // org.telegram.ui.Cells.m1
    public final int Z() {
        return this.a.g4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09d6 A[LOOP:3: B:254:0x09d4->B:255:0x09d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0ae0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0974  */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.wr0] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, org.telegram.ui.Components.a70] */
    /* JADX WARN: Type inference failed for: r1v45, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.ViewGroup, org.telegram.ui.wr0] */
    /* JADX WARN: Type inference failed for: r7v100 */
    /* JADX WARN: Type inference failed for: r7v101 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v97 */
    /* JADX WARN: Type inference failed for: r8v19, types: [org.telegram.ui.Components.a70] */
    @Override // org.telegram.ui.Cells.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        as0 as0Var;
        TLRPC.PollAnswer pollAnswer2;
        as0 as0Var2;
        ViewGroup viewGroup;
        dh.c cVar;
        org.telegram.messenger.gj gjVar;
        TLRPC.ChatFull chatFull;
        boolean z10;
        boolean z11;
        boolean z12;
        as0 as0Var3;
        org.telegram.messenger.gj gjVar2;
        org.telegram.ui.Components.a70 a70Var;
        bn bnVar;
        boolean z13;
        me meVar;
        int i7;
        int size;
        int i10;
        ViewGroup viewGroup2;
        as0 as0Var4;
        boolean z14;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull P0;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z15;
        byte[] bArr;
        ViewGroup viewGroup3;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z16;
        as0 as0Var5;
        ArrayList arrayList;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        String str;
        boolean z17;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        String str2;
        boolean z18;
        int i11;
        sh.n nVar;
        String str3;
        boolean z19;
        ArrayList<TLRPC.PollAnswerVoters> arrayList2;
        bn bnVar2 = this.a;
        if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
            hi.l3 l3Var = bnVar2.M1;
            if (l3Var != null && l3Var.W) {
                l3Var.f(true);
            }
            al alVar = bnVar2.Q1;
            if (alVar != null && alVar.W) {
                alVar.f(true);
            }
            org.telegram.messenger.gj primaryMessageObject = r1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
                bnVar2.v5 = primaryMessageObject;
                bnVar2.w5 = null;
                as0 as0Var6 = new as0(bnVar2.getParentActivity(), bnVar2.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                as0Var6.M = r1Var;
                as0Var6.Q = bArr3;
                org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
                as0Var6.I = messageObject;
                as0Var6.J = messageObject != null && messageObject.P3();
                org.telegram.ui.Cells.r1 r1Var2 = as0Var6.M;
                ?? r72 = as0Var6.d;
                if (r1Var2 != null) {
                    as0Var6.N = bnVar2.P9 - org.telegram.messenger.g0.L(4.0f);
                    as0Var6.O = r1Var.n;
                    if (r1Var.getParent() instanceof View) {
                        View view = (View) r1Var.getParent();
                        as0Var6.N = view.getY() + as0Var6.N;
                        as0Var6.O = view.getY() + as0Var6.O;
                    }
                    int width = as0Var6.M.getWidth();
                    int height = as0Var6.M.getHeight();
                    as0Var6.M.getHeight();
                    yr0 yr0Var = new yr0(as0Var6, as0Var6.getContext(), org.telegram.messenger.k10.t0, as0Var6.M.getResourcesProvider(), bArr3, width, height);
                    as0Var = as0Var6;
                    as0Var.K = yr0Var;
                    as0Var.M.r0(yr0Var);
                    as0Var.K.s0(as0Var.M);
                    as0Var.K.setDelegate(new qb.a(19));
                    yr0 yr0Var2 = as0Var.K;
                    org.telegram.messenger.gj gjVar3 = as0Var.I;
                    org.telegram.messenger.bj currentMessagesGroup = as0Var.M.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.r1 r1Var3 = as0Var.M;
                    yr0Var2.y3(gjVar3, currentMessagesGroup, r1Var3.G, r1Var3.F, r1Var3.H, false);
                    yr0 yr0Var3 = as0Var.K;
                    yr0Var3.e6 = bArr3;
                    r72.addView(yr0Var3, new FrameLayout.LayoutParams(as0Var.M.getWidth(), height, 51));
                    zr0 zr0Var = new zr0(as0Var.getContext(), org.telegram.messenger.k10.t0, as0Var.M.getResourcesProvider(), width, height, 0);
                    as0Var.L = zr0Var;
                    as0Var.M.t0(zr0Var);
                    as0Var.M.r0(as0Var.L);
                    as0Var.L.s0(as0Var.M);
                    as0Var.L.setDelegate(new pb.b(19));
                    zr0 zr0Var2 = as0Var.L;
                    org.telegram.messenger.gj gjVar4 = as0Var.I;
                    org.telegram.messenger.bj currentMessagesGroup2 = as0Var.M.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.r1 r1Var4 = as0Var.M;
                    zr0Var2.y3(gjVar4, currentMessagesGroup2, r1Var4.G, r1Var4.F, r1Var4.H, false);
                    r72.addView(as0Var.L, new FrameLayout.LayoutParams(as0Var.M.getWidth(), height, 51));
                } else {
                    as0Var = as0Var6;
                }
                hi.i1 i1Var = as0Var.f;
                i1Var.bringToFront();
                ?? r13 = as0Var.e;
                r13.bringToFront();
                as0Var.n.bringToFront();
                i1Var.s(false);
                Context context = as0Var.a;
                View view2 = new View(context);
                org.telegram.ui.ActionBar.h6 h6Var = as0Var.b;
                ?? H = org.telegram.ui.Components.a70.H(r72, h6Var, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.gj.m1(as0Var.I);
                as0Var.W = org.telegram.messenger.gj.W4(tL_messageMediaPoll4);
                int i12 = 0;
                while (true) {
                    if (i12 >= tL_messageMediaPoll4.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll4.poll.answers.get(i12).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll4.poll.answers.get(i12);
                        break;
                    }
                    i12++;
                }
                dh.c cVar2 = as0Var.H;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll4.poll;
                    boolean z20 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z21 = poll.multiple_choice;
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll4.results;
                    if (pollResults == null || (arrayList2 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        z15 = z21;
                        bArr = bArr3;
                        viewGroup3 = r72;
                        pollAnswerVoters = null;
                        z16 = false;
                    } else {
                        int size2 = arrayList2.size();
                        z15 = z21;
                        int i13 = 0;
                        z16 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i13 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList2.get(i13);
                            int i14 = i13 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            ?? r32 = r72;
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
                                int i15 = 0;
                                while (i15 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList4.get(i15);
                                    int i16 = i15 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList5 = arrayList4;
                                    int i17 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList3.add(pollAnswer5);
                                    }
                                    arrayList4 = arrayList5;
                                    i15 = i16;
                                    size3 = i17;
                                }
                                r72 = r32;
                                i13 = i14;
                                bArr3 = bArr4;
                                tL_messageMediaPoll4 = tL_messageMediaPoll5;
                            } else {
                                r72 = r32;
                                i13 = i14;
                                bArr3 = bArr4;
                            }
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        viewGroup3 = r72;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !org.telegram.messenger.gj.A(tL_messageMediaPoll)) {
                        as0Var5 = as0Var;
                        arrayList = arrayList3;
                        gjVar = primaryMessageObject;
                        viewGroup = viewGroup3;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        sh.n nVar2 = new sh.n(bnVar2.getCurrentAccount(), context, h6Var);
                        org.telegram.ui.Components.a70 K = H.K();
                        K.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                        gh.e l10 = c8.i0.l(h6Var);
                        LinearLayout linearLayout = K.B;
                        if (linearLayout != null) {
                            nVar = nVar2;
                            str3 = null;
                            z19 = false;
                            fh.g c10 = cVar2.c(linearLayout, null, false);
                            c10.p(l10);
                            linearLayout.setBackground(c10);
                        } else {
                            nVar = nVar2;
                            str3 = null;
                            z19 = false;
                        }
                        K.c(R.drawable.ic_ab_back, org.telegram.messenger.hd.N0(2131753753, str3), new hq0(H, 27), z19);
                        K.k();
                        long B0 = org.telegram.messenger.gj.B0(as0Var.I.k);
                        int e12 = as0Var.I.e1();
                        int i18 = pollAnswerVoters.voters;
                        org.telegram.ui.Components.rh rhVar = new org.telegram.ui.Components.rh(23, as0Var, bnVar2);
                        as0Var5 = as0Var;
                        gjVar = primaryMessageObject;
                        arrayList = arrayList3;
                        viewGroup = viewGroup3;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        sh.n nVar3 = nVar;
                        org.telegram.ui.Components.h51 a10 = nVar3.a(bnVar2, B0, e12, bArr5, i18, rhVar);
                        bnVar2 = bnVar2;
                        bArr2 = bArr5;
                        K.q(a10);
                        nVar3.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
                        nVar3.setText(org.telegram.messenger.hd.G(pollAnswerVoters.voters, "PollVotesCount", new Object[0]));
                        nVar3.a.d(pollAnswerVoters.recent_voters, false);
                        nVar3.setLayoutParams(c8.ma.o(-1, 48));
                        int i19 = org.telegram.ui.ActionBar.m6.I5;
                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.x0(null, i19, false), 12, 0);
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i19);
                        nVar3.setBackground(a02);
                        org.telegram.ui.ActionBar.t6.j(nVar3, a02, null, M, null);
                        nVar3.setOnClickListener(new jg0(5, H, K));
                        H.q(nVar3);
                        H.k();
                    }
                    if (!z20) {
                        as0Var2 = as0Var5;
                        pollAnswer3 = pollAnswer2;
                        str = null;
                        z17 = false;
                    } else if (z16) {
                        str = null;
                        String N0 = org.telegram.messenger.hd.N0(2131743579, null);
                        as0Var2 = as0Var5;
                        bn bnVar3 = bnVar2;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        sr0 sr0Var = new sr0(as0Var2, z15, bnVar3, arrayList, pollAnswer6);
                        bnVar2 = bnVar3;
                        pollAnswer3 = pollAnswer6;
                        z17 = false;
                        H.c(R.drawable.msg_unvote, N0, sr0Var, false);
                    } else {
                        as0Var2 = as0Var5;
                        pollAnswer3 = pollAnswer2;
                        ArrayList arrayList6 = arrayList;
                        str = null;
                        z17 = false;
                        if (sh.g.a(as0Var2.I) == 0) {
                            H.c(R.drawable.msg_select, org.telegram.messenger.hd.N0(2131746962, null), new sr0(as0Var2, z15, pollAnswer3, bnVar2, arrayList6), false);
                        }
                    }
                    if (bnVar2.T6()) {
                        H.c(R.drawable.menu_reply, org.telegram.messenger.hd.N0(2131746976, str), new mc0(as0Var2, bnVar2, pollAnswer3, 23), z17);
                    }
                    if (org.telegram.messenger.gj.B0(as0Var2.I.k) >= 0 || pollAnswer3.option == null) {
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        str2 = null;
                        z18 = false;
                    } else {
                        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(as0Var2.I.K1);
                        tL_messageMediaPoll3 = tL_messageMediaPoll2;
                        String r10 = org.telegram.messenger.n5.r(u12.g2(org.telegram.messenger.gj.B0(as0Var2.I.k)));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(u12.X2);
                        sb2.append("/");
                        if (TextUtils.isEmpty(r10)) {
                            r10 = "c/" + (-org.telegram.messenger.gj.B0(as0Var2.I.k));
                        }
                        sb2.append(r10);
                        sb2.append("/");
                        sb2.append(as0Var2.I.e1());
                        sb2.append("?option=");
                        sb2.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        String sb3 = sb2.toString();
                        str2 = null;
                        z18 = false;
                        H.c(R.drawable.msg_link, org.telegram.messenger.hd.N0(2131751750, null), new tr0(0 == true ? 1 : 0, as0Var2, sb3), false);
                    }
                    H.c(R.drawable.msg_copy, org.telegram.messenger.hd.N0(2131751755, str2), new tr0(1, as0Var2, pollAnswer3), z18);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.n5.o(peer);
                        long e10 = org.telegram.messenger.k10.i(as0Var2.I.K1).e();
                        cVar = cVar2;
                        long currentTime = ConnectionsManager.getInstance(as0Var2.I.K1).getCurrentTime();
                        bn bnVar4 = bnVar2;
                        long n22 = org.telegram.messenger.np.u1(as0Var2.I.K1).A7.P.n2(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!org.telegram.messenger.gj.l3(as0Var2.I.k)) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll3.poll;
                            if (!poll2.closed && (poll2.creator || (o4 == e10 && currentTime < n22))) {
                                i11 = 2;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131751586, null), new tr0(i11, as0Var2, bArr2), true);
                                H.k();
                                TLObject g22 = org.telegram.messenger.np.u1(as0Var2.I.K1).g2(o4);
                                String u10 = org.telegram.messenger.n5.u(g22);
                                String x10 = org.telegram.messenger.hd.x(pollAnswer3.date, true);
                                Object[] objArr = new Object[i11];
                                objArr[0] = u10;
                                objArr[1] = x10;
                                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(org.telegram.messenger.hd.V(null, null, 2131746987, objArr));
                                bnVar2 = bnVar4;
                                g80 g80Var = new g80(as0Var2, o4, bnVar2, 2);
                                Context context2 = H.e;
                                ?? frameLayout = new FrameLayout(context2);
                                int i20 = org.telegram.ui.ActionBar.m6.i6;
                                org.telegram.ui.ActionBar.h6 h6Var2 = H.d;
                                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i20, h6Var2), 0, 12);
                                org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i20);
                                frameLayout.setBackground(a03);
                                org.telegram.ui.ActionBar.t6.j(frameLayout, a03, null, M2, h6Var2);
                                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context2);
                                q9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
                                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                                b9Var.l(g22);
                                q9Var.f(g22, b9Var);
                                frameLayout.addView(q9Var, c8.ma.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                                TextView textView = new TextView(context2);
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var2);
                                textView.setTextSize(1, 14.0f);
                                textView.setText(V2);
                                textView.setMaxWidth(org.telegram.messenger.g0.L(150.0f));
                                textView.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                                frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                                frameLayout.setOnClickListener(new org.telegram.ui.Components.m8(17, H, g80Var));
                                H.r(frameLayout, c8.ma.o(-1, -2));
                            }
                        }
                        i11 = 2;
                        H.k();
                        TLObject g222 = org.telegram.messenger.np.u1(as0Var2.I.K1).g2(o4);
                        String u102 = org.telegram.messenger.n5.u(g222);
                        String x102 = org.telegram.messenger.hd.x(pollAnswer3.date, true);
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = u102;
                        objArr2[1] = x102;
                        SpannableStringBuilder V22 = org.telegram.messenger.g0.V2(org.telegram.messenger.hd.V(null, null, 2131746987, objArr2));
                        bnVar2 = bnVar4;
                        g80 g80Var2 = new g80(as0Var2, o4, bnVar2, 2);
                        Context context22 = H.e;
                        ?? frameLayout2 = new FrameLayout(context22);
                        int i202 = org.telegram.ui.ActionBar.m6.i6;
                        org.telegram.ui.ActionBar.h6 h6Var22 = H.d;
                        org.telegram.ui.Cells.y a032 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i202, h6Var22), 0, 12);
                        org.telegram.ui.ActionBar.p6 M22 = org.telegram.ui.ActionBar.t6.M(i202);
                        frameLayout2.setBackground(a032);
                        org.telegram.ui.ActionBar.t6.j(frameLayout2, a032, null, M22, h6Var22);
                        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context22);
                        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
                        org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                        b9Var2.l(g222);
                        q9Var2.f(g222, b9Var2);
                        frameLayout2.addView(q9Var2, c8.ma.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView2 = new TextView(context22);
                        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.j5, h6Var22);
                        textView2.setTextSize(1, 14.0f);
                        textView2.setText(V22);
                        textView2.setMaxWidth(org.telegram.messenger.g0.L(150.0f));
                        textView2.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                        frameLayout2.addView(textView2, c8.ma.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout2.setOnClickListener(new org.telegram.ui.Components.m8(17, H, g80Var2));
                        H.r(frameLayout2, c8.ma.o(-1, -2));
                    } else {
                        cVar = cVar2;
                    }
                } else {
                    as0Var2 = as0Var;
                    viewGroup = r72;
                    cVar = cVar2;
                    gjVar = primaryMessageObject;
                }
                H.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                H.R(cVar, c8.i0.l(h6Var), false);
                H.Z();
                ViewGroup viewGroup4 = H.A;
                as0Var2.S = viewGroup4;
                viewGroup4.setPivotX(0.0f);
                as0Var2.S.setPivotY(0.0f);
                r13.addView(as0Var2.S, c8.ma.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                bnVar2.G8(gjVar, arrayList7, arrayList8, arrayList9);
                me meVar2 = new me(bnVar2, 9);
                org.telegram.messenger.gj gjVar5 = as0Var2.I;
                ArrayList arrayList10 = bnVar2.getMediaDataController().n;
                boolean z22 = (bnVar2.z() || bnVar2.c() || bnVar2.f != null || !gjVar5.w2() || (org.telegram.messenger.v3.T(bnVar2.e) && !bnVar2.e.megagroup) || org.telegram.messenger.v3.p0(bnVar2.e) || arrayList10.isEmpty() || !gjVar5.k.reactions.can_see_list || gjVar5.l4()) ? false : true;
                boolean z23 = !gjVar5.k3() ? gjVar5.l4() || bnVar2.g4 == 5 || bnVar2.z() || bnVar2.c() || !gjVar5.d4() || ((((chatFull = bnVar2.r8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.v3.T(bnVar2.e)) && bnVar2.f == null && !org.telegram.messenger.v3.p0(bnVar2.e))) || arrayList10.isEmpty()) : (P0 = bnVar2.getMessagesController().P0(-gjVar5.Z0())) != null && (bnVar2.z() || bnVar2.g4 == 5 || bnVar2.c() || !gjVar5.d4() || (((P0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !P0.paid_reactions_available) || arrayList10.isEmpty()));
                boolean z24 = (z22 || bnVar2.c() || bnVar2.e == null || !gjVar5.P3() || !gjVar5.q4() || gjVar5.Y2() || gjVar5.o4() || gjVar5.n4() || gjVar5.k.media_unread || gjVar5.F4() || ConnectionsManager.getInstance(bnVar2.getCurrentAccount()).getCurrentTime() - gjVar5.k.date >= bnVar2.getMessagesController().t3 || (!org.telegram.messenger.v3.n0(bnVar2.e) && org.telegram.messenger.v3.T(bnVar2.e)) || (chatFull2 = bnVar2.r8) == null || chatFull2.participants_count > bnVar2.getMessagesController().s3 || (gjVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || bnVar2.g4 == 3 || !gjVar5.z() || org.telegram.messenger.v3.p0(bnVar2.e)) ? false : true;
                if (bnVar2.e == null || gjVar5.N3() || !org.telegram.messenger.v3.p0(bnVar2.e) || !org.telegram.messenger.v3.A(bnVar2.getCurrentAccount(), bnVar2.e, 24)) {
                    z10 = z23;
                } else {
                    z10 = z23;
                    int i21 = ((-bnVar2.e.linked_monoforum_id) > gjVar5.Z0() ? 1 : ((-bnVar2.e.linked_monoforum_id) == gjVar5.Z0() ? 0 : -1));
                }
                if (!z22 && bnVar2.e == null && bnVar2.h == null && (user = bnVar2.f) != null && !org.telegram.messenger.p10.C(user) && !org.telegram.messenger.p10.A(bnVar2.f) && !org.telegram.messenger.p10.t(bnVar2.f)) {
                    TLRPC.User user2 = bnVar2.f;
                    if (!user2.bot && !org.telegram.messenger.p10.B(user2.id) && (((userFull = bnVar2.s8) == null || !userFull.read_dates_private) && !bnVar2.c() && gjVar5.P3() && gjVar5.q4() && !gjVar5.Y2() && !gjVar5.o4() && !gjVar5.n4() && !gjVar5.k.media_unread && !gjVar5.F4() && bnVar2.getConnectionsManager().getCurrentTime() - gjVar5.k.date < bnVar2.getMessagesController().u3 && !(gjVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z11 = true;
                        TLRPC.User user3 = bnVar2.f;
                        boolean z25 = ((user3 == null && (org.telegram.messenger.p10.A(user3) || org.telegram.messenger.p10.t(bnVar2.f))) || bnVar2.c() || !gjVar5.X2() || (gjVar5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        z12 = z24;
                        org.telegram.ui.Components.a70 H2 = org.telegram.ui.Components.a70.H(viewGroup, bnVar2.getResourceProvider(), null, !z22 || z24);
                        if (z12) {
                            as0Var3 = as0Var2;
                            gjVar2 = gjVar5;
                            a70Var = H2;
                            bnVar = bnVar2;
                            z13 = z10;
                            meVar = meVar2;
                            i7 = 24;
                            if (z11) {
                                a70Var.r(new org.telegram.ui.Components.za0(as0Var3.getContext(), 0, gjVar2, new qr0(as0Var3, 1), as0Var3.b), c8.ma.o(-1, 36));
                                a70Var.k();
                            } else if (z25) {
                                a70Var.r(new org.telegram.ui.Components.za0(as0Var3.getContext(), 1, gjVar2, new qr0(as0Var3, 2), as0Var3.b), c8.ma.o(-1, 36));
                                a70Var.k();
                            }
                        } else {
                            mf0 mf0Var = new mf0(as0Var2.getContext(), bnVar2.getCurrentAccount(), gjVar5, bnVar2.e);
                            FrameLayout frameLayout3 = new FrameLayout(as0Var2.getContext());
                            frameLayout3.addView(mf0Var, c8.ma.c(36.0f, -1));
                            ?? K2 = H2.K();
                            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, as0Var2.getContext(), as0Var2.b, true, false);
                            y0Var.setItemHeight(44);
                            as0 as0Var7 = as0Var2;
                            y0Var.j(org.telegram.messenger.hd.N0(2131753753, null), R.drawable.msg_arrow_back, null);
                            gjVar2 = gjVar5;
                            y0Var.getTextView().setPadding(org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                            FrameLayout frameLayout4 = new FrameLayout(as0Var7.getContext());
                            LinearLayout linearLayout2 = new LinearLayout(as0Var7.getContext());
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, linearLayout2, h6Var);
                            linearLayout2.setOrientation(1);
                            bn bnVar5 = bnVar2;
                            org.telegram.ui.Components.ek0 a11 = mf0Var.a();
                            frameLayout4.addView(y0Var);
                            linearLayout2.addView(frameLayout4);
                            z13 = z10;
                            linearLayout2.addView(new org.telegram.ui.ActionBar.d1(as0Var7.getContext(), h6Var), c8.ma.o(-1, 8));
                            frameLayout4.setOnClickListener(new ur0(H2, 0));
                            meVar = meVar2;
                            i7 = 24;
                            vr0 vr0Var = new vr0(as0Var7, mf0Var, bnVar5, a11, linearLayout2, H2, K2);
                            bnVar = bnVar5;
                            as0Var3 = as0Var7;
                            a70Var = H2;
                            mf0Var.setOnClickListener(vr0Var);
                            linearLayout2.addView(a11, c8.ma.o(-1, -2));
                            K2.q(linearLayout2);
                            a70Var.q(frameLayout3);
                            a70Var.k();
                        }
                        size = arrayList7.size();
                        for (i10 = 0; i10 < size; i10++) {
                            a70Var.c(((Integer) arrayList7.get(i10)).intValue(), (CharSequence) arrayList8.get(i10), new org.telegram.ui.Components.f21(as0Var3, meVar, ((Integer) arrayList9.get(i10)).intValue(), 10), false);
                        }
                        a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                        a70Var.R(cVar, c8.i0.l(h6Var), false);
                        a70Var.Z();
                        ViewGroup viewGroup5 = a70Var.A;
                        as0Var3.U = viewGroup5;
                        viewGroup5.setPivotX(0.0f);
                        as0Var3.U.setPivotY(0.0f);
                        r13.addView(as0Var3.U, c8.ma.e(-2, -2, 51));
                        viewGroup2 = as0Var3.U;
                        if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            int i22 = 5;
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup2).setOnSizeChangedListener(new qi0(as0Var3, i22));
                            as0Var3.U.setOnTouchListener(new c0(as0Var3, i22));
                        }
                        if (z13) {
                            as0Var4 = as0Var3;
                            z14 = true;
                        } else {
                            as0 as0Var8 = as0Var3;
                            bn bnVar6 = bnVar;
                            org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0((bnVar.getUserConfig().e() > bnVar.a() ? 1 : (bnVar.getUserConfig().e() == bnVar.a() ? 0 : -1)) == 0 ? 3 : 0, bnVar.getCurrentAccount(), as0Var3.getContext(), bnVar6, as0Var3.b);
                            xi0Var.a = true;
                            float f10 = 22;
                            xi0Var.setPadding(org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 0 : i7), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? i7 : 0), org.telegram.messenger.g0.L(f10));
                            as0Var4 = as0Var8;
                            org.telegram.messenger.gj gjVar6 = gjVar2;
                            xi0Var.setDelegate(new ab.c0(as0Var4, bnVar6, gjVar6, xi0Var, false, 10));
                            as0Var4.R = xi0Var;
                            r13.addView(xi0Var, c8.ma.e(-2, (int) ((xi0Var.getTopOffset() / org.telegram.messenger.g0.p) + 52.0f + f10), 51));
                            z14 = true;
                            xi0Var.p(gjVar6, bnVar6.r8, true);
                            as0Var4.R.setTransitionProgress(1.0f);
                        }
                        as0Var4.e();
                        as0Var4.f0 = new ul(this, 0);
                        as0Var4.show();
                        return z14;
                    }
                }
                z11 = false;
                TLRPC.User user32 = bnVar2.f;
                if (user32 == null) {
                }
                z12 = z24;
                org.telegram.ui.Components.a70 H22 = org.telegram.ui.Components.a70.H(viewGroup, bnVar2.getResourceProvider(), null, !z22 || z24);
                if (z12) {
                }
                size = arrayList7.size();
                while (i10 < size) {
                }
                a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                a70Var.R(cVar, c8.i0.l(h6Var), false);
                a70Var.Z();
                ViewGroup viewGroup52 = a70Var.A;
                as0Var3.U = viewGroup52;
                viewGroup52.setPivotX(0.0f);
                as0Var3.U.setPivotY(0.0f);
                r13.addView(as0Var3.U, c8.ma.e(-2, -2, 51));
                viewGroup2 = as0Var3.U;
                if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z13) {
                }
                as0Var4.e();
                as0Var4.f0 = new ul(this, 0);
                as0Var4.show();
                return z14;
            }
        }
        return false;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        bn bnVar = this.a;
        rj rjVar = bnVar.a0;
        if (rjVar != null) {
            CharSequence fieldText = rjVar.getFieldText();
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
            String K = org.telegram.messenger.v3.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                bnVar.a0.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.h3(new ul(this, 6), 200L);
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void a2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.j10 j10Var) {
        TLRPC.Message message;
        if (r1Var == null) {
            j10Var.run();
            return;
        }
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject == null || ((messageObject.o4() && !messageObject.Y2()) || (message = messageObject.k) == null || message.rich_message == null)) {
            j10Var.run();
        } else {
            org.telegram.ui.ActionBar.g2 g2Var = this.a;
            g2Var.getSendMessagesHelper().v(messageObject, messageObject.k.rich_message, null, g2Var, true);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        bn bnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (kVar2.x() || bnVar.Y9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void c() {
        this.a.m1.getClass();
    }

    @Override // org.telegram.ui.Cells.m1
    public final jh.a c0() {
        return this.a.uc;
    }

    @Override // org.telegram.ui.Cells.m1
    public final fr0 c2() {
        return this.a.Ta;
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        bn bnVar = this.a;
        rj rjVar = bnVar.a0;
        if (rjVar != null) {
            CharSequence fieldText = rjVar.getFieldText();
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
            String o4 = org.telegram.messenger.p10.o(user);
            if (o4 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) o4).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(p5.c.v(org.telegram.messenger.p10.k(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.v41("" + user.id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            bnVar.a0.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.h3(new ul(this, 7), 200L);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean d0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var == null ? null : r1Var.getMessageObject();
        if (messageObject == null || messageObject.k == null) {
            return false;
        }
        bn bnVar = this.a;
        return (bnVar.g4 == 1 || bnVar.W9() || messageObject.k.noforwards || messageObject.D == 29) ? false : true;
    }

    public final void e(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var;
        TLRPC.User currentUser = r1Var.getCurrentUser();
        bn bnVar = this.a;
        bnVar.getUserConfig().f();
        if (!org.telegram.messenger.g0.E1(bnVar.getParentActivity()) || (chat = bnVar.e) == null || currentUser == null || org.telegram.messenger.v3.V(chat)) {
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
                z10 = channelParticipant.promoted_by == bnVar.getUserConfig().e();
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
                    z11 = channelParticipant2.promoted_by == bnVar.getUserConfig().e();
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = bnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                long j3 = -bnVar.e.id;
                h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                org.telegram.ui.Components.py0.b(parentActivity, i7, j3, currentUser, str2, z15, z16, z12, h6Var);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (org.telegram.messenger.v3.T(bnVar.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    bnVar.getMessagesController();
                    tL_channels_getParticipant.channel = org.telegram.messenger.np.k1(bnVar.e);
                    tL_channels_getParticipant.participant = bnVar.getMessagesController().l1(currentUser.id);
                    bnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new bi.o6(15, this, r1Var));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z10 = false;
                z14 = true;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z10 = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == bnVar.getUserConfig().e();
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
        Activity parentActivity2 = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        long j32 = -bnVar.e.id;
        h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
        org.telegram.ui.Components.py0.b(parentActivity2, i7, j32, currentUser, str2, z152, z162, z12, h6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // org.telegram.ui.Cells.m1
    public final boolean e0(org.telegram.ui.Cells.r1 r1Var, final TLRPC.User user) {
        char c10;
        int i7;
        w4 b10;
        int i10;
        vj vjVar;
        uj ujVar;
        final int i11 = 0;
        if (!g()) {
            return false;
        }
        bn bnVar = this.a;
        final int i12 = 1;
        ?? r22 = (bnVar.e == null || ((vjVar = bnVar.d1) != null && vjVar.getVisibility() == 0) || ((ujVar = bnVar.T) != null && ujVar.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = bnVar.e;
        ?? r42 = (chat == null || !(bnVar.s4 == 0 || bnVar.x4) || (org.telegram.messenger.v3.T(chat) && !bnVar.e.megagroup)) ? 0 : 1;
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
        TLRPC.UserFull d2 = bnVar.getMessagesController().d2(user.id);
        if (d2 != null) {
            b10 = w4.c(user, d2, c5VarArr);
            if (!ab.q.h(b10)) {
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        } else {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            b10 = w4.b(user, i7, c5VarArr);
        }
        if (ab.q.h(b10)) {
            ab.q.o().D((ViewGroup) bnVar.fragmentView, bnVar.Ba, b10, new z6(this, r1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(bnVar, r1Var);
        I.c(R.drawable.msg_openprofile, org.telegram.messenger.hd.N0(2131747592, null), new Runnable(this) { // from class: org.telegram.ui.vl
            public final /* synthetic */ mm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.o(user, false);
                        break;
                    case 1:
                        this.b.d(user);
                        break;
                    default:
                        this.b.a.Pa(user);
                        break;
                }
            }
        }, false);
        I.c(R.drawable.msg_discussion, org.telegram.messenger.hd.N0(2131745405, null), new o1(this, r1Var, user, 24), false);
        I.l(R.drawable.msg_mention, org.telegram.messenger.hd.N0(2131748416, null), new Runnable(this) { // from class: org.telegram.ui.vl
            public final /* synthetic */ mm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.o(user, false);
                        break;
                    case 1:
                        this.b.d(user);
                        break;
                    default:
                        this.b.a.Pa(user);
                        break;
                }
            }
        }, r22);
        I.l(R.drawable.msg_search, org.telegram.messenger.hd.N0(2131753755, null), new Runnable(this) { // from class: org.telegram.ui.vl
            public final /* synthetic */ mm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.o(user, false);
                        break;
                    case 1:
                        this.b.d(user);
                        break;
                    default:
                        this.b.a.Pa(user);
                        break;
                }
            }
        }, r42);
        I.t = false;
        I.i = 3;
        I.Z = true;
        I.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.a0();
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void e2(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new qi.g(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.o10.t(null, 2131752010, org.telegram.ui.Components.lc.b0(this.a));
    }

    public final void f(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11, boolean z12) {
        org.telegram.messenger.gj primaryMessageObject;
        int i7;
        int i10;
        ej ejVar;
        if (r1Var == null || (primaryMessageObject = r1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        bn bnVar = this.a;
        bj bjVar = bnVar.A0;
        if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.y < 0) {
            for (int childCount = bjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = bnVar.A0.getChildAt(childCount);
                bnVar.A0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.r1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i10 = bnVar.h9(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.r1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = bnVar.h9(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        if (z10 && i7 >= 0 && r1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                ej ejVar2 = bnVar.C0;
                bnVar.A0.getClass();
                ejVar2.i1(RecyclerView.R(r1Var), r1Var.getTop() - ((int) bnVar.P9), false);
            } else {
                bnVar.C0.h1(i7, i10);
            }
        }
        bnVar.c1 = z11;
        bnVar.Zc(primaryMessageObject, false);
        bnVar.c1 = false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean f1(org.telegram.messenger.gj gjVar) {
        kl klVar;
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        bn bnVar = this.a;
        return (B0 == 1271266957 || ((klVar = bnVar.D0) != null && klVar.O)) && bnVar.g4 != 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    @Override // org.telegram.ui.Cells.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f2(long j3) {
        TLRPC.ChatFull P0;
        bn bnVar = this.a;
        TLRPC.Chat chat = bnVar.e;
        if (chat == null || org.telegram.messenger.v3.V(chat)) {
            return false;
        }
        org.telegram.messenger.np messagesController = bnVar.getMessagesController();
        long j10 = bnVar.e.id;
        if (j10 == j3) {
            messagesController.getClass();
            return true;
        }
        a0.h hVar = (a0.h) messagesController.A1.f(j10);
        if (hVar == null && (P0 = messagesController.P0(j10)) != null && P0.participants != null) {
            for (int i7 = 0; i7 < P0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = P0.participants.participants.get(i7);
                if (chatParticipant.user_id == j3) {
                    return (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                }
            }
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.f(j3);
        if ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
        }
    }

    public final boolean g() {
        bn bnVar = this.a;
        if (org.telegram.messenger.p10.C(bnVar.f)) {
            return true;
        }
        TLRPC.Chat chat = bnVar.e;
        if (chat != null) {
            return !org.telegram.messenger.v3.T(chat) || bnVar.e.megagroup;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0103, code lost:
    
        if (org.telegram.messenger.n5.o(r5) != r8.l6) goto L66;
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
    @Override // org.telegram.ui.Cells.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
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
        TLRPC.Chat O0;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        TLRPC.Chat O02;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        org.telegram.messenger.gj gjVar;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.k kVar;
        boolean b10 = b();
        bn bnVar = this.a;
        if (!b10 && !z10) {
            kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            if ((kVar.x() || bnVar.Y9()) && !bnVar.u9.z(r1Var.getMessageObject())) {
                bn.k2(bnVar, r1Var, !r1Var.E2(f10), f10, f11);
                return;
            }
            return;
        }
        if (org.telegram.messenger.p10.A(bnVar.f)) {
            s(r1Var);
            return;
        }
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        if (messageObject.f4() && (storyItem = (message3 = messageObject.k).replyStory) != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.f3.n(null, 2131744363, org.telegram.ui.Components.lc.b0(bnVar), R.raw.story_bomb1, 36);
                return;
            }
            storyItem.dialogId = org.telegram.messenger.n5.o(message3.reply_to.peer);
            storyItem.messageId = messageObject.e1();
            storyItem.messageType = 3;
            fi.i7.b(storyItem, bnVar.f);
            bnVar.getOrCreateStoryViewer().L(bnVar.getParentActivity(), storyItem, fi.y6.a(bnVar.A0));
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
            long j10 = bnVar.l6;
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
                                j10 = org.telegram.messenger.n5.o(peer2);
                            }
                            j3 = Long.MAX_VALUE;
                        } else {
                            TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                            if (peer3 != null) {
                                j10 = org.telegram.messenger.n5.o(peer3);
                            }
                            j3 = Long.MAX_VALUE;
                        }
                    }
                } else {
                    if (!(peer instanceof TLRPC.TL_peerUser)) {
                        long o4 = org.telegram.messenger.n5.o(peer);
                        z11 = true;
                        j3 = o4;
                        str3 = str2;
                        O0 = j3 >= 0 ? bnVar.getMessagesController().O0(Long.valueOf(-j3)) : null;
                        if (j3 != Long.MAX_VALUE) {
                            boolean z12 = z11;
                            if (j3 == bnVar.l6 || O0 == null || org.telegram.messenger.v3.t0(O0) || (!O0.left && !O0.kicked)) {
                                if (((j3 == bnVar.l6 && (!org.telegram.messenger.v3.c0(bnVar.e) || !z12)) || j3 == Long.MAX_VALUE) && (bnVar.g4 != 3 || ((gjVar = messageObject.C) != null && gjVar.P1() == bnVar.d()))) {
                                    int i10 = bnVar.g4;
                                    if (i10 == 2 || i10 == 1) {
                                        bnVar.n9.K0(i7);
                                        bnVar.finishFragment();
                                        return;
                                    }
                                    if (bArr != 0) {
                                        bnVar.j8 = bArr;
                                    } else if (num != null) {
                                        bnVar.i8 = num;
                                    } else {
                                        TLRPC.Message message5 = messageObject.k;
                                        if (message5 != null && (messageReplyHeader5 = message5.reply_to) != null && messageReplyHeader5.quote) {
                                            bnVar.f8 = true;
                                            bnVar.h8 = messageReplyHeader5.quote_text;
                                            bnVar.k8 = r9;
                                            bnVar.e8 = true;
                                        }
                                    }
                                    ai.i1 i1Var = new ai.i1(this, i7, messageObject, num, bArr, 14);
                                    if (!bnVar.D0.O) {
                                        i1Var.run();
                                        return;
                                    }
                                    bnVar.G3 = false;
                                    bnVar.Rb(false, true, false);
                                    bnVar.nd(bnVar.getMediaDataController().e0(), bnVar.getMediaDataController().f1, bnVar.getMediaDataController().l0());
                                    org.telegram.messenger.g0.h3(i1Var, 80L);
                                    return;
                                }
                                Integer num2 = num;
                                byte[] bArr3 = bArr;
                                if (LaunchActivity.H1 != null) {
                                    vf.b bVar = bnVar.ec;
                                    if (bVar != null) {
                                        bVar.a(false);
                                        bnVar.ec = null;
                                    }
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    final j0 j0Var = new j0(this, messageObject, r1Var);
                                    bnVar.ec = j0Var;
                                    int e12 = messageObject.e1();
                                    ArrayList arrayList = launchActivity.e0;
                                    if (j3 < 0 && (O02 = org.telegram.messenger.np.u1(launchActivity.P).O0(Long.valueOf(-j3))) != null && org.telegram.messenger.v3.c0(O02)) {
                                        j0Var.d();
                                        final int i11 = 0;
                                        launchActivity.l0(j3, Integer.valueOf(i7), str3, num2, bArr3, new Runnable() { // from class: org.telegram.ui.d70
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
                                        TLRPC.Chat O03 = org.telegram.messenger.np.u1(launchActivity.P).O0(Long.valueOf(j11));
                                        if (O03 != null && O03.forum) {
                                            final int i13 = 1;
                                            launchActivity.l0(j3, Integer.valueOf(i7), str5, num2, bArr3, new Runnable() { // from class: org.telegram.ui.d70
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
                                    org.telegram.ui.ActionBar.g2 g2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList) : null;
                                    if (g2Var == null || org.telegram.messenger.np.u1(launchActivity.P).E(bundle, g2Var, null, null)) {
                                        org.telegram.messenger.g0.g3(new c70(launchActivity, bundle, bArr3, i7, num2, str5, i12, j3, j0Var, g2Var));
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
                            org.telegram.ui.Components.lc.b0(bnVar).Q(R.raw.error, 36, org.telegram.messenger.hd.N0((message6 == null && (messageReplyHeader3 = message6.reply_to) != null && messageReplyHeader3.quote) ? (O0 == null || !O0.megagroup) ? org.telegram.messenger.v3.T(O0) ? 2131746236 : 2131746237 : 2131746235 : (O0 == null && O0.megagroup) ? 2131746060 : !org.telegram.messenger.v3.T(O0) ? 2131746061 : 2131746062, null)).k(true);
                        } else {
                            messageObject.d1 = true;
                            bnVar.Yc(messageObject, true);
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
                org.telegram.ui.Components.lc.b0(bnVar).Q(R.raw.error, 36, org.telegram.messenger.hd.N0((message62 == null && (messageReplyHeader3 = message62.reply_to) != null && messageReplyHeader3.quote) ? (O0 == null || !O0.megagroup) ? org.telegram.messenger.v3.T(O0) ? 2131746236 : 2131746237 : 2131746235 : (O0 == null && O0.megagroup) ? 2131746060 : !org.telegram.messenger.v3.T(O0) ? 2131746061 : 2131746062, null)).k(true);
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
            org.telegram.ui.Components.lc.b0(bnVar).Q(R.raw.error, 36, org.telegram.messenger.hd.N0((message622 == null && (messageReplyHeader3 = message622.reply_to) != null && messageReplyHeader3.quote) ? (O0 == null || !O0.megagroup) ? org.telegram.messenger.v3.T(O0) ? 2131746236 : 2131746237 : 2131746235 : (O0 == null && O0.megagroup) ? 2131746060 : !org.telegram.messenger.v3.T(O0) ? 2131746061 : 2131746062, null)).k(true);
        }
        num = Integer.valueOf(messageReplyHeader7.todo_item_id);
        str = null;
        str2 = str;
        bArr = str;
        long j102 = bnVar.l6;
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
        org.telegram.ui.Components.lc.b0(bnVar).Q(R.raw.error, 36, org.telegram.messenger.hd.N0((message6222 == null && (messageReplyHeader3 = message6222.reply_to) != null && messageReplyHeader3.quote) ? (O0 == null || !O0.megagroup) ? org.telegram.messenger.v3.T(O0) ? 2131746236 : 2131746237 : 2131746235 : (O0 == null && O0.megagroup) ? 2131746060 : !org.telegram.messenger.v3.T(O0) ? 2131746061 : 2131746062, null)).k(true);
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void h0(int i7) {
        int i10;
        SpannableStringBuilder W2;
        int i11;
        int i12 = 3;
        int i13 = 2;
        int i14 = 1;
        bn bnVar = this.a;
        try {
            if (i7 == 0) {
                bnVar.w7();
                nk nkVar = bnVar.O3;
                if (nkVar == null) {
                    return;
                }
                nkVar.l(0L, 84, null, new ul(this, i14));
                bnVar.O3.performHapticFeedback(3, 2);
                return;
            }
            if (i7 == 1) {
                String x10 = org.telegram.messenger.hd.x(bnVar.getMessagesController().x4, true);
                if (bnVar.getMessagesController().x4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(org.telegram.ui.Components.j21.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(org.telegram.ui.Components.j21.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.lc.b0(bnVar).G(R.raw.transcribe, 6, W2).k(true);
                bnVar.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i7 == 2 || i7 == 3) {
                String x11 = org.telegram.messenger.hd.x(bnVar.getMessagesController().x4, true);
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(bnVar.getMessagesController().v4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ").append(i7 == 2 ? org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131743723, null), new ul(this, i13)) : bnVar.getMessagesController().x4 <= 0 ? "" : org.telegram.messenger.g0.T2(org.telegram.messenger.hd.a0(null, null, 2131743722, x11), new ul(this, i12)));
                b02.getClass();
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(b02.X(), b02.c);
                obVar.c(R.raw.transcribe, 36, 36, new String[0]);
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
                obVar.b.setText(append);
                obVar.b.setSingleLine(false);
                obVar.b.setMaxLines(6);
                b02.b(obVar, 7000).k(true);
                org.telegram.messenger.q2.E.a();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0822 A[LOOP:2: B:230:0x0820->B:231:0x0822, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0491  */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    @Override // org.telegram.ui.Cells.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        f81 f81Var;
        TLRPC.TodoItem todoItem2;
        final int i7;
        TLRPC.TodoCompletion todoCompletion;
        f81 f81Var2;
        org.telegram.messenger.gj gjVar;
        String str;
        boolean z10;
        final ?? r10;
        f81 f81Var3;
        int i10;
        org.telegram.messenger.gj gjVar2;
        boolean z11;
        TLRPC.ChatFull chatFull;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.messenger.gj gjVar3;
        ArrayList arrayList;
        bn bnVar;
        ArrayList arrayList2;
        org.telegram.ui.Components.a70 a70Var;
        boolean z15;
        dh.c cVar;
        i81 i81Var;
        me meVar;
        int size;
        int i11;
        ViewGroup viewGroup;
        i81 i81Var2;
        boolean z16;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull P0;
        String str2;
        boolean z17;
        final int i12;
        String str3;
        Calendar calendar;
        int i13;
        int i14;
        int i15;
        final bn bnVar2 = this.a;
        if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
            hi.l3 l3Var = bnVar2.M1;
            if (l3Var != null && l3Var.W) {
                l3Var.f(true);
            }
            al alVar = bnVar2.Q1;
            if (alVar != null && alVar.W) {
                alVar.f(true);
            }
            org.telegram.messenger.gj primaryMessageObject = r1Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m12 instanceof TLRPC.TL_messageMediaToDo)) {
                bnVar2.v5 = primaryMessageObject;
                bnVar2.w5 = null;
                final i81 i81Var3 = new i81(bnVar2.getParentActivity(), bnVar2.getResourceProvider());
                final int i16 = todoItem.id;
                i81Var3.L = r1Var;
                i81Var3.P = i16;
                org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
                i81Var3.H = messageObject;
                i81Var3.I = messageObject != null && messageObject.P3();
                org.telegram.ui.Cells.r1 r1Var2 = i81Var3.L;
                f81 f81Var4 = i81Var3.c;
                if (r1Var2 != null) {
                    i81Var3.M = bnVar2.P9 - org.telegram.messenger.g0.L(4.0f);
                    i81Var3.N = r1Var.n;
                    if (r1Var.getParent() instanceof View) {
                        View view = (View) r1Var.getParent();
                        i81Var3.M = view.getY() + i81Var3.M;
                        i81Var3.N = view.getY() + i81Var3.N;
                    }
                    int width = i81Var3.L.getWidth();
                    int height = i81Var3.L.getHeight();
                    i81Var3.L.getHeight();
                    f81Var = f81Var4;
                    g81 g81Var = new g81(i81Var3, i81Var3.getContext(), org.telegram.messenger.k10.t0, i81Var3.L.getResourcesProvider(), i16, width, height);
                    i81Var3.J = g81Var;
                    i81Var3.L.r0(g81Var);
                    i81Var3.J.s0(i81Var3.L);
                    i81Var3.J.setDelegate(new h81(i81Var3));
                    g81 g81Var2 = i81Var3.J;
                    org.telegram.messenger.gj gjVar4 = i81Var3.H;
                    org.telegram.messenger.bj currentMessagesGroup = i81Var3.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.r1 r1Var3 = i81Var3.L;
                    g81Var2.y3(gjVar4, currentMessagesGroup, r1Var3.G, r1Var3.F, r1Var3.H, false);
                    f81Var.addView(i81Var3.J, new FrameLayout.LayoutParams(i81Var3.L.getWidth(), height, 51));
                    zr0 zr0Var = new zr0(i81Var3.getContext(), org.telegram.messenger.k10.t0, i81Var3.L.getResourcesProvider(), width, height, 1);
                    i81Var3.K = zr0Var;
                    i81Var3.L.t0(zr0Var);
                    i81Var3.L.r0(i81Var3.K);
                    i81Var3.K.s0(i81Var3.L);
                    i81Var3.K.setDelegate(new qb.a(20));
                    zr0 zr0Var2 = i81Var3.K;
                    org.telegram.messenger.gj gjVar5 = i81Var3.H;
                    org.telegram.messenger.bj currentMessagesGroup2 = i81Var3.L.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.r1 r1Var4 = i81Var3.L;
                    zr0Var2.y3(gjVar5, currentMessagesGroup2, r1Var4.G, r1Var4.F, r1Var4.H, false);
                    f81Var.addView(i81Var3.K, new FrameLayout.LayoutParams(i81Var3.L.getWidth(), height, 51));
                } else {
                    f81Var = f81Var4;
                }
                hi.i1 i1Var = i81Var3.e;
                i1Var.bringToFront();
                f81 f81Var5 = i81Var3.d;
                f81Var5.bringToFront();
                i81Var3.h.bringToFront();
                i1Var.s(false);
                org.telegram.ui.ActionBar.h6 h6Var = i81Var3.a;
                org.telegram.ui.Components.a70 G = org.telegram.ui.Components.a70.G(f81Var, h6Var, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) org.telegram.messenger.gj.m1(i81Var3.H);
                int i17 = 0;
                while (true) {
                    if (i17 >= tL_messageMediaToDo.todo.list.size()) {
                        todoItem2 = null;
                        i7 = -1;
                        break;
                    }
                    if (tL_messageMediaToDo.todo.list.get(i17).id == i16) {
                        todoItem2 = tL_messageMediaToDo.todo.list.get(i17);
                        i7 = i17;
                        break;
                    }
                    i17++;
                }
                int i18 = 0;
                while (true) {
                    if (i18 >= tL_messageMediaToDo.completions.size()) {
                        todoCompletion = null;
                        break;
                    }
                    if (tL_messageMediaToDo.completions.get(i18).id == i16) {
                        todoCompletion = tL_messageMediaToDo.completions.get(i18);
                        break;
                    }
                    i18++;
                }
                if (!i81Var3.H.q()) {
                    f81Var2 = f81Var;
                    gjVar = primaryMessageObject;
                    str = null;
                    z10 = false;
                } else if (todoCompletion != null) {
                    long j3 = todoCompletion.date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        f81Var2 = f81Var;
                    } catch (Exception e10) {
                        e = e10;
                        f81Var2 = f81Var;
                    }
                    try {
                        i13 = calendar.get(6);
                        i14 = calendar.get(1);
                        calendar.setTimeInMillis(j3);
                        i15 = calendar.get(6);
                        gjVar = primaryMessageObject;
                    } catch (Exception e11) {
                        e = e11;
                        gjVar = primaryMessageObject;
                        i12 = 1;
                        org.telegram.messenger.a8.g(e, true);
                        str3 = "LOC_ERR";
                        G.p(14, -1, str3);
                        G.k();
                        str = null;
                        z10 = false;
                        G.c(R.drawable.msg_cancel, org.telegram.messenger.hd.N0(2131743809, null), new Runnable() { // from class: org.telegram.ui.c81
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i19 = i12;
                                int i20 = i16;
                                bn bnVar3 = bnVar2;
                                i81 i81Var4 = i81Var3;
                                switch (i19) {
                                    case 0:
                                        pr0 pr0Var = new pr0(bnVar3);
                                        pr0Var.u0(org.telegram.messenger.gj.m1(i81Var4.H), false, i20);
                                        pr0Var.f0 = new aj0(22, i81Var4, bnVar3);
                                        bnVar3.presentFragment(pr0Var);
                                        i81Var4.c(false);
                                        break;
                                    case 1:
                                        if (bnVar3.c()) {
                                            Toast.makeText(i81Var4.getContext(), org.telegram.messenger.hd.N0(2131748300, null), 1).show();
                                        } else {
                                            g81 g81Var3 = i81Var4.J;
                                            g81Var3.O3(g81Var3.c2(i20), false);
                                        }
                                        i81Var4.c(true);
                                        break;
                                    default:
                                        if (bnVar3.c()) {
                                            Toast.makeText(i81Var4.getContext(), org.telegram.messenger.hd.N0(2131748300, null), 1).show();
                                        } else {
                                            g81 g81Var4 = i81Var4.J;
                                            g81Var4.O3(g81Var4.c2(i20), false);
                                        }
                                        i81Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        int i19 = 5;
                        if (todoItem2 != null) {
                        }
                        if (i81Var3.H.u(bnVar2.e)) {
                        }
                        f81Var3 = f81Var2;
                        i10 = 51;
                        G.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                        gh.e l10 = c8.i0.l(h6Var);
                        dh.c cVar2 = i81Var3.G;
                        G.R(cVar2, l10, r10);
                        G.Z();
                        ViewGroup viewGroup2 = G.A;
                        i81Var3.R = viewGroup2;
                        viewGroup2.setPivotX(0.0f);
                        i81Var3.R.setPivotY(0.0f);
                        f81Var5.addView(i81Var3.R, c8.ma.e(-2, -2, i10));
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        bnVar2.G8(gjVar, arrayList3, arrayList4, arrayList5);
                        me meVar2 = new me(bnVar2, 10);
                        gjVar2 = i81Var3.H;
                        ArrayList arrayList6 = bnVar2.getMediaDataController().n;
                        if (bnVar2.z()) {
                        }
                        if (gjVar2.k3()) {
                        }
                        if (!z11) {
                        }
                        if (bnVar2.e == null) {
                        }
                        z13 = z12;
                        if (!z11) {
                        }
                        z14 = false;
                        TLRPC.User user3 = bnVar2.f;
                        if (user3 == null) {
                        }
                        org.telegram.ui.Components.a70 H = org.telegram.ui.Components.a70.H(f81Var3, bnVar2.getResourceProvider(), null, !z11 || z13);
                        if (z13) {
                        }
                        size = arrayList3.size();
                        while (i11 < size) {
                        }
                        a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                        a70Var.R(cVar, c8.i0.l(h6Var), false);
                        a70Var.Z();
                        ViewGroup viewGroup3 = a70Var.A;
                        i81Var.T = viewGroup3;
                        viewGroup3.setPivotX(0.0f);
                        i81Var.T.setPivotY(0.0f);
                        f81Var5.addView(i81Var.T, c8.ma.e(-2, -2, 51));
                        viewGroup = i81Var.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        i81Var2.e();
                        i81Var2.d0 = new ul(this, 5);
                        i81Var2.show();
                        return z16;
                    }
                    try {
                        int i20 = calendar.get(1);
                        str3 = (i15 == i13 && i14 == i20) ? org.telegram.messenger.hd.a0(null, null, 2131743838, org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : (i15 + 1 == i13 && i14 == i20) ? org.telegram.messenger.hd.a0(null, null, 2131743837, org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : Math.abs(System.currentTimeMillis() - j3) < 31536000000L ? org.telegram.messenger.hd.a0(null, null, 2131743839, org.telegram.messenger.hd.E0().q0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : org.telegram.messenger.hd.a0(null, null, 2131743839, org.telegram.messenger.hd.E0().C0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3)));
                        i12 = 1;
                    } catch (Exception e12) {
                        e = e12;
                        i12 = 1;
                        org.telegram.messenger.a8.g(e, true);
                        str3 = "LOC_ERR";
                        G.p(14, -1, str3);
                        G.k();
                        str = null;
                        z10 = false;
                        G.c(R.drawable.msg_cancel, org.telegram.messenger.hd.N0(2131743809, null), new Runnable() { // from class: org.telegram.ui.c81
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i192 = i12;
                                int i202 = i16;
                                bn bnVar3 = bnVar2;
                                i81 i81Var4 = i81Var3;
                                switch (i192) {
                                    case 0:
                                        pr0 pr0Var = new pr0(bnVar3);
                                        pr0Var.u0(org.telegram.messenger.gj.m1(i81Var4.H), false, i202);
                                        pr0Var.f0 = new aj0(22, i81Var4, bnVar3);
                                        bnVar3.presentFragment(pr0Var);
                                        i81Var4.c(false);
                                        break;
                                    case 1:
                                        if (bnVar3.c()) {
                                            Toast.makeText(i81Var4.getContext(), org.telegram.messenger.hd.N0(2131748300, null), 1).show();
                                        } else {
                                            g81 g81Var3 = i81Var4.J;
                                            g81Var3.O3(g81Var3.c2(i202), false);
                                        }
                                        i81Var4.c(true);
                                        break;
                                    default:
                                        if (bnVar3.c()) {
                                            Toast.makeText(i81Var4.getContext(), org.telegram.messenger.hd.N0(2131748300, null), 1).show();
                                        } else {
                                            g81 g81Var4 = i81Var4.J;
                                            g81Var4.O3(g81Var4.c2(i202), false);
                                        }
                                        i81Var4.c(true);
                                        break;
                                }
                            }
                        }, false);
                        int i192 = 5;
                        if (todoItem2 != null) {
                        }
                        if (i81Var3.H.u(bnVar2.e)) {
                        }
                        f81Var3 = f81Var2;
                        i10 = 51;
                        G.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                        gh.e l102 = c8.i0.l(h6Var);
                        dh.c cVar22 = i81Var3.G;
                        G.R(cVar22, l102, r10);
                        G.Z();
                        ViewGroup viewGroup22 = G.A;
                        i81Var3.R = viewGroup22;
                        viewGroup22.setPivotX(0.0f);
                        i81Var3.R.setPivotY(0.0f);
                        f81Var5.addView(i81Var3.R, c8.ma.e(-2, -2, i10));
                        ArrayList arrayList32 = new ArrayList();
                        ArrayList arrayList42 = new ArrayList();
                        ArrayList arrayList52 = new ArrayList();
                        bnVar2.G8(gjVar, arrayList32, arrayList42, arrayList52);
                        me meVar22 = new me(bnVar2, 10);
                        gjVar2 = i81Var3.H;
                        ArrayList arrayList62 = bnVar2.getMediaDataController().n;
                        if (bnVar2.z()) {
                        }
                        if (gjVar2.k3()) {
                        }
                        if (!z11) {
                        }
                        if (bnVar2.e == null) {
                        }
                        z13 = z12;
                        if (!z11) {
                        }
                        z14 = false;
                        TLRPC.User user32 = bnVar2.f;
                        if (user32 == null) {
                        }
                        org.telegram.ui.Components.a70 H2 = org.telegram.ui.Components.a70.H(f81Var3, bnVar2.getResourceProvider(), null, !z11 || z13);
                        if (z13) {
                        }
                        size = arrayList32.size();
                        while (i11 < size) {
                        }
                        a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                        a70Var.R(cVar, c8.i0.l(h6Var), false);
                        a70Var.Z();
                        ViewGroup viewGroup32 = a70Var.A;
                        i81Var.T = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        i81Var.T.setPivotY(0.0f);
                        f81Var5.addView(i81Var.T, c8.ma.e(-2, -2, 51));
                        viewGroup = i81Var.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        i81Var2.e();
                        i81Var2.d0 = new ul(this, 5);
                        i81Var2.show();
                        return z16;
                    }
                    G.p(14, -1, str3);
                    G.k();
                    str = null;
                    z10 = false;
                    G.c(R.drawable.msg_cancel, org.telegram.messenger.hd.N0(2131743809, null), new Runnable() { // from class: org.telegram.ui.c81
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i1922 = i12;
                            int i202 = i16;
                            bn bnVar3 = bnVar2;
                            i81 i81Var4 = i81Var3;
                            switch (i1922) {
                                case 0:
                                    pr0 pr0Var = new pr0(bnVar3);
                                    pr0Var.u0(org.telegram.messenger.gj.m1(i81Var4.H), false, i202);
                                    pr0Var.f0 = new aj0(22, i81Var4, bnVar3);
                                    bnVar3.presentFragment(pr0Var);
                                    i81Var4.c(false);
                                    break;
                                case 1:
                                    if (bnVar3.c()) {
                                        Toast.makeText(i81Var4.getContext(), org.telegram.messenger.hd.N0(2131748300, null), 1).show();
                                    } else {
                                        g81 g81Var3 = i81Var4.J;
                                        g81Var3.O3(g81Var3.c2(i202), false);
                                    }
                                    i81Var4.c(true);
                                    break;
                                default:
                                    if (bnVar3.c()) {
                                        Toast.makeText(i81Var4.getContext(), org.telegram.messenger.hd.N0(2131748300, null), 1).show();
                                    } else {
                                        g81 g81Var4 = i81Var4.J;
                                        g81Var4.O3(g81Var4.c2(i202), false);
                                    }
                                    i81Var4.c(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    f81Var2 = f81Var;
                    gjVar = primaryMessageObject;
                    str = null;
                    z10 = false;
                    final int i21 = 2;
                    G.c(R.drawable.msg_select, org.telegram.messenger.hd.N0(2131743846, null), new Runnable() { // from class: org.telegram.ui.c81
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i1922 = i21;
                            int i202 = i16;
                            bn bnVar3 = bnVar2;
                            i81 i81Var4 = i81Var3;
                            switch (i1922) {
                                case 0:
                                    pr0 pr0Var = new pr0(bnVar3);
                                    pr0Var.u0(org.telegram.messenger.gj.m1(i81Var4.H), false, i202);
                                    pr0Var.f0 = new aj0(22, i81Var4, bnVar3);
                                    bnVar3.presentFragment(pr0Var);
                                    i81Var4.c(false);
                                    break;
                                case 1:
                                    if (bnVar3.c()) {
                                        Toast.makeText(i81Var4.getContext(), org.telegram.messenger.hd.N0(2131748300, null), 1).show();
                                    } else {
                                        g81 g81Var3 = i81Var4.J;
                                        g81Var3.O3(g81Var3.c2(i202), false);
                                    }
                                    i81Var4.c(true);
                                    break;
                                default:
                                    if (bnVar3.c()) {
                                        Toast.makeText(i81Var4.getContext(), org.telegram.messenger.hd.N0(2131748300, null), 1).show();
                                    } else {
                                        g81 g81Var4 = i81Var4.J;
                                        g81Var4.O3(g81Var4.c2(i202), false);
                                    }
                                    i81Var4.c(true);
                                    break;
                            }
                        }
                    }, false);
                }
                int i1922 = 5;
                if (todoItem2 != null) {
                    G.c(R.drawable.menu_reply, org.telegram.messenger.hd.N0(2131743830, str), new v21(i81Var3, bnVar2, todoItem2, i1922), z10);
                    if (org.telegram.messenger.gj.B0(i81Var3.H.k) < 0) {
                        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i81Var3.H.K1);
                        String r11 = org.telegram.messenger.n5.r(u12.g2(org.telegram.messenger.gj.B0(i81Var3.H.k)));
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(u12.X2);
                        sb2.append("/");
                        if (TextUtils.isEmpty(r11)) {
                            r11 = "c/" + (-org.telegram.messenger.gj.B0(i81Var3.H.k));
                        }
                        sb2.append(r11);
                        sb2.append("/");
                        sb2.append(i81Var3.H.e1());
                        sb2.append("?task=");
                        sb2.append(todoItem2.id);
                        String sb3 = sb2.toString();
                        str2 = null;
                        z17 = false;
                        G.c(R.drawable.msg_link, org.telegram.messenger.hd.N0(2131751750, null), new mz0(11, i81Var3, sb3), false);
                    } else {
                        str2 = null;
                        z17 = false;
                    }
                    G.c(R.drawable.msg_copy, org.telegram.messenger.hd.N0(2131751755, str2), new mz0(12, i81Var3, todoItem2), z17);
                    r10 = z17;
                } else {
                    r10 = z10;
                }
                if (i81Var3.H.u(bnVar2.e)) {
                    G.c(R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131743833, null), new Runnable() { // from class: org.telegram.ui.c81
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i19222 = r10;
                            int i202 = i7;
                            bn bnVar3 = bnVar2;
                            i81 i81Var4 = i81Var3;
                            switch (i19222) {
                                case 0:
                                    pr0 pr0Var = new pr0(bnVar3);
                                    pr0Var.u0(org.telegram.messenger.gj.m1(i81Var4.H), false, i202);
                                    pr0Var.f0 = new aj0(22, i81Var4, bnVar3);
                                    bnVar3.presentFragment(pr0Var);
                                    i81Var4.c(false);
                                    break;
                                case 1:
                                    if (bnVar3.c()) {
                                        Toast.makeText(i81Var4.getContext(), org.telegram.messenger.hd.N0(2131748300, null), 1).show();
                                    } else {
                                        g81 g81Var3 = i81Var4.J;
                                        g81Var3.O3(g81Var3.c2(i202), false);
                                    }
                                    i81Var4.c(true);
                                    break;
                                default:
                                    if (bnVar3.c()) {
                                        Toast.makeText(i81Var4.getContext(), org.telegram.messenger.hd.N0(2131748300, null), 1).show();
                                    } else {
                                        g81 g81Var4 = i81Var4.J;
                                        g81Var4.O3(g81Var4.c2(i202), false);
                                    }
                                    i81Var4.c(true);
                                    break;
                            }
                        }
                    }, r10);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        f81Var3 = f81Var2;
                        i10 = 51;
                        G.c(R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131743834, null), new org.telegram.ui.Components.lp0(i81Var3, tL_messageMediaToDo, i16, bnVar2, 18), r10);
                        G.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                        gh.e l1022 = c8.i0.l(h6Var);
                        dh.c cVar222 = i81Var3.G;
                        G.R(cVar222, l1022, r10);
                        G.Z();
                        ViewGroup viewGroup222 = G.A;
                        i81Var3.R = viewGroup222;
                        viewGroup222.setPivotX(0.0f);
                        i81Var3.R.setPivotY(0.0f);
                        f81Var5.addView(i81Var3.R, c8.ma.e(-2, -2, i10));
                        ArrayList arrayList322 = new ArrayList();
                        ArrayList arrayList422 = new ArrayList();
                        ArrayList arrayList522 = new ArrayList();
                        bnVar2.G8(gjVar, arrayList322, arrayList422, arrayList522);
                        me meVar222 = new me(bnVar2, 10);
                        gjVar2 = i81Var3.H;
                        ArrayList arrayList622 = bnVar2.getMediaDataController().n;
                        z11 = bnVar2.z() && !bnVar2.c() && bnVar2.f == null && gjVar2.w2() && !((org.telegram.messenger.v3.T(bnVar2.e) && !bnVar2.e.megagroup) || org.telegram.messenger.v3.p0(bnVar2.e) || arrayList622.isEmpty() || !gjVar2.k.reactions.can_see_list || gjVar2.l4());
                        boolean z18 = gjVar2.k3() ? !(gjVar2.l4() || bnVar2.g4 == 5 || bnVar2.z() || bnVar2.c() || !gjVar2.d4() || ((((chatFull = bnVar2.r8) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || org.telegram.messenger.v3.T(bnVar2.e)) && bnVar2.f == null && !org.telegram.messenger.v3.p0(bnVar2.e))) || arrayList622.isEmpty())) : !((P0 = bnVar2.getMessagesController().P0(-gjVar2.Z0())) != null && (bnVar2.z() || bnVar2.g4 == 5 || bnVar2.c() || !gjVar2.d4() || (((P0.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !P0.paid_reactions_available) || arrayList622.isEmpty())));
                        z12 = (!z11 || bnVar2.c() || bnVar2.e == null || !gjVar2.P3() || !gjVar2.q4() || gjVar2.Y2() || gjVar2.o4() || gjVar2.n4() || gjVar2.k.media_unread || gjVar2.F4() || ConnectionsManager.getInstance(bnVar2.getCurrentAccount()).getCurrentTime() - gjVar2.k.date >= bnVar2.getMessagesController().t3 || (!org.telegram.messenger.v3.n0(bnVar2.e) && org.telegram.messenger.v3.T(bnVar2.e)) || (chatFull2 = bnVar2.r8) == null || chatFull2.participants_count > bnVar2.getMessagesController().s3 || (gjVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || bnVar2.g4 == 3 || !gjVar2.z() || org.telegram.messenger.v3.p0(bnVar2.e)) ? false : true;
                        if (bnVar2.e == null && !gjVar2.N3() && org.telegram.messenger.v3.p0(bnVar2.e)) {
                            z13 = z12;
                            if (org.telegram.messenger.v3.A(bnVar2.getCurrentAccount(), bnVar2.e, 24)) {
                                int i22 = ((-bnVar2.e.linked_monoforum_id) > gjVar2.Z0() ? 1 : ((-bnVar2.e.linked_monoforum_id) == gjVar2.Z0() ? 0 : -1));
                            }
                        } else {
                            z13 = z12;
                        }
                        if (!z11 && bnVar2.e == null && bnVar2.h == null && (user = bnVar2.f) != null && !org.telegram.messenger.p10.C(user) && !org.telegram.messenger.p10.A(bnVar2.f) && !org.telegram.messenger.p10.t(bnVar2.f)) {
                            user2 = bnVar2.f;
                            if (!user2.bot && !org.telegram.messenger.p10.B(user2.id) && (((userFull = bnVar2.s8) == null || !userFull.read_dates_private) && !bnVar2.c() && gjVar2.P3() && gjVar2.q4() && !gjVar2.Y2() && !gjVar2.o4() && !gjVar2.n4() && !gjVar2.k.media_unread && !gjVar2.F4() && bnVar2.getConnectionsManager().getCurrentTime() - gjVar2.k.date < bnVar2.getMessagesController().u3 && !(gjVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                z14 = true;
                                TLRPC.User user322 = bnVar2.f;
                                boolean z19 = ((user322 == null && (org.telegram.messenger.p10.A(user322) || org.telegram.messenger.p10.t(bnVar2.f))) || bnVar2.c() || !gjVar2.X2() || (gjVar2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                org.telegram.ui.Components.a70 H22 = org.telegram.ui.Components.a70.H(f81Var3, bnVar2.getResourceProvider(), null, !z11 || z13);
                                if (z13) {
                                    gjVar3 = gjVar2;
                                    arrayList = arrayList422;
                                    bnVar = bnVar2;
                                    arrayList2 = arrayList522;
                                    a70Var = H22;
                                    z15 = z18;
                                    cVar = cVar222;
                                    i81Var = i81Var3;
                                    meVar = meVar222;
                                    if (z14) {
                                        a70Var.r(new org.telegram.ui.Components.za0(i81Var.getContext(), 0, gjVar3, new b81(i81Var, 0), i81Var.a), c8.ma.o(-1, 36));
                                        a70Var.k();
                                    } else if (z19) {
                                        a70Var.r(new org.telegram.ui.Components.za0(i81Var.getContext(), 1, gjVar3, new b81(i81Var, 2), i81Var.a), c8.ma.o(-1, 36));
                                        a70Var.k();
                                    }
                                } else {
                                    mf0 mf0Var = new mf0(i81Var3.getContext(), bnVar2.getCurrentAccount(), gjVar2, bnVar2.e);
                                    FrameLayout frameLayout = new FrameLayout(i81Var3.getContext());
                                    frameLayout.addView(mf0Var, c8.ma.c(36.0f, -1));
                                    org.telegram.ui.Components.a70 K = H22.K();
                                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, i81Var3.getContext(), i81Var3.a, true, false);
                                    y0Var.setItemHeight(44);
                                    gjVar3 = gjVar2;
                                    y0Var.j(org.telegram.messenger.hd.N0(2131753753, null), R.drawable.msg_arrow_back, null);
                                    y0Var.getTextView().setPadding(org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                                    FrameLayout frameLayout2 = new FrameLayout(i81Var3.getContext());
                                    LinearLayout linearLayout = new LinearLayout(i81Var3.getContext());
                                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, linearLayout, h6Var);
                                    linearLayout.setOrientation(1);
                                    org.telegram.ui.Components.ek0 a10 = mf0Var.a();
                                    frameLayout2.addView(y0Var);
                                    linearLayout.addView(frameLayout2);
                                    z15 = z18;
                                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(i81Var3.getContext(), h6Var), c8.ma.o(-1, 8));
                                    frameLayout2.setOnClickListener(new ur0(H22, 1));
                                    arrayList2 = arrayList522;
                                    arrayList = arrayList422;
                                    cVar = cVar222;
                                    bnVar = bnVar2;
                                    e81 e81Var = new e81(i81Var3, mf0Var, bnVar, a10, linearLayout, H22, K);
                                    a70Var = H22;
                                    i81Var = i81Var3;
                                    mf0Var.setOnClickListener(e81Var);
                                    linearLayout.addView(a10, c8.ma.o(-1, -2));
                                    K.q(linearLayout);
                                    a70Var.q(frameLayout);
                                    a70Var.k();
                                    meVar = meVar222;
                                }
                                size = arrayList322.size();
                                for (i11 = 0; i11 < size; i11++) {
                                    a70Var.c(((Integer) arrayList322.get(i11)).intValue(), (CharSequence) arrayList.get(i11), new org.telegram.ui.Components.f21(i81Var, meVar, ((Integer) arrayList2.get(i11)).intValue(), 15), false);
                                }
                                a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                                a70Var.R(cVar, c8.i0.l(h6Var), false);
                                a70Var.Z();
                                ViewGroup viewGroup322 = a70Var.A;
                                i81Var.T = viewGroup322;
                                viewGroup322.setPivotX(0.0f);
                                i81Var.T.setPivotY(0.0f);
                                f81Var5.addView(i81Var.T, c8.ma.e(-2, -2, 51));
                                viewGroup = i81Var.T;
                                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new qi0(i81Var, 20));
                                    i81Var.T.setOnTouchListener(new c0(i81Var, 7));
                                }
                                if (z15) {
                                    i81Var2 = i81Var;
                                    z16 = true;
                                } else {
                                    bn bnVar3 = bnVar;
                                    org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0((bnVar.getUserConfig().e() > bnVar.a() ? 1 : (bnVar.getUserConfig().e() == bnVar.a() ? 0 : -1)) == 0 ? 3 : 0, bnVar3.getCurrentAccount(), i81Var.getContext(), bnVar3, i81Var.a);
                                    xi0Var.a = true;
                                    float f10 = 22;
                                    xi0Var.setPadding(org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 0 : 24), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (org.telegram.messenger.hd.a0 ? 24 : 0), org.telegram.messenger.g0.L(f10));
                                    i81Var2 = i81Var;
                                    org.telegram.messenger.gj gjVar6 = gjVar3;
                                    xi0Var.setDelegate(new ab.c0(i81Var2, bnVar3, gjVar6, xi0Var, false, 12));
                                    i81Var2.Q = xi0Var;
                                    f81Var5.addView(xi0Var, c8.ma.e(-2, (int) ((xi0Var.getTopOffset() / org.telegram.messenger.g0.p) + 52.0f + f10), 51));
                                    z16 = true;
                                    xi0Var.p(gjVar6, bnVar3.r8, true);
                                    i81Var2.Q.setTransitionProgress(1.0f);
                                }
                                i81Var2.e();
                                i81Var2.d0 = new ul(this, 5);
                                i81Var2.show();
                                return z16;
                            }
                        }
                        z14 = false;
                        TLRPC.User user3222 = bnVar2.f;
                        if (user3222 == null) {
                        }
                        org.telegram.ui.Components.a70 H222 = org.telegram.ui.Components.a70.H(f81Var3, bnVar2.getResourceProvider(), null, !z11 || z13);
                        if (z13) {
                        }
                        size = arrayList322.size();
                        while (i11 < size) {
                        }
                        a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                        a70Var.R(cVar, c8.i0.l(h6Var), false);
                        a70Var.Z();
                        ViewGroup viewGroup3222 = a70Var.A;
                        i81Var.T = viewGroup3222;
                        viewGroup3222.setPivotX(0.0f);
                        i81Var.T.setPivotY(0.0f);
                        f81Var5.addView(i81Var.T, c8.ma.e(-2, -2, 51));
                        viewGroup = i81Var.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        i81Var2.e();
                        i81Var2.d0 = new ul(this, 5);
                        i81Var2.show();
                        return z16;
                    }
                }
                f81Var3 = f81Var2;
                i10 = 51;
                G.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                gh.e l10222 = c8.i0.l(h6Var);
                dh.c cVar2222 = i81Var3.G;
                G.R(cVar2222, l10222, r10);
                G.Z();
                ViewGroup viewGroup2222 = G.A;
                i81Var3.R = viewGroup2222;
                viewGroup2222.setPivotX(0.0f);
                i81Var3.R.setPivotY(0.0f);
                f81Var5.addView(i81Var3.R, c8.ma.e(-2, -2, i10));
                ArrayList arrayList3222 = new ArrayList();
                ArrayList arrayList4222 = new ArrayList();
                ArrayList arrayList5222 = new ArrayList();
                bnVar2.G8(gjVar, arrayList3222, arrayList4222, arrayList5222);
                me meVar2222 = new me(bnVar2, 10);
                gjVar2 = i81Var3.H;
                ArrayList arrayList6222 = bnVar2.getMediaDataController().n;
                if (bnVar2.z()) {
                }
                if (gjVar2.k3()) {
                }
                if (!z11) {
                }
                if (bnVar2.e == null) {
                }
                z13 = z12;
                if (!z11) {
                    user2 = bnVar2.f;
                    if (!user2.bot) {
                        z14 = true;
                        TLRPC.User user32222 = bnVar2.f;
                        if (user32222 == null) {
                        }
                        org.telegram.ui.Components.a70 H2222 = org.telegram.ui.Components.a70.H(f81Var3, bnVar2.getResourceProvider(), null, !z11 || z13);
                        if (z13) {
                        }
                        size = arrayList3222.size();
                        while (i11 < size) {
                        }
                        a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                        a70Var.R(cVar, c8.i0.l(h6Var), false);
                        a70Var.Z();
                        ViewGroup viewGroup32222 = a70Var.A;
                        i81Var.T = viewGroup32222;
                        viewGroup32222.setPivotX(0.0f);
                        i81Var.T.setPivotY(0.0f);
                        f81Var5.addView(i81Var.T, c8.ma.e(-2, -2, 51));
                        viewGroup = i81Var.T;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z15) {
                        }
                        i81Var2.e();
                        i81Var2.d0 = new ul(this, 5);
                        i81Var2.show();
                        return z16;
                    }
                }
                z14 = false;
                TLRPC.User user322222 = bnVar2.f;
                if (user322222 == null) {
                }
                org.telegram.ui.Components.a70 H22222 = org.telegram.ui.Components.a70.H(f81Var3, bnVar2.getResourceProvider(), null, !z11 || z13);
                if (z13) {
                }
                size = arrayList3222.size();
                while (i11 < size) {
                }
                a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var)));
                a70Var.R(cVar, c8.i0.l(h6Var), false);
                a70Var.Z();
                ViewGroup viewGroup322222 = a70Var.A;
                i81Var.T = viewGroup322222;
                viewGroup322222.setPivotX(0.0f);
                i81Var.T.setPivotY(0.0f);
                f81Var5.addView(i81Var.T, c8.ma.e(-2, -2, 51));
                viewGroup = i81Var.T;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z15) {
                }
                i81Var2.e();
                i81Var2.d0 = new ul(this, 5);
                i81Var2.show();
                return z16;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final String i(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar;
        int i7;
        if (r1Var.getMessageObject() == null || (i7 = (bnVar = this.a).ac) == 0 || i7 != r1Var.getMessageObject().e1() || bnVar.bc != 3) {
            return null;
        }
        return bnVar.dc;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean i0() {
        return this.a.g4 == 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void i1() {
        bn bnVar = this.a;
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, bnVar.l6, null);
    }

    public final void j(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, boolean z10) {
        bn bnVar = this.a;
        TLRPC.Chat chat2 = bnVar.e;
        if (chat2 != null && chat.id == chat2.id) {
            vi viVar = bnVar.p1;
            if (viVar != null && i7 == 0) {
                viVar.e(false, false);
                return;
            } else {
                if (r1Var.getMessageObject() != null) {
                    bnVar.l(i7, r1Var.getMessageObject().e1(), true, 0, false, 0);
                    return;
                }
                return;
            }
        }
        if (chat2 == null || chat.id != chat2.id || bnVar.fa()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            hi hiVar = null;
            if (z10) {
                vf.b bVar = bnVar.ec;
                if (bVar != null) {
                    bVar.a(true);
                    bnVar.ec = null;
                }
                if (r1Var == null || r1Var.getMessageObject() == null) {
                    bnVar.ec = null;
                } else {
                    hi hiVar2 = new hi(bnVar, r1Var.getMessageObject().e1(), r1Var, 0);
                    bnVar.ec = hiVar2;
                    hiVar = hiVar2;
                }
            }
            if (bnVar.getMessagesController().E(bundle, bnVar, r1Var.getMessageObject(), hiVar)) {
                hi hiVar3 = hiVar;
                bn bnVar2 = new bn(bundle);
                if (hiVar3 == null || i7 == 0) {
                    bnVar.presentFragment(bnVar2);
                } else {
                    org.telegram.messenger.g0.h3(new ai.i1(this, hiVar3, chat, i7, bnVar2, 13), 5000L);
                    hiVar3.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void j0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        this.a.Y7(r1Var, true, false, f10, f11, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.tgnet.TLRPC$ChatParticipant] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.mm] */
    @Override // org.telegram.ui.Cells.m1
    public final void j2(org.telegram.ui.Cells.r1 r1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull P0;
        TLRPC.User currentUser = r1Var.getCurrentUser();
        bn bnVar = this.a;
        if (!org.telegram.messenger.g0.E1(bnVar.getParentActivity()) || (chat = bnVar.e) == null || currentUser == null || org.telegram.messenger.v3.V(chat)) {
            return;
        }
        org.telegram.messenger.np messagesController = bnVar.getMessagesController();
        long j3 = bnVar.e.id;
        long j10 = currentUser.id;
        a0.h hVar = (a0.h) messagesController.A1.f(j3);
        if (hVar == null && (P0 = messagesController.P0(j3)) != null && P0.participants != null) {
            for (int i7 = 0; i7 < P0.participants.participants.size(); i7++) {
                chatParticipant = P0.participants.participants.get(i7);
                if (chatParticipant.user_id == j10) {
                    break;
                }
            }
        }
        chatParticipant = (TLObject) hVar.f(j10);
        e(r1Var, chatParticipant);
    }

    public final void k(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.g2 g2Var = this.a;
            if (g2Var.getMessagesController().E(bundle, g2Var, r1Var.getMessageObject(), null)) {
                g2Var.presentFragment(new bn(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final int k0(org.telegram.ui.Cells.r1 r1Var) {
        sh.b bVar;
        bn bnVar = this.a;
        if (!bnVar.ed.f || (bVar = bnVar.kd) == null || bVar.n != r1Var || bVar.a.getWidth() <= 0) {
            return 0;
        }
        return bnVar.kd.a.getHeight();
    }

    @Override // org.telegram.ui.Cells.m1
    public final void k1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        bn bnVar = this.a;
        if (bnVar.X9()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (bnVar.getParentActivity() != null) {
            if (bnVar.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                rj rjVar = bnVar.a0;
                org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
                org.telegram.messenger.gj messageObject2 = r1Var.getMessageObject();
                gi giVar = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                vf.b bVar = bnVar.ec;
                if (bVar != null) {
                    bVar.a(true);
                    bnVar.ec = null;
                }
                if (str == null || r1Var.getMessageObject() == null) {
                    bnVar.ec = null;
                } else {
                    gi giVar2 = new gi(bnVar, r1Var.getMessageObject().e1(), str, r1Var, 1);
                    bnVar.ec = giVar2;
                    giVar = giVar2;
                }
                rjVar.t0(keyboardButtonProto, messageObject, messageObject2, giVar);
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void l(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        int a10 = sh.g.a(messageObject);
        boolean a11 = c8.dd.a(a10, 7);
        bn bnVar = this.a;
        if (a11) {
            org.telegram.ui.Components.lc.b0(bnVar).Q(R.raw.e_hand_2, 36, sh.g.b(a10, messageObject)).j();
            return;
        }
        if (i7 < 0 && !arrayList.isEmpty()) {
            bnVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
            r1Var.a0(true);
            return;
        }
        if (bnVar.getParentActivity() == null) {
            return;
        }
        if (bnVar.C2 == null) {
            int indexOfChild = bnVar.m1.indexOfChild(bnVar.U);
            if (indexOfChild == -1) {
                return;
            }
            hi.l3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
            bnVar.C2 = E6;
            E6.v0 = 0.0f;
        }
        if (arrayList.isEmpty() && i7 < 0) {
            ArrayList<org.telegram.ui.Cells.q1> pollButtons = r1Var.getPollButtons();
            int size = pollButtons.size();
            int i12 = 0;
            float f10 = 0.0f;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i12);
                float y10 = ((r1Var.getY() + q1Var.b) - org.telegram.messenger.g0.L(4.0f)) - bnVar.P9;
                bnVar.F2 = org.telegram.messenger.g0.L(13.3f) + q1Var.a;
                int i13 = org.telegram.ui.Cells.c0.i(6.0f, q1Var.b, i11);
                bnVar.G2 = i13;
                if (y10 > 0.0f) {
                    i10 = bnVar.F2;
                    i11 = i13;
                    f10 = 0.0f;
                    break;
                }
                i12++;
                f10 = y10;
            }
            if (f10 != 0.0f) {
                bnVar.A0.w0(0, (int) f10, null);
                bnVar.E2 = r1Var;
                return;
            }
        }
        bn.q2(bnVar, r1Var, i7, i10, i11);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void l0(org.telegram.ui.Cells.r1 r1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        bn bnVar = this.a;
        if (bnVar.getParentActivity() == null) {
            return;
        }
        if (bnVar.ua == null) {
            wh.i iVar = new wh.i(bnVar.getParentActivity());
            bnVar.ua = iVar;
            bnVar.m1.addView(iVar, c8.ma.e(-1, -1, 48));
        }
        wh.i iVar2 = bnVar.ua;
        HashMap hashMap = iVar2.a;
        ArrayList arrayList = iVar2.c;
        arrayList.clear();
        int i7 = iVar2.d;
        org.telegram.messenger.k10 i10 = org.telegram.messenger.k10.i(i7);
        long j3 = i10.n;
        arrayList.add(Long.valueOf(j3));
        if (i10.W) {
            ArrayList arrayList2 = org.telegram.messenger.si.d0(i7).j1;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                long j10 = tL_topPeer.peer.user_id;
                if (j10 != 0) {
                    int i12 = size;
                    if (org.telegram.messenger.np.u1(i7).c2(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j10));
                    }
                    size = i12;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = org.telegram.messenger.np.u1(i7).y;
        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j11 = dialog.id;
                if (j11 != j3 && !org.telegram.messenger.n5.C(j11)) {
                    if (org.telegram.messenger.n5.E(dialog.id)) {
                        TLRPC.User c22 = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(dialog.id));
                        if (c22 != null && !org.telegram.messenger.p10.u(c22) && !org.telegram.messenger.p10.y(c22) && !org.telegram.messenger.p10.B(c22.id)) {
                            if (dialog.folder_id == 1) {
                                arrayList3.add(Long.valueOf(dialog.id));
                            } else {
                                arrayList.add(Long.valueOf(dialog.id));
                            }
                        }
                    } else {
                        TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-dialog.id));
                        if (O0 != null && !O0.forum && !org.telegram.messenger.v3.r0(O0) && ((!O0.gigagroup || org.telegram.messenger.v3.N(O0)) && (!org.telegram.messenger.v3.T(O0) || O0.creator || (((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages) || O0.megagroup)))) {
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
        String b10 = wh.i.b(r1Var);
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
            if (hashSet.add(l10) && org.telegram.messenger.n5.E(l10.longValue())) {
                arrayList5.add(l10);
            }
        }
        wh.h hVar = new wh.h(iVar2, r1Var, arrayList5, new wg.q(6, iVar2, b10));
        hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
        hVar.setCallback(iVar2);
        if (hashMap.containsKey(b10)) {
            return;
        }
        hashMap.put(b10, hVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
        Bundle j10 = a8.p0.j(j3, "user_id");
        org.telegram.ui.ActionBar.g2 g2Var = this.a;
        if (g2Var.getMessagesController().E(j10, g2Var, r1Var.getMessageObject(), null)) {
            g2Var.presentFragment(new bn(j10));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void m() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.s2.a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.a.getParentActivity(), org.telegram.messenger.s2.g);
    }

    public final void n(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean n0() {
        boolean z10;
        bn bnVar = this.a;
        if (bnVar.Y9()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
        return !z10;
    }

    public final void o(TLRPC.User user, boolean z10) {
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
        bn bnVar = this.a;
        TLRPC.User user2 = bnVar.f;
        if (user2 != null && user2.id == user.id) {
            i10 = 1;
        }
        profileActivity.j5(i10);
        Activity parentActivity = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
        org.telegram.messenger.g0.k3(parentActivity, i7);
        bnVar.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void o0(String str) {
        bn bnVar = this.a;
        vj vjVar = bnVar.d1;
        if (vjVar == null || vjVar.getVisibility() != 0) {
            uj ujVar = bnVar.T;
            if ((ujVar == null || ujVar.getVisibility() != 0) && bnVar.a0 != null && str != null && str.length() > 0) {
                bnVar.a0.setFieldText("@" + str + " ");
                bnVar.a0.i1();
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final void p(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
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
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(messageObject);
        if (messageMedia == null || messageObject == null || !(m12 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            Q1(r1Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        bn bnVar = this.a;
        if (geoPoint != null) {
            if (org.telegram.messenger.g0.J1(bnVar)) {
                jm jmVar = new jm(3);
                h6Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                jmVar.setResourceProvider(h6Var2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = bnVar.getMessagesController().B1(bnVar.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                jmVar.V0 = false;
                jmVar.G0(new org.telegram.messenger.gj(org.telegram.messenger.k10.t0, tL_message, false, false));
                bnVar.presentFragment(jmVar);
                return;
            }
            return;
        }
        if (org.telegram.messenger.gj.N2(messageMedia.document)) {
            ns.p().v(bnVar.getParentActivity());
            ns.p().u(new km(this, tL_messageMediaPoll, pollAnswer, r1Var));
            ns p10 = ns.p();
            TLRPC.Document document4 = messageMedia.document;
            int i17 = org.telegram.messenger.gj.H2(document4) ? 2 : 0;
            org.telegram.messenger.gj messageObject2 = r1Var.getMessageObject();
            h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
            p10.s(document4, null, "", null, null, i17, false, messageObject2, h6Var, org.telegram.messenger.ls.e3);
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
            TLRPC.TL_message R7 = bn.R7(message);
            R7.media = messageMedia;
            R7.attachPath = sh.d.c(i7, message);
            ArrayList arrayList = new ArrayList();
            i16 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
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
            i14 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            sh.a aVar = new sh.a(i14, messageObject, document6, sh.d.c(i7, messageObject.k));
            if (aVar.g) {
                org.telegram.messenger.w7.G(i14).f(document6);
                aVar.a();
                r1Var.Z();
                return;
            }
            if (!aVar.f) {
                org.telegram.messenger.w7.G(i14).W(document6, messageObject, 2, 0);
                aVar.a();
                r1Var.Z();
                return;
            }
            TLRPC.Message message2 = messageObject.k;
            TLRPC.TL_message R72 = bn.R7(message2);
            R72.media = messageMedia;
            R72.attachPath = sh.d.c(i7, message2);
            i15 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            lm lmVar = new lm(i15, R72, false, true);
            if (org.telegram.messenger.gj.y(messageMedia.document)) {
                PhotoViewer.p1().I2(null, bnVar, bnVar.Ba);
                PhotoViewer p12 = PhotoViewer.p1();
                int i18 = lmVar.D;
                p12.e2(lmVar, bnVar, i18 != 0 ? bnVar.l6 : 0L, i18 != 0 ? bnVar.d7 : 0L, i18 != 0 ? bnVar.d() : 0L, bnVar.db);
                return;
            }
            try {
                org.telegram.messenger.g0.u2(lmVar, bnVar.getParentActivity(), bnVar.Ba, false);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                bnVar.M6(lmVar);
                return;
            }
        }
        TLRPC.Message message3 = messageObject.k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.gj.K4(document3))) {
            i10 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message R73 = bn.R7(message3);
            R73.media = messageMedia3;
            R73.attachPath = sh.d.c(-2, message3);
            i13 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            arrayList3.add(new cm(i13, R73, false, true));
            arrayList2.add(-2);
        } else {
            i10 = -1;
        }
        if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.gj.K4(document2))) {
            if (messageMedia2 == messageMedia) {
                i10 = arrayList3.size();
            }
            TLRPC.TL_message R74 = bn.R7(message3);
            R74.media = messageMedia2;
            R74.attachPath = sh.d.c(-3, message3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            R74.message = pollResults2.solution;
            R74.entities = pollResults2.solution_entities;
            i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            arrayList3.add(new dm(i12, R74, false, true));
            arrayList2.add(-3);
        }
        cg.d.b(tL_messageMediaPoll.poll, bnVar.getUserConfig().e());
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
                TLRPC.TL_message R75 = bn.R7(message3);
                R75.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                R75.message = tL_textWithEntities2.text;
                R75.entities = tL_textWithEntities2.entities;
                R75.attachPath = sh.d.c(pollAnswer2.unshuffled_index, message3);
                i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                arrayList3.add(new em(i11, R75, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i10 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.s0 = arrayList2;
        PhotoViewer.p1().I2(null, bnVar, bnVar.Ba);
        PhotoViewer.p1().a2(arrayList3, i10, bnVar.a(), 0L, 0L, bnVar.eb);
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean p0(org.telegram.ui.Components.y5 y5Var) {
        TLRPC.InputStickerSet i12;
        int i7;
        bn bnVar = this.a;
        if (!bnVar.getMessagesController().K3() && y5Var != null && !y5Var.standard) {
            long documentId = y5Var.getDocumentId();
            TLRPC.Document document = y5Var.document;
            if (document == null) {
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                document = org.telegram.ui.Components.p5.e(i7, documentId);
            }
            if (document != null && (i12 = org.telegram.messenger.gj.i1(document)) != null) {
                org.telegram.messenger.si.d0(org.telegram.messenger.k10.t0).o0(i12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i12);
                org.telegram.ui.Components.ev evVar = new org.telegram.ui.Components.ev(bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList);
                org.telegram.ui.Components.wu wuVar = evVar.q1;
                wuVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(wuVar);
                wuVar.w = imageReceiver;
                if (wuVar.d) {
                    imageReceiver.P();
                }
                wuVar.x = true;
                wuVar.y.e(true, 1.0f);
                wuVar.w.r0(org.telegram.messenger.gc.b(document), "140_140", org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.m6.m6, 0.2f, true), 0L, null, null, 0);
                wuVar.w.E0(7);
                ImageReceiver imageReceiver2 = wuVar.w;
                imageReceiver2.v0 = true;
                imageReceiver2.u0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = wuVar.w;
                imageReceiver3.x0 = true;
                imageReceiver3.H0(wuVar);
                boolean V9 = bnVar.V9();
                evVar.i0 = V9;
                evVar.n = V9;
                bnVar.showDialog(evVar);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
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
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        int i14 = 2;
        File file = null;
        bn bnVar = this.a;
        if (i7 == 19) {
            vf.b bVar = bnVar.ec;
            if (bVar != null) {
                bVar.a(true);
            }
            final fm fmVar = r1Var.getMessageObject() != null ? new fm(this, r1Var, i14) : null;
            bnVar.ec = fmVar;
            final Activity parentActivity = bnVar.getParentActivity();
            final org.telegram.ui.ActionBar.h6 resourceProvider = bnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            fmVar.d();
            fmVar.b = new wg.c(atomicBoolean, 0);
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
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).O0(Long.valueOf(-messageObject.Z0()));
            final boolean z10 = O0 != null && org.telegram.messenger.v3.V(O0);
            final long j3 = messageObject.k.date * 1000;
            wg.s.d(messageObject, new org.telegram.messenger.y10(atomicBoolean, fmVar, z10, b11, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: wg.d
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ vf.b b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Context f;
                public final /* synthetic */ h6 g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override // org.telegram.messenger.y10
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
                    h6 h6Var = this.g;
                    if (z11) {
                        h.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, h6Var);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        h.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, h6Var);
                    }
                }
            }, new wg.e(atomicBoolean, fmVar, 0));
            return;
        }
        if (i7 == 21) {
            org.telegram.messenger.t0.u();
            boolean z11 = org.telegram.messenger.s2.a;
            org.telegram.messenger.t0.r();
            vf.c.t(bnVar.getParentActivity(), org.telegram.messenger.s2.g);
            return;
        }
        if (i7 == 84) {
            bnVar.Wa(r1Var);
            return;
        }
        if (i7 == 80) {
            org.telegram.ui.Cells.p8 p8Var = org.telegram.ui.Components.ff0.M1;
            if (bnVar.getParentActivity() == null) {
                return;
            }
            bnVar.showDialog(new org.telegram.ui.Components.ff0(bnVar.getContext(), bnVar.getCurrentAccount(), messageObject, bnVar.getResourceProvider()));
            return;
        }
        if (i7 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(messageObject) == null) {
                bnVar.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        int i15 = 5;
        if (i7 == 5) {
            long j10 = messageObject.k.media.user_id;
            if (j10 != 0) {
                i13 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                user2 = org.telegram.messenger.np.u1(i13).c2(Long.valueOf(j10));
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
                bnVar.presentFragment(new ProfileActivity(bundle, null));
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
                bnVar.showDialog(new org.telegram.ui.Components.md0(bnVar, null, user2, null, file, pf.b.d(str, false), str3, str4, bnVar.Ba));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i7 == 30) {
            bnVar.presentFragment(new bn(a8.p0.j(messageObject.k.media.user_id, "user_id")));
            return;
        }
        if (i7 == 31) {
            long j11 = messageObject.k.media.user_id;
            if (j11 != 0) {
                i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                user = org.telegram.messenger.np.u1(i12).c2(Long.valueOf(j11));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    b10 = messageObject.Z1.toString();
                } else if (TextUtils.isEmpty(user.phone)) {
                    String str5 = org.telegram.messenger.gj.n1(messageObject.k).phone_number;
                    b10 = !TextUtils.isEmpty(str5) ? pf.b.c().b(str5) : org.telegram.messenger.hd.N0(2131747638, null);
                } else {
                    b10 = org.telegram.messenger.o10.h(new StringBuilder("+"), user.phone, pf.b.c());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", b10);
                bundle2.putBoolean("addContact", true);
                bnVar.presentFragment(new qr(bundle2));
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
            vf.b bVar2 = bnVar.ec;
            if (bVar2 != null) {
                bVar2.a(true);
            }
            int i16 = 3;
            bnVar.ec = r1Var.getMessageObject() != null ? new fm(this, r1Var, i16) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                if (org.telegram.messenger.si.d0(i10).r0(group) == null) {
                    bnVar.ec.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    bnVar.ec.b = new ii(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new hi.b3(i16, this, z12)), i14);
                    return;
                }
            }
            vf.c.s(bnVar.getParentActivity(), Uri.parse(webPage2.url), true, true, false, bnVar.ec, null, false, true, false, false);
            return;
        }
        if (messageObject.r4()) {
            bnVar.ma(messageObject, false, false);
            if (messageObject.T0 != null) {
                vf.b bVar3 = bnVar.ec;
                if (bVar3 != null) {
                    bVar3.a(true);
                }
                bnVar.ec = r1Var.getMessageObject() != null ? new fm(this, r1Var, 4) : null;
                vf.c.s(bnVar.getParentActivity(), Uri.parse(messageObject.T0), true, false, false, bnVar.ec, null, false, bnVar.getMessagesController().g6, false, false);
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
            for (int i17 = 0; i17 < W1.attributes.size(); i17++) {
                if ((W1.attributes.get(i17) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) W1.attributes.get(i17)).storyItem) != null) {
                    storyItem.dialogId = org.telegram.messenger.n5.o(tL_webPageAttributeStory.peer);
                    tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                    tL_webPageAttributeStory.storyItem.messageType = 1;
                    bnVar.getOrCreateStoryViewer().L(bnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, fi.y6.a(bnVar.A0));
                    return;
                }
            }
        }
        if (bnVar.Ha(W1.url, r1Var, null, messageObject.e1(), 2)) {
            return;
        }
        vf.b bVar4 = bnVar.ec;
        if (bVar4 != null) {
            bVar4.a(true);
        }
        bnVar.ec = r1Var.getMessageObject() != null ? new fm(this, r1Var, i15) : null;
        vf.c.s(bnVar.getParentActivity(), Uri.parse(W1.url), true, true, false, bnVar.ec, null, false, true, false, false);
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.gj messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (r1Var != null && pageBlock != null) {
            bn bnVar = this.a;
            if (bnVar.getParentActivity() != null && (messageObject = r1Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.y2.g;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    org.telegram.messenger.au auVar = (org.telegram.messenger.au) arrayList2.get(i7);
                    if (auVar instanceof org.telegram.messenger.nu) {
                        arrayList.add(((org.telegram.messenger.nu) auVar).r0);
                    } else if (auVar instanceof org.telegram.messenger.zu) {
                        arrayList.add(((org.telegram.messenger.zu) auVar).r0);
                    } else if (auVar instanceof org.telegram.messenger.fu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.fu) auVar).Y;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            arrayList.add(((org.telegram.messenger.tt) obj).b);
                        }
                    } else if (auVar instanceof org.telegram.messenger.ru) {
                        ArrayList arrayList4 = ((org.telegram.messenger.ru) auVar).Y;
                        int size2 = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.tt) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.I2(null, bnVar, null);
                    return p12.d2(null, null, null, null, null, null, null, indexOf, new sl(bnVar, arrayList), null, 0L, 0L, 0L, true, new rl(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void q(org.telegram.ui.Cells.r1 r1Var) {
        float L;
        if (r1Var.getMessageObject().y3()) {
            i1();
            return;
        }
        bn bnVar = this.a;
        if (bnVar.A3 || bnVar.A0 == null || bnVar.getParentActivity() == null || bnVar.fragmentView == null) {
            return;
        }
        if (bnVar.J2 == null) {
            int indexOfChild = bnVar.m1.indexOfChild(bnVar.U);
            if (indexOfChild == -1) {
                return;
            }
            hi.l3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
            bnVar.J2 = E6;
            E6.v(org.telegram.messenger.hd.N0(2131749136, null));
        }
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        TLRPC.User currentUser = r1Var.getCurrentUser();
        if (currentUser == null || currentUser.id != 0) {
            float L2 = org.telegram.messenger.g0.L(22.0f);
            L = (messageObject.P3() || !r1Var.k9 || r1Var.V8 == null) ? L2 : org.telegram.messenger.g0.L(20.0f) + L2;
        } else {
            L = (r1Var.getMeasuredHeight() - Math.max(0, r1Var.getBottom() - ((View) r1Var.getParent()).getMeasuredHeight())) - org.telegram.messenger.g0.L(50.0f);
        }
        if (bnVar.w9(r1Var, L) <= org.telegram.messenger.g0.L(80.0f)) {
            return;
        }
        bnVar.J2.y(bnVar.v9(r1Var, r1Var.getForwardNameCenterX()), bnVar.w9(r1Var, L) - org.telegram.messenger.g0.L(4.0f), true);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void q0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        bn bnVar = this.a;
        bnVar.Y7(r1Var, false, false, f10, f11, true, false, false);
        bnVar.A0.getClass();
        bn.l2(bnVar, RecyclerView.R(r1Var));
    }

    @Override // org.telegram.ui.Cells.m1
    public final void q2(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj primaryMessageObject = r1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Zc(primaryMessageObject, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0116, code lost:
    
        if (r1.noforwards == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0122, code lost:
    
        if (org.telegram.messenger.v3.t0(r1) != false) goto L90;
     */
    @Override // org.telegram.ui.Cells.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(org.telegram.ui.Cells.r1 r1Var) {
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
        bn bnVar = this.a;
        if (bnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.a21 a21Var = bnVar.g2;
        boolean z10 = true;
        if (a21Var != null && bnVar.s4 == 0 && (r1Var.l6 || r1Var.m6)) {
            a21Var.n(r1Var.getMessageObject().Y1(), true);
            return;
        }
        if (bnVar.getMessagesController().A2()) {
            i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            b.b(i12);
            return;
        }
        rj rjVar = bnVar.a0;
        if (rjVar != null) {
            rjVar.U();
        }
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        int i13 = bnVar.g4;
        if (i13 == 2) {
            bnVar.n9.K0(messageObject.e1());
            bnVar.finishFragment();
            return;
        }
        if (i13 == 3 || ((i13 == 7 && bnVar.d4 == 2) || !((!org.telegram.messenger.p10.A(bnVar.f) && !org.telegram.messenger.p10.C(bnVar.f)) || (messageFwdHeader = messageObject.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (org.telegram.messenger.p10.A(bnVar.f) && (messageReplyHeader = (message = messageObject.k).reply_to) != null && (i7 = messageReplyHeader.reply_to_top_id) != 0) {
                bnVar.Da(messageReplyHeader.reply_to_peer_id.channel_id, null, i7, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (bnVar.g4 == 7 && bnVar.d4 == 2) {
                bnVar.Ia(messageObject);
                return;
            } else {
                bnVar.Ja(messageObject);
                return;
            }
        }
        ArrayList arrayList = (messageObject.c1() == 0 || (bjVar = (org.telegram.messenger.bj) bnVar.P6.f(messageObject.c1())) == null) ? null : bjVar.d;
        if (arrayList == null) {
            arrayList = org.telegram.messenger.f3.i(messageObject);
        }
        if (bnVar.getMessagesController().i5()) {
            int i14 = messageObject.K1;
            if (!messageObject.r4() && (((message2 = messageObject.k) == null || !message2.noforwards) && (i11 = messageObject.D) != 17 && i11 != 12)) {
                long B0 = org.telegram.messenger.gj.B0(message2);
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i14).O0(Long.valueOf(-B0));
                if (O0 == null || !O0.noforwards) {
                    if (B0 >= 0 || !org.telegram.messenger.v3.V(O0)) {
                        TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.k.fwd_from;
                        if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                            long o4 = org.telegram.messenger.n5.o(peer);
                            TLRPC.Chat O02 = org.telegram.messenger.np.u1(i14).O0(Long.valueOf(-o4));
                            if (o4 < 0) {
                                if (O02 != null) {
                                }
                                if (org.telegram.messenger.v3.V(O02)) {
                                }
                            }
                        }
                    }
                    boolean z11 = z10;
                    bnVar.showDialog(new gm(this, bnVar.getParentActivity(), bnVar, arrayList, org.telegram.messenger.v3.T(bnVar.e), z11, bnVar.Ba, z11, messageObject));
                    Activity parentActivity = bnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
                    org.telegram.messenger.g0.k3(parentActivity, i10);
                    bnVar.fragmentView.requestLayout();
                }
            }
        }
        z10 = false;
        boolean z112 = z10;
        bnVar.showDialog(new gm(this, bnVar.getParentActivity(), bnVar, arrayList, org.telegram.messenger.v3.T(bnVar.e), z112, bnVar.Ba, z112, messageObject));
        Activity parentActivity2 = bnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
        org.telegram.messenger.g0.k3(parentActivity2, i10);
        bnVar.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.Cells.m1
    public final void s2() {
        this.a.O9();
    }

    @Override // org.telegram.ui.Cells.m1
    public final void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        wh.h hVar;
        wh.i iVar = this.a.ua;
        if (iVar == null || (hVar = (wh.h) iVar.a.get(wh.i.b(r1Var))) == null) {
            return;
        }
        wh.d[] dVarArr = hVar.x;
        RectF rectF = hVar.r;
        if (hVar.N) {
            float f12 = (f10 - rectF.left) + hVar.V;
            float f13 = (f11 - rectF.top) + hVar.W;
            int i7 = wh.g.a;
            int b10 = (((float) (-org.telegram.messenger.g0.L((float) 37))) >= f13 || f13 >= rectF.height()) ? -1 : c8.l9.b((int) Math.floor((f12 - (org.telegram.messenger.g0.L(9) - (org.telegram.messenger.g0.L(11) / 2.0f))) / org.telegram.messenger.g0.L(wh.g.a + 11)), 0, dVarArr.length - 1);
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

    @Override // org.telegram.ui.Cells.m1
    public final void t2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.a.n8(r1Var, reactionCount, z10, f10, f11);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void u0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        boolean z10 = true;
        if (kVar.x() || bnVar.Y9()) {
            bn.k2(bnVar, r1Var, true, f10, f11);
            return;
        }
        if (r1Var != null && r1Var.getMessageObject() != null && r1Var.getMessageObject().r4()) {
            p1(r1Var, 10);
            return;
        }
        if (!org.telegram.messenger.v3.c0(bnVar.e) && !bnVar.fa()) {
            z10 = false;
        }
        o(user, z10);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void v() {
        this.a.Fc();
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean v2(int i7) {
        boolean z10;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        if (i7 != 16 && i7 != R.id.acc_action_small_button && i7 != R.id.acc_action_msg_options) {
            return false;
        }
        bn bnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
        if (!z10 || !bnVar.ga) {
            return !b();
        }
        r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
            ((ActionBarLayout) r4Var2).r();
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void w(org.telegram.ui.Cells.r1 r1Var) {
        int i7;
        int i10;
        ej ejVar;
        org.telegram.messenger.gj primaryMessageObject = r1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        primaryMessageObject.c3 = !primaryMessageObject.c3;
        primaryMessageObject.M1 = true;
        bn bnVar = this.a;
        bj bjVar = bnVar.A0;
        if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.y < 0) {
            for (int childCount = bjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = bnVar.A0.getChildAt(childCount);
                bnVar.A0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.r1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i10 = bnVar.h9(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.r1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = bnVar.h9(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        bnVar.Zc(primaryMessageObject, false);
        hi.l3 l3Var = bnVar.P1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (i7 < 0 || r1Var.getCurrentMessagesGroup() != null) {
            return;
        }
        bnVar.C0.h1(i7, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x061c, code lost:
    
        if (r0.exists() != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x06e1, code lost:
    
        if (r4.startsWith("text/x-web-markdown") == false) goto L225;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0730 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
        int i7;
        bn bnVar;
        boolean z11;
        bn bnVar2;
        File file;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i10;
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        int i11 = messageObject.D;
        int i12 = 2;
        bn bnVar3 = this.a;
        if (i11 == 23) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = org.telegram.messenger.n5.o(messageMedia2.peer);
            storyItem.messageId = messageObject.e1();
            storyItem.messageType = 2;
            fi.i7.b(storyItem, bnVar3.f);
            bnVar3.getOrCreateStoryViewer().L(bnVar3.getParentActivity(), messageObject.k.media.storyItem, fi.y6.a(bnVar3.A0));
            return;
        }
        int i13 = 1;
        if (org.telegram.messenger.gj.L4(messageObject.k)) {
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar3).currentAccount;
            if (org.telegram.messenger.a6.q(i10).b(messageObject.k) == 1) {
                messageObject.P = true;
            }
        } else {
            messageObject.P = true;
        }
        if (messageObject.n4()) {
            bnVar3.Y7(r1Var, false, false, f10, f11, true, false, false);
            return;
        }
        if (messageObject.o4()) {
            return;
        }
        int i14 = 0;
        if (z10 && (message = messageObject.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject.k.media.webpage.url;
            org.telegram.messenger.g0.K0(str, false);
            if (bnVar3.Ha(str, r1Var, null, messageObject.e1(), 2)) {
                return;
            }
            vf.b bVar = bnVar3.ec;
            if (bVar != null) {
                bVar.a(true);
            }
            bnVar3.ec = r1Var.getMessageObject() != null ? new fm(this, r1Var, i14) : null;
            vf.c.s(bnVar3.getParentActivity(), Uri.parse(str), true, false, false, bnVar3.ec, null, false, true, false, false);
            return;
        }
        if (messageObject.T2()) {
            wl wlVar = new wl(this, messageObject, i14);
            TLRPC.MessageMedia n1 = org.telegram.messenger.gj.n1(messageObject.k);
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) (TLRPC.TL_messageMediaDice.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaDice.class.cast(n1) : null);
            if (tL_messageMediaDice == null || !TextUtils.equals("🎲", tL_messageMediaDice.emoticon)) {
                wlVar.run();
                return;
            }
            org.telegram.messenger.np messagesController = bnVar3.getMessagesController();
            int i15 = 5;
            x xVar = new x(this, messageObject, wlVar, i15);
            TLRPC.EmojiGameInfo emojiGameInfo = messagesController.C8;
            if (emojiGameInfo != null) {
                xVar.a(Boolean.valueOf(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo));
                return;
            }
            ArrayList arrayList = messagesController.B8;
            if (arrayList != null) {
                arrayList.add(xVar);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            messagesController.B8 = arrayList2;
            arrayList2.add(xVar);
            messagesController.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new d3.b(i13), new org.telegram.messenger.bl(messagesController, i15));
            return;
        }
        if ((messageObject.G2() && (!messageObject.F2() || (bnVar3.Ua.e.containsKey(nx.p(org.telegram.messenger.gj.U(messageObject.F0()))) && bnVar3.f != null))) || messageObject.W3()) {
            bnVar3.qb(r1Var);
            bnVar3.Ua.k(r1Var, bnVar3, true);
            bnVar3.A0.I0(false);
            return;
        }
        int i16 = 6;
        if (messageObject.m5()) {
            he Lb = bnVar3.Lb(messageObject, false);
            bi.q2 a52 = bn.a5(bnVar3, messageObject);
            r1Var.invalidate();
            final SecretMediaViewer f12 = SecretMediaViewer.f();
            final Activity parentActivity = bnVar3.getParentActivity();
            int i17 = org.telegram.messenger.k10.t0;
            f12.a = i17;
            ImageReceiver imageReceiver = f12.h;
            imageReceiver.d = i17;
            if (f12.b != parentActivity) {
                f12.b = parentActivity;
                f12.f1 = new org.telegram.ui.Components.ll0(parentActivity, null);
                k0 k0Var = new k0(22, parentActivity, f12);
                f12.d = k0Var;
                k0Var.setBackgroundDrawable(f12.k0);
                f12.d.setFocusable(true);
                f12.d.setFocusableInTouchMode(true);
                f12.d.setClipChildren(false);
                f12.d.setClipToPadding(false);
                f12.e = new ai.l0(f12, parentActivity);
                View view = new View(parentActivity);
                f12.f = view;
                view.setBackgroundColor(2130706432);
                f12.e.addView(f12.f, c8.ma.e(-1, -2, 80));
                f12.e.setFocusable(false);
                f12.d.addView(f12.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f12.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                f12.e.setLayoutParams(layoutParams);
                f12.e.setFitsSystemWindows(true);
                f12.e.setOnApplyWindowInsetsListener(new gz0(f12, 0));
                f12.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(f12.e.getContext(), f12);
                f12.K0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(f12);
                org.telegram.ui.Components.v7 v7Var = new org.telegram.ui.Components.v7(i16, parentActivity, f12);
                f12.G = v7Var;
                v7Var.setTitleColor(-1);
                f12.G.setSubtitleColor(-1);
                f12.G.setBackgroundColor(2130706432);
                f12.G.setOccupyStatusBar(true);
                f12.G.F(1090519039, false);
                f12.G.G(-1, false);
                f12.G.setBackButtonImage(R.drawable.ic_ab_back);
                f12.G.setTitleRightMargin(org.telegram.messenger.g0.L(70.0f));
                f12.e.addView(f12.G, c8.ma.c(-2.0f, -1));
                f12.G.setActionBarMenuOnItemClick(new hs0(f12, 12));
                hi.l3 l3Var = new hi.l3(parentActivity, 1);
                f12.r = l3Var;
                l3Var.o(1.0f, -26.0f);
                f12.r.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                f12.e.addView(f12.r, c8.ma.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                nz0 nz0Var = new nz0(f12, parentActivity);
                f12.n = nz0Var;
                f12.e.addView(nz0Var, c8.ma.d(org.telegram.messenger.ls.E1, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                xr0 xr0Var = new xr0(f12, i13);
                f12.T = new oz0(f12, parentActivity);
                View view2 = new View(parentActivity);
                f12.S = view2;
                view2.setBackgroundColor(2130706432);
                f12.T.addView(f12.S, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(f12.e.getContext());
                f12.R = m5Var;
                m5Var.setTextColor(-1);
                f12.R.setGravity(53);
                f12.R.setTextSize(14);
                f12.R.setImportantForAccessibility(2);
                f12.T.addView(f12.R, c8.ma.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                uv uvVar = new uv(9, parentActivity, f12);
                f12.Q = uvVar;
                org.telegram.ui.Components.k61 k61Var = new org.telegram.ui.Components.k61(uvVar);
                f12.P = k61Var;
                k61Var.z = org.telegram.messenger.g0.L(2.0f);
                org.telegram.ui.Components.k61 k61Var2 = f12.P;
                k61Var2.k = 872415231;
                k61Var2.l = 872415231;
                k61Var2.m = -1;
                k61Var2.n = -1;
                k61Var2.A = 1509949439;
                k61Var2.j = xr0Var;
                f12.T.addView(f12.Q);
                f12.e.addView(f12.T, c8.ma.e(-1, 48, 80));
                vo0 vo0Var = new vo0(null, new fi.b());
                f12.X = vo0Var;
                vo0Var.j0 = true;
                vo0Var.h0 = false;
                mq0 mq0Var = new mq0(f12.e.getContext());
                f12.Y = mq0Var;
                mq0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.hz0
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new lq0(parentActivity, secretMediaViewer.Z, secretMediaViewer.X, new a5(secretMediaViewer, 23), new ud0(secretMediaViewer, 2));
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
                imageView.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(64.0f), 1711276032));
                org.telegram.ui.Components.we0 we0Var = new org.telegram.ui.Components.we0(28);
                f12.V = we0Var;
                we0Var.setCallback(f12.U);
                f12.U.setImageDrawable(f12.V);
                f12.U.setScaleType(ImageView.ScaleType.CENTER);
                f12.U.setScaleX(0.6f);
                f12.U.setScaleY(0.6f);
                f12.U.setAlpha(0.0f);
                f12.U.setPivotX(org.telegram.messenger.g0.L(32.0f));
                f12.U.setPivotY(org.telegram.messenger.g0.L(32.0f));
                f12.e.addView(f12.U, c8.ma.e(64, 64, 17));
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
                org.telegram.ui.Cells.v9 n10 = f12.X.n(f12.d.getContext());
                if (n10 != null) {
                    org.telegram.messenger.g0.E2(n10);
                    f12.e.addView(n10);
                }
                f12.X.S(f12.e);
                f12.X.i0 = true;
            }
            SecretMediaViewer.f().h(messageObject, bnVar3.db, Lb, a52);
            return;
        }
        if (org.telegram.messenger.gj.H2(messageObject.F0()) && org.telegram.messenger.gj.i1(messageObject.F0()) != null) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(org.telegram.messenger.gj.i1(messageObject.F0()));
            org.telegram.ui.Components.ev evVar = new org.telegram.ui.Components.ev(bnVar3, bnVar3.getParentActivity(), bnVar3.Ba, arrayList3);
            boolean V9 = bnVar3.V9();
            evVar.i0 = V9;
            evVar.n = V9;
            bnVar3.showDialog(evVar);
            return;
        }
        if (org.telegram.messenger.gj.j1(messageObject.k) != null) {
            org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(bnVar3.getParentActivity(), bnVar3, org.telegram.messenger.gj.j1(messageObject.k), null, (bnVar3.d1.getVisibility() == 0 || !((chat = bnVar3.e) == null || org.telegram.messenger.v3.t(chat))) ? null : bnVar3.a0, bnVar3.Ba);
            boolean V92 = bnVar3.V9();
            kw0Var.i0 = V92;
            kw0Var.n = V92;
            bnVar3.showDialog(kw0Var);
            return;
        }
        if (org.telegram.messenger.gj.L4(messageObject.k) || (i7 = messageObject.D) == 1 || ((i7 == 0 && !messageObject.a5()) || org.telegram.messenger.gj.t3(messageObject.k))) {
            if (messageObject.r4()) {
                if (org.telegram.messenger.gj.t3(messageObject.k) || org.telegram.messenger.gj.S3(messageObject.k)) {
                    bnVar3.ma(messageObject, true, false);
                    if (messageObject.T0 != null) {
                        vf.b bVar2 = bnVar3.ec;
                        if (bVar2 != null) {
                            bVar2.a(true);
                        }
                        bnVar3.ec = r1Var.getMessageObject() == null ? null : new fm(this, r1Var, i13);
                        vf.c.s(bnVar3.getParentActivity(), Uri.parse(messageObject.T0), true, false, false, bnVar3.ec, null, false, bnVar3.getMessagesController().g6, false, false);
                        return;
                    }
                    return;
                }
                if (org.telegram.messenger.gj.L4(messageObject.k)) {
                    bnVar3.ma(messageObject, true, false);
                }
            }
            if (messageObject.L0() > 0.0d && messageObject.g2() > 0 && !messageObject.j3) {
                messageObject.c0 = (float) (messageObject.g2() / messageObject.L0());
            }
            bnVar3.Ka(r1Var, messageObject);
            return;
        }
        int i18 = messageObject.D;
        if (i18 == 3) {
            bnVar3.Lb(messageObject, true);
            try {
                String str2 = messageObject.k.attachPath;
                File file2 = (str2 == null || str2.length() == 0) ? null : new File(messageObject.k.attachPath);
                if (file2 == null || !file2.exists()) {
                    org.telegram.messenger.w7 fileLoader = bnVar3.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader.getClass();
                    file2 = org.telegram.messenger.w7.M(message2, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity2 = bnVar3.getParentActivity();
                    org.telegram.messenger.t0.d();
                    intent.setDataAndType(FileProvider.d(parentActivity2, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                bnVar3.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                bnVar3.M6(messageObject);
                return;
            }
        }
        if (i18 == 4) {
            if (org.telegram.messenger.g0.J1(bnVar3)) {
                if (!messageObject.C3()) {
                    qa0 qa0Var = new qa0(bnVar3.h != null ? 0 : 3);
                    qa0Var.M0 = bnVar3;
                    qa0Var.G0(messageObject);
                    bnVar3.presentFragment(qa0Var);
                    return;
                }
                TLRPC.Chat chat2 = bnVar3.e;
                if (chat2 != null && !org.telegram.messenger.v3.n(chat2) && !bnVar3.e.megagroup) {
                    i12 = 6;
                }
                qa0 qa0Var2 = new qa0(i12);
                qa0Var2.M0 = bnVar3;
                qa0Var2.G0(messageObject);
                bnVar3.presentFragment(qa0Var2);
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
                org.telegram.messenger.w7 fileLoader2 = bnVar3.getFileLoader();
                TLRPC.Message message3 = messageObject.k;
                fileLoader2.getClass();
                File M = org.telegram.messenger.w7.M(message3, false, true);
                if (M.exists()) {
                    file = M;
                }
            }
            org.telegram.ui.ActionBar.l6 v = org.telegram.ui.ActionBar.m6.v(file, messageObject.I0(), null, true);
            if (v != null) {
                bnVar3.presentFragment(new x71(v));
                return;
            }
            bnVar3.N4 = -1;
        }
        if (messageObject.x()) {
            PhotoViewer.p1().I2(null, bnVar3, bnVar3.Ba);
            PhotoViewer p12 = PhotoViewer.p1();
            int i19 = messageObject.D;
            p12.e2(messageObject, bnVar3, i19 != 0 ? bnVar3.l6 : 0L, i19 != 0 ? bnVar3.d7 : 0L, i19 != 0 ? bnVar3.d() : 0L, bnVar3.db);
            bnVar = bnVar3;
            z11 = true;
        } else {
            bnVar = bnVar3;
            z11 = false;
        }
        Pattern pattern = org.telegram.ui.Components.d90.a;
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
            if (!org.telegram.ui.Components.d90.j(messageObject)) {
                bnVar2 = bnVar;
                if (z11) {
                    try {
                        org.telegram.messenger.g0.u2(messageObject, bnVar2.getParentActivity(), bnVar2.Ba, false);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        bnVar2.M6(messageObject);
                        return;
                    }
                }
                return;
            }
        }
        if (bnVar.getParentActivity() == null) {
            bnVar2 = bnVar;
        } else {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bnVar.getParentActivity(), bnVar.Ba);
            t1Var.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            t1Var.setOnCancelListener(new hg(0, zArr));
            t1Var.r(150L);
            bn bnVar4 = bnVar;
            org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(bnVar4, messageObject, t1Var, zArr, 12);
            bnVar2 = bnVar4;
            messageObject = messageObject;
            new Thread(iVar).start();
        }
        z11 = true;
        if (z11) {
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean x1() {
        bn bnVar = this.a;
        return bnVar.m1.getMeasuredWidth() > bnVar.m1.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.m1
    public final void x2() {
        bn bnVar = this.a;
        if (!bnVar.getUserConfig().q()) {
            org.telegram.ui.Components.lc.b0(bnVar).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.T2(org.telegram.messenger.hd.H(',', "UnlockSimilarChannelsPremium", bnVar.getMessagesController().A4), new ul(this, 4))).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", bnVar.l6);
        bundle.putInt("start_from", 10);
        bnVar.presentFragment(new org.telegram.ui.Components.k90(bundle, bnVar.p1.getSharedMediaPreloader()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // org.telegram.ui.Cells.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject;
        TLRPC.MessageReplies messageReplies;
        int i7;
        long j3;
        org.telegram.messenger.bj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
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
                bn bnVar = this.a;
                bnVar.Da(bnVar.e.id, gjVar, gjVar.e1(), j10, i10, 0, null);
            }
        }
        messageObject = r1Var.getMessageObject();
        org.telegram.messenger.gj gjVar2 = messageObject;
        messageReplies = gjVar2.k.replies;
        if (messageReplies == null) {
        }
        int i102 = i7;
        long j102 = j3;
        bn bnVar2 = this.a;
        bnVar2.Da(bnVar2.e.id, gjVar2, gjVar2.e1(), j102, i102, 0, null);
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean y0(org.telegram.messenger.gj gjVar) {
        return !this.a.s.containsKey(gjVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void y2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
        org.telegram.messenger.gj messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        bn bnVar = this.a;
        hi.l3 l3Var = bnVar.P1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (bnVar.getParentActivity() == null || (messageObject = r1Var.getMessageObject()) == null || (R0 = messageObject.R0()) == null || R0.country == null) {
            return;
        }
        try {
            str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.hd.E0().y);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str = R0.country;
        }
        hi.l3 l3Var2 = new hi.l3(bnVar.getParentActivity(), 3);
        l3Var2.r(true);
        l3Var2.L = Layout.Alignment.ALIGN_NORMAL;
        l3Var2.d = -1L;
        l3Var2.U = true;
        l3Var2.e = true;
        l3Var2.s(12.0f);
        bnVar.P1 = l3Var2;
        l3Var2.r0 = new eh(4, this, l3Var2);
        l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131750836, str)));
        bnVar.P1.l(bnVar.L);
        bnVar.m1.addView(bnVar.P1, c8.ma.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        bnVar.m1.post(new l2.x(this, r1Var, i10, i7, 12));
    }

    @Override // org.telegram.ui.Cells.m1
    public final String z(long j3) {
        TLRPC.Peer peer;
        String E0;
        bn bnVar = this.a;
        if (org.telegram.messenger.p10.v(bnVar.f)) {
            return null;
        }
        TLRPC.Chat chat = bnVar.e;
        if (chat != null && !org.telegram.messenger.v3.V(chat) && (E0 = bnVar.getMessagesController().E0(bnVar.e.id, j3)) != null) {
            return E0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = bnVar.r4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || !(peer.user_id == j3 || peer.channel_id == j3 || peer.chat_id == j3)) {
            return null;
        }
        return org.telegram.messenger.hd.N0(2131743777, null);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void z0(org.telegram.ui.Cells.r1 r1Var) {
        sh.b bVar = this.a.kd;
        if (bVar == null || bVar.n != r1Var) {
            return;
        }
        bVar.x.getClass();
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        bn bnVar = this.a;
        return bnVar.ac != 0 && r1Var.getMessageObject() != null && bnVar.ac == r1Var.getMessageObject().e1() && bnVar.bc == i7;
    }

    @Override // org.telegram.ui.Cells.m1
    public final org.telegram.ui.Cells.k9 z2() {
        return this.a.u9;
    }
}
