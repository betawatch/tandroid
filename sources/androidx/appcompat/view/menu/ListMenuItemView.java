package androidx.appcompat.view.menu;

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
import f.a;
import java.util.WeakHashMap;
import l.k;
import l.m;
import l.y;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.i0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {
    public final Drawable D;
    public final boolean E;
    public LayoutInflater F;
    public boolean G;
    public m a;
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
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.F == null) {
            this.F = LayoutInflater.from(getContext());
        }
        return this.F;
    }

    private void setSubMenuArrowVisible(boolean z9) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z9 ? 0 : 8);
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // l.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(m mVar) {
        boolean z9;
        String sb2;
        boolean z10;
        this.a = mVar;
        boolean isVisible = mVar.isVisible();
        k kVar = mVar.n;
        int i7 = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(mVar.e);
        setCheckable(mVar.isCheckable());
        if (kVar.o()) {
            if ((kVar.n() ? mVar.j : mVar.h) != 0) {
                z9 = true;
                kVar.n();
                if (z9) {
                    m mVar2 = this.a;
                    k kVar2 = mVar2.n;
                    if (kVar2.o()) {
                        if ((kVar2.n() ? mVar2.j : mVar2.h) != 0) {
                            z10 = true;
                        }
                    }
                    z10 = false;
                }
                i7 = 8;
                if (i7 == 0) {
                    TextView textView = this.f;
                    m mVar3 = this.a;
                    k kVar3 = mVar3.n;
                    Context context = kVar3.a;
                    char c10 = kVar3.n() ? mVar3.j : mVar3.h;
                    if (c10 == 0) {
                        sb2 = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb3 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb3.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i10 = kVar3.n() ? mVar3.k : mVar3.i;
                        m.c(sb3, i10, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        m.c(sb3, i10, TLObject.FLAG_12, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        m.c(sb3, i10, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        m.c(sb3, i10, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        m.c(sb3, i10, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        m.c(sb3, i10, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
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
                if (this.f.getVisibility() != i7) {
                    this.f.setVisibility(i7);
                }
                setIcon(mVar.getIcon());
                setEnabled(mVar.isEnabled());
                setSubMenuArrowVisible(mVar.hasSubMenu());
                setContentDescription(mVar.q);
            }
        }
        z9 = false;
        kVar.n();
        if (z9) {
        }
        i7 = 8;
        if (i7 == 0) {
        }
        if (this.f.getVisibility() != i7) {
        }
        setIcon(mVar.getIcon());
        setEnabled(mVar.isEnabled());
        setSubMenuArrowVisible(mVar.hasSubMenu());
        setContentDescription(mVar.q);
    }

    @Override // l.y
    public m getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = i0.a;
        setBackground(this.s);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i7 = this.w;
        if (i7 != -1) {
            textView.setTextAppearance(this.x, i7);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.D);
        }
        this.n = (ImageView) findViewById(R.id.group_divider);
        this.r = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.b != null && this.y) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i7, i10);
    }

    public void setCheckable(boolean z9) {
        CompoundButton compoundButton;
        View view;
        if (!z9 && this.c == null && this.e == null) {
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
        if (z9) {
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

    public void setChecked(boolean z9) {
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
        compoundButton.setChecked(z9);
    }

    public void setForceShowIcon(boolean z9) {
        this.G = z9;
        this.y = z9;
    }

    public void setGroupDividerEnabled(boolean z9) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility((this.E || !z9) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        k kVar = this.a.n;
        boolean z9 = this.G;
        if (z9 || this.y) {
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
            if (!z9) {
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

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        h6.m x10 = h6.m.x(getContext(), attributeSet, a.r, i7);
        this.s = x10.p(5);
        TypedArray typedArray = (TypedArray) x10.c;
        this.w = typedArray.getResourceId(1, -1);
        this.y = typedArray.getBoolean(7, false);
        this.x = context;
        this.D = x10.p(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.E = obtainStyledAttributes.hasValue(0);
        x10.C();
        obtainStyledAttributes.recycle();
    }
}
