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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c60 extends org.telegram.ui.Components.xl0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final /* synthetic */ i60 M;
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

    public c60(i60 i60Var, LaunchActivity launchActivity) {
        this.M = i60Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        i60 i60Var = this.M;
        ArrayList arrayList = i60Var.q0;
        ChatObject.Call call = i60Var.a1;
        if (call == null || call.isScheduled() || i60Var.s0) {
            return;
        }
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.F = 0;
        this.L = i60Var.a1.participants.h(MessageObject.getPeerId(i60Var.A0)) >= 0;
        if (i60Var.o1()) {
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
        if (!arrayList.isEmpty() && i60Var.Q0() && i60Var.a1.call.participants_count > i60Var.d.getMessagesController().groupCallVideoMaxParticipants) {
            int i13 = this.F;
            this.F = i13 + 1;
            this.J = i13;
        }
        this.d = this.F;
        if (!i60Var.r1()) {
            this.F = i60Var.a1.visibleParticipants.size() + this.F;
        }
        this.e = this.F;
        if (i60Var.a1.invitedUsers.isEmpty() || i60Var.r1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i14 = this.F;
            this.f = i14;
            int size2 = i60Var.a1.invitedUsers.size() + i14;
            this.F = size2;
            this.h = size2;
        }
        if (i60Var.a1.shadyJoinParticipants.isEmpty() || i60Var.r1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.F;
            this.n = i15;
            int size3 = i60Var.a1.shadyJoinParticipants.size() + i15;
            this.F = size3;
            this.r = size3;
        }
        if (i60Var.a1.shadyLeftParticipants.isEmpty() || i60Var.r1()) {
            this.s = -1;
            this.v = -1;
        } else {
            int i16 = this.F;
            this.s = i16;
            int size4 = i60Var.a1.shadyLeftParticipants.size() + i16;
            this.F = size4;
            this.v = size4;
        }
        if (i60Var.o1()) {
            int i17 = this.F;
            this.x = i17;
            this.F = i17 + 2;
            this.y = i17 + 1;
        } else if (!i60Var.r1() && (((!ChatObject.isChannel(i60Var.Z0) || ((chat2 = i60Var.Z0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(i60Var.Z0)) || (ChatObject.isChannel(i60Var.Z0) && (chat = i60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            int i18 = this.F;
            this.F = i18 + 1;
            this.w = i18;
        }
        int i19 = this.F;
        this.F = i19 + 1;
        this.E = i19;
    }

    @Override // s4.h0
    public final int h() {
        return this.F;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void l() {
        E();
        super.l();
    }

    @Override // s4.h0
    public final void m(int i10) {
        E();
        super.m(i10);
    }

    @Override // s4.h0
    public final void p(int i10, int i11) {
        E();
        super.p(i10, i11);
    }

    @Override // s4.h0
    public final void q(int i10, int i11) {
        E();
        super.q(i10, i11);
    }

    @Override // s4.h0
    public final void r(int i10, int i11, Object obj) {
        E();
        super.r(i10, i11, obj);
    }

    @Override // s4.h0
    public final void s(int i10, int i11) {
        E();
        super.s(i10, i11);
    }

    @Override // s4.h0
    public final void t(int i10, int i11) {
        E();
        super.t(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        p50 p50Var;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        ChatObject.VideoParticipant videoParticipant;
        p50 p50Var2;
        i60 i60Var = this.M;
        ArrayList arrayList = i60Var.D0;
        ArrayList arrayList2 = i60Var.F0;
        ArrayList arrayList3 = i60Var.q0;
        ArrayList arrayList4 = i60Var.E0;
        int i12 = c1Var.f;
        View view = c1Var.a;
        TLRPC.FileLocation fileLocation = null;
        r12 = null;
        TLRPC.FileLocation fileLocation2 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        Long l4 = null;
        fileLocation = null;
        if (i12 == 0) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i10 == this.x) {
                int i13 = org.telegram.ui.ActionBar.j6.v6;
                f6Var2 = ((org.telegram.ui.ActionBar.f3) i60Var).resourcesProvider;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var2);
                y3Var.a(v02, v02);
                y3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                return;
            }
            if (i10 == this.y) {
                int i14 = org.telegram.ui.ActionBar.j6.v6;
                f6Var = ((org.telegram.ui.ActionBar.f3) i60Var).resourcesProvider;
                int v03 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
                y3Var.a(v03, v03);
                y3Var.b(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                return;
            }
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false), i60Var.O.getTag() != null ? 1.0f : 0.0f, 1.0f);
            y3Var.a(offsetColor, offsetColor);
            if (!ChatObject.isChannel(i60Var.Z0) || (chat = i60Var.Z0) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
                y3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipGroupInviteMember), false);
                return;
            } else {
                y3Var.b(R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareLink), false);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            int i15 = i10 - this.d;
            if (i60Var.s0) {
                if (i15 >= 0 && i15 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i15);
                }
                groupCallParticipant = null;
            } else {
                if (i15 >= 0 && i15 < i60Var.a1.visibleParticipants.size()) {
                    groupCallParticipant = i60Var.a1.visibleParticipants.get(i15);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(i60Var.A0);
                if (peerId == peerId2 && (p50Var = i60Var.i2) != null) {
                    fileLocation = p50Var.c;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                float f7 = fileLocation3 != null ? i60Var.i2.a : 1.0f;
                boolean z13 = f4Var.getParticipant() != null && MessageObject.getPeerId(f4Var.getParticipant().peer) == peerId;
                f4Var.e(i60Var.d, groupCallParticipant, i60Var.a1, peerId2, fileLocation3, z13);
                boolean z14 = z13;
                org.telegram.ui.Cells.a4 a4Var = f4Var.x;
                a4Var.setProgress(f7);
                if (f7 < 1.0f) {
                    AndroidUtilities.updateViewVisibilityAnimated(a4Var, true, 1.0f, z14);
                    return;
                } else {
                    AndroidUtilities.updateViewVisibilityAnimated(a4Var, false, 1.0f, z14);
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
            lVar.a = i60Var.c.i(i10);
            if (i60Var.s0) {
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
                if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(i60Var.A0) && (p50Var2 = i60Var.i2) != null) {
                    fileLocation2 = p50Var2.c;
                }
                if (fileLocation2 != null) {
                    float f10 = i60Var.i2.a;
                }
                if (lVar.getParticipant() != null) {
                    lVar.getParticipant().equals(videoParticipant);
                }
                lVar.d = videoParticipant;
            }
            if (participant == null || participant.equals(videoParticipant) || !lVar.e || lVar.getRenderer() == null) {
                return;
            }
            i60.N(i60Var, lVar, false);
            i60.N(i60Var, lVar, true);
            return;
        }
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        int i17 = i10 - this.f;
        int i18 = i10 - this.n;
        if (i18 < 0 || i18 >= i60Var.a1.shadyJoinParticipants.size()) {
            int i19 = i10 - this.s;
            if (i19 < 0 || i19 >= i60Var.a1.shadyLeftParticipants.size()) {
                if (i60Var.s0) {
                    if (i17 >= 0 && i17 < arrayList2.size()) {
                        l4 = (Long) arrayList2.get(i17);
                    }
                } else if (i17 >= 0 && i17 < i60Var.a1.invitedUsers.size()) {
                    l4 = i60Var.a1.invitedUsers.get(i17);
                    ChatObject.Call.InvitedUser invitedUser = i60Var.a1.invitedUsersMessageIds.get(l4);
                    z10 = invitedUser != null && invitedUser.isCalling();
                    z11 = false;
                    z12 = false;
                    if (l4 != null) {
                        i11 = ((org.telegram.ui.ActionBar.f3) i60Var).currentAccount;
                        org.telegram.ui.ActionBar.j5 j5Var = x3Var.c;
                        org.telegram.ui.ActionBar.j5 j5Var2 = x3Var.b;
                        org.telegram.ui.Components.v9 v9Var = x3Var.a;
                        org.telegram.ui.Components.g9 g9Var = x3Var.e;
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(l4);
                        x3Var.f = user;
                        if (user == null) {
                            g9Var.g(21);
                        } else {
                            g9Var.r(user);
                        }
                        j5Var2.l(UserObject.getUserName(x3Var.f), false);
                        v9Var.getImageReceiver().setCurrentAccount(i11);
                        v9Var.e(x3Var.f, g9Var);
                        j5Var.l(LocaleController.getString(z12 ? R.string.ShadyLeaving : z11 ? R.string.ShadyJoining : z10 ? R.string.ConferenceCalling : R.string.Invited), false);
                        float f11 = 0.5f;
                        v9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                        j5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                        if (!z11 && !z12) {
                            f11 = 1.0f;
                        }
                        j5Var.setAlpha(f11);
                        ImageView imageView = x3Var.d;
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
                l4 = i60Var.a1.shadyLeftParticipants.get(i10 - this.s);
                z11 = false;
                z12 = true;
                z10 = false;
                if (l4 != null) {
                }
            }
        } else {
            l4 = i60Var.a1.shadyJoinParticipants.get(i10 - this.n);
            z11 = true;
        }
        z12 = false;
        z10 = false;
        if (l4 != null) {
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        i60 i60Var = this.M;
        AccountInstance accountInstance = i60Var.d;
        Context context = this.c;
        if (i10 == 0) {
            y50 y50Var = new y50(context);
            y50Var.h = 67;
            y50Var.n = 18;
            Paint paint = new Paint();
            y50Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
            y50Var.e = 23;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            y50Var.a = j5Var;
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            j5Var.setTextSize(16);
            j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
            j5Var.setImportantForAccessibility(2);
            y50Var.addView(j5Var);
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
            y50Var.b = j5Var2;
            j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
            j5Var2.setTextSize(16);
            j5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
            j5Var2.setImportantForAccessibility(2);
            y50Var.addView(j5Var2);
            ImageView imageView = new ImageView(context);
            y50Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m6, false), PorterDuff.Mode.MULTIPLY));
            y50Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            y50Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            y50Var.addView(imageView2);
            y50Var.setFocusable(true);
            view = y50Var;
        } else if (i10 == 1) {
            view = new z50(this, context);
        } else if (i10 == 2) {
            a60 a60Var = new a60(context);
            a60Var.n = org.telegram.ui.ActionBar.j6.rg;
            Paint paint2 = new Paint();
            a60Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
            a60Var.e = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
            org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
            a60Var.a = v9Var;
            v9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
            boolean z10 = LocaleController.isRTL;
            a60Var.addView(v9Var, w7.y5.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
            a60Var.b = j5Var3;
            j5Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
            j5Var3.setTypeface(AndroidUtilities.bold());
            j5Var3.setTextSize(16);
            j5Var3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z11 = LocaleController.isRTL;
            a60Var.addView(j5Var3, w7.y5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var4 = new org.telegram.ui.ActionBar.j5(context);
            a60Var.c = j5Var4;
            j5Var4.setTextSize(15);
            j5Var4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            j5Var4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, a60Var.n, false));
            j5Var4.l(LocaleController.getString(R.string.Invited), false);
            boolean z12 = LocaleController.isRTL;
            a60Var.addView(j5Var4, w7.y5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            a60Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, a60Var.n, false), PorterDuff.Mode.MULTIPLY));
            a60Var.addView(imageView3, w7.y5.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            a60Var.setWillNotDraw(false);
            a60Var.setFocusable(true);
            view = a60Var;
        } else if (i10 == 4) {
            view = new b60(this, context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Components.kn(context, 15);
        } else if (i10 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
            if (ChatObject.isChannelOrGiga(i60Var.Z0)) {
                textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            } else {
                textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            }
        } else if (i10 != 7) {
            view = new View(context);
        } else {
            if (i60Var.p0 == null) {
                i60Var.p0 = new t50();
            }
            view = new s50(context, i60Var.p0);
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        e50 e50Var = this.M.O;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            int i11 = e50Var.getTag() != null ? org.telegram.ui.ActionBar.j6.rg : org.telegram.ui.ActionBar.j6.mg;
            f4Var.f(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            f4Var.setDrawDivider(c1Var.b() != this.F - 2);
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            int i12 = e50Var.getTag() != null ? org.telegram.ui.ActionBar.j6.rg : org.telegram.ui.ActionBar.j6.mg;
            x3Var.a(i12, org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            x3Var.setDrawDivider(c1Var.b() != this.F - 2);
        }
    }
}
