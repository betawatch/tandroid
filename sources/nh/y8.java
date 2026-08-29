package nh;

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
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y8 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final l8 A;
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
    public final /* synthetic */ e9 S;
    public int a;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final jl0 f;
    public final f2.j0 h;
    public final u8 n;
    public final w8 r;
    public final View s;
    public final d v;
    public final d w;
    public final r8 x;
    public final org.telegram.ui.Cells.s3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(e9 e9Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.ActionBar.c6 c6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var6;
        org.telegram.ui.ActionBar.c6 c6Var7;
        org.telegram.ui.ActionBar.c6 c6Var8;
        org.telegram.ui.ActionBar.c6 c6Var9;
        this.S = e9Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.N = -1;
        c6Var = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, c6Var);
        this.y = s3Var;
        c6Var2 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        r8 r8Var = new r8(this, context, c6Var2, new o8(this, 4));
        this.x = r8Var;
        int i12 = org.telegram.ui.ActionBar.g6.h5;
        r8Var.setBackgroundColor(e9Var.getThemedColor(i12));
        r8Var.setOnSearchTextChange(new p8(this, 3));
        c6Var3 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        l8 l8Var = new l8(context, c6Var3);
        this.A = l8Var;
        l8Var.h = new o8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        c6Var4 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        jl0 jl0Var = new jl0(context, c6Var4);
        this.f = jl0Var;
        jl0Var.setClipToPadding(false);
        jl0Var.setTranslateSelector(true);
        c6Var5 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        u8 u8Var = new u8(this, context, c6Var5, r8Var, new lh.t3(e9Var, 2));
        this.n = u8Var;
        jl0Var.setAdapter(u8Var);
        u8Var.h = jl0Var;
        f2.j0 j0Var = new f2.j0();
        this.h = j0Var;
        jl0Var.setLayoutManager(j0Var);
        jl0Var.setOnScrollListener(new s8(this, 0));
        jl0Var.setOnItemClickListener(new kg.w(6, this, context));
        frameLayout.addView(jl0Var, i7.f6.c(-1.0f, -1));
        t8 t8Var = new t8(this);
        t8Var.n(350L);
        t8Var.o(jr.h);
        t8Var.C = false;
        t8Var.m = false;
        jl0Var.setItemAnimator(t8Var);
        frameLayout.addView(r8Var, i7.f6.e(-1, -2, 55));
        frameLayout.addView(s3Var, i7.f6.e(-1, 32, 55));
        addView(l8Var, i7.f6.e(-1, -2, 55));
        w8 w8Var = new w8(this, context);
        this.r = w8Var;
        w8Var.setClickable(true);
        w8Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) e9Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) e9Var).backgroundPaddingLeft;
        w8Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        c6Var6 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var6));
        c6Var7 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        d dVar = new d(context, c6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new n8(this, 0));
        dVar.e();
        w8Var.addView(dVar, i7.f6.q(-1, 48, 87));
        c6Var8 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        d dVar2 = new d(context, c6Var8, false);
        this.w = dVar2;
        dVar2.setOnClickListener(new n8(this, 1));
        dVar2.e();
        w8Var.addView(dVar2, i7.f6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        c6Var9 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var9));
        addView(view, i7.f6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(w8Var, i7.f6.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
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
        e9 e9Var = this.S;
        if (i10 == 4) {
            arrayList.addAll(e9Var.d);
            hashMap.putAll(e9Var.e);
        } else if (i10 == 5) {
            arrayList.addAll(e9Var.F);
        } else if (i10 == 1) {
            ArrayList J0 = e9.J0(e9Var);
            for (int i11 = 0; i11 < J0.size(); i11 = a4.w.g(((TLRPC.User) J0.get(i11)).id, arrayList, i11, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(e9Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(e9Var.n);
            hashMap.putAll(e9Var.r);
        } else if (i10 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        i(false);
        r8 r8Var = this.x;
        r8Var.setText("");
        r8Var.setVisibility(i10 == 0 ? 8 : 0);
        r8Var.G = true;
        this.E = null;
        g(false);
        e(false);
        f(false);
        int i12 = this.a;
        jl0 jl0Var = this.f;
        if (i12 != 0) {
            jl0Var.u0(0);
        }
        jl0Var.requestLayout();
        this.N = -1;
    }

    public final float c() {
        int i10 = 0;
        float f9 = -j7.l1.d(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.x.F), 0);
        while (true) {
            jl0 jl0Var = this.f;
            if (i10 >= jl0Var.getChildCount()) {
                return f9;
            }
            View childAt = jl0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f9, childAt.getY());
            }
            i10++;
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int i12 = 0;
        boolean z10 = i11 == 1 || i11 == 2;
        e9 e9Var = this.S;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
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
            this.x.G = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            c6Var2 = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var2);
            alertDialog$Builder.a.P = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.o();
            return;
        }
        Context context2 = getContext();
        c6Var = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, c6Var);
        alertDialog$Builder2.a.P = arrayList2.size() + " members are not in your contact list";
        alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new d9.a(this, j10, arrayList, 4));
        alertDialog$Builder2.h("Cancel", null);
        alertDialog$Builder2.o();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.c2 c2Var;
        if (i10 != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (c2Var = this.C) == null || this.D != chatFull.id) {
            return;
        }
        c2Var.c(350L);
        this.C = null;
        this.D = -1L;
        d(chatFull.id, chatFull.participants);
    }

    public final void e(boolean z10) {
        int i10;
        int i11 = this.a;
        e9 e9Var = this.S;
        d dVar = this.w;
        int i12 = 0;
        d dVar2 = this.v;
        if (i11 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (e9Var.H) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (e9Var.V) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i13 = e9Var.E;
                if (i13 == 1) {
                    dVar2.g(LocaleController.getString(e9Var.G ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z10, true);
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
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        w8 w8Var = this.r;
        if (i11 == 3) {
            int size = e9.l1(arrayList, this.d).size();
            e9Var.s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            w8Var.b(size <= 0, z10);
            dVar2.c(size, z10);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i11 == 2) {
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
        if (i11 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        if (i11 != 6) {
            if (i11 == 4) {
                int size2 = e9.l1(e9Var.d, e9Var.e).size();
                e9Var.f = size2;
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.setShowZero(false);
                w8Var.b(false, z10);
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
        i10 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
        lh.s6 storiesController = MessagesController.getInstance(i10).getStoriesController();
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
            dVar2.c(arrayList.size(), z10);
        }
        dVar.setVisibility(8);
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        e9 e9Var = this.S;
        ArrayList arrayList2 = e9Var.F;
        HashMap hashMap = e9Var.r;
        ArrayList arrayList3 = e9Var.n;
        ArrayList arrayList4 = e9Var.h;
        HashMap hashMap2 = e9Var.e;
        ArrayList arrayList5 = e9Var.d;
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
        if (this.a == 3 && (e9Var.J != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.N;
                if (i11 != -1) {
                    e9Var.J = i11;
                }
            } else {
                this.N = e9Var.J;
                e9Var.J = 3;
            }
        }
        HashSet l1 = e9.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.H;
            if (i12 >= arrayList.size()) {
                break;
            }
            m8 m8Var = (m8) arrayList.get(i12);
            if (m8Var != null) {
                int i13 = m8Var.i;
                if (i13 > 0) {
                    m8Var.k = e9Var.J == i13;
                    m8Var.l = false;
                } else {
                    TLRPC.User user = m8Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        m8Var.k = contains;
                        m8Var.l = !contains && l1.contains(Long.valueOf(m8Var.g.id));
                    } else {
                        TLRPC.Chat chat = m8Var.h;
                        if (chat != null) {
                            m8Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            m8Var.l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            jl0 jl0Var = this.f;
            if (i14 >= jl0Var.getChildCount()) {
                h(z10);
                return;
            }
            View childAt = jl0Var.getChildAt(i14);
            if ((childAt instanceof d9) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                m8 m8Var2 = (m8) arrayList.get(R);
                d9 d9Var = (d9) childAt;
                d9Var.c(m8Var2.k || m8Var2.l, z10);
                TLRPC.Chat chat2 = m8Var2.h;
                if (chat2 != null) {
                    d9Var.b(e9.d1(e9Var, chat2) > 200 ? 0.3f : 1.0f, z10);
                } else {
                    if (m8Var2.l && !m8Var2.k) {
                        r8 = 0.5f;
                    }
                    d9Var.b(r8, z10);
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
        u8 u8Var;
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
        float f9;
        boolean z18;
        m8 m8Var;
        boolean z19;
        String formatPluralString2;
        int i19;
        long clientUserId;
        m8 m8Var2;
        String formatPluralString3;
        int i20;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        e9 e9Var = this.S;
        ArrayList arrayList = e9Var.n;
        ArrayList arrayList2 = e9Var.d;
        ArrayList arrayList3 = e9Var.h;
        HashSet hashSet = e9Var.v;
        ArrayList arrayList4 = this.G;
        arrayList4.clear();
        ArrayList arrayList5 = this.H;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        int i26 = this.a;
        org.telegram.ui.Cells.s3 s3Var = this.y;
        if (i26 != 0) {
            l8 l8Var = this.A;
            if (i26 == 1) {
                l8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                l8Var.d(true);
                ((org.telegram.ui.ActionBar.h2) l8Var.e).c(0.0f, false);
                arrayList5.add(m8.d());
                arrayList5.add(m8.c());
                arrayList5.size();
                arrayList5.add(m8.e());
                arrayList5.add(m8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                h(z10);
                this.B = true;
            } else if (i26 == 2) {
                l8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                l8Var.d(true);
                ((org.telegram.ui.ActionBar.h2) l8Var.e).c(0.0f, false);
                arrayList5.add(m8.d());
                arrayList5.add(m8.c());
                arrayList5.size();
                arrayList5.add(m8.e());
                arrayList5.add(m8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                h(z10);
                this.B = true;
            } else if (i26 == 3) {
                l8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                l8Var.d(true);
                ((org.telegram.ui.ActionBar.h2) l8Var.e).c(0.0f, false);
                arrayList5.add(m8.d());
                arrayList5.add(m8.c());
                arrayList5.size();
                arrayList5.add(m8.e());
                arrayList5.add(m8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                h(z10);
                this.B = true;
            } else if (i26 == 5) {
                l8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                l8Var.d(e9Var.K);
                ((org.telegram.ui.ActionBar.h2) l8Var.e).c(0.0f, false);
                arrayList5.add(m8.d());
                arrayList5.add(m8.c());
                arrayList5.size();
                arrayList5.add(m8.e());
                arrayList5.add(m8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                h(z10);
                this.B = true;
            } else if (i26 == 6) {
                l8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                l8Var.d(true);
                ((org.telegram.ui.ActionBar.h2) l8Var.e).c(0.0f, false);
                arrayList5.add(m8.d());
                arrayList5.add(m8.c());
                arrayList5.size();
                arrayList5.add(m8.e());
                arrayList5.add(m8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                h(z10);
                this.B = true;
            } else if (i26 == 4) {
                l8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                l8Var.d(true);
                ((org.telegram.ui.ActionBar.h2) l8Var.e).c(0.0f, false);
                arrayList5.add(m8.d());
                arrayList5.add(m8.c());
                arrayList5.size();
                arrayList5.add(m8.e());
                arrayList5.add(m8.f());
                dp = AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(32.0f);
                s3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                h(z10);
                this.B = true;
                boolean isEmpty = TextUtils.isEmpty(this.E);
                if (this.a != 0) {
                    String lowerCase = AndroidUtilities.translitSafe(this.E).toLowerCase();
                    int i27 = this.a;
                    ArrayList Y0 = i27 == 5 ? e9.Y0(e9Var) : e9.Z0(e9Var, i27 == 1 || i27 == 2, e9Var.U && (i27 == 3 || i27 == 6));
                    ArrayList arrayList6 = this.c;
                    HashMap hashMap = this.d;
                    HashSet l1 = e9.l1(arrayList6, hashMap);
                    ArrayList arrayList7 = this.F;
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
                                m8 i31 = m8.i(user, contains, !contains && l1.contains(Long.valueOf(user.id)));
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
                                    m8 m8Var3 = new m8(3, true);
                                    m8Var3.h = chat;
                                    m8Var3.k = containsKey2;
                                    int i33 = this.a;
                                    m8Var3.m = i33 == 2 || i33 == 4;
                                    arrayList5.add(m8Var3);
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
                                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.x3.w(" ", lowerCase, lowerCase2)) {
                                        String lowerCase3 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user2)).toLowerCase();
                                        if (!lowerCase3.startsWith(lowerCase) && !org.telegram.messenger.x3.w(" ", lowerCase, lowerCase3)) {
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
                                        if (!lowerCase4.startsWith(lowerCase) && !org.telegram.messenger.x3.w(" ", lowerCase, lowerCase4)) {
                                            String lowerCase5 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat2)).toLowerCase();
                                            if (!lowerCase5.startsWith(lowerCase) && !org.telegram.messenger.x3.w(" ", lowerCase, lowerCase5)) {
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
                                        m8 i37 = m8.i(user3, contains2, !contains2 && l1.contains(Long.valueOf(user3.id)));
                                        int i38 = this.a;
                                        i37.m = i38 == 2 || i38 == 4;
                                        arrayList5.add(i37);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                    } else if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat3 = (TLRPC.Chat) tLObject3;
                                        boolean containsKey3 = hashMap.containsKey(Long.valueOf(chat3.id));
                                        m8 m8Var4 = new m8(3, true);
                                        m8Var4.h = chat3;
                                        m8Var4.k = containsKey3;
                                        int i39 = this.a;
                                        if (i39 != 2 && i39 != 4) {
                                            z14 = false;
                                            m8Var4.m = z14;
                                            arrayList5.add(m8Var4);
                                            dp += AndroidUtilities.dp(56.0f);
                                            i10++;
                                            i34 = i11 + 1;
                                        }
                                        z14 = true;
                                        m8Var4.m = z14;
                                        arrayList5.add(m8Var4);
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
                            arrayList5.add(new m8(5, false));
                            dp += AndroidUtilities.dp(150.0f);
                        }
                        jl0 jl0Var = this.f;
                        if (jl0Var != null) {
                            int measuredHeight = (jl0Var.getMeasuredHeight() - jl0Var.getPaddingTop()) - jl0Var.getPaddingBottom();
                            z12 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                            dp3 = measuredHeight + (z12 ? this.P : 0);
                        } else {
                            dp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        float f11 = dp3 - dp;
                        if (f11 > 0.0f) {
                            m8 m8Var5 = new m8(-1, false);
                            m8Var5.p = (int) f11;
                            arrayList5.add(m8Var5);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList5);
                }
                u8Var = this.n;
                if (u8Var != null) {
                    if (!z10 || e9Var.J == 0) {
                        u8Var.l();
                    } else {
                        u8Var.E(arrayList4, arrayList5);
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
            u8Var = this.n;
            if (u8Var != null) {
            }
            this.e.invalidate();
        }
        this.B = false;
        s3Var.setVisibility(8);
        i14 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
        ArrayList arrayList10 = MessagesController.getInstance(i14).getStoriesController().T;
        m8 m8Var6 = new m8(-1, false);
        m8Var6.o = 24;
        arrayList5.add(m8Var6);
        if (e9Var.H) {
            String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
            m8 m8Var7 = new m8(11, false);
            m8Var7.e = string;
            arrayList5.add(m8Var7);
            m8Var6.o = AndroidUtilities.dp(72.0f) + m8Var6.o;
        } else if (e9Var.B && (e9Var.V || arrayList10 == null || arrayList10.size() <= 1)) {
            String string2 = e9Var.V ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(e9Var.G ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
            if (e9Var.G) {
                formatPluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
            } else {
                int i40 = e9Var.M;
                formatPluralString = i40 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i40 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
            }
            m8 m8Var8 = new m8(4, false);
            m8Var8.e = string2;
            m8Var8.f = formatPluralString;
            arrayList5.add(m8Var8);
            m8Var6.o = AndroidUtilities.dp(72.0f) + m8Var6.o;
        } else {
            String string3 = LocaleController.getString(e9Var.G ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
            m8 m8Var9 = new m8(8, false);
            m8Var9.e = string3;
            arrayList5.add(m8Var9);
            m8Var6.o = AndroidUtilities.dp(50.0f) + m8Var6.o;
            TLRPC.InputPeer inputPeer = e9Var.c;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                i15 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                m8 i41 = m8.i(UserConfig.getInstance(i15).getCurrentUser(), false, false);
                i41.n = true;
                arrayList5.add(i41);
                m8Var6.o = AndroidUtilities.dp(62.0f) + m8Var6.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                i18 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                m8 i42 = m8.i(MessagesController.getInstance(i18).getUser(Long.valueOf(e9Var.c.user_id)), false, false);
                i42.n = true;
                arrayList5.add(i42);
                m8Var6.o = AndroidUtilities.dp(62.0f) + m8Var6.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    i17 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(e9Var.c.channel_id));
                    m8 m8Var10 = new m8(3, true);
                    m8Var10.h = chat4;
                    m8Var10.k = false;
                    m8Var10.n = true;
                    arrayList5.add(m8Var10);
                    z17 = ChatObject.isChannelAndNotMegaGroup(chat4);
                    m8Var6.o = AndroidUtilities.dp(104.0f) + m8Var6.o;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    i16 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i16).getChat(Long.valueOf(e9Var.c.chat_id));
                    m8 m8Var11 = new m8(3, true);
                    m8Var11.h = chat5;
                    m8Var11.k = false;
                    m8Var11.n = true;
                    arrayList5.add(m8Var11);
                    m8Var6.o = AndroidUtilities.dp(104.0f) + m8Var6.o;
                    z17 = false;
                }
                z16 = false;
                m8 g10 = m8.g(null);
                g10.c = !z16 ? 1 : 2;
                arrayList5.add(g10);
                m8Var6.o = AndroidUtilities.dp(12.0f) + m8Var6.o;
                if (z16) {
                    String string4 = LocaleController.getString(e9Var.G ? R.string.StoryLivePrivacyWhoCanView : R.string.StoryPrivacyWhoCanView);
                    m8 m8Var12 = new m8(8, false);
                    m8Var12.e = string4;
                    arrayList5.add(m8Var12);
                    m8Var6.o = AndroidUtilities.dp(40.0f) + m8Var6.o;
                }
                if (z16 || e9Var.H) {
                    f9 = 80.0f;
                } else {
                    m8 h = m8.h(4, e9Var.f, e9Var.J == 4);
                    arrayList5.add(h);
                    m8Var6.o = AndroidUtilities.dp(56.0f) + m8Var6.o;
                    f9 = 80.0f;
                    if (e9Var.f == 1) {
                        if (arrayList2.size() != 1) {
                            Iterator it = e9Var.e.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList11 = (ArrayList) it.next();
                                if (arrayList11.size() >= 1) {
                                    i24 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                                    h.g = MessagesController.getInstance(i24).getUser((Long) arrayList11.get(0));
                                    break;
                                }
                            }
                        } else {
                            i25 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                            h.g = MessagesController.getInstance(i25).getUser((Long) arrayList2.get(0));
                        }
                    }
                    m8 h10 = m8.h(2, arrayList3.size(), e9Var.J == 2);
                    arrayList5.add(h10);
                    m8Var6.o = AndroidUtilities.dp(56.0f) + m8Var6.o;
                    if (arrayList3.size() == 1) {
                        i23 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                        h10.g = MessagesController.getInstance(i23).getUser((Long) arrayList3.get(0));
                    }
                    ArrayList J0 = e9.J0(e9Var);
                    m8 h11 = m8.h(1, J0.size(), e9Var.J == 1);
                    arrayList5.add(h11);
                    m8Var6.o = AndroidUtilities.dp(56.0f) + m8Var6.o;
                    if (J0.size() == 1 && (J0.get(0) instanceof TLRPC.User)) {
                        h11.g = (TLRPC.User) J0.get(0);
                    }
                    m8 h12 = m8.h(3, e9Var.s, e9Var.J == 3);
                    arrayList5.add(h12);
                    m8Var6.o = AndroidUtilities.dp(56.0f) + m8Var6.o;
                    if (e9Var.s == 1) {
                        if (arrayList.size() != 1) {
                            Iterator it2 = e9Var.r.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList12 = (ArrayList) it2.next();
                                if (arrayList12.size() >= 1) {
                                    i21 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                                    h12.g = MessagesController.getInstance(i21).getUser((Long) arrayList12.get(0));
                                    break;
                                }
                            }
                        } else {
                            i22 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                            h12.g = MessagesController.getInstance(i22).getUser((Long) arrayList.get(0));
                        }
                    }
                    i20 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                    int i43 = MessagesController.getInstance(i20).getStoriesController().N;
                    String string5 = i43 <= 0 ? LocaleController.getString(e9Var.G ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(e9Var.G ? "StoryLiveBlockList" : "StoryBlockList", i43, new Object[0]);
                    int i44 = org.telegram.ui.ActionBar.g6.gc;
                    o8 o8Var = new o8(this, 3);
                    c6Var = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
                    arrayList5.add(m8.g(AndroidUtilities.replaceSingleTag(string5, i44, 0, o8Var, c6Var)));
                    m8Var6.o = AndroidUtilities.dp(80.0f) + m8Var6.o;
                }
                if (!e9Var.V) {
                    if (e9Var.G && !e9Var.H) {
                        if (e9Var.C) {
                            arrayList5.add(m8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                            m8Var6.o = AndroidUtilities.dp(50.0f) + m8Var6.o;
                            arrayList5.add(m8.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                            m8Var6.o = AndroidUtilities.dp(50.0f) + m8Var6.o;
                            arrayList5.add(m8.g(null));
                            m8Var6.o = AndroidUtilities.dp(12.0f) + m8Var6.o;
                        } else {
                            arrayList5.add(m8.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                            m8Var6.o = AndroidUtilities.dp(50.0f) + m8Var6.o;
                            arrayList5.add(m8.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            m8Var6.o = AndroidUtilities.dp(30.0f) + m8Var6.o;
                        }
                    }
                    if (e9Var.G) {
                        String string6 = LocaleController.getString(R.string.StoryLiveAllowComments);
                        boolean z20 = e9Var.w;
                        m8 m8Var13 = new m8(7, false);
                        m8Var13.c = 2;
                        m8Var13.e = string6;
                        m8Var13.k = z20;
                        arrayList5.add(m8Var13);
                        m8Var6.o = AndroidUtilities.dp(50.0f) + m8Var6.o;
                    }
                    if (!e9Var.H) {
                        String string7 = LocaleController.getString(R.string.StoryAllowScreenshots);
                        boolean z21 = e9Var.x;
                        m8 m8Var14 = new m8(7, false);
                        m8Var14.c = 0;
                        m8Var14.e = string7;
                        m8Var14.k = z21;
                        arrayList5.add(m8Var14);
                        m8Var6.o = AndroidUtilities.dp(50.0f) + m8Var6.o;
                    }
                    if (!e9Var.G && !e9Var.H) {
                        String string8 = LocaleController.getString(z16 ? R.string.StoryKeep : z17 ? R.string.StoryKeepChannel : R.string.StoryKeepGroup);
                        boolean z22 = e9Var.y;
                        m8 m8Var15 = new m8(7, false);
                        m8Var15.c = 1;
                        m8Var15.e = string8;
                        m8Var15.k = z22;
                        arrayList5.add(m8Var15);
                        m8Var6.o = AndroidUtilities.dp(50.0f) + m8Var6.o;
                    }
                }
                z18 = e9Var.G;
                String str = "StoryKeepGroupInfo";
                if (!z18 || e9Var.H) {
                    arrayList5.add(m8.g(null));
                    m8Var6.o = AndroidUtilities.dp(12.0f) + m8Var6.o;
                } else if (!e9Var.V && e9Var.A && e9Var.Y != null) {
                    if (z18) {
                        formatPluralString3 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    } else {
                        String str2 = z16 ? "StoryKeepInfo" : z17 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i45 = e9Var.M;
                        if (i45 == Integer.MAX_VALUE) {
                            i45 = 86400;
                        }
                        formatPluralString3 = LocaleController.formatPluralString(str2, i45 / 3600, new Object[0]);
                    }
                    arrayList5.add(m8.g(formatPluralString3));
                    m8Var6.o = AndroidUtilities.dp(f9) + m8Var6.o;
                }
                if (e9Var.y || e9Var.G || e9Var.H) {
                    m8Var = m8Var6;
                } else {
                    TLRPC.InputPeer inputPeer2 = e9Var.c;
                    if (inputPeer2 != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    } else {
                        i19 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i19).getClientUserId();
                    }
                    long j10 = clientUserId;
                    e9Var.i1().B(j10, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                        m8Var2 = m8Var6;
                    } else {
                        m8Var2 = m8Var6;
                        if (hashSet.size() < 3) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                lh.l6 b10 = e9Var.i1().B(j10, true).b(((Integer) it3.next()).intValue());
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
                    arrayList5.add(m8.b(LocaleController.getString(R.string.StoriesAlbum), sb2, 1));
                    m8Var = m8Var2;
                    m8Var.o = AndroidUtilities.dp(50.0f) + m8Var.o;
                }
                if (!e9Var.V && ((!e9Var.A || e9Var.Y == null) && !(z19 = e9Var.G) && !e9Var.H)) {
                    if (z19) {
                        if (z16) {
                            str = "StoryKeepInfo";
                        } else if (z17) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i46 = e9Var.M;
                        if (i46 == Integer.MAX_VALUE) {
                            i46 = 86400;
                        }
                        formatPluralString2 = LocaleController.formatPluralString(str, i46 / 3600, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    }
                    arrayList5.add(m8.g(formatPluralString2));
                    m8Var.o = AndroidUtilities.dp(f9) + m8Var.o;
                }
                if (e9Var.y && e9Var.A && e9Var.Y != null) {
                    String string9 = LocaleController.getString(R.string.StoryEditCover);
                    BitmapDrawable bitmapDrawable = e9Var.X;
                    m8 m8Var16 = new m8(9, false);
                    m8Var16.e = string9;
                    m8Var16.d = bitmapDrawable;
                    m8Var16.q = 0;
                    arrayList5.add(m8Var16);
                    m8Var.o = AndroidUtilities.dp(50.0f) + m8Var.o;
                    arrayList5.add(m8.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    m8Var.o = AndroidUtilities.dp(72.0f) + m8Var.o;
                }
                if (e9Var.H) {
                    arrayList5.add(m8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                    m8Var.o = AndroidUtilities.dp(50.0f) + m8Var.o;
                    arrayList5.add(m8.g(null));
                    m8Var.o = AndroidUtilities.dp(52.0f) + m8Var.o;
                }
                if (e9Var.G && e9Var.w) {
                    String string10 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                    m8 m8Var17 = new m8(8, false);
                    m8Var17.e = string10;
                    arrayList5.add(m8Var17);
                    m8Var.o = AndroidUtilities.dp(40.0f) + m8Var.o;
                    m8 m8Var18 = new m8(10, false);
                    m8Var18.q = 8;
                    arrayList5.add(m8Var18);
                    m8Var.o = AndroidUtilities.dp(75.0f) + m8Var.o;
                    arrayList5.add(m8.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    m8Var.o = AndroidUtilities.dp(50.0f) + m8Var.o;
                }
            }
            z17 = false;
            z16 = true;
            m8 g102 = m8.g(null);
            g102.c = !z16 ? 1 : 2;
            arrayList5.add(g102);
            m8Var6.o = AndroidUtilities.dp(12.0f) + m8Var6.o;
            if (z16) {
            }
            if (z16) {
            }
            f9 = 80.0f;
            if (!e9Var.V) {
            }
            z18 = e9Var.G;
            String str3 = "StoryKeepGroupInfo";
            if (z18) {
            }
            arrayList5.add(m8.g(null));
            m8Var6.o = AndroidUtilities.dp(12.0f) + m8Var6.o;
            if (e9Var.y) {
            }
            m8Var = m8Var6;
            if (!e9Var.V) {
                if (z19) {
                }
                arrayList5.add(m8.g(formatPluralString2));
                m8Var.o = AndroidUtilities.dp(f9) + m8Var.o;
            }
            if (e9Var.y) {
                String string92 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable2 = e9Var.X;
                m8 m8Var162 = new m8(9, false);
                m8Var162.e = string92;
                m8Var162.d = bitmapDrawable2;
                m8Var162.q = 0;
                arrayList5.add(m8Var162);
                m8Var.o = AndroidUtilities.dp(50.0f) + m8Var.o;
                arrayList5.add(m8.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                m8Var.o = AndroidUtilities.dp(72.0f) + m8Var.o;
            }
            if (e9Var.H) {
            }
            if (e9Var.G) {
                String string102 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                m8 m8Var172 = new m8(8, false);
                m8Var172.e = string102;
                arrayList5.add(m8Var172);
                m8Var.o = AndroidUtilities.dp(40.0f) + m8Var.o;
                m8 m8Var182 = new m8(10, false);
                m8Var182.q = 8;
                arrayList5.add(m8Var182);
                m8Var.o = AndroidUtilities.dp(75.0f) + m8Var.o;
                arrayList5.add(m8.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                m8Var.o = AndroidUtilities.dp(50.0f) + m8Var.o;
            }
        }
        z17 = false;
        z16 = true;
        if (z16) {
        }
        f9 = 80.0f;
        if (!e9Var.V) {
        }
        z18 = e9Var.G;
        String str32 = "StoryKeepGroupInfo";
        if (z18) {
        }
        arrayList5.add(m8.g(null));
        m8Var6.o = AndroidUtilities.dp(12.0f) + m8Var6.o;
        if (e9Var.y) {
        }
        m8Var = m8Var6;
        if (!e9Var.V) {
        }
        if (e9Var.y) {
        }
        if (e9Var.H) {
        }
        if (e9Var.G) {
        }
        dp = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.E);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        u8Var = this.n;
        if (u8Var != null) {
        }
        this.e.invalidate();
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.s3 s3Var = this.y;
        if (s3Var == null) {
            return;
        }
        if (e9.l1(this.c, this.d).size() > 0) {
            s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new n8(this, 2));
            return;
        }
        if (z10) {
            s3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.r3 r3Var = s3Var.b;
        r3Var.c(null, false, true);
        r3Var.setOnClickListener(null);
        r3Var.setVisibility(0);
    }

    public final void i(boolean z10) {
        int i10;
        r8 r8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        org.telegram.ui.ActionBar.c6 c6Var;
        HashSet l1 = e9.l1(this.c, this.d);
        int i11 = this.a;
        e9 e9Var = this.S;
        if (i11 == 3) {
            e9Var.s = l1.size();
        } else if (i11 == 4) {
            e9Var.f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            r8Var = this.x;
            ArrayList arrayList4 = r8Var.d;
            arrayList = r8Var.d;
            if (i13 >= arrayList4.size()) {
                break;
            }
            j30 j30Var = (j30) arrayList.get(i13);
            if (!l1.contains(Long.valueOf(j30Var.getUid()))) {
                arrayList2.add(j30Var);
            }
            i13++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    Object user = longValue >= 0 ? messagesController.getUser(l10) : messagesController.getChat(l10);
                    if (user != null) {
                        Context context = getContext();
                        c6Var = ((org.telegram.ui.ActionBar.f3) e9Var).resourcesProvider;
                        j30 j30Var2 = new j30(context, user, null, true, c6Var);
                        j30Var2.setOnClickListener(this);
                        arrayList3.add(j30Var2);
                    }
                } else if (((j30) arrayList.get(i14)).getUid() == longValue) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ig.j jVar = r8Var.c;
        ArrayList arrayList5 = jVar.e;
        ArrayList arrayList6 = jVar.d;
        ArrayList arrayList7 = jVar.f;
        b9 b9Var = (b9) jVar.n;
        b9Var.C = true;
        ArrayList arrayList8 = b9Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = jVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            ((j30) arrayList2.get(i15)).setOnClickListener(null);
        }
        jVar.c();
        if (z10) {
            jVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.b = animatorSet;
            animatorSet.addListener(new a9(jVar, arrayList2, i12));
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
                j30 j30Var3 = (j30) arrayList2.get(i16);
                arrayList5.add(j30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(j30Var3, (Property<j30, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(j30Var3, (Property<j30, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(j30Var3, (Property<j30, Float>) property, 1.0f, 0.0f));
                i16++;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                j30 j30Var4 = (j30) arrayList3.get(i17);
                arrayList6.add(j30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(j30Var4, (Property<j30, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(j30Var4, (Property<j30, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(j30Var4, (Property<j30, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                jVar.removeView((View) arrayList2.get(i18));
            }
            arrayList9.clear();
            jVar.b = null;
            jVar.c = false;
            b9Var.a.setAllowDrawCursor(true);
        }
        while (i12 < arrayList3.size()) {
            jVar.addView((View) arrayList3.get(i12));
            i12++;
        }
        jVar.requestLayout();
    }

    public final void j() {
        float c3 = c();
        boolean z10 = this.I;
        boolean z11 = false;
        r8 r8Var = this.x;
        if (z10 || this.Q || getTranslationX() != 0.0f) {
            this.J = false;
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            r8Var.setTranslationY(c3);
        } else if (!this.J || Math.abs(this.K - c3) > 1.0f) {
            this.J = true;
            ValueAnimator valueAnimator2 = this.L;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.L = null;
            }
            float translationY = r8Var.getTranslationY();
            this.K = c3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c3);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new lh.d5(this, 14));
            this.L.addListener(new q5(this, 3));
            this.L.setInterpolator(new LinearInterpolator());
            this.L.setDuration(180L);
            this.L.start();
        }
        boolean z12 = this.B;
        l8 l8Var = this.A;
        if (!z12) {
            l8Var.setVisibility(8);
            return;
        }
        l8Var.setVisibility(0);
        float f9 = -l8Var.getHeight();
        int i10 = 0;
        while (true) {
            jl0 jl0Var = this.f;
            if (i10 >= jl0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = jl0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f9 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i10++;
        }
        if (this.M != z11) {
            this.M = z11;
            ((org.telegram.ui.ActionBar.h2) l8Var.e).c((z11 || this.a != 0) ? 0.0f : 1.0f, true);
        }
        l8Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f9));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r8 r8Var = this.x;
        if (!r8Var.d.contains(view)) {
            return;
        }
        j30 j30Var = (j30) view;
        if (!j30Var.y) {
            j30 j30Var2 = r8Var.e;
            if (j30Var2 != null) {
                j30Var2.a();
                r8Var.e = null;
            }
            r8Var.e = j30Var;
            j30Var.b();
            return;
        }
        r8Var.e = null;
        ig.j jVar = r8Var.c;
        b9 b9Var = (b9) jVar.n;
        b9Var.C = true;
        b9Var.d.remove(j30Var);
        j30Var.setOnClickListener(null);
        jVar.c();
        jVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        jVar.b = animatorSet;
        animatorSet.addListener(new bg.c3(10, jVar, j30Var));
        ArrayList arrayList = jVar.h;
        arrayList.clear();
        arrayList.add(j30Var);
        ArrayList arrayList2 = jVar.d;
        arrayList2.clear();
        jVar.e.clear();
        arrayList2.add(j30Var);
        ArrayList arrayList3 = jVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.ALPHA, 1.0f, 0.0f));
        jVar.requestLayout();
        long uid = j30Var.getUid();
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
        i10 = ((org.telegram.ui.ActionBar.f3) this.S).currentAccount;
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
        e9 e9Var = this.S;
        i12 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardHeight;
        if (i12 > 0) {
            i13 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardHeight;
            this.P = i13;
        }
        super.onMeasure(i10, i11);
        this.e.setPadding(0, AndroidUtilities.statusBarHeight + (this.a == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
        boolean z17 = this.R;
        z10 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
        jl0 jl0Var = this.f;
        w8 w8Var = this.r;
        if (z17 != z10) {
            float c3 = c();
            z11 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
            int i14 = 2;
            if (z11 && c3 + Math.min(AndroidUtilities.dp(150.0f), this.x.F) > jl0Var.getPaddingTop()) {
                uh.n nVar = new uh.n(getContext(), 2, 0.7f);
                nVar.a = 1;
                nVar.p = -AndroidUtilities.dp(56.0f);
                this.h.w0(nVar);
            }
            int i15 = this.a;
            View view = this.s;
            if (i15 == 0) {
                z15 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                w8Var.setTranslationY(z15 ? this.P : 0.0f);
                z16 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                view.setTranslationY(z16 ? this.P : 0.0f);
            } else {
                z12 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                float f9 = z12 ? this.P : -this.P;
                ValueAnimator valueAnimator = w8Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    w8Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                w8Var.d = ofFloat;
                ofFloat.addUpdateListener(new v8(w8Var, 1));
                w8Var.d.addListener(new q5(w8Var, 4));
                w8Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = w8Var.d;
                jr jrVar = org.telegram.ui.ActionBar.q1.w;
                valueAnimator2.setInterpolator(jrVar);
                w8Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                view.setTranslationY(z13 ? this.P : -this.P);
                this.Q = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(jrVar).withEndAction(new o8(this, i14)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
            this.R = z14;
        }
        jl0Var.setPadding(0, 0, 0, w8Var.getMeasuredHeight());
    }
}
