package bi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class kb extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final oa E;
    public boolean F;
    public org.telegram.ui.ActionBar.d2 G;
    public long H;
    public String I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public float O;
    public ValueAnimator P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public final /* synthetic */ rb W;
    public int a;
    public final a0.i b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final vl0 f;
    public final s4.c0 h;
    public final gb n;
    public final ib r;
    public final View s;
    public final d v;
    public final d w;
    public final db x;
    public final org.telegram.ui.Cells.u3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(rb rbVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var6;
        org.telegram.ui.ActionBar.f6 f6Var7;
        org.telegram.ui.ActionBar.f6 f6Var8;
        org.telegram.ui.ActionBar.f6 f6Var9;
        this.W = rbVar;
        this.b = new a0.i();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, f6Var);
        this.y = u3Var;
        f6Var2 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        db dbVar = new db(this, context, f6Var2, new sa(this, 4));
        this.x = dbVar;
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        dbVar.setBackgroundColor(rbVar.getThemedColor(i12));
        dbVar.setOnSearchTextChange(new ta(this, 3));
        f6Var3 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        oa oaVar = new oa(context, f6Var3);
        this.E = oaVar;
        oaVar.h = new sa(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        f6Var4 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        vl0 vl0Var = new vl0(context, f6Var4);
        this.f = vl0Var;
        vl0Var.setClipToPadding(false);
        vl0Var.setTranslateSelector(true);
        f6Var5 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        gb gbVar = new gb(this, context, f6Var5, dbVar, new ra(rbVar, 1));
        this.n = gbVar;
        vl0Var.setAdapter(gbVar);
        gbVar.h = vl0Var;
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        vl0Var.setLayoutManager(c0Var);
        int i13 = 0;
        vl0Var.setOnScrollListener(new eb(this, i13));
        vl0Var.setOnItemClickListener(new cb(i13, this, context));
        frameLayout.addView(vl0Var, w7.a6.c(-1.0f, -1));
        fb fbVar = new fb(this);
        fbVar.n(350L);
        fbVar.o(wr.h);
        fbVar.C = false;
        fbVar.m = false;
        vl0Var.setItemAnimator(fbVar);
        frameLayout.addView(dbVar, w7.a6.e(-1, -2, 55));
        frameLayout.addView(u3Var, w7.a6.e(-1, 32, 55));
        addView(oaVar, w7.a6.e(-1, -2, 55));
        ib ibVar = new ib(this, context);
        this.r = ibVar;
        ibVar.setClickable(true);
        ibVar.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.h3) rbVar).backgroundPaddingLeft;
        int i14 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.h3) rbVar).backgroundPaddingLeft;
        ibVar.setPadding(i14, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        f6Var6 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        ibVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var6));
        f6Var7 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        d dVar = new d(context, f6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new qa(this, 0));
        dVar.e();
        ibVar.addView(dVar, w7.a6.q(-1, 48, 87));
        f6Var8 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        d dVar2 = new d(context, f6Var8, false);
        this.w = dVar2;
        dVar2.setOnClickListener(new qa(this, 1));
        dVar2.e();
        ibVar.addView(dVar2, w7.a6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        f6Var9 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var9));
        addView(view, w7.a6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(ibVar, w7.a6.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.h3) this.W).currentAccount;
        arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
        int i11 = 0;
        while (true) {
            a0.i iVar = this.b;
            if (i11 >= iVar.m()) {
                break;
            }
            long j3 = iVar.j(i11);
            if (!((Boolean) iVar.n(i11)).booleanValue()) {
                arrayList.remove(Long.valueOf(j3));
            } else if (!arrayList.contains(Long.valueOf(j3))) {
                arrayList.add(Long.valueOf(j3));
            }
            i11++;
        }
        if (z10) {
            g(true);
            e(true);
            f(true);
        }
    }

    public final void b(int i10) {
        this.a = i10;
        this.b.b();
        ArrayList arrayList = this.c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        rb rbVar = this.W;
        if (i10 == 4) {
            arrayList.addAll(rbVar.d);
            hashMap.putAll(rbVar.e);
        } else if (i10 == 5) {
            arrayList.addAll(rbVar.J);
        } else if (i10 == 1) {
            ArrayList J0 = rb.J0(rbVar);
            for (int i11 = 0; i11 < J0.size(); i11 = com.google.android.gms.internal.vision.e2.f(((TLRPC.User) J0.get(i11)).id, arrayList, i11, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(rbVar.h);
        } else if (i10 == 3) {
            arrayList.addAll(rbVar.n);
            hashMap.putAll(rbVar.r);
        } else if (i10 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        i(false);
        db dbVar = this.x;
        dbVar.setText("");
        dbVar.setVisibility(i10 == 0 ? 8 : 0);
        dbVar.K = true;
        this.I = null;
        g(false);
        e(false);
        f(false);
        int i12 = this.a;
        vl0 vl0Var = this.f;
        if (i12 != 0) {
            vl0Var.u0(0);
        }
        vl0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -hc.b.g(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.x.J), 0);
        while (true) {
            vl0 vl0Var = this.f;
            if (i10 >= vl0Var.getChildCount()) {
                return f7;
            }
            View childAt = vl0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f7, childAt.getY());
            }
            i10++;
        }
    }

    public final void d(long j3, TLRPC.ChatParticipants chatParticipants) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int i12 = 0;
        boolean z10 = i11 == 1 || i11 == 2;
        rb rbVar = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j10 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000 && j10 != 0) {
                    if (!z10 || user.contact) {
                        arrayList.add(Long.valueOf(j10));
                    } else {
                        arrayList2.add(Long.valueOf(j10));
                    }
                    this.c.remove(Long.valueOf(j10));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j3), arrayList);
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                this.b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            i(true);
            e(true);
            f(true);
            this.x.K = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            f6Var2 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var2);
            alertDialog$Builder.a.T = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.o();
            return;
        }
        Context context2 = getContext();
        f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, f6Var);
        alertDialog$Builder2.a.T = arrayList2.size() + " members are not in your contact list";
        alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new bb(this, j3, arrayList, 0));
        alertDialog$Builder2.h("Cancel", null);
        alertDialog$Builder2.o();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.d2 d2Var;
        if (i10 != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (d2Var = this.G) == null || this.H != chatFull.id) {
            return;
        }
        d2Var.c(350L);
        this.G = null;
        this.H = -1L;
        d(chatFull.id, chatFull.participants);
    }

    public final void e(boolean z10) {
        int i10;
        int i11 = this.a;
        rb rbVar = this.W;
        d dVar = this.w;
        int i12 = 0;
        d dVar2 = this.v;
        if (i11 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.b(0, z10);
            if (rbVar.L) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (rbVar.Z) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i13 = rbVar.I;
                if (i13 == 1) {
                    dVar2.g(LocaleController.getString(rbVar.K ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z10, true);
                } else {
                    dVar2.g(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i13), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i11 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        ib ibVar = this.r;
        if (i11 == 3) {
            int size = rb.l1(arrayList, this.d).size();
            rbVar.s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            ibVar.b(size <= 0, z10);
            dVar2.b(size, z10);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i11 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.b(0, z10);
            } else {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z10, true);
                dVar2.b(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
            return;
        }
        if (i11 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        if (i11 != 6) {
            if (i11 == 4) {
                int size2 = rb.l1(rbVar.d, rbVar.e).size();
                rbVar.f = size2;
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.setShowZero(false);
                ibVar.b(false, z10);
                dVar2.b(size2, z10);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
        i10 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
        zh.i5 storiesController = MessagesController.getInstance(i10).getStoriesController();
        if (!storiesController.O) {
            while (true) {
                a0.i iVar = this.b;
                if (i12 >= iVar.m()) {
                    break;
                }
                long j3 = iVar.j(i12);
                ((Boolean) iVar.n(i12)).getClass();
                storiesController.L.contains(Long.valueOf(j3));
                i12++;
            }
        } else {
            dVar2.b(arrayList.size(), z10);
        }
        dVar.setVisibility(8);
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        rb rbVar = this.W;
        ArrayList arrayList2 = rbVar.J;
        HashMap hashMap = rbVar.r;
        ArrayList arrayList3 = rbVar.n;
        ArrayList arrayList4 = rbVar.h;
        HashMap hashMap2 = rbVar.e;
        ArrayList arrayList5 = rbVar.d;
        int i10 = this.a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.c;
        if (i10 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i10 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i10 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i10 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.a == 3 && (rbVar.N != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    rbVar.N = i11;
                }
            } else {
                this.R = rbVar.N;
                rbVar.N = 3;
            }
        }
        HashSet l1 = rb.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            if (i12 >= arrayList.size()) {
                break;
            }
            pa paVar = (pa) arrayList.get(i12);
            if (paVar != null) {
                int i13 = paVar.i;
                if (i13 > 0) {
                    paVar.k = rbVar.N == i13;
                    paVar.l = false;
                } else {
                    TLRPC.User user = paVar.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        paVar.k = contains;
                        paVar.l = !contains && l1.contains(Long.valueOf(paVar.g.id));
                    } else {
                        TLRPC.Chat chat = paVar.h;
                        if (chat != null) {
                            paVar.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            paVar.l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            vl0 vl0Var = this.f;
            if (i14 >= vl0Var.getChildCount()) {
                h(z10);
                return;
            }
            View childAt = vl0Var.getChildAt(i14);
            if ((childAt instanceof qb) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                pa paVar2 = (pa) arrayList.get(R);
                qb qbVar = (qb) childAt;
                qbVar.c(paVar2.k || paVar2.l, z10);
                TLRPC.Chat chat2 = paVar2.h;
                if (chat2 != null) {
                    qbVar.b(rb.d1(rbVar, chat2) > 200 ? 0.3f : 1.0f, z10);
                } else {
                    if (paVar2.l && !paVar2.k) {
                        r8 = 0.5f;
                    }
                    qbVar.b(r8, z10);
                }
            }
            i14++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0bdf  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0498  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z10) {
        float dp;
        float dp2;
        gb gbVar;
        boolean z11;
        int i10;
        float dp3;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        boolean z15;
        boolean containsKey;
        int i14;
        int i15;
        boolean z16;
        boolean z17;
        int i16;
        int i17;
        int i18;
        String formatPluralString;
        float f7;
        boolean z18;
        pa paVar;
        boolean z19;
        String formatPluralString2;
        int i19;
        long clientUserId;
        pa paVar2;
        String formatPluralString3;
        int i20;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        rb rbVar = this.W;
        ArrayList arrayList = rbVar.n;
        ArrayList arrayList2 = rbVar.d;
        ArrayList arrayList3 = rbVar.h;
        HashSet hashSet = rbVar.v;
        ArrayList arrayList4 = this.K;
        arrayList4.clear();
        ArrayList arrayList5 = this.L;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        int i26 = this.a;
        org.telegram.ui.Cells.u3 u3Var = this.y;
        if (i26 != 0) {
            oa oaVar = this.E;
            if (i26 == 1) {
                oaVar.e(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                oaVar.d(true);
                ((org.telegram.ui.ActionBar.i2) oaVar.e).c(0.0f, false);
                arrayList5.add(pa.d());
                arrayList5.add(pa.c());
                arrayList5.size();
                arrayList5.add(pa.e());
                arrayList5.add(pa.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                h(z10);
                this.F = true;
            } else if (i26 == 2) {
                oaVar.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                oaVar.d(true);
                ((org.telegram.ui.ActionBar.i2) oaVar.e).c(0.0f, false);
                arrayList5.add(pa.d());
                arrayList5.add(pa.c());
                arrayList5.size();
                arrayList5.add(pa.e());
                arrayList5.add(pa.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                h(z10);
                this.F = true;
            } else if (i26 == 3) {
                oaVar.e(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                oaVar.d(true);
                ((org.telegram.ui.ActionBar.i2) oaVar.e).c(0.0f, false);
                arrayList5.add(pa.d());
                arrayList5.add(pa.c());
                arrayList5.size();
                arrayList5.add(pa.e());
                arrayList5.add(pa.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                h(z10);
                this.F = true;
            } else if (i26 == 5) {
                oaVar.e(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                oaVar.d(rbVar.O);
                ((org.telegram.ui.ActionBar.i2) oaVar.e).c(0.0f, false);
                arrayList5.add(pa.d());
                arrayList5.add(pa.c());
                arrayList5.size();
                arrayList5.add(pa.e());
                arrayList5.add(pa.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                h(z10);
                this.F = true;
            } else if (i26 == 6) {
                oaVar.e(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                oaVar.d(true);
                ((org.telegram.ui.ActionBar.i2) oaVar.e).c(0.0f, false);
                arrayList5.add(pa.d());
                arrayList5.add(pa.c());
                arrayList5.size();
                arrayList5.add(pa.e());
                arrayList5.add(pa.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                h(z10);
                this.F = true;
            } else if (i26 == 4) {
                oaVar.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                oaVar.d(true);
                ((org.telegram.ui.ActionBar.i2) oaVar.e).c(0.0f, false);
                arrayList5.add(pa.d());
                arrayList5.add(pa.c());
                arrayList5.size();
                arrayList5.add(pa.e());
                arrayList5.add(pa.f());
                dp = AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(32.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                h(z10);
                this.F = true;
                boolean isEmpty = TextUtils.isEmpty(this.I);
                if (this.a != 0) {
                    String lowerCase = AndroidUtilities.translitSafe(this.I).toLowerCase();
                    int i27 = this.a;
                    ArrayList Y0 = i27 == 5 ? rb.Y0(rbVar) : rb.Z0(rbVar, i27 == 1 || i27 == 2, rbVar.Y && (i27 == 3 || i27 == 6));
                    ArrayList arrayList6 = this.c;
                    HashMap hashMap = this.d;
                    HashSet l1 = rb.l1(arrayList6, hashMap);
                    ArrayList arrayList7 = this.J;
                    if (isEmpty) {
                        if (!z10) {
                            arrayList7.clear();
                            int i28 = 0;
                            while (i28 < Y0.size()) {
                                TLObject tLObject = (TLObject) Y0.get(i28);
                                if (tLObject instanceof TLRPC.User) {
                                    z15 = isEmpty;
                                    containsKey = arrayList6.contains(Long.valueOf(((TLRPC.User) tLObject).id));
                                } else {
                                    z15 = isEmpty;
                                    containsKey = tLObject instanceof TLRPC.Chat ? hashMap.containsKey(Long.valueOf(((TLRPC.Chat) tLObject).id)) : false;
                                }
                                if (containsKey) {
                                    arrayList7.add(tLObject);
                                }
                                i28++;
                                isEmpty = z15;
                            }
                        }
                        z11 = isEmpty;
                        int i29 = 0;
                        int i30 = 0;
                        while (i29 < arrayList7.size()) {
                            TLObject tLObject2 = (TLObject) arrayList7.get(i29);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) tLObject2;
                                boolean contains = arrayList6.contains(Long.valueOf(user.id));
                                i12 = i29;
                                i13 = i30;
                                pa i31 = pa.i(user, contains, !contains && l1.contains(Long.valueOf(user.id)));
                                int i32 = this.a;
                                i31.m = i32 == 2 || i32 == 4;
                                arrayList5.add(i31);
                                dp += AndroidUtilities.dp(56.0f);
                            } else {
                                i12 = i29;
                                i13 = i30;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey2 = hashMap.containsKey(Long.valueOf(chat.id));
                                    float f10 = dp;
                                    pa paVar3 = new pa(3, true);
                                    paVar3.h = chat;
                                    paVar3.k = containsKey2;
                                    int i33 = this.a;
                                    paVar3.m = i33 == 2 || i33 == 4;
                                    arrayList5.add(paVar3);
                                    dp = f10 + AndroidUtilities.dp(56.0f);
                                } else {
                                    i30 = i13;
                                    i29 = i12 + 1;
                                }
                            }
                            i30 = i13 + 1;
                            i29 = i12 + 1;
                        }
                        i10 = i30;
                    } else {
                        z11 = isEmpty;
                        i10 = 0;
                    }
                    int i34 = 0;
                    while (i34 < Y0.size()) {
                        TLObject tLObject3 = (TLObject) Y0.get(i34);
                        if (z11 && arrayList7.contains(tLObject3)) {
                            i11 = i34;
                        } else {
                            if (!TextUtils.isEmpty(lowerCase)) {
                                if (tLObject3 instanceof TLRPC.User) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject3;
                                    String lowerCase2 = AndroidUtilities.translitSafe(UserObject.getUserName(user2)).toLowerCase();
                                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.a2.w(" ", lowerCase, lowerCase2)) {
                                        String lowerCase3 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user2)).toLowerCase();
                                        if (!lowerCase3.startsWith(lowerCase) && !org.telegram.messenger.a2.w(" ", lowerCase, lowerCase3)) {
                                            ArrayList<TLRPC.TL_username> arrayList8 = user2.usernames;
                                            if (arrayList8 != null) {
                                                int i35 = 0;
                                                while (i35 < arrayList8.size()) {
                                                    TLRPC.TL_username tL_username = arrayList8.get(i35);
                                                    i11 = i34;
                                                    if (tL_username.active && AndroidUtilities.translitSafe(tL_username.username).toLowerCase().startsWith(lowerCase)) {
                                                        z13 = true;
                                                        break;
                                                    } else {
                                                        i35++;
                                                        i34 = i11;
                                                    }
                                                }
                                            }
                                            i11 = i34;
                                            z13 = false;
                                        }
                                    }
                                } else {
                                    i11 = i34;
                                    if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                        String lowerCase4 = AndroidUtilities.translitSafe(chat2.title).toLowerCase();
                                        if (!lowerCase4.startsWith(lowerCase) && !org.telegram.messenger.a2.w(" ", lowerCase, lowerCase4)) {
                                            String lowerCase5 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat2)).toLowerCase();
                                            if (!lowerCase5.startsWith(lowerCase) && !org.telegram.messenger.a2.w(" ", lowerCase, lowerCase5)) {
                                                ArrayList<TLRPC.TL_username> arrayList9 = chat2.usernames;
                                                if (arrayList9 != null) {
                                                    for (int i36 = 0; i36 < arrayList9.size(); i36++) {
                                                        TLRPC.TL_username tL_username2 = arrayList9.get(i36);
                                                        if (!tL_username2.active || !AndroidUtilities.translitSafe(tL_username2.username).toLowerCase().startsWith(lowerCase)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z13 = true;
                                        break;
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    if (tLObject3 instanceof TLRPC.User) {
                                        TLRPC.User user3 = (TLRPC.User) tLObject3;
                                        boolean contains2 = arrayList6.contains(Long.valueOf(user3.id));
                                        pa i37 = pa.i(user3, contains2, !contains2 && l1.contains(Long.valueOf(user3.id)));
                                        int i38 = this.a;
                                        i37.m = i38 == 2 || i38 == 4;
                                        arrayList5.add(i37);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                    } else if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat3 = (TLRPC.Chat) tLObject3;
                                        boolean containsKey3 = hashMap.containsKey(Long.valueOf(chat3.id));
                                        pa paVar4 = new pa(3, true);
                                        paVar4.h = chat3;
                                        paVar4.k = containsKey3;
                                        int i39 = this.a;
                                        if (i39 != 2 && i39 != 4) {
                                            z14 = false;
                                            paVar4.m = z14;
                                            arrayList5.add(paVar4);
                                            dp += AndroidUtilities.dp(56.0f);
                                            i10++;
                                            i34 = i11 + 1;
                                        }
                                        z14 = true;
                                        paVar4.m = z14;
                                        arrayList5.add(paVar4);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                        i34 = i11 + 1;
                                    }
                                }
                            }
                            i11 = i34;
                            z13 = true;
                            if (z13) {
                            }
                        }
                        i34 = i11 + 1;
                    }
                    if (!z11) {
                        if (i10 == 0) {
                            arrayList5.add(new pa(5, false));
                            dp += AndroidUtilities.dp(150.0f);
                        }
                        vl0 vl0Var = this.f;
                        if (vl0Var != null) {
                            int measuredHeight = (vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop()) - vl0Var.getPaddingBottom();
                            z12 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                            dp3 = measuredHeight + (z12 ? this.T : 0);
                        } else {
                            dp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        float f11 = dp3 - dp;
                        if (f11 > 0.0f) {
                            pa paVar5 = new pa(-1, false);
                            paVar5.p = (int) f11;
                            arrayList5.add(paVar5);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList5);
                }
                gbVar = this.n;
                if (gbVar != null) {
                    if (!z10 || rbVar.N == 0) {
                        gbVar.l();
                    } else {
                        gbVar.E(arrayList4, arrayList5);
                    }
                }
                this.e.invalidate();
            }
            dp = dp2;
            boolean isEmpty2 = TextUtils.isEmpty(this.I);
            if (this.a != 0) {
            }
            if (this.h.t) {
            }
            gbVar = this.n;
            if (gbVar != null) {
            }
            this.e.invalidate();
        }
        this.F = false;
        u3Var.setVisibility(8);
        i14 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
        ArrayList arrayList10 = MessagesController.getInstance(i14).getStoriesController().T;
        pa paVar6 = new pa(-1, false);
        paVar6.o = 24;
        arrayList5.add(paVar6);
        if (rbVar.L) {
            String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
            pa paVar7 = new pa(11, false);
            paVar7.e = string;
            arrayList5.add(paVar7);
            paVar6.o = AndroidUtilities.dp(72.0f) + paVar6.o;
        } else if (rbVar.F && (rbVar.Z || arrayList10 == null || arrayList10.size() <= 1)) {
            String string2 = rbVar.Z ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(rbVar.K ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
            if (rbVar.K) {
                formatPluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
            } else {
                int i40 = rbVar.Q;
                formatPluralString = i40 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i40 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
            }
            pa paVar8 = new pa(4, false);
            paVar8.e = string2;
            paVar8.f = formatPluralString;
            arrayList5.add(paVar8);
            paVar6.o = AndroidUtilities.dp(72.0f) + paVar6.o;
        } else {
            String string3 = LocaleController.getString(rbVar.K ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
            pa paVar9 = new pa(8, false);
            paVar9.e = string3;
            arrayList5.add(paVar9);
            paVar6.o = AndroidUtilities.dp(50.0f) + paVar6.o;
            TLRPC.InputPeer inputPeer = rbVar.c;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                i15 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                pa i41 = pa.i(UserConfig.getInstance(i15).getCurrentUser(), false, false);
                i41.n = true;
                arrayList5.add(i41);
                paVar6.o = AndroidUtilities.dp(62.0f) + paVar6.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                i18 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                pa i42 = pa.i(MessagesController.getInstance(i18).getUser(Long.valueOf(rbVar.c.user_id)), false, false);
                i42.n = true;
                arrayList5.add(i42);
                paVar6.o = AndroidUtilities.dp(62.0f) + paVar6.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    i17 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(rbVar.c.channel_id));
                    pa paVar10 = new pa(3, true);
                    paVar10.h = chat4;
                    paVar10.k = false;
                    paVar10.n = true;
                    arrayList5.add(paVar10);
                    z17 = ChatObject.isChannelAndNotMegaGroup(chat4);
                    paVar6.o = AndroidUtilities.dp(104.0f) + paVar6.o;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    i16 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i16).getChat(Long.valueOf(rbVar.c.chat_id));
                    pa paVar11 = new pa(3, true);
                    paVar11.h = chat5;
                    paVar11.k = false;
                    paVar11.n = true;
                    arrayList5.add(paVar11);
                    paVar6.o = AndroidUtilities.dp(104.0f) + paVar6.o;
                    z17 = false;
                }
                z16 = false;
                pa g10 = pa.g(null);
                g10.c = !z16 ? 1 : 2;
                arrayList5.add(g10);
                paVar6.o = AndroidUtilities.dp(12.0f) + paVar6.o;
                if (z16) {
                    String string4 = LocaleController.getString(rbVar.K ? R.string.StoryLivePrivacyWhoCanView : R.string.StoryPrivacyWhoCanView);
                    pa paVar12 = new pa(8, false);
                    paVar12.e = string4;
                    arrayList5.add(paVar12);
                    paVar6.o = AndroidUtilities.dp(40.0f) + paVar6.o;
                }
                if (z16 || rbVar.L) {
                    f7 = 80.0f;
                } else {
                    pa h = pa.h(4, rbVar.f, rbVar.N == 4);
                    arrayList5.add(h);
                    paVar6.o = AndroidUtilities.dp(56.0f) + paVar6.o;
                    f7 = 80.0f;
                    if (rbVar.f == 1) {
                        if (arrayList2.size() != 1) {
                            Iterator it = rbVar.e.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList11 = (ArrayList) it.next();
                                if (arrayList11.size() >= 1) {
                                    i24 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                    h.g = MessagesController.getInstance(i24).getUser((Long) arrayList11.get(0));
                                    break;
                                }
                            }
                        } else {
                            i25 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                            h.g = MessagesController.getInstance(i25).getUser((Long) arrayList2.get(0));
                        }
                    }
                    pa h10 = pa.h(2, arrayList3.size(), rbVar.N == 2);
                    arrayList5.add(h10);
                    paVar6.o = AndroidUtilities.dp(56.0f) + paVar6.o;
                    if (arrayList3.size() == 1) {
                        i23 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                        h10.g = MessagesController.getInstance(i23).getUser((Long) arrayList3.get(0));
                    }
                    ArrayList J0 = rb.J0(rbVar);
                    pa h11 = pa.h(1, J0.size(), rbVar.N == 1);
                    arrayList5.add(h11);
                    paVar6.o = AndroidUtilities.dp(56.0f) + paVar6.o;
                    if (J0.size() == 1 && (J0.get(0) instanceof TLRPC.User)) {
                        h11.g = (TLRPC.User) J0.get(0);
                    }
                    pa h12 = pa.h(3, rbVar.s, rbVar.N == 3);
                    arrayList5.add(h12);
                    paVar6.o = AndroidUtilities.dp(56.0f) + paVar6.o;
                    if (rbVar.s == 1) {
                        if (arrayList.size() != 1) {
                            Iterator it2 = rbVar.r.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList12 = (ArrayList) it2.next();
                                if (arrayList12.size() >= 1) {
                                    i21 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                    h12.g = MessagesController.getInstance(i21).getUser((Long) arrayList12.get(0));
                                    break;
                                }
                            }
                        } else {
                            i22 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                            h12.g = MessagesController.getInstance(i22).getUser((Long) arrayList.get(0));
                        }
                    }
                    i20 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                    int i43 = MessagesController.getInstance(i20).getStoriesController().N;
                    String string5 = i43 <= 0 ? LocaleController.getString(rbVar.K ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(rbVar.K ? "StoryLiveBlockList" : "StoryBlockList", i43, new Object[0]);
                    int i44 = org.telegram.ui.ActionBar.j6.gc;
                    sa saVar = new sa(this, 3);
                    f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                    arrayList5.add(pa.g(AndroidUtilities.replaceSingleTag(string5, i44, 0, saVar, f6Var)));
                    paVar6.o = AndroidUtilities.dp(80.0f) + paVar6.o;
                }
                if (!rbVar.Z) {
                    if (rbVar.K && !rbVar.L) {
                        if (rbVar.G) {
                            arrayList5.add(pa.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                            paVar6.o = AndroidUtilities.dp(50.0f) + paVar6.o;
                            arrayList5.add(pa.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                            paVar6.o = AndroidUtilities.dp(50.0f) + paVar6.o;
                            arrayList5.add(pa.g(null));
                            paVar6.o = AndroidUtilities.dp(12.0f) + paVar6.o;
                        } else {
                            arrayList5.add(pa.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                            paVar6.o = AndroidUtilities.dp(50.0f) + paVar6.o;
                            arrayList5.add(pa.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            paVar6.o = AndroidUtilities.dp(30.0f) + paVar6.o;
                        }
                    }
                    if (rbVar.K) {
                        String string6 = LocaleController.getString(R.string.StoryLiveAllowComments);
                        boolean z20 = rbVar.w;
                        pa paVar13 = new pa(7, false);
                        paVar13.c = 2;
                        paVar13.e = string6;
                        paVar13.k = z20;
                        arrayList5.add(paVar13);
                        paVar6.o = AndroidUtilities.dp(50.0f) + paVar6.o;
                    }
                    if (!rbVar.L) {
                        String string7 = LocaleController.getString(R.string.StoryAllowScreenshots);
                        boolean z21 = rbVar.x;
                        pa paVar14 = new pa(7, false);
                        paVar14.c = 0;
                        paVar14.e = string7;
                        paVar14.k = z21;
                        arrayList5.add(paVar14);
                        paVar6.o = AndroidUtilities.dp(50.0f) + paVar6.o;
                    }
                    if (!rbVar.K && !rbVar.L) {
                        String string8 = LocaleController.getString(z16 ? R.string.StoryKeep : z17 ? R.string.StoryKeepChannel : R.string.StoryKeepGroup);
                        boolean z22 = rbVar.y;
                        pa paVar15 = new pa(7, false);
                        paVar15.c = 1;
                        paVar15.e = string8;
                        paVar15.k = z22;
                        arrayList5.add(paVar15);
                        paVar6.o = AndroidUtilities.dp(50.0f) + paVar6.o;
                    }
                }
                z18 = rbVar.K;
                String str = "StoryKeepGroupInfo";
                if (!z18 || rbVar.L) {
                    arrayList5.add(pa.g(null));
                    paVar6.o = AndroidUtilities.dp(12.0f) + paVar6.o;
                } else if (!rbVar.Z && rbVar.E && rbVar.c0 != null) {
                    if (z18) {
                        formatPluralString3 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    } else {
                        String str2 = z16 ? "StoryKeepInfo" : z17 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i45 = rbVar.Q;
                        if (i45 == Integer.MAX_VALUE) {
                            i45 = 86400;
                        }
                        formatPluralString3 = LocaleController.formatPluralString(str2, i45 / 3600, new Object[0]);
                    }
                    arrayList5.add(pa.g(formatPluralString3));
                    paVar6.o = AndroidUtilities.dp(f7) + paVar6.o;
                }
                if (rbVar.y || rbVar.K || rbVar.L) {
                    paVar = paVar6;
                } else {
                    TLRPC.InputPeer inputPeer2 = rbVar.c;
                    if (inputPeer2 != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    } else {
                        i19 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                        clientUserId = UserConfig.getInstance(i19).getClientUserId();
                    }
                    long j3 = clientUserId;
                    rbVar.i1().B(j3, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                        paVar2 = paVar6;
                    } else {
                        paVar2 = paVar6;
                        if (hashSet.size() < 3) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                zh.b5 b10 = rbVar.i1().B(j3, true).b(((Integer) it3.next()).intValue());
                                if (b10 != null) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(b10.b);
                                }
                                it3 = it4;
                            }
                        } else {
                            sb2.append(LocaleController.formatPluralString("StoriesAlbumCount", hashSet.size(), new Object[0]));
                        }
                    }
                    arrayList5.add(pa.b(LocaleController.getString(R.string.StoriesAlbum), sb2, 1));
                    paVar = paVar2;
                    paVar.o = AndroidUtilities.dp(50.0f) + paVar.o;
                }
                if (!rbVar.Z && ((!rbVar.E || rbVar.c0 == null) && !(z19 = rbVar.K) && !rbVar.L)) {
                    if (z19) {
                        if (z16) {
                            str = "StoryKeepInfo";
                        } else if (z17) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i46 = rbVar.Q;
                        if (i46 == Integer.MAX_VALUE) {
                            i46 = 86400;
                        }
                        formatPluralString2 = LocaleController.formatPluralString(str, i46 / 3600, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    }
                    arrayList5.add(pa.g(formatPluralString2));
                    paVar.o = AndroidUtilities.dp(f7) + paVar.o;
                }
                if (rbVar.y && rbVar.E && rbVar.c0 != null) {
                    String string9 = LocaleController.getString(R.string.StoryEditCover);
                    BitmapDrawable bitmapDrawable = rbVar.b0;
                    pa paVar16 = new pa(9, false);
                    paVar16.e = string9;
                    paVar16.d = bitmapDrawable;
                    paVar16.q = 0;
                    arrayList5.add(paVar16);
                    paVar.o = AndroidUtilities.dp(50.0f) + paVar.o;
                    arrayList5.add(pa.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    paVar.o = AndroidUtilities.dp(72.0f) + paVar.o;
                }
                if (rbVar.L) {
                    arrayList5.add(pa.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                    paVar.o = AndroidUtilities.dp(50.0f) + paVar.o;
                    arrayList5.add(pa.g(null));
                    paVar.o = AndroidUtilities.dp(52.0f) + paVar.o;
                }
                if (rbVar.K && rbVar.w) {
                    String string10 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                    pa paVar17 = new pa(8, false);
                    paVar17.e = string10;
                    arrayList5.add(paVar17);
                    paVar.o = AndroidUtilities.dp(40.0f) + paVar.o;
                    pa paVar18 = new pa(10, false);
                    paVar18.q = 8;
                    arrayList5.add(paVar18);
                    paVar.o = AndroidUtilities.dp(75.0f) + paVar.o;
                    arrayList5.add(pa.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    paVar.o = AndroidUtilities.dp(50.0f) + paVar.o;
                }
            }
            z17 = false;
            z16 = true;
            pa g102 = pa.g(null);
            g102.c = !z16 ? 1 : 2;
            arrayList5.add(g102);
            paVar6.o = AndroidUtilities.dp(12.0f) + paVar6.o;
            if (z16) {
            }
            if (z16) {
            }
            f7 = 80.0f;
            if (!rbVar.Z) {
            }
            z18 = rbVar.K;
            String str3 = "StoryKeepGroupInfo";
            if (z18) {
            }
            arrayList5.add(pa.g(null));
            paVar6.o = AndroidUtilities.dp(12.0f) + paVar6.o;
            if (rbVar.y) {
            }
            paVar = paVar6;
            if (!rbVar.Z) {
                if (z19) {
                }
                arrayList5.add(pa.g(formatPluralString2));
                paVar.o = AndroidUtilities.dp(f7) + paVar.o;
            }
            if (rbVar.y) {
                String string92 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable2 = rbVar.b0;
                pa paVar162 = new pa(9, false);
                paVar162.e = string92;
                paVar162.d = bitmapDrawable2;
                paVar162.q = 0;
                arrayList5.add(paVar162);
                paVar.o = AndroidUtilities.dp(50.0f) + paVar.o;
                arrayList5.add(pa.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                paVar.o = AndroidUtilities.dp(72.0f) + paVar.o;
            }
            if (rbVar.L) {
            }
            if (rbVar.K) {
                String string102 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                pa paVar172 = new pa(8, false);
                paVar172.e = string102;
                arrayList5.add(paVar172);
                paVar.o = AndroidUtilities.dp(40.0f) + paVar.o;
                pa paVar182 = new pa(10, false);
                paVar182.q = 8;
                arrayList5.add(paVar182);
                paVar.o = AndroidUtilities.dp(75.0f) + paVar.o;
                arrayList5.add(pa.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                paVar.o = AndroidUtilities.dp(50.0f) + paVar.o;
            }
        }
        z17 = false;
        z16 = true;
        if (z16) {
        }
        f7 = 80.0f;
        if (!rbVar.Z) {
        }
        z18 = rbVar.K;
        String str32 = "StoryKeepGroupInfo";
        if (z18) {
        }
        arrayList5.add(pa.g(null));
        paVar6.o = AndroidUtilities.dp(12.0f) + paVar6.o;
        if (rbVar.y) {
        }
        paVar = paVar6;
        if (!rbVar.Z) {
        }
        if (rbVar.y) {
        }
        if (rbVar.L) {
        }
        if (rbVar.K) {
        }
        dp = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.I);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        gbVar = this.n;
        if (gbVar != null) {
        }
        this.e.invalidate();
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.u3 u3Var = this.y;
        if (u3Var == null) {
            return;
        }
        if (rb.l1(this.c, this.d).size() > 0) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new qa(this, 2));
            return;
        }
        if (z10) {
            u3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.t3 t3Var = u3Var.b;
        t3Var.c(null, false, true);
        t3Var.setOnClickListener(null);
        t3Var.setVisibility(0);
    }

    public final void i(boolean z10) {
        int i10;
        db dbVar;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        org.telegram.ui.ActionBar.f6 f6Var;
        HashSet l1 = rb.l1(this.c, this.d);
        int i11 = this.a;
        rb rbVar = this.W;
        if (i11 == 3) {
            rbVar.s = l1.size();
        } else if (i11 == 4) {
            rbVar.f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            dbVar = this.x;
            ArrayList arrayList4 = dbVar.d;
            arrayList = dbVar.d;
            if (i13 >= arrayList4.size()) {
                break;
            }
            w30 w30Var = (w30) arrayList.get(i13);
            if (!l1.contains(Long.valueOf(w30Var.getUid()))) {
                arrayList2.add(w30Var);
            }
            i13++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    Object user = longValue >= 0 ? messagesController.getUser(l4) : messagesController.getChat(l4);
                    if (user != null) {
                        Context context = getContext();
                        f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                        w30 w30Var2 = new w30(context, user, null, true, f6Var);
                        w30Var2.setOnClickListener(this);
                        arrayList3.add(w30Var2);
                    }
                } else if (((w30) arrayList.get(i14)).getUid() == longValue) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        nb nbVar = dbVar.c;
        ArrayList arrayList5 = nbVar.e;
        ArrayList arrayList6 = nbVar.d;
        ArrayList arrayList7 = nbVar.f;
        ob obVar = (ob) nbVar.n;
        obVar.G = true;
        ArrayList arrayList8 = obVar.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = nbVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            ((w30) arrayList2.get(i15)).setOnClickListener(null);
        }
        nbVar.c();
        if (z10) {
            nbVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nbVar.b = animatorSet;
            animatorSet.addListener(new mb(nbVar, arrayList2, i12));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i16 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i16 >= size) {
                    break;
                }
                w30 w30Var3 = (w30) arrayList2.get(i16);
                arrayList5.add(w30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(w30Var3, (Property<w30, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(w30Var3, (Property<w30, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(w30Var3, (Property<w30, Float>) property, 1.0f, 0.0f));
                i16++;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                w30 w30Var4 = (w30) arrayList3.get(i17);
                arrayList6.add(w30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(w30Var4, (Property<w30, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(w30Var4, (Property<w30, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(w30Var4, (Property<w30, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                nbVar.removeView((View) arrayList2.get(i18));
            }
            arrayList9.clear();
            nbVar.b = null;
            nbVar.c = false;
            obVar.a.setAllowDrawCursor(true);
        }
        while (i12 < arrayList3.size()) {
            nbVar.addView((View) arrayList3.get(i12));
            i12++;
        }
        nbVar.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        db dbVar = this.x;
        if (z10 || this.U || getTranslationX() != 0.0f) {
            this.N = false;
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.P = null;
            }
            dbVar.setTranslationY(c10);
        } else if (!this.N || Math.abs(this.O - c10) > 1.0f) {
            this.N = true;
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.P = null;
            }
            float translationY = dbVar.getTranslationY();
            this.O = c10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 11));
            this.P.addListener(new h(this, 7));
            this.P.setInterpolator(new LinearInterpolator());
            this.P.setDuration(180L);
            this.P.start();
        }
        boolean z12 = this.F;
        oa oaVar = this.E;
        if (!z12) {
            oaVar.setVisibility(8);
            return;
        }
        oaVar.setVisibility(0);
        float f7 = -oaVar.getHeight();
        int i10 = 0;
        while (true) {
            vl0 vl0Var = this.f;
            if (i10 >= vl0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = vl0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f7 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i10++;
        }
        if (this.Q != z11) {
            this.Q = z11;
            ((org.telegram.ui.ActionBar.i2) oaVar.e).c((z11 || this.a != 0) ? 0.0f : 1.0f, true);
        }
        oaVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f7));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        db dbVar = this.x;
        if (!dbVar.d.contains(view)) {
            return;
        }
        w30 w30Var = (w30) view;
        if (!w30Var.y) {
            w30 w30Var2 = dbVar.e;
            if (w30Var2 != null) {
                w30Var2.a();
                dbVar.e = null;
            }
            dbVar.e = w30Var;
            w30Var.b();
            return;
        }
        dbVar.e = null;
        nb nbVar = dbVar.c;
        ob obVar = (ob) nbVar.n;
        obVar.G = true;
        obVar.d.remove(w30Var);
        w30Var.setOnClickListener(null);
        nbVar.c();
        nbVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        nbVar.b = animatorSet;
        animatorSet.addListener(new u3(3, nbVar, w30Var));
        ArrayList arrayList = nbVar.h;
        arrayList.clear();
        arrayList.add(w30Var);
        ArrayList arrayList2 = nbVar.d;
        arrayList2.clear();
        nbVar.e.clear();
        arrayList2.add(w30Var);
        ArrayList arrayList3 = nbVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.ALPHA, 1.0f, 0.0f));
        nbVar.requestLayout();
        long uid = w30Var.getUid();
        Iterator it = this.d.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList4 = this.c;
            if (!hasNext) {
                arrayList4.remove(Long.valueOf(uid));
                f(true);
                e(true);
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                    it.remove();
                    arrayList4.addAll((Collection) entry.getValue());
                    arrayList4.remove(Long.valueOf(uid));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i13;
        rb rbVar = this.W;
        i12 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardHeight;
        if (i12 > 0) {
            i13 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardHeight;
            this.T = i13;
        }
        super.onMeasure(i10, i11);
        this.e.setPadding(0, AndroidUtilities.statusBarHeight + (this.a == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
        boolean z17 = this.V;
        z10 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
        vl0 vl0Var = this.f;
        ib ibVar = this.r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
            int i14 = 2;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.x.J) > vl0Var.getPaddingTop()) {
                ii.o oVar = new ii.o(getContext(), 2, 0.7f);
                oVar.a = 1;
                oVar.p = -AndroidUtilities.dp(56.0f);
                this.h.w0(oVar);
            }
            int i15 = this.a;
            View view = this.s;
            if (i15 == 0) {
                z15 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                ibVar.setTranslationY(z15 ? this.T : 0.0f);
                z16 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                view.setTranslationY(z16 ? this.T : 0.0f);
            } else {
                z12 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                float f7 = z12 ? this.T : -this.T;
                ValueAnimator valueAnimator = ibVar.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ibVar.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                ibVar.d = ofFloat;
                ofFloat.addUpdateListener(new hb(ibVar, 1));
                ibVar.d.addListener(new h(ibVar, 8));
                ibVar.d.setDuration(250L);
                ValueAnimator valueAnimator2 = ibVar.d;
                wr wrVar = org.telegram.ui.ActionBar.r1.w;
                valueAnimator2.setInterpolator(wrVar);
                ibVar.d.start();
                z13 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                view.setTranslationY(z13 ? this.T : -this.T);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(wrVar).withEndAction(new sa(this, i14)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
            this.V = z14;
        }
        vl0Var.setPadding(0, 0, 0, ibVar.getMeasuredHeight());
    }
}
