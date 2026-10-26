package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ap extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.r90 G;
    public org.telegram.ui.Cells.v8 H;
    public org.telegram.ui.Cells.i9 I;
    public org.telegram.ui.Cells.f7 J;
    public zo K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public qa O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.q4 R;
    public org.telegram.ui.Cells.a9 S;
    public org.telegram.ui.Cells.i9 T;
    public wo U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public so a;
    public boolean a0;
    public fi.c2 b;
    public boolean b0;
    public EditTextBoldCursor c;
    public boolean c0;
    public org.telegram.ui.Cells.i9 d;
    public boolean d0;
    public org.telegram.ui.Cells.q4 e;
    public org.telegram.ui.Cells.f7 e0;
    public org.telegram.ui.Cells.q4 f;
    public ArrayList f0;
    public org.telegram.ui.Cells.w4 g0;
    public uo h;
    public int h0;
    public String i0;
    public ed j0;
    public boolean k0;
    public TLRPC.TL_chatInviteExported l0;
    public boolean m0;
    public org.telegram.ui.Components.fp0 n;
    public boolean n0;
    public HashMap o0;
    public org.telegram.ui.Components.n70 p0;
    public po q0;
    public org.telegram.ui.ActionBar.u5 r;
    public Boolean r0;
    public LinearLayout s;
    public boolean s0;
    public org.telegram.ui.Cells.n6 v;
    public org.telegram.ui.Cells.n6 w;
    public LinearLayout x;
    public LinearLayout y;

    public final void X() {
        boolean z10;
        org.telegram.ui.ActionBar.u5 u5Var = this.r;
        if (!this.V && this.b.length() <= 0) {
            ArrayList arrayList = this.N;
            z10 = false;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            u5Var.a(z10, true);
        }
        z10 = true;
        u5Var.a(z10, true);
    }

    public final boolean Y(String str) {
        if (str == null || str.length() <= 0) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        ed edVar = this.j0;
        if (edVar != null) {
            AndroidUtilities.cancelRunOnUIThread(edVar);
            this.j0 = null;
            this.i0 = null;
            if (this.h0 != 0) {
                getConnectionsManager().cancelRequest(this.h0, true);
            }
        }
        this.k0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.h.setText(LocaleController.getString(R.string.LinkInvalid));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.p7);
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.a0) {
                        this.h.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    } else {
                        this.h.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                    }
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.h.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.a0) {
                this.h.setText(LocaleController.getString(R.string.LinkInvalidShort));
            } else {
                this.h.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
            }
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.h.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.p7);
            return false;
        }
        this.h.setText(LocaleController.getString(R.string.LinkChecking));
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.F6);
        this.i0 = str;
        ed edVar2 = new ed(23, this, str);
        this.j0 = edVar2;
        AndroidUtilities.runOnUIThread(edVar2, 300L);
        return true;
    }

    public final void Z(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new fi.m3(6, this, z10)), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        boolean z10;
        boolean z11;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z12;
        final ap apVar = this;
        AndroidUtilities.runOnUIThread(apVar.q0, 200L);
        boolean z13 = true;
        if (apVar.getParentActivity() != null) {
            String publicUsername = ChatObject.getPublicUsername(apVar.X, true);
            if (apVar.V || (((publicUsername != null || apVar.b.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(apVar.b.getText().toString()))) || apVar.b.length() == 0 || apVar.k0)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String obj = apVar.V ? "" : apVar.b.getText().toString();
                if (publicUsername.equals(obj)) {
                    if (!apVar.V || (arrayList = apVar.X.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (apVar.s0) {
                        z10 = false;
                    } else {
                        apVar.s0 = true;
                        boolean z14 = false;
                        for (int i10 = 0; i10 < apVar.X.usernames.size(); i10++) {
                            TLRPC.TL_username tL_username = apVar.X.usernames.get(i10);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(apVar.X);
                            apVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new no(apVar, 1));
                        } else {
                            apVar.s0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                        if (z11) {
                            return;
                        }
                        TLRPC.Chat chat = apVar.X;
                        if (chat.noforwards != apVar.b0) {
                            if (!ChatObject.isChannel(chat)) {
                                apVar.c0(true);
                                final int i11 = 2;
                                apVar.getMessagesController().convertToMegaGroup(apVar.getParentActivity(), apVar.Z, apVar, new MessagesStorage.LongCallback(apVar) { // from class: org.telegram.ui.oo
                                    public final /* synthetic */ ap b;

                                    {
                                        this.b = apVar;
                                    }

                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                    public final void run(long j10) {
                                        switch (i11) {
                                            case 0:
                                                ap apVar2 = this.b;
                                                if (j10 == 0) {
                                                    apVar2.getClass();
                                                    break;
                                                } else {
                                                    apVar2.Z = j10;
                                                    apVar2.X = apVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                    apVar2.a0();
                                                    break;
                                                }
                                            case 1:
                                                ap apVar3 = this.b;
                                                if (j10 == 0) {
                                                    apVar3.getClass();
                                                    break;
                                                } else {
                                                    apVar3.Z = j10;
                                                    apVar3.X = apVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                    apVar3.a0();
                                                    break;
                                                }
                                            default:
                                                ap apVar4 = this.b;
                                                if (j10 == 0) {
                                                    apVar4.getClass();
                                                    break;
                                                } else {
                                                    apVar4.Z = j10;
                                                    apVar4.X = apVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                    MessagesController messagesController = apVar4.getMessagesController();
                                                    long j11 = -apVar4.Z;
                                                    TLRPC.Chat chat2 = apVar4.X;
                                                    boolean z15 = apVar4.b0;
                                                    chat2.noforwards = z15;
                                                    messagesController.toggleChatNoForwards(j11, z15);
                                                    apVar4.a0();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                z12 = false;
                                if (z12) {
                                    return;
                                }
                                if (apVar.U != null) {
                                    if (apVar.getParentActivity() != null) {
                                        if (!apVar.a0 && !ChatObject.isChannel(apVar.X)) {
                                            wo woVar = apVar.U;
                                            if (woVar.f || woVar.h) {
                                                final int i12 = 0;
                                                apVar.getMessagesController().convertToMegaGroup(apVar.getParentActivity(), apVar.Z, apVar, new MessagesStorage.LongCallback(apVar) { // from class: org.telegram.ui.oo
                                                    public final /* synthetic */ ap b;

                                                    {
                                                        this.b = apVar;
                                                    }

                                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                                    public final void run(long j10) {
                                                        switch (i12) {
                                                            case 0:
                                                                ap apVar2 = this.b;
                                                                if (j10 == 0) {
                                                                    apVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    apVar2.Z = j10;
                                                                    apVar2.X = apVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                                    apVar2.a0();
                                                                    break;
                                                                }
                                                            case 1:
                                                                ap apVar3 = this.b;
                                                                if (j10 == 0) {
                                                                    apVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    apVar3.Z = j10;
                                                                    apVar3.X = apVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                                    apVar3.a0();
                                                                    break;
                                                                }
                                                            default:
                                                                ap apVar4 = this.b;
                                                                if (j10 == 0) {
                                                                    apVar4.getClass();
                                                                    break;
                                                                } else {
                                                                    apVar4.Z = j10;
                                                                    apVar4.X = apVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                                    MessagesController messagesController = apVar4.getMessagesController();
                                                                    long j11 = -apVar4.Z;
                                                                    TLRPC.Chat chat2 = apVar4.X;
                                                                    boolean z15 = apVar4.b0;
                                                                    chat2.noforwards = z15;
                                                                    messagesController.toggleChatNoForwards(j11, z15);
                                                                    apVar4.a0();
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        if (apVar.X.join_to_send != apVar.U.f) {
                                            MessagesController messagesController = apVar.getMessagesController();
                                            long j10 = apVar.Z;
                                            TLRPC.Chat chat2 = apVar.X;
                                            boolean z15 = apVar.U.f;
                                            chat2.join_to_send = z15;
                                            messagesController.toggleChatJoinToSend(j10, z15, null, null);
                                        }
                                        if (apVar.X.join_request != apVar.U.h || apVar.W) {
                                            MessagesController messagesController2 = apVar.getMessagesController();
                                            long j11 = apVar.Z;
                                            TLRPC.Chat chat3 = apVar.X;
                                            boolean z16 = apVar.U.h;
                                            chat3.join_request = z16;
                                            messagesController2.toggleChatJoinRequest(j11, 0L, z16, apVar.W, false, null, null);
                                        }
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    apVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            MessagesController messagesController3 = apVar.getMessagesController();
                            long j12 = -apVar.Z;
                            TLRPC.Chat chat4 = apVar.X;
                            boolean z17 = apVar.b0;
                            chat4.noforwards = z17;
                            messagesController3.toggleChatNoForwards(j12, z17);
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                } else if (ChatObject.isChannel(apVar.X)) {
                    apVar.getMessagesController().updateChannelUserName(apVar, apVar.Z, obj, new po(apVar, 1), new po(apVar, 2));
                    apVar = apVar;
                } else {
                    final int i13 = 1;
                    apVar.getMessagesController().convertToMegaGroup(apVar.getParentActivity(), apVar.Z, apVar, new MessagesStorage.LongCallback(apVar) { // from class: org.telegram.ui.oo
                        public final /* synthetic */ ap b;

                        {
                            this.b = apVar;
                        }

                        @Override // org.telegram.messenger.MessagesStorage.LongCallback
                        public final void run(long j102) {
                            switch (i13) {
                                case 0:
                                    ap apVar2 = this.b;
                                    if (j102 == 0) {
                                        apVar2.getClass();
                                        break;
                                    } else {
                                        apVar2.Z = j102;
                                        apVar2.X = apVar2.getMessagesController().getChat(Long.valueOf(j102));
                                        apVar2.a0();
                                        break;
                                    }
                                case 1:
                                    ap apVar3 = this.b;
                                    if (j102 == 0) {
                                        apVar3.getClass();
                                        break;
                                    } else {
                                        apVar3.Z = j102;
                                        apVar3.X = apVar3.getMessagesController().getChat(Long.valueOf(j102));
                                        apVar3.a0();
                                        break;
                                    }
                                default:
                                    ap apVar4 = this.b;
                                    if (j102 == 0) {
                                        apVar4.getClass();
                                        break;
                                    } else {
                                        apVar4.Z = j102;
                                        apVar4.X = apVar4.getMessagesController().getChat(Long.valueOf(j102));
                                        MessagesController messagesController4 = apVar4.getMessagesController();
                                        long j112 = -apVar4.Z;
                                        TLRPC.Chat chat22 = apVar4.X;
                                        boolean z152 = apVar4.b0;
                                        chat22.noforwards = z152;
                                        messagesController4.toggleChatNoForwards(j112, z152);
                                        apVar4.a0();
                                        break;
                                    }
                            }
                        }
                    });
                }
            } else {
                Vibrator vibrator = (Vibrator) apVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(apVar.h);
                apVar.c0(false);
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
    }

    public final void b0() {
        if (getParentActivity() == null) {
            return;
        }
        tg.j0 j0Var = new tg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.v0 = this.a0;
        j0Var.H0 = new po(this, 0);
        showDialog(j0Var);
    }

    public final void c0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.q0);
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.r;
        if (u5Var != null) {
            u5Var.b(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        boolean z10;
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 4;
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, i11));
        this.r = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        this.n = new org.telegram.ui.Components.fp0(context);
        this.a = new so(this, context, this.n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.a, org.telegram.ui.Components.gb1.k());
        this.fragmentView = frameLayout;
        this.a.setFillViewport(true);
        this.a.setDrawBackground(true);
        this.a.setOverScrollMode(0);
        this.a.addView(this.n, new FrameLayout.LayoutParams(-1, -2));
        this.n.setOrientation(1);
        boolean z11 = this.n0;
        if (z11) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.a0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.n.addView(this.s, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, 23);
        this.f = q4Var;
        q4Var.setHeight(46);
        if (this.a0) {
            this.f.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.s.addView(this.f);
        org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(context, false);
        this.w = n6Var;
        if (this.a0) {
            n6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            n6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.s.addView(this.w, org.telegram.ui.Components.gb1.r(-1, -2));
        this.w.setOnClickListener(new ro(this, i10));
        org.telegram.ui.Cells.n6 n6Var2 = new org.telegram.ui.Cells.n6(context, false);
        this.v = n6Var2;
        if (this.a0) {
            n6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            n6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.s.addView(this.v, org.telegram.ui.Components.gb1.r(-1, -2));
        this.v.setOnClickListener(new ro(this, 2));
        org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        this.J = f7Var;
        this.n.addView(f7Var, org.telegram.ui.Components.gb1.r(-1, -2));
        if (z11) {
            this.w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.n.addView(this.y, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context, 23);
        this.e = q4Var2;
        this.y.addView(q4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.y.addView(this.E, org.telegram.ui.Components.gb1.o(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.c;
        int i12 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.c;
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor3, i13, null);
        this.c.setMaxLines(1);
        this.c.setLines(1);
        this.c.setEnabled(false);
        this.c.setBackground(null);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setSingleLine(true);
        this.c.setInputType(163840);
        this.c.setImeOptions(6);
        this.E.addView(this.c, org.telegram.ui.Components.gb1.r(-2, 36));
        fi.c2 c2Var = new fi.c2(this, context, i11);
        this.b = c2Var;
        c2Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.E(this.b, i12, null);
        org.telegram.ui.ActionBar.f7.V(this.b, i13, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        org.telegram.ui.ActionBar.f7.w(this.b, i13, null);
        this.b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.b.setCursorWidth(1.5f);
        this.E.addView(this.b, org.telegram.ui.Components.gb1.r(-1, 36));
        int i14 = 3;
        this.b.addTextChangedListener(new m0(this, i14));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.y.addView(this.F, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = r90Var;
        r90Var.setDelegate(new to(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        uo uoVar = new uo(this, context, this.resourceProvider);
        this.h = uoVar;
        uoVar.setBottomPadding(6);
        this.n.addView(this.h, org.telegram.ui.Components.gb1.r(-2, -2));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.d = i9Var;
        i9Var.setImportantForAccessibility(1);
        this.n.addView(this.d, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.w4 w4Var = new org.telegram.ui.Cells.w4(context);
        this.g0 = w4Var;
        this.n.addView(w4Var, org.telegram.ui.Components.gb1.r(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.n.addView(this.x, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.f7 f7Var2 = new org.telegram.ui.Cells.f7(context, (d3) null);
        this.e0 = f7Var2;
        this.n.addView(f7Var2, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Components.fp0 fp0Var = this.n;
        zo zoVar = new zo(this, context);
        this.K = zoVar;
        fp0Var.addView(zoVar, org.telegram.ui.Components.gb1.r(-1, -2));
        this.K.setVisibility((this.V || this.N.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
        this.H = v8Var;
        v8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new ro(this, i14));
        this.n.addView(this.H, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.I = i9Var2;
        this.n.addView(i9Var2, org.telegram.ui.Components.gb1.r(-1, -2));
        wo woVar = new wo(this, context, this.X, context);
        this.U = woVar;
        TLRPC.ChatFull chatFull = this.Y;
        woVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.a0) ? false : true);
        wo woVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.i9 i9Var3 = woVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(woVar2.n);
        boolean isPublic = ChatObject.isPublic(woVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            z10 = false;
            i9Var3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfo2 : isPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2));
        } else {
            StringBuilder sb2 = new StringBuilder("@");
            z10 = false;
            sb2.append(DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id))));
            i9Var3.setText(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfoManagedBy : isPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy, sb2.toString()), org.telegram.ui.ActionBar.y6.il, null, new org.telegram.ui.Components.so(29, chatFull2, this)));
        }
        this.n.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.n.addView(this.Q);
        org.telegram.ui.Cells.q4 q4Var3 = new org.telegram.ui.Cells.q4(context, 23);
        this.R = q4Var3;
        q4Var3.setHeight(46);
        this.R.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.Q.addView(this.R, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.S = a9Var;
        a9Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.b0, z10);
        this.S.setOnClickListener(new ro(this, 4));
        this.Q.addView(this.S, org.telegram.ui.Components.gb1.r(-1, -2));
        this.T = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        if (!this.a0 || ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        }
        this.Q.addView(this.T, org.telegram.ui.Components.gb1.r(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.b.setText(publicUsername);
            this.b.setSelection(publicUsername.length());
            this.m0 = false;
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.J == null) {
            return;
        }
        int i10 = 8;
        if (this.V || this.c0 || !getUserConfig().isPremium()) {
            org.telegram.ui.Cells.i9 i9Var = this.d;
            int i11 = org.telegram.ui.ActionBar.y6.B6;
            i9Var.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.f7.V(this.d.getTextView(), i11, null);
            if (this.n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.e0.setVisibility(8);
            this.x.setVisibility(8);
            this.y.setVisibility(0);
            this.g0.setVisibility(8);
            if (this.a0) {
                this.d.setText(LocaleController.getString(this.V ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.e.setText(LocaleController.getString(this.V ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.d.setText(LocaleController.getString(this.V ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.e.setText(LocaleController.getString(this.V ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.E.setVisibility(this.V ? 8 : 0);
            this.F.setVisibility(this.V ? 0 : 8);
            this.Q.setVisibility(0);
            this.H.setVisibility(0);
            this.I.setVisibility(0);
            this.y.setPadding(0, 0, 0, this.V ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.r90 r90Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.l0;
            r90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.G.c(this.l0, this.Z);
            uo uoVar = this.h;
            uoVar.setVisibility((this.V || uoVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.Z);
            this.I.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.Z)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.d.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.i9 i9Var2 = this.d;
            int i12 = org.telegram.ui.ActionBar.y6.p7;
            i9Var2.setTag(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.f7.V(this.d.getTextView(), i12, null);
            this.y.setVisibility(8);
            this.h.setVisibility(8);
            this.J.setVisibility(8);
            this.e0.setVisibility(0);
            if (this.d0) {
                this.g0.setVisibility(0);
                this.x.setVisibility(8);
            } else {
                this.g0.setVisibility(8);
                this.x.setVisibility(0);
            }
        }
        this.v.a(!this.V);
        this.w.a(this.V);
        this.b.clearFocus();
        wo woVar = this.U;
        if (woVar != null) {
            woVar.setVisibility((!this.a0 || this.V) ? 0 : 8);
            wo woVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            woVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.a0) ? false : true);
        }
        zo zoVar = this.K;
        if (zoVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i10 = 0;
            }
            zoVar.setVisibility(i10);
        }
        X();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.Z) {
                this.Y = chatFull;
                this.l0 = chatFull.exported_invite;
                d0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
                if (j5Var == null || j5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.gp0 getScrollViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.y6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        LinearLayout linearLayout = this.s;
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.g0, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        fi.c2 c2Var;
        super.onBecomeFullyVisible();
        if (!this.n0 || (c2Var = this.b) == null) {
            return;
        }
        c2Var.requestFocus();
        AndroidUtilities.showKeyboard(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10 = this.n0;
        ArrayList arrayList = this.N;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.Z));
        this.X = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = getMessagesStorage().getChatSync(this.Z);
            this.X = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.X, true);
                if (this.Y == null) {
                    TLRPC.ChatFull loadChatInfo = getMessagesStorage().loadChatInfo(this.Z, ChatObject.isChannel(this.X), new CountDownLatch(1), false, false);
                    this.Y = loadChatInfo;
                }
            }
            return false;
        }
        this.V = (z10 || ChatObject.isPublic(this.X)) ? false : true;
        this.a0 = ChatObject.isChannel(this.X) && !this.X.megagroup;
        TLRPC.Chat chat2 = this.X;
        this.b0 = chat2.noforwards;
        if ((z10 && !ChatObject.isPublic(chat2)) || (this.V && this.X.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new no(this, 3));
        }
        if (this.V && this.Y != null) {
            getMessagesController().loadFullChat(this.Z, this.classGuid, true);
        }
        if (this.X != null) {
            this.M.clear();
            arrayList.clear();
            for (int i10 = 0; i10 < this.X.usernames.size(); i10++) {
                if (this.X.usernames.get(i10).active) {
                    arrayList.add(this.X.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < this.X.usernames.size(); i11++) {
                if (!this.X.usernames.get(i11).active) {
                    arrayList.add(this.X.usernames.get(i11));
                }
            }
        }
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.l0 = tL_chatInviteExported;
            this.G.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.G.c(this.l0, this.Z);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.w4 w4Var = this.g0;
            if (w4Var != null && w4Var.getChildCount() > 0 && (this.g0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.g0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.x;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.x.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.k(nVar.n, nVar.f);
                        nVar.a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.n70 n70Var = this.p0;
            if (n70Var != null) {
                n70Var.updateColors();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
