package org.telegram.ui.Components.Paint;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* loaded from: classes3.dex */
public abstract class Brush {
    public static List BRUSHES_LIST = Arrays.asList(new Radial(), new Arrow(), new Elliptical(), new Neon(), new Blurer(), new Eraser());

    /* loaded from: classes3.dex */
    public static class Arrow extends Brush {
        @Override // org.telegram.ui.Components.Paint.Brush
        public int getDefaultColor() {
            return -30208;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getDefaultWeight() {
            return 0.25f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public int getIconRes() {
            return R.raw.photo_arrow;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getSmoothThicknessRate() {
            return 0.25f;
        }
    }

    /* loaded from: classes3.dex */
    public static class Blurer extends Brush {
        @Override // org.telegram.ui.Components.Paint.Brush
        public float getAlpha() {
            return 1.0f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getDefaultWeight() {
            return 1.0f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public int getIconRes() {
            return R.raw.photo_blur;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getPreviewScale() {
            return 0.35f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public String getShaderName(int i) {
            if (i == 0) {
                return "blitWithMaskBlurer";
            }
            if (i == 1) {
                return "compositeWithMaskBlurer";
            }
            if (i != 2) {
                return null;
            }
            return "brush";
        }
    }

    /* loaded from: classes3.dex */
    public static class Elliptical extends Brush {
        @Override // org.telegram.ui.Components.Paint.Brush
        public float getAlpha() {
            return 0.3f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getAngle() {
            return (float) Math.toRadians(0.0d);
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public int getDefaultColor() {
            return -10742;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getDefaultWeight() {
            return 0.5f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public int getIconRes() {
            return R.raw.photo_marker;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getOverrideAlpha() {
            return 0.45f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getPreviewScale() {
            return 0.4f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getScale() {
            return 1.5f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getSpacing() {
            return 0.04f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public int getStampResId() {
            return R.drawable.paint_elliptical_brush;
        }
    }

    /* loaded from: classes3.dex */
    public static class Eraser extends Brush {
        @Override // org.telegram.ui.Components.Paint.Brush
        public float getAlpha() {
            return 1.0f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getDefaultWeight() {
            return 1.0f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public int getIconRes() {
            return R.raw.photo_eraser;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getPreviewScale() {
            return 0.35f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public String getShaderName(int i) {
            if (i == 0) {
                return "blitWithMaskEraser";
            }
            if (i == 1) {
                return "compositeWithMaskEraser";
            }
            if (i != 2) {
                return null;
            }
            return "brush";
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public boolean isEraser() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static class Neon extends Brush {
        @Override // org.telegram.ui.Components.Paint.Brush
        public float getAlpha() {
            return 0.7f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public int getDefaultColor() {
            return -13318311;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getDefaultWeight() {
            return 0.5f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public int getIconRes() {
            return R.raw.photo_neon;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getPreviewScale() {
            return 0.2f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getScale() {
            return 1.45f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public String getShaderName(int i) {
            if (i == 0) {
                return "blitWithMaskLight";
            }
            if (i == 1) {
                return "compositeWithMaskLight";
            }
            if (i != 2) {
                return null;
            }
            return "brushLight";
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getSpacing() {
            return 0.07f;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public int getStampResId() {
            return R.drawable.paint_neon_brush;
        }
    }

    /* loaded from: classes3.dex */
    public static class Radial extends Brush {
        @Override // org.telegram.ui.Components.Paint.Brush
        public int getDefaultColor() {
            return -47814;
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public int getIconRes() {
            return R.raw.photo_pen;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Shape extends Brush {
        public static List SHAPES_LIST = Arrays.asList(new Circle(), new Rectangle(), new Star(), new Bubble(), new Arrow());

        /* loaded from: classes3.dex */
        public static class Arrow extends Shape {
            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public int getFilledIconRes() {
                return R.drawable.photo_arrowshape;
            }

            @Override // org.telegram.ui.Components.Paint.Brush
            public int getIconRes() {
                return R.drawable.photo_arrowshape;
            }

            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintArrow);
            }

            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public int getShapeShaderType() {
                return 4;
            }
        }

        /* loaded from: classes3.dex */
        public static class Bubble extends Shape {
            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public int getFilledIconRes() {
                return R.drawable.msg_msgbubble2;
            }

            @Override // org.telegram.ui.Components.Paint.Brush
            public int getIconRes() {
                return R.drawable.msg_msgbubble;
            }

            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintBubble);
            }

            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public int getShapeShaderType() {
                return 3;
            }
        }

        /* loaded from: classes3.dex */
        public static class Circle extends Shape {
            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public int getFilledIconRes() {
                return R.drawable.photo_circle_fill;
            }

            @Override // org.telegram.ui.Components.Paint.Brush
            public int getIconRes() {
                return R.drawable.photo_circle;
            }

            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintCircle);
            }

            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public int getShapeShaderType() {
                return 0;
            }
        }

        /* loaded from: classes3.dex */
        public static class Rectangle extends Shape {
            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public int getFilledIconRes() {
                return R.drawable.photo_rectangle_fill;
            }

            @Override // org.telegram.ui.Components.Paint.Brush
            public int getIconRes() {
                return R.drawable.photo_rectangle;
            }

            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintRectangle);
            }

            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public int getShapeShaderType() {
                return 1;
            }
        }

        /* loaded from: classes3.dex */
        public static class Star extends Shape {
            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public int getFilledIconRes() {
                return R.drawable.photo_star_fill;
            }

            @Override // org.telegram.ui.Components.Paint.Brush
            public int getIconRes() {
                return R.drawable.photo_star;
            }

            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintStar);
            }

            @Override // org.telegram.ui.Components.Paint.Brush.Shape
            public int getShapeShaderType() {
                return 2;
            }
        }

        public static Shape make(int i) {
            if (i >= 0 && i <= SHAPES_LIST.size()) {
                return (Shape) SHAPES_LIST.get(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Shape type must be in range from 0 to ");
            sb.append(SHAPES_LIST.size() - 1);
            sb.append(", but got ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }

        @Override // org.telegram.ui.Components.Paint.Brush
        public float getAlpha() {
            return 1.0f;
        }

        public abstract int getFilledIconRes();

        @Override // org.telegram.ui.Components.Paint.Brush
        public String getShaderName(int i) {
            if (i == 0 || i == 1) {
                return "shape";
            }
            if (i != 2) {
                return null;
            }
            return "brush";
        }

        public abstract String getShapeName();

        public abstract int getShapeShaderType();
    }

    public float getAlpha() {
        return 0.85f;
    }

    public float getAngle() {
        return 0.0f;
    }

    public int getDefaultColor() {
        return -16777216;
    }

    public float getDefaultWeight() {
        return 0.25f;
    }

    public abstract int getIconRes();

    public float getOverrideAlpha() {
        return 1.0f;
    }

    public float getPreviewScale() {
        return 0.4f;
    }

    public float getScale() {
        return 1.0f;
    }

    public String getShaderName(int i) {
        if (i == 0) {
            return "blitWithMask";
        }
        if (i == 1) {
            return "compositeWithMask";
        }
        if (i != 2) {
            return null;
        }
        return "brush";
    }

    public float getSmoothThicknessRate() {
        return 1.0f;
    }

    public float getSpacing() {
        return 0.15f;
    }

    public Bitmap getStamp() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), getStampResId(), options);
    }

    public int getStampResId() {
        return R.drawable.paint_radial_brush;
    }

    public boolean isEraser() {
        return false;
    }
}
