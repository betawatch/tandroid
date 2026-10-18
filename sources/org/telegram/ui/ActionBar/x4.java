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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.zt;
import org.telegram.ui.sa1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class x4 {
    public static final j4 p = new j4();
    public static final List q = Arrays.asList(Integer.valueOf(R.id.menu_regular), Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_quote), Integer.valueOf(R.id.menu_date));
    public static final List r = Arrays.asList(Integer.valueOf(R.id.menu_bold), Integer.valueOf(R.id.menu_italic), Integer.valueOf(R.id.menu_strike), Integer.valueOf(R.id.menu_link), Integer.valueOf(R.id.menu_mono), Integer.valueOf(R.id.menu_underline), Integer.valueOf(R.id.menu_spoiler), Integer.valueOf(R.id.menu_quote));
    public final View a;
    public final v4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public zt k;
    public final d6 n;
    public final bh.b o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final k4 l = new k4(this);
    public final i4 m = new i4(0);

    public x4(Context context, View view, int i10, d6 d6Var, bh.b bVar) {
        this.a = view;
        this.i = i10;
        this.o = bVar;
        this.n = d6Var;
        this.b = new v4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i10, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i10);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static LinearLayout b(x4 x4Var, Context context, MenuItem menuItem, boolean z10, boolean z11, boolean z12) {
        int w02;
        d6 d6Var = x4Var.n;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        linearLayout.setMinimumHeight(AndroidUtilities.dp(z10 ? 42.0f : 48.0f));
        linearLayout.setPaddingRelative(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int w03 = h6.w0(h6.i6, d6Var);
        int i10 = x4Var.i;
        if (i10 == 0) {
            w02 = h6.w0(h6.j5, d6Var);
            textView.setTextColor(w02);
        } else if (i10 == 2) {
            w02 = -328966;
            textView.setTextColor(-328966);
            w03 = 553648127;
        } else if (i10 == 1) {
            w02 = h6.w0(h6.G6, d6Var);
            textView.setTextColor(w02);
        } else {
            w02 = h6.w0(h6.G6, d6Var);
        }
        if (z11 || z12) {
            linearLayout.setBackground(h6.b0(w03, z11 ? 12 : 0, z12 ? 12 : 0, z12 ? 12 : 0, z11 ? 12 : 0));
        } else {
            linearLayout.setBackground(h6.g0(w03, 2, -1));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(z10 ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.m1(0.4f, w02), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.z5.p(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            e(linearLayout, menuItem, x4Var.j != null);
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
        v4 v4Var = this.b;
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
        boolean z12 = v4Var.F;
        Rect rect = v4Var.A;
        x4 x4Var = v4Var.Q;
        boolean z13 = true;
        if (!z12) {
            v4Var.G = false;
            v4Var.F = true;
            v4Var.x.cancel();
            v4Var.w.start();
            v4Var.D.setEmpty();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.g;
        Size size2 = v4Var.H;
        v4Var.K = onMenuItemClickListener;
        v4Var.d();
        v4Var.I = null;
        v4Var.J = null;
        v4Var.N = false;
        v4Var.n();
        sa1 sa1Var = v4Var.g;
        sa1Var.removeAllViews();
        sa1Var.setPaddingRelative(0, 0, 0, 0);
        u4 u4Var = v4Var.h;
        ArrayAdapter arrayAdapter = (ArrayAdapter) u4Var.getAdapter();
        arrayAdapter.clear();
        u4Var.setAdapter((ListAdapter) arrayAdapter);
        v4Var.f.removeAllViews();
        v4Var.b.getWindowVisibleDisplayFrame(rect);
        int min = Math.min(AndroidUtilities.dp(400.0f), kk.B(16.0f, 2, rect.width()));
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
            if (menuItem3 == null || x4Var.j == null || !list3.contains(Integer.valueOf(menuItem3.getItemId()))) {
                int i13 = i12;
                list = list3;
                LinearLayout b10 = b(x4Var, v4Var.a, menuItem3, false, z14, z15);
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
                b10.setOnClickListener(v4Var.L);
                sa1Var.addView(b10);
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
            sa1Var.setPaddingRelative(0, 0, size2.getWidth(), 0);
        }
        sa1Var.measure(i10, i10);
        v4Var.J = new Size(sa1Var.getMeasuredWidth(), sa1Var.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) u4Var.getAdapter();
            arrayAdapter2.clear();
            if (x4Var.j != null) {
                Collections.sort(linkedList, new i4(1));
            }
            int size3 = linkedList.size();
            boolean premiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
            int i15 = 0;
            while (i15 < size3) {
                MenuItem menuItem4 = (MenuItem) linkedList.get(i15);
                if (x4Var.j == null) {
                    z11 = z10;
                    list2 = list;
                } else {
                    list2 = list;
                    z11 = list2.contains(Integer.valueOf(menuItem4.getItemId())) ? !premiumFeaturesBlocked : z10;
                }
                if (z11) {
                    arrayAdapter2.add(menuItem4);
                }
                i15++;
                list = list2;
            }
            u4Var.setAdapter((ListAdapter) arrayAdapter2);
            if (v4Var.M) {
                u4Var.setY(0.0f);
            } else {
                u4Var.setY(size2.getHeight());
            }
            int count = u4Var.getAdapter().getCount();
            int i16 = 0;
            for (int i17 = 0; i17 < count; i17++) {
                MenuItem menuItem5 = (MenuItem) u4Var.getAdapter().getItem(i17);
                com.google.firebase.messaging.n nVar = v4Var.q;
                LinearLayout linearLayout = (LinearLayout) nVar.d;
                e(linearLayout, menuItem5, ((v4) nVar.e).Q.j != null ? z10 : false);
                linearLayout.measure(0, 0);
                i16 = Math.max(linearLayout.getMeasuredWidth(), i16);
            }
            Size size4 = new Size(Math.max(i16, size2.getWidth()), v4Var.c(4));
            v4Var.I = size4;
            v4.m(u4Var, size4);
        }
        v4Var.p();
        this.f = d;
        boolean f7 = v4Var.f();
        Point point = v4Var.B;
        PopupWindow popupWindow = v4Var.c;
        Rect rect2 = this.d;
        Rect rect3 = this.c;
        if (f7) {
            if (!rect2.equals(rect3) && v4Var.f() && popupWindow.isShowing()) {
                v4Var.d();
                v4Var.i(rect3);
                v4Var.h();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!v4Var.f()) {
            v4Var.G = false;
            v4Var.F = false;
            v4Var.w.cancel();
            v4Var.x.cancel();
            v4Var.d();
            v4Var.i(rect3);
            v4Var.h();
            popupWindow.showAtLocation(v4Var.b, 0, point.x, point.y);
            v4Var.v.start();
        }
        this.h = false;
        rect2.set(rect3);
    }

    public final ArrayList d(Menu menu) {
        zt ztVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; menu != null && i10 < menu.size(); i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (ztVar = this.k) == null || ((Boolean) ztVar.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
