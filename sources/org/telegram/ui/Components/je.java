package org.telegram.ui.Components;

import android.util.Property;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class je extends Property {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(ChatActivityEnterView chatActivityEnterView, int i10) {
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
                return Float.valueOf(this.b.E);
            case 2:
                return Float.valueOf(this.b.n);
            case 3:
                return Float.valueOf(this.b.x);
            default:
                return Float.valueOf(this.b.G);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.F1();
                break;
            case 1:
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.E = floatValue2;
                chatActivityEnterView2.A1();
                break;
            case 2:
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                chatActivityEnterView3.n = floatValue3;
                chatActivityEnterView3.F1();
                break;
            case 3:
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                chatActivityEnterView4.x = floatValue4;
                chatActivityEnterView4.A1();
                break;
            default:
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                chatActivityEnterView5.G = floatValue5;
                chatActivityEnterView5.J1();
                break;
        }
    }
}
