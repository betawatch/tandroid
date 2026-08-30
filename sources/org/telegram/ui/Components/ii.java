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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ii extends rl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final /* synthetic */ li G;
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

    public ii(li liVar, Context context) {
        this.G = liVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        int i10 = this.F;
        li liVar = this.G;
        return (liVar.E1 == null && (liVar.c0 instanceof org.telegram.ui.xn) && !liVar.E) ? MediaDataController.getInstance(liVar.G1).inlineBots.size() + i10 : i10;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 < this.F) {
            return (i10 < this.e || i10 >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // f2.o0
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
        li liVar = this.G;
        int i11 = liVar.G1;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
        if (liVar.E) {
            this.F = 1;
            this.d = 0;
            int i12 = liVar.F;
            if (i12 == 0 || k7.w8.a(i12, 16)) {
                int i13 = this.F;
                this.F = i13 + 1;
                this.n = i13;
            }
            int i14 = liVar.F;
            if (i14 == 0 || k7.w8.a(i14, 8192)) {
                int i15 = this.F;
                this.F = i15 + 1;
                this.B = i15;
            }
            int i16 = liVar.F;
            if (i16 == 0 || k7.w8.a(i16, 16384)) {
                int i17 = this.F;
                this.F = i17 + 1;
                this.C = i17;
            }
            int i18 = liVar.F;
            if (i18 == 0 || k7.w8.a(i18, 8)) {
                int i19 = this.F;
                this.F = i19 + 1;
                this.r = i19;
            }
            int i20 = liVar.F;
            if (i20 == 0 || k7.w8.a(i20, 64)) {
                int i21 = this.F;
                this.F = i21 + 1;
                this.y = i21;
            }
            int i22 = liVar.F;
            if (i22 == 0 || k7.w8.a(i22, 32768)) {
                int i23 = this.F;
                this.F = i23 + 1;
                this.D = i23;
            }
        } else if (!(p2Var instanceof org.telegram.ui.xn)) {
            this.d = 0;
            this.F = 2;
            this.n = 1;
            if (liVar.T) {
                this.F = 3;
                this.r = 2;
            }
        } else if (liVar.E1 != null) {
            int i24 = liVar.D1;
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
            if ((liVar.I1 || liVar.J1) && !z4 && ((chat == null || !ChatObject.isMonoForum(chat)) && (p2Var instanceof org.telegram.ui.xn) && !((org.telegram.ui.xn) p2Var).c() && !((org.telegram.ui.xn) p2Var).v())) {
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
            boolean z10 = liVar.N1;
            if (z10) {
                this.F = i29 + 2;
                this.y = i30;
            }
            if (z10 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.F;
                this.F = i31 + 1;
                this.E = i31;
            }
            if (liVar.L1) {
                int i32 = this.F;
                this.F = i32 + 1;
                this.s = i32;
            }
            if (liVar.M1) {
                int i33 = this.F;
                this.F = i33 + 1;
                this.v = i33;
            }
            if (liVar.N1) {
                int i34 = this.F;
                this.F = i34 + 1;
                this.w = i34;
            }
            if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).O3 == 0 && i27 != null && !z4 && !i27.bot && !uf.p1.f(i11).b.isEmpty()) {
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
    
        if (f0.f.b(r10, r14 >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022b, code lost:
    
        if (f0.f.b(r10, "android.permission.READ_CONTACTS") != 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e3  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        int i11 = this.G.G1;
        int i12 = l1Var.f;
        View view = l1Var.a;
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            ei eiVar = (ei) view;
            bh.b bVar = eiVar.a;
            li liVar = eiVar.d;
            bVar.getClass();
            int i13 = this.e;
            if (i10 >= i13 && i10 < this.f) {
                int i14 = i10 - i13;
                eiVar.setTag(Integer.valueOf(i14));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i14);
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
                if (user != null) {
                    bh.b bVar2 = eiVar.a;
                    bVar2.getClass();
                    bVar2.y = null;
                    bVar2.B = tL_attachMenuBot;
                    bVar2.L = 0;
                    bVar2.M = 0L;
                    bVar2.a.setText(tL_attachMenuBot.short_name);
                    bVar2.c.setRoundRadius(0);
                    bVar2.c.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    bVar2.c.setLayoutParams(k7.b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    bVar2.J = true;
                    bVar2.a(false);
                    bVar2.f();
                    bVar2.invalidate();
                    eiVar.b = user;
                    eiVar.c = tL_attachMenuBot;
                    eiVar.a.e(false, false);
                    eiVar.invalidate();
                    return;
                }
                return;
            }
            int i15 = i10 - this.F;
            eiVar.setTag(Integer.valueOf(i15));
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(MediaDataController.getInstance(i11).inlineBots.get(i15).peer.user_id));
            if (user2 == null) {
                return;
            }
            bh.b bVar3 = eiVar.a;
            int i16 = liVar.G1;
            bVar3.y = null;
            bVar3.B = null;
            bVar3.L = 0;
            bVar3.M = 0L;
            bVar3.a.setText(ContactsController.formatName(user2.first_name, user2.last_name));
            if (bVar3.R == null) {
                bVar3.R = new z8((org.telegram.ui.ActionBar.f6) null);
            }
            bVar3.R.m(i16, user2);
            bVar3.c.e(user2, bVar3.R);
            bVar3.c.s(-1, -1);
            bVar3.c.setRoundRadius(AndroidUtilities.dp(11.33f));
            bVar3.c.setLayoutParams(k7.b6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            bVar3.c.setColorFilter(null);
            bVar3.J = false;
            bVar3.invalidate();
            eiVar.b = user2;
            eiVar.c = null;
            eiVar.a.e(false, false);
            eiVar.invalidate();
            return;
        }
        fi fiVar = (fi) view;
        fiVar.a.getClass();
        int i17 = this.d;
        Context context = this.c;
        if (i10 == i17) {
            fiVar.a(1, LocaleController.getString(R.string.ChatGallery), bh.a.x);
            fiVar.setTag(1);
            int i18 = Build.VERSION.SDK_INT;
            z11 = i18 < 33 ? true : true;
        } else {
            if (i10 != this.n) {
                if (i10 == this.y) {
                    fiVar.a(6, LocaleController.getString(R.string.ChatLocation), bh.a.y);
                    fiVar.setTag(6);
                } else if (i10 == this.r) {
                    fiVar.a(3, LocaleController.getString(R.string.AttachMusic), bh.a.E);
                    fiVar.setTag(3);
                    int i19 = Build.VERSION.SDK_INT;
                    if (i19 >= 23) {
                    }
                } else if (i10 == this.s) {
                    fiVar.a(9, LocaleController.getString(R.string.Poll), bh.a.F);
                    fiVar.setTag(9);
                } else {
                    if (i10 != this.w) {
                        if (i10 == this.x) {
                            fiVar.a(11, LocaleController.getString(R.string.AttachQuickReplies), bh.a.H);
                            fiVar.setTag(11);
                        } else if (i10 == this.v) {
                            fiVar.a(12, LocaleController.getString(R.string.Todo), bh.a.s);
                            fiVar.setTag(12);
                        } else if (i10 == this.B) {
                            fiVar.a(13, LocaleController.getString(R.string.ChatSticker), bh.a.B);
                            fiVar.setTag(13);
                        } else if (i10 == this.D) {
                            fiVar.a(15, LocaleController.getString(R.string.ChatLink), bh.a.I);
                            fiVar.setTag(15);
                        } else if (i10 == this.C) {
                            fiVar.a(14, LocaleController.getString(R.string.ChatEmoji), bh.a.C);
                            fiVar.setTag(14);
                        } else if (i10 == this.E) {
                            fiVar.a(16, LocaleController.getString(R.string.AttachArticle), bh.a.J);
                            fiVar.setTag(16);
                            z4 = !MessagesController.getInstance(i11).storyEntitiesAllowed();
                            z10 = false;
                            fiVar.a.d(z10 ? "!" : null, z10, false);
                            bh.b bVar4 = fiVar.a;
                            if (z4 && !UserConfig.getInstance(i11).isPremium()) {
                                z12 = true;
                            }
                            bVar4.setPremiumBadge(z12);
                        }
                        z10 = false;
                        z4 = true;
                        fiVar.a.d(z10 ? "!" : null, z10, false);
                        bh.b bVar42 = fiVar.a;
                        if (z4) {
                            z12 = true;
                        }
                        bVar42.setPremiumBadge(z12);
                    }
                    fiVar.a(5, LocaleController.getString(R.string.AttachContact), bh.a.f);
                    fiVar.setTag(5);
                    if (Build.VERSION.SDK_INT >= 23) {
                    }
                }
                z10 = false;
                z4 = false;
                fiVar.a.d(z10 ? "!" : null, z10, false);
                bh.b bVar422 = fiVar.a;
                if (z4) {
                }
                bVar422.setPremiumBadge(z12);
            }
            fiVar.a(4, LocaleController.getString(R.string.ChatDocument), bh.a.w);
            fiVar.setTag(4);
            int i20 = Build.VERSION.SDK_INT;
            if (i20 < 33) {
            }
        }
        z10 = !z11;
        z4 = false;
        fiVar.a.d(z10 ? "!" : null, z10, false);
        bh.b bVar4222 = fiVar.a;
        if (z4) {
        }
        bVar4222.setPremiumBadge(z12);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        li liVar = this.G;
        View eiVar = i10 != 0 ? new ei(liVar, context) : new fi(liVar, context);
        eiVar.setImportantForAccessibility(1);
        eiVar.setFocusable(true);
        eiVar.setLayoutParams(new f2.w0(-2, -1));
        return new el0(eiVar);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
    }
}
