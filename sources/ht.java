// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ht extends d implements jm7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final byte I;
    public boolean J;
    public final vh6 a;
    public gt b;
    public r34 c;
    public u46 d;
    public r59 e;
    public final HashSet f;
    public final ArrayList h;
    public boolean n;
    public boolean r;
    public boolean s;
    public pf2 w;
    public int x;
    public int y;

    /* JADX WARN: Multi-variable type inference failed */
    public ht(int i) {
        super(null);
        this.a = new vh6();
        this.f = new HashSet();
        this.h = new ArrayList();
        this.I = i;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.Ei));
        hashSet.add(Integer.valueOf(cmb.Ii));
        hashSet.add(Integer.valueOf(cmb.Hi));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final void b0() {
        if (this.J || this.r) {
            return;
        }
        byte b = 1;
        this.J = true;
        r34 r34Var = this.c;
        if (r34Var != null && !this.n) {
            r34Var.b();
        }
        gt gtVar = this.b;
        if (gtVar != null) {
            gtVar.f();
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        ArrayList arrayList = this.h;
        tL_messages_getArchivedStickers.offset_id = arrayList.isEmpty() ? 0L : ((TLRPC.StickerSetCovered) b10.f(1, arrayList)).set.id;
        tL_messages_getArchivedStickers.limit = 15;
        byte b2 = this.I;
        tL_messages_getArchivedStickers.masks = b2 == 1;
        tL_messages_getArchivedStickers.emojis = b2 == 5;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new tg(this, b)), this.classGuid);
    }

    public final void c0(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        if (this.s) {
            this.w = new pf2(this, tL_messages_archivedStickers, (byte) 25);
            return;
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i2);
            i2++;
            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
            Long valueOf = Long.valueOf(stickerSetCovered2.set.id);
            HashSet hashSet = this.f;
            if (!hashSet.contains(valueOf)) {
                hashSet.add(Long.valueOf(stickerSetCovered2.set.id));
                this.h.add(stickerSetCovered2);
                i++;
            }
        }
        this.r = i <= 0;
        this.J = false;
        this.n = true;
        r34 r34Var = this.c;
        if (r34Var != null) {
            r34Var.c();
        }
        d0();
        gt gtVar = this.b;
        if (gtVar != null) {
            gtVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        rja rjaVar = this.simpleActionBar;
        byte b = 5;
        byte b2 = this.I;
        if (b2 == 0) {
            rjaVar.setTitle(jb6.M0(2131754093, null));
        } else if (b2 == 5) {
            rjaVar.setTitle(jb6.M0(2131754099, null));
        } else {
            rjaVar.setTitle(jb6.M0(2131754098, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 2));
        this.b = new gt(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.c = r34Var;
        if (b2 == 0) {
            r34Var.setText(jb6.M0(2131754090, null));
        } else {
            r34Var.setText(jb6.M0(2131754095, null));
        }
        boolean z = this.J;
        r34 r34Var2 = this.c;
        if (z) {
            r34Var2.b();
        } else {
            r34Var2.c();
        }
        r59 r59Var = new r59(context, null);
        this.e = r59Var;
        r59Var.setFocusable(true);
        this.e.setEmptyView(this.c);
        r59 r59Var2 = this.e;
        u46 u46Var = new u46(1, false);
        this.d = u46Var;
        r59Var2.setLayoutManager(u46Var);
        this.e.r1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, qoe.c(-1.0f, -1));
        frameLayout.addView(this.c, qoe.c(-1.0f, -1));
        this.e.setAdapter(this.b);
        this.e.setOnItemClickListener(new u(this, b));
        this.e.setOnScrollListener(new y(this, (byte) 3));
        return this.fragmentView;
    }

    public final void d0() {
        int i;
        this.H = 0;
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.x = -1;
            this.y = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            return;
        }
        byte b = this.I;
        if (b == 0 || b == 5) {
            i = this.H;
            this.H = i + 1;
        } else {
            i = -1;
        }
        this.x = i;
        int i2 = this.H;
        this.y = i2;
        this.E = arrayList.size() + i2;
        int size = arrayList.size() + this.H;
        this.H = size;
        if (this.r) {
            this.H = size + 1;
            this.G = size;
            this.F = -1;
        } else {
            this.H = size + 1;
            this.F = size;
            this.G = -1;
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r59 r59Var;
        et etVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i != nm7.Y0) {
            if (i != nm7.x0 || (r59Var = this.e) == null) {
                return;
            }
            int childCount = r59Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.e.getChildAt(i3);
                if ((childAt instanceof et) && (stickersSet = (etVar = (et) childAt).getStickersSet()) != null) {
                    boolean D0 = hs6.d0(this.currentAccount).D0(stickersSet.set.id, true);
                    if (D0) {
                        this.a.l(stickersSet.set.id);
                        mu8 mu8Var = etVar.f;
                        if (mu8Var != null) {
                            mu8Var.a(false, true);
                        }
                    }
                    etVar.a(D0, true, false);
                }
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList((List) objArr[0]);
        int size = arrayList2.size() - 1;
        while (true) {
            arrayList = this.h;
            if (size < 0) {
                break;
            }
            int size2 = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    break;
                }
                if (((TLRPC.StickerSetCovered) arrayList.get(i4)).set.id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.id) {
                    arrayList2.remove(size);
                    break;
                }
                i4++;
            }
            size--;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.addAll(0, arrayList2);
        d0();
        gt gtVar = this.b;
        if (gtVar != null) {
            gtVar.p(this.y, arrayList2.size());
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        r34 r34Var = this.c;
        int i = cmb.g6;
        arrayList.add(new cnb(r34Var, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.e, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.e, 196608, new Class[]{et.class}, new String[]{"addButton"}, (Drawable[]) null, (bnb) null, cmb.Gi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        b0();
        d0();
        nm7.f(this.currentAccount).b(this, nm7.Y0);
        nm7.f(this.currentAccount).b(this, nm7.x0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.Y0);
        nm7.f(this.currentAccount).n(this, nm7.x0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        gt gtVar = this.b;
        if (gtVar != null) {
            gtVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            r34 r34Var = this.c;
            if (r34Var != null) {
                r34Var.setProgressBarColor(cmb.w0(null, cmb.g6, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        this.s = false;
        pf2 pf2Var = this.w;
        if (pf2Var != null) {
            pf2Var.run();
            this.w = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        this.s = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
