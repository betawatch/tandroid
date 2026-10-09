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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a60 extends org.telegram.ui.Components.pm0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final /* synthetic */ g60 M;
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

    public a60(g60 g60Var, LaunchActivity launchActivity) {
        this.M = g60Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        g60 g60Var = this.M;
        ArrayList arrayList = g60Var.q0;
        ChatObject.Call call = g60Var.a1;
        if (call == null || call.isScheduled() || g60Var.s0) {
            return;
        }
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.F = 0;
        this.L = g60Var.a1.participants.h(MessageObject.getPeerId(g60Var.A0)) >= 0;
        if (g60Var.p1()) {
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
        if (!arrayList.isEmpty() && g60Var.R0() && g60Var.a1.call.participants_count > g60Var.d.getMessagesController().groupCallVideoMaxParticipants) {
            int i13 = this.F;
            this.F = i13 + 1;
            this.J = i13;
        }
        this.d = this.F;
        if (!g60Var.s1()) {
            this.F = g60Var.a1.visibleParticipants.size() + this.F;
        }
        this.e = this.F;
        if (g60Var.a1.invitedUsers.isEmpty() || g60Var.s1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i14 = this.F;
            this.f = i14;
            int size2 = g60Var.a1.invitedUsers.size() + i14;
            this.F = size2;
            this.h = size2;
        }
        if (g60Var.a1.shadyJoinParticipants.isEmpty() || g60Var.s1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.F;
            this.n = i15;
            int size3 = g60Var.a1.shadyJoinParticipants.size() + i15;
            this.F = size3;
            this.r = size3;
        }
        if (g60Var.a1.shadyLeftParticipants.isEmpty() || g60Var.s1()) {
            this.s = -1;
            this.v = -1;
        } else {
            int i16 = this.F;
            this.s = i16;
            int size4 = g60Var.a1.shadyLeftParticipants.size() + i16;
            this.F = size4;
            this.v = size4;
        }
        if (g60Var.p1()) {
            int i17 = this.F;
            this.x = i17;
            this.F = i17 + 2;
            this.y = i17 + 1;
        } else if (!g60Var.s1() && (((!ChatObject.isChannel(g60Var.Z0) || ((chat2 = g60Var.Z0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(g60Var.Z0)) || (ChatObject.isChannel(g60Var.Z0) && (chat = g60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            int i18 = this.F;
            this.F = i18 + 1;
            this.w = i18;
        }
        int i19 = this.F;
        this.F = i19 + 1;
        this.E = i19;
    }

    @Override // s4.i0
    public final int h() {
        return this.F;
    }

    @Override // s4.i0
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

    @Override // s4.i0
    public final void l() {
        E();
        super.l();
    }

    @Override // s4.i0
    public final void m(int i10) {
        E();
        super.m(i10);
    }

    @Override // s4.i0
    public final void p(int i10, int i11) {
        E();
        super.p(i10, i11);
    }

    @Override // s4.i0
    public final void q(int i10, int i11) {
        E();
        super.q(i10, i11);
    }

    @Override // s4.i0
    public final void r(int i10, int i11, Object obj) {
        E();
        super.r(i10, i11, obj);
    }

    @Override // s4.i0
    public final void s(int i10, int i11) {
        E();
        super.s(i10, i11);
    }

    @Override // s4.i0
    public final void t(int i10, int i11) {
        E();
        super.t(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        n50 n50Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        ChatObject.VideoParticipant videoParticipant;
        n50 n50Var2;
        g60 g60Var = this.M;
        ArrayList arrayList = g60Var.D0;
        ArrayList arrayList2 = g60Var.F0;
        ArrayList arrayList3 = g60Var.q0;
        ArrayList arrayList4 = g60Var.E0;
        int i12 = d1Var.f;
        View view = d1Var.a;
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
                int i13 = org.telegram.ui.ActionBar.i6.v6;
                e6Var2 = ((org.telegram.ui.ActionBar.f3) g60Var).resourcesProvider;
                int w02 = org.telegram.ui.ActionBar.i6.w0(i13, e6Var2);
                x3Var.a(w02, w02);
                x3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                return;
            }
            if (i10 == this.y) {
                int i14 = org.telegram.ui.ActionBar.i6.v6;
                e6Var = ((org.telegram.ui.ActionBar.f3) g60Var).resourcesProvider;
                int w03 = org.telegram.ui.ActionBar.i6.w0(i14, e6Var);
                x3Var.a(w03, w03);
                x3Var.b(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                return;
            }
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.lg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.og, false), g60Var.O.getTag() != null ? 1.0f : 0.0f, 1.0f);
            x3Var.a(offsetColor, offsetColor);
            if (!ChatObject.isChannel(g60Var.Z0) || (chat = g60Var.Z0) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
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
            if (g60Var.s0) {
                if (i15 >= 0 && i15 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i15);
                }
                groupCallParticipant = null;
            } else {
                if (i15 >= 0 && i15 < g60Var.a1.visibleParticipants.size()) {
                    groupCallParticipant = g60Var.a1.visibleParticipants.get(i15);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(g60Var.A0);
                if (peerId == peerId2 && (n50Var = g60Var.i2) != null) {
                    fileLocation = n50Var.c;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                float f7 = fileLocation3 != null ? g60Var.i2.a : 1.0f;
                boolean z14 = e4Var.getParticipant() != null && MessageObject.getPeerId(e4Var.getParticipant().peer) == peerId;
                e4Var.e(g60Var.d, groupCallParticipant, g60Var.a1, peerId2, fileLocation3, z14);
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
            lVar.a = g60Var.c.i(i10);
            if (g60Var.s0) {
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
                if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(g60Var.A0) && (n50Var2 = g60Var.i2) != null) {
                    fileLocation2 = n50Var2.c;
                }
                if (fileLocation2 != null) {
                    float f10 = g60Var.i2.a;
                }
                if (lVar.getParticipant() != null) {
                    lVar.getParticipant().equals(videoParticipant);
                }
                lVar.d = videoParticipant;
            }
            if (participant == null || participant.equals(videoParticipant) || !lVar.e || lVar.getRenderer() == null) {
                return;
            }
            g60.O(g60Var, lVar, false);
            g60.O(g60Var, lVar, true);
            return;
        }
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
        int i17 = i10 - this.f;
        int i18 = i10 - this.n;
        if (i18 < 0 || i18 >= g60Var.a1.shadyJoinParticipants.size()) {
            int i19 = i10 - this.s;
            if (i19 < 0 || i19 >= g60Var.a1.shadyLeftParticipants.size()) {
                if (g60Var.s0) {
                    if (i17 >= 0 && i17 < arrayList2.size()) {
                        l4 = (Long) arrayList2.get(i17);
                    }
                } else if (i17 >= 0 && i17 < g60Var.a1.invitedUsers.size()) {
                    l4 = g60Var.a1.invitedUsers.get(i17);
                    ChatObject.Call.InvitedUser invitedUser = g60Var.a1.invitedUsersMessageIds.get(l4);
                    z10 = invitedUser != null && invitedUser.isCalling();
                    z11 = false;
                    z12 = false;
                }
                z13 = false;
                z12 = false;
            } else {
                l4 = g60Var.a1.shadyLeftParticipants.get(i10 - this.s);
                z12 = true;
                z11 = false;
                z10 = false;
            }
            if (l4 == null) {
                i11 = ((org.telegram.ui.ActionBar.f3) g60Var).currentAccount;
                org.telegram.ui.ActionBar.j5 j5Var = w3Var.c;
                org.telegram.ui.ActionBar.j5 j5Var2 = w3Var.b;
                org.telegram.ui.Components.y9 y9Var = w3Var.a;
                org.telegram.ui.Components.j9 j9Var = w3Var.e;
                TLRPC.User user = MessagesController.getInstance(i11).getUser(l4);
                w3Var.f = user;
                if (user == null) {
                    j9Var.g(21);
                } else {
                    j9Var.r(user);
                }
                j5Var2.l(UserObject.getUserName(w3Var.f), false);
                y9Var.getImageReceiver().setCurrentAccount(i11);
                y9Var.e(w3Var.f, j9Var);
                j5Var.l(LocaleController.getString(z12 ? R.string.ShadyLeaving : z11 ? R.string.ShadyJoining : z10 ? R.string.ConferenceCalling : R.string.Invited), false);
                float f11 = 0.5f;
                y9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                j5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                if (!z11 && !z12) {
                    f11 = 1.0f;
                }
                j5Var.setAlpha(f11);
                ImageView imageView = w3Var.d;
                if (!z11 && !z12) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l4 = g60Var.a1.shadyJoinParticipants.get(i10 - this.n);
        z13 = true;
        z12 = false;
        z10 = z12;
        z11 = z13;
        if (l4 == null) {
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        g60 g60Var = this.M;
        AccountInstance accountInstance = g60Var.d;
        Context context = this.c;
        if (i10 == 0) {
            w50 w50Var = new w50(context);
            w50Var.h = 67;
            w50Var.n = 18;
            Paint paint = new Paint();
            w50Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gg, false));
            w50Var.e = 23;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            w50Var.a = j5Var;
            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
            j5Var.setTextSize(16);
            j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
            j5Var.setImportantForAccessibility(2);
            w50Var.addView(j5Var);
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
            w50Var.b = j5Var2;
            j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I6, false));
            j5Var2.setTextSize(16);
            j5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
            j5Var2.setImportantForAccessibility(2);
            w50Var.addView(j5Var2);
            ImageView imageView = new ImageView(context);
            w50Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.m6, false), PorterDuff.Mode.MULTIPLY));
            w50Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            w50Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            w50Var.addView(imageView2);
            w50Var.setFocusable(true);
            view = w50Var;
        } else if (i10 == 1) {
            view = new x50(this, context);
        } else if (i10 == 2) {
            y50 y50Var = new y50(context);
            y50Var.n = org.telegram.ui.ActionBar.i6.rg;
            Paint paint2 = new Paint();
            y50Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gg, false));
            y50Var.e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y50Var.a = y9Var;
            y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
            boolean z10 = LocaleController.isRTL;
            y50Var.addView(y9Var, w7.x5.a(46.0f, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f, 46, (z10 ? 5 : 3) | 48));
            org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
            y50Var.b = j5Var3;
            j5Var3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ng, false));
            j5Var3.setTypeface(AndroidUtilities.bold());
            j5Var3.setTextSize(16);
            j5Var3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z11 = LocaleController.isRTL;
            y50Var.addView(j5Var3, w7.x5.a(20.0f, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f, -1, (z11 ? 5 : 3) | 48));
            org.telegram.ui.ActionBar.j5 j5Var4 = new org.telegram.ui.ActionBar.j5(context);
            y50Var.c = j5Var4;
            j5Var4.setTextSize(15);
            j5Var4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            j5Var4.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, y50Var.n, false));
            j5Var4.l(LocaleController.getString(R.string.Invited), false);
            boolean z12 = LocaleController.isRTL;
            y50Var.addView(j5Var4, w7.x5.a(20.0f, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f, -1, (z12 ? 5 : 3) | 48));
            ImageView imageView3 = new ImageView(context);
            y50Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, y50Var.n, false), PorterDuff.Mode.MULTIPLY));
            y50Var.addView(imageView3, w7.x5.a(-1.0f, 6.0f, 0.0f, 6.0f, 0.0f, 48, (LocaleController.isRTL ? 3 : 5) | 16));
            y50Var.setWillNotDraw(false);
            y50Var.setFocusable(true);
            view = y50Var;
        } else if (i10 == 4) {
            view = new z50(this, context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Components.ao(context, 15);
        } else if (i10 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
            if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            } else {
                textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            }
        } else if (i10 != 7) {
            view = new View(context);
        } else {
            if (g60Var.p0 == null) {
                g60Var.p0 = new r50();
            }
            view = new q50(context, g60Var.p0);
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }

    @Override // s4.i0
    public final void y(s4.d1 d1Var) {
        c50 c50Var = this.M.O;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            int i11 = c50Var.getTag() != null ? org.telegram.ui.ActionBar.i6.rg : org.telegram.ui.ActionBar.i6.mg;
            e4Var.f(i11, org.telegram.ui.ActionBar.i6.x0(null, i11, false));
            e4Var.setDrawDivider(d1Var.b() != this.F - 2);
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            int i12 = c50Var.getTag() != null ? org.telegram.ui.ActionBar.i6.rg : org.telegram.ui.ActionBar.i6.mg;
            w3Var.a(i12, org.telegram.ui.ActionBar.i6.x0(null, i12, false));
            w3Var.setDrawDivider(d1Var.b() != this.F - 2);
        }
    }
}
