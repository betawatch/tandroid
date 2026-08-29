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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ki extends il0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final /* synthetic */ ni F;
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

    public ki(ni niVar, Context context) {
        this.F = niVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        int i10 = this.E;
        ni niVar = this.F;
        return (niVar.D1 == null && (niVar.b0 instanceof org.telegram.ui.tn) && !niVar.D) ? MediaDataController.getInstance(niVar.F1).inlineBots.size() + i10 : i10;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 < this.E) {
            return (i10 < this.e || i10 >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // f2.p0
    public final void l() {
        int i10 = 0;
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
        ni niVar = this.F;
        int i11 = niVar.F1;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
        if (niVar.D) {
            this.E = 1;
            this.d = 0;
            int i12 = niVar.E;
            if (i12 == 0 || i7.n8.a(i12, 16)) {
                int i13 = this.E;
                this.E = i13 + 1;
                this.n = i13;
            }
            int i14 = niVar.E;
            if (i14 == 0 || i7.n8.a(i14, 8192)) {
                int i15 = this.E;
                this.E = i15 + 1;
                this.A = i15;
            }
            int i16 = niVar.E;
            if (i16 == 0 || i7.n8.a(i16, 16384)) {
                int i17 = this.E;
                this.E = i17 + 1;
                this.B = i17;
            }
            int i18 = niVar.E;
            if (i18 == 0 || i7.n8.a(i18, 8)) {
                int i19 = this.E;
                this.E = i19 + 1;
                this.r = i19;
            }
            int i20 = niVar.E;
            if (i20 == 0 || i7.n8.a(i20, 64)) {
                int i21 = this.E;
                this.E = i21 + 1;
                this.y = i21;
            }
            int i22 = niVar.E;
            if (i22 == 0 || i7.n8.a(i22, 32768)) {
                int i23 = this.E;
                this.E = i23 + 1;
                this.C = i23;
            }
        } else if (!(o2Var instanceof org.telegram.ui.tn)) {
            this.d = 0;
            this.E = 2;
            this.n = 1;
            if (niVar.S) {
                this.E = 3;
                this.r = 2;
            }
        } else if (niVar.D1 != null) {
            int i24 = niVar.C1;
            if (i24 == -1) {
                this.d = 0;
                this.n = 1;
                this.E = 3;
                this.r = 2;
            } else {
                if (i24 == 0) {
                    this.E = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.E;
                    this.E = i25 + 1;
                    this.n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.E;
                    this.E = i26 + 1;
                    this.r = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.tn) o2Var).i();
            TLRPC.Chat chat = o2Var instanceof org.telegram.ui.tn ? ((org.telegram.ui.tn) o2Var).e : null;
            boolean z10 = i27 != null && ((org.telegram.ui.tn) o2Var).getMessagesController().getSendPaidMessagesStars(i27.id) > 0;
            int i28 = this.E;
            this.E = i28 + 1;
            this.d = i28;
            if ((niVar.H1 || niVar.I1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (o2Var instanceof org.telegram.ui.tn) && !((org.telegram.ui.tn) o2Var).c() && !((org.telegram.ui.tn) o2Var).w())) {
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
                if (tnVar.N3 != 5) {
                    this.e = this.E;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = tnVar.e;
                            if (tLObject == null) {
                                tLObject = tnVar.i();
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
            int i29 = this.E;
            int i30 = i29 + 1;
            this.E = i30;
            this.n = i29;
            boolean z11 = niVar.M1;
            if (z11) {
                this.E = i29 + 2;
                this.y = i30;
            }
            if (z11 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.E;
                this.E = i31 + 1;
                this.D = i31;
            }
            if (niVar.K1) {
                int i32 = this.E;
                this.E = i32 + 1;
                this.s = i32;
            }
            if (niVar.L1) {
                int i33 = this.E;
                this.E = i33 + 1;
                this.v = i33;
            }
            if (niVar.M1) {
                int i34 = this.E;
                this.E = i34 + 1;
                this.w = i34;
            }
            if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).N3 == 0 && i27 != null && !z10 && !i27.bot && !sf.s1.f(i11).b.isEmpty()) {
                int i35 = this.E;
                this.E = i35 + 1;
                this.x = i35;
            }
            int i36 = this.E;
            this.E = i36 + 1;
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
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = this.F.F1;
        int i12 = n1Var.f;
        View view = n1Var.a;
        boolean z13 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            gi giVar = (gi) view;
            zg.b bVar = giVar.a;
            ni niVar = giVar.d;
            bVar.getClass();
            int i13 = this.e;
            if (i10 >= i13 && i10 < this.f) {
                int i14 = i10 - i13;
                giVar.setTag(Integer.valueOf(i14));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i14);
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
                if (user != null) {
                    zg.b bVar2 = giVar.a;
                    bVar2.getClass();
                    bVar2.y = null;
                    bVar2.A = tL_attachMenuBot;
                    bVar2.K = 0;
                    bVar2.L = 0L;
                    bVar2.a.setText(tL_attachMenuBot.short_name);
                    bVar2.c.setRoundRadius(0);
                    bVar2.c.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    bVar2.c.setLayoutParams(i7.f6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    bVar2.I = true;
                    bVar2.a(false);
                    bVar2.f();
                    bVar2.invalidate();
                    giVar.b = user;
                    giVar.c = tL_attachMenuBot;
                    giVar.a.e(false, false);
                    giVar.invalidate();
                    return;
                }
                return;
            }
            int i15 = i10 - this.E;
            giVar.setTag(Integer.valueOf(i15));
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(MediaDataController.getInstance(i11).inlineBots.get(i15).peer.user_id));
            if (user2 == null) {
                return;
            }
            zg.b bVar3 = giVar.a;
            int i16 = niVar.F1;
            bVar3.y = null;
            bVar3.A = null;
            bVar3.K = 0;
            bVar3.L = 0L;
            bVar3.a.setText(ContactsController.formatName(user2.first_name, user2.last_name));
            if (bVar3.Q == null) {
                bVar3.Q = new e9((org.telegram.ui.ActionBar.c6) null);
            }
            bVar3.Q.m(i16, user2);
            bVar3.c.e(user2, bVar3.Q);
            bVar3.c.s(-1, -1);
            bVar3.c.setRoundRadius(AndroidUtilities.dp(11.33f));
            bVar3.c.setLayoutParams(i7.f6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            bVar3.c.setColorFilter(null);
            bVar3.I = false;
            bVar3.invalidate();
            giVar.b = user2;
            giVar.c = null;
            giVar.a.e(false, false);
            giVar.invalidate();
            return;
        }
        hi hiVar = (hi) view;
        hiVar.a.getClass();
        int i17 = this.d;
        Context context = this.c;
        if (i10 == i17) {
            hiVar.a(1, LocaleController.getString(R.string.ChatGallery), zg.a.x);
            hiVar.setTag(1);
            int i18 = Build.VERSION.SDK_INT;
            z12 = i18 < 33 ? true : true;
        } else {
            if (i10 != this.n) {
                if (i10 == this.y) {
                    hiVar.a(6, LocaleController.getString(R.string.ChatLocation), zg.a.y);
                    hiVar.setTag(6);
                } else if (i10 == this.r) {
                    hiVar.a(3, LocaleController.getString(R.string.AttachMusic), zg.a.D);
                    hiVar.setTag(3);
                    int i19 = Build.VERSION.SDK_INT;
                    if (i19 >= 23) {
                    }
                } else if (i10 == this.s) {
                    hiVar.a(9, LocaleController.getString(R.string.Poll), zg.a.E);
                    hiVar.setTag(9);
                } else {
                    if (i10 != this.w) {
                        if (i10 == this.x) {
                            hiVar.a(11, LocaleController.getString(R.string.AttachQuickReplies), zg.a.G);
                            hiVar.setTag(11);
                        } else if (i10 == this.v) {
                            hiVar.a(12, LocaleController.getString(R.string.Todo), zg.a.s);
                            hiVar.setTag(12);
                        } else if (i10 == this.A) {
                            hiVar.a(13, LocaleController.getString(R.string.ChatSticker), zg.a.A);
                            hiVar.setTag(13);
                        } else if (i10 == this.C) {
                            hiVar.a(15, LocaleController.getString(R.string.ChatLink), zg.a.H);
                            hiVar.setTag(15);
                        } else if (i10 == this.B) {
                            hiVar.a(14, LocaleController.getString(R.string.ChatEmoji), zg.a.B);
                            hiVar.setTag(14);
                        } else if (i10 == this.D) {
                            hiVar.a(16, LocaleController.getString(R.string.AttachArticle), zg.a.I);
                            hiVar.setTag(16);
                            z10 = !MessagesController.getInstance(i11).storyEntitiesAllowed();
                            z11 = false;
                            hiVar.a.d(z11 ? "!" : null, z11, false);
                            zg.b bVar4 = hiVar.a;
                            if (z10 && !UserConfig.getInstance(i11).isPremium()) {
                                z13 = true;
                            }
                            bVar4.setPremiumBadge(z13);
                        }
                        z11 = false;
                        z10 = true;
                        hiVar.a.d(z11 ? "!" : null, z11, false);
                        zg.b bVar42 = hiVar.a;
                        if (z10) {
                            z13 = true;
                        }
                        bVar42.setPremiumBadge(z13);
                    }
                    hiVar.a(5, LocaleController.getString(R.string.AttachContact), zg.a.f);
                    hiVar.setTag(5);
                    if (Build.VERSION.SDK_INT >= 23) {
                    }
                }
                z11 = false;
                z10 = false;
                hiVar.a.d(z11 ? "!" : null, z11, false);
                zg.b bVar422 = hiVar.a;
                if (z10) {
                }
                bVar422.setPremiumBadge(z13);
            }
            hiVar.a(4, LocaleController.getString(R.string.ChatDocument), zg.a.w);
            hiVar.setTag(4);
            int i20 = Build.VERSION.SDK_INT;
            if (i20 < 33) {
            }
        }
        z11 = !z12;
        z10 = false;
        hiVar.a.d(z11 ? "!" : null, z11, false);
        zg.b bVar4222 = hiVar.a;
        if (z10) {
        }
        bVar4222.setPremiumBadge(z13);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        ni niVar = this.F;
        View giVar = i10 != 0 ? new gi(niVar, context) : new hi(niVar, context);
        giVar.setImportantForAccessibility(1);
        giVar.setFocusable(true);
        giVar.setLayoutParams(new f2.x0(-2, -1));
        return new vk0(giVar);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
    }
}
