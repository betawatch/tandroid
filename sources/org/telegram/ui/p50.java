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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p50 extends org.telegram.ui.Components.lm0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final /* synthetic */ v50 M;
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

    public p50(v50 v50Var, LaunchActivity launchActivity) {
        this.M = v50Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        v50 v50Var = this.M;
        ArrayList arrayList = v50Var.q0;
        ChatObject.Call call = v50Var.a1;
        if (call == null || call.isScheduled() || v50Var.s0) {
            return;
        }
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.F = 0;
        this.L = v50Var.a1.participants.h(MessageObject.getPeerId(v50Var.A0)) >= 0;
        if (v50Var.o1()) {
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
        if (!arrayList.isEmpty() && v50Var.Q0() && v50Var.a1.call.participants_count > v50Var.d.getMessagesController().groupCallVideoMaxParticipants) {
            int i13 = this.F;
            this.F = i13 + 1;
            this.J = i13;
        }
        this.d = this.F;
        if (!v50Var.r1()) {
            this.F = v50Var.a1.visibleParticipants.size() + this.F;
        }
        this.e = this.F;
        if (v50Var.a1.invitedUsers.isEmpty() || v50Var.r1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i14 = this.F;
            this.f = i14;
            int size2 = v50Var.a1.invitedUsers.size() + i14;
            this.F = size2;
            this.h = size2;
        }
        if (v50Var.a1.shadyJoinParticipants.isEmpty() || v50Var.r1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.F;
            this.n = i15;
            int size3 = v50Var.a1.shadyJoinParticipants.size() + i15;
            this.F = size3;
            this.r = size3;
        }
        if (v50Var.a1.shadyLeftParticipants.isEmpty() || v50Var.r1()) {
            this.s = -1;
            this.v = -1;
        } else {
            int i16 = this.F;
            this.s = i16;
            int size4 = v50Var.a1.shadyLeftParticipants.size() + i16;
            this.F = size4;
            this.v = size4;
        }
        if (v50Var.o1()) {
            int i17 = this.F;
            this.x = i17;
            this.F = i17 + 2;
            this.y = i17 + 1;
        } else if (!v50Var.r1() && (((!ChatObject.isChannel(v50Var.Z0) || ((chat2 = v50Var.Z0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(v50Var.Z0)) || (ChatObject.isChannel(v50Var.Z0) && (chat = v50Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
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

    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        c50 c50Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        ChatObject.VideoParticipant videoParticipant;
        c50 c50Var2;
        v50 v50Var = this.M;
        ArrayList arrayList = v50Var.D0;
        ArrayList arrayList2 = v50Var.F0;
        ArrayList arrayList3 = v50Var.q0;
        ArrayList arrayList4 = v50Var.E0;
        int i12 = e1Var.f;
        View view = e1Var.a;
        TLRPC.FileLocation fileLocation = null;
        r12 = null;
        TLRPC.FileLocation fileLocation2 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        Long l4 = null;
        fileLocation = null;
        if (i12 == 0) {
            org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) view;
            if (i10 == this.x) {
                int i13 = org.telegram.ui.ActionBar.y6.v6;
                u6Var2 = ((org.telegram.ui.ActionBar.k3) v50Var).resourcesProvider;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var2);
                b4Var.a(w02, w02);
                b4Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                return;
            }
            if (i10 == this.y) {
                int i14 = org.telegram.ui.ActionBar.y6.v6;
                u6Var = ((org.telegram.ui.ActionBar.k3) v50Var).resourcesProvider;
                int w03 = org.telegram.ui.ActionBar.y6.w0(i14, u6Var);
                b4Var.a(w03, w03);
                b4Var.b(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                return;
            }
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.lg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.og, false), v50Var.O.getTag() != null ? 1.0f : 0.0f, 1.0f);
            b4Var.a(offsetColor, offsetColor);
            if (!ChatObject.isChannel(v50Var.Z0) || (chat = v50Var.Z0) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
                b4Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipGroupInviteMember), false);
                return;
            } else {
                b4Var.b(R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareLink), false);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            int i15 = i10 - this.d;
            if (v50Var.s0) {
                if (i15 >= 0 && i15 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i15);
                }
                groupCallParticipant = null;
            } else {
                if (i15 >= 0 && i15 < v50Var.a1.visibleParticipants.size()) {
                    groupCallParticipant = v50Var.a1.visibleParticipants.get(i15);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(v50Var.A0);
                if (peerId == peerId2 && (c50Var = v50Var.i2) != null) {
                    fileLocation = c50Var.c;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                float f7 = fileLocation3 != null ? v50Var.i2.a : 1.0f;
                boolean z14 = i4Var.getParticipant() != null && MessageObject.getPeerId(i4Var.getParticipant().peer) == peerId;
                i4Var.e(v50Var.d, groupCallParticipant, v50Var.a1, peerId2, fileLocation3, z14);
                boolean z15 = z14;
                org.telegram.ui.Cells.d4 d4Var = i4Var.x;
                d4Var.setProgress(f7);
                if (f7 < 1.0f) {
                    AndroidUtilities.updateViewVisibilityAnimated(d4Var, true, 1.0f, z15);
                    return;
                } else {
                    AndroidUtilities.updateViewVisibilityAnimated(d4Var, false, 1.0f, z15);
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
            lVar.a = v50Var.c.i(i10);
            if (v50Var.s0) {
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
                if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(v50Var.A0) && (c50Var2 = v50Var.i2) != null) {
                    fileLocation2 = c50Var2.c;
                }
                if (fileLocation2 != null) {
                    float f10 = v50Var.i2.a;
                }
                if (lVar.getParticipant() != null) {
                    lVar.getParticipant().equals(videoParticipant);
                }
                lVar.d = videoParticipant;
            }
            if (participant == null || participant.equals(videoParticipant) || !lVar.e || lVar.getRenderer() == null) {
                return;
            }
            v50.N(v50Var, lVar, false);
            v50.N(v50Var, lVar, true);
            return;
        }
        org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
        int i17 = i10 - this.f;
        int i18 = i10 - this.n;
        if (i18 < 0 || i18 >= v50Var.a1.shadyJoinParticipants.size()) {
            int i19 = i10 - this.s;
            if (i19 < 0 || i19 >= v50Var.a1.shadyLeftParticipants.size()) {
                if (v50Var.s0) {
                    if (i17 >= 0 && i17 < arrayList2.size()) {
                        l4 = (Long) arrayList2.get(i17);
                    }
                } else if (i17 >= 0 && i17 < v50Var.a1.invitedUsers.size()) {
                    l4 = v50Var.a1.invitedUsers.get(i17);
                    ChatObject.Call.InvitedUser invitedUser = v50Var.a1.invitedUsersMessageIds.get(l4);
                    z10 = invitedUser != null && invitedUser.isCalling();
                    z11 = false;
                    z12 = false;
                }
                z13 = false;
                z12 = false;
            } else {
                l4 = v50Var.a1.shadyLeftParticipants.get(i10 - this.s);
                z12 = true;
                z11 = false;
                z10 = false;
            }
            if (l4 == null) {
                i11 = ((org.telegram.ui.ActionBar.k3) v50Var).currentAccount;
                org.telegram.ui.ActionBar.b6 b6Var = a4Var.c;
                org.telegram.ui.ActionBar.b6 b6Var2 = a4Var.b;
                org.telegram.ui.Components.y9 y9Var = a4Var.a;
                org.telegram.ui.Components.j9 j9Var = a4Var.e;
                TLRPC.User user = MessagesController.getInstance(i11).getUser(l4);
                a4Var.f = user;
                if (user == null) {
                    j9Var.g(21);
                } else {
                    j9Var.r(user);
                }
                b6Var2.l(UserObject.getUserName(a4Var.f), false);
                y9Var.getImageReceiver().setCurrentAccount(i11);
                y9Var.f(a4Var.f, j9Var);
                b6Var.l(LocaleController.getString(z12 ? R.string.ShadyLeaving : z11 ? R.string.ShadyJoining : z10 ? R.string.ConferenceCalling : R.string.Invited), false);
                float f11 = 0.5f;
                y9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                b6Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                if (!z11 && !z12) {
                    f11 = 1.0f;
                }
                b6Var.setAlpha(f11);
                ImageView imageView = a4Var.d;
                if (!z11 && !z12) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l4 = v50Var.a1.shadyJoinParticipants.get(i10 - this.n);
        z13 = true;
        z12 = false;
        z10 = z12;
        z11 = z13;
        if (l4 == null) {
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        v50 v50Var = this.M;
        AccountInstance accountInstance = v50Var.d;
        Context context = this.c;
        if (i10 == 0) {
            l50 l50Var = new l50(context);
            l50Var.h = 67;
            l50Var.n = 18;
            Paint paint = new Paint();
            l50Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false));
            l50Var.e = 23;
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
            l50Var.a = b6Var;
            org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, null);
            b6Var.setTextSize(16);
            b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
            b6Var.setImportantForAccessibility(2);
            l50Var.addView(b6Var);
            org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
            l50Var.b = b6Var2;
            org.telegram.ui.ActionBar.f7.Y(b6Var2, org.telegram.ui.ActionBar.y6.I6, null);
            b6Var2.setTextSize(16);
            b6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
            b6Var2.setImportantForAccessibility(2);
            l50Var.addView(b6Var2);
            ImageView imageView = new ImageView(context);
            l50Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.m6, null, PorterDuff.Mode.MULTIPLY);
            l50Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            l50Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            l50Var.addView(imageView2);
            l50Var.setFocusable(true);
            view = l50Var;
        } else if (i10 == 1) {
            view = new m50(this, context);
        } else if (i10 == 2) {
            n50 n50Var = new n50(context);
            n50Var.n = org.telegram.ui.ActionBar.y6.rg;
            Paint paint2 = new Paint();
            n50Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false));
            n50Var.e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            n50Var.a = y9Var;
            y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
            boolean z10 = LocaleController.isRTL;
            n50Var.addView(y9Var, org.telegram.ui.Components.gb1.h(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.b6 b6Var3 = new org.telegram.ui.ActionBar.b6(context);
            n50Var.b = b6Var3;
            org.telegram.ui.ActionBar.f7.Y(b6Var3, org.telegram.ui.ActionBar.y6.ng, null);
            b6Var3.setTypeface(AndroidUtilities.bold());
            b6Var3.setTextSize(16);
            b6Var3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z11 = LocaleController.isRTL;
            n50Var.addView(b6Var3, org.telegram.ui.Components.gb1.h(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.b6 b6Var4 = new org.telegram.ui.ActionBar.b6(context);
            n50Var.c = b6Var4;
            b6Var4.setTextSize(15);
            b6Var4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            b6Var4.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, n50Var.n, false));
            b6Var4.l(LocaleController.getString(R.string.Invited), false);
            boolean z12 = LocaleController.isRTL;
            n50Var.addView(b6Var4, org.telegram.ui.Components.gb1.h(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            n50Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, n50Var.n, false), PorterDuff.Mode.MULTIPLY));
            n50Var.addView(imageView3, org.telegram.ui.Components.gb1.h(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            n50Var.setWillNotDraw(false);
            n50Var.setFocusable(true);
            view = n50Var;
        } else if (i10 == 4) {
            view = new o50(this, context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Components.vn(context, 15);
        } else if (i10 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
            if (ChatObject.isChannelOrGiga(v50Var.Z0)) {
                textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            } else {
                textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            }
        } else if (i10 != 7) {
            view = new View(context);
        } else {
            if (v50Var.p0 == null) {
                v50Var.p0 = new f50();
            }
            view = new z10(context, v50Var.p0);
        }
        return ic.a.n(view, view, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        r40 r40Var = this.M.O;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 1) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            int i11 = r40Var.getTag() != null ? org.telegram.ui.ActionBar.y6.rg : org.telegram.ui.ActionBar.y6.mg;
            i4Var.f(i11, org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            i4Var.setDrawDivider(e1Var.b() != this.F - 2);
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
            int i12 = r40Var.getTag() != null ? org.telegram.ui.ActionBar.y6.rg : org.telegram.ui.ActionBar.y6.mg;
            a4Var.a(i12, org.telegram.ui.ActionBar.y6.x0(null, i12, false));
            a4Var.setDrawDivider(e1Var.b() != this.F - 2);
        }
    }
}
