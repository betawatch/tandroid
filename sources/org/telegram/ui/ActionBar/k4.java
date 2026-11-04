package org.telegram.ui.ActionBar;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import b8.mf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.tq;
import org.telegram.ui.Components.qs;
import org.telegram.ui.s51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k4 {
    public static final v3 p = new v3();
    public static final List q;
    public static final List r;
    public final View a;
    public final i4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public qs k;
    public final e6 n;
    public final eh.c o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final w3 l = new w3(this);
    public final tq m = new tq(13);

    static {
        Integer valueOf = Integer.valueOf(R.id.menu_regular);
        Integer valueOf2 = Integer.valueOf(R.id.menu_bold);
        Integer valueOf3 = Integer.valueOf(R.id.menu_italic);
        Integer valueOf4 = Integer.valueOf(R.id.menu_strike);
        Integer valueOf5 = Integer.valueOf(R.id.menu_mono);
        Integer valueOf6 = Integer.valueOf(R.id.menu_underline);
        Integer valueOf7 = Integer.valueOf(R.id.menu_spoiler);
        Integer valueOf8 = Integer.valueOf(R.id.menu_link);
        Integer valueOf9 = Integer.valueOf(R.id.menu_quote);
        q = Arrays.asList(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, Integer.valueOf(R.id.menu_date));
        r = Arrays.asList(valueOf2, valueOf3, valueOf4, valueOf8, valueOf5, valueOf6, valueOf7, valueOf9);
    }

    public k4(Context context, View view, int i3, e6 e6Var, eh.c cVar) {
        this.a = view;
        this.i = i3;
        this.o = cVar;
        this.n = e6Var;
        this.b = new i4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i3, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i3);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinearLayout b(k4 k4Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        int w02;
        int i3;
        int i10;
        ImageView imageView;
        int i11 = k4Var.i;
        e6 e6Var = k4Var.n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(org.telegram.messenger.g0.L(48.0f));
        linearLayout.setMinimumHeight(org.telegram.messenger.g0.L(z10 ? 42.0f : 48.0f));
        linearLayout.setPaddingRelative(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int w03 = k6.w0(k6.i6, e6Var);
        if (i11 == 0) {
            i3 = k6.j5;
            w02 = k6.w0(i3, e6Var);
            r6.V(textView, i3, e6Var);
        } else {
            if (i11 == 2) {
                textView.setTextColor(-328966);
                i10 = -328966;
                w03 = 553648127;
                i3 = -1;
                if (!z11 || z12) {
                    linearLayout.setBackground(k6.c0(w03, !z11 ? 12 : 0, !z12 ? 12 : 0, !z12 ? 12 : 0, !z11 ? 12 : 0));
                } else {
                    linearLayout.setBackground(k6.h0(w03, 2, -1));
                }
                textView.setPaddingRelative(org.telegram.messenger.g0.L(11.0f), 0, 0, 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, org.telegram.messenger.g0.L(!z10 ? 42.0f : 48.0f)));
                linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
                ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_mini_lock3);
                e10.setScaleType(ImageView.ScaleType.CENTER);
                if (i11 == 2) {
                    if (i3 < 0) {
                        i3 = k6.G6;
                    }
                    n6 L = r6.L(0.4f, i3);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    int i12 = L.a;
                    float f10 = L.d;
                    int Q = r6.Q(i12, -1, 2, f10, e6Var);
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
                    e10.setColorFilter(porterDuffColorFilter);
                    l6 O = r6.O(e10, 5, i12, -1, 2, f10, e6Var, Q, porterDuffColorFilter);
                    imageView = e10;
                    O.h = mode;
                } else {
                    imageView = e10;
                    imageView.setColorFilter(new PorterDuffColorFilter(k6.r1(0.4f, i10), PorterDuff.Mode.SRC_IN));
                }
                imageView.setVisibility(8);
                linearLayout.addView(imageView, mf.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
                if (menuItem != null) {
                    e(linearLayout, menuItem, k4Var.j != null);
                }
                return linearLayout;
            }
            if (i11 == 1) {
                i3 = k6.G6;
                w02 = k6.w0(i3, e6Var);
                r6.V(textView, i3, e6Var);
            } else {
                w02 = k6.w0(k6.G6, e6Var);
                i3 = -1;
            }
        }
        i10 = w02;
        if (z11) {
        }
        linearLayout.setBackground(k6.c0(w03, !z11 ? 12 : 0, !z12 ? 12 : 0, !z12 ? 12 : 0, !z11 ? 12 : 0));
        textView.setPaddingRelative(org.telegram.messenger.g0.L(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, org.telegram.messenger.g0.L(!z10 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView e102 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_mini_lock3);
        e102.setScaleType(ImageView.ScaleType.CENTER);
        if (i11 == 2) {
        }
        imageView.setVisibility(8);
        linearLayout.addView(imageView, mf.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
        }
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(View view, MenuItem menuItem, boolean z10) {
        boolean z11;
        ViewGroup viewGroup = (ViewGroup) view;
        TextView textView = (TextView) viewGroup.getChildAt(0);
        textView.setEllipsize(null);
        if (TextUtils.isEmpty(menuItem.getTitle())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(menuItem.getTitle());
        }
        textView.setPaddingRelative(0, 0, 0, 0);
        if (z10) {
            if (r.contains(Integer.valueOf(menuItem.getItemId()))) {
                z11 = true;
                viewGroup.getChildAt(2).setVisibility(z11 ? 0 : 8);
            }
        }
        z11 = false;
        viewGroup.getChildAt(2).setVisibility(z11 ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r26.h != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        List list;
        boolean z10;
        int i3;
        List list2;
        boolean z11;
        ArrayList d = d(this.e);
        Collections.sort(d, this.m);
        ArrayList arrayList = this.f;
        i4 i4Var = this.b;
        if (arrayList != null && d.size() == this.f.size()) {
            int size = d.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    MenuItem menuItem = (MenuItem) d.get(i10);
                    MenuItem menuItem2 = (MenuItem) this.f.get(i10);
                    if (menuItem.getItemId() != menuItem2.getItemId() || !TextUtils.equals(menuItem.getTitle(), menuItem2.getTitle()) || !Objects.equals(menuItem.getIcon(), menuItem2.getIcon()) || menuItem.getGroupId() != menuItem2.getGroupId()) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        boolean z12 = i4Var.F;
        Rect rect = i4Var.A;
        k4 k4Var = i4Var.Q;
        boolean z13 = true;
        if (!z12) {
            i4Var.G = false;
            i4Var.F = true;
            i4Var.x.cancel();
            i4Var.w.start();
            i4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = i4Var.H;
        i4Var.K = onMenuItemClickListener;
        i4Var.d();
        i4Var.I = null;
        i4Var.J = null;
        i4Var.N = false;
        i4Var.n();
        s51 s51Var = i4Var.g;
        s51Var.removeAllViews();
        s51Var.setPaddingRelative(0, 0, 0, 0);
        g4 g4Var = i4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) g4Var.getAdapter();
        arrayAdapter.clear();
        g4Var.setAdapter((ListAdapter) arrayAdapter);
        i4Var.f.removeAllViews();
        i4Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(org.telegram.messenger.g0.L(400.0f), org.telegram.messenger.camera.q.A(16.0f, 2, rect.width()));
        LinkedList linkedList = new LinkedList(d);
        Iterator it = linkedList.iterator();
        int i11 = min;
        boolean z14 = true;
        while (true) {
            boolean hasNext = it.hasNext();
            List list3 = r;
            if (!hasNext) {
                list = list3;
                z10 = z13;
                break;
            }
            MenuItem menuItem3 = (MenuItem) it.next();
            boolean hasNext2 = it.hasNext();
            boolean z15 = !hasNext2;
            z10 = z13;
            if (menuItem3 == null || k4Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i12 = i11;
                list = list3;
                LinearLayout b10 = b(k4Var, i4Var.a, menuItem3, false, z14, z15);
                b10.setGravity(17);
                int i13 = min;
                b10.setPaddingRelative((int) ((z14 ? 1.5d : 1.0d) * b10.getPaddingStart()), b10.getPaddingTop(), (int) (b10.getPaddingEnd() * (hasNext2 ? 1.0d : 1.5d)), b10.getPaddingBottom());
                b10.measure(0, 0);
                min = i13;
                int min2 = Math.min(b10.getMeasuredWidth(), min);
                boolean z16 = min2 <= i12 - size2.getWidth() ? z10 : false;
                boolean z17 = (hasNext2 || min2 > i12) ? false : z10;
                if (!z16 && !z17) {
                    break;
                }
                b10.setTag(menuItem3);
                b10.setOnClickListener(i4Var.L);
                s51Var.addView(b10);
                ViewGroup.LayoutParams layoutParams = b10.getLayoutParams();
                layoutParams.width = min2;
                b10.setLayoutParams(layoutParams);
                i11 = i12 - min2;
                it.remove();
                z13 = z10;
                z14 = false;
            } else {
                z13 = z10;
            }
        }
        if (linkedList.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 0;
            s51Var.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        s51Var.measure(i3, i3);
        i4Var.J = new Size(s51Var.getMeasuredWidth(), s51Var.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) g4Var.getAdapter();
            arrayAdapter2.clear();
            if (k4Var.j != null) {
                Collections.sort(linkedList, new tq(14));
            }
            int size3 = linkedList.size();
            boolean D3 = hp.s1(h10.t0).D3();
            int i14 = 0;
            while (i14 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i14);
                if (k4Var.j == null) {
                    z11 = z10;
                    list2 = list;
                } else {
                    list2 = list;
                    z11 = list2.contains(Integer.valueOf(menuItem4.getItemId())) ? !D3 : z10;
                }
                if (z11) {
                    arrayAdapter2.add(menuItem4);
                }
                i14++;
                list = list2;
            }
            g4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (i4Var.M) {
                g4Var.setY(0.0f);
            } else {
                g4Var.setY(size2.getHeight());
            }
            int count = g4Var.getAdapter().getCount();
            int i15 = 0;
            for (int i16 = 0; i16 < count; i16++) {
                MenuItem menuItem5 = (MenuItem) g4Var.getAdapter().getItem(i16);
                h4 h4Var = i4Var.q;
                LinearLayout linearLayout = (LinearLayout) h4Var.c;
                e(linearLayout, menuItem5, ((i4) h4Var.e).Q.j != null ? z10 : false);
                linearLayout.measure(0, 0);
                i15 = Math.max(linearLayout.getMeasuredWidth(), i15);
            }
            Size size4 = new Size(Math.max(i15, size2.getWidth()), i4Var.c(4));
            i4Var.I = size4;
            i4.m(g4Var, size4);
        }
        i4Var.p();
        this.f = d;
        boolean f10 = i4Var.f();
        Point point = i4Var.B;
        PopupWindow popupWindow = i4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (f10) {
            if (!rect2.equals(rect3) && i4Var.f() && popupWindow.isShowing()) {
                i4Var.d();
                i4Var.i(rect3);
                i4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!i4Var.f()) {
            i4Var.G = false;
            i4Var.F = false;
            i4Var.w.cancel();
            i4Var.x.cancel();
            i4Var.d();
            i4Var.i(rect3);
            i4Var.h();
            popupWindow.showAtLocation(i4Var.b, 0, point.x, point.y);
            i4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        qs qsVar;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; menu != null && i3 < menu.size(); i3++) {
            MenuItem item = menu.getItem(i3);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (qsVar = this.k) == null || ((Boolean) qsVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
