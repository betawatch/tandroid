package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i50 extends org.telegram.ui.Components.vk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final /* synthetic */ o50 I;
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public i50(o50 o50Var, LaunchActivity launchActivity) {
        this.I = o50Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return (i9 == 3 || i9 == 4 || i9 == 5 || i9 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        o50 o50Var = this.I;
        ArrayList arrayList = o50Var.m0;
        ChatObject.Call call = o50Var.W0;
        if (call == null || call.isScheduled() || o50Var.o0) {
            return;
        }
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.B = 0;
        this.H = o50Var.W0.participants.h(MessageObject.getPeerId(o50Var.w0)) >= 0;
        if (o50Var.o1()) {
            int i9 = this.B;
            this.B = i9 + 1;
            this.G = i9;
        }
        int i10 = this.B;
        this.C = i10;
        int size = arrayList.size() + i10;
        this.B = size;
        this.D = size;
        if (arrayList.size() > 0) {
            int i11 = this.B;
            this.B = i11 + 1;
            this.E = i11;
        }
        if (!arrayList.isEmpty() && o50Var.Q0() && o50Var.W0.call.participants_count > o50Var.d.getMessagesController().groupCallVideoMaxParticipants) {
            int i12 = this.B;
            this.B = i12 + 1;
            this.F = i12;
        }
        this.d = this.B;
        if (!o50Var.r1()) {
            this.B = o50Var.W0.visibleParticipants.size() + this.B;
        }
        this.e = this.B;
        if (o50Var.W0.invitedUsers.isEmpty() || o50Var.r1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i13 = this.B;
            this.f = i13;
            int size2 = o50Var.W0.invitedUsers.size() + i13;
            this.B = size2;
            this.h = size2;
        }
        if (o50Var.W0.shadyJoinParticipants.isEmpty() || o50Var.r1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i14 = this.B;
            this.n = i14;
            int size3 = o50Var.W0.shadyJoinParticipants.size() + i14;
            this.B = size3;
            this.r = size3;
        }
        if (o50Var.W0.shadyLeftParticipants.isEmpty() || o50Var.r1()) {
            this.s = -1;
            this.v = -1;
        } else {
            int i15 = this.B;
            this.s = i15;
            int size4 = o50Var.W0.shadyLeftParticipants.size() + i15;
            this.B = size4;
            this.v = size4;
        }
        if (o50Var.o1()) {
            int i16 = this.B;
            this.x = i16;
            this.B = i16 + 2;
            this.y = i16 + 1;
        } else if (!o50Var.r1() && (((!ChatObject.isChannel(o50Var.V0) || ((chat2 = o50Var.V0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(o50Var.V0)) || (ChatObject.isChannel(o50Var.V0) && (chat = o50Var.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            int i17 = this.B;
            this.B = i17 + 1;
            this.w = i17;
        }
        int i18 = this.B;
        this.B = i18 + 1;
        this.A = i18;
    }

    @Override // f2.r0
    public final int h() {
        return this.B;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == this.A) {
            return 3;
        }
        if (i9 == this.w || i9 == this.x || i9 == this.y) {
            return 0;
        }
        if (i9 == this.E) {
            return 5;
        }
        if (i9 >= this.d && i9 < this.e) {
            return 1;
        }
        if (i9 >= this.C && i9 < this.D) {
            return 4;
        }
        if (i9 == this.F) {
            return 6;
        }
        return i9 == this.G ? 7 : 2;
    }

    @Override // f2.r0
    public final void l() {
        E();
        super.l();
    }

    @Override // f2.r0
    public final void m(int i9) {
        E();
        super.m(i9);
    }

    @Override // f2.r0
    public final void p(int i9, int i10) {
        E();
        super.p(i9, i10);
    }

    @Override // f2.r0
    public final void q(int i9, int i10) {
        E();
        super.q(i9, i10);
    }

    @Override // f2.r0
    public final void r(int i9, int i10, Object obj) {
        E();
        super.r(i9, i10, obj);
    }

    @Override // f2.r0
    public final void s(int i9, int i10) {
        E();
        super.s(i9, i10);
    }

    @Override // f2.r0
    public final void t(int i9, int i10) {
        E();
        super.t(i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        w40 w40Var;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        w40 w40Var2;
        o50 o50Var = this.I;
        ArrayList arrayList = o50Var.z0;
        ArrayList arrayList2 = o50Var.B0;
        ArrayList arrayList3 = o50Var.m0;
        ArrayList arrayList4 = o50Var.A0;
        int i11 = q1Var.f;
        View view = q1Var.a;
        TLRPC.FileLocation fileLocation = null;
        r12 = null;
        TLRPC.FileLocation fileLocation2 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        Long l10 = null;
        fileLocation = null;
        if (i11 == 0) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i9 == this.x) {
                int i12 = org.telegram.ui.ActionBar.f6.v6;
                b6Var2 = ((org.telegram.ui.ActionBar.f3) o50Var).resourcesProvider;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i12, b6Var2);
                x3Var.a(v02, v02);
                x3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                return;
            }
            if (i9 == this.y) {
                int i13 = org.telegram.ui.ActionBar.f6.v6;
                b6Var = ((org.telegram.ui.ActionBar.f3) o50Var).resourcesProvider;
                int v03 = org.telegram.ui.ActionBar.f6.v0(i13, b6Var);
                x3Var.a(v03, v03);
                x3Var.b(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                return;
            }
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.lg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.og, false), o50Var.K.getTag() != null ? 1.0f : 0.0f, 1.0f);
            x3Var.a(offsetColor, offsetColor);
            if (!ChatObject.isChannel(o50Var.V0) || (chat = o50Var.V0) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
                x3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipGroupInviteMember), false);
                return;
            } else {
                x3Var.b(R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareLink), false);
                return;
            }
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            int i14 = i9 - this.d;
            if (o50Var.o0) {
                if (i14 >= 0 && i14 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i14);
                }
                groupCallParticipant = null;
            } else {
                if (i14 >= 0 && i14 < o50Var.W0.visibleParticipants.size()) {
                    groupCallParticipant = o50Var.W0.visibleParticipants.get(i14);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(o50Var.w0);
                if (peerId == peerId2 && (w40Var = o50Var.e2) != null) {
                    fileLocation = w40Var.c;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                float f10 = fileLocation3 != null ? o50Var.e2.a : 1.0f;
                boolean z13 = e4Var.getParticipant() != null && MessageObject.getPeerId(e4Var.getParticipant().peer) == peerId;
                e4Var.e(o50Var.d, groupCallParticipant, o50Var.W0, peerId2, fileLocation3, z13);
                boolean z14 = z13;
                org.telegram.ui.Cells.z3 z3Var = e4Var.x;
                z3Var.setProgress(f10);
                if (f10 < 1.0f) {
                    AndroidUtilities.updateViewVisibilityAnimated(z3Var, true, 1.0f, z14);
                    return;
                } else {
                    AndroidUtilities.updateViewVisibilityAnimated(z3Var, false, 1.0f, z14);
                    return;
                }
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
            ChatObject.VideoParticipant participant = lVar.getParticipant();
            int i15 = i9 - this.C;
            lVar.a = o50Var.c.i(i9);
            if (o50Var.o0) {
                if (i15 >= 0 && i15 < arrayList4.size()) {
                    videoParticipant = (ChatObject.VideoParticipant) arrayList4.get(i15);
                }
                videoParticipant = null;
            } else {
                if (i15 >= 0 && i15 < arrayList3.size()) {
                    videoParticipant = (ChatObject.VideoParticipant) arrayList3.get(i15);
                }
                videoParticipant = null;
            }
            if (videoParticipant != null) {
                if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(o50Var.w0) && (w40Var2 = o50Var.e2) != null) {
                    fileLocation2 = w40Var2.c;
                }
                if (fileLocation2 != null) {
                    float f11 = o50Var.e2.a;
                }
                if (lVar.getParticipant() != null) {
                    lVar.getParticipant().equals(videoParticipant);
                }
                lVar.d = videoParticipant;
            }
            if (participant == null || participant.equals(videoParticipant) || !lVar.e || lVar.getRenderer() == null) {
                return;
            }
            o50.M(o50Var, lVar, false);
            o50.M(o50Var, lVar, true);
            return;
        }
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
        int i16 = i9 - this.f;
        int i17 = i9 - this.n;
        if (i17 < 0 || i17 >= o50Var.W0.shadyJoinParticipants.size()) {
            int i18 = i9 - this.s;
            if (i18 < 0 || i18 >= o50Var.W0.shadyLeftParticipants.size()) {
                if (o50Var.o0) {
                    if (i16 >= 0 && i16 < arrayList2.size()) {
                        l10 = (Long) arrayList2.get(i16);
                    }
                } else if (i16 >= 0 && i16 < o50Var.W0.invitedUsers.size()) {
                    l10 = o50Var.W0.invitedUsers.get(i16);
                    ChatObject.Call.InvitedUser invitedUser = o50Var.W0.invitedUsersMessageIds.get(l10);
                    z10 = invitedUser != null && invitedUser.isCalling();
                    z11 = false;
                    z12 = false;
                    if (l10 != null) {
                        i10 = ((org.telegram.ui.ActionBar.f3) o50Var).currentAccount;
                        org.telegram.ui.ActionBar.h5 h5Var = w3Var.c;
                        org.telegram.ui.ActionBar.h5 h5Var2 = w3Var.b;
                        org.telegram.ui.Components.o9 o9Var = w3Var.a;
                        org.telegram.ui.Components.z8 z8Var = w3Var.e;
                        TLRPC.User user = MessagesController.getInstance(i10).getUser(l10);
                        w3Var.f = user;
                        if (user == null) {
                            z8Var.g(21);
                        } else {
                            z8Var.r(user);
                        }
                        h5Var2.l(UserObject.getUserName(w3Var.f), false);
                        o9Var.getImageReceiver().setCurrentAccount(i10);
                        o9Var.e(w3Var.f, z8Var);
                        h5Var.l(LocaleController.getString(z12 ? R.string.ShadyLeaving : z11 ? R.string.ShadyJoining : z10 ? R.string.ConferenceCalling : R.string.Invited), false);
                        float f12 = 0.5f;
                        o9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                        h5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                        if (!z11 && !z12) {
                            f12 = 1.0f;
                        }
                        h5Var.setAlpha(f12);
                        ImageView imageView = w3Var.d;
                        if (!z11 && !z12) {
                            r9 = 1.0f;
                        }
                        imageView.setAlpha(r9);
                        return;
                    }
                    return;
                }
                z11 = false;
            } else {
                l10 = o50Var.W0.shadyLeftParticipants.get(i9 - this.s);
                z11 = false;
                z12 = true;
                z10 = false;
                if (l10 != null) {
                }
            }
        } else {
            l10 = o50Var.W0.shadyJoinParticipants.get(i9 - this.n);
            z11 = true;
        }
        z12 = false;
        z10 = false;
        if (l10 != null) {
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        o50 o50Var = this.I;
        AccountInstance accountInstance = o50Var.d;
        Context context = this.c;
        if (i9 == 0) {
            e50 e50Var = new e50(context);
            e50Var.h = 67;
            e50Var.n = 18;
            Paint paint = new Paint();
            e50Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gg, false));
            e50Var.e = 23;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            e50Var.a = h5Var;
            h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
            h5Var.setTextSize(16);
            h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
            h5Var.setImportantForAccessibility(2);
            e50Var.addView(h5Var);
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
            e50Var.b = h5Var2;
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
            h5Var2.setTextSize(16);
            h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
            h5Var2.setImportantForAccessibility(2);
            e50Var.addView(h5Var2);
            ImageView imageView = new ImageView(context);
            e50Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.m6, false), PorterDuff.Mode.MULTIPLY));
            e50Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            e50Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            e50Var.addView(imageView2);
            e50Var.setFocusable(true);
            view = e50Var;
        } else if (i9 == 1) {
            view = new f50(this, context);
        } else if (i9 == 2) {
            g50 g50Var = new g50(context);
            g50Var.n = org.telegram.ui.ActionBar.f6.rg;
            Paint paint2 = new Paint();
            g50Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gg, false));
            g50Var.e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            g50Var.a = o9Var;
            o9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
            boolean z10 = LocaleController.isRTL;
            g50Var.addView(o9Var, g7.e6.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
            g50Var.b = h5Var3;
            h5Var3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ng, false));
            h5Var3.setTypeface(AndroidUtilities.bold());
            h5Var3.setTextSize(16);
            h5Var3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z11 = LocaleController.isRTL;
            g50Var.addView(h5Var3, g7.e6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var4 = new org.telegram.ui.ActionBar.h5(context);
            g50Var.c = h5Var4;
            h5Var4.setTextSize(15);
            h5Var4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            h5Var4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, g50Var.n, false));
            h5Var4.l(LocaleController.getString(R.string.Invited), false);
            boolean z12 = LocaleController.isRTL;
            g50Var.addView(h5Var4, g7.e6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            g50Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, g50Var.n, false), PorterDuff.Mode.MULTIPLY));
            g50Var.addView(imageView3, g7.e6.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            g50Var.setWillNotDraw(false);
            g50Var.setFocusable(true);
            view = g50Var;
        } else if (i9 == 4) {
            view = new h50(this, context);
        } else if (i9 == 5) {
            view = new org.telegram.ui.Components.an(context, 16);
        } else if (i9 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
            if (ChatObject.isChannelOrGiga(o50Var.V0)) {
                textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            } else {
                textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            }
        } else if (i9 != 7) {
            view = new View(context);
        } else {
            if (o50Var.l0 == null) {
                o50Var.l0 = new z40();
            }
            view = new fh.l2(context, o50Var.l0);
        }
        return j3.r0.s(view, view, -1, -2);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        k40 k40Var = this.I.K;
        int i9 = q1Var.f;
        View view = q1Var.a;
        if (i9 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            int i10 = k40Var.getTag() != null ? org.telegram.ui.ActionBar.f6.rg : org.telegram.ui.ActionBar.f6.mg;
            e4Var.f(i10, org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            e4Var.setDrawDivider(q1Var.b() != this.B - 2);
            return;
        }
        if (i9 == 2) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            int i11 = k40Var.getTag() != null ? org.telegram.ui.ActionBar.f6.rg : org.telegram.ui.ActionBar.f6.mg;
            w3Var.a(i11, org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            w3Var.setDrawDivider(q1Var.b() != this.B - 2);
        }
    }
}
