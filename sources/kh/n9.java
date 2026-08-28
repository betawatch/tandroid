package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final z8 A;
    public boolean B;
    public org.telegram.ui.ActionBar.c2 C;
    public long D;
    public String E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public boolean I;
    public boolean J;
    public float K;
    public ValueAnimator L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public final /* synthetic */ t9 S;
    public int a;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final wk0 f;
    public final f2.m0 h;
    public final j9 n;
    public final l9 r;
    public final View s;
    public final d v;
    public final d w;
    public final f9 x;
    public final org.telegram.ui.Cells.v3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(t9 t9Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        org.telegram.ui.ActionBar.b6 b6Var5;
        int i9;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var6;
        org.telegram.ui.ActionBar.b6 b6Var7;
        org.telegram.ui.ActionBar.b6 b6Var8;
        org.telegram.ui.ActionBar.b6 b6Var9;
        this.S = t9Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.N = -1;
        b6Var = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, b6Var);
        this.y = v3Var;
        b6Var2 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        f9 f9Var = new f9(this, context, b6Var2, new c9(this, 4));
        this.x = f9Var;
        int i11 = org.telegram.ui.ActionBar.f6.h5;
        f9Var.setBackgroundColor(t9Var.getThemedColor(i11));
        f9Var.setOnSearchTextChange(new d9(this, 3));
        b6Var3 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        z8 z8Var = new z8(context, b6Var3);
        this.A = z8Var;
        z8Var.h = new c9(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        b6Var4 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        wk0 wk0Var = new wk0(context, b6Var4);
        this.f = wk0Var;
        wk0Var.setClipToPadding(false);
        wk0Var.setTranslateSelector(true);
        b6Var5 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        j9 j9Var = new j9(this, context, b6Var5, f9Var, new ih.y3(t9Var, 2));
        this.n = j9Var;
        wk0Var.setAdapter(j9Var);
        j9Var.h = wk0Var;
        f2.m0 m0Var = new f2.m0();
        this.h = m0Var;
        wk0Var.setLayoutManager(m0Var);
        wk0Var.setOnScrollListener(new g9(this, 0));
        wk0Var.setOnItemClickListener(new ih.v3(3, this, context));
        frameLayout.addView(wk0Var, g7.e6.c(-1.0f, -1));
        h9 h9Var = new h9(this);
        h9Var.n(350L);
        h9Var.o(gr.h);
        h9Var.C = false;
        h9Var.m = false;
        wk0Var.setItemAnimator(h9Var);
        frameLayout.addView(f9Var, g7.e6.e(-1, -2, 55));
        frameLayout.addView(v3Var, g7.e6.e(-1, 32, 55));
        addView(z8Var, g7.e6.e(-1, -2, 55));
        l9 l9Var = new l9(this, context);
        this.r = l9Var;
        l9Var.setClickable(true);
        l9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i9 = ((org.telegram.ui.ActionBar.f3) t9Var).backgroundPaddingLeft;
        int i12 = i9 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) t9Var).backgroundPaddingLeft;
        l9Var.setPadding(i12, dp2, i10 + dp3, AndroidUtilities.dp(10.0f));
        b6Var6 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        l9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var6));
        b6Var7 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        d dVar = new d(context, b6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new b9(this, 0));
        dVar.e();
        l9Var.addView(dVar, g7.e6.q(-1, 48, 87));
        b6Var8 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        d dVar2 = new d(context, b6Var8, false);
        this.w = dVar2;
        dVar2.setOnClickListener(new b9(this, 1));
        dVar2.e();
        l9Var.addView(dVar2, g7.e6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        b6Var9 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var9));
        addView(view, g7.e6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(l9Var, g7.e6.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i9;
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        i9 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
        arrayList.addAll(MessagesController.getInstance(i9).getStoriesController().L);
        int i10 = 0;
        while (true) {
            a0.h hVar = this.b;
            if (i10 >= hVar.m()) {
                break;
            }
            long j10 = hVar.j(i10);
            if (!((Boolean) hVar.n(i10)).booleanValue()) {
                arrayList.remove(Long.valueOf(j10));
            } else if (!arrayList.contains(Long.valueOf(j10))) {
                arrayList.add(Long.valueOf(j10));
            }
            i10++;
        }
        if (z10) {
            g(true);
            e(true);
            f(true);
        }
    }

    public final void b(int i9) {
        this.a = i9;
        this.b.b();
        ArrayList arrayList = this.c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        t9 t9Var = this.S;
        if (i9 == 4) {
            arrayList.addAll(t9Var.d);
            hashMap.putAll(t9Var.e);
        } else if (i9 == 5) {
            arrayList.addAll(t9Var.F);
        } else if (i9 == 1) {
            ArrayList I0 = t9.I0(t9Var);
            for (int i10 = 0; i10 < I0.size(); i10 = aa.d.g(((TLRPC.User) I0.get(i10)).id, arrayList, i10, 1)) {
            }
        } else if (i9 == 2) {
            arrayList.addAll(t9Var.h);
        } else if (i9 == 3) {
            arrayList.addAll(t9Var.n);
            hashMap.putAll(t9Var.r);
        } else if (i9 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        i(false);
        f9 f9Var = this.x;
        f9Var.setText("");
        f9Var.setVisibility(i9 == 0 ? 8 : 0);
        f9Var.G = true;
        this.E = null;
        g(false);
        e(false);
        f(false);
        int i11 = this.a;
        wk0 wk0Var = this.f;
        if (i11 != 0) {
            wk0Var.u0(0);
        }
        wk0Var.requestLayout();
        this.N = -1;
    }

    public final float c() {
        int i9 = 0;
        float f10 = -org.telegram.messenger.l0.b(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.x.F), 0);
        while (true) {
            wk0 wk0Var = this.f;
            if (i9 >= wk0Var.getChildCount()) {
                return f10;
            }
            View childAt = wk0Var.getChildAt(i9);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f10, childAt.getY());
            }
            i9++;
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        int i9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.a;
        int i11 = 0;
        boolean z10 = i10 == 1 || i10 == 2;
        t9 t9Var = this.S;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i12 = 0; i12 < chatParticipants.participants.size(); i12++) {
                long j11 = chatParticipants.participants.get(i12).user_id;
                i9 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j11));
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
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                this.b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            i(true);
            e(true);
            f(true);
            this.x.G = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            b6Var2 = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var2);
            alertDialog$Builder.a.P = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.o();
            return;
        }
        Context context2 = getContext();
        b6Var = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, b6Var);
        alertDialog$Builder2.a.P = arrayList2.size() + " members are not in your contact list";
        alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new b9.a(this, j10, arrayList, 4));
        alertDialog$Builder2.h("Cancel", null);
        alertDialog$Builder2.o();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.c2 c2Var;
        if (i9 != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (c2Var = this.C) == null || this.D != chatFull.id) {
            return;
        }
        c2Var.c(350L);
        this.C = null;
        this.D = -1L;
        d(chatFull.id, chatFull.participants);
    }

    public final void e(boolean z10) {
        int i9;
        int i10 = this.a;
        t9 t9Var = this.S;
        d dVar = this.w;
        int i11 = 0;
        d dVar2 = this.v;
        if (i10 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (t9Var.H) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (t9Var.V) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i12 = t9Var.E;
                if (i12 == 1) {
                    dVar2.g(LocaleController.getString(t9Var.G ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z10, true);
                } else {
                    dVar2.g(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i12), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        l9 l9Var = this.r;
        if (i10 == 3) {
            int size = t9.l1(arrayList, this.d).size();
            t9Var.s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            l9Var.b(size <= 0, z10);
            dVar2.c(size, z10);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i10 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.c(0, z10);
            } else {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z10, true);
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
            return;
        }
        if (i10 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        if (i10 != 6) {
            if (i10 == 4) {
                int size2 = t9.l1(t9Var.d, t9Var.e).size();
                t9Var.f = size2;
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.setShowZero(false);
                l9Var.b(false, z10);
                dVar2.c(size2, z10);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
        i9 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
        ih.v6 storiesController = MessagesController.getInstance(i9).getStoriesController();
        if (!storiesController.O) {
            while (true) {
                a0.h hVar = this.b;
                if (i11 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i11);
                ((Boolean) hVar.n(i11)).getClass();
                storiesController.L.contains(Long.valueOf(j10));
                i11++;
            }
        } else {
            dVar2.c(arrayList.size(), z10);
        }
        dVar.setVisibility(8);
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        t9 t9Var = this.S;
        ArrayList arrayList2 = t9Var.F;
        HashMap hashMap = t9Var.r;
        ArrayList arrayList3 = t9Var.n;
        ArrayList arrayList4 = t9Var.h;
        HashMap hashMap2 = t9Var.e;
        ArrayList arrayList5 = t9Var.d;
        int i9 = this.a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.c;
        if (i9 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i9 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i9 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i9 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.a == 3 && (t9Var.J != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i10 = this.N;
                if (i10 != -1) {
                    t9Var.J = i10;
                }
            } else {
                this.N = t9Var.J;
                t9Var.J = 3;
            }
        }
        HashSet l1 = t9.l1(arrayList6, hashMap3);
        int i11 = 0;
        while (true) {
            arrayList = this.H;
            if (i11 >= arrayList.size()) {
                break;
            }
            a9 a9Var = (a9) arrayList.get(i11);
            if (a9Var != null) {
                int i12 = a9Var.i;
                if (i12 > 0) {
                    a9Var.k = t9Var.J == i12;
                    a9Var.l = false;
                } else {
                    TLRPC.User user = a9Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        a9Var.k = contains;
                        a9Var.l = !contains && l1.contains(Long.valueOf(a9Var.g.id));
                    } else {
                        TLRPC.Chat chat = a9Var.h;
                        if (chat != null) {
                            a9Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            a9Var.l = false;
                        }
                    }
                }
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            wk0 wk0Var = this.f;
            if (i13 >= wk0Var.getChildCount()) {
                h(z10);
                return;
            }
            View childAt = wk0Var.getChildAt(i13);
            if ((childAt instanceof s9) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                a9 a9Var2 = (a9) arrayList.get(R);
                s9 s9Var = (s9) childAt;
                s9Var.c(a9Var2.k || a9Var2.l, z10);
                TLRPC.Chat chat2 = a9Var2.h;
                if (chat2 != null) {
                    s9Var.b(t9.d1(t9Var, chat2) > 200 ? 0.3f : 1.0f, z10);
                } else {
                    if (a9Var2.l && !a9Var2.k) {
                        r8 = 0.5f;
                    }
                    s9Var.b(r8, z10);
                }
            }
            i13++;
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
        j9 j9Var;
        boolean z11;
        int i9;
        float dp3;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        boolean z15;
        boolean containsKey;
        int i13;
        int i14;
        boolean z16;
        boolean z17;
        int i15;
        int i16;
        int i17;
        String formatPluralString;
        float f10;
        boolean z18;
        a9 a9Var;
        boolean z19;
        String formatPluralString2;
        int i18;
        long clientUserId;
        a9 a9Var2;
        String formatPluralString3;
        int i19;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        t9 t9Var = this.S;
        ArrayList arrayList = t9Var.n;
        ArrayList arrayList2 = t9Var.d;
        ArrayList arrayList3 = t9Var.h;
        HashSet hashSet = t9Var.v;
        ArrayList arrayList4 = this.G;
        arrayList4.clear();
        ArrayList arrayList5 = this.H;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        int i25 = this.a;
        org.telegram.ui.Cells.v3 v3Var = this.y;
        if (i25 != 0) {
            z8 z8Var = this.A;
            if (i25 == 1) {
                z8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                z8Var.d(true);
                ((org.telegram.ui.ActionBar.h2) z8Var.e).c(0.0f, false);
                arrayList5.add(a9.d());
                arrayList5.add(a9.c());
                arrayList5.size();
                arrayList5.add(a9.e());
                arrayList5.add(a9.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                h(z10);
                this.B = true;
            } else if (i25 == 2) {
                z8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                z8Var.d(true);
                ((org.telegram.ui.ActionBar.h2) z8Var.e).c(0.0f, false);
                arrayList5.add(a9.d());
                arrayList5.add(a9.c());
                arrayList5.size();
                arrayList5.add(a9.e());
                arrayList5.add(a9.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                h(z10);
                this.B = true;
            } else if (i25 == 3) {
                z8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                z8Var.d(true);
                ((org.telegram.ui.ActionBar.h2) z8Var.e).c(0.0f, false);
                arrayList5.add(a9.d());
                arrayList5.add(a9.c());
                arrayList5.size();
                arrayList5.add(a9.e());
                arrayList5.add(a9.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                h(z10);
                this.B = true;
            } else if (i25 == 5) {
                z8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                z8Var.d(t9Var.K);
                ((org.telegram.ui.ActionBar.h2) z8Var.e).c(0.0f, false);
                arrayList5.add(a9.d());
                arrayList5.add(a9.c());
                arrayList5.size();
                arrayList5.add(a9.e());
                arrayList5.add(a9.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                h(z10);
                this.B = true;
            } else if (i25 == 6) {
                z8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                z8Var.d(true);
                ((org.telegram.ui.ActionBar.h2) z8Var.e).c(0.0f, false);
                arrayList5.add(a9.d());
                arrayList5.add(a9.c());
                arrayList5.size();
                arrayList5.add(a9.e());
                arrayList5.add(a9.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                h(z10);
                this.B = true;
            } else if (i25 == 4) {
                z8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                z8Var.d(true);
                ((org.telegram.ui.ActionBar.h2) z8Var.e).c(0.0f, false);
                arrayList5.add(a9.d());
                arrayList5.add(a9.c());
                arrayList5.size();
                arrayList5.add(a9.e());
                arrayList5.add(a9.f());
                dp = AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(32.0f);
                v3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                h(z10);
                this.B = true;
                boolean isEmpty = TextUtils.isEmpty(this.E);
                if (this.a != 0) {
                    String lowerCase = AndroidUtilities.translitSafe(this.E).toLowerCase();
                    int i26 = this.a;
                    ArrayList Y0 = i26 == 5 ? t9.Y0(t9Var) : t9.Z0(t9Var, i26 == 1 || i26 == 2, t9Var.U && (i26 == 3 || i26 == 6));
                    ArrayList arrayList6 = this.c;
                    HashMap hashMap = this.d;
                    HashSet l1 = t9.l1(arrayList6, hashMap);
                    ArrayList arrayList7 = this.F;
                    if (isEmpty) {
                        if (!z10) {
                            arrayList7.clear();
                            int i27 = 0;
                            while (i27 < Y0.size()) {
                                TLObject tLObject = (TLObject) Y0.get(i27);
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
                                i27++;
                                isEmpty = z15;
                            }
                        }
                        z11 = isEmpty;
                        int i28 = 0;
                        int i29 = 0;
                        while (i28 < arrayList7.size()) {
                            TLObject tLObject2 = (TLObject) arrayList7.get(i28);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) tLObject2;
                                boolean contains = arrayList6.contains(Long.valueOf(user.id));
                                i11 = i28;
                                i12 = i29;
                                a9 i30 = a9.i(user, contains, !contains && l1.contains(Long.valueOf(user.id)));
                                int i31 = this.a;
                                i30.m = i31 == 2 || i31 == 4;
                                arrayList5.add(i30);
                                dp += AndroidUtilities.dp(56.0f);
                            } else {
                                i11 = i28;
                                i12 = i29;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey2 = hashMap.containsKey(Long.valueOf(chat.id));
                                    float f11 = dp;
                                    a9 a9Var3 = new a9(3, true);
                                    a9Var3.h = chat;
                                    a9Var3.k = containsKey2;
                                    int i32 = this.a;
                                    a9Var3.m = i32 == 2 || i32 == 4;
                                    arrayList5.add(a9Var3);
                                    dp = f11 + AndroidUtilities.dp(56.0f);
                                } else {
                                    i29 = i12;
                                    i28 = i11 + 1;
                                }
                            }
                            i29 = i12 + 1;
                            i28 = i11 + 1;
                        }
                        i9 = i29;
                    } else {
                        z11 = isEmpty;
                        i9 = 0;
                    }
                    int i33 = 0;
                    while (i33 < Y0.size()) {
                        TLObject tLObject3 = (TLObject) Y0.get(i33);
                        if (z11 && arrayList7.contains(tLObject3)) {
                            i10 = i33;
                        } else {
                            if (!TextUtils.isEmpty(lowerCase)) {
                                if (tLObject3 instanceof TLRPC.User) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject3;
                                    String lowerCase2 = AndroidUtilities.translitSafe(UserObject.getUserName(user2)).toLowerCase();
                                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.l0.w(" ", lowerCase, lowerCase2)) {
                                        String lowerCase3 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user2)).toLowerCase();
                                        if (!lowerCase3.startsWith(lowerCase) && !org.telegram.messenger.l0.w(" ", lowerCase, lowerCase3)) {
                                            ArrayList<TLRPC.TL_username> arrayList8 = user2.usernames;
                                            if (arrayList8 != null) {
                                                int i34 = 0;
                                                while (i34 < arrayList8.size()) {
                                                    TLRPC.TL_username tL_username = arrayList8.get(i34);
                                                    i10 = i33;
                                                    if (tL_username.active && AndroidUtilities.translitSafe(tL_username.username).toLowerCase().startsWith(lowerCase)) {
                                                        z13 = true;
                                                        break;
                                                    } else {
                                                        i34++;
                                                        i33 = i10;
                                                    }
                                                }
                                            }
                                            i10 = i33;
                                            z13 = false;
                                        }
                                    }
                                } else {
                                    i10 = i33;
                                    if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                        String lowerCase4 = AndroidUtilities.translitSafe(chat2.title).toLowerCase();
                                        if (!lowerCase4.startsWith(lowerCase) && !org.telegram.messenger.l0.w(" ", lowerCase, lowerCase4)) {
                                            String lowerCase5 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat2)).toLowerCase();
                                            if (!lowerCase5.startsWith(lowerCase) && !org.telegram.messenger.l0.w(" ", lowerCase, lowerCase5)) {
                                                ArrayList<TLRPC.TL_username> arrayList9 = chat2.usernames;
                                                if (arrayList9 != null) {
                                                    for (int i35 = 0; i35 < arrayList9.size(); i35++) {
                                                        TLRPC.TL_username tL_username2 = arrayList9.get(i35);
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
                                        a9 i36 = a9.i(user3, contains2, !contains2 && l1.contains(Long.valueOf(user3.id)));
                                        int i37 = this.a;
                                        i36.m = i37 == 2 || i37 == 4;
                                        arrayList5.add(i36);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i9++;
                                    } else if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat3 = (TLRPC.Chat) tLObject3;
                                        boolean containsKey3 = hashMap.containsKey(Long.valueOf(chat3.id));
                                        a9 a9Var4 = new a9(3, true);
                                        a9Var4.h = chat3;
                                        a9Var4.k = containsKey3;
                                        int i38 = this.a;
                                        if (i38 != 2 && i38 != 4) {
                                            z14 = false;
                                            a9Var4.m = z14;
                                            arrayList5.add(a9Var4);
                                            dp += AndroidUtilities.dp(56.0f);
                                            i9++;
                                            i33 = i10 + 1;
                                        }
                                        z14 = true;
                                        a9Var4.m = z14;
                                        arrayList5.add(a9Var4);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i9++;
                                        i33 = i10 + 1;
                                    }
                                }
                            }
                            i10 = i33;
                            z13 = true;
                            if (z13) {
                            }
                        }
                        i33 = i10 + 1;
                    }
                    if (!z11) {
                        if (i9 == 0) {
                            arrayList5.add(new a9(5, false));
                            dp += AndroidUtilities.dp(150.0f);
                        }
                        wk0 wk0Var = this.f;
                        if (wk0Var != null) {
                            int measuredHeight = (wk0Var.getMeasuredHeight() - wk0Var.getPaddingTop()) - wk0Var.getPaddingBottom();
                            z12 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                            dp3 = measuredHeight + (z12 ? this.P : 0);
                        } else {
                            dp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        float f12 = dp3 - dp;
                        if (f12 > 0.0f) {
                            a9 a9Var5 = new a9(-1, false);
                            a9Var5.p = (int) f12;
                            arrayList5.add(a9Var5);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList5);
                }
                j9Var = this.n;
                if (j9Var != null) {
                    if (!z10 || t9Var.J == 0) {
                        j9Var.l();
                    } else {
                        j9Var.E(arrayList4, arrayList5);
                    }
                }
                this.e.invalidate();
            }
            dp = dp2;
            boolean isEmpty2 = TextUtils.isEmpty(this.E);
            if (this.a != 0) {
            }
            if (this.h.t) {
            }
            j9Var = this.n;
            if (j9Var != null) {
            }
            this.e.invalidate();
        }
        this.B = false;
        v3Var.setVisibility(8);
        i13 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
        ArrayList arrayList10 = MessagesController.getInstance(i13).getStoriesController().T;
        a9 a9Var6 = new a9(-1, false);
        a9Var6.o = 24;
        arrayList5.add(a9Var6);
        if (t9Var.H) {
            String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
            a9 a9Var7 = new a9(11, false);
            a9Var7.e = string;
            arrayList5.add(a9Var7);
            a9Var6.o = AndroidUtilities.dp(72.0f) + a9Var6.o;
        } else if (t9Var.B && (t9Var.V || arrayList10 == null || arrayList10.size() <= 1)) {
            String string2 = t9Var.V ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(t9Var.G ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
            if (t9Var.G) {
                formatPluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
            } else {
                int i39 = t9Var.M;
                formatPluralString = i39 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i39 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
            }
            a9 a9Var8 = new a9(4, false);
            a9Var8.e = string2;
            a9Var8.f = formatPluralString;
            arrayList5.add(a9Var8);
            a9Var6.o = AndroidUtilities.dp(72.0f) + a9Var6.o;
        } else {
            String string3 = LocaleController.getString(t9Var.G ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
            a9 a9Var9 = new a9(8, false);
            a9Var9.e = string3;
            arrayList5.add(a9Var9);
            a9Var6.o = AndroidUtilities.dp(50.0f) + a9Var6.o;
            TLRPC.InputPeer inputPeer = t9Var.c;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                i14 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                a9 i40 = a9.i(UserConfig.getInstance(i14).getCurrentUser(), false, false);
                i40.n = true;
                arrayList5.add(i40);
                a9Var6.o = AndroidUtilities.dp(62.0f) + a9Var6.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                i17 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                a9 i41 = a9.i(MessagesController.getInstance(i17).getUser(Long.valueOf(t9Var.c.user_id)), false, false);
                i41.n = true;
                arrayList5.add(i41);
                a9Var6.o = AndroidUtilities.dp(62.0f) + a9Var6.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    i16 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i16).getChat(Long.valueOf(t9Var.c.channel_id));
                    a9 a9Var10 = new a9(3, true);
                    a9Var10.h = chat4;
                    a9Var10.k = false;
                    a9Var10.n = true;
                    arrayList5.add(a9Var10);
                    z17 = ChatObject.isChannelAndNotMegaGroup(chat4);
                    a9Var6.o = AndroidUtilities.dp(104.0f) + a9Var6.o;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    i15 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i15).getChat(Long.valueOf(t9Var.c.chat_id));
                    a9 a9Var11 = new a9(3, true);
                    a9Var11.h = chat5;
                    a9Var11.k = false;
                    a9Var11.n = true;
                    arrayList5.add(a9Var11);
                    a9Var6.o = AndroidUtilities.dp(104.0f) + a9Var6.o;
                    z17 = false;
                }
                z16 = false;
                a9 g10 = a9.g(null);
                g10.c = !z16 ? 1 : 2;
                arrayList5.add(g10);
                a9Var6.o = AndroidUtilities.dp(12.0f) + a9Var6.o;
                if (z16) {
                    String string4 = LocaleController.getString(t9Var.G ? R.string.StoryLivePrivacyWhoCanView : R.string.StoryPrivacyWhoCanView);
                    a9 a9Var12 = new a9(8, false);
                    a9Var12.e = string4;
                    arrayList5.add(a9Var12);
                    a9Var6.o = AndroidUtilities.dp(40.0f) + a9Var6.o;
                }
                if (z16 || t9Var.H) {
                    f10 = 80.0f;
                } else {
                    a9 h = a9.h(4, t9Var.f, t9Var.J == 4);
                    arrayList5.add(h);
                    a9Var6.o = AndroidUtilities.dp(56.0f) + a9Var6.o;
                    f10 = 80.0f;
                    if (t9Var.f == 1) {
                        if (arrayList2.size() != 1) {
                            Iterator it = t9Var.e.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList11 = (ArrayList) it.next();
                                if (arrayList11.size() >= 1) {
                                    i23 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                                    h.g = MessagesController.getInstance(i23).getUser((Long) arrayList11.get(0));
                                    break;
                                }
                            }
                        } else {
                            i24 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                            h.g = MessagesController.getInstance(i24).getUser((Long) arrayList2.get(0));
                        }
                    }
                    a9 h10 = a9.h(2, arrayList3.size(), t9Var.J == 2);
                    arrayList5.add(h10);
                    a9Var6.o = AndroidUtilities.dp(56.0f) + a9Var6.o;
                    if (arrayList3.size() == 1) {
                        i22 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                        h10.g = MessagesController.getInstance(i22).getUser((Long) arrayList3.get(0));
                    }
                    ArrayList I0 = t9.I0(t9Var);
                    a9 h11 = a9.h(1, I0.size(), t9Var.J == 1);
                    arrayList5.add(h11);
                    a9Var6.o = AndroidUtilities.dp(56.0f) + a9Var6.o;
                    if (I0.size() == 1 && (I0.get(0) instanceof TLRPC.User)) {
                        h11.g = (TLRPC.User) I0.get(0);
                    }
                    a9 h12 = a9.h(3, t9Var.s, t9Var.J == 3);
                    arrayList5.add(h12);
                    a9Var6.o = AndroidUtilities.dp(56.0f) + a9Var6.o;
                    if (t9Var.s == 1) {
                        if (arrayList.size() != 1) {
                            Iterator it2 = t9Var.r.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList12 = (ArrayList) it2.next();
                                if (arrayList12.size() >= 1) {
                                    i20 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                                    h12.g = MessagesController.getInstance(i20).getUser((Long) arrayList12.get(0));
                                    break;
                                }
                            }
                        } else {
                            i21 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                            h12.g = MessagesController.getInstance(i21).getUser((Long) arrayList.get(0));
                        }
                    }
                    i19 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                    int i42 = MessagesController.getInstance(i19).getStoriesController().N;
                    String string5 = i42 <= 0 ? LocaleController.getString(t9Var.G ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(t9Var.G ? "StoryLiveBlockList" : "StoryBlockList", i42, new Object[0]);
                    int i43 = org.telegram.ui.ActionBar.f6.gc;
                    c9 c9Var = new c9(this, 3);
                    b6Var = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                    arrayList5.add(a9.g(AndroidUtilities.replaceSingleTag(string5, i43, 0, c9Var, b6Var)));
                    a9Var6.o = AndroidUtilities.dp(80.0f) + a9Var6.o;
                }
                if (!t9Var.V) {
                    if (t9Var.G && !t9Var.H) {
                        if (t9Var.C) {
                            arrayList5.add(a9.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                            a9Var6.o = AndroidUtilities.dp(50.0f) + a9Var6.o;
                            arrayList5.add(a9.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                            a9Var6.o = AndroidUtilities.dp(50.0f) + a9Var6.o;
                            arrayList5.add(a9.g(null));
                            a9Var6.o = AndroidUtilities.dp(12.0f) + a9Var6.o;
                        } else {
                            arrayList5.add(a9.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                            a9Var6.o = AndroidUtilities.dp(50.0f) + a9Var6.o;
                            arrayList5.add(a9.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            a9Var6.o = AndroidUtilities.dp(30.0f) + a9Var6.o;
                        }
                    }
                    if (t9Var.G) {
                        String string6 = LocaleController.getString(R.string.StoryLiveAllowComments);
                        boolean z20 = t9Var.w;
                        a9 a9Var13 = new a9(7, false);
                        a9Var13.c = 2;
                        a9Var13.e = string6;
                        a9Var13.k = z20;
                        arrayList5.add(a9Var13);
                        a9Var6.o = AndroidUtilities.dp(50.0f) + a9Var6.o;
                    }
                    if (!t9Var.H) {
                        String string7 = LocaleController.getString(R.string.StoryAllowScreenshots);
                        boolean z21 = t9Var.x;
                        a9 a9Var14 = new a9(7, false);
                        a9Var14.c = 0;
                        a9Var14.e = string7;
                        a9Var14.k = z21;
                        arrayList5.add(a9Var14);
                        a9Var6.o = AndroidUtilities.dp(50.0f) + a9Var6.o;
                    }
                    if (!t9Var.G && !t9Var.H) {
                        String string8 = LocaleController.getString(z16 ? R.string.StoryKeep : z17 ? R.string.StoryKeepChannel : R.string.StoryKeepGroup);
                        boolean z22 = t9Var.y;
                        a9 a9Var15 = new a9(7, false);
                        a9Var15.c = 1;
                        a9Var15.e = string8;
                        a9Var15.k = z22;
                        arrayList5.add(a9Var15);
                        a9Var6.o = AndroidUtilities.dp(50.0f) + a9Var6.o;
                    }
                }
                z18 = t9Var.G;
                String str = "StoryKeepGroupInfo";
                if (!z18 || t9Var.H) {
                    arrayList5.add(a9.g(null));
                    a9Var6.o = AndroidUtilities.dp(12.0f) + a9Var6.o;
                } else if (!t9Var.V && t9Var.A && t9Var.Y != null) {
                    if (z18) {
                        formatPluralString3 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    } else {
                        String str2 = z16 ? "StoryKeepInfo" : z17 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i44 = t9Var.M;
                        if (i44 == Integer.MAX_VALUE) {
                            i44 = 86400;
                        }
                        formatPluralString3 = LocaleController.formatPluralString(str2, i44 / 3600, new Object[0]);
                    }
                    arrayList5.add(a9.g(formatPluralString3));
                    a9Var6.o = AndroidUtilities.dp(f10) + a9Var6.o;
                }
                if (t9Var.y || t9Var.G || t9Var.H) {
                    a9Var = a9Var6;
                } else {
                    TLRPC.InputPeer inputPeer2 = t9Var.c;
                    if (inputPeer2 != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    } else {
                        i18 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i18).getClientUserId();
                    }
                    long j10 = clientUserId;
                    t9Var.i1().B(j10, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                        a9Var2 = a9Var6;
                    } else {
                        a9Var2 = a9Var6;
                        if (hashSet.size() < 3) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                ih.o6 b10 = t9Var.i1().B(j10, true).b(((Integer) it3.next()).intValue());
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
                    arrayList5.add(a9.b(LocaleController.getString(R.string.StoriesAlbum), sb2, 1));
                    a9Var = a9Var2;
                    a9Var.o = AndroidUtilities.dp(50.0f) + a9Var.o;
                }
                if (!t9Var.V && ((!t9Var.A || t9Var.Y == null) && !(z19 = t9Var.G) && !t9Var.H)) {
                    if (z19) {
                        if (z16) {
                            str = "StoryKeepInfo";
                        } else if (z17) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i45 = t9Var.M;
                        if (i45 == Integer.MAX_VALUE) {
                            i45 = 86400;
                        }
                        formatPluralString2 = LocaleController.formatPluralString(str, i45 / 3600, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    }
                    arrayList5.add(a9.g(formatPluralString2));
                    a9Var.o = AndroidUtilities.dp(f10) + a9Var.o;
                }
                if (t9Var.y && t9Var.A && t9Var.Y != null) {
                    String string9 = LocaleController.getString(R.string.StoryEditCover);
                    BitmapDrawable bitmapDrawable = t9Var.X;
                    a9 a9Var16 = new a9(9, false);
                    a9Var16.e = string9;
                    a9Var16.d = bitmapDrawable;
                    a9Var16.q = 0;
                    arrayList5.add(a9Var16);
                    a9Var.o = AndroidUtilities.dp(50.0f) + a9Var.o;
                    arrayList5.add(a9.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    a9Var.o = AndroidUtilities.dp(72.0f) + a9Var.o;
                }
                if (t9Var.H) {
                    arrayList5.add(a9.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                    a9Var.o = AndroidUtilities.dp(50.0f) + a9Var.o;
                    arrayList5.add(a9.g(null));
                    a9Var.o = AndroidUtilities.dp(52.0f) + a9Var.o;
                }
                if (t9Var.G && t9Var.w) {
                    String string10 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                    a9 a9Var17 = new a9(8, false);
                    a9Var17.e = string10;
                    arrayList5.add(a9Var17);
                    a9Var.o = AndroidUtilities.dp(40.0f) + a9Var.o;
                    a9 a9Var18 = new a9(10, false);
                    a9Var18.q = 8;
                    arrayList5.add(a9Var18);
                    a9Var.o = AndroidUtilities.dp(75.0f) + a9Var.o;
                    arrayList5.add(a9.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    a9Var.o = AndroidUtilities.dp(50.0f) + a9Var.o;
                }
            }
            z17 = false;
            z16 = true;
            a9 g102 = a9.g(null);
            g102.c = !z16 ? 1 : 2;
            arrayList5.add(g102);
            a9Var6.o = AndroidUtilities.dp(12.0f) + a9Var6.o;
            if (z16) {
            }
            if (z16) {
            }
            f10 = 80.0f;
            if (!t9Var.V) {
            }
            z18 = t9Var.G;
            String str3 = "StoryKeepGroupInfo";
            if (z18) {
            }
            arrayList5.add(a9.g(null));
            a9Var6.o = AndroidUtilities.dp(12.0f) + a9Var6.o;
            if (t9Var.y) {
            }
            a9Var = a9Var6;
            if (!t9Var.V) {
                if (z19) {
                }
                arrayList5.add(a9.g(formatPluralString2));
                a9Var.o = AndroidUtilities.dp(f10) + a9Var.o;
            }
            if (t9Var.y) {
                String string92 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable2 = t9Var.X;
                a9 a9Var162 = new a9(9, false);
                a9Var162.e = string92;
                a9Var162.d = bitmapDrawable2;
                a9Var162.q = 0;
                arrayList5.add(a9Var162);
                a9Var.o = AndroidUtilities.dp(50.0f) + a9Var.o;
                arrayList5.add(a9.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                a9Var.o = AndroidUtilities.dp(72.0f) + a9Var.o;
            }
            if (t9Var.H) {
            }
            if (t9Var.G) {
                String string102 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                a9 a9Var172 = new a9(8, false);
                a9Var172.e = string102;
                arrayList5.add(a9Var172);
                a9Var.o = AndroidUtilities.dp(40.0f) + a9Var.o;
                a9 a9Var182 = new a9(10, false);
                a9Var182.q = 8;
                arrayList5.add(a9Var182);
                a9Var.o = AndroidUtilities.dp(75.0f) + a9Var.o;
                arrayList5.add(a9.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                a9Var.o = AndroidUtilities.dp(50.0f) + a9Var.o;
            }
        }
        z17 = false;
        z16 = true;
        if (z16) {
        }
        f10 = 80.0f;
        if (!t9Var.V) {
        }
        z18 = t9Var.G;
        String str32 = "StoryKeepGroupInfo";
        if (z18) {
        }
        arrayList5.add(a9.g(null));
        a9Var6.o = AndroidUtilities.dp(12.0f) + a9Var6.o;
        if (t9Var.y) {
        }
        a9Var = a9Var6;
        if (!t9Var.V) {
        }
        if (t9Var.y) {
        }
        if (t9Var.H) {
        }
        if (t9Var.G) {
        }
        dp = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.E);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        j9Var = this.n;
        if (j9Var != null) {
        }
        this.e.invalidate();
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.v3 v3Var = this.y;
        if (v3Var == null) {
            return;
        }
        if (t9.l1(this.c, this.d).size() > 0) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new b9(this, 2));
            return;
        }
        if (z10) {
            v3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.u3 u3Var = v3Var.b;
        u3Var.c(null, false, true);
        u3Var.setOnClickListener(null);
        u3Var.setVisibility(0);
    }

    public final void i(boolean z10) {
        int i9;
        f9 f9Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        org.telegram.ui.ActionBar.b6 b6Var;
        HashSet l1 = t9.l1(this.c, this.d);
        int i10 = this.a;
        t9 t9Var = this.S;
        if (i10 == 3) {
            t9Var.s = l1.size();
        } else if (i10 == 4) {
            t9Var.f = l1.size();
        }
        i9 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i9);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            f9Var = this.x;
            ArrayList arrayList4 = f9Var.d;
            arrayList = f9Var.d;
            if (i12 >= arrayList4.size()) {
                break;
            }
            w20 w20Var = (w20) arrayList.get(i12);
            if (!l1.contains(Long.valueOf(w20Var.getUid()))) {
                arrayList2.add(w20Var);
            }
            i12++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    Object user = longValue >= 0 ? messagesController.getUser(l10) : messagesController.getChat(l10);
                    if (user != null) {
                        Context context = getContext();
                        b6Var = ((org.telegram.ui.ActionBar.f3) t9Var).resourcesProvider;
                        w20 w20Var2 = new w20(context, user, null, true, b6Var);
                        w20Var2.setOnClickListener(this);
                        arrayList3.add(w20Var2);
                    }
                } else if (((w20) arrayList.get(i13)).getUid() == longValue) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        fg.l lVar = f9Var.c;
        ArrayList arrayList5 = lVar.e;
        ArrayList arrayList6 = lVar.d;
        ArrayList arrayList7 = lVar.f;
        q9 q9Var = (q9) lVar.n;
        q9Var.C = true;
        ArrayList arrayList8 = q9Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = lVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((w20) arrayList2.get(i14)).setOnClickListener(null);
        }
        lVar.c();
        if (z10) {
            lVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            lVar.b = animatorSet;
            animatorSet.addListener(new p9(lVar, arrayList2, i11));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i15 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i15 >= size) {
                    break;
                }
                w20 w20Var3 = (w20) arrayList2.get(i15);
                arrayList5.add(w20Var3);
                arrayList7.add(ObjectAnimator.ofFloat(w20Var3, (Property<w20, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(w20Var3, (Property<w20, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(w20Var3, (Property<w20, Float>) property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                w20 w20Var4 = (w20) arrayList3.get(i16);
                arrayList6.add(w20Var4);
                arrayList7.add(ObjectAnimator.ofFloat(w20Var4, (Property<w20, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(w20Var4, (Property<w20, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(w20Var4, (Property<w20, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                lVar.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            lVar.b = null;
            lVar.c = false;
            q9Var.a.setAllowDrawCursor(true);
        }
        while (i11 < arrayList3.size()) {
            lVar.addView((View) arrayList3.get(i11));
            i11++;
        }
        lVar.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.I;
        boolean z11 = false;
        f9 f9Var = this.x;
        if (z10 || this.Q || getTranslationX() != 0.0f) {
            this.J = false;
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            f9Var.setTranslationY(c10);
        } else if (!this.J || Math.abs(this.K - c10) > 1.0f) {
            this.J = true;
            ValueAnimator valueAnimator2 = this.L;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.L = null;
            }
            float translationY = f9Var.getTranslationY();
            this.K = c10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new g4(this, 5));
            this.L.addListener(new ag.e(this, 27));
            this.L.setInterpolator(new LinearInterpolator());
            this.L.setDuration(180L);
            this.L.start();
        }
        boolean z12 = this.B;
        z8 z8Var = this.A;
        if (!z12) {
            z8Var.setVisibility(8);
            return;
        }
        z8Var.setVisibility(0);
        float f10 = -z8Var.getHeight();
        int i9 = 0;
        while (true) {
            wk0 wk0Var = this.f;
            if (i9 >= wk0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f10 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i9++;
        }
        if (this.M != z11) {
            this.M = z11;
            ((org.telegram.ui.ActionBar.h2) z8Var.e).c((z11 || this.a != 0) ? 0.0f : 1.0f, true);
        }
        z8Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i9;
        super.onAttachedToWindow();
        i9 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f9 f9Var = this.x;
        if (!f9Var.d.contains(view)) {
            return;
        }
        w20 w20Var = (w20) view;
        if (!w20Var.y) {
            w20 w20Var2 = f9Var.e;
            if (w20Var2 != null) {
                w20Var2.a();
                f9Var.e = null;
            }
            f9Var.e = w20Var;
            w20Var.b();
            return;
        }
        f9Var.e = null;
        fg.l lVar = f9Var.c;
        q9 q9Var = (q9) lVar.n;
        q9Var.C = true;
        q9Var.d.remove(w20Var);
        w20Var.setOnClickListener(null);
        lVar.c();
        lVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        lVar.b = animatorSet;
        animatorSet.addListener(new fg.j(7, lVar, w20Var));
        ArrayList arrayList = lVar.h;
        arrayList.clear();
        arrayList.add(w20Var);
        ArrayList arrayList2 = lVar.d;
        arrayList2.clear();
        lVar.e.clear();
        arrayList2.add(w20Var);
        ArrayList arrayList3 = lVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.ALPHA, 1.0f, 0.0f));
        lVar.requestLayout();
        long uid = w20Var.getUid();
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
        int i9;
        super.onDetachedFromWindow();
        i9 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i12;
        t9 t9Var = this.S;
        i11 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardHeight;
        if (i11 > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardHeight;
            this.P = i12;
        }
        super.onMeasure(i9, i10);
        this.e.setPadding(0, AndroidUtilities.statusBarHeight + (this.a == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
        boolean z17 = this.R;
        z10 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
        wk0 wk0Var = this.f;
        l9 l9Var = this.r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
            int i13 = 2;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.x.F) > wk0Var.getPaddingTop()) {
                rh.n nVar = new rh.n(getContext(), 2, 0.7f);
                nVar.a = 1;
                nVar.p = -AndroidUtilities.dp(56.0f);
                this.h.w0(nVar);
            }
            int i14 = this.a;
            View view = this.s;
            if (i14 == 0) {
                z15 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                l9Var.setTranslationY(z15 ? this.P : 0.0f);
                z16 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                view.setTranslationY(z16 ? this.P : 0.0f);
            } else {
                z12 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                float f10 = z12 ? this.P : -this.P;
                ValueAnimator valueAnimator = l9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    l9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                l9Var.d = ofFloat;
                ofFloat.addUpdateListener(new k9(l9Var, 1));
                l9Var.d.addListener(new ag.e(l9Var, 28));
                l9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = l9Var.d;
                gr grVar = org.telegram.ui.ActionBar.q1.w;
                valueAnimator2.setInterpolator(grVar);
                l9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                view.setTranslationY(z13 ? this.P : -this.P);
                this.Q = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(grVar).withEndAction(new c9(this, i13)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
            this.R = z14;
        }
        wk0Var.setPadding(0, 0, 0, l9Var.getMeasuredHeight());
    }
}
