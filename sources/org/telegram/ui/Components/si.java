package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class si extends kl0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final /* synthetic */ vi J;
    public final Context c;
    public int d;
    public int e;
    public int f;
    public final ArrayList h = new ArrayList();
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public si(vi viVar, Context context) {
        this.J = viVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        int i10 = this.I;
        vi viVar = this.J;
        return (viVar.H1 == null && (viVar.f0 instanceof org.telegram.ui.co) && !viVar.H) ? MediaDataController.getInstance(viVar.J1).inlineBots.size() + i10 : i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 < this.I) {
            return (i10 < this.e || i10 >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // s4.h0
    public final void l() {
        int i10 = 0;
        this.I = 0;
        this.d = -1;
        this.n = -1;
        this.r = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.G = -1;
        this.H = -1;
        this.F = -1;
        this.e = -1;
        this.f = -1;
        vi viVar = this.J;
        int i11 = viVar.J1;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
        if (viVar.H) {
            this.I = 1;
            this.d = 0;
            int i12 = viVar.I;
            if (i12 == 0 || w7.b0.a(i12, 16)) {
                int i13 = this.I;
                this.I = i13 + 1;
                this.n = i13;
            }
            int i14 = viVar.I;
            if (i14 == 0 || w7.b0.a(i14, 8192)) {
                int i15 = this.I;
                this.I = i15 + 1;
                this.E = i15;
            }
            int i16 = viVar.I;
            if (i16 == 0 || w7.b0.a(i16, 16384)) {
                int i17 = this.I;
                this.I = i17 + 1;
                this.F = i17;
            }
            int i18 = viVar.I;
            if (i18 == 0 || w7.b0.a(i18, 8)) {
                int i19 = this.I;
                this.I = i19 + 1;
                this.r = i19;
            }
            int i20 = viVar.I;
            if (i20 == 0 || w7.b0.a(i20, 64)) {
                int i21 = this.I;
                this.I = i21 + 1;
                this.y = i21;
            }
            int i22 = viVar.I;
            if (i22 == 0 || w7.b0.a(i22, 32768)) {
                int i23 = this.I;
                this.I = i23 + 1;
                this.G = i23;
            }
        } else if (!(n2Var instanceof org.telegram.ui.co)) {
            this.d = 0;
            this.I = 2;
            this.n = 1;
            if (viVar.W) {
                this.I = 3;
                this.r = 2;
            }
        } else if (viVar.H1 != null) {
            int i24 = viVar.G1;
            if (i24 == -1) {
                this.d = 0;
                this.n = 1;
                this.I = 3;
                this.r = 2;
            } else {
                if (i24 == 0) {
                    this.I = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.I;
                    this.I = i25 + 1;
                    this.n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.I;
                    this.I = i26 + 1;
                    this.r = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.co) n2Var).i();
            TLRPC.Chat chat = n2Var instanceof org.telegram.ui.co ? ((org.telegram.ui.co) n2Var).e : null;
            boolean z10 = i27 != null && ((org.telegram.ui.co) n2Var).getMessagesController().getSendPaidMessagesStars(i27.id) > 0;
            int i28 = this.I;
            this.I = i28 + 1;
            this.d = i28;
            if ((viVar.L1 || viVar.M1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (n2Var instanceof org.telegram.ui.co) && !((org.telegram.ui.co) n2Var).c() && !((org.telegram.ui.co) n2Var).v())) {
                org.telegram.ui.co coVar = (org.telegram.ui.co) n2Var;
                if (coVar.R3 != 5) {
                    this.e = this.I;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = coVar.e;
                            if (tLObject == null) {
                                tLObject = coVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.I;
                    this.I = size2;
                    this.f = size2;
                }
            }
            int i29 = this.I;
            int i30 = i29 + 1;
            this.I = i30;
            this.n = i29;
            boolean z11 = viVar.Q1;
            if (z11) {
                this.I = i29 + 2;
                this.y = i30;
            }
            if (z11 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.I;
                this.I = i31 + 1;
                this.H = i31;
            }
            if (viVar.O1) {
                int i32 = this.I;
                this.I = i32 + 1;
                this.s = i32;
            }
            if (viVar.P1) {
                int i33 = this.I;
                this.I = i33 + 1;
                this.v = i33;
            }
            if (viVar.Q1) {
                int i34 = this.I;
                this.I = i34 + 1;
                this.w = i34;
            }
            if ((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).R3 == 0 && i27 != null && !z10 && !i27.bot && !ig.b2.f(i11).b.isEmpty()) {
                int i35 = this.I;
                this.I = i35 + 1;
                this.x = i35;
            }
            int i36 = this.I;
            this.I = i36 + 1;
            this.r = i36;
        }
        super.l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0179, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ed, code lost:
    
        if (f0.e.b(r10, r14 >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022b, code lost:
    
        if (f0.e.b(r10, "android.permission.READ_CONTACTS") != 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e3  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = this.J.J1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        boolean z13 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            oi oiVar = (oi) view;
            ph.b bVar = oiVar.a;
            vi viVar = oiVar.d;
            bVar.getClass();
            int i13 = this.e;
            if (i10 >= i13 && i10 < this.f) {
                int i14 = i10 - i13;
                oiVar.setTag(Integer.valueOf(i14));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i14);
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
                if (user != null) {
                    ph.b bVar2 = oiVar.a;
                    bVar2.getClass();
                    bVar2.y = null;
                    bVar2.E = tL_attachMenuBot;
                    bVar2.O = 0;
                    bVar2.P = 0L;
                    bVar2.a.setText(tL_attachMenuBot.short_name);
                    bVar2.c.setRoundRadius(0);
                    bVar2.c.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    bVar2.c.setLayoutParams(w7.x5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    bVar2.M = true;
                    bVar2.a(false);
                    bVar2.f();
                    bVar2.invalidate();
                    oiVar.b = user;
                    oiVar.c = tL_attachMenuBot;
                    oiVar.a.e(false, false);
                    oiVar.invalidate();
                    return;
                }
                return;
            }
            int i15 = i10 - this.I;
            oiVar.setTag(Integer.valueOf(i15));
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(MediaDataController.getInstance(i11).inlineBots.get(i15).peer.user_id));
            if (user2 == null) {
                return;
            }
            ph.b bVar3 = oiVar.a;
            int i16 = viVar.J1;
            bVar3.y = null;
            bVar3.E = null;
            bVar3.O = 0;
            bVar3.P = 0L;
            bVar3.a.setText(ContactsController.formatName(user2.first_name, user2.last_name));
            if (bVar3.U == null) {
                bVar3.U = new i9((org.telegram.ui.ActionBar.f6) null);
            }
            bVar3.U.m(i16, user2);
            bVar3.c.e(user2, bVar3.U);
            bVar3.c.s(-1, -1);
            bVar3.c.setRoundRadius(AndroidUtilities.dp(11.33f));
            bVar3.c.setLayoutParams(w7.x5.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            bVar3.c.setColorFilter(null);
            bVar3.M = false;
            bVar3.invalidate();
            oiVar.b = user2;
            oiVar.c = null;
            oiVar.a.e(false, false);
            oiVar.invalidate();
            return;
        }
        pi piVar = (pi) view;
        piVar.a.getClass();
        int i17 = this.d;
        Context context = this.c;
        if (i10 == i17) {
            piVar.a(1, LocaleController.getString(R.string.ChatGallery), ph.a.x);
            piVar.setTag(1);
            int i18 = Build.VERSION.SDK_INT;
            z12 = i18 < 33 ? true : true;
        } else {
            if (i10 != this.n) {
                if (i10 == this.y) {
                    piVar.a(6, LocaleController.getString(R.string.ChatLocation), ph.a.y);
                    piVar.setTag(6);
                } else if (i10 == this.r) {
                    piVar.a(3, LocaleController.getString(R.string.AttachMusic), ph.a.H);
                    piVar.setTag(3);
                    int i19 = Build.VERSION.SDK_INT;
                    if (i19 >= 23) {
                    }
                } else if (i10 == this.s) {
                    piVar.a(9, LocaleController.getString(R.string.Poll), ph.a.I);
                    piVar.setTag(9);
                } else {
                    if (i10 != this.w) {
                        if (i10 == this.x) {
                            piVar.a(11, LocaleController.getString(R.string.AttachQuickReplies), ph.a.K);
                            piVar.setTag(11);
                        } else if (i10 == this.v) {
                            piVar.a(12, LocaleController.getString(R.string.Todo), ph.a.s);
                            piVar.setTag(12);
                        } else if (i10 == this.E) {
                            piVar.a(13, LocaleController.getString(R.string.ChatSticker), ph.a.E);
                            piVar.setTag(13);
                        } else if (i10 == this.G) {
                            piVar.a(15, LocaleController.getString(R.string.ChatLink), ph.a.L);
                            piVar.setTag(15);
                        } else if (i10 == this.F) {
                            piVar.a(14, LocaleController.getString(R.string.ChatEmoji), ph.a.F);
                            piVar.setTag(14);
                        } else if (i10 == this.H) {
                            piVar.a(16, LocaleController.getString(R.string.AttachArticle), ph.a.M);
                            piVar.setTag(16);
                            z10 = !MessagesController.getInstance(i11).storyEntitiesAllowed();
                            z11 = false;
                            piVar.a.d(z11 ? "!" : null, z11, false);
                            ph.b bVar4 = piVar.a;
                            if (z10 && !UserConfig.getInstance(i11).isPremium()) {
                                z13 = true;
                            }
                            bVar4.setPremiumBadge(z13);
                        }
                        z11 = false;
                        z10 = true;
                        piVar.a.d(z11 ? "!" : null, z11, false);
                        ph.b bVar42 = piVar.a;
                        if (z10) {
                            z13 = true;
                        }
                        bVar42.setPremiumBadge(z13);
                    }
                    piVar.a(5, LocaleController.getString(R.string.AttachContact), ph.a.f);
                    piVar.setTag(5);
                    if (Build.VERSION.SDK_INT >= 23) {
                    }
                }
                z11 = false;
                z10 = false;
                piVar.a.d(z11 ? "!" : null, z11, false);
                ph.b bVar422 = piVar.a;
                if (z10) {
                }
                bVar422.setPremiumBadge(z13);
            }
            piVar.a(4, LocaleController.getString(R.string.ChatDocument), ph.a.w);
            piVar.setTag(4);
            int i20 = Build.VERSION.SDK_INT;
            if (i20 < 33) {
            }
        }
        z11 = !z12;
        z10 = false;
        piVar.a.d(z11 ? "!" : null, z11, false);
        ph.b bVar4222 = piVar.a;
        if (z10) {
        }
        bVar4222.setPremiumBadge(z13);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        vi viVar = this.J;
        View oiVar = i10 != 0 ? new oi(viVar, context) : new pi(viVar, context);
        oiVar.setImportantForAccessibility(1);
        oiVar.setFocusable(true);
        oiVar.setLayoutParams(new s4.p0(-2, -1));
        return new vk0(oiVar);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
    }
}
