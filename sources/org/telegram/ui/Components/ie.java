package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ie extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie(ChatActivityEnterView chatActivityEnterView, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (getAlpha() < 0.5f || this.b.y1 > 0.0f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                float f10 = chatActivityEnterView.y1;
                if (f10 < 1.0f) {
                    if (f10 <= 0.0f) {
                        super.draw(canvas);
                        break;
                    } else {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.y1) * 255.0f));
                        super.draw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        break;
                    }
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                post(new td(this.b, 16));
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                if (getAlpha() <= 0.0f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 1:
                super.setAlpha(f10);
                se seVar = this.b.z2;
                if (seVar != null) {
                    seVar.setTranslationX(seVar.a);
                    break;
                }
                break;
            case 2:
                super.setAlpha(f10);
                se seVar2 = this.b.z2;
                if (seVar2 != null) {
                    seVar2.setTranslationX(seVar2.a);
                    break;
                }
                break;
            case 3:
                super.setAlpha(f10);
                oe oeVar = this.b.a1;
                if (oeVar != null) {
                    oeVar.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 3:
                super.setVisibility(i7);
                oe oeVar = this.b.a1;
                if (oeVar != null) {
                    oeVar.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }
}
