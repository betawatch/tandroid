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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ji extends rl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final /* synthetic */ mi G;
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

    public ji(mi miVar, Context context) {
        this.G = miVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        int i10 = this.F;
        mi miVar = this.G;
        return (miVar.E1 == null && (miVar.c0 instanceof org.telegram.ui.xn) && !miVar.E) ? MediaDataController.getInstance(miVar.G1).inlineBots.size() + i10 : i10;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 < this.F) {
            return (i10 < this.e || i10 >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // f2.p0
    public final void l() {
        int i10 = 0;
        this.F = 0;
        this.d = -1;
        this.n = -1;
        this.r = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.B = -1;
        this.D = -1;
        this.E = -1;
        this.C = -1;
        this.e = -1;
        this.f = -1;
        mi miVar = this.G;
        int i11 = miVar.G1;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
        if (miVar.E) {
            this.F = 1;
            this.d = 0;
            int i12 = miVar.F;
            if (i12 == 0 || k7.x8.a(i12, 16)) {
                int i13 = this.F;
                this.F = i13 + 1;
                this.n = i13;
            }
            int i14 = miVar.F;
            if (i14 == 0 || k7.x8.a(i14, 8192)) {
                int i15 = this.F;
                this.F = i15 + 1;
                this.B = i15;
            }
            int i16 = miVar.F;
            if (i16 == 0 || k7.x8.a(i16, 16384)) {
                int i17 = this.F;
                this.F = i17 + 1;
                this.C = i17;
            }
            int i18 = miVar.F;
            if (i18 == 0 || k7.x8.a(i18, 8)) {
                int i19 = this.F;
                this.F = i19 + 1;
                this.r = i19;
            }
            int i20 = miVar.F;
            if (i20 == 0 || k7.x8.a(i20, 64)) {
                int i21 = this.F;
                this.F = i21 + 1;
                this.y = i21;
            }
            int i22 = miVar.F;
            if (i22 == 0 || k7.x8.a(i22, 32768)) {
                int i23 = this.F;
                this.F = i23 + 1;
                this.D = i23;
            }
        } else if (!(p2Var instanceof org.telegram.ui.xn)) {
            this.d = 0;
            this.F = 2;
            this.n = 1;
            if (miVar.T) {
                this.F = 3;
                this.r = 2;
            }
        } else if (miVar.E1 != null) {
            int i24 = miVar.D1;
            if (i24 == -1) {
                this.d = 0;
                this.n = 1;
                this.F = 3;
                this.r = 2;
            } else {
                if (i24 == 0) {
                    this.F = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.F;
                    this.F = i25 + 1;
                    this.n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.F;
                    this.F = i26 + 1;
                    this.r = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.xn) p2Var).i();
            TLRPC.Chat chat = p2Var instanceof org.telegram.ui.xn ? ((org.telegram.ui.xn) p2Var).e : null;
            boolean z4 = i27 != null && ((org.telegram.ui.xn) p2Var).getMessagesController().getSendPaidMessagesStars(i27.id) > 0;
            int i28 = this.F;
            this.F = i28 + 1;
            this.d = i28;
            if ((miVar.I1 || miVar.J1) && !z4 && ((chat == null || !ChatObject.isMonoForum(chat)) && (p2Var instanceof org.telegram.ui.xn) && !((org.telegram.ui.xn) p2Var).c() && !((org.telegram.ui.xn) p2Var).w())) {
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
                if (xnVar.O3 != 5) {
                    this.e = this.F;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = xnVar.e;
                            if (tLObject == null) {
                                tLObject = xnVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.F;
                    this.F = size2;
                    this.f = size2;
                }
            }
            int i29 = this.F;
            int i30 = i29 + 1;
            this.F = i30;
            this.n = i29;
            boolean z10 = miVar.N1;
            if (z10) {
                this.F = i29 + 2;
                this.y = i30;
            }
            if (z10 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.F;
                this.F = i31 + 1;
                this.E = i31;
            }
            if (miVar.L1) {
                int i32 = this.F;
                this.F = i32 + 1;
                this.s = i32;
            }
            if (miVar.M1) {
                int i33 = this.F;
                this.F = i33 + 1;
                this.v = i33;
            }
            if (miVar.N1) {
                int i34 = this.F;
                this.F = i34 + 1;
                this.w = i34;
            }
            if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).O3 == 0 && i27 != null && !z4 && !i27.bot && !vf.p1.f(i11).b.isEmpty()) {
                int i35 = this.F;
                this.F = i35 + 1;
                this.x = i35;
            }
            int i36 = this.F;
            this.F = i36 + 1;
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
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        int i11 = this.G.G1;
        int i12 = m1Var.f;
        View view = m1Var.a;
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            fi fiVar = (fi) view;
            ch.b bVar = fiVar.a;
            mi miVar = fiVar.d;
            bVar.getClass();
            int i13 = this.e;
            if (i10 >= i13 && i10 < this.f) {
                int i14 = i10 - i13;
                fiVar.setTag(Integer.valueOf(i14));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i14);
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
                if (user != null) {
                    ch.b bVar2 = fiVar.a;
                    bVar2.getClass();
                    bVar2.y = null;
                    bVar2.B = tL_attachMenuBot;
                    bVar2.L = 0;
                    bVar2.M = 0L;
                    bVar2.a.setText(tL_attachMenuBot.short_name);
                    bVar2.c.setRoundRadius(0);
                    bVar2.c.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    bVar2.c.setLayoutParams(k7.c6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    bVar2.J = true;
                    bVar2.a(false);
                    bVar2.f();
                    bVar2.invalidate();
                    fiVar.b = user;
                    fiVar.c = tL_attachMenuBot;
                    fiVar.a.e(false, false);
                    fiVar.invalidate();
                    return;
                }
                return;
            }
            int i15 = i10 - this.F;
            fiVar.setTag(Integer.valueOf(i15));
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(MediaDataController.getInstance(i11).inlineBots.get(i15).peer.user_id));
            if (user2 == null) {
                return;
            }
            ch.b bVar3 = fiVar.a;
            int i16 = miVar.G1;
            bVar3.y = null;
            bVar3.B = null;
            bVar3.L = 0;
            bVar3.M = 0L;
            bVar3.a.setText(ContactsController.formatName(user2.first_name, user2.last_name));
            if (bVar3.R == null) {
                bVar3.R = new z8((org.telegram.ui.ActionBar.g6) null);
            }
            bVar3.R.m(i16, user2);
            bVar3.c.e(user2, bVar3.R);
            bVar3.c.s(-1, -1);
            bVar3.c.setRoundRadius(AndroidUtilities.dp(11.33f));
            bVar3.c.setLayoutParams(k7.c6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            bVar3.c.setColorFilter(null);
            bVar3.J = false;
            bVar3.invalidate();
            fiVar.b = user2;
            fiVar.c = null;
            fiVar.a.e(false, false);
            fiVar.invalidate();
            return;
        }
        gi giVar = (gi) view;
        giVar.a.getClass();
        int i17 = this.d;
        Context context = this.c;
        if (i10 == i17) {
            giVar.a(1, LocaleController.getString(R.string.ChatGallery), ch.a.x);
            giVar.setTag(1);
            int i18 = Build.VERSION.SDK_INT;
            z11 = i18 < 33 ? true : true;
        } else {
            if (i10 != this.n) {
                if (i10 == this.y) {
                    giVar.a(6, LocaleController.getString(R.string.ChatLocation), ch.a.y);
                    giVar.setTag(6);
                } else if (i10 == this.r) {
                    giVar.a(3, LocaleController.getString(R.string.AttachMusic), ch.a.E);
                    giVar.setTag(3);
                    int i19 = Build.VERSION.SDK_INT;
                    if (i19 >= 23) {
                    }
                } else if (i10 == this.s) {
                    giVar.a(9, LocaleController.getString(R.string.Poll), ch.a.F);
                    giVar.setTag(9);
                } else {
                    if (i10 != this.w) {
                        if (i10 == this.x) {
                            giVar.a(11, LocaleController.getString(R.string.AttachQuickReplies), ch.a.H);
                            giVar.setTag(11);
                        } else if (i10 == this.v) {
                            giVar.a(12, LocaleController.getString(R.string.Todo), ch.a.s);
                            giVar.setTag(12);
                        } else if (i10 == this.B) {
                            giVar.a(13, LocaleController.getString(R.string.ChatSticker), ch.a.B);
                            giVar.setTag(13);
                        } else if (i10 == this.D) {
                            giVar.a(15, LocaleController.getString(R.string.ChatLink), ch.a.I);
                            giVar.setTag(15);
                        } else if (i10 == this.C) {
                            giVar.a(14, LocaleController.getString(R.string.ChatEmoji), ch.a.C);
                            giVar.setTag(14);
                        } else if (i10 == this.E) {
                            giVar.a(16, LocaleController.getString(R.string.AttachArticle), ch.a.J);
                            giVar.setTag(16);
                            z4 = !MessagesController.getInstance(i11).storyEntitiesAllowed();
                            z10 = false;
                            giVar.a.d(z10 ? "!" : null, z10, false);
                            ch.b bVar4 = giVar.a;
                            if (z4 && !UserConfig.getInstance(i11).isPremium()) {
                                z12 = true;
                            }
                            bVar4.setPremiumBadge(z12);
                        }
                        z10 = false;
                        z4 = true;
                        giVar.a.d(z10 ? "!" : null, z10, false);
                        ch.b bVar42 = giVar.a;
                        if (z4) {
                            z12 = true;
                        }
                        bVar42.setPremiumBadge(z12);
                    }
                    giVar.a(5, LocaleController.getString(R.string.AttachContact), ch.a.f);
                    giVar.setTag(5);
                    if (Build.VERSION.SDK_INT >= 23) {
                    }
                }
                z10 = false;
                z4 = false;
                giVar.a.d(z10 ? "!" : null, z10, false);
                ch.b bVar422 = giVar.a;
                if (z4) {
                }
                bVar422.setPremiumBadge(z12);
            }
            giVar.a(4, LocaleController.getString(R.string.ChatDocument), ch.a.w);
            giVar.setTag(4);
            int i20 = Build.VERSION.SDK_INT;
            if (i20 < 33) {
            }
        }
        z10 = !z11;
        z4 = false;
        giVar.a.d(z10 ? "!" : null, z10, false);
        ch.b bVar4222 = giVar.a;
        if (z4) {
        }
        bVar4222.setPremiumBadge(z12);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        mi miVar = this.G;
        View fiVar = i10 != 0 ? new fi(miVar, context) : new gi(miVar, context);
        fiVar.setImportantForAccessibility(1);
        fiVar.setFocusable(true);
        fiVar.setLayoutParams(new f2.x0(-2, -1));
        return new el0(fiVar);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
    }
}
