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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bk;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.ct;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s4 {
    public static final e4 p = new e4();
    public static final List q;
    public static final List r;
    public final View a;
    public final q4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public ct k;
    public final p6 n;
    public final tg.b o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final f4 l = new f4(this);
    public final bk m = new bk(25);

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

    public s4(Context context, View view, int i10, p6 p6Var, tg.b bVar) {
        this.a = view;
        this.i = i10;
        this.o = bVar;
        this.n = p6Var;
        this.b = new q4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
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
    public static LinearLayout b(s4 s4Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        int w02;
        int i10;
        int i11;
        ImageView imageView;
        int i12 = s4Var.i;
        p6 p6Var = s4Var.n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(org.telegram.messenger.i0.L(48.0f));
        linearLayout.setMinimumHeight(org.telegram.messenger.i0.L(z10 ? 42.0f : 48.0f));
        linearLayout.setPaddingRelative(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int w03 = t6.w0(t6.i6, p6Var);
        if (i12 == 0) {
            i10 = t6.j5;
            w02 = t6.w0(i10, p6Var);
            a7.V(textView, i10, p6Var);
        } else {
            if (i12 == 2) {
                textView.setTextColor(-328966);
                i11 = -328966;
                w03 = 553648127;
                i10 = -1;
                if (!z11 || z12) {
                    linearLayout.setBackground(t6.c0(w03, !z11 ? 12 : 0, !z12 ? 12 : 0, !z12 ? 12 : 0, !z11 ? 12 : 0));
                } else {
                    linearLayout.setBackground(t6.h0(w03, 2, -1));
                }
                textView.setPaddingRelative(org.telegram.messenger.i0.L(11.0f), 0, 0, 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, org.telegram.messenger.i0.L(!z10 ? 42.0f : 48.0f)));
                linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
                ImageView e = z20.e(context, R.drawable.msg_mini_lock3);
                e.setScaleType(ImageView.ScaleType.CENTER);
                if (i12 == 2) {
                    if (i10 < 0) {
                        i10 = t6.G6;
                    }
                    w6 L = a7.L(0.4f, i10);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    int i13 = L.a;
                    float f7 = L.d;
                    int Q = a7.Q(i13, -1, 2, f7, p6Var);
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
                    e.setColorFilter(porterDuffColorFilter);
                    u6 O = a7.O(e, 5, i13, -1, 2, f7, p6Var, Q, porterDuffColorFilter);
                    imageView = e;
                    O.h = mode;
                } else {
                    imageView = e;
                    imageView.setColorFilter(new PorterDuffColorFilter(t6.r1(0.4f, i11), PorterDuff.Mode.SRC_IN));
                }
                imageView.setVisibility(8);
                linearLayout.addView(imageView, w7.b6.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
                if (menuItem != null) {
                    e(linearLayout, menuItem, s4Var.j != null);
                }
                return linearLayout;
            }
            if (i12 == 1) {
                i10 = t6.G6;
                w02 = t6.w0(i10, p6Var);
                a7.V(textView, i10, p6Var);
            } else {
                w02 = t6.w0(t6.G6, p6Var);
                i10 = -1;
            }
        }
        i11 = w02;
        if (z11) {
        }
        linearLayout.setBackground(t6.c0(w03, !z11 ? 12 : 0, !z12 ? 12 : 0, !z12 ? 12 : 0, !z11 ? 12 : 0));
        textView.setPaddingRelative(org.telegram.messenger.i0.L(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, org.telegram.messenger.i0.L(!z10 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView e7 = z20.e(context, R.drawable.msg_mini_lock3);
        e7.setScaleType(ImageView.ScaleType.CENTER);
        if (i12 == 2) {
        }
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.b6.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
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
        int i10;
        List list2;
        boolean z11;
        ArrayList d = d(this.e);
        Collections.sort(d, this.m);
        ArrayList arrayList = this.f;
        q4 q4Var = this.b;
        if (arrayList != null && d.size() == this.f.size()) {
            int size = d.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    MenuItem menuItem = (MenuItem) d.get(i11);
                    MenuItem menuItem2 = (MenuItem) this.f.get(i11);
                    if (menuItem.getItemId() != menuItem2.getItemId() || !TextUtils.equals(menuItem.getTitle(), menuItem2.getTitle()) || !Objects.equals(menuItem.getIcon(), menuItem2.getIcon()) || menuItem.getGroupId() != menuItem2.getGroupId()) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        boolean z12 = q4Var.F;
        Rect rect = q4Var.A;
        s4 s4Var = q4Var.Q;
        boolean z13 = true;
        if (!z12) {
            q4Var.G = false;
            q4Var.F = true;
            q4Var.x.cancel();
            q4Var.w.start();
            q4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = q4Var.H;
        q4Var.K = onMenuItemClickListener;
        q4Var.d();
        q4Var.I = null;
        q4Var.J = null;
        q4Var.N = false;
        q4Var.n();
        u71 u71Var = q4Var.g;
        u71Var.removeAllViews();
        u71Var.setPaddingRelative(0, 0, 0, 0);
        o4 o4Var = q4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) o4Var.getAdapter();
        arrayAdapter.clear();
        o4Var.setAdapter((ListAdapter) arrayAdapter);
        q4Var.f.removeAllViews();
        q4Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(org.telegram.messenger.i0.L(400.0f), z20.A(16.0f, 2, rect.width()));
        LinkedList linkedList = new LinkedList(d);
        Iterator it = linkedList.iterator();
        int i12 = min;
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
            if (menuItem3 == null || s4Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i13 = i12;
                list = list3;
                LinearLayout b10 = b(s4Var, q4Var.a, menuItem3, false, z14, z15);
                b10.setGravity(17);
                int i14 = min;
                b10.setPaddingRelative((int) ((z14 ? 1.5d : 1.0d) * b10.getPaddingStart()), b10.getPaddingTop(), (int) (b10.getPaddingEnd() * (hasNext2 ? 1.0d : 1.5d)), b10.getPaddingBottom());
                b10.measure(0, 0);
                min = i14;
                int min2 = Math.min(b10.getMeasuredWidth(), min);
                boolean z16 = min2 <= i13 - size2.getWidth() ? z10 : false;
                boolean z17 = (hasNext2 || min2 > i13) ? false : z10;
                if (!z16 && !z17) {
                    break;
                }
                b10.setTag(menuItem3);
                b10.setOnClickListener(q4Var.L);
                u71Var.addView(b10);
                ViewGroup.LayoutParams layoutParams = b10.getLayoutParams();
                layoutParams.width = min2;
                b10.setLayoutParams(layoutParams);
                i12 = i13 - min2;
                it.remove();
                z13 = z10;
                z14 = false;
            } else {
                z13 = z10;
            }
        }
        if (linkedList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 0;
            u71Var.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        u71Var.measure(i10, i10);
        q4Var.J = new Size(u71Var.getMeasuredWidth(), u71Var.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) o4Var.getAdapter();
            arrayAdapter2.clear();
            if (s4Var.j != null) {
                Collections.sort(linkedList, new bk(26));
            }
            int size3 = linkedList.size();
            boolean A3 = vp.r1(d20.s0).A3();
            int i15 = 0;
            while (i15 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i15);
                if (s4Var.j == null) {
                    z11 = z10;
                    list2 = list;
                } else {
                    list2 = list;
                    z11 = list2.contains(Integer.valueOf(menuItem4.getItemId())) ? !A3 : z10;
                }
                if (z11) {
                    arrayAdapter2.add(menuItem4);
                }
                i15++;
                list = list2;
            }
            o4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (q4Var.M) {
                o4Var.setY(0.0f);
            } else {
                o4Var.setY(size2.getHeight());
            }
            int count = o4Var.getAdapter().getCount();
            int i16 = 0;
            for (int i17 = 0; i17 < count; i17++) {
                MenuItem menuItem5 = (MenuItem) o4Var.getAdapter().getItem(i17);
                p4 p4Var = q4Var.q;
                LinearLayout linearLayout = (LinearLayout) p4Var.c;
                e(linearLayout, menuItem5, ((q4) p4Var.e).Q.j != null ? z10 : false);
                linearLayout.measure(0, 0);
                i16 = Math.max(linearLayout.getMeasuredWidth(), i16);
            }
            Size size4 = new Size(Math.max(i16, size2.getWidth()), q4Var.c(4));
            q4Var.I = size4;
            q4.m(o4Var, size4);
        }
        q4Var.p();
        this.f = d;
        boolean f7 = q4Var.f();
        Point point = q4Var.B;
        PopupWindow popupWindow = q4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (f7) {
            if (!rect2.equals(rect3) && q4Var.f() && popupWindow.isShowing()) {
                q4Var.d();
                q4Var.i(rect3);
                q4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!q4Var.f()) {
            q4Var.G = false;
            q4Var.F = false;
            q4Var.w.cancel();
            q4Var.x.cancel();
            q4Var.d();
            q4Var.i(rect3);
            q4Var.h();
            popupWindow.showAtLocation(q4Var.b, 0, point.x, point.y);
            q4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        ct ctVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (ctVar = this.k) == null || ((Boolean) ctVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
