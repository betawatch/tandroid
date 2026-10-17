package ei;

import ai.le;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.v30;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class k9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final x8 E;
    public boolean F;
    public org.telegram.ui.ActionBar.b2 G;
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
    public final /* synthetic */ r9 W;
    public int a;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final im0 f;
    public final s4.b0 h;
    public final g9 n;
    public final i9 r;
    public final View s;
    public final d v;
    public final d w;
    public final d9 x;
    public final org.telegram.ui.Cells.u3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(r9 r9Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.ActionBar.d6 d6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var6;
        org.telegram.ui.ActionBar.d6 d6Var7;
        org.telegram.ui.ActionBar.d6 d6Var8;
        org.telegram.ui.ActionBar.d6 d6Var9;
        this.W = r9Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        d6Var = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, d6Var);
        this.y = u3Var;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        d9 d9Var = new d9(this, context, d6Var2, new a9(this, 4));
        this.x = d9Var;
        int i12 = org.telegram.ui.ActionBar.h6.h5;
        d9Var.setBackgroundColor(r9Var.getThemedColor(i12));
        d9Var.setOnSearchTextChange(new b9(this, 3));
        d6Var3 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        x8 x8Var = new x8(context, d6Var3);
        this.E = x8Var;
        x8Var.h = new a9(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var4 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        im0 im0Var = new im0(context, d6Var4);
        this.f = im0Var;
        im0Var.setClipToPadding(false);
        im0Var.setTranslateSelector(true);
        d6Var5 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        g9 g9Var = new g9(this, context, d6Var5, d9Var, new ci.e4(r9Var, 2));
        this.n = g9Var;
        im0Var.setAdapter(g9Var);
        g9Var.h = im0Var;
        s4.b0 b0Var = new s4.b0();
        this.h = b0Var;
        im0Var.setLayoutManager(b0Var);
        im0Var.setOnScrollListener(new e9(this, 0));
        im0Var.setOnItemClickListener(new ah.h0(11, this, context));
        frameLayout.addView(im0Var, w7.z5.d(-1.0f, -1));
        f9 f9Var = new f9(this);
        f9Var.n(350L);
        f9Var.o(bs.h);
        f9Var.C = false;
        f9Var.m = false;
        im0Var.setItemAnimator(f9Var);
        frameLayout.addView(d9Var, w7.z5.e(-1, -2, 55));
        frameLayout.addView(u3Var, w7.z5.e(-1, 32, 55));
        addView(x8Var, w7.z5.e(-1, -2, 55));
        i9 i9Var = new i9(this, context);
        this.r = i9Var;
        i9Var.setClickable(true);
        i9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) r9Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) r9Var).backgroundPaddingLeft;
        i9Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        d6Var6 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        i9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var6));
        d6Var7 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        d dVar = new d(context, d6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new z8(this, 0));
        dVar.e();
        i9Var.addView(dVar, w7.z5.q(-1, 48, 87));
        d6Var8 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        d dVar2 = new d(context, d6Var8, false);
        this.w = dVar2;
        dVar2.setOnClickListener(new z8(this, 1));
        dVar2.e();
        i9Var.addView(dVar2, w7.z5.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        d6Var9 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var9));
        addView(view, w7.z5.a(500.0f, 0.0f, 0.0f, 0.0f, -500.0f, -1, 87));
        addView(i9Var, w7.z5.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
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
        r9 r9Var = this.W;
        if (i10 == 4) {
            arrayList.addAll(r9Var.d);
            hashMap.putAll(r9Var.e);
        } else if (i10 == 5) {
            arrayList.addAll(r9Var.J);
        } else if (i10 == 1) {
            ArrayList K0 = r9.K0(r9Var);
            for (int i11 = 0; i11 < K0.size(); i11 = com.google.android.gms.internal.cast.a6.h(((TLRPC.User) K0.get(i11)).id, arrayList, i11, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(r9Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(r9Var.n);
            hashMap.putAll(r9Var.r);
        } else if (i10 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        i(false);
        d9 d9Var = this.x;
        d9Var.setText("");
        d9Var.setVisibility(i10 == 0 ? 8 : 0);
        d9Var.K = true;
        this.I = null;
        g(false);
        e(false);
        f(false);
        int i12 = this.a;
        im0 im0Var = this.f;
        if (i12 != 0) {
            im0Var.u0(0);
        }
        im0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -org.telegram.messenger.q.b(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.x.J), 0);
        while (true) {
            im0 im0Var = this.f;
            if (i10 >= im0Var.getChildCount()) {
                return f7;
            }
            View childAt = im0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f7, childAt.getY());
            }
            i10++;
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int i12 = 0;
        boolean z10 = i11 == 1 || i11 == 2;
        r9 r9Var = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
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
            this.x.K = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            d6Var2 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var2);
            alertDialog$Builder.a.T = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.o();
            return;
        }
        Context context2 = getContext();
        d6Var = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, d6Var);
        alertDialog$Builder2.a.T = arrayList2.size() + " members are not in your contact list";
        alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new ai.f(this, j10, arrayList, 1));
        alertDialog$Builder2.h("Cancel", null);
        alertDialog$Builder2.o();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.b2 b2Var;
        if (i10 != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (b2Var = this.G) == null || this.H != chatFull.id) {
            return;
        }
        b2Var.c(350L);
        this.G = null;
        this.H = -1L;
        d(chatFull.id, chatFull.participants);
    }

    public final void e(boolean z10) {
        int i10;
        int i11 = this.a;
        r9 r9Var = this.W;
        d dVar = this.w;
        int i12 = 0;
        d dVar2 = this.v;
        if (i11 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.b(0, z10);
            if (r9Var.L) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (r9Var.Z) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i13 = r9Var.I;
                if (i13 == 1) {
                    dVar2.g(LocaleController.getString(r9Var.K ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z10, true);
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
        i9 i9Var = this.r;
        if (i11 == 3) {
            int size = r9.m1(arrayList, this.d).size();
            r9Var.s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            i9Var.b(size <= 0, z10);
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
                int size2 = r9.m1(r9Var.d, r9Var.e).size();
                r9Var.f = size2;
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.setShowZero(false);
                i9Var.b(false, z10);
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
        i10 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
        ci.i7 storiesController = MessagesController.getInstance(i10).getStoriesController();
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
        r9 r9Var = this.W;
        ArrayList arrayList2 = r9Var.J;
        HashMap hashMap = r9Var.r;
        ArrayList arrayList3 = r9Var.n;
        ArrayList arrayList4 = r9Var.h;
        HashMap hashMap2 = r9Var.e;
        ArrayList arrayList5 = r9Var.d;
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
        if (this.a == 3 && (r9Var.N != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    r9Var.N = i11;
                }
            } else {
                this.R = r9Var.N;
                r9Var.N = 3;
            }
        }
        HashSet m12 = r9.m1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            if (i12 >= arrayList.size()) {
                break;
            }
            y8 y8Var = (y8) arrayList.get(i12);
            if (y8Var != null) {
                int i13 = y8Var.i;
                if (i13 > 0) {
                    y8Var.k = r9Var.N == i13;
                    y8Var.l = false;
                } else {
                    TLRPC.User user = y8Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        y8Var.k = contains;
                        y8Var.l = !contains && m12.contains(Long.valueOf(y8Var.g.id));
                    } else {
                        TLRPC.Chat chat = y8Var.h;
                        if (chat != null) {
                            y8Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            y8Var.l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            im0 im0Var = this.f;
            if (i14 >= im0Var.getChildCount()) {
                h(z10);
                return;
            }
            View childAt = im0Var.getChildAt(i14);
            if ((childAt instanceof q9) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                y8 y8Var2 = (y8) arrayList.get(R);
                q9 q9Var = (q9) childAt;
                q9Var.c(y8Var2.k || y8Var2.l, z10);
                TLRPC.Chat chat2 = y8Var2.h;
                if (chat2 != null) {
                    q9Var.b(r9.e1(r9Var, chat2) > 200 ? 0.3f : 1.0f, z10);
                } else {
                    if (y8Var2.l && !y8Var2.k) {
                        r8 = 0.5f;
                    }
                    q9Var.b(r8, z10);
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
        g9 g9Var;
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
        y8 y8Var;
        boolean z19;
        String formatPluralString2;
        int i20;
        long clientUserId;
        y8 y8Var2;
        String formatPluralString3;
        int i21;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        r9 r9Var = this.W;
        ArrayList arrayList = r9Var.n;
        ArrayList arrayList2 = r9Var.d;
        ArrayList arrayList3 = r9Var.h;
        HashSet hashSet = r9Var.v;
        ArrayList arrayList4 = this.K;
        arrayList4.clear();
        ArrayList arrayList5 = this.L;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        int i27 = this.a;
        org.telegram.ui.Cells.u3 u3Var = this.y;
        if (i27 != 0) {
            x8 x8Var = this.E;
            if (i27 == 1) {
                x8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                x8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) x8Var.e).c(0.0f, false);
                arrayList5.add(y8.d());
                arrayList5.add(y8.c());
                arrayList5.size();
                arrayList5.add(y8.e());
                arrayList5.add(y8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                h(z10);
                this.F = true;
            } else if (i27 == 2) {
                x8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                x8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) x8Var.e).c(0.0f, false);
                arrayList5.add(y8.d());
                arrayList5.add(y8.c());
                arrayList5.size();
                arrayList5.add(y8.e());
                arrayList5.add(y8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                h(z10);
                this.F = true;
            } else if (i27 == 3) {
                x8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                x8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) x8Var.e).c(0.0f, false);
                arrayList5.add(y8.d());
                arrayList5.add(y8.c());
                arrayList5.size();
                arrayList5.add(y8.e());
                arrayList5.add(y8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                h(z10);
                this.F = true;
            } else if (i27 == 5) {
                x8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                x8Var.d(r9Var.O);
                ((org.telegram.ui.ActionBar.g2) x8Var.e).c(0.0f, false);
                arrayList5.add(y8.d());
                arrayList5.add(y8.c());
                arrayList5.size();
                arrayList5.add(y8.e());
                arrayList5.add(y8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                h(z10);
                this.F = true;
            } else if (i27 == 6) {
                x8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                x8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) x8Var.e).c(0.0f, false);
                arrayList5.add(y8.d());
                arrayList5.add(y8.c());
                arrayList5.size();
                arrayList5.add(y8.e());
                arrayList5.add(y8.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                h(z10);
                this.F = true;
            } else if (i27 == 4) {
                x8Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                x8Var.d(true);
                ((org.telegram.ui.ActionBar.g2) x8Var.e).c(0.0f, false);
                arrayList5.add(y8.d());
                arrayList5.add(y8.c());
                arrayList5.size();
                arrayList5.add(y8.e());
                arrayList5.add(y8.f());
                dp = AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(32.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                h(z10);
                this.F = true;
                boolean isEmpty = TextUtils.isEmpty(this.I);
                if (this.a != 0) {
                    String lowerCase = AndroidUtilities.translitSafe(this.I).toLowerCase();
                    int i28 = this.a;
                    ArrayList Z0 = i28 == 5 ? r9.Z0(r9Var) : r9.a1(r9Var, i28 == 1 || i28 == 2, r9Var.Y && (i28 == 3 || i28 == 6));
                    ArrayList arrayList6 = this.c;
                    HashMap hashMap = this.d;
                    HashSet m12 = r9.m1(arrayList6, hashMap);
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
                                y8 i32 = y8.i(user, contains, !contains && m12.contains(Long.valueOf(user.id)));
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
                                    y8 y8Var3 = new y8(3, true);
                                    y8Var3.h = chat;
                                    y8Var3.k = containsKey2;
                                    int i34 = this.a;
                                    y8Var3.m = i34 == 2 || i34 == 4;
                                    arrayList5.add(y8Var3);
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
                                    if (!lowerCase2.startsWith(lowerCase) && !wh.w(" ", lowerCase, lowerCase2)) {
                                        String lowerCase3 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user2)).toLowerCase();
                                        if (!lowerCase3.startsWith(lowerCase) && !wh.w(" ", lowerCase, lowerCase3)) {
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
                                        if (!lowerCase4.startsWith(lowerCase) && !wh.w(" ", lowerCase, lowerCase4)) {
                                            String lowerCase5 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat2)).toLowerCase();
                                            if (!lowerCase5.startsWith(lowerCase) && !wh.w(" ", lowerCase, lowerCase5)) {
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
                                        y8 i38 = y8.i(user3, contains2, !contains2 && m12.contains(Long.valueOf(user3.id)));
                                        int i39 = this.a;
                                        i38.m = i39 == 2 || i39 == 4;
                                        arrayList5.add(i38);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                    } else if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat3 = (TLRPC.Chat) tLObject3;
                                        boolean containsKey3 = hashMap.containsKey(Long.valueOf(chat3.id));
                                        y8 y8Var4 = new y8(3, true);
                                        y8Var4.h = chat3;
                                        y8Var4.k = containsKey3;
                                        int i40 = this.a;
                                        if (i40 != 2 && i40 != 4) {
                                            z14 = false;
                                            y8Var4.m = z14;
                                            arrayList5.add(y8Var4);
                                            dp += AndroidUtilities.dp(56.0f);
                                            i10++;
                                            i35 = i12 + 1;
                                        }
                                        z14 = true;
                                        y8Var4.m = z14;
                                        arrayList5.add(y8Var4);
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
                            arrayList5.add(new y8(5, false));
                            dp += AndroidUtilities.dp(150.0f);
                        } else {
                            i11 = 0;
                        }
                        im0 im0Var = this.f;
                        if (im0Var != null) {
                            int measuredHeight = (im0Var.getMeasuredHeight() - im0Var.getPaddingTop()) - im0Var.getPaddingBottom();
                            z12 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                            dp3 = measuredHeight + (z12 ? this.T : i11);
                        } else {
                            dp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        float f11 = dp3 - dp;
                        if (f11 > 0.0f) {
                            y8 y8Var5 = new y8(-1, false);
                            y8Var5.p = (int) f11;
                            arrayList5.add(y8Var5);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList5);
                }
                g9Var = this.n;
                if (g9Var != null) {
                    if (!z10 || r9Var.N == 0) {
                        g9Var.l();
                    } else {
                        g9Var.E(arrayList4, arrayList5);
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
            g9Var = this.n;
            if (g9Var != null) {
            }
            this.e.invalidate();
        }
        this.F = false;
        u3Var.setVisibility(8);
        i15 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
        ArrayList arrayList10 = MessagesController.getInstance(i15).getStoriesController().T;
        y8 y8Var6 = new y8(-1, false);
        y8Var6.o = 24;
        arrayList5.add(y8Var6);
        if (r9Var.L) {
            String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
            y8 y8Var7 = new y8(11, false);
            y8Var7.e = string;
            arrayList5.add(y8Var7);
            y8Var6.o = AndroidUtilities.dp(72.0f) + y8Var6.o;
        } else if (r9Var.F && (r9Var.Z || arrayList10 == null || arrayList10.size() <= 1)) {
            String string2 = r9Var.Z ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(r9Var.K ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
            if (r9Var.K) {
                formatPluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
            } else {
                int i41 = r9Var.Q;
                formatPluralString = i41 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i41 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
            }
            y8 y8Var8 = new y8(4, false);
            y8Var8.e = string2;
            y8Var8.f = formatPluralString;
            arrayList5.add(y8Var8);
            y8Var6.o = AndroidUtilities.dp(72.0f) + y8Var6.o;
        } else {
            String string3 = LocaleController.getString(r9Var.K ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
            y8 y8Var9 = new y8(8, false);
            y8Var9.e = string3;
            arrayList5.add(y8Var9);
            y8Var6.o = AndroidUtilities.dp(50.0f) + y8Var6.o;
            TLRPC.InputPeer inputPeer = r9Var.c;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                i16 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                y8 i42 = y8.i(UserConfig.getInstance(i16).getCurrentUser(), false, false);
                i42.n = true;
                arrayList5.add(i42);
                y8Var6.o = AndroidUtilities.dp(62.0f) + y8Var6.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                i19 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                y8 i43 = y8.i(MessagesController.getInstance(i19).getUser(Long.valueOf(r9Var.c.user_id)), false, false);
                i43.n = true;
                arrayList5.add(i43);
                y8Var6.o = AndroidUtilities.dp(62.0f) + y8Var6.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    i18 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i18).getChat(Long.valueOf(r9Var.c.channel_id));
                    y8 y8Var10 = new y8(3, true);
                    y8Var10.h = chat4;
                    y8Var10.k = false;
                    y8Var10.n = true;
                    arrayList5.add(y8Var10);
                    z17 = ChatObject.isChannelAndNotMegaGroup(chat4);
                    y8Var6.o = AndroidUtilities.dp(104.0f) + y8Var6.o;
                    z16 = false;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    i17 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i17).getChat(Long.valueOf(r9Var.c.chat_id));
                    y8 y8Var11 = new y8(3, true);
                    y8Var11.h = chat5;
                    y8Var11.k = false;
                    y8Var11.n = true;
                    arrayList5.add(y8Var11);
                    y8Var6.o = AndroidUtilities.dp(104.0f) + y8Var6.o;
                    z17 = false;
                    z16 = false;
                }
                y8 g10 = y8.g(null);
                g10.c = !z16 ? 1 : 2;
                arrayList5.add(g10);
                y8Var6.o = AndroidUtilities.dp(12.0f) + y8Var6.o;
                if (z16) {
                    String string4 = LocaleController.getString(r9Var.K ? R.string.StoryLivePrivacyWhoCanView : R.string.StoryPrivacyWhoCanView);
                    y8 y8Var12 = new y8(8, false);
                    y8Var12.e = string4;
                    arrayList5.add(y8Var12);
                    y8Var6.o = AndroidUtilities.dp(40.0f) + y8Var6.o;
                }
                if (z16 || r9Var.L) {
                    f7 = 80.0f;
                } else {
                    y8 h = y8.h(4, r9Var.f, r9Var.N == 4);
                    arrayList5.add(h);
                    y8Var6.o = AndroidUtilities.dp(56.0f) + y8Var6.o;
                    f7 = 80.0f;
                    if (r9Var.f == 1) {
                        if (arrayList2.size() != 1) {
                            Iterator it = r9Var.e.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList11 = (ArrayList) it.next();
                                if (arrayList11.size() >= 1) {
                                    i25 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                                    h.g = MessagesController.getInstance(i25).getUser((Long) arrayList11.get(0));
                                    break;
                                }
                            }
                        } else {
                            i26 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                            h.g = MessagesController.getInstance(i26).getUser((Long) arrayList2.get(0));
                        }
                    }
                    y8 h10 = y8.h(2, arrayList3.size(), r9Var.N == 2);
                    arrayList5.add(h10);
                    y8Var6.o = AndroidUtilities.dp(56.0f) + y8Var6.o;
                    if (arrayList3.size() == 1) {
                        i24 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                        h10.g = MessagesController.getInstance(i24).getUser((Long) arrayList3.get(0));
                    }
                    ArrayList K0 = r9.K0(r9Var);
                    y8 h11 = y8.h(1, K0.size(), r9Var.N == 1);
                    arrayList5.add(h11);
                    y8Var6.o = AndroidUtilities.dp(56.0f) + y8Var6.o;
                    if (K0.size() == 1 && (K0.get(0) instanceof TLRPC.User)) {
                        h11.g = (TLRPC.User) K0.get(0);
                    }
                    y8 h12 = y8.h(3, r9Var.s, r9Var.N == 3);
                    arrayList5.add(h12);
                    y8Var6.o = AndroidUtilities.dp(56.0f) + y8Var6.o;
                    if (r9Var.s == 1) {
                        if (arrayList.size() != 1) {
                            Iterator it2 = r9Var.r.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList12 = (ArrayList) it2.next();
                                if (arrayList12.size() >= 1) {
                                    i22 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                                    h12.g = MessagesController.getInstance(i22).getUser((Long) arrayList12.get(0));
                                    break;
                                }
                            }
                        } else {
                            i23 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                            h12.g = MessagesController.getInstance(i23).getUser((Long) arrayList.get(0));
                        }
                    }
                    i21 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                    int i44 = MessagesController.getInstance(i21).getStoriesController().N;
                    String string5 = i44 <= 0 ? LocaleController.getString(r9Var.K ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(r9Var.K ? "StoryLiveBlockList" : "StoryBlockList", i44, new Object[0]);
                    int i45 = org.telegram.ui.ActionBar.h6.gc;
                    a9 a9Var = new a9(this, 3);
                    d6Var = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
                    arrayList5.add(y8.g(AndroidUtilities.replaceSingleTag(string5, i45, 0, a9Var, d6Var)));
                    y8Var6.o = AndroidUtilities.dp(80.0f) + y8Var6.o;
                }
                if (!r9Var.Z) {
                    if (r9Var.K && !r9Var.L) {
                        if (r9Var.G) {
                            arrayList5.add(y8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                            y8Var6.o = AndroidUtilities.dp(50.0f) + y8Var6.o;
                            arrayList5.add(y8.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                            y8Var6.o = AndroidUtilities.dp(50.0f) + y8Var6.o;
                            arrayList5.add(y8.g(null));
                            y8Var6.o = AndroidUtilities.dp(12.0f) + y8Var6.o;
                        } else {
                            arrayList5.add(y8.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                            y8Var6.o = AndroidUtilities.dp(50.0f) + y8Var6.o;
                            arrayList5.add(y8.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            y8Var6.o = AndroidUtilities.dp(30.0f) + y8Var6.o;
                        }
                    }
                    if (r9Var.K) {
                        String string6 = LocaleController.getString(R.string.StoryLiveAllowComments);
                        boolean z20 = r9Var.w;
                        y8 y8Var13 = new y8(7, false);
                        y8Var13.c = 2;
                        y8Var13.e = string6;
                        y8Var13.k = z20;
                        arrayList5.add(y8Var13);
                        y8Var6.o = AndroidUtilities.dp(50.0f) + y8Var6.o;
                    }
                    if (!r9Var.L) {
                        String string7 = LocaleController.getString(R.string.StoryAllowScreenshots);
                        boolean z21 = r9Var.x;
                        y8 y8Var14 = new y8(7, false);
                        y8Var14.c = 0;
                        y8Var14.e = string7;
                        y8Var14.k = z21;
                        arrayList5.add(y8Var14);
                        y8Var6.o = AndroidUtilities.dp(50.0f) + y8Var6.o;
                    }
                    if (!r9Var.K && !r9Var.L) {
                        String string8 = LocaleController.getString(z16 ? R.string.StoryKeep : z17 ? R.string.StoryKeepChannel : R.string.StoryKeepGroup);
                        boolean z22 = r9Var.y;
                        y8 y8Var15 = new y8(7, false);
                        y8Var15.c = 1;
                        y8Var15.e = string8;
                        y8Var15.k = z22;
                        arrayList5.add(y8Var15);
                        y8Var6.o = AndroidUtilities.dp(50.0f) + y8Var6.o;
                    }
                }
                z18 = r9Var.K;
                String str = "StoryKeepGroupInfo";
                if (!z18 || r9Var.L) {
                    arrayList5.add(y8.g(null));
                    y8Var6.o = AndroidUtilities.dp(12.0f) + y8Var6.o;
                } else if (!r9Var.Z && r9Var.E && r9Var.c0 != null) {
                    if (z18) {
                        formatPluralString3 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    } else {
                        String str2 = z16 ? "StoryKeepInfo" : z17 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i46 = r9Var.Q;
                        if (i46 == Integer.MAX_VALUE) {
                            i46 = 86400;
                        }
                        formatPluralString3 = LocaleController.formatPluralString(str2, i46 / 3600, new Object[0]);
                    }
                    arrayList5.add(y8.g(formatPluralString3));
                    y8Var6.o = AndroidUtilities.dp(f7) + y8Var6.o;
                }
                if (r9Var.y || r9Var.K || r9Var.L) {
                    y8Var = y8Var6;
                } else {
                    TLRPC.InputPeer inputPeer2 = r9Var.c;
                    if (inputPeer2 != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    } else {
                        i20 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i20).getClientUserId();
                    }
                    long j10 = clientUserId;
                    r9Var.j1().B(j10, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                        y8Var2 = y8Var6;
                    } else {
                        y8Var2 = y8Var6;
                        if (hashSet.size() < 3) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                ci.b7 b10 = r9Var.j1().B(j10, true).b(((Integer) it3.next()).intValue());
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
                    arrayList5.add(y8.b(LocaleController.getString(R.string.StoriesAlbum), sb2, 1));
                    y8Var = y8Var2;
                    y8Var.o = AndroidUtilities.dp(50.0f) + y8Var.o;
                }
                if (!r9Var.Z && ((!r9Var.E || r9Var.c0 == null) && !(z19 = r9Var.K) && !r9Var.L)) {
                    if (z19) {
                        if (z16) {
                            str = "StoryKeepInfo";
                        } else if (z17) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i47 = r9Var.Q;
                        if (i47 == Integer.MAX_VALUE) {
                            i47 = 86400;
                        }
                        formatPluralString2 = LocaleController.formatPluralString(str, i47 / 3600, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.getString(z16 ? R.string.StoryLiveKeepInfo : z17 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    }
                    arrayList5.add(y8.g(formatPluralString2));
                    y8Var.o = AndroidUtilities.dp(f7) + y8Var.o;
                }
                if (r9Var.y && r9Var.E && r9Var.c0 != null) {
                    String string9 = LocaleController.getString(R.string.StoryEditCover);
                    BitmapDrawable bitmapDrawable = r9Var.b0;
                    y8 y8Var16 = new y8(9, false);
                    y8Var16.e = string9;
                    y8Var16.d = bitmapDrawable;
                    y8Var16.q = 0;
                    arrayList5.add(y8Var16);
                    y8Var.o = AndroidUtilities.dp(50.0f) + y8Var.o;
                    arrayList5.add(y8.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    y8Var.o = AndroidUtilities.dp(72.0f) + y8Var.o;
                }
                if (r9Var.L) {
                    arrayList5.add(y8.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                    y8Var.o = AndroidUtilities.dp(50.0f) + y8Var.o;
                    arrayList5.add(y8.g(null));
                    y8Var.o = AndroidUtilities.dp(52.0f) + y8Var.o;
                }
                if (r9Var.K && r9Var.w) {
                    String string10 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                    y8 y8Var17 = new y8(8, false);
                    y8Var17.e = string10;
                    arrayList5.add(y8Var17);
                    y8Var.o = AndroidUtilities.dp(40.0f) + y8Var.o;
                    y8 y8Var18 = new y8(10, false);
                    y8Var18.q = 8;
                    arrayList5.add(y8Var18);
                    y8Var.o = AndroidUtilities.dp(75.0f) + y8Var.o;
                    arrayList5.add(y8.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    y8Var.o = AndroidUtilities.dp(50.0f) + y8Var.o;
                }
            }
            z17 = false;
            z16 = true;
            y8 g102 = y8.g(null);
            g102.c = !z16 ? 1 : 2;
            arrayList5.add(g102);
            y8Var6.o = AndroidUtilities.dp(12.0f) + y8Var6.o;
            if (z16) {
            }
            if (z16) {
            }
            f7 = 80.0f;
            if (!r9Var.Z) {
            }
            z18 = r9Var.K;
            String str3 = "StoryKeepGroupInfo";
            if (z18) {
            }
            arrayList5.add(y8.g(null));
            y8Var6.o = AndroidUtilities.dp(12.0f) + y8Var6.o;
            if (r9Var.y) {
            }
            y8Var = y8Var6;
            if (!r9Var.Z) {
                if (z19) {
                }
                arrayList5.add(y8.g(formatPluralString2));
                y8Var.o = AndroidUtilities.dp(f7) + y8Var.o;
            }
            if (r9Var.y) {
                String string92 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable2 = r9Var.b0;
                y8 y8Var162 = new y8(9, false);
                y8Var162.e = string92;
                y8Var162.d = bitmapDrawable2;
                y8Var162.q = 0;
                arrayList5.add(y8Var162);
                y8Var.o = AndroidUtilities.dp(50.0f) + y8Var.o;
                arrayList5.add(y8.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                y8Var.o = AndroidUtilities.dp(72.0f) + y8Var.o;
            }
            if (r9Var.L) {
            }
            if (r9Var.K) {
                String string102 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                y8 y8Var172 = new y8(8, false);
                y8Var172.e = string102;
                arrayList5.add(y8Var172);
                y8Var.o = AndroidUtilities.dp(40.0f) + y8Var.o;
                y8 y8Var182 = new y8(10, false);
                y8Var182.q = 8;
                arrayList5.add(y8Var182);
                y8Var.o = AndroidUtilities.dp(75.0f) + y8Var.o;
                arrayList5.add(y8.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                y8Var.o = AndroidUtilities.dp(50.0f) + y8Var.o;
            }
        }
        z17 = false;
        z16 = true;
        if (z16) {
        }
        f7 = 80.0f;
        if (!r9Var.Z) {
        }
        z18 = r9Var.K;
        String str32 = "StoryKeepGroupInfo";
        if (z18) {
        }
        arrayList5.add(y8.g(null));
        y8Var6.o = AndroidUtilities.dp(12.0f) + y8Var6.o;
        if (r9Var.y) {
        }
        y8Var = y8Var6;
        if (!r9Var.Z) {
        }
        if (r9Var.y) {
        }
        if (r9Var.L) {
        }
        if (r9Var.K) {
        }
        dp = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.I);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        g9Var = this.n;
        if (g9Var != null) {
        }
        this.e.invalidate();
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.u3 u3Var = this.y;
        if (u3Var == null) {
            return;
        }
        if (r9.m1(this.c, this.d).size() > 0) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new z8(this, 2));
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
        d9 d9Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        org.telegram.ui.ActionBar.d6 d6Var;
        HashSet m12 = r9.m1(this.c, this.d);
        int i11 = this.a;
        r9 r9Var = this.W;
        if (i11 == 3) {
            r9Var.s = m12.size();
        } else if (i11 == 4) {
            r9Var.f = m12.size();
        }
        i10 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            d9Var = this.x;
            ArrayList arrayList4 = d9Var.d;
            arrayList = d9Var.d;
            if (i13 >= arrayList4.size()) {
                break;
            }
            v30 v30Var = (v30) arrayList.get(i13);
            if (!m12.contains(Long.valueOf(v30Var.getUid()))) {
                arrayList2.add(v30Var);
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
                        d6Var = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
                        v30 v30Var2 = new v30(context, user, null, true, d6Var);
                        v30Var2.setOnClickListener(this);
                        arrayList3.add(v30Var2);
                    }
                } else if (((v30) arrayList.get(i14)).getUid() == longValue) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        n9 n9Var = d9Var.c;
        ArrayList arrayList5 = n9Var.e;
        ArrayList arrayList6 = n9Var.d;
        ArrayList arrayList7 = n9Var.f;
        o9 o9Var = (o9) n9Var.n;
        o9Var.G = true;
        ArrayList arrayList8 = o9Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = n9Var.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            ((v30) arrayList2.get(i15)).setOnClickListener(null);
        }
        n9Var.c();
        if (z10) {
            n9Var.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            n9Var.b = animatorSet;
            animatorSet.addListener(new m9(n9Var, arrayList2, i12));
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
                v30 v30Var3 = (v30) arrayList2.get(i16);
                arrayList5.add(v30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(v30Var3, (Property<v30, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(v30Var3, (Property<v30, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(v30Var3, (Property<v30, Float>) property, 1.0f, 0.0f));
                i16++;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                v30 v30Var4 = (v30) arrayList3.get(i17);
                arrayList6.add(v30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(v30Var4, (Property<v30, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(v30Var4, (Property<v30, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(v30Var4, (Property<v30, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                n9Var.removeView((View) arrayList2.get(i18));
            }
            arrayList9.clear();
            n9Var.b = null;
            n9Var.c = false;
            o9Var.a.setAllowDrawCursor(true);
        }
        while (i12 < arrayList3.size()) {
            n9Var.addView((View) arrayList3.get(i12));
            i12++;
        }
        n9Var.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        d9 d9Var = this.x;
        if (z10 || this.U || getTranslationX() != 0.0f) {
            this.N = false;
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.P = null;
            }
            d9Var.setTranslationY(c10);
        } else if (!this.N || Math.abs(this.O - c10) > 1.0f) {
            this.N = true;
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.P = null;
            }
            float translationY = d9Var.getTranslationY();
            this.O = c10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new i6(this, 3));
            this.P.addListener(new ah.b(this, 23));
            this.P.setInterpolator(new LinearInterpolator());
            this.P.setDuration(180L);
            this.P.start();
        }
        boolean z12 = this.F;
        x8 x8Var = this.E;
        if (!z12) {
            x8Var.setVisibility(8);
            return;
        }
        x8Var.setVisibility(0);
        float f7 = -x8Var.getHeight();
        int i10 = 0;
        while (true) {
            im0 im0Var = this.f;
            if (i10 >= im0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = im0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f7 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i10++;
        }
        if (this.Q != z11) {
            this.Q = z11;
            ((org.telegram.ui.ActionBar.g2) x8Var.e).c((z11 || this.a != 0) ? 0.0f : 1.0f, true);
        }
        x8Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f7));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d9 d9Var = this.x;
        if (!d9Var.d.contains(view)) {
            return;
        }
        v30 v30Var = (v30) view;
        if (!v30Var.y) {
            v30 v30Var2 = d9Var.e;
            if (v30Var2 != null) {
                v30Var2.a();
                d9Var.e = null;
            }
            d9Var.e = v30Var;
            v30Var.b();
            return;
        }
        d9Var.e = null;
        n9 n9Var = d9Var.c;
        o9 o9Var = (o9) n9Var.n;
        o9Var.G = true;
        o9Var.d.remove(v30Var);
        v30Var.setOnClickListener(null);
        n9Var.c();
        n9Var.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        n9Var.b = animatorSet;
        animatorSet.addListener(new le(6, n9Var, v30Var));
        ArrayList arrayList = n9Var.h;
        arrayList.clear();
        arrayList.add(v30Var);
        ArrayList arrayList2 = n9Var.d;
        arrayList2.clear();
        n9Var.e.clear();
        arrayList2.add(v30Var);
        ArrayList arrayList3 = n9Var.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(v30Var, (Property<v30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(v30Var, (Property<v30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(v30Var, (Property<v30, Float>) View.ALPHA, 1.0f, 0.0f));
        n9Var.requestLayout();
        long uid = v30Var.getUid();
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
        i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
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
        r9 r9Var = this.W;
        i12 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardHeight;
        if (i12 > 0) {
            i13 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardHeight;
            this.T = i13;
        }
        super.onMeasure(i10, i11);
        this.e.setPadding(0, AndroidUtilities.statusBarHeight + (this.a == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
        boolean z17 = this.V;
        z10 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
        im0 im0Var = this.f;
        i9 i9Var = this.r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
            int i14 = 2;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.x.J) > im0Var.getPaddingTop()) {
                li.n nVar = new li.n(getContext(), 2, 0.7f);
                nVar.a = 1;
                nVar.p = -AndroidUtilities.dp(56.0f);
                this.h.w0(nVar);
            }
            int i15 = this.a;
            View view = this.s;
            if (i15 == 0) {
                z15 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                i9Var.setTranslationY(z15 ? this.T : 0.0f);
                z16 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                view.setTranslationY(z16 ? this.T : 0.0f);
            } else {
                z12 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                float f7 = z12 ? this.T : -this.T;
                ValueAnimator valueAnimator = i9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    i9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                i9Var.d = ofFloat;
                ofFloat.addUpdateListener(new h9(i9Var, 1));
                i9Var.d.addListener(new ah.b(i9Var, 24));
                i9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = i9Var.d;
                bs bsVar = org.telegram.ui.ActionBar.o1.w;
                valueAnimator2.setInterpolator(bsVar);
                i9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                view.setTranslationY(z13 ? this.T : -this.T);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(bsVar).withEndAction(new a9(this, i14)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
            this.V = z14;
        }
        im0Var.setPadding(0, 0, 0, i9Var.getMeasuredHeight());
    }
}
