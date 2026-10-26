package fi;

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
import bi.ce;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.x30;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class g9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final t8 E;
    public boolean F;
    public org.telegram.ui.ActionBar.e2 G;
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
    public final /* synthetic */ n9 W;
    public int a;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final mm0 f;
    public final s4.c0 h;
    public final c9 n;
    public final e9 r;
    public final View s;
    public final d v;
    public final d w;
    public final z8 x;
    public final org.telegram.ui.Cells.z3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(n9 n9Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        org.telegram.ui.ActionBar.u6 u6Var5;
        org.telegram.ui.ActionBar.u6 u6Var6;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var7;
        org.telegram.ui.ActionBar.u6 u6Var8;
        org.telegram.ui.ActionBar.u6 u6Var9;
        org.telegram.ui.ActionBar.u6 u6Var10;
        this.W = n9Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        u6Var = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(context, u6Var);
        this.y = z3Var;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        z8 z8Var = new z8(this, context, u6Var2, new w8(this, 4));
        this.x = z8Var;
        int i12 = org.telegram.ui.ActionBar.y6.h5;
        u6Var3 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i12, z8Var, u6Var3);
        z8Var.setOnSearchTextChange(new x8(this, 3));
        u6Var4 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        t8 t8Var = new t8(context, u6Var4);
        this.E = t8Var;
        t8Var.h = new w8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, gb1.i(-1, -1, 119));
        u6Var5 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        mm0 mm0Var = new mm0(context, u6Var5);
        this.f = mm0Var;
        mm0Var.setClipToPadding(false);
        mm0Var.setTranslateSelector(true);
        u6Var6 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        c9 c9Var = new c9(this, context, u6Var6, z8Var, new di.e4(n9Var, 2));
        this.n = c9Var;
        mm0Var.setAdapter(c9Var);
        c9Var.h = mm0Var;
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        mm0Var.setLayoutManager(c0Var);
        mm0Var.setOnScrollListener(new a9(0, this));
        mm0Var.setOnItemClickListener(new ai.f0(14, this, context));
        frameLayout.addView(mm0Var, gb1.g(-1.0f, -1));
        b9 b9Var = new b9(this);
        b9Var.n(350L);
        b9Var.o(ds.h);
        b9Var.C = false;
        b9Var.m = false;
        mm0Var.setItemAnimator(b9Var);
        frameLayout.addView(z8Var, gb1.i(-1, -2, 55));
        frameLayout.addView(z3Var, gb1.i(-1, 32, 55));
        addView(t8Var, gb1.i(-1, -2, 55));
        e9 e9Var = new e9(this, context);
        this.r = e9Var;
        e9Var.setClickable(true);
        e9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.k3) n9Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.k3) n9Var).backgroundPaddingLeft;
        e9Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        u6Var7 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i12, e9Var, u6Var7);
        u6Var8 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        d dVar = new d(context, u6Var8, true);
        this.v = dVar;
        dVar.setOnClickListener(new v8(this, 0));
        dVar.f();
        e9Var.addView(dVar, gb1.u(-1, 48, 87));
        u6Var9 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        d dVar2 = new d(context, u6Var9, false);
        this.w = dVar2;
        dVar2.setOnClickListener(new v8(this, 1));
        dVar2.f();
        e9Var.addView(dVar2, gb1.x(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        u6Var10 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i12, view, u6Var10);
        addView(view, gb1.h(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(e9Var, gb1.i(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.k3) this.W).currentAccount;
        arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
        int i11 = 0;
        while (true) {
            a0.h hVar = this.b;
            if (i11 >= hVar.m()) {
                break;
            }
            long j10 = hVar.j(i11);
            if (!((Boolean) hVar.n(i11)).booleanValue()) {
                arrayList.remove(Long.valueOf(j10));
            } else if (!arrayList.contains(Long.valueOf(j10))) {
                arrayList.add(Long.valueOf(j10));
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
        n9 n9Var = this.W;
        if (i10 == 4) {
            arrayList.addAll(n9Var.d);
            hashMap.putAll(n9Var.e);
        } else if (i10 == 5) {
            arrayList.addAll(n9Var.J);
        } else if (i10 == 1) {
            ArrayList K0 = n9.K0(n9Var);
            for (int i11 = 0; i11 < K0.size(); i11 = c3.h0.j(((TLRPC.User) K0.get(i11)).id, arrayList, i11, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(n9Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(n9Var.n);
            hashMap.putAll(n9Var.r);
        } else if (i10 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.l1(false);
        i(false);
        z8 z8Var = this.x;
        z8Var.setText("");
        z8Var.setVisibility(i10 == 0 ? 8 : 0);
        z8Var.L = true;
        this.I = null;
        g(false);
        e(false);
        f(false);
        int i12 = this.a;
        mm0 mm0Var = this.f;
        if (i12 != 0) {
            mm0Var.v0(0);
        }
        mm0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -org.telegram.messenger.t.c(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.x.K), 0);
        while (true) {
            mm0 mm0Var = this.f;
            if (i10 >= mm0Var.getChildCount()) {
                return f7;
            }
            View childAt = mm0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f7, childAt.getY());
            }
            i10++;
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int i12 = 0;
        boolean z10 = i11 == 1 || i11 == 2;
        n9 n9Var = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000 && j11 != 0) {
                    if (!z10 || user.contact) {
                        arrayList.add(Long.valueOf(j11));
                    } else {
                        arrayList2.add(Long.valueOf(j11));
                    }
                    this.c.remove(Long.valueOf(j11));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j10), arrayList);
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                this.b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            i(true);
            e(true);
            f(true);
            this.x.L = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            u6Var2 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var2);
            alertDialog$Builder.a.T = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.p();
            return;
        }
        Context context2 = getContext();
        u6Var = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, u6Var);
        alertDialog$Builder2.a.T = arrayList2.size() + " members are not in your contact list";
        alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new bi.i(this, j10, arrayList, 2));
        alertDialog$Builder2.h("Cancel", null);
        alertDialog$Builder2.p();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.e2 e2Var;
        if (i10 != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (e2Var = this.G) == null || this.H != chatFull.id) {
            return;
        }
        e2Var.c(350L);
        this.G = null;
        this.H = -1L;
        d(chatFull.id, chatFull.participants);
    }

    public final void e(boolean z10) {
        int i10;
        int i11 = this.a;
        n9 n9Var = this.W;
        d dVar = this.w;
        int i12 = 0;
        d dVar2 = this.v;
        if (i11 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.b(0, z10);
            if (n9Var.L) {
                dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (n9Var.Z) {
                dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i13 = n9Var.I;
                if (i13 == 1) {
                    dVar2.i(LocaleController.getString(n9Var.K ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z10, true);
                } else {
                    dVar2.i(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i13), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i11 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        e9 e9Var = this.r;
        if (i11 == 3) {
            int size = n9.m1(arrayList, this.d).size();
            n9Var.s = size;
            dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            e9Var.b(size <= 0, z10);
            dVar2.b(size, z10);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i11 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.b(0, z10);
            } else {
                dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z10, true);
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
                int size2 = n9.m1(n9Var.d, n9Var.e).size();
                n9Var.f = size2;
                dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.setShowZero(false);
                e9Var.b(false, z10);
                dVar2.b(size2, z10);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
        i10 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
        di.h7 storiesController = MessagesController.getInstance(i10).getStoriesController();
        if (!storiesController.O) {
            while (true) {
                a0.h hVar = this.b;
                if (i12 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i12);
                ((Boolean) hVar.n(i12)).getClass();
                storiesController.L.contains(Long.valueOf(j10));
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
        n9 n9Var = this.W;
        ArrayList arrayList2 = n9Var.J;
        HashMap hashMap = n9Var.r;
        ArrayList arrayList3 = n9Var.n;
        ArrayList arrayList4 = n9Var.h;
        HashMap hashMap2 = n9Var.e;
        ArrayList arrayList5 = n9Var.d;
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
        if (this.a == 3 && (n9Var.N != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    n9Var.N = i11;
                }
            } else {
                this.R = n9Var.N;
                n9Var.N = 3;
            }
        }
        HashSet m12 = n9.m1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            if (i12 >= arrayList.size()) {
                break;
            }
            u8 u8Var = (u8) arrayList.get(i12);
            if (u8Var != null) {
                int i13 = u8Var.i;
                if (i13 > 0) {
                    u8Var.k = n9Var.N == i13;
                    u8Var.l = false;
                } else {
                    TLRPC.User user = u8Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        u8Var.k = contains;
                        u8Var.l = !contains && m12.contains(Long.valueOf(u8Var.g.id));
                    } else {
                        TLRPC.Chat chat = u8Var.h;
                        if (chat != null) {
                            u8Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            u8Var.l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            mm0 mm0Var = this.f;
            if (i14 >= mm0Var.getChildCount()) {
                h(z10);
                return;
            }
            View childAt = mm0Var.getChildAt(i14);
            if ((childAt instanceof m9) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                u8 u8Var2 = (u8) arrayList.get(R);
                m9 m9Var = (m9) childAt;
                m9Var.c(u8Var2.k || u8Var2.l, z10);
                TLRPC.Chat chat2 = u8Var2.h;
                if (chat2 != null) {
                    m9Var.b(n9.e1(n9Var, chat2) > 200 ? 0.3f : 1.0f, z10);
                } else {
                    if (u8Var2.l && !u8Var2.k) {
                        r8 = 0.5f;
                    }
                    m9Var.b(r8, z10);
                }
            }
            i14++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0be7  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0499  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z10) {
        float dp;
        float dp2;
        c9 c9Var;
        boolean z11;
        int i10;
        int i11;
        float dp3;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        boolean z15;
        boolean containsKey;
        int i15;
        int i16;
        boolean z16;
        boolean z17;
        int i17;
        int i18;
        int i19;
        String formatPluralString;
        float f7;
        boolean z18;
        u8 u8Var;
        boolean z19;
        String formatPluralString2;
        int i20;
        long clientUserId;
        u8 u8Var2;
        String formatPluralString3;
        int i21;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        n9 n9Var = this.W;
        ArrayList arrayList = n9Var.n;
        ArrayList arrayList2 = n9Var.d;
        ArrayList arrayList3 = n9Var.h;
        HashSet hashSet = n9Var.v;
        ArrayList arrayList4 = this.K;
        arrayList4.clear();
        ArrayList arrayList5 = this.L;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        int i27 = this.a;
        org.telegram.ui.Cells.z3 z3Var = this.y;
        if (i27 != 0) {
            t8 t8Var = this.E;
            if (i27 == 1) {
                t8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                t8Var.d(true);
                ((org.telegram.ui.ActionBar.j2) t8Var.e).c(0.0f, false);
                arrayList5.add(u8.d());
                arrayList5.add(u8.c());
                arrayList5.size();
                arrayList5.add(u8.e());
                arrayList5.add(u8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                z3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                h(z10);
                this.F = true;
            } else if (i27 == 2) {
                t8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                t8Var.d(true);
                ((org.telegram.ui.ActionBar.j2) t8Var.e).c(0.0f, false);
                arrayList5.add(u8.d());
                arrayList5.add(u8.c());
                arrayList5.size();
                arrayList5.add(u8.e());
                arrayList5.add(u8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                z3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                h(z10);
                this.F = true;
            } else if (i27 == 3) {
                t8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                t8Var.d(true);
                ((org.telegram.ui.ActionBar.j2) t8Var.e).c(0.0f, false);
                arrayList5.add(u8.d());
                arrayList5.add(u8.c());
                arrayList5.size();
                arrayList5.add(u8.e());
                arrayList5.add(u8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                z3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                h(z10);
                this.F = true;
            } else if (i27 == 5) {
                t8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                t8Var.d(n9Var.O);
                ((org.telegram.ui.ActionBar.j2) t8Var.e).c(0.0f, false);
                arrayList5.add(u8.d());
                arrayList5.add(u8.c());
                arrayList5.size();
                arrayList5.add(u8.e());
                arrayList5.add(u8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                z3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                h(z10);
                this.F = true;
            } else if (i27 == 6) {
                t8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                t8Var.d(true);
                ((org.telegram.ui.ActionBar.j2) t8Var.e).c(0.0f, false);
                arrayList5.add(u8.d());
                arrayList5.add(u8.c());
                arrayList5.size();
                arrayList5.add(u8.e());
                arrayList5.add(u8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                z3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                h(z10);
                this.F = true;
            } else if (i27 == 4) {
                t8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                t8Var.d(true);
                ((org.telegram.ui.ActionBar.j2) t8Var.e).c(0.0f, false);
                arrayList5.add(u8.d());
                arrayList5.add(u8.c());
                arrayList5.size();
                arrayList5.add(u8.e());
                arrayList5.add(u8.f());
                dp = AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(32.0f);
                z3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                h(z10);
                this.F = true;
                boolean isEmpty = TextUtils.isEmpty(this.I);
                if (this.a != 0) {
                    String lowerCase = AndroidUtilities.translitSafe(this.I).toLowerCase();
                    int i28 = this.a;
                    ArrayList Z0 = i28 == 5 ? n9.Z0(n9Var) : n9.a1(n9Var, i28 == 1 || i28 == 2, n9Var.Y && (i28 == 3 || i28 == 6));
                    ArrayList arrayList6 = this.c;
                    HashMap hashMap = this.d;
                    HashSet m12 = n9.m1(arrayList6, hashMap);
                    ArrayList arrayList7 = this.J;
                    if (isEmpty) {
                        if (!z10) {
                            arrayList7.clear();
                            int i29 = 0;
                            while (i29 < Z0.size()) {
                                TLObject tLObject = (TLObject) Z0.get(i29);
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
                                i29++;
                                isEmpty = z15;
                            }
                        }
                        z11 = isEmpty;
                        int i30 = 0;
                        int i31 = 0;
                        while (i30 < arrayList7.size()) {
                            TLObject tLObject2 = (TLObject) arrayList7.get(i30);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) tLObject2;
                                boolean contains = arrayList6.contains(Long.valueOf(user.id));
                                i13 = i30;
                                i14 = i31;
                                u8 i32 = u8.i(user, contains, !contains && m12.contains(Long.valueOf(user.id)));
                                int i33 = this.a;
                                i32.m = i33 == 2 || i33 == 4;
                                arrayList5.add(i32);
                                dp += AndroidUtilities.dp(56.0f);
                            } else {
                                i13 = i30;
                                i14 = i31;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey2 = hashMap.containsKey(Long.valueOf(chat.id));
                                    float f10 = dp;
                                    u8 u8Var3 = new u8(3, true);
                                    u8Var3.h = chat;
                                    u8Var3.k = containsKey2;
                                    int i34 = this.a;
                                    u8Var3.m = i34 == 2 || i34 == 4;
                                    arrayList5.add(u8Var3);
                                    dp = f10 + AndroidUtilities.dp(56.0f);
                                } else {
                                    i31 = i14;
                                    i30 = i13 + 1;
                                }
                            }
                            i31 = i14 + 1;
                            i30 = i13 + 1;
                        }
                        i10 = i31;
                    } else {
                        z11 = isEmpty;
                        i10 = 0;
                    }
                    int i35 = 0;
                    while (i35 < Z0.size()) {
                        TLObject tLObject3 = (TLObject) Z0.get(i35);
                        if (z11 && arrayList7.contains(tLObject3)) {
                            i12 = i35;
                        } else {
                            if (!TextUtils.isEmpty(lowerCase)) {
                                if (tLObject3 instanceof TLRPC.User) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject3;
                                    String lowerCase2 = AndroidUtilities.translitSafe(UserObject.getUserName(user2)).toLowerCase();
                                    if (!lowerCase2.startsWith(lowerCase) && !vh.u(" ", lowerCase, lowerCase2)) {
                                        String lowerCase3 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user2)).toLowerCase();
                                        if (!lowerCase3.startsWith(lowerCase) && !vh.u(" ", lowerCase, lowerCase3)) {
                                            ArrayList<TLRPC.TL_username> arrayList8 = user2.usernames;
                                            if (arrayList8 != null) {
                                                int i36 = 0;
                                                while (i36 < arrayList8.size()) {
                                                    TLRPC.TL_username tL_username = arrayList8.get(i36);
                                                    i12 = i35;
                                                    if (tL_username.active && AndroidUtilities.translitSafe(tL_username.username).toLowerCase().startsWith(lowerCase)) {
                                                        z13 = true;
                                                        break;
                                                    } else {
                                                        i36++;
                                                        i35 = i12;
                                                    }
                                                }
                                            }
                                            i12 = i35;
                                            z13 = false;
                                        }
                                    }
                                } else {
                                    i12 = i35;
                                    if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                        String lowerCase4 = AndroidUtilities.translitSafe(chat2.title).toLowerCase();
                                        if (!lowerCase4.startsWith(lowerCase) && !vh.u(" ", lowerCase, lowerCase4)) {
                                            String lowerCase5 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat2)).toLowerCase();
                                            if (!lowerCase5.startsWith(lowerCase) && !vh.u(" ", lowerCase, lowerCase5)) {
                                                ArrayList<TLRPC.TL_username> arrayList9 = chat2.usernames;
                                                if (arrayList9 != null) {
                                                    for (int i37 = 0; i37 < arrayList9.size(); i37++) {
                                                        TLRPC.TL_username tL_username2 = arrayList9.get(i37);
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
                                        u8 i38 = u8.i(user3, contains2, !contains2 && m12.contains(Long.valueOf(user3.id)));
                                        int i39 = this.a;
                                        i38.m = i39 == 2 || i39 == 4;
                                        arrayList5.add(i38);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                    } else if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat3 = (TLRPC.Chat) tLObject3;
                                        boolean containsKey3 = hashMap.containsKey(Long.valueOf(chat3.id));
                                        u8 u8Var4 = new u8(3, true);
                                        u8Var4.h = chat3;
                                        u8Var4.k = containsKey3;
                                        int i40 = this.a;
                                        if (i40 != 2 && i40 != 4) {
                                            z14 = false;
                                            u8Var4.m = z14;
                                            arrayList5.add(u8Var4);
                                            dp += AndroidUtilities.dp(56.0f);
                                            i10++;
                                            i35 = i12 + 1;
                                        }
                                        z14 = true;
                                        u8Var4.m = z14;
                                        arrayList5.add(u8Var4);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                        i35 = i12 + 1;
                                    }
                                }
                            }
                            i12 = i35;
                            z13 = true;
                            if (z13) {
                            }
                        }
                        i35 = i12 + 1;
                    }
                    if (!z11) {
                        if (i10 == 0) {
                            i11 = 0;
                            arrayList5.add(new u8(5, false));
                            dp += AndroidUtilities.dp(150.0f);
                        } else {
                            i11 = 0;
                        }
                        mm0 mm0Var = this.f;
                        if (mm0Var != null) {
                            int measuredHeight = (mm0Var.getMeasuredHeight() - mm0Var.getPaddingTop()) - mm0Var.getPaddingBottom();
                            z12 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                            dp3 = measuredHeight + (z12 ? this.T : i11);
                        } else {
                            dp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        float f11 = dp3 - dp;
                        if (f11 > 0.0f) {
                            u8 u8Var5 = new u8(-1, false);
                            u8Var5.p = (int) f11;
                            arrayList5.add(u8Var5);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList5);
                }
                c9Var = this.n;
                if (c9Var != null) {
                    if (!z10 || n9Var.N == 0) {
                        c9Var.l();
                    } else {
                        c9Var.E(arrayList4, arrayList5);
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
            c9Var = this.n;
            if (c9Var != null) {
            }
            this.e.invalidate();
        }
        this.F = false;
        z3Var.setVisibility(8);
        i15 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
        ArrayList arrayList10 = MessagesController.getInstance(i15).getStoriesController().T;
        u8 u8Var6 = new u8(-1, false);
        u8Var6.o = 24;
        arrayList5.add(u8Var6);
        if (n9Var.L) {
            String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
            u8 u8Var7 = new u8(11, false);
            u8Var7.e = string;
            arrayList5.add(u8Var7);
            u8Var6.o = AndroidUtilities.dp(72.0f) + u8Var6.o;
        } else if (n9Var.F && (n9Var.Z || arrayList10 == null || arrayList10.size() <= 1)) {
            String string2 = n9Var.Z ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(n9Var.K ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
            if (n9Var.K) {
                formatPluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
            } else {
                int i41 = n9Var.Q;
                formatPluralString = i41 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i41 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
            }
            u8 u8Var8 = new u8(4, false);
            u8Var8.e = string2;
            u8Var8.f = formatPluralString;
            arrayList5.add(u8Var8);
            u8Var6.o = AndroidUtilities.dp(72.0f) + u8Var6.o;
        } else {
            String string3 = LocaleController.getString(n9Var.K ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
            u8 u8Var9 = new u8(8, false);
            u8Var9.e = string3;
            arrayList5.add(u8Var9);
            u8Var6.o = AndroidUtilities.dp(50.0f) + u8Var6.o;
            TLRPC.InputPeer inputPeer = n9Var.c;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                i16 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                u8 i42 = u8.i(UserConfig.getInstance(i16).getCurrentUser(), false, false);
                i42.n = true;
                arrayList5.add(i42);
                u8Var6.o = AndroidUtilities.dp(62.0f) + u8Var6.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                i19 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                u8 i43 = u8.i(MessagesController.getInstance(i19).getUser(Long.valueOf(n9Var.c.user_id)), false, false);
                i43.n = true;
                arrayList5.add(i43);
                u8Var6.o = AndroidUtilities.dp(62.0f) + u8Var6.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    i18 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i18).getChat(Long.valueOf(n9Var.c.channel_id));
                    u8 u8Var10 = new u8(3, true);
                    u8Var10.h = chat4;
                    u8Var10.k = false;
                    u8Var10.n = true;
                    arrayList5.add(u8Var10);
                    z17 = ChatObject.isChannelAndNotMegaGroup(chat4);
                    u8Var6.o = AndroidUtilities.dp(104.0f) + u8Var6.o;
                    z16 = false;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    i17 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i17).getChat(Long.valueOf(n9Var.c.chat_id));
                    u8 u8Var11 = new u8(3, true);
                    u8Var11.h = chat5;
                    u8Var11.k = false;
                    u8Var11.n = true;
                    arrayList5.add(u8Var11);
                    u8Var6.o = AndroidUtilities.dp(104.0f) + u8Var6.o;
                    z17 = false;
                    z16 = false;
                }
                u8 g7 = u8.g(null);
                g7.c = !z16 ? 1 : 2;
                arrayList5.add(g7);
                u8Var6.o = AndroidUtilities.dp(12.0f) + u8Var6.o;
                if (z16) {
                    String string4 = LocaleController.getString(n9Var.K ? R.string.StoryLivePrivacyWhoCanView : R.string.StoryPrivacyWhoCanView);
                    u8 u8Var12 = new u8(8, false);
                    u8Var12.e = string4;
                    arrayList5.add(u8Var12);
                    u8Var6.o = AndroidUtilities.dp(40.0f) + u8Var6.o;
                }
                if (z16 || n9Var.L) {
                    f7 = 80.0f;
                } else {
                    u8 h = u8.h(4, n9Var.f, n9Var.N == 4);
                    arrayList5.add(h);
                    u8Var6.o = AndroidUtilities.dp(56.0f) + u8Var6.o;
                    f7 = 80.0f;
                    if (n9Var.f == 1) {
                        if (arrayList2.size() != 1) {
                            Iterator it = n9Var.e.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList11 = (ArrayList) it.next();
                                if (arrayList11.size() >= 1) {
                                    i25 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                                    h.g = MessagesController.getInstance(i25).getUser((Long) arrayList11.get(0));
                                    break;
                                }
                            }
                        } else {
                            i26 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                            h.g = MessagesController.getInstance(i26).getUser((Long) arrayList2.get(0));
                        }
                    }
                    u8 h10 = u8.h(2, arrayList3.size(), n9Var.N == 2);
                    arrayList5.add(h10);
                    u8Var6.o = AndroidUtilities.dp(56.0f) + u8Var6.o;
                    if (arrayList3.size() == 1) {
                        i24 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                        h10.g = MessagesController.getInstance(i24).getUser((Long) arrayList3.get(0));
                    }
                    ArrayList K0 = n9.K0(n9Var);
                    u8 h11 = u8.h(1, K0.size(), n9Var.N == 1);
                    arrayList5.add(h11);
                    u8Var6.o = AndroidUtilities.dp(56.0f) + u8Var6.o;
                    if (K0.size() == 1 && (K0.get(0) instanceof TLRPC.User)) {
                        h11.g = (TLRPC.User) K0.get(0);
                    }
                    u8 h12 = u8.h(3, n9Var.s, n9Var.N == 3);
                    arrayList5.add(h12);
                    u8Var6.o = AndroidUtilities.dp(56.0f) + u8Var6.o;
                    if (n9Var.s == 1) {
                        if (arrayList.size() != 1) {
                            Iterator it2 = n9Var.r.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList12 = (ArrayList) it2.next();
                                if (arrayList12.size() >= 1) {
                                    i22 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                                    h12.g = MessagesController.getInstance(i22).getUser((Long) arrayList12.get(0));
                                    break;
                                }
                            }
                        } else {
                            i23 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                            h12.g = MessagesController.getInstance(i23).getUser((Long) arrayList.get(0));
                        }
                    }
                    i21 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    int i44 = MessagesController.getInstance(i21).getStoriesController().N;
                    String string5 = i44 <= 0 ? LocaleController.getString(n9Var.K ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(n9Var.K ? "StoryLiveBlockList" : "StoryBlockList", i44, new Object[0]);
                    int i45 = org.telegram.ui.ActionBar.y6.gc;
                    w8 w8Var = new w8(this, 3);
                    u6Var = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
                    arrayList5.add(u8.g(AndroidUtilities.replaceSingleTag(string5, i45, 0, w8Var, u6Var)));
                    u8Var6.o = AndroidUtilities.dp(80.0f) + u8Var6.o;
                }
                if (!n9Var.Z) {
                    if (n9Var.K && !n9Var.L) {
                        if (n9Var.G) {
                            arrayList5.add(u8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                            u8Var6.o = AndroidUtilities.dp(50.0f) + u8Var6.o;
                            arrayList5.add(u8.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                            u8Var6.o = AndroidUtilities.dp(50.0f) + u8Var6.o;
                            arrayList5.add(u8.g(null));
                            u8Var6.o = AndroidUtilities.dp(12.0f) + u8Var6.o;
                        } else {
                            arrayList5.add(u8.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                            u8Var6.o = AndroidUtilities.dp(50.0f) + u8Var6.o;
                            arrayList5.add(u8.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            u8Var6.o = AndroidUtilities.dp(30.0f) + u8Var6.o;
                        }
                    }
                    if (n9Var.K) {
                        String string6 = LocaleController.getString(R.string.StoryLiveAllowComments);
                        boolean z20 = n9Var.w;
                        u8 u8Var13 = new u8(7, false);
                        u8Var13.c = 2;
                        u8Var13.e = string6;
                        u8Var13.k = z20;
                        arrayList5.add(u8Var13);
                        u8Var6.o = AndroidUtilities.dp(50.0f) + u8Var6.o;
                    }
                    if (!n9Var.L) {
                        String string7 = LocaleController.getString(R.string.StoryAllowScreenshots);
                        boolean z21 = n9Var.x;
                        u8 u8Var14 = new u8(7, false);
                        u8Var14.c = 0;
                        u8Var14.e = string7;
                        u8Var14.k = z21;
                        arrayList5.add(u8Var14);
                        u8Var6.o = AndroidUtilities.dp(50.0f) + u8Var6.o;
                    }
                    if (!n9Var.K && !n9Var.L) {
                        String string8 = LocaleController.getString(z16 ? R.string.StoryKeep : z17 ? R.string.StoryKeepChannel : R.string.StoryKeepGroup);
                        boolean z22 = n9Var.y;
                        u8 u8Var15 = new u8(7, false);
                        u8Var15.c = 1;
                        u8Var15.e = string8;
                        u8Var15.k = z22;
                        arrayList5.add(u8Var15);
                        u8Var6.o = AndroidUtilities.dp(50.0f) + u8Var6.o;
                    }
                }
                z18 = n9Var.K;
                String str = "StoryKeepGroupInfo";
                if (!z18 || n9Var.L) {
                    arrayList5.add(u8.g(null));
                    u8Var6.o = AndroidUtilities.dp(12.0f) + u8Var6.o;
                } else if (!n9Var.Z && n9Var.E && n9Var.c0 != null) {
                    if (z18) {
                        formatPluralString3 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    } else {
                        String str2 = z16 ? "StoryKeepInfo" : z17 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i46 = n9Var.Q;
                        if (i46 == Integer.MAX_VALUE) {
                            i46 = 86400;
                        }
                        formatPluralString3 = LocaleController.formatPluralString(str2, i46 / 3600, new Object[0]);
                    }
                    arrayList5.add(u8.g(formatPluralString3));
                    u8Var6.o = AndroidUtilities.dp(f7) + u8Var6.o;
                }
                if (n9Var.y || n9Var.K || n9Var.L) {
                    u8Var = u8Var6;
                } else {
                    TLRPC.InputPeer inputPeer2 = n9Var.c;
                    if (inputPeer2 != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    } else {
                        i20 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i20).getClientUserId();
                    }
                    long j10 = clientUserId;
                    n9Var.j1().B(j10, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                        u8Var2 = u8Var6;
                    } else {
                        u8Var2 = u8Var6;
                        if (hashSet.size() < 3) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                di.a7 b10 = n9Var.j1().B(j10, true).b(((Integer) it3.next()).intValue());
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
                    arrayList5.add(u8.b(LocaleController.getString(R.string.StoriesAlbum), sb2, 1));
                    u8Var = u8Var2;
                    u8Var.o = AndroidUtilities.dp(50.0f) + u8Var.o;
                }
                if (!n9Var.Z && ((!n9Var.E || n9Var.c0 == null) && !(z19 = n9Var.K) && !n9Var.L)) {
                    if (z19) {
                        if (z16) {
                            str = "StoryKeepInfo";
                        } else if (z17) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i47 = n9Var.Q;
                        if (i47 == Integer.MAX_VALUE) {
                            i47 = 86400;
                        }
                        formatPluralString2 = LocaleController.formatPluralString(str, i47 / 3600, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    }
                    arrayList5.add(u8.g(formatPluralString2));
                    u8Var.o = AndroidUtilities.dp(f7) + u8Var.o;
                }
                if (n9Var.y && n9Var.E && n9Var.c0 != null) {
                    String string9 = LocaleController.getString(R.string.StoryEditCover);
                    BitmapDrawable bitmapDrawable = n9Var.b0;
                    u8 u8Var16 = new u8(9, false);
                    u8Var16.e = string9;
                    u8Var16.d = bitmapDrawable;
                    u8Var16.q = 0;
                    arrayList5.add(u8Var16);
                    u8Var.o = AndroidUtilities.dp(50.0f) + u8Var.o;
                    arrayList5.add(u8.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    u8Var.o = AndroidUtilities.dp(72.0f) + u8Var.o;
                }
                if (n9Var.L) {
                    arrayList5.add(u8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                    u8Var.o = AndroidUtilities.dp(50.0f) + u8Var.o;
                    arrayList5.add(u8.g(null));
                    u8Var.o = AndroidUtilities.dp(52.0f) + u8Var.o;
                }
                if (n9Var.K && n9Var.w) {
                    String string10 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                    u8 u8Var17 = new u8(8, false);
                    u8Var17.e = string10;
                    arrayList5.add(u8Var17);
                    u8Var.o = AndroidUtilities.dp(40.0f) + u8Var.o;
                    u8 u8Var18 = new u8(10, false);
                    u8Var18.q = 8;
                    arrayList5.add(u8Var18);
                    u8Var.o = AndroidUtilities.dp(75.0f) + u8Var.o;
                    arrayList5.add(u8.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    u8Var.o = AndroidUtilities.dp(50.0f) + u8Var.o;
                }
            }
            z17 = false;
            z16 = true;
            u8 g72 = u8.g(null);
            g72.c = !z16 ? 1 : 2;
            arrayList5.add(g72);
            u8Var6.o = AndroidUtilities.dp(12.0f) + u8Var6.o;
            if (z16) {
            }
            if (z16) {
            }
            f7 = 80.0f;
            if (!n9Var.Z) {
            }
            z18 = n9Var.K;
            String str3 = "StoryKeepGroupInfo";
            if (z18) {
            }
            arrayList5.add(u8.g(null));
            u8Var6.o = AndroidUtilities.dp(12.0f) + u8Var6.o;
            if (n9Var.y) {
            }
            u8Var = u8Var6;
            if (!n9Var.Z) {
                if (z19) {
                }
                arrayList5.add(u8.g(formatPluralString2));
                u8Var.o = AndroidUtilities.dp(f7) + u8Var.o;
            }
            if (n9Var.y) {
                String string92 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable2 = n9Var.b0;
                u8 u8Var162 = new u8(9, false);
                u8Var162.e = string92;
                u8Var162.d = bitmapDrawable2;
                u8Var162.q = 0;
                arrayList5.add(u8Var162);
                u8Var.o = AndroidUtilities.dp(50.0f) + u8Var.o;
                arrayList5.add(u8.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                u8Var.o = AndroidUtilities.dp(72.0f) + u8Var.o;
            }
            if (n9Var.L) {
            }
            if (n9Var.K) {
                String string102 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                u8 u8Var172 = new u8(8, false);
                u8Var172.e = string102;
                arrayList5.add(u8Var172);
                u8Var.o = AndroidUtilities.dp(40.0f) + u8Var.o;
                u8 u8Var182 = new u8(10, false);
                u8Var182.q = 8;
                arrayList5.add(u8Var182);
                u8Var.o = AndroidUtilities.dp(75.0f) + u8Var.o;
                arrayList5.add(u8.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                u8Var.o = AndroidUtilities.dp(50.0f) + u8Var.o;
            }
        }
        z17 = false;
        z16 = true;
        if (z16) {
        }
        f7 = 80.0f;
        if (!n9Var.Z) {
        }
        z18 = n9Var.K;
        String str32 = "StoryKeepGroupInfo";
        if (z18) {
        }
        arrayList5.add(u8.g(null));
        u8Var6.o = AndroidUtilities.dp(12.0f) + u8Var6.o;
        if (n9Var.y) {
        }
        u8Var = u8Var6;
        if (!n9Var.Z) {
        }
        if (n9Var.y) {
        }
        if (n9Var.L) {
        }
        if (n9Var.K) {
        }
        dp = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.I);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        c9Var = this.n;
        if (c9Var != null) {
        }
        this.e.invalidate();
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.z3 z3Var = this.y;
        if (z3Var == null) {
            return;
        }
        if (n9.m1(this.c, this.d).size() > 0) {
            z3Var.a(LocaleController.getString(R.string.UsersDeselectAll), new v8(this, 2));
            return;
        }
        if (z10) {
            z3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.y3 y3Var = z3Var.b;
        y3Var.c(null, false, true);
        y3Var.setOnClickListener(null);
        y3Var.setVisibility(0);
    }

    public final void i(boolean z10) {
        int i10;
        z8 z8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        org.telegram.ui.ActionBar.u6 u6Var;
        HashSet m12 = n9.m1(this.c, this.d);
        int i11 = this.a;
        n9 n9Var = this.W;
        if (i11 == 3) {
            n9Var.s = m12.size();
        } else if (i11 == 4) {
            n9Var.f = m12.size();
        }
        i10 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            z8Var = this.x;
            ArrayList arrayList4 = z8Var.e;
            arrayList = z8Var.e;
            if (i13 >= arrayList4.size()) {
                break;
            }
            x30 x30Var = (x30) arrayList.get(i13);
            if (!m12.contains(Long.valueOf(x30Var.getUid()))) {
                arrayList2.add(x30Var);
            }
            i13++;
        }
        Iterator it = m12.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    Object user = longValue >= 0 ? messagesController.getUser(l4) : messagesController.getChat(l4);
                    if (user != null) {
                        Context context = getContext();
                        u6Var = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
                        x30 x30Var2 = new x30(context, user, null, true, u6Var);
                        x30Var2.setOnClickListener(this);
                        arrayList3.add(x30Var2);
                    }
                } else if (((x30) arrayList.get(i14)).getUid() == longValue) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        j9 j9Var = z8Var.d;
        ArrayList arrayList5 = j9Var.e;
        ArrayList arrayList6 = j9Var.d;
        ArrayList arrayList7 = j9Var.f;
        k9 k9Var = (k9) j9Var.n;
        k9Var.H = true;
        ArrayList arrayList8 = k9Var.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = j9Var.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            ((x30) arrayList2.get(i15)).setOnClickListener(null);
        }
        j9Var.c();
        if (z10) {
            j9Var.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            j9Var.b = animatorSet;
            animatorSet.addListener(new i9(j9Var, arrayList2, i12));
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
                x30 x30Var3 = (x30) arrayList2.get(i16);
                arrayList5.add(x30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(x30Var3, (Property<x30, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(x30Var3, (Property<x30, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(x30Var3, (Property<x30, Float>) property, 1.0f, 0.0f));
                i16++;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                x30 x30Var4 = (x30) arrayList3.get(i17);
                arrayList6.add(x30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(x30Var4, (Property<x30, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(x30Var4, (Property<x30, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(x30Var4, (Property<x30, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                j9Var.removeView((View) arrayList2.get(i18));
            }
            arrayList9.clear();
            j9Var.b = null;
            j9Var.c = false;
            k9Var.b.setAllowDrawCursor(true);
        }
        while (i12 < arrayList3.size()) {
            j9Var.addView((View) arrayList3.get(i12));
            i12++;
        }
        j9Var.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        z8 z8Var = this.x;
        if (z10 || this.U || getTranslationX() != 0.0f) {
            this.N = false;
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.P = null;
            }
            z8Var.setTranslationY(c10);
        } else if (!this.N || Math.abs(this.O - c10) > 1.0f) {
            this.N = true;
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.P = null;
            }
            float translationY = z8Var.getTranslationY();
            this.O = c10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new e4(this, 5));
            this.P.addListener(new bh.b(this, 24));
            this.P.setInterpolator(new LinearInterpolator());
            this.P.setDuration(180L);
            this.P.start();
        }
        boolean z12 = this.F;
        t8 t8Var = this.E;
        if (!z12) {
            t8Var.setVisibility(8);
            return;
        }
        t8Var.setVisibility(0);
        float f7 = -t8Var.getHeight();
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.f;
            if (i10 >= mm0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f7 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i10++;
        }
        if (this.Q != z11) {
            this.Q = z11;
            ((org.telegram.ui.ActionBar.j2) t8Var.e).c((z11 || this.a != 0) ? 0.0f : 1.0f, true);
        }
        t8Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f7));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.k3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z8 z8Var = this.x;
        if (!z8Var.e.contains(view)) {
            return;
        }
        x30 x30Var = (x30) view;
        if (!x30Var.y) {
            x30 x30Var2 = z8Var.f;
            if (x30Var2 != null) {
                x30Var2.a();
                z8Var.f = null;
            }
            z8Var.f = x30Var;
            x30Var.b();
            return;
        }
        z8Var.f = null;
        j9 j9Var = z8Var.d;
        k9 k9Var = (k9) j9Var.n;
        k9Var.H = true;
        k9Var.e.remove(x30Var);
        x30Var.setOnClickListener(null);
        j9Var.c();
        j9Var.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        j9Var.b = animatorSet;
        animatorSet.addListener(new ce(6, j9Var, x30Var));
        ArrayList arrayList = j9Var.h;
        arrayList.clear();
        arrayList.add(x30Var);
        ArrayList arrayList2 = j9Var.d;
        arrayList2.clear();
        j9Var.e.clear();
        arrayList2.add(x30Var);
        ArrayList arrayList3 = j9Var.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.ALPHA, 1.0f, 0.0f));
        j9Var.requestLayout();
        long uid = x30Var.getUid();
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
        i10 = ((org.telegram.ui.ActionBar.k3) this.W).currentAccount;
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
        n9 n9Var = this.W;
        i12 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardHeight;
        if (i12 > 0) {
            i13 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardHeight;
            this.T = i13;
        }
        super.onMeasure(i10, i11);
        this.e.setPadding(0, AndroidUtilities.statusBarHeight + (this.a == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
        boolean z17 = this.V;
        z10 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
        mm0 mm0Var = this.f;
        e9 e9Var = this.r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
            int i14 = 2;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.x.K) > mm0Var.getPaddingTop()) {
                mi.n nVar = new mi.n(getContext(), 2, 0.7f);
                nVar.a = 1;
                nVar.p = -AndroidUtilities.dp(56.0f);
                this.h.w0(nVar);
            }
            int i15 = this.a;
            View view = this.s;
            if (i15 == 0) {
                z15 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                e9Var.setTranslationY(z15 ? this.T : 0.0f);
                z16 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                view.setTranslationY(z16 ? this.T : 0.0f);
            } else {
                z12 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                float f7 = z12 ? this.T : -this.T;
                ValueAnimator valueAnimator = e9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    e9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                e9Var.d = ofFloat;
                ofFloat.addUpdateListener(new d9(e9Var, 1));
                e9Var.d.addListener(new bh.b(e9Var, 25));
                e9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = e9Var.d;
                ds dsVar = org.telegram.ui.ActionBar.q1.w;
                valueAnimator2.setInterpolator(dsVar);
                e9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                view.setTranslationY(z13 ? this.T : -this.T);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(dsVar).withEndAction(new w8(this, i14)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
            this.V = z14;
        }
        mm0Var.setPadding(0, 0, 0, e9Var.getMeasuredHeight());
    }
}
