package androidx.appcompat.view.menu;

import aa.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.WeakHashMap;
import l.l;
import l.n;
import l.z;
import org.telegram.messenger.beta.R;
import r0.i0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {
    public final boolean E;
    public LayoutInflater F;
    public boolean G;
    public n a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView h;
    public ImageView n;
    public LinearLayout r;
    public final Drawable s;
    public final int v;
    public final Context w;
    public boolean x;
    public final Drawable y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.F == null) {
            this.F = LayoutInflater.from(getContext());
        }
        return this.F;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.n;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.n.getLayoutParams();
        rect.top = this.n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    @Override // l.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(n nVar) {
        boolean z10;
        String sb2;
        this.a = nVar;
        boolean isVisible = nVar.isVisible();
        l lVar = nVar.n;
        int i10 = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(nVar.e);
        setCheckable(nVar.isCheckable());
        if (lVar.o()) {
            if ((lVar.n() ? nVar.j : nVar.h) != 0) {
                z10 = true;
                lVar.n();
                if (z10) {
                    n nVar2 = this.a;
                    l lVar2 = nVar2.n;
                    if (lVar2.o()) {
                        boolean z11 = (lVar2.n() ? nVar2.j : nVar2.h) != 0;
                    }
                }
                i10 = 8;
                if (i10 == 0) {
                    TextView textView = this.f;
                    n nVar3 = this.a;
                    l lVar3 = nVar3.n;
                    Context context = lVar3.a;
                    char c10 = lVar3.n() ? nVar3.j : nVar3.h;
                    if (c10 == 0) {
                        sb2 = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb3 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb3.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i11 = lVar3.n() ? nVar3.k : nVar3.i;
                        n.c(sb3, i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        n.c(sb3, i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        n.c(sb3, i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        n.c(sb3, i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        n.c(sb3, i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        n.c(sb3, i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c10 == '\b') {
                            sb3.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c10 == '\n') {
                            sb3.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c10 != ' ') {
                            sb3.append(c10);
                        } else {
                            sb3.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb2 = sb3.toString();
                    }
                    textView.setText(sb2);
                }
                if (this.f.getVisibility() != i10) {
                    this.f.setVisibility(i10);
                }
                setIcon(nVar.getIcon());
                setEnabled(nVar.isEnabled());
                setSubMenuArrowVisible(nVar.hasSubMenu());
                setContentDescription(nVar.q);
            }
        }
        z10 = false;
        lVar.n();
        if (z10) {
        }
        i10 = 8;
        if (i10 == 0) {
        }
        if (this.f.getVisibility() != i10) {
        }
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.q);
    }

    @Override // l.z
    public n getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = i0.a;
        setBackground(this.s);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i10 = this.v;
        if (i10 != -1) {
            textView.setTextAppearance(this.w, i10);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.y);
        }
        this.n = (ImageView) findViewById(R.id.group_divider);
        this.r = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.b != null && this.x) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.c == null && this.e == null) {
            return;
        }
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.r;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            view = this.e;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.r;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
            view = this.c;
        }
        if (z10) {
            compoundButton.setChecked(this.a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.r;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.r;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.G = z10;
        this.x = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility((this.E || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        l lVar = this.a.n;
        boolean z10 = this.G;
        if (z10 || this.x) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.x) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.b = imageView2;
                LinearLayout linearLayout = this.r;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.x) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.b;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.d.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        a y3 = a.y(getContext(), attributeSet, f.a.r, i10);
        this.s = y3.r(5);
        TypedArray typedArray = (TypedArray) y3.c;
        this.v = typedArray.getResourceId(1, -1);
        this.x = typedArray.getBoolean(7, false);
        this.w = context;
        this.y = y3.r(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.E = obtainStyledAttributes.hasValue(0);
        y3.A();
        obtainStyledAttributes.recycle();
    }
}
