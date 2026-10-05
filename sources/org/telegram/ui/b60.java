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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class b60 extends org.telegram.ui.Components.yl0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final /* synthetic */ h60 M;
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

    public b60(h60 h60Var, LaunchActivity launchActivity) {
        this.M = h60Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        h60 h60Var = this.M;
        ArrayList arrayList = h60Var.q0;
        ChatObject.Call call = h60Var.a1;
        if (call == null || call.isScheduled() || h60Var.s0) {
            return;
        }
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.F = 0;
        this.L = h60Var.a1.participants.h(MessageObject.getPeerId(h60Var.A0)) >= 0;
        if (h60Var.o1()) {
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
        if (!arrayList.isEmpty() && h60Var.Q0() && h60Var.a1.call.participants_count > h60Var.d.getMessagesController().groupCallVideoMaxParticipants) {
            int i13 = this.F;
            this.F = i13 + 1;
            this.J = i13;
        }
        this.d = this.F;
        if (!h60Var.r1()) {
            this.F = h60Var.a1.visibleParticipants.size() + this.F;
        }
        this.e = this.F;
        if (h60Var.a1.invitedUsers.isEmpty() || h60Var.r1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i14 = this.F;
            this.f = i14;
            int size2 = h60Var.a1.invitedUsers.size() + i14;
            this.F = size2;
            this.h = size2;
        }
        if (h60Var.a1.shadyJoinParticipants.isEmpty() || h60Var.r1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.F;
            this.n = i15;
            int size3 = h60Var.a1.shadyJoinParticipants.size() + i15;
            this.F = size3;
            this.r = size3;
        }
        if (h60Var.a1.shadyLeftParticipants.isEmpty() || h60Var.r1()) {
            this.s = -1;
            this.v = -1;
        } else {
            int i16 = this.F;
            this.s = i16;
            int size4 = h60Var.a1.shadyLeftParticipants.size() + i16;
            this.F = size4;
            this.v = size4;
        }
        if (h60Var.o1()) {
            int i17 = this.F;
            this.x = i17;
            this.F = i17 + 2;
            this.y = i17 + 1;
        } else if (!h60Var.r1() && (((!ChatObject.isChannel(h60Var.Z0) || ((chat2 = h60Var.Z0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(h60Var.Z0)) || (ChatObject.isChannel(h60Var.Z0) && (chat = h60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        p50 p50Var;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        ChatObject.VideoParticipant videoParticipant;
        p50 p50Var2;
        h60 h60Var = this.M;
        ArrayList arrayList = h60Var.D0;
        ArrayList arrayList2 = h60Var.F0;
        ArrayList arrayList3 = h60Var.q0;
        ArrayList arrayList4 = h60Var.E0;
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
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i10 == this.x) {
                int i13 = org.telegram.ui.ActionBar.i6.v6;
                d6Var2 = ((org.telegram.ui.ActionBar.f3) h60Var).resourcesProvider;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i13, d6Var2);
                x3Var.a(v02, v02);
                x3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                return;
            }
            if (i10 == this.y) {
                int i14 = org.telegram.ui.ActionBar.i6.v6;
                d6Var = ((org.telegram.ui.ActionBar.f3) h60Var).resourcesProvider;
                int v03 = org.telegram.ui.ActionBar.i6.v0(i14, d6Var);
                x3Var.a(v03, v03);
                x3Var.b(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                return;
            }
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.lg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.og, false), h60Var.O.getTag() != null ? 1.0f : 0.0f, 1.0f);
            x3Var.a(offsetColor, offsetColor);
            if (!ChatObject.isChannel(h60Var.Z0) || (chat = h60Var.Z0) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
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
            if (h60Var.s0) {
                if (i15 >= 0 && i15 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i15);
                }
                groupCallParticipant = null;
            } else {
                if (i15 >= 0 && i15 < h60Var.a1.visibleParticipants.size()) {
                    groupCallParticipant = h60Var.a1.visibleParticipants.get(i15);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(h60Var.A0);
                if (peerId == peerId2 && (p50Var = h60Var.i2) != null) {
                    fileLocation = p50Var.c;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                float f7 = fileLocation3 != null ? h60Var.i2.a : 1.0f;
                boolean z13 = e4Var.getParticipant() != null && MessageObject.getPeerId(e4Var.getParticipant().peer) == peerId;
                e4Var.e(h60Var.d, groupCallParticipant, h60Var.a1, peerId2, fileLocation3, z13);
                boolean z14 = z13;
                org.telegram.ui.Cells.z3 z3Var = e4Var.x;
                z3Var.setProgress(f7);
                if (f7 < 1.0f) {
                    AndroidUtilities.updateViewVisibilityAnimated(z3Var, true, 1.0f, z14);
                    return;
                } else {
                    AndroidUtilities.updateViewVisibilityAnimated(z3Var, false, 1.0f, z14);
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
            lVar.a = h60Var.c.i(i10);
            if (h60Var.s0) {
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
                if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(h60Var.A0) && (p50Var2 = h60Var.i2) != null) {
                    fileLocation2 = p50Var2.c;
                }
                if (fileLocation2 != null) {
                    float f10 = h60Var.i2.a;
                }
                if (lVar.getParticipant() != null) {
                    lVar.getParticipant().equals(videoParticipant);
                }
                lVar.d = videoParticipant;
            }
            if (participant == null || participant.equals(videoParticipant) || !lVar.e || lVar.getRenderer() == null) {
                return;
            }
            h60.L(h60Var, lVar, false);
            h60.L(h60Var, lVar, true);
            return;
        }
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
        int i17 = i10 - this.f;
        int i18 = i10 - this.n;
        if (i18 < 0 || i18 >= h60Var.a1.shadyJoinParticipants.size()) {
            int i19 = i10 - this.s;
            if (i19 < 0 || i19 >= h60Var.a1.shadyLeftParticipants.size()) {
                if (h60Var.s0) {
                    if (i17 >= 0 && i17 < arrayList2.size()) {
                        l4 = (Long) arrayList2.get(i17);
                    }
                } else if (i17 >= 0 && i17 < h60Var.a1.invitedUsers.size()) {
                    l4 = h60Var.a1.invitedUsers.get(i17);
                    ChatObject.Call.InvitedUser invitedUser = h60Var.a1.invitedUsersMessageIds.get(l4);
                    z10 = invitedUser != null && invitedUser.isCalling();
                    z11 = false;
                    z12 = false;
                    if (l4 != null) {
                        i11 = ((org.telegram.ui.ActionBar.f3) h60Var).currentAccount;
                        org.telegram.ui.ActionBar.i5 i5Var = w3Var.c;
                        org.telegram.ui.ActionBar.i5 i5Var2 = w3Var.b;
                        org.telegram.ui.Components.w9 w9Var = w3Var.a;
                        org.telegram.ui.Components.h9 h9Var = w3Var.e;
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(l4);
                        w3Var.f = user;
                        if (user == null) {
                            h9Var.g(21);
                        } else {
                            h9Var.r(user);
                        }
                        i5Var2.l(UserObject.getUserName(w3Var.f), false);
                        w9Var.getImageReceiver().setCurrentAccount(i11);
                        w9Var.e(w3Var.f, h9Var);
                        i5Var.l(LocaleController.getString(z12 ? R.string.ShadyLeaving : z11 ? R.string.ShadyJoining : z10 ? R.string.ConferenceCalling : R.string.Invited), false);
                        float f11 = 0.5f;
                        w9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                        i5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                        if (!z11 && !z12) {
                            f11 = 1.0f;
                        }
                        i5Var.setAlpha(f11);
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
                l4 = h60Var.a1.shadyLeftParticipants.get(i10 - this.s);
                z11 = false;
                z12 = true;
                z10 = false;
                if (l4 != null) {
                }
            }
        } else {
            l4 = h60Var.a1.shadyJoinParticipants.get(i10 - this.n);
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
        h60 h60Var = this.M;
        AccountInstance accountInstance = h60Var.d;
        Context context = this.c;
        if (i10 == 0) {
            x50 x50Var = new x50(context);
            x50Var.h = 67;
            x50Var.n = 18;
            Paint paint = new Paint();
            x50Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gg, false));
            x50Var.e = 23;
            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
            x50Var.a = i5Var;
            i5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
            i5Var.setTextSize(16);
            i5Var.setGravity(LocaleController.isRTL ? 5 : 3);
            i5Var.setImportantForAccessibility(2);
            x50Var.addView(i5Var);
            org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
            x50Var.b = i5Var2;
            i5Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I6, false));
            i5Var2.setTextSize(16);
            i5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
            i5Var2.setImportantForAccessibility(2);
            x50Var.addView(i5Var2);
            ImageView imageView = new ImageView(context);
            x50Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.m6, false), PorterDuff.Mode.MULTIPLY));
            x50Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            x50Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            x50Var.addView(imageView2);
            x50Var.setFocusable(true);
            view = x50Var;
        } else if (i10 == 1) {
            view = new y50(this, context);
        } else if (i10 == 2) {
            z50 z50Var = new z50(context);
            z50Var.n = org.telegram.ui.ActionBar.i6.rg;
            Paint paint2 = new Paint();
            z50Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gg, false));
            z50Var.e = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            z50Var.a = w9Var;
            w9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
            boolean z10 = LocaleController.isRTL;
            z50Var.addView(w9Var, w7.z5.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.i5 i5Var3 = new org.telegram.ui.ActionBar.i5(context);
            z50Var.b = i5Var3;
            i5Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.ng, false));
            i5Var3.setTypeface(AndroidUtilities.bold());
            i5Var3.setTextSize(16);
            i5Var3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z11 = LocaleController.isRTL;
            z50Var.addView(i5Var3, w7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.i5 i5Var4 = new org.telegram.ui.ActionBar.i5(context);
            z50Var.c = i5Var4;
            i5Var4.setTextSize(15);
            i5Var4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            i5Var4.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, z50Var.n, false));
            i5Var4.l(LocaleController.getString(R.string.Invited), false);
            boolean z12 = LocaleController.isRTL;
            z50Var.addView(i5Var4, w7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            z50Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, z50Var.n, false), PorterDuff.Mode.MULTIPLY));
            z50Var.addView(imageView3, w7.z5.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            z50Var.setWillNotDraw(false);
            z50Var.setFocusable(true);
            view = z50Var;
        } else if (i10 == 4) {
            view = new a60(this, context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Components.nn(context, 15);
        } else if (i10 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
            if (ChatObject.isChannelOrGiga(h60Var.Z0)) {
                textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            } else {
                textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            }
        } else if (i10 != 7) {
            view = new View(context);
        } else {
            if (h60Var.p0 == null) {
                h60Var.p0 = new s50();
            }
            view = new n20(context, h60Var.p0);
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        e50 e50Var = this.M.O;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            int i11 = e50Var.getTag() != null ? org.telegram.ui.ActionBar.i6.rg : org.telegram.ui.ActionBar.i6.mg;
            e4Var.f(i11, org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            e4Var.setDrawDivider(c1Var.b() != this.F - 2);
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            int i12 = e50Var.getTag() != null ? org.telegram.ui.ActionBar.i6.rg : org.telegram.ui.ActionBar.i6.mg;
            w3Var.a(i12, org.telegram.ui.ActionBar.i6.w0(null, i12, false));
            w3Var.setDrawDivider(c1Var.b() != this.F - 2);
        }
    }
}
