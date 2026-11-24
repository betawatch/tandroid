// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hm4 {
    public static final ul4 p = new ul4();
    public static final List q;
    public static final List r;
    public final View a;
    public final fm4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public wg0 k;
    public final ylb n;
    public final km0 o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final wl0 l = new wl0(this);
    public final x03 m = new x03(18);

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

    public hm4(Context context, View view, int i, ylb ylbVar, km0 km0Var) {
        this.a = view;
        this.i = i;
        this.o = km0Var;
        this.n = ylbVar;
        this.b = new fm4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(View view, MenuItem menuItem, boolean z) {
        boolean z2;
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
        if (z) {
            if (r.contains(Integer.valueOf(menuItem.getItemId()))) {
                z2 = true;
                viewGroup.getChildAt(2).setVisibility(z2 ? 0 : 8);
            }
        }
        z2 = false;
        viewGroup.getChildAt(2).setVisibility(z2 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinearLayout b(Context context, MenuItem menuItem, boolean z, boolean z2, boolean z3) {
        int v0;
        int i;
        int i2;
        int i3;
        ImageView imageView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(gm.L(48.0f));
        linearLayout.setMinimumHeight(gm.L(z ? 42.0f : 48.0f));
        linearLayout.setPaddingRelative(gm.L(16.0f), 0, gm.L(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int i4 = cmb.h6;
        ylb ylbVar = this.n;
        int v02 = cmb.v0(i4, ylbVar);
        int i5 = this.i;
        if (i5 == 0) {
            i = cmb.i5;
            v0 = cmb.v0(i, ylbVar);
            anb.X(textView, i, ylbVar);
        } else {
            if (i5 == 2) {
                textView.setTextColor(-328966);
                i2 = -328966;
                v02 = 553648127;
                i = -1;
                if (!z2) {
                    i3 = 12;
                } else {
                    if (!z3) {
                        linearLayout.setBackground(cmb.f0(v02, 2, -1));
                        textView.setPaddingRelative(gm.L(11.0f), 0, 0, 0);
                        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, gm.L(z ? 42.0f : 48.0f)));
                        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
                        ImageView k = td4.k(context, R.drawable.msg_mini_lock3);
                        k.setScaleType(ImageView.ScaleType.CENTER);
                        if (i5 != 2) {
                            if (i < 0) {
                                i = cmb.F6;
                            }
                            wmb K = anb.K(0.4f, i);
                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                            int i6 = K.a;
                            float f = K.d;
                            int P = anb.P(i6, -1, 2, f, ylbVar);
                            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
                            k.setColorFilter(porterDuffColorFilter);
                            imageView = k;
                            anb.N(imageView, 5, i6, -1, 2, f, ylbVar, P, porterDuffColorFilter).h = mode;
                        } else {
                            imageView = k;
                            imageView.setColorFilter(new PorterDuffColorFilter(cmb.p1(0.4f, i2), PorterDuff.Mode.SRC_IN));
                        }
                        imageView.setVisibility(8);
                        linearLayout.addView(imageView, qoe.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
                        if (menuItem != null) {
                            e(linearLayout, menuItem, this.j != null);
                        }
                        return linearLayout;
                    }
                    i3 = 0;
                }
                int i7 = !z3 ? 12 : 0;
                linearLayout.setBackground(cmb.a0(v02, i3, i7, i7, !z2 ? 12 : 0));
                textView.setPaddingRelative(gm.L(11.0f), 0, 0, 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, gm.L(z ? 42.0f : 48.0f)));
                linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
                ImageView k2 = td4.k(context, R.drawable.msg_mini_lock3);
                k2.setScaleType(ImageView.ScaleType.CENTER);
                if (i5 != 2) {
                }
                imageView.setVisibility(8);
                linearLayout.addView(imageView, qoe.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
                if (menuItem != null) {
                }
                return linearLayout;
            }
            if (i5 == 1) {
                i = cmb.F6;
                v0 = cmb.v0(i, ylbVar);
                anb.X(textView, i, ylbVar);
            } else {
                v0 = cmb.v0(cmb.F6, ylbVar);
                i = -1;
            }
        }
        i2 = v0;
        if (!z2) {
        }
        if (!z3) {
        }
        linearLayout.setBackground(cmb.a0(v02, i3, i7, i7, !z2 ? 12 : 0));
        textView.setPaddingRelative(gm.L(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, gm.L(z ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView k22 = td4.k(context, R.drawable.msg_mini_lock3);
        k22.setScaleType(ImageView.ScaleType.CENTER);
        if (i5 != 2) {
        }
        imageView.setVisibility(8);
        linearLayout.addView(imageView, qoe.q(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
        }
        return linearLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r26.h != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        List list;
        boolean z;
        int i;
        List list2;
        boolean z2;
        ArrayList d = d(this.e);
        Collections.sort(d, this.m);
        ArrayList arrayList = this.f;
        fm4 fm4Var = this.b;
        if (arrayList != null && d.size() == this.f.size()) {
            int size = d.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    MenuItem menuItem = (MenuItem) d.get(i2);
                    MenuItem menuItem2 = (MenuItem) this.f.get(i2);
                    if (menuItem.getItemId() != menuItem2.getItemId() || !TextUtils.equals(menuItem.getTitle(), menuItem2.getTitle()) || !Objects.equals(menuItem.getIcon(), menuItem2.getIcon()) || menuItem.getGroupId() != menuItem2.getGroupId()) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        boolean z3 = fm4Var.F;
        Rect rect = fm4Var.A;
        hm4 hm4Var = fm4Var.Q;
        boolean z4 = true;
        if (!z3) {
            fm4Var.G = false;
            fm4Var.F = true;
            fm4Var.x.cancel();
            fm4Var.w.start();
            fm4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = fm4Var.H;
        fm4Var.K = onMenuItemClickListener;
        fm4Var.b();
        fm4Var.I = null;
        fm4Var.J = null;
        fm4Var.N = false;
        fm4Var.n();
        qmb qmbVar = fm4Var.g;
        qmbVar.removeAllViews();
        qmbVar.setPaddingRelative(0, 0, 0, 0);
        dm4 dm4Var = fm4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) dm4Var.getAdapter();
        arrayAdapter.clear();
        dm4Var.setAdapter((ListAdapter) arrayAdapter);
        fm4Var.f.removeAllViews();
        fm4Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(gm.L(400.0f), rect.width() - (gm.L(16.0f) << 1));
        LinkedList linkedList = new LinkedList(d);
        Iterator it = linkedList.iterator();
        int i3 = min;
        boolean z5 = true;
        while (true) {
            boolean hasNext = it.hasNext();
            List list3 = r;
            if (!hasNext) {
                list = list3;
                z = z4;
                break;
            }
            MenuItem menuItem3 = (MenuItem) it.next();
            boolean hasNext2 = it.hasNext();
            boolean z6 = !hasNext2;
            z = z4;
            if (menuItem3 == null || hm4Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i4 = i3;
                list = list3;
                LinearLayout b = hm4Var.b(fm4Var.a, menuItem3, false, z5, z6);
                b.setGravity(17);
                int i5 = min;
                b.setPaddingRelative((int) ((z5 ? 1.5d : 1.0d) * b.getPaddingStart()), b.getPaddingTop(), (int) (b.getPaddingEnd() * (hasNext2 ? 1.0d : 1.5d)), b.getPaddingBottom());
                b.measure(0, 0);
                min = i5;
                int min2 = Math.min(b.getMeasuredWidth(), min);
                boolean z7 = min2 <= i4 - size2.getWidth() ? z : false;
                boolean z8 = (hasNext2 || min2 > i4) ? false : z;
                if (!z7 && !z8) {
                    break;
                }
                b.setTag(menuItem3);
                b.setOnClickListener(fm4Var.L);
                qmbVar.addView(b);
                ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                layoutParams.width = min2;
                b.setLayoutParams(layoutParams);
                i3 = i4 - min2;
                it.remove();
                z4 = z;
                z5 = false;
            } else {
                z4 = z;
            }
        }
        if (linkedList.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            qmbVar.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        qmbVar.measure(i, i);
        fm4Var.J = new Size(qmbVar.getMeasuredWidth(), qmbVar.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) dm4Var.getAdapter();
            arrayAdapter2.clear();
            if (hm4Var.j != null) {
                Collections.sort(linkedList, new x03((byte) 19));
            }
            int size3 = linkedList.size();
            boolean H3 = oc7.r1(z8c.t0).H3();
            int i6 = 0;
            while (i6 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i6);
                if (hm4Var.j == null) {
                    z2 = z;
                    list2 = list;
                } else {
                    list2 = list;
                    z2 = list2.contains(Integer.valueOf(menuItem4.getItemId())) ? !H3 : z;
                }
                if (z2) {
                    arrayAdapter2.add(menuItem4);
                }
                i6++;
                list = list2;
            }
            dm4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (fm4Var.M) {
                dm4Var.setY(0.0f);
            } else {
                dm4Var.setY(size2.getHeight());
            }
            int count = dm4Var.getAdapter().getCount();
            int i7 = 0;
            for (int i8 = 0; i8 < count; i8++) {
                MenuItem menuItem5 = (MenuItem) dm4Var.getAdapter().getItem(i8);
                em4 em4Var = fm4Var.q;
                LinearLayout linearLayout = em4Var.a;
                e(linearLayout, menuItem5, em4Var.e.Q.j != null ? z : false);
                linearLayout.measure(0, 0);
                i7 = Math.max(linearLayout.getMeasuredWidth(), i7);
            }
            Size size4 = new Size(Math.max(i7, size2.getWidth()), fm4Var.a(4));
            fm4Var.I = size4;
            fm4.m(dm4Var, size4);
        }
        fm4Var.p();
        this.f = d;
        boolean e = fm4Var.e();
        Point point = fm4Var.B;
        PopupWindow popupWindow = fm4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (e) {
            if (!rect2.equals(rect3) && fm4Var.e() && popupWindow.isShowing()) {
                fm4Var.b();
                fm4Var.i(rect3);
                fm4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!fm4Var.e()) {
            fm4Var.G = false;
            fm4Var.F = false;
            fm4Var.w.cancel();
            fm4Var.x.cancel();
            fm4Var.b();
            fm4Var.i(rect3);
            fm4Var.h();
            popupWindow.showAtLocation(fm4Var.b, 0, point.x, point.y);
            fm4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        wg0 wg0Var;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; menu != null && i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (wg0Var = this.k) == null || ((Boolean) wg0Var.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
