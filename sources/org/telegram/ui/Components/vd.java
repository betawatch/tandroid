package org.telegram.ui.Components;

import android.util.Property;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vd extends Property {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        super(Float.class, "emoji_button_scale");
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                break;
            case 2:
                this.b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                break;
            case 3:
                this.b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                break;
            case 4:
                this.b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                break;
            default:
                this.b = chatActivityEnterView;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(this.b.h);
            case 1:
                return Float.valueOf(this.b.A);
            case 2:
                return Float.valueOf(this.b.n);
            case 3:
                return Float.valueOf(this.b.x);
            default:
                return Float.valueOf(this.b.C);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.E1();
                break;
            case 1:
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.A = floatValue2;
                chatActivityEnterView2.z1();
                break;
            case 2:
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                chatActivityEnterView3.n = floatValue3;
                chatActivityEnterView3.E1();
                break;
            case 3:
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                chatActivityEnterView4.x = floatValue4;
                chatActivityEnterView4.z1();
                break;
            default:
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                chatActivityEnterView5.C = floatValue5;
                chatActivityEnterView5.I1();
                break;
        }
    }
}
