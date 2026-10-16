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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h60 extends org.telegram.ui.Components.lm0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final /* synthetic */ n60 M;
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

    public h60(n60 n60Var, LaunchActivity launchActivity) {
        this.M = n60Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        n60 n60Var = this.M;
        ArrayList arrayList = n60Var.q0;
        ChatObject.Call call = n60Var.a1;
        if (call == null || call.isScheduled() || n60Var.s0) {
            return;
        }
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.F = 0;
        this.L = n60Var.a1.participants.h(MessageObject.getPeerId(n60Var.A0)) >= 0;
        if (n60Var.p1()) {
            int i10 = this.F;
            this.F = i10 + 1;
            this.K = i10;
        }
        int i11 = this.F;
        this.G = i11;
        int size = arrayList.size() + i11;
        this.F = size;
        this.H = size;
        if (arrayList.size() > 0) {
            int i12 = this.F;
            this.F = i12 + 1;
            this.I = i12;
        }
        if (!arrayList.isEmpty() && n60Var.R0() && n60Var.a1.call.participants_count > n60Var.d.getMessagesController().groupCallVideoMaxParticipants) {
            int i13 = this.F;
            this.F = i13 + 1;
            this.J = i13;
        }
        this.d = this.F;
        if (!n60Var.s1()) {
            this.F = n60Var.a1.visibleParticipants.size() + this.F;
        }
        this.e = this.F;
        if (n60Var.a1.invitedUsers.isEmpty() || n60Var.s1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i14 = this.F;
            this.f = i14;
            int size2 = n60Var.a1.invitedUsers.size() + i14;
            this.F = size2;
            this.h = size2;
        }
        if (n60Var.a1.shadyJoinParticipants.isEmpty() || n60Var.s1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.F;
            this.n = i15;
            int size3 = n60Var.a1.shadyJoinParticipants.size() + i15;
            this.F = size3;
            this.r = size3;
        }
        if (n60Var.a1.shadyLeftParticipants.isEmpty() || n60Var.s1()) {
            this.s = -1;
            this.v = -1;
        } else {
            int i16 = this.F;
            this.s = i16;
            int size4 = n60Var.a1.shadyLeftParticipants.size() + i16;
            this.F = size4;
            this.v = size4;
        }
        if (n60Var.p1()) {
            int i17 = this.F;
            this.x = i17;
            this.F = i17 + 2;
            this.y = i17 + 1;
        } else if (!n60Var.s1() && (((!ChatObject.isChannel(n60Var.Z0) || ((chat2 = n60Var.Z0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(n60Var.Z0)) || (ChatObject.isChannel(n60Var.Z0) && (chat = n60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            int i18 = this.F;
            this.F = i18 + 1;
            this.w = i18;
        }
        int i19 = this.F;
        this.F = i19 + 1;
        this.E = i19;
    }

    @Override // s4.g0
    public final int h() {
        return this.F;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == this.E) {
            return 3;
        }
        if (i10 == this.w || i10 == this.x || i10 == this.y) {
            return 0;
        }
        if (i10 == this.I) {
            return 5;
        }
        if (i10 >= this.d && i10 < this.e) {
            return 1;
        }
        if (i10 >= this.G && i10 < this.H) {
            return 4;
        }
        if (i10 == this.J) {
            return 6;
        }
        return i10 == this.K ? 7 : 2;
    }

    @Override // s4.g0
    public final void l() {
        E();
        super.l();
    }

    @Override // s4.g0
    public final void m(int i10) {
        E();
        super.m(i10);
    }

    @Override // s4.g0
    public final void p(int i10, int i11) {
        E();
        super.p(i10, i11);
    }

    @Override // s4.g0
    public final void q(int i10, int i11) {
        E();
        super.q(i10, i11);
    }

    @Override // s4.g0
    public final void r(int i10, int i11, Object obj) {
        E();
        super.r(i10, i11, obj);
    }

    @Override // s4.g0
    public final void s(int i10, int i11) {
        E();
        super.s(i10, i11);
    }

    @Override // s4.g0
    public final void t(int i10, int i11) {
        E();
        super.t(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        u50 u50Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        ChatObject.VideoParticipant videoParticipant;
        u50 u50Var2;
        n60 n60Var = this.M;
        ArrayList arrayList = n60Var.D0;
        ArrayList arrayList2 = n60Var.F0;
        ArrayList arrayList3 = n60Var.q0;
        ArrayList arrayList4 = n60Var.E0;
        int i12 = b1Var.f;
        View view = b1Var.a;
        TLRPC.FileLocation fileLocation = null;
        r12 = null;
        TLRPC.FileLocation fileLocation2 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        Long l4 = null;
        fileLocation = null;
        if (i12 == 0) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i10 == this.x) {
                int i13 = org.telegram.ui.ActionBar.g6.v6;
                c6Var2 = ((org.telegram.ui.ActionBar.e3) n60Var).resourcesProvider;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i13, c6Var2);
                x3Var.a(w02, w02);
                x3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                return;
            }
            if (i10 == this.y) {
                int i14 = org.telegram.ui.ActionBar.g6.v6;
                c6Var = ((org.telegram.ui.ActionBar.e3) n60Var).resourcesProvider;
                int w03 = org.telegram.ui.ActionBar.g6.w0(i14, c6Var);
                x3Var.a(w03, w03);
                x3Var.b(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                return;
            }
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.lg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.og, false), n60Var.O.getTag() != null ? 1.0f : 0.0f, 1.0f);
            x3Var.a(offsetColor, offsetColor);
            if (!ChatObject.isChannel(n60Var.Z0) || (chat = n60Var.Z0) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
                x3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipGroupInviteMember), false);
                return;
            } else {
                x3Var.b(R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareLink), false);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            int i15 = i10 - this.d;
            if (n60Var.s0) {
                if (i15 >= 0 && i15 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i15);
                }
                groupCallParticipant = null;
            } else {
                if (i15 >= 0 && i15 < n60Var.a1.visibleParticipants.size()) {
                    groupCallParticipant = n60Var.a1.visibleParticipants.get(i15);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(n60Var.A0);
                if (peerId == peerId2 && (u50Var = n60Var.i2) != null) {
                    fileLocation = u50Var.c;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                float f7 = fileLocation3 != null ? n60Var.i2.a : 1.0f;
                boolean z14 = e4Var.getParticipant() != null && MessageObject.getPeerId(e4Var.getParticipant().peer) == peerId;
                e4Var.e(n60Var.d, groupCallParticipant, n60Var.a1, peerId2, fileLocation3, z14);
                boolean z15 = z14;
                org.telegram.ui.Cells.z3 z3Var = e4Var.x;
                z3Var.setProgress(f7);
                if (f7 < 1.0f) {
                    AndroidUtilities.updateViewVisibilityAnimated(z3Var, true, 1.0f, z15);
                    return;
                } else {
                    AndroidUtilities.updateViewVisibilityAnimated(z3Var, false, 1.0f, z15);
                    return;
                }
            }
            return;
        }
        if (i12 != 2) {
            if (i12 != 4) {
                return;
            }
            org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
            ChatObject.VideoParticipant participant = lVar.getParticipant();
            int i16 = i10 - this.G;
            lVar.a = n60Var.c.i(i10);
            if (n60Var.s0) {
                if (i16 >= 0 && i16 < arrayList4.size()) {
                    videoParticipant = (ChatObject.VideoParticipant) arrayList4.get(i16);
                }
                videoParticipant = null;
            } else {
                if (i16 >= 0 && i16 < arrayList3.size()) {
                    videoParticipant = (ChatObject.VideoParticipant) arrayList3.get(i16);
                }
                videoParticipant = null;
            }
            if (videoParticipant != null) {
                if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(n60Var.A0) && (u50Var2 = n60Var.i2) != null) {
                    fileLocation2 = u50Var2.c;
                }
                if (fileLocation2 != null) {
                    float f10 = n60Var.i2.a;
                }
                if (lVar.getParticipant() != null) {
                    lVar.getParticipant().equals(videoParticipant);
                }
                lVar.d = videoParticipant;
            }
            if (participant == null || participant.equals(videoParticipant) || !lVar.e || lVar.getRenderer() == null) {
                return;
            }
            n60.O(n60Var, lVar, false);
            n60.O(n60Var, lVar, true);
            return;
        }
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
        int i17 = i10 - this.f;
        int i18 = i10 - this.n;
        if (i18 < 0 || i18 >= n60Var.a1.shadyJoinParticipants.size()) {
            int i19 = i10 - this.s;
            if (i19 < 0 || i19 >= n60Var.a1.shadyLeftParticipants.size()) {
                if (n60Var.s0) {
                    if (i17 >= 0 && i17 < arrayList2.size()) {
                        l4 = (Long) arrayList2.get(i17);
                    }
                } else if (i17 >= 0 && i17 < n60Var.a1.invitedUsers.size()) {
                    l4 = n60Var.a1.invitedUsers.get(i17);
                    ChatObject.Call.InvitedUser invitedUser = n60Var.a1.invitedUsersMessageIds.get(l4);
                    z10 = invitedUser != null && invitedUser.isCalling();
                    z11 = false;
                    z12 = false;
                }
                z13 = false;
                z12 = false;
            } else {
                l4 = n60Var.a1.shadyLeftParticipants.get(i10 - this.s);
                z12 = true;
                z11 = false;
                z10 = false;
            }
            if (l4 == null) {
                i11 = ((org.telegram.ui.ActionBar.e3) n60Var).currentAccount;
                org.telegram.ui.ActionBar.h5 h5Var = w3Var.c;
                org.telegram.ui.ActionBar.h5 h5Var2 = w3Var.b;
                org.telegram.ui.Components.z9 z9Var = w3Var.a;
                org.telegram.ui.Components.k9 k9Var = w3Var.e;
                TLRPC.User user = MessagesController.getInstance(i11).getUser(l4);
                w3Var.f = user;
                if (user == null) {
                    k9Var.g(21);
                } else {
                    k9Var.r(user);
                }
                h5Var2.l(UserObject.getUserName(w3Var.f), false);
                z9Var.getImageReceiver().setCurrentAccount(i11);
                z9Var.e(w3Var.f, k9Var);
                h5Var.l(LocaleController.getString(z12 ? R.string.ShadyLeaving : z11 ? R.string.ShadyJoining : z10 ? R.string.ConferenceCalling : R.string.Invited), false);
                float f11 = 0.5f;
                z9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                h5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                if (!z11 && !z12) {
                    f11 = 1.0f;
                }
                h5Var.setAlpha(f11);
                ImageView imageView = w3Var.d;
                if (!z11 && !z12) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l4 = n60Var.a1.shadyJoinParticipants.get(i10 - this.n);
        z13 = true;
        z12 = false;
        z10 = z12;
        z11 = z13;
        if (l4 == null) {
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        n60 n60Var = this.M;
        AccountInstance accountInstance = n60Var.d;
        Context context = this.c;
        if (i10 == 0) {
            d60 d60Var = new d60(context);
            d60Var.h = 67;
            d60Var.n = 18;
            Paint paint = new Paint();
            d60Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.gg, false));
            d60Var.e = 23;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            d60Var.a = h5Var;
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
            h5Var.setTextSize(16);
            h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
            h5Var.setImportantForAccessibility(2);
            d60Var.addView(h5Var);
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
            d60Var.b = h5Var2;
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I6, false));
            h5Var2.setTextSize(16);
            h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
            h5Var2.setImportantForAccessibility(2);
            d60Var.addView(h5Var2);
            ImageView imageView = new ImageView(context);
            d60Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.m6, false), PorterDuff.Mode.MULTIPLY));
            d60Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            d60Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            d60Var.addView(imageView2);
            d60Var.setFocusable(true);
            view = d60Var;
        } else if (i10 == 1) {
            view = new e60(this, context);
        } else if (i10 == 2) {
            f60 f60Var = new f60(context);
            f60Var.n = org.telegram.ui.ActionBar.g6.rg;
            Paint paint2 = new Paint();
            f60Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.gg, false));
            f60Var.e = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
            f60Var.a = z9Var;
            z9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
            boolean z10 = LocaleController.isRTL;
            f60Var.addView(z9Var, w7.z5.a(46.0f, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f, 46, (z10 ? 5 : 3) | 48));
            org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
            f60Var.b = h5Var3;
            h5Var3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ng, false));
            h5Var3.setTypeface(AndroidUtilities.bold());
            h5Var3.setTextSize(16);
            h5Var3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z11 = LocaleController.isRTL;
            f60Var.addView(h5Var3, w7.z5.a(20.0f, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f, -1, (z11 ? 5 : 3) | 48));
            org.telegram.ui.ActionBar.h5 h5Var4 = new org.telegram.ui.ActionBar.h5(context);
            f60Var.c = h5Var4;
            h5Var4.setTextSize(15);
            h5Var4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            h5Var4.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, f60Var.n, false));
            h5Var4.l(LocaleController.getString(R.string.Invited), false);
            boolean z12 = LocaleController.isRTL;
            f60Var.addView(h5Var4, w7.z5.a(20.0f, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f, -1, (z12 ? 5 : 3) | 48));
            ImageView imageView3 = new ImageView(context);
            f60Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, f60Var.n, false), PorterDuff.Mode.MULTIPLY));
            f60Var.addView(imageView3, w7.z5.a(-1.0f, 6.0f, 0.0f, 6.0f, 0.0f, 48, (LocaleController.isRTL ? 3 : 5) | 16));
            f60Var.setWillNotDraw(false);
            f60Var.setFocusable(true);
            view = f60Var;
        } else if (i10 == 4) {
            view = new g60(this, context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Components.xn(context, 15);
        } else if (i10 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
            if (ChatObject.isChannelOrGiga(n60Var.Z0)) {
                textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            } else {
                textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            }
        } else if (i10 != 7) {
            view = new View(context);
        } else {
            if (n60Var.p0 == null) {
                n60Var.p0 = new y50();
            }
            view = new x50(context, n60Var.p0);
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        j50 j50Var = this.M.O;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            int i11 = j50Var.getTag() != null ? org.telegram.ui.ActionBar.g6.rg : org.telegram.ui.ActionBar.g6.mg;
            e4Var.f(i11, org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            e4Var.setDrawDivider(b1Var.b() != this.F - 2);
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            int i12 = j50Var.getTag() != null ? org.telegram.ui.ActionBar.g6.rg : org.telegram.ui.ActionBar.g6.mg;
            w3Var.a(i12, org.telegram.ui.ActionBar.g6.x0(null, i12, false));
            w3Var.setDrawDivider(b1Var.b() != this.F - 2);
        }
    }
}
