// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class lsc extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public npc c;
    public float d;
    public float e;
    public boolean f;

    public lsc(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.n1("fonts/rmedium.ttf"));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, qoe.c(16.0f, 16));
    }

    public final void a() {
        float height = (((getHeight() * 0.5f) - gm.L(19.0f)) * this.d) + gm.L(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.b;
        imageView.setTranslationX(width - gm.L(8.0f));
        imageView.setTranslationY(height - gm.L(8.0f));
        imageView.setAlpha(1.0f - this.d);
        npc npcVar = this.c;
        if (npcVar != null) {
            npcVar.setTranslationX(width - gm.L(20.0f));
            this.c.setTranslationY(height - gm.L(20.0f));
            this.c.setPivotX(gm.L(20.0f));
            this.c.setPivotY(gm.L(20.0f));
            this.c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.e * 0.12f) + 1.0f));
            this.c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.e * 0.18f)));
            this.c.setAlpha(this.f ? 0.0f : this.d);
        }
    }

    public final float b() {
        return ((gm.L(7.0f) - gm.L(2.0f)) * this.d) + gm.L(2.0f);
    }

    public final float c() {
        return ((gm.L(23.0f) - gm.L(16.0f)) * this.d) + gm.L(16.0f);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.b.layout(0, 0, gm.L(16.0f), gm.L(16.0f));
        npc npcVar = this.c;
        if (npcVar != null) {
            npcVar.layout(0, 0, gm.L(40.0f), gm.L(40.0f));
        }
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gm.L(16.0f), TLObject.FLAG_30);
        this.a.measure(makeMeasureSpec, makeMeasureSpec2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(gm.L(16.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(16.0f), TLObject.FLAG_30));
        npc npcVar = this.c;
        if (npcVar != null) {
            npcVar.measure(View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + mlb.A(this.d, 0.42857146f, 1.0f, r6.getMeasuredWidth())), i), View.resolveSize(gm.L(40.0f), i2));
    }
}
