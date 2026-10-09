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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vi extends pm0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final /* synthetic */ yi K;
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

    public vi(yi yiVar, Context context) {
        this.K = yiVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override // s4.i0
    public final int h() {
        int i10 = this.J;
        yi yiVar = this.K;
        return (yiVar.K1 == null && (yiVar.f0 instanceof org.telegram.ui.zn) && !yiVar.H) ? MediaDataController.getInstance(yiVar.M1).inlineBots.size() + i10 : i10;
    }

    @Override // s4.i0
    public final int j(int i10) {
        if (i10 < this.J) {
            return (i10 < this.e || i10 >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // s4.i0
    public final void l() {
        int i10 = 0;
        this.J = 0;
        this.d = -1;
        this.n = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.G = -1;
        this.e = -1;
        this.f = -1;
        this.r = -1;
        yi yiVar = this.K;
        int i11 = yiVar.M1;
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
        if (yiVar.H) {
            this.J = 1;
            this.d = 0;
            int i12 = yiVar.I;
            if (i12 == 0 || w7.g0.a(i12, 16)) {
                int i13 = this.J;
                this.J = i13 + 1;
                this.n = i13;
            }
            int i14 = yiVar.I;
            if (i14 == 0 || w7.g0.a(i14, 8192)) {
                int i15 = this.J;
                this.J = i15 + 1;
                this.F = i15;
            }
            int i16 = yiVar.I;
            if (i16 == 0 || w7.g0.a(i16, 16384)) {
                int i17 = this.J;
                this.J = i17 + 1;
                this.G = i17;
            }
            int i18 = yiVar.I;
            if (i18 == 0 || w7.g0.a(i18, 8)) {
                int i19 = this.J;
                this.J = i19 + 1;
                this.s = i19;
            }
            int i20 = yiVar.I;
            if (i20 == 0 || w7.g0.a(i20, 64)) {
                int i21 = this.J;
                this.J = i21 + 1;
                this.E = i21;
            }
            int i22 = yiVar.I;
            if (i22 == 0 || w7.g0.a(i22, 32768)) {
                int i23 = this.J;
                this.J = i23 + 1;
                this.H = i23;
            }
        } else if (!(n2Var instanceof org.telegram.ui.zn)) {
            this.d = 0;
            this.J = 2;
            this.n = 1;
            if (yiVar.W) {
                this.J = 3;
                this.s = 2;
            }
        } else if (yiVar.K1 != null) {
            int i24 = yiVar.J1;
            if (i24 == -1) {
                this.d = 0;
                this.n = 1;
                this.J = 3;
                this.s = 2;
            } else {
                if (i24 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.J;
                    this.J = i26 + 1;
                    this.s = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.zn) n2Var).i();
            TLRPC.Chat chat = n2Var instanceof org.telegram.ui.zn ? ((org.telegram.ui.zn) n2Var).e : null;
            boolean z10 = i27 != null && ((org.telegram.ui.zn) n2Var).getMessagesController().getSendPaidMessagesStars(i27.id) > 0;
            int i28 = this.J;
            this.d = i28;
            this.J = i28 + 2;
            this.n = i28 + 1;
            if (MessagesController.getInstance(i11).config.walletAvailable.get() && ((org.telegram.ui.zn) n2Var).R3 == 0 && yi.v1(i27)) {
                int i29 = this.J;
                this.J = i29 + 1;
                this.r = i29;
            }
            boolean z11 = yiVar.T1;
            if (z11) {
                int i30 = this.J;
                this.J = i30 + 1;
                this.E = i30;
            }
            if (z11 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.J;
                this.J = i31 + 1;
                this.I = i31;
            }
            if (yiVar.R1) {
                int i32 = this.J;
                this.J = i32 + 1;
                this.v = i32;
            }
            if (yiVar.T1) {
                int i33 = this.J;
                this.J = i33 + 1;
                this.x = i33;
            }
            int i34 = this.J;
            int i35 = i34 + 1;
            this.J = i35;
            this.s = i34;
            if (yiVar.S1) {
                this.J = i34 + 2;
                this.w = i35;
            }
            if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).R3 == 0 && i27 != null && !z10 && !i27.bot && !hg.c2.f(i11).b.isEmpty()) {
                int i36 = this.J;
                this.J = i36 + 1;
                this.y = i36;
            }
            if ((yiVar.O1 || yiVar.P1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (n2Var instanceof org.telegram.ui.zn) && !((org.telegram.ui.zn) n2Var).c() && !((org.telegram.ui.zn) n2Var).v())) {
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
                if (znVar.R3 != 5) {
                    this.e = this.J;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = znVar.e;
                            if (tLObject == null) {
                                tLObject = znVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.J;
                    this.J = size2;
                    this.f = size2;
                }
            }
        }
        super.l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0174, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fe, code lost:
    
        if (f0.c.b(r9, android.os.Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0239, code lost:
    
        if (f0.c.b(r9, "android.permission.READ_CONTACTS") == 0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f0  */
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = this.K.M1;
        int i12 = d1Var.f;
        View view = d1Var.a;
        boolean z13 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            ri riVar = (ri) view;
            oh.b bVar = riVar.a;
            yi yiVar = riVar.d;
            bVar.getClass();
            int i13 = this.e;
            if (i10 >= i13 && i10 < this.f) {
                int i14 = i10 - i13;
                riVar.setTag(Integer.valueOf(i14));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i14);
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
                if (user != null) {
                    oh.b bVar2 = riVar.a;
                    bVar2.getClass();
                    bVar2.y = null;
                    bVar2.E = tL_attachMenuBot;
                    bVar2.O = 0;
                    bVar2.P = 0L;
                    bVar2.a.setText(tL_attachMenuBot.short_name);
                    bVar2.c.setRoundRadius(0);
                    bVar2.c.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    bVar2.c.setLayoutParams(w7.x5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
                    bVar2.M = true;
                    bVar2.a(false);
                    bVar2.f();
                    bVar2.invalidate();
                    riVar.b = user;
                    riVar.c = tL_attachMenuBot;
                    riVar.a.e(false, false);
                    riVar.invalidate();
                    return;
                }
                return;
            }
            int i15 = i10 - this.J;
            riVar.setTag(Integer.valueOf(i15));
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(MediaDataController.getInstance(i11).inlineBots.get(i15).peer.user_id));
            if (user2 == null) {
                return;
            }
            oh.b bVar3 = riVar.a;
            int i16 = yiVar.M1;
            bVar3.y = null;
            bVar3.E = null;
            bVar3.O = 0;
            bVar3.P = 0L;
            bVar3.a.setText(ContactsController.formatName(user2.first_name, user2.last_name));
            if (bVar3.U == null) {
                bVar3.U = new j9((org.telegram.ui.ActionBar.e6) null);
            }
            bVar3.U.m(i16, user2);
            bVar3.c.e(user2, bVar3.U);
            bVar3.c.s(-1, -1);
            bVar3.c.setRoundRadius(AndroidUtilities.dp(11.33f));
            bVar3.c.setLayoutParams(w7.x5.a(22.0f, 0.0f, 5.0f, 0.0f, 0.0f, 22, 49));
            bVar3.c.setColorFilter(null);
            bVar3.M = false;
            bVar3.invalidate();
            riVar.b = user2;
            riVar.c = null;
            riVar.a.e(false, false);
            riVar.invalidate();
            return;
        }
        si siVar = (si) view;
        siVar.a.getClass();
        int i17 = this.d;
        Context context = this.c;
        if (i10 != i17) {
            if (i10 == this.r) {
                siVar.a(17, LocaleController.getString(R.string.WalletAttachMoney), oh.a.N);
                siVar.setTag(17);
            } else if (i10 == this.n) {
                siVar.a(4, LocaleController.getString(R.string.ChatDocument), oh.a.w);
                siVar.setTag(4);
                if (Build.VERSION.SDK_INT < 33) {
                }
            } else if (i10 == this.E) {
                siVar.a(6, LocaleController.getString(R.string.ChatLocation), oh.a.y);
                siVar.setTag(6);
            } else if (i10 == this.s) {
                siVar.a(3, LocaleController.getString(R.string.AttachMusic), oh.a.H);
                siVar.setTag(3);
            } else if (i10 == this.v) {
                siVar.a(9, LocaleController.getString(R.string.Poll), oh.a.I);
                siVar.setTag(9);
            } else {
                if (i10 != this.x) {
                    if (i10 == this.y) {
                        siVar.a(11, LocaleController.getString(R.string.AttachQuickReplies), oh.a.K);
                        siVar.setTag(11);
                    } else if (i10 == this.w) {
                        siVar.a(12, LocaleController.getString(R.string.Todo), oh.a.s);
                        siVar.setTag(12);
                    } else if (i10 == this.F) {
                        siVar.a(13, LocaleController.getString(R.string.ChatSticker), oh.a.E);
                        siVar.setTag(13);
                    } else if (i10 == this.H) {
                        siVar.a(15, LocaleController.getString(R.string.ChatLink), oh.a.L);
                        siVar.setTag(15);
                    } else if (i10 == this.G) {
                        siVar.a(14, LocaleController.getString(R.string.ChatEmoji), oh.a.F);
                        siVar.setTag(14);
                    } else if (i10 == this.I) {
                        siVar.a(16, LocaleController.getString(R.string.AttachArticle), oh.a.M);
                        siVar.setTag(16);
                        z10 = !MessagesController.getInstance(i11).storyEntitiesAllowed();
                        z11 = false;
                        siVar.a.d(z11 ? "!" : null, z11, false);
                        oh.b bVar4 = siVar.a;
                        if (z10 && !UserConfig.getInstance(i11).isPremium()) {
                            z13 = true;
                        }
                        bVar4.setPremiumBadge(z13);
                    }
                    z11 = false;
                    z10 = true;
                    siVar.a.d(z11 ? "!" : null, z11, false);
                    oh.b bVar42 = siVar.a;
                    if (z10) {
                        z13 = true;
                    }
                    bVar42.setPremiumBadge(z13);
                }
                siVar.a(5, LocaleController.getString(R.string.AttachContact), oh.a.f);
                siVar.setTag(5);
            }
            z11 = false;
            z10 = false;
            siVar.a.d(z11 ? "!" : null, z11, false);
            oh.b bVar422 = siVar.a;
            if (z10) {
            }
            bVar422.setPremiumBadge(z13);
        }
        siVar.a(1, LocaleController.getString(R.string.ChatGallery), oh.a.x);
        siVar.setTag(1);
        z12 = Build.VERSION.SDK_INT < 33 ? false : false;
        z11 = !z12;
        z10 = false;
        siVar.a.d(z11 ? "!" : null, z11, false);
        oh.b bVar4222 = siVar.a;
        if (z10) {
        }
        bVar4222.setPremiumBadge(z13);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        yi yiVar = this.K;
        View riVar = i10 != 0 ? new ri(yiVar, context) : new si(yiVar, context);
        riVar.setImportantForAccessibility(1);
        riVar.setFocusable(true);
        riVar.setLayoutParams(new s4.q0(-2, -1));
        return new am0(riVar);
    }

    @Override // s4.i0
    public final void y(s4.d1 d1Var) {
    }
}
