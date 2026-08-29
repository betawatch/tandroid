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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l50 extends org.telegram.ui.Components.il0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final /* synthetic */ r50 I;
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

    public l50(r50 r50Var, LaunchActivity launchActivity) {
        this.I = r50Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        r50 r50Var = this.I;
        ArrayList arrayList = r50Var.m0;
        ChatObject.Call call = r50Var.W0;
        if (call == null || call.isScheduled() || r50Var.o0) {
            return;
        }
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.B = 0;
        this.H = r50Var.W0.participants.h(MessageObject.getPeerId(r50Var.w0)) >= 0;
        if (r50Var.o1()) {
            int i10 = this.B;
            this.B = i10 + 1;
            this.G = i10;
        }
        int i11 = this.B;
        this.C = i11;
        int size = arrayList.size() + i11;
        this.B = size;
        this.D = size;
        if (arrayList.size() > 0) {
            int i12 = this.B;
            this.B = i12 + 1;
            this.E = i12;
        }
        if (!arrayList.isEmpty() && r50Var.Q0() && r50Var.W0.call.participants_count > r50Var.d.getMessagesController().groupCallVideoMaxParticipants) {
            int i13 = this.B;
            this.B = i13 + 1;
            this.F = i13;
        }
        this.d = this.B;
        if (!r50Var.r1()) {
            this.B = r50Var.W0.visibleParticipants.size() + this.B;
        }
        this.e = this.B;
        if (r50Var.W0.invitedUsers.isEmpty() || r50Var.r1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i14 = this.B;
            this.f = i14;
            int size2 = r50Var.W0.invitedUsers.size() + i14;
            this.B = size2;
            this.h = size2;
        }
        if (r50Var.W0.shadyJoinParticipants.isEmpty() || r50Var.r1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.B;
            this.n = i15;
            int size3 = r50Var.W0.shadyJoinParticipants.size() + i15;
            this.B = size3;
            this.r = size3;
        }
        if (r50Var.W0.shadyLeftParticipants.isEmpty() || r50Var.r1()) {
            this.s = -1;
            this.v = -1;
        } else {
            int i16 = this.B;
            this.s = i16;
            int size4 = r50Var.W0.shadyLeftParticipants.size() + i16;
            this.B = size4;
            this.v = size4;
        }
        if (r50Var.o1()) {
            int i17 = this.B;
            this.x = i17;
            this.B = i17 + 2;
            this.y = i17 + 1;
        } else if (!r50Var.r1() && (((!ChatObject.isChannel(r50Var.V0) || ((chat2 = r50Var.V0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(r50Var.V0)) || (ChatObject.isChannel(r50Var.V0) && (chat = r50Var.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            int i18 = this.B;
            this.B = i18 + 1;
            this.w = i18;
        }
        int i19 = this.B;
        this.B = i19 + 1;
        this.A = i19;
    }

    @Override // f2.p0
    public final int h() {
        return this.B;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == this.A) {
            return 3;
        }
        if (i10 == this.w || i10 == this.x || i10 == this.y) {
            return 0;
        }
        if (i10 == this.E) {
            return 5;
        }
        if (i10 >= this.d && i10 < this.e) {
            return 1;
        }
        if (i10 >= this.C && i10 < this.D) {
            return 4;
        }
        if (i10 == this.F) {
            return 6;
        }
        return i10 == this.G ? 7 : 2;
    }

    @Override // f2.p0
    public final void l() {
        E();
        super.l();
    }

    @Override // f2.p0
    public final void m(int i10) {
        E();
        super.m(i10);
    }

    @Override // f2.p0
    public final void p(int i10, int i11) {
        E();
        super.p(i10, i11);
    }

    @Override // f2.p0
    public final void q(int i10, int i11) {
        E();
        super.q(i10, i11);
    }

    @Override // f2.p0
    public final void r(int i10, int i11, Object obj) {
        E();
        super.r(i10, i11, obj);
    }

    @Override // f2.p0
    public final void s(int i10, int i11) {
        E();
        super.s(i10, i11);
    }

    @Override // f2.p0
    public final void t(int i10, int i11) {
        E();
        super.t(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        y40 y40Var;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        ChatObject.VideoParticipant videoParticipant;
        y40 y40Var2;
        r50 r50Var = this.I;
        ArrayList arrayList = r50Var.z0;
        ArrayList arrayList2 = r50Var.B0;
        ArrayList arrayList3 = r50Var.m0;
        ArrayList arrayList4 = r50Var.A0;
        int i12 = n1Var.f;
        View view = n1Var.a;
        TLRPC.FileLocation fileLocation = null;
        r12 = null;
        TLRPC.FileLocation fileLocation2 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        Long l10 = null;
        fileLocation = null;
        if (i12 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == this.x) {
                int i13 = org.telegram.ui.ActionBar.g6.v6;
                c6Var2 = ((org.telegram.ui.ActionBar.f3) r50Var).resourcesProvider;
                int v02 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var2);
                u3Var.a(v02, v02);
                u3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                return;
            }
            if (i10 == this.y) {
                int i14 = org.telegram.ui.ActionBar.g6.v6;
                c6Var = ((org.telegram.ui.ActionBar.f3) r50Var).resourcesProvider;
                int v03 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
                u3Var.a(v03, v03);
                u3Var.b(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                return;
            }
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.og, false), r50Var.K.getTag() != null ? 1.0f : 0.0f, 1.0f);
            u3Var.a(offsetColor, offsetColor);
            if (!ChatObject.isChannel(r50Var.V0) || (chat = r50Var.V0) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
                u3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipGroupInviteMember), false);
                return;
            } else {
                u3Var.b(R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareLink), false);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) view;
            int i15 = i10 - this.d;
            if (r50Var.o0) {
                if (i15 >= 0 && i15 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i15);
                }
                groupCallParticipant = null;
            } else {
                if (i15 >= 0 && i15 < r50Var.W0.visibleParticipants.size()) {
                    groupCallParticipant = r50Var.W0.visibleParticipants.get(i15);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(r50Var.w0);
                if (peerId == peerId2 && (y40Var = r50Var.e2) != null) {
                    fileLocation = y40Var.c;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                float f9 = fileLocation3 != null ? r50Var.e2.a : 1.0f;
                boolean z13 = c4Var.getParticipant() != null && MessageObject.getPeerId(c4Var.getParticipant().peer) == peerId;
                c4Var.e(r50Var.d, groupCallParticipant, r50Var.W0, peerId2, fileLocation3, z13);
                boolean z14 = z13;
                org.telegram.ui.Cells.w3 w3Var = c4Var.x;
                w3Var.setProgress(f9);
                if (f9 < 1.0f) {
                    AndroidUtilities.updateViewVisibilityAnimated(w3Var, true, 1.0f, z14);
                    return;
                } else {
                    AndroidUtilities.updateViewVisibilityAnimated(w3Var, false, 1.0f, z14);
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
            int i16 = i10 - this.C;
            lVar.a = r50Var.c.i(i10);
            if (r50Var.o0) {
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
                if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(r50Var.w0) && (y40Var2 = r50Var.e2) != null) {
                    fileLocation2 = y40Var2.c;
                }
                if (fileLocation2 != null) {
                    float f10 = r50Var.e2.a;
                }
                if (lVar.getParticipant() != null) {
                    lVar.getParticipant().equals(videoParticipant);
                }
                lVar.d = videoParticipant;
            }
            if (participant == null || participant.equals(videoParticipant) || !lVar.e || lVar.getRenderer() == null) {
                return;
            }
            r50.M(r50Var, lVar, false);
            r50.M(r50Var, lVar, true);
            return;
        }
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
        int i17 = i10 - this.f;
        int i18 = i10 - this.n;
        if (i18 < 0 || i18 >= r50Var.W0.shadyJoinParticipants.size()) {
            int i19 = i10 - this.s;
            if (i19 < 0 || i19 >= r50Var.W0.shadyLeftParticipants.size()) {
                if (r50Var.o0) {
                    if (i17 >= 0 && i17 < arrayList2.size()) {
                        l10 = (Long) arrayList2.get(i17);
                    }
                } else if (i17 >= 0 && i17 < r50Var.W0.invitedUsers.size()) {
                    l10 = r50Var.W0.invitedUsers.get(i17);
                    ChatObject.Call.InvitedUser invitedUser = r50Var.W0.invitedUsersMessageIds.get(l10);
                    z10 = invitedUser != null && invitedUser.isCalling();
                    z11 = false;
                    z12 = false;
                    if (l10 != null) {
                        i11 = ((org.telegram.ui.ActionBar.f3) r50Var).currentAccount;
                        org.telegram.ui.ActionBar.h5 h5Var = t3Var.c;
                        org.telegram.ui.ActionBar.h5 h5Var2 = t3Var.b;
                        org.telegram.ui.Components.t9 t9Var = t3Var.a;
                        org.telegram.ui.Components.e9 e9Var = t3Var.e;
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(l10);
                        t3Var.f = user;
                        if (user == null) {
                            e9Var.g(21);
                        } else {
                            e9Var.r(user);
                        }
                        h5Var2.l(UserObject.getUserName(t3Var.f), false);
                        t9Var.getImageReceiver().setCurrentAccount(i11);
                        t9Var.e(t3Var.f, e9Var);
                        h5Var.l(LocaleController.getString(z12 ? R.string.ShadyLeaving : z11 ? R.string.ShadyJoining : z10 ? R.string.ConferenceCalling : R.string.Invited), false);
                        float f11 = 0.5f;
                        t9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                        h5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                        if (!z11 && !z12) {
                            f11 = 1.0f;
                        }
                        h5Var.setAlpha(f11);
                        ImageView imageView = t3Var.d;
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
                l10 = r50Var.W0.shadyLeftParticipants.get(i10 - this.s);
                z11 = false;
                z12 = true;
                z10 = false;
                if (l10 != null) {
                }
            }
        } else {
            l10 = r50Var.W0.shadyJoinParticipants.get(i10 - this.n);
            z11 = true;
        }
        z12 = false;
        z10 = false;
        if (l10 != null) {
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        r50 r50Var = this.I;
        AccountInstance accountInstance = r50Var.d;
        Context context = this.c;
        if (i10 == 0) {
            h50 h50Var = new h50(context);
            h50Var.h = 67;
            h50Var.n = 18;
            Paint paint = new Paint();
            h50Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gg, false));
            h50Var.e = 23;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            h50Var.a = h5Var;
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            h5Var.setTextSize(16);
            h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
            h5Var.setImportantForAccessibility(2);
            h50Var.addView(h5Var);
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
            h50Var.b = h5Var2;
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
            h5Var2.setTextSize(16);
            h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
            h5Var2.setImportantForAccessibility(2);
            h50Var.addView(h5Var2);
            ImageView imageView = new ImageView(context);
            h50Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.m6, false), PorterDuff.Mode.MULTIPLY));
            h50Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            h50Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            h50Var.addView(imageView2);
            h50Var.setFocusable(true);
            view = h50Var;
        } else if (i10 == 1) {
            view = new i50(this, context);
        } else if (i10 == 2) {
            j50 j50Var = new j50(context);
            j50Var.n = org.telegram.ui.ActionBar.g6.rg;
            Paint paint2 = new Paint();
            j50Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gg, false));
            j50Var.e = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            j50Var.a = t9Var;
            t9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
            boolean z10 = LocaleController.isRTL;
            j50Var.addView(t9Var, i7.f6.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
            j50Var.b = h5Var3;
            h5Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ng, false));
            h5Var3.setTypeface(AndroidUtilities.bold());
            h5Var3.setTextSize(16);
            h5Var3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z11 = LocaleController.isRTL;
            j50Var.addView(h5Var3, i7.f6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var4 = new org.telegram.ui.ActionBar.h5(context);
            j50Var.c = h5Var4;
            h5Var4.setTextSize(15);
            h5Var4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            h5Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, j50Var.n, false));
            h5Var4.l(LocaleController.getString(R.string.Invited), false);
            boolean z12 = LocaleController.isRTL;
            j50Var.addView(h5Var4, i7.f6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            j50Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, j50Var.n, false), PorterDuff.Mode.MULTIPLY));
            j50Var.addView(imageView3, i7.f6.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            j50Var.setWillNotDraw(false);
            j50Var.setFocusable(true);
            view = j50Var;
        } else if (i10 == 4) {
            view = new k50(this, context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Components.fn(context, 13);
        } else if (i10 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
            if (ChatObject.isChannelOrGiga(r50Var.V0)) {
                textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            } else {
                textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            }
        } else if (i10 != 7) {
            view = new View(context);
        } else {
            if (r50Var.l0 == null) {
                r50Var.l0 = new b50();
            }
            view = new cg.h0(context, r50Var.l0);
        }
        return th.m(view, view, -1, -2);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        n40 n40Var = this.I.K;
        int i10 = n1Var.f;
        View view = n1Var.a;
        if (i10 == 1) {
            org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) view;
            int i11 = n40Var.getTag() != null ? org.telegram.ui.ActionBar.g6.rg : org.telegram.ui.ActionBar.g6.mg;
            c4Var.f(i11, org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            c4Var.setDrawDivider(n1Var.b() != this.B - 2);
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
            int i12 = n40Var.getTag() != null ? org.telegram.ui.ActionBar.g6.rg : org.telegram.ui.ActionBar.g6.mg;
            t3Var.a(i12, org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            t3Var.setDrawDivider(n1Var.b() != this.B - 2);
        }
    }
}
