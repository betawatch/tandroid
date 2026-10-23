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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class k50 extends org.telegram.ui.Components.im0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final /* synthetic */ q50 M;
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

    public k50(q50 q50Var, LaunchActivity launchActivity) {
        this.M = q50Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        q50 q50Var = this.M;
        ArrayList arrayList = q50Var.q0;
        ChatObject.Call call = q50Var.a1;
        if (call == null || call.isScheduled() || q50Var.s0) {
            return;
        }
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.F = 0;
        this.L = q50Var.a1.participants.h(MessageObject.getPeerId(q50Var.A0)) >= 0;
        if (q50Var.p1()) {
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
        if (!arrayList.isEmpty() && q50Var.R0() && q50Var.a1.call.participants_count > q50Var.d.getMessagesController().groupCallVideoMaxParticipants) {
            int i13 = this.F;
            this.F = i13 + 1;
            this.J = i13;
        }
        this.d = this.F;
        if (!q50Var.s1()) {
            this.F = q50Var.a1.visibleParticipants.size() + this.F;
        }
        this.e = this.F;
        if (q50Var.a1.invitedUsers.isEmpty() || q50Var.s1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i14 = this.F;
            this.f = i14;
            int size2 = q50Var.a1.invitedUsers.size() + i14;
            this.F = size2;
            this.h = size2;
        }
        if (q50Var.a1.shadyJoinParticipants.isEmpty() || q50Var.s1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.F;
            this.n = i15;
            int size3 = q50Var.a1.shadyJoinParticipants.size() + i15;
            this.F = size3;
            this.r = size3;
        }
        if (q50Var.a1.shadyLeftParticipants.isEmpty() || q50Var.s1()) {
            this.s = -1;
            this.v = -1;
        } else {
            int i16 = this.F;
            this.s = i16;
            int size4 = q50Var.a1.shadyLeftParticipants.size() + i16;
            this.F = size4;
            this.v = size4;
        }
        if (q50Var.p1()) {
            int i17 = this.F;
            this.x = i17;
            this.F = i17 + 2;
            this.y = i17 + 1;
        } else if (!q50Var.s1() && (((!ChatObject.isChannel(q50Var.Z0) || ((chat2 = q50Var.Z0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(q50Var.Z0)) || (ChatObject.isChannel(q50Var.Z0) && (chat = q50Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        y40 y40Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        ChatObject.VideoParticipant videoParticipant;
        y40 y40Var2;
        q50 q50Var = this.M;
        ArrayList arrayList = q50Var.D0;
        ArrayList arrayList2 = q50Var.F0;
        ArrayList arrayList3 = q50Var.q0;
        ArrayList arrayList4 = q50Var.E0;
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
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            if (i10 == this.x) {
                int i13 = org.telegram.ui.ActionBar.h6.v6;
                d6Var2 = ((org.telegram.ui.ActionBar.f3) q50Var).resourcesProvider;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i13, d6Var2);
                w3Var.a(w02, w02);
                w3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                return;
            }
            if (i10 == this.y) {
                int i14 = org.telegram.ui.ActionBar.h6.v6;
                d6Var = ((org.telegram.ui.ActionBar.f3) q50Var).resourcesProvider;
                int w03 = org.telegram.ui.ActionBar.h6.w0(i14, d6Var);
                w3Var.a(w03, w03);
                w3Var.b(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                return;
            }
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.lg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.og, false), q50Var.O.getTag() != null ? 1.0f : 0.0f, 1.0f);
            w3Var.a(offsetColor, offsetColor);
            if (!ChatObject.isChannel(q50Var.Z0) || (chat = q50Var.Z0) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
                w3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipGroupInviteMember), false);
                return;
            } else {
                w3Var.b(R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareLink), false);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
            int i15 = i10 - this.d;
            if (q50Var.s0) {
                if (i15 >= 0 && i15 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i15);
                }
                groupCallParticipant = null;
            } else {
                if (i15 >= 0 && i15 < q50Var.a1.visibleParticipants.size()) {
                    groupCallParticipant = q50Var.a1.visibleParticipants.get(i15);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(q50Var.A0);
                if (peerId == peerId2 && (y40Var = q50Var.i2) != null) {
                    fileLocation = y40Var.c;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                float f7 = fileLocation3 != null ? q50Var.i2.a : 1.0f;
                boolean z14 = d4Var.getParticipant() != null && MessageObject.getPeerId(d4Var.getParticipant().peer) == peerId;
                d4Var.e(q50Var.d, groupCallParticipant, q50Var.a1, peerId2, fileLocation3, z14);
                boolean z15 = z14;
                org.telegram.ui.Cells.y3 y3Var = d4Var.x;
                y3Var.setProgress(f7);
                if (f7 < 1.0f) {
                    AndroidUtilities.updateViewVisibilityAnimated(y3Var, true, 1.0f, z15);
                    return;
                } else {
                    AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, z15);
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
            lVar.a = q50Var.c.i(i10);
            if (q50Var.s0) {
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
                if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(q50Var.A0) && (y40Var2 = q50Var.i2) != null) {
                    fileLocation2 = y40Var2.c;
                }
                if (fileLocation2 != null) {
                    float f10 = q50Var.i2.a;
                }
                if (lVar.getParticipant() != null) {
                    lVar.getParticipant().equals(videoParticipant);
                }
                lVar.d = videoParticipant;
            }
            if (participant == null || participant.equals(videoParticipant) || !lVar.e || lVar.getRenderer() == null) {
                return;
            }
            q50.O(q50Var, lVar, false);
            q50.O(q50Var, lVar, true);
            return;
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        int i17 = i10 - this.f;
        int i18 = i10 - this.n;
        if (i18 < 0 || i18 >= q50Var.a1.shadyJoinParticipants.size()) {
            int i19 = i10 - this.s;
            if (i19 < 0 || i19 >= q50Var.a1.shadyLeftParticipants.size()) {
                if (q50Var.s0) {
                    if (i17 >= 0 && i17 < arrayList2.size()) {
                        l4 = (Long) arrayList2.get(i17);
                    }
                } else if (i17 >= 0 && i17 < q50Var.a1.invitedUsers.size()) {
                    l4 = q50Var.a1.invitedUsers.get(i17);
                    ChatObject.Call.InvitedUser invitedUser = q50Var.a1.invitedUsersMessageIds.get(l4);
                    z10 = invitedUser != null && invitedUser.isCalling();
                    z11 = false;
                    z12 = false;
                }
                z13 = false;
                z12 = false;
            } else {
                l4 = q50Var.a1.shadyLeftParticipants.get(i10 - this.s);
                z12 = true;
                z11 = false;
                z10 = false;
            }
            if (l4 == null) {
                i11 = ((org.telegram.ui.ActionBar.f3) q50Var).currentAccount;
                org.telegram.ui.ActionBar.j5 j5Var = v3Var.c;
                org.telegram.ui.ActionBar.j5 j5Var2 = v3Var.b;
                org.telegram.ui.Components.w9 w9Var = v3Var.a;
                org.telegram.ui.Components.h9 h9Var = v3Var.e;
                TLRPC.User user = MessagesController.getInstance(i11).getUser(l4);
                v3Var.f = user;
                if (user == null) {
                    h9Var.g(21);
                } else {
                    h9Var.r(user);
                }
                j5Var2.l(UserObject.getUserName(v3Var.f), false);
                w9Var.getImageReceiver().setCurrentAccount(i11);
                w9Var.e(v3Var.f, h9Var);
                j5Var.l(LocaleController.getString(z12 ? R.string.ShadyLeaving : z11 ? R.string.ShadyJoining : z10 ? R.string.ConferenceCalling : R.string.Invited), false);
                float f11 = 0.5f;
                w9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                j5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                if (!z11 && !z12) {
                    f11 = 1.0f;
                }
                j5Var.setAlpha(f11);
                ImageView imageView = v3Var.d;
                if (!z11 && !z12) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l4 = q50Var.a1.shadyJoinParticipants.get(i10 - this.n);
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
        q50 q50Var = this.M;
        AccountInstance accountInstance = q50Var.d;
        Context context = this.c;
        if (i10 == 0) {
            g50 g50Var = new g50(context);
            g50Var.h = 67;
            g50Var.n = 18;
            Paint paint = new Paint();
            g50Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gg, false));
            g50Var.e = 23;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            g50Var.a = j5Var;
            j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
            j5Var.setTextSize(16);
            j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
            j5Var.setImportantForAccessibility(2);
            g50Var.addView(j5Var);
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
            g50Var.b = j5Var2;
            j5Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I6, false));
            j5Var2.setTextSize(16);
            j5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
            j5Var2.setImportantForAccessibility(2);
            g50Var.addView(j5Var2);
            ImageView imageView = new ImageView(context);
            g50Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.m6, false), PorterDuff.Mode.MULTIPLY));
            g50Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            g50Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            g50Var.addView(imageView2);
            g50Var.setFocusable(true);
            view = g50Var;
        } else if (i10 == 1) {
            view = new h50(this, context);
        } else if (i10 == 2) {
            i50 i50Var = new i50(context);
            i50Var.n = org.telegram.ui.ActionBar.h6.rg;
            Paint paint2 = new Paint();
            i50Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gg, false));
            i50Var.e = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            i50Var.a = w9Var;
            w9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
            boolean z10 = LocaleController.isRTL;
            i50Var.addView(w9Var, w7.z5.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
            i50Var.b = j5Var3;
            j5Var3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ng, false));
            j5Var3.setTypeface(AndroidUtilities.bold());
            j5Var3.setTextSize(16);
            j5Var3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z11 = LocaleController.isRTL;
            i50Var.addView(j5Var3, w7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var4 = new org.telegram.ui.ActionBar.j5(context);
            i50Var.c = j5Var4;
            j5Var4.setTextSize(15);
            j5Var4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            j5Var4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i50Var.n, false));
            j5Var4.l(LocaleController.getString(R.string.Invited), false);
            boolean z12 = LocaleController.isRTL;
            i50Var.addView(j5Var4, w7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            i50Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i50Var.n, false), PorterDuff.Mode.MULTIPLY));
            i50Var.addView(imageView3, w7.z5.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            i50Var.setWillNotDraw(false);
            i50Var.setFocusable(true);
            view = i50Var;
        } else if (i10 == 4) {
            view = new j50(this, context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Components.un(context, 15);
        } else if (i10 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
            if (ChatObject.isChannelOrGiga(q50Var.Z0)) {
                textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            } else {
                textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            }
        } else if (i10 != 7) {
            view = new View(context);
        } else {
            if (q50Var.p0 == null) {
                q50Var.p0 = new b50();
            }
            view = new v10(context, q50Var.p0);
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        m40 m40Var = this.M.O;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 1) {
            org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
            int i11 = m40Var.getTag() != null ? org.telegram.ui.ActionBar.h6.rg : org.telegram.ui.ActionBar.h6.mg;
            d4Var.f(i11, org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            d4Var.setDrawDivider(b1Var.b() != this.F - 2);
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            int i12 = m40Var.getTag() != null ? org.telegram.ui.ActionBar.h6.rg : org.telegram.ui.ActionBar.h6.mg;
            v3Var.a(i12, org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            v3Var.setDrawDivider(b1Var.b() != this.F - 2);
        }
    }
}
