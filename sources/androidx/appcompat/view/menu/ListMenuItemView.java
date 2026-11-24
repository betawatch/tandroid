package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements u07, AbsListView.SelectionBoundsAdjuster {
    public final Drawable E;
    public final boolean F;
    public LayoutInflater G;
    public boolean H;
    public c07 a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView h;
    public ImageView n;
    public LinearLayout r;
    public final Drawable s;
    public final int w;
    public final Context x;
    public boolean y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vk9 v = vk9.v(getContext(), attributeSet, jy8.r, R.attr.listMenuViewStyle);
        this.s = v.n(5);
        TypedArray typedArray = (TypedArray) v.c;
        this.w = typedArray.getResourceId(1, -1);
        this.y = typedArray.getBoolean(7, false);
        this.x = context;
        this.E = v.n(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.F = obtainStyledAttributes.hasValue(0);
        v.y();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.G;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        this.G = from;
        return from;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if ((r1.n() ? r0.j : r0.h) == 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    @Override // u07
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c07 c07Var) {
        boolean z;
        String sb;
        this.a = c07Var;
        boolean isVisible = c07Var.isVisible();
        yz6 yz6Var = c07Var.n;
        int i = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(c07Var.e);
        setCheckable(c07Var.isCheckable());
        if (yz6Var.o()) {
            if ((yz6Var.n() ? c07Var.j : c07Var.h) != 0) {
                z = true;
                yz6Var.n();
                if (z) {
                    c07 c07Var2 = this.a;
                    yz6 yz6Var2 = c07Var2.n;
                    if (yz6Var2.o()) {
                    }
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f;
                    c07 c07Var3 = this.a;
                    yz6 yz6Var3 = c07Var3.n;
                    Context context = yz6Var3.a;
                    char c = yz6Var3.n() ? c07Var3.j : c07Var3.h;
                    if (c == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = yz6Var3.n() ? c07Var3.k : c07Var3.i;
                        c07.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        c07.c(i2, TLObject.FLAG_12, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        c07.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        c07.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        c07.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        c07.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c != ' ') {
                            sb2.append(c);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f.getVisibility() != i) {
                    this.f.setVisibility(i);
                }
                setIcon(c07Var.getIcon());
                setEnabled(c07Var.isEnabled());
                setSubMenuArrowVisible(c07Var.hasSubMenu());
                setContentDescription(c07Var.q);
            }
        }
        z = false;
        yz6Var.n();
        if (z) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f.getVisibility() != i) {
        }
        setIcon(c07Var.getIcon());
        setEnabled(c07Var.isEnabled());
        setSubMenuArrowVisible(c07Var.hasSubMenu());
        setContentDescription(c07Var.q);
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

    @Override // u07
    public c07 getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = jdc.a;
        setBackground(this.s);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.w;
        if (i != -1) {
            textView.setTextAppearance(this.x, i);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.E);
        }
        this.n = (ImageView) findViewById(R.id.group_divider);
        this.r = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.y) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.c == null && this.e == null) {
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
            compoundButton2 = this.e;
            compoundButton3 = compoundButton2;
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
            compoundButton2 = this.c;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.a.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
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
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.H = z;
        this.y = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility((this.F || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        yz6 yz6Var = this.a.n;
        boolean z = this.H;
        if (z || this.y) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.y) {
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
            if (drawable == null && !this.y) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.d;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }
}
