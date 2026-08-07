package org.scilab.forge.jlatexmath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MatrixAtom extends Atom {
    public static final int ALIGN = 2;
    public static final int ALIGNAT = 3;
    public static final int ALIGNED = 6;
    public static final int ALIGNEDAT = 7;
    public static final int ARRAY = 0;
    public static final int FLALIGN = 4;
    public static final int MATRIX = 1;
    public static final int SMALLMATRIX = 5;
    private boolean isPartial;
    private ArrayOfAtoms matrix;
    private int[] position;
    private boolean spaceAround;
    private int type;
    private Map<Integer, VlineAtom> vlines;
    public static SpaceAtom hsep = new SpaceAtom(0, 1.0f, 0.0f, 0.0f);
    public static SpaceAtom semihsep = new SpaceAtom(0, 0.5f, 0.0f, 0.0f);
    public static SpaceAtom vsep_in = new SpaceAtom(1, 0.0f, 1.0f, 0.0f);
    public static SpaceAtom vsep_ext_top = new SpaceAtom(1, 0.0f, 0.4f, 0.0f);
    public static SpaceAtom vsep_ext_bot = new SpaceAtom(1, 0.0f, 0.4f, 0.0f);
    private static final Box nullBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    private static SpaceAtom align = new SpaceAtom(2);

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, String str, boolean z2) {
        this.vlines = new HashMap();
        this.isPartial = z;
        this.matrix = arrayOfAtoms;
        this.type = 0;
        this.spaceAround = z2;
        parsePositions(new StringBuffer(str));
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, String str) {
        this(z, arrayOfAtoms, str, false);
    }

    public MatrixAtom(ArrayOfAtoms arrayOfAtoms, String str) {
        this(false, arrayOfAtoms, str);
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i) {
        this(z, arrayOfAtoms, i, false);
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i, boolean z2) {
        this.vlines = new HashMap();
        this.isPartial = z;
        this.matrix = arrayOfAtoms;
        this.type = i;
        this.spaceAround = z2;
        if (i != 1 && i != 5) {
            this.position = new int[arrayOfAtoms.col];
            int i2 = 0;
            while (true) {
                int i3 = this.matrix.col;
                if (i2 >= i3) {
                    return;
                }
                int[] iArr = this.position;
                iArr[i2] = 1;
                int i4 = i2 + 1;
                if (i4 < i3) {
                    iArr[i4] = 0;
                }
                i2 += 2;
            }
        } else {
            this.position = new int[arrayOfAtoms.col];
            for (int i5 = 0; i5 < this.matrix.col; i5++) {
                this.position[i5] = 2;
            }
        }
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i, int i2) {
        this(z, arrayOfAtoms, i, i2, true);
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i, int i2, boolean z2) {
        this.vlines = new HashMap();
        this.isPartial = z;
        this.matrix = arrayOfAtoms;
        this.type = i;
        this.spaceAround = z2;
        this.position = new int[arrayOfAtoms.col];
        for (int i3 = 0; i3 < this.matrix.col; i3++) {
            this.position[i3] = i2;
        }
    }

    public MatrixAtom(ArrayOfAtoms arrayOfAtoms, int i) {
        this(false, arrayOfAtoms, i);
    }

    private void parsePositions(StringBuffer stringBuffer) {
        int pos;
        int length = stringBuffer.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i2++;
            if (i2 > 100000 || length > 10000) {
                throw new ParseException("Column specification is too complex");
            }
            char charAt = stringBuffer.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                if (charAt == '*') {
                    int i3 = i + 1;
                    TeXParser teXParser = new TeXParser(this.isPartial, stringBuffer.substring(i3), new TeXFormula(), false);
                    String[] optsArgs = teXParser.getOptsArgs(2, 0);
                    pos = i3 + teXParser.getPos();
                    int parseInt = Integer.parseInt(optsArgs[1]);
                    if (parseInt < 0 || parseInt > 4096) {
                        parseInt = 4096;
                    }
                    StringBuilder sb = new StringBuilder(optsArgs[2].length() * parseInt);
                    for (int i4 = 0; i4 < parseInt; i4++) {
                        sb.append(optsArgs[2]);
                    }
                    stringBuffer.insert(pos, sb.toString());
                    length = stringBuffer.length();
                } else if (charAt == '@') {
                    int i5 = i + 1;
                    TeXParser teXParser2 = new TeXParser(this.isPartial, stringBuffer.substring(i5), new TeXFormula(), false);
                    Atom argument = teXParser2.getArgument();
                    this.matrix.col++;
                    int i6 = 0;
                    while (true) {
                        ArrayOfAtoms arrayOfAtoms = this.matrix;
                        if (i6 >= arrayOfAtoms.row) {
                            break;
                        }
                        arrayOfAtoms.array.get(i6).add(arrayList.size(), argument);
                        i6++;
                    }
                    arrayList.add(5);
                    pos = i5 + teXParser2.getPos();
                } else if (charAt == 'c') {
                    arrayList.add(2);
                } else if (charAt == 'l') {
                    arrayList.add(0);
                } else if (charAt == 'r') {
                    arrayList.add(1);
                } else if (charAt == '|') {
                    int i7 = 1;
                    while (true) {
                        int i8 = i + 1;
                        if (i8 >= length) {
                            i = i8;
                            break;
                        } else {
                            if (stringBuffer.charAt(i8) != '|') {
                                break;
                            }
                            i7++;
                            i = i8;
                        }
                    }
                    this.vlines.put(Integer.valueOf(arrayList.size()), new VlineAtom(i7));
                } else {
                    arrayList.add(2);
                }
                i = pos - 1;
            }
            i++;
        }
        for (int size = arrayList.size(); size < this.matrix.col; size++) {
            arrayList.add(2);
        }
        if (arrayList.size() != 0) {
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            this.position = new int[numArr.length];
            for (int i9 = 0; i9 < numArr.length; i9++) {
                this.position[i9] = numArr[i9].intValue();
            }
            return;
        }
        this.position = new int[]{2};
    }

    public Box[] getColumnSep(TeXEnvironment teXEnvironment, float f) {
        Box createBox;
        Box createBox2;
        int i = this.matrix.col;
        Box[] boxArr = new Box[i + 1];
        float textwidth = teXEnvironment.getTextwidth();
        int i2 = this.type;
        if (i2 == 6 || i2 == 7) {
            textwidth = Float.POSITIVE_INFINITY;
        }
        int i3 = 2;
        int i4 = 1;
        switch (i2) {
            case 0:
                if (this.position[0] == 5) {
                    boxArr[1] = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    i3 = 1;
                }
                if (this.spaceAround) {
                    boxArr[0] = semihsep.createBox(teXEnvironment);
                } else {
                    boxArr[0] = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                }
                boxArr[i] = boxArr[0];
                Box createBox3 = hsep.createBox(teXEnvironment);
                while (i3 < i) {
                    if (this.position[i3] == 5) {
                        StrutBox strutBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                        boxArr[i3] = strutBox;
                        i3++;
                        boxArr[i3] = strutBox;
                    } else {
                        boxArr[i3] = createBox3;
                    }
                    i3++;
                }
                return boxArr;
            case 1:
            case 5:
                Box box = nullBox;
                boxArr[0] = box;
                boxArr[i] = box;
                Box createBox4 = hsep.createBox(teXEnvironment);
                while (i4 < i) {
                    boxArr[i4] = createBox4;
                    i4++;
                }
                return boxArr;
            case 2:
            case 6:
                Box createBox5 = align.createBox(teXEnvironment);
                if (textwidth != Float.POSITIVE_INFINITY) {
                    createBox = new StrutBox(Math.max(((textwidth - f) - ((i / 2) * createBox5.getWidth())) / ((float) Math.floor((i + 3) / 2)), 0.0f), 0.0f, 0.0f, 0.0f);
                } else {
                    createBox = hsep.createBox(teXEnvironment);
                }
                boxArr[i] = createBox;
                for (int i5 = 0; i5 < i; i5++) {
                    if (i5 % 2 == 0) {
                        boxArr[i5] = createBox;
                    } else {
                        boxArr[i5] = createBox5;
                    }
                }
                break;
            case 3:
            case 7:
                float max = textwidth != Float.POSITIVE_INFINITY ? Math.max((textwidth - f) / 2.0f, 0.0f) : 0.0f;
                Box createBox6 = align.createBox(teXEnvironment);
                Box box2 = nullBox;
                StrutBox strutBox2 = new StrutBox(max, 0.0f, 0.0f, 0.0f);
                boxArr[0] = strutBox2;
                boxArr[i] = strutBox2;
                while (i4 < i) {
                    if (i4 % 2 == 0) {
                        boxArr[i4] = box2;
                    } else {
                        boxArr[i4] = createBox6;
                    }
                    i4++;
                }
                break;
            case 4:
                Box createBox7 = align.createBox(teXEnvironment);
                if (textwidth != Float.POSITIVE_INFINITY) {
                    createBox2 = new StrutBox(Math.max(((textwidth - f) - ((i / 2) * createBox7.getWidth())) / ((float) Math.floor((i - 1) / 2)), 0.0f), 0.0f, 0.0f, 0.0f);
                } else {
                    createBox2 = hsep.createBox(teXEnvironment);
                }
                Box box3 = nullBox;
                boxArr[0] = box3;
                boxArr[i] = box3;
                while (i4 < i) {
                    if (i4 % 2 == 0) {
                        boxArr[i4] = createBox2;
                    } else {
                        boxArr[i4] = createBox7;
                    }
                    i4++;
                }
                break;
        }
        if (textwidth == Float.POSITIVE_INFINITY) {
            Box box4 = nullBox;
            boxArr[0] = box4;
            boxArr[i] = box4;
        }
        return boxArr;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironment2;
        VerticalBox verticalBox;
        float f;
        Box box;
        HorizontalBox horizontalBox;
        int i;
        Integer num;
        TeXEnvironment teXEnvironment3;
        float[] fArr;
        boolean hasRightVline;
        int i2;
        int i3;
        Atom atom;
        ArrayOfAtoms arrayOfAtoms = this.matrix;
        int i4 = arrayOfAtoms.row;
        int i5 = arrayOfAtoms.col;
        Integer num2 = 0;
        Box[][] boxArr = (Box[][]) Array.newInstance((Class<?>) Box.class, i4, i5);
        float[] fArr2 = new float[i4];
        float[] fArr3 = new float[i4];
        float[] fArr4 = new float[i5];
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        if (this.type == 5) {
            TeXEnvironment copy = teXEnvironment.copy();
            copy.setStyle(4);
            teXEnvironment2 = copy;
        } else {
            teXEnvironment2 = teXEnvironment;
        }
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < i4; i6++) {
            fArr2[i6] = 0.0f;
            fArr3[i6] = 0.0f;
            int i7 = 0;
            while (i7 < i5) {
                try {
                    atom = this.matrix.array.get(i6).get(i7);
                } catch (Exception unused) {
                    boxArr[i6][i7 - 1].type = 11;
                    i7 = i5 - 1;
                    atom = null;
                }
                boxArr[i6][i7] = atom == null ? nullBox : atom.createBox(teXEnvironment2);
                fArr2[i6] = Math.max(boxArr[i6][i7].getDepth(), fArr2[i6]);
                fArr3[i6] = Math.max(boxArr[i6][i7].getHeight(), fArr3[i6]);
                Box box2 = boxArr[i6][i7];
                if (box2.type != 12) {
                    fArr4[i7] = Math.max(box2.getWidth(), fArr4[i7]);
                } else {
                    MulticolumnAtom multicolumnAtom = (MulticolumnAtom) atom;
                    multicolumnAtom.setRowColumn(i6, i7);
                    arrayList.add(multicolumnAtom);
                }
                i7++;
            }
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            MulticolumnAtom multicolumnAtom2 = (MulticolumnAtom) arrayList.get(i8);
            int col = multicolumnAtom2.getCol();
            int row = multicolumnAtom2.getRow();
            int skipped = multicolumnAtom2.getSkipped();
            int i9 = col;
            float f2 = 0.0f;
            while (true) {
                i3 = col + skipped;
                if (i9 >= i3) {
                    break;
                }
                f2 += fArr4[i9];
                i9++;
            }
            if (boxArr[row][col].getWidth() > f2) {
                float width = (boxArr[row][col].getWidth() - f2) / skipped;
                while (col < i3) {
                    fArr4[col] = fArr4[col] + width;
                    col++;
                }
            }
        }
        float f3 = 0.0f;
        for (int i10 = 0; i10 < i5; i10++) {
            f3 += fArr4[i10];
        }
        Box[] columnSep = getColumnSep(teXEnvironment2, f3);
        float f4 = f3;
        for (int i11 = 0; i11 < i5 + 1; i11++) {
            f4 += columnSep[i11].getWidth();
            if (this.vlines.get(Integer.valueOf(i11)) != null) {
                f4 += this.vlines.get(Integer.valueOf(i11)).getWidth(teXEnvironment2);
            }
        }
        VerticalBox verticalBox2 = new VerticalBox();
        Box createBox = vsep_in.createBox(teXEnvironment2);
        verticalBox2.add(vsep_ext_top.createBox(teXEnvironment2));
        int i12 = 0;
        while (i12 < i4) {
            HorizontalBox horizontalBox2 = new HorizontalBox();
            int i13 = 0;
            while (i13 < i5) {
                int i14 = i4;
                int i15 = boxArr[i12][i13].type;
                VerticalBox verticalBox3 = verticalBox2;
                if (i15 != -1) {
                    switch (i15) {
                        case 11:
                            f = f4;
                            float textwidth = teXEnvironment2.getTextwidth();
                            if (textwidth == Float.POSITIVE_INFINITY) {
                                textwidth = fArr4[i13];
                            }
                            HorizontalBox horizontalBox3 = new HorizontalBox(boxArr[i12][i13], textwidth, 0);
                            i13 = i5 - 1;
                            i = i12;
                            box = createBox;
                            fArr = fArr4;
                            horizontalBox2 = horizontalBox3;
                            num = num2;
                            i2 = 1;
                            teXEnvironment3 = teXEnvironment2;
                            break;
                        case 12:
                            break;
                        case 13:
                            HlineAtom hlineAtom = (HlineAtom) this.matrix.array.get(i12).get(i13);
                            hlineAtom.setWidth(f4);
                            if (i12 >= 1) {
                                f = f4;
                                if (this.matrix.array.get(i12 - 1).get(i13) instanceof HlineAtom) {
                                    horizontalBox2.add(new StrutBox(0.0f, defaultRuleThickness * 2.0f, 0.0f, 0.0f));
                                    hlineAtom.setShift(((-createBox.getHeight()) / 2.0f) + defaultRuleThickness);
                                    horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                                    i = i12;
                                    box = createBox;
                                    fArr = fArr4;
                                    i13 = i5;
                                    num = num2;
                                    i2 = 1;
                                    teXEnvironment3 = teXEnvironment2;
                                    break;
                                }
                            } else {
                                f = f4;
                            }
                            hlineAtom.setShift((-createBox.getHeight()) / 2.0f);
                            horizontalBox2.add(hlineAtom.createBox(teXEnvironment2));
                            i = i12;
                            box = createBox;
                            fArr = fArr4;
                            i13 = i5;
                            num = num2;
                            i2 = 1;
                            teXEnvironment3 = teXEnvironment2;
                        default:
                            i = i12;
                            box = createBox;
                            fArr = fArr4;
                            f = f4;
                            num = num2;
                            i2 = 1;
                            teXEnvironment3 = teXEnvironment2;
                            break;
                    }
                    i13 += i2;
                    i12 = i;
                    teXEnvironment2 = teXEnvironment3;
                    verticalBox2 = verticalBox3;
                    i4 = i14;
                    f4 = f;
                    num2 = num;
                    createBox = box;
                    fArr4 = fArr;
                }
                f = f4;
                if (i13 != 0) {
                    box = createBox;
                } else if (this.vlines.get(num2) != null) {
                    VlineAtom vlineAtom = this.vlines.get(num2);
                    vlineAtom.setHeight(fArr3[i12] + fArr2[i12] + createBox.getHeight());
                    vlineAtom.setShift(fArr2[i12] + (createBox.getHeight() / 2.0f));
                    Box createBox2 = vlineAtom.createBox(teXEnvironment2);
                    box = createBox;
                    horizontalBox2.add(new HorizontalBox(createBox2, columnSep[0].getWidth() + createBox2.getWidth(), 0));
                } else {
                    box = createBox;
                    horizontalBox2.add(columnSep[0]);
                }
                if (boxArr[i12][i13].type == -1) {
                    horizontalBox2.add(new HorizontalBox(boxArr[i12][i13], fArr4[i13], this.position[i13]));
                    horizontalBox = horizontalBox2;
                    i = i12;
                    fArr = fArr4;
                    num = num2;
                    hasRightVline = true;
                    teXEnvironment3 = teXEnvironment2;
                } else {
                    int i16 = i13;
                    horizontalBox = horizontalBox2;
                    i = i12;
                    num = num2;
                    teXEnvironment3 = teXEnvironment2;
                    fArr = fArr4;
                    Box generateMulticolumn = generateMulticolumn(teXEnvironment2, columnSep, fArr4, i, i16);
                    MulticolumnAtom multicolumnAtom3 = (MulticolumnAtom) this.matrix.array.get(i).get(i16);
                    int skipped2 = (multicolumnAtom3.getSkipped() - 1) + i16;
                    horizontalBox.add(generateMulticolumn);
                    hasRightVline = multicolumnAtom3.hasRightVline();
                    i13 = skipped2;
                }
                if (hasRightVline) {
                    int i17 = i13 + 1;
                    if (this.vlines.get(Integer.valueOf(i17)) != null) {
                        VlineAtom vlineAtom2 = this.vlines.get(Integer.valueOf(i17));
                        vlineAtom2.setHeight(fArr3[i] + fArr2[i] + box.getHeight());
                        vlineAtom2.setShift(fArr2[i] + (box.getHeight() / 2.0f));
                        Box createBox3 = vlineAtom2.createBox(teXEnvironment3);
                        if (i13 < i5 - 1) {
                            horizontalBox.add(new HorizontalBox(createBox3, columnSep[i17].getWidth() + createBox3.getWidth(), 2));
                        } else {
                            horizontalBox.add(new HorizontalBox(createBox3, columnSep[i17].getWidth() + createBox3.getWidth(), 1));
                        }
                        horizontalBox2 = horizontalBox;
                        i2 = 1;
                        i13 += i2;
                        i12 = i;
                        teXEnvironment2 = teXEnvironment3;
                        verticalBox2 = verticalBox3;
                        i4 = i14;
                        f4 = f;
                        num2 = num;
                        createBox = box;
                        fArr4 = fArr;
                    }
                }
                horizontalBox.add(columnSep[i13 + 1]);
                horizontalBox2 = horizontalBox;
                i2 = 1;
                i13 += i2;
                i12 = i;
                teXEnvironment2 = teXEnvironment3;
                verticalBox2 = verticalBox3;
                i4 = i14;
                f4 = f;
                num2 = num;
                createBox = box;
                fArr4 = fArr;
            }
            Box box3 = createBox;
            float[] fArr5 = fArr4;
            int i18 = i4;
            float f5 = f4;
            VerticalBox verticalBox4 = verticalBox2;
            Integer num3 = num2;
            HorizontalBox horizontalBox4 = horizontalBox2;
            int i19 = i12;
            TeXEnvironment teXEnvironment4 = teXEnvironment2;
            if (boxArr[i19][0].type != 13) {
                horizontalBox4.setHeight(fArr3[i19]);
                horizontalBox4.setDepth(fArr2[i19]);
                verticalBox = verticalBox4;
                verticalBox.add(horizontalBox4);
                createBox = box3;
                if (i19 < i18 - 1) {
                    verticalBox.add(createBox);
                }
            } else {
                verticalBox = verticalBox4;
                createBox = box3;
                verticalBox.add(horizontalBox4);
            }
            int i20 = i19 + 1;
            verticalBox2 = verticalBox;
            i12 = i20;
            teXEnvironment2 = teXEnvironment4;
            i4 = i18;
            f4 = f5;
            num2 = num3;
            fArr4 = fArr5;
        }
        TeXEnvironment teXEnvironment5 = teXEnvironment2;
        VerticalBox verticalBox5 = verticalBox2;
        verticalBox5.add(vsep_ext_bot.createBox(teXEnvironment5));
        float height = verticalBox5.getHeight() + verticalBox5.getDepth();
        float axisHeight = teXEnvironment5.getTeXFont().getAxisHeight(teXEnvironment5.getStyle());
        float f6 = height / 2.0f;
        verticalBox5.setHeight(f6 + axisHeight);
        verticalBox5.setDepth(f6 - axisHeight);
        return verticalBox5;
    }

    private Box generateMulticolumn(TeXEnvironment teXEnvironment, Box[] boxArr, float[] fArr, int i, int i2) {
        MulticolumnAtom multicolumnAtom = (MulticolumnAtom) this.matrix.array.get(i).get(i2);
        int skipped = multicolumnAtom.getSkipped();
        int i3 = i2;
        float f = 0.0f;
        while (i3 < (i2 + skipped) - 1) {
            float f2 = fArr[i3];
            i3++;
            f += f2 + boxArr[i3].getWidth();
            if (this.vlines.get(Integer.valueOf(i3)) != null) {
                f += this.vlines.get(Integer.valueOf(i3)).getWidth(teXEnvironment);
            }
        }
        float f3 = f + fArr[i3];
        multicolumnAtom.setWidth(multicolumnAtom.createBox(teXEnvironment).getWidth() <= f3 ? f3 : 0.0f);
        return multicolumnAtom.createBox(teXEnvironment);
    }
}
