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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hi extends vk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final /* synthetic */ ki F;
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

    public hi(ki kiVar, Context context) {
        this.F = kiVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        int i9 = this.E;
        ki kiVar = this.F;
        return (kiVar.D1 == null && (kiVar.b0 instanceof org.telegram.ui.qn) && !kiVar.D) ? MediaDataController.getInstance(kiVar.F1).inlineBots.size() + i9 : i9;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 < this.E) {
            return (i9 < this.e || i9 >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // f2.r0
    public final void l() {
        int i9 = 0;
        this.E = 0;
        this.d = -1;
        this.n = -1;
        this.r = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.A = -1;
        this.C = -1;
        this.D = -1;
        this.B = -1;
        this.e = -1;
        this.f = -1;
        ki kiVar = this.F;
        int i10 = kiVar.F1;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if (kiVar.D) {
            this.E = 1;
            this.d = 0;
            int i11 = kiVar.E;
            if (i11 == 0 || g7.z7.a(i11, 16)) {
                int i12 = this.E;
                this.E = i12 + 1;
                this.n = i12;
            }
            int i13 = kiVar.E;
            if (i13 == 0 || g7.z7.a(i13, 8192)) {
                int i14 = this.E;
                this.E = i14 + 1;
                this.A = i14;
            }
            int i15 = kiVar.E;
            if (i15 == 0 || g7.z7.a(i15, 16384)) {
                int i16 = this.E;
                this.E = i16 + 1;
                this.B = i16;
            }
            int i17 = kiVar.E;
            if (i17 == 0 || g7.z7.a(i17, 8)) {
                int i18 = this.E;
                this.E = i18 + 1;
                this.r = i18;
            }
            int i19 = kiVar.E;
            if (i19 == 0 || g7.z7.a(i19, 64)) {
                int i20 = this.E;
                this.E = i20 + 1;
                this.y = i20;
            }
            int i21 = kiVar.E;
            if (i21 == 0 || g7.z7.a(i21, 32768)) {
                int i22 = this.E;
                this.E = i22 + 1;
                this.C = i22;
            }
        } else if (!(o2Var instanceof org.telegram.ui.qn)) {
            this.d = 0;
            this.E = 2;
            this.n = 1;
            if (kiVar.S) {
                this.E = 3;
                this.r = 2;
            }
        } else if (kiVar.D1 != null) {
            int i23 = kiVar.C1;
            if (i23 == -1) {
                this.d = 0;
                this.n = 1;
                this.E = 3;
                this.r = 2;
            } else {
                if (i23 == 0) {
                    this.E = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.E;
                    this.E = i24 + 1;
                    this.n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.E;
                    this.E = i25 + 1;
                    this.r = i25;
                }
            }
        } else {
            TLRPC.User i26 = ((org.telegram.ui.qn) o2Var).i();
            TLRPC.Chat chat = o2Var instanceof org.telegram.ui.qn ? ((org.telegram.ui.qn) o2Var).e : null;
            boolean z10 = i26 != null && ((org.telegram.ui.qn) o2Var).getMessagesController().getSendPaidMessagesStars(i26.id) > 0;
            int i27 = this.E;
            this.E = i27 + 1;
            this.d = i27;
            if ((kiVar.H1 || kiVar.I1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (o2Var instanceof org.telegram.ui.qn) && !((org.telegram.ui.qn) o2Var).c() && !((org.telegram.ui.qn) o2Var).w())) {
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
                if (qnVar.N3 != 5) {
                    this.e = this.E;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i9 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i9);
                        i9++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = qnVar.e;
                            if (tLObject == null) {
                                tLObject = qnVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.E;
                    this.E = size2;
                    this.f = size2;
                }
            }
            int i28 = this.E;
            int i29 = i28 + 1;
            this.E = i29;
            this.n = i28;
            boolean z11 = kiVar.M1;
            if (z11) {
                this.E = i28 + 2;
                this.y = i29;
            }
            if (z11 && MessagesController.getInstance(i10).richEditorAvailable()) {
                int i30 = this.E;
                this.E = i30 + 1;
                this.D = i30;
            }
            if (kiVar.K1) {
                int i31 = this.E;
                this.E = i31 + 1;
                this.s = i31;
            }
            if (kiVar.L1) {
                int i32 = this.E;
                this.E = i32 + 1;
                this.v = i32;
            }
            if (kiVar.M1) {
                int i33 = this.E;
                this.E = i33 + 1;
                this.w = i33;
            }
            if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).N3 == 0 && i26 != null && !z10 && !i26.bot && !pf.r1.f(i10).b.isEmpty()) {
                int i34 = this.E;
                this.E = i34 + 1;
                this.x = i34;
            }
            int i35 = this.E;
            this.E = i35 + 1;
            this.r = i35;
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.F.F1;
        int i11 = q1Var.f;
        View view = q1Var.a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            di diVar = (di) view;
            wg.b bVar = diVar.a;
            ki kiVar = diVar.d;
            bVar.getClass();
            int i12 = this.e;
            if (i9 >= i12 && i9 < this.f) {
                int i13 = i9 - i12;
                diVar.setTag(Integer.valueOf(i13));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i13);
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
                if (user != null) {
                    wg.b bVar2 = diVar.a;
                    bVar2.getClass();
                    bVar2.y = null;
                    bVar2.A = tL_attachMenuBot;
                    bVar2.K = 0;
                    bVar2.L = 0L;
                    bVar2.a.setText(tL_attachMenuBot.short_name);
                    bVar2.c.setRoundRadius(0);
                    bVar2.c.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    bVar2.c.setLayoutParams(g7.e6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    bVar2.I = true;
                    bVar2.a(false);
                    bVar2.f();
                    bVar2.invalidate();
                    diVar.b = user;
                    diVar.c = tL_attachMenuBot;
                    diVar.a.e(false, false);
                    diVar.invalidate();
                    return;
                }
                return;
            }
            int i14 = i9 - this.E;
            diVar.setTag(Integer.valueOf(i14));
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(MediaDataController.getInstance(i10).inlineBots.get(i14).peer.user_id));
            if (user2 == null) {
                return;
            }
            wg.b bVar3 = diVar.a;
            int i15 = kiVar.F1;
            bVar3.y = null;
            bVar3.A = null;
            bVar3.K = 0;
            bVar3.L = 0L;
            bVar3.a.setText(ContactsController.formatName(user2.first_name, user2.last_name));
            if (bVar3.Q == null) {
                bVar3.Q = new z8((org.telegram.ui.ActionBar.b6) null);
            }
            bVar3.Q.m(i15, user2);
            bVar3.c.e(user2, bVar3.Q);
            bVar3.c.s(-1, -1);
            bVar3.c.setRoundRadius(AndroidUtilities.dp(11.33f));
            bVar3.c.setLayoutParams(g7.e6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            bVar3.c.setColorFilter(null);
            bVar3.I = false;
            bVar3.invalidate();
            diVar.b = user2;
            diVar.c = null;
            diVar.a.e(false, false);
            diVar.invalidate();
            return;
        }
        ei eiVar = (ei) view;
        eiVar.a.getClass();
        int i16 = this.d;
        Context context = this.c;
        if (i9 == i16) {
            eiVar.a(1, LocaleController.getString(R.string.ChatGallery), wg.a.x);
            eiVar.setTag(1);
            int i17 = Build.VERSION.SDK_INT;
            z12 = i17 < 33 ? true : true;
        } else {
            if (i9 != this.n) {
                if (i9 == this.y) {
                    eiVar.a(6, LocaleController.getString(R.string.ChatLocation), wg.a.y);
                    eiVar.setTag(6);
                } else if (i9 == this.r) {
                    eiVar.a(3, LocaleController.getString(R.string.AttachMusic), wg.a.D);
                    eiVar.setTag(3);
                    int i18 = Build.VERSION.SDK_INT;
                    if (i18 >= 23) {
                    }
                } else if (i9 == this.s) {
                    eiVar.a(9, LocaleController.getString(R.string.Poll), wg.a.E);
                    eiVar.setTag(9);
                } else {
                    if (i9 != this.w) {
                        if (i9 == this.x) {
                            eiVar.a(11, LocaleController.getString(R.string.AttachQuickReplies), wg.a.G);
                            eiVar.setTag(11);
                        } else if (i9 == this.v) {
                            eiVar.a(12, LocaleController.getString(R.string.Todo), wg.a.s);
                            eiVar.setTag(12);
                        } else if (i9 == this.A) {
                            eiVar.a(13, LocaleController.getString(R.string.ChatSticker), wg.a.A);
                            eiVar.setTag(13);
                        } else if (i9 == this.C) {
                            eiVar.a(15, LocaleController.getString(R.string.ChatLink), wg.a.H);
                            eiVar.setTag(15);
                        } else if (i9 == this.B) {
                            eiVar.a(14, LocaleController.getString(R.string.ChatEmoji), wg.a.B);
                            eiVar.setTag(14);
                        } else if (i9 == this.D) {
                            eiVar.a(16, LocaleController.getString(R.string.AttachArticle), wg.a.I);
                            eiVar.setTag(16);
                            z10 = !MessagesController.getInstance(i10).storyEntitiesAllowed();
                            z11 = false;
                            eiVar.a.d(z11 ? "!" : null, z11, false);
                            wg.b bVar4 = eiVar.a;
                            if (z10 && !UserConfig.getInstance(i10).isPremium()) {
                                z13 = true;
                            }
                            bVar4.setPremiumBadge(z13);
                        }
                        z11 = false;
                        z10 = true;
                        eiVar.a.d(z11 ? "!" : null, z11, false);
                        wg.b bVar42 = eiVar.a;
                        if (z10) {
                            z13 = true;
                        }
                        bVar42.setPremiumBadge(z13);
                    }
                    eiVar.a(5, LocaleController.getString(R.string.AttachContact), wg.a.f);
                    eiVar.setTag(5);
                    if (Build.VERSION.SDK_INT >= 23) {
                    }
                }
                z11 = false;
                z10 = false;
                eiVar.a.d(z11 ? "!" : null, z11, false);
                wg.b bVar422 = eiVar.a;
                if (z10) {
                }
                bVar422.setPremiumBadge(z13);
            }
            eiVar.a(4, LocaleController.getString(R.string.ChatDocument), wg.a.w);
            eiVar.setTag(4);
            int i19 = Build.VERSION.SDK_INT;
            if (i19 < 33) {
            }
        }
        z11 = !z12;
        z10 = false;
        eiVar.a.d(z11 ? "!" : null, z11, false);
        wg.b bVar4222 = eiVar.a;
        if (z10) {
        }
        bVar4222.setPremiumBadge(z13);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.c;
        ki kiVar = this.F;
        View diVar = i9 != 0 ? new di(kiVar, context) : new ei(kiVar, context);
        diVar.setImportantForAccessibility(1);
        diVar.setFocusable(true);
        diVar.setLayoutParams(new f2.a1(-2, -1));
        return new ik0(diVar);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
    }
}
