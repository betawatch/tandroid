package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
class PredefMacroInfo extends MacroInfo {
    private int id;

    public PredefMacroInfo(int i, int i2, int i3) {
        super(i2, i3);
        this.id = i;
    }

    private static final Object invokeID(int i, TeXParser teXParser, String[] strArr) {
        try {
            switch (i) {
                case 0:
                    return PredefMacros.newcommand_macro(teXParser, strArr);
                case 1:
                    return PredefMacros.renewcommand_macro(teXParser, strArr);
                case 2:
                    return PredefMacros.rule_macro(teXParser, strArr);
                case 3:
                case 4:
                    return PredefMacros.hvspace_macro(teXParser, strArr);
                case 5:
                case 6:
                case 7:
                    return PredefMacros.clrlap_macro(teXParser, strArr);
                case 8:
                case 9:
                case 10:
                    return PredefMacros.mathclrlap_macro(teXParser, strArr);
                case 11:
                    return PredefMacros.includegraphics_macro(teXParser, strArr);
                case 12:
                    return PredefMacros.cfrac_macro(teXParser, strArr);
                case 13:
                    return PredefMacros.frac_macro(teXParser, strArr);
                case 14:
                    return PredefMacros.sfrac_macro(teXParser, strArr);
                case 15:
                    return PredefMacros.genfrac_macro(teXParser, strArr);
                case 16:
                    return PredefMacros.over_macro(teXParser, strArr);
                case 17:
                    return PredefMacros.overwithdelims_macro(teXParser, strArr);
                case 18:
                    return PredefMacros.atop_macro(teXParser, strArr);
                case 19:
                    return PredefMacros.atopwithdelims_macro(teXParser, strArr);
                case 20:
                    return PredefMacros.choose_macro(teXParser, strArr);
                case 21:
                    return PredefMacros.underscore_macro(teXParser, strArr);
                case 22:
                    return PredefMacros.mbox_macro(teXParser, strArr);
                case 23:
                    return PredefMacros.text_macro(teXParser, strArr);
                case 24:
                    return PredefMacros.intertext_macro(teXParser, strArr);
                case 25:
                    return PredefMacros.binom_macro(teXParser, strArr);
                case 26:
                    return PredefMacros.mathbf_macro(teXParser, strArr);
                case 27:
                    return PredefMacros.bf_macro(teXParser, strArr);
                case 28:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 29:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case jn7.S /* 30 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 31:
                    return PredefMacros.mathit_macro(teXParser, strArr);
                case 32:
                    return PredefMacros.it_macro(teXParser, strArr);
                case 33:
                    return PredefMacros.mathrm_macro(teXParser, strArr);
                case 34:
                    return PredefMacros.rm_macro(teXParser, strArr);
                case 35:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 36:
                    return PredefMacros.mathsf_macro(teXParser, strArr);
                case 37:
                    return PredefMacros.sf_macro(teXParser, strArr);
                case 38:
                    return PredefMacros.mathtt_macro(teXParser, strArr);
                case 39:
                    return PredefMacros.tt_macro(teXParser, strArr);
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case jn7.n0 /* 51 */:
                case jn7.o0 /* 52 */:
                case jn7.p0 /* 53 */:
                case jn7.q0 /* 54 */:
                case jn7.r0 /* 55 */:
                case 56:
                case jn7.t0 /* 57 */:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case jn7.u0 /* 58 */:
                    return PredefMacros.T_macro(teXParser, strArr);
                case jn7.v0 /* 59 */:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case jn7.w0 /* 60 */:
                    return PredefMacros.accent_macro(teXParser, strArr);
                case jn7.x0 /* 61 */:
                    return PredefMacros.grkaccent_macro(teXParser, strArr);
                case jn7.y0 /* 62 */:
                case jn7.z0 /* 63 */:
                case 64:
                case 65:
                case jn7.C0 /* 66 */:
                case jn7.D0 /* 67 */:
                case jn7.E0 /* 68 */:
                case jn7.F0 /* 69 */:
                case jn7.G0 /* 70 */:
                case jn7.H0 /* 71 */:
                case jn7.I0 /* 72 */:
                case jn7.J0 /* 73 */:
                case jn7.K0 /* 74 */:
                case jn7.L0 /* 75 */:
                    return PredefMacros.accent_macros(teXParser, strArr);
                case jn7.M0 /* 76 */:
                    return PredefMacros.nbsp_macro(teXParser, strArr);
                case jn7.N0 /* 77 */:
                    return PredefMacros.smallmatrixATATenv_macro(teXParser, strArr);
                case jn7.O0 /* 78 */:
                    return PredefMacros.matrixATATenv_macro(teXParser, strArr);
                case jn7.P0 /* 79 */:
                    return PredefMacros.overrightarrow_macro(teXParser, strArr);
                case 80:
                    return PredefMacros.overleftarrow_macro(teXParser, strArr);
                case jn7.R0 /* 81 */:
                    return PredefMacros.overleftrightarrow_macro(teXParser, strArr);
                case jn7.S0 /* 82 */:
                    return PredefMacros.underrightarrow_macro(teXParser, strArr);
                case jn7.T0 /* 83 */:
                    return PredefMacros.underleftarrow_macro(teXParser, strArr);
                case jn7.U0 /* 84 */:
                    return PredefMacros.underleftrightarrow_macro(teXParser, strArr);
                case jn7.V0 /* 85 */:
                    return PredefMacros.xleftarrow_macro(teXParser, strArr);
                case jn7.W0 /* 86 */:
                    return PredefMacros.xrightarrow_macro(teXParser, strArr);
                case jn7.X0 /* 87 */:
                    return PredefMacros.underbrace_macro(teXParser, strArr);
                case jn7.Y0 /* 88 */:
                    return PredefMacros.overbrace_macro(teXParser, strArr);
                case jn7.Z0 /* 89 */:
                    return PredefMacros.underbrack_macro(teXParser, strArr);
                case jn7.a1 /* 90 */:
                    return PredefMacros.overbrack_macro(teXParser, strArr);
                case jn7.b1 /* 91 */:
                    return PredefMacros.underparen_macro(teXParser, strArr);
                case jn7.c1 /* 92 */:
                    return PredefMacros.overparen_macro(teXParser, strArr);
                case jn7.d1 /* 93 */:
                case jn7.e1 /* 94 */:
                    return PredefMacros.sqrt_macro(teXParser, strArr);
                case jn7.f1 /* 95 */:
                    return PredefMacros.overline_macro(teXParser, strArr);
                case 96:
                    return PredefMacros.underline_macro(teXParser, strArr);
                case jn7.h1 /* 97 */:
                    return PredefMacros.mathop_macro(teXParser, strArr);
                case jn7.i1 /* 98 */:
                    return PredefMacros.mathpunct_macro(teXParser, strArr);
                case jn7.j1 /* 99 */:
                    return PredefMacros.mathord_macro(teXParser, strArr);
                case jn7.k1 /* 100 */:
                    return PredefMacros.mathrel_macro(teXParser, strArr);
                case 101:
                    return PredefMacros.mathinner_macro(teXParser, strArr);
                case jn7.m1 /* 102 */:
                    return PredefMacros.mathbin_macro(teXParser, strArr);
                case jn7.n1 /* 103 */:
                    return PredefMacros.mathopen_macro(teXParser, strArr);
                case jn7.o1 /* 104 */:
                    return PredefMacros.mathclose_macro(teXParser, strArr);
                case jn7.p1 /* 105 */:
                    return PredefMacros.joinrel_macro(teXParser, strArr);
                case jn7.q1 /* 106 */:
                    return PredefMacros.smash_macro(teXParser, strArr);
                case jn7.r1 /* 107 */:
                    return PredefMacros.vdots_macro(teXParser, strArr);
                case jn7.s1 /* 108 */:
                    return PredefMacros.ddots_macro(teXParser, strArr);
                case jn7.t1 /* 109 */:
                    return PredefMacros.iddots_macro(teXParser, strArr);
                case jn7.u1 /* 110 */:
                    return PredefMacros.nolimits_macro(teXParser, strArr);
                case jn7.v1 /* 111 */:
                    return PredefMacros.limits_macro(teXParser, strArr);
                case jn7.w1 /* 112 */:
                    return PredefMacros.normal_macro(teXParser, strArr);
                case jn7.x1 /* 113 */:
                    return PredefMacros.leftparenthesis_macro(teXParser, strArr);
                case jn7.y1 /* 114 */:
                    return PredefMacros.leftbracket_macro(teXParser, strArr);
                case jn7.z1 /* 115 */:
                    return PredefMacros.left_macro(teXParser, strArr);
                case jn7.A1 /* 116 */:
                    return PredefMacros.middle_macro(teXParser, strArr);
                case jn7.B1 /* 117 */:
                    return PredefMacros.cr_macro(teXParser, strArr);
                case jn7.C1 /* 118 */:
                    return PredefMacros.multicolumn_macro(teXParser, strArr);
                case jn7.D1 /* 119 */:
                    return PredefMacros.hdotsfor_macro(teXParser, strArr);
                case jn7.E1 /* 120 */:
                    return PredefMacros.arrayATATenv_macro(teXParser, strArr);
                case 121:
                    return PredefMacros.alignATATenv_macro(teXParser, strArr);
                case jn7.F1 /* 122 */:
                    return PredefMacros.alignedATATenv_macro(teXParser, strArr);
                case jn7.G1 /* 123 */:
                    return PredefMacros.flalignATATenv_macro(teXParser, strArr);
                case jn7.H1 /* 124 */:
                    return PredefMacros.alignatATATenv_macro(teXParser, strArr);
                case jn7.I1 /* 125 */:
                    return PredefMacros.alignedatATATenv_macro(teXParser, strArr);
                case jn7.J1 /* 126 */:
                    return PredefMacros.multlineATATenv_macro(teXParser, strArr);
                case jn7.K1 /* 127 */:
                    return PredefMacros.gatherATATenv_macro(teXParser, strArr);
                case 128:
                    return PredefMacros.gatheredATATenv_macro(teXParser, strArr);
                case jn7.M1 /* 129 */:
                    return PredefMacros.shoveright_macro(teXParser, strArr);
                case jn7.N1 /* 130 */:
                    return PredefMacros.shoveleft_macro(teXParser, strArr);
                case jn7.O1 /* 131 */:
                    return PredefMacros.backslashcr_macro(teXParser, strArr);
                case jn7.P1 /* 132 */:
                    return PredefMacros.newenvironment_macro(teXParser, strArr);
                case jn7.Q1 /* 133 */:
                    return PredefMacros.renewenvironment_macro(teXParser, strArr);
                case 134:
                    return PredefMacros.makeatletter_macro(teXParser, strArr);
                case 135:
                    return PredefMacros.makeatother_macro(teXParser, strArr);
                case jn7.R1 /* 136 */:
                case jn7.S1 /* 137 */:
                    return PredefMacros.fbox_macro(teXParser, strArr);
                case jn7.T1 /* 138 */:
                    return PredefMacros.stackrel_macro(teXParser, strArr);
                case jn7.U1 /* 139 */:
                    return PredefMacros.stackbin_macro(teXParser, strArr);
                case jn7.V1 /* 140 */:
                    return PredefMacros.accentset_macro(teXParser, strArr);
                case jn7.W1 /* 141 */:
                    return PredefMacros.underaccent_macro(teXParser, strArr);
                case jn7.X1 /* 142 */:
                    return PredefMacros.undertilde_macro(teXParser, strArr);
                case jn7.Y1 /* 143 */:
                    return PredefMacros.overset_macro(teXParser, strArr);
                case jn7.Z1 /* 144 */:
                    return PredefMacros.Braket_macro(teXParser, strArr);
                case jn7.a2 /* 145 */:
                    return PredefMacros.Set_macro(teXParser, strArr);
                case jn7.b2 /* 146 */:
                    return PredefMacros.underset_macro(teXParser, strArr);
                case jn7.c2 /* 147 */:
                    return PredefMacros.boldsymbol_macro(teXParser, strArr);
                case jn7.d2 /* 148 */:
                    return PredefMacros.LaTeX_macro(teXParser, strArr);
                case jn7.e2 /* 149 */:
                    return PredefMacros.GeoGebra_macro(teXParser, strArr);
                case jn7.f2 /* 150 */:
                    return PredefMacros.big_macro(teXParser, strArr);
                case jn7.g2 /* 151 */:
                    return PredefMacros.Big_macro(teXParser, strArr);
                case jn7.h2 /* 152 */:
                    return PredefMacros.bigg_macro(teXParser, strArr);
                case jn7.i2 /* 153 */:
                    return PredefMacros.Bigg_macro(teXParser, strArr);
                case jn7.j2 /* 154 */:
                    return PredefMacros.bigl_macro(teXParser, strArr);
                case jn7.k2 /* 155 */:
                    return PredefMacros.Bigl_macro(teXParser, strArr);
                case jn7.l2 /* 156 */:
                    return PredefMacros.biggl_macro(teXParser, strArr);
                case jn7.m2 /* 157 */:
                    return PredefMacros.Biggl_macro(teXParser, strArr);
                case jn7.n2 /* 158 */:
                    return PredefMacros.bigr_macro(teXParser, strArr);
                case jn7.o2 /* 159 */:
                    return PredefMacros.Bigr_macro(teXParser, strArr);
                case jn7.p2 /* 160 */:
                    return PredefMacros.biggr_macro(teXParser, strArr);
                case jn7.q2 /* 161 */:
                    return PredefMacros.Biggr_macro(teXParser, strArr);
                case jn7.r2 /* 162 */:
                    return PredefMacros.displaystyle_macro(teXParser, strArr);
                case jn7.s2 /* 163 */:
                    return PredefMacros.textstyle_macro(teXParser, strArr);
                case jn7.t2 /* 164 */:
                    return PredefMacros.scriptstyle_macro(teXParser, strArr);
                case jn7.u2 /* 165 */:
                    return PredefMacros.scriptscriptstyle_macro(teXParser, strArr);
                case jn7.v2 /* 166 */:
                    return PredefMacros.sideset_macro(teXParser, strArr);
                case jn7.w2 /* 167 */:
                    return PredefMacros.prescript_macro(teXParser, strArr);
                case jn7.x2 /* 168 */:
                    return PredefMacros.rotatebox_macro(teXParser, strArr);
                case jn7.y2 /* 169 */:
                    return PredefMacros.reflectbox_macro(teXParser, strArr);
                case jn7.z2 /* 170 */:
                    return PredefMacros.scalebox_macro(teXParser, strArr);
                case jn7.A2 /* 171 */:
                    return PredefMacros.resizebox_macro(teXParser, strArr);
                case jn7.B2 /* 172 */:
                    return PredefMacros.raisebox_macro(teXParser, strArr);
                case jn7.C2 /* 173 */:
                    return PredefMacros.shadowbox_macro(teXParser, strArr);
                case jn7.D2 /* 174 */:
                    return PredefMacros.ovalbox_macro(teXParser, strArr);
                case jn7.E2 /* 175 */:
                    return PredefMacros.doublebox_macro(teXParser, strArr);
                case jn7.F2 /* 176 */:
                    return PredefMacros.phantom_macro(teXParser, strArr);
                case jn7.G2 /* 177 */:
                    return PredefMacros.hphantom_macro(teXParser, strArr);
                case jn7.H2 /* 178 */:
                    return PredefMacros.vphantom_macro(teXParser, strArr);
                case jn7.I2 /* 179 */:
                    return PredefMacros.spATbreve_macro(teXParser, strArr);
                case jn7.J2 /* 180 */:
                    return PredefMacros.spAThat_macro(teXParser, strArr);
                case jn7.K2 /* 181 */:
                    return PredefMacros.definecolor_macro(teXParser, strArr);
                case jn7.L2 /* 182 */:
                    return PredefMacros.textcolor_macro(teXParser, strArr);
                case jn7.M2 /* 183 */:
                    return PredefMacros.fgcolor_macro(teXParser, strArr);
                case jn7.N2 /* 184 */:
                    return PredefMacros.bgcolor_macro(teXParser, strArr);
                case jn7.O2 /* 185 */:
                    return PredefMacros.colorbox_macro(teXParser, strArr);
                case jn7.P2 /* 186 */:
                    return PredefMacros.fcolorbox_macro(teXParser, strArr);
                case jn7.Q2 /* 187 */:
                    return PredefMacros.cedilla_macro(teXParser, strArr);
                case jn7.R2 /* 188 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case jn7.S2 /* 189 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case jn7.T2 /* 190 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case jn7.U2 /* 191 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case jn7.V2 /* 192 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case jn7.W2 /* 193 */:
                    return PredefMacros.tcaron_macro(teXParser, strArr);
                case jn7.X2 /* 194 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case jn7.Y2 /* 195 */:
                    return PredefMacros.ogonek_macro(teXParser, strArr);
                case jn7.Z2 /* 196 */:
                    return PredefMacros.cong_macro(teXParser, strArr);
                case jn7.a3 /* 197 */:
                    return PredefMacros.doteq_macro(teXParser, strArr);
                case jn7.b3 /* 198 */:
                    return PredefMacros.jlmDynamic_macro(teXParser, strArr);
                case jn7.c3 /* 199 */:
                    return PredefMacros.jlmExternalFont_macro(teXParser, strArr);
                case jn7.d3 /* 200 */:
                    return PredefMacros.jlmText_macro(teXParser, strArr);
                case jn7.e3 /* 201 */:
                    return PredefMacros.jlmTextit_macro(teXParser, strArr);
                case jn7.f3 /* 202 */:
                    return PredefMacros.jlmTextbf_macro(teXParser, strArr);
                case 203:
                    return PredefMacros.jlmTextitbf_macro(teXParser, strArr);
                case jn7.h3 /* 204 */:
                    return PredefMacros.DeclareMathSizes_macro(teXParser, strArr);
                case jn7.i3 /* 205 */:
                    return PredefMacros.magnification_macro(teXParser, strArr);
                case jn7.j3 /* 206 */:
                    return PredefMacros.hline_macro(teXParser, strArr);
                case jn7.k3 /* 207 */:
                case jn7.l3 /* 208 */:
                case jn7.m3 /* 209 */:
                case jn7.n3 /* 210 */:
                case 211:
                case jn7.o3 /* 212 */:
                case jn7.p3 /* 213 */:
                case jn7.q3 /* 214 */:
                case jn7.r3 /* 215 */:
                case jn7.s3 /* 216 */:
                    return PredefMacros.size_macros(teXParser, strArr);
                case jn7.t3 /* 217 */:
                    return PredefMacros.jlatexmathcumsup_macro(teXParser, strArr);
                case jn7.u3 /* 218 */:
                    return PredefMacros.jlatexmathcumsub_macro(teXParser, strArr);
                case jn7.v3 /* 219 */:
                    return PredefMacros.hstrok_macro(teXParser, strArr);
                case jn7.w3 /* 220 */:
                    return PredefMacros.Hstrok_macro(teXParser, strArr);
                case jn7.x3 /* 221 */:
                    return PredefMacros.dstrok_macro(teXParser, strArr);
                case jn7.y3 /* 222 */:
                    return PredefMacros.Dstrok_macro(teXParser, strArr);
                case jn7.z3 /* 223 */:
                    return PredefMacros.dotminus_macro(teXParser, strArr);
                case jn7.A3 /* 224 */:
                    return PredefMacros.ratio_macro(teXParser, strArr);
                case jn7.B3 /* 225 */:
                    return PredefMacros.smallfrowneq_macro(teXParser, strArr);
                case jn7.C3 /* 226 */:
                    return PredefMacros.geoprop_macro(teXParser, strArr);
                case jn7.D3 /* 227 */:
                    return PredefMacros.minuscolon_macro(teXParser, strArr);
                case jn7.E3 /* 228 */:
                    return PredefMacros.minuscoloncolon_macro(teXParser, strArr);
                case jn7.F3 /* 229 */:
                    return PredefMacros.simcolon_macro(teXParser, strArr);
                case 230:
                    return PredefMacros.simcoloncolon_macro(teXParser, strArr);
                case jn7.G3 /* 231 */:
                    return PredefMacros.approxcolon_macro(teXParser, strArr);
                case jn7.H3 /* 232 */:
                    return PredefMacros.approxcoloncolon_macro(teXParser, strArr);
                case jn7.I3 /* 233 */:
                    return PredefMacros.coloncolon_macro(teXParser, strArr);
                case jn7.J3 /* 234 */:
                    return PredefMacros.equalscolon_macro(teXParser, strArr);
                case 235:
                    return PredefMacros.equalscoloncolon_macro(teXParser, strArr);
                case jn7.L3 /* 236 */:
                    return PredefMacros.colonminus_macro(teXParser, strArr);
                case 237:
                    return PredefMacros.coloncolonminus_macro(teXParser, strArr);
                case jn7.M3 /* 238 */:
                    return PredefMacros.colonequals_macro(teXParser, strArr);
                case jn7.N3 /* 239 */:
                    return PredefMacros.coloncolonequals_macro(teXParser, strArr);
                case jn7.O3 /* 240 */:
                    return PredefMacros.colonsim_macro(teXParser, strArr);
                case jn7.P3 /* 241 */:
                    return PredefMacros.coloncolonsim_macro(teXParser, strArr);
                case jn7.Q3 /* 242 */:
                    return PredefMacros.colonapprox_macro(teXParser, strArr);
                case jn7.R3 /* 243 */:
                    return PredefMacros.coloncolonapprox_macro(teXParser, strArr);
                case jn7.S3 /* 244 */:
                    return PredefMacros.kern_macro(teXParser, strArr);
                case jn7.T3 /* 245 */:
                    return PredefMacros.char_macro(teXParser, strArr);
                case jn7.U3 /* 246 */:
                case jn7.V3 /* 247 */:
                    return PredefMacros.romannumeral_macro(teXParser, strArr);
                case jn7.W3 /* 248 */:
                    return PredefMacros.textcircled_macro(teXParser, strArr);
                case jn7.X3 /* 249 */:
                    return PredefMacros.textsc_macro(teXParser, strArr);
                case jn7.Y3 /* 250 */:
                    return PredefMacros.sc_macro(teXParser, strArr);
                case jn7.Z3 /* 251 */:
                case jn7.a4 /* 252 */:
                case jn7.b4 /* 253 */:
                case jn7.c4 /* 254 */:
                case jn7.d4 /* 255 */:
                case 256:
                case jn7.f4 /* 257 */:
                case jn7.g4 /* 258 */:
                case jn7.h4 /* 259 */:
                case jn7.i4 /* 260 */:
                    return PredefMacros.muskip_macros(teXParser, strArr);
                case jn7.j4 /* 261 */:
                    return PredefMacros.quad_macro(teXParser, strArr);
                case jn7.k4 /* 262 */:
                    return PredefMacros.surd_macro(teXParser, strArr);
                case jn7.l4 /* 263 */:
                    return PredefMacros.iint_macro(teXParser, strArr);
                case jn7.m4 /* 264 */:
                    return PredefMacros.iiint_macro(teXParser, strArr);
                case jn7.n4 /* 265 */:
                    return PredefMacros.iiiint_macro(teXParser, strArr);
                case jn7.o4 /* 266 */:
                    return PredefMacros.idotsint_macro(teXParser, strArr);
                case jn7.p4 /* 267 */:
                    return PredefMacros.int_macro(teXParser, strArr);
                case jn7.q4 /* 268 */:
                    return PredefMacros.oint_macro(teXParser, strArr);
                case jn7.r4 /* 269 */:
                    return PredefMacros.lmoustache_macro(teXParser, strArr);
                case jn7.s4 /* 270 */:
                    return PredefMacros.rmoustache_macro(teXParser, strArr);
                case jn7.t4 /* 271 */:
                    return PredefMacros.insertBreakMark_macro(teXParser, strArr);
                case jn7.u4 /* 272 */:
                    return PredefMacros.jlmXML_macro(teXParser, strArr);
                case jn7.v4 /* 273 */:
                    return PredefMacros.above_macro(teXParser, strArr);
                case jn7.w4 /* 274 */:
                    return PredefMacros.abovewithdelims_macro(teXParser, strArr);
                case jn7.x4 /* 275 */:
                    return PredefMacros.st_macro(teXParser, strArr);
                case jn7.y4 /* 276 */:
                    return PredefMacros.fcscore_macro(teXParser, strArr);
                case jn7.z4 /* 277 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case jn7.A4 /* 278 */:
                    return PredefMacros.qquad_macro(teXParser, strArr);
                case jn7.B4 /* 279 */:
                    return PredefMacros.longdiv_macro(teXParser, strArr);
                case jn7.C4 /* 280 */:
                    return PredefMacros.questeq_macro(teXParser, strArr);
                case jn7.D4 /* 281 */:
                    return PredefMacros.bangle_macro(teXParser, strArr);
                case jn7.E4 /* 282 */:
                    return PredefMacros.brace_macro(teXParser, strArr);
                case jn7.F4 /* 283 */:
                    return PredefMacros.brack_macro(teXParser, strArr);
                default:
                    return null;
            }
        } catch (Exception e) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e.getMessage());
        }
    }

    @Override // org.scilab.forge.jlatexmath.MacroInfo
    public Object invoke(TeXParser teXParser, String[] strArr) {
        return invokeID(this.id, teXParser, strArr);
    }

    public PredefMacroInfo(int i, int i2) {
        super(i2);
        this.id = i;
    }
}
